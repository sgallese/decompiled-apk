package com.habitrpg.android.habitica.models.tasks;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.ZonedDateExtensionsKt;
import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import com.habitrpg.shared.habitica.models.tasks.Attribute;
import com.habitrpg.shared.habitica.models.tasks.BaseTask;
import com.habitrpg.shared.habitica.models.tasks.Frequency;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.w;
import ec.b0;
import ec.t;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.p5;
import io.realm.x0;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.DateRetargetClass;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import pc.l;
import qc.h;
import qc.k0;
import qc.q;
import yc.v;

/* compiled from: Task.kt */
/* loaded from: classes4.dex */
public class Task extends d1 implements BaseMainObject, Parcelable, BaseTask, p5 {
    public static final String FILTER_ACTIVE = "active";
    public static final String FILTER_ALL = "all";
    public static final String FILTER_COMPLETED = "completed";
    public static final String FILTER_DATED = "dated";
    public static final String FILTER_GRAY = "gray";
    public static final String FILTER_STRONG = "strong";
    public static final String FILTER_WEAK = "weak";
    private String attributeValue;
    private String challengeBroken;
    private String challengeID;
    private x0<ChecklistItem> checklist;
    private String combinedID;
    private boolean completed;
    private Integer counterDown;
    private Integer counterUp;
    private Date dateCreated;
    private List<Integer> daysOfMonth;
    private String daysOfMonthString;
    private Boolean down;
    @c("date")
    private Date dueDate;
    private Integer everyX;
    private String frequencyValue;
    private TaskGroupPlan group;
    private boolean hasErrored;
    @c("_id")

    /* renamed from: id  reason: collision with root package name */
    private String f12530id;
    private boolean isCreating;
    private Boolean isDue;
    private boolean isSaving;
    private x0<Date> nextDue;
    private String notes;
    private String ownerID;
    private Spanned parsedNotes;
    private Spanned parsedText;
    private int position;
    private float priority;
    private x0<RemindersItem> reminders;
    private Days repeat;
    private Date startDate;
    private Integer streak;
    private x0<Tag> tags;
    private String text;
    private String typeValue;
    private Boolean up;
    private Date updatedAt;
    private double value;
    private List<Integer> weeksOfMonth;
    private String weeksOfMonthString;
    private boolean yesterDaily;

    /* renamed from: CREATOR  reason: collision with other field name */
    public static final CREATOR f8CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Task> CREATOR = new Parcelable.Creator<Task>() { // from class: com.habitrpg.android.habitica.models.tasks.Task$CREATOR$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Task createFromParcel(Parcel parcel) {
            q.i(parcel, "source");
            return new Task(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Task[] newArray(int i10) {
            return new Task[i10];
        }
    };

    /* compiled from: Task.kt */
    /* loaded from: classes4.dex */
    public static final class CREATOR implements Parcelable.Creator<Task> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(h hVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Task createFromParcel(Parcel parcel) {
            q.i(parcel, "source");
            return new Task(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Task[] newArray(int i10) {
            return new Task[i10];
        }
    }

    public Task() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$ownerID("");
        realmSet$text("");
        realmSet$attributeValue(Attribute.STRENGTH.getValue());
        realmSet$tags(new x0());
        Boolean bool = Boolean.FALSE;
        realmSet$up(bool);
        realmSet$down(bool);
        realmSet$counterUp(0);
        realmSet$counterDown(0);
        realmSet$checklist(new x0());
        realmSet$reminders(new x0());
        realmSet$everyX(0);
        realmSet$streak(0);
        realmSet$yesterDaily(true);
    }

    public final boolean checkIfDue() {
        return q.d(isDue(), Boolean.TRUE);
    }

    public final void completeForUser(String str, boolean z10) {
        boolean z11;
        x0<GroupAssignedDetails> assignedUsersDetail;
        boolean z12;
        x0<GroupAssignedDetails> assignedUsersDetail2;
        x0<GroupAssignedDetails> assignedUsersDetail3;
        if (isGroupTask()) {
            TaskGroupPlan realmGet$group = realmGet$group();
            boolean z13 = false;
            if (realmGet$group != null && (assignedUsersDetail3 = realmGet$group.getAssignedUsersDetail()) != null && (!assignedUsersDetail3.isEmpty()) == true) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                TaskGroupPlan realmGet$group2 = realmGet$group();
                GroupAssignedDetails groupAssignedDetails = null;
                if (realmGet$group2 != null && (assignedUsersDetail2 = realmGet$group2.getAssignedUsersDetail()) != null) {
                    Iterator<GroupAssignedDetails> it = assignedUsersDetail2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        GroupAssignedDetails next = it.next();
                        if (q.d(next.getAssignedUserID(), str)) {
                            groupAssignedDetails = next;
                            break;
                        }
                    }
                    groupAssignedDetails = groupAssignedDetails;
                }
                if (groupAssignedDetails != null) {
                    groupAssignedDetails.setCompleted(z10);
                }
                TaskGroupPlan realmGet$group3 = realmGet$group();
                if (realmGet$group3 != null && (assignedUsersDetail = realmGet$group3.getAssignedUsersDetail()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (GroupAssignedDetails groupAssignedDetails2 : assignedUsersDetail) {
                        if (groupAssignedDetails2.getCompleted() != z10) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            arrayList.add(groupAssignedDetails2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        z13 = true;
                    }
                }
                if (z13) {
                    setCompleted(z10);
                    return;
                }
                return;
            }
        }
        setCompleted(z10);
    }

    public final boolean completed(String str) {
        x0<GroupAssignedDetails> assignedUsersDetail;
        GroupAssignedDetails groupAssignedDetails;
        if (isGroupTask()) {
            TaskGroupPlan realmGet$group = realmGet$group();
            if (realmGet$group != null && (assignedUsersDetail = realmGet$group.getAssignedUsersDetail()) != null) {
                Iterator<GroupAssignedDetails> it = assignedUsersDetail.iterator();
                while (true) {
                    if (it.hasNext()) {
                        groupAssignedDetails = it.next();
                        if (q.d(groupAssignedDetails.getAssignedUserID(), str)) {
                            break;
                        }
                    } else {
                        groupAssignedDetails = null;
                        break;
                    }
                }
                GroupAssignedDetails groupAssignedDetails2 = groupAssignedDetails;
                if (groupAssignedDetails2 != null) {
                    return groupAssignedDetails2.getCompleted();
                }
            }
            return getCompleted();
        }
        return getCompleted();
    }

    public final boolean containsAllTagIds(List<String> list) {
        q.i(list, "tagIdList");
        x0 realmGet$tags = realmGet$tags();
        if (realmGet$tags != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = realmGet$tags.iterator();
            while (it.hasNext()) {
                arrayList.add(((Tag) it.next()).getId());
            }
            return arrayList.containsAll(list);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r4.isValid() == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class<com.habitrpg.android.habitica.models.tasks.Task> r2 = com.habitrpg.android.habitica.models.tasks.Task.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L38
            boolean r1 = r4 instanceof com.habitrpg.android.habitica.models.tasks.Task
            if (r1 == 0) goto L17
            com.habitrpg.android.habitica.models.tasks.Task r4 = (com.habitrpg.android.habitica.models.tasks.Task) r4
            goto L18
        L17:
            r4 = 0
        L18:
            boolean r1 = r3.isValid()
            if (r1 == 0) goto L3c
            if (r4 == 0) goto L28
            boolean r1 = r4.isValid()
            r2 = 1
            if (r1 != r2) goto L28
            goto L29
        L28:
            r2 = 0
        L29:
            if (r2 == 0) goto L3c
            java.lang.String r0 = r3.realmGet$id()
            java.lang.String r4 = r4.realmGet$id()
            boolean r0 = qc.q.d(r0, r4)
            goto L3c
        L38:
            boolean r0 = super.equals(r4)
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.models.tasks.Task.equals(java.lang.Object):boolean");
    }

    public final Attribute getAttribute() {
        return Attribute.Companion.from(realmGet$attributeValue());
    }

    public final String getAttributeValue() {
        return realmGet$attributeValue();
    }

    public final String getChallengeBroken() {
        return realmGet$challengeBroken();
    }

    public final String getChallengeID() {
        return realmGet$challengeID();
    }

    public final x0<ChecklistItem> getChecklist() {
        return realmGet$checklist();
    }

    public final String getCombinedID() {
        return realmGet$combinedID();
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public boolean getCompleted() {
        return realmGet$completed();
    }

    public final int getCompletedChecklistCount() {
        x0 realmGet$checklist = realmGet$checklist();
        int i10 = 0;
        if (realmGet$checklist != null && !realmGet$checklist.isEmpty()) {
            Iterator<E> it = realmGet$checklist.iterator();
            while (it.hasNext()) {
                if (((ChecklistItem) it.next()).getCompleted() && (i10 = i10 + 1) < 0) {
                    t.q();
                }
            }
        }
        return i10;
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public Integer getCounterDown() {
        return realmGet$counterDown();
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public Integer getCounterUp() {
        return realmGet$counterUp();
    }

    public final int getDarkTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_10;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_10;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_10;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_5;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_10;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_10;
        }
        return R.color.blue_10;
    }

    public final int getDarkestTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_00;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_00;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_00;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_00;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_00;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_00;
        }
        return R.color.blue_00;
    }

    public final Date getDateCreated() {
        return realmGet$dateCreated();
    }

    public final List<Integer> getDaysOfMonth() {
        if (this.daysOfMonth == null) {
            ArrayList arrayList = new ArrayList();
            if (realmGet$daysOfMonthString() != null) {
                try {
                    JSONArray jSONArray = new JSONArray(realmGet$daysOfMonthString());
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add(Integer.valueOf(jSONArray.getInt(i10)));
                    }
                } catch (JSONException e10) {
                    ExceptionHandler.Companion.reportError(e10);
                }
            }
            this.daysOfMonth = arrayList;
        }
        return this.daysOfMonth;
    }

    public final String getDaysOfMonthString() {
        return realmGet$daysOfMonthString();
    }

    public final Boolean getDown() {
        return realmGet$down();
    }

    public final Date getDueDate() {
        return realmGet$dueDate();
    }

    public final Integer getEveryX() {
        return realmGet$everyX();
    }

    public final int getExtraDarkTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_1;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_1;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_1;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_1;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_1;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_1;
        }
        return R.color.blue_1;
    }

    public final int getExtraExtraDarkTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_0;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_0;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_0;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_0;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_0;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_0;
        }
        return R.color.blue_0;
    }

    public final int getExtraExtraLightTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_600;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_600;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_600;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_600;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_600;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_600;
        }
        return R.color.blue_600;
    }

    public final int getExtraLightTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_500;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_500;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_500;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_500;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_500;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_500;
        }
        return R.color.blue_500;
    }

    public final Frequency getFrequency() {
        return Frequency.Companion.from(realmGet$frequencyValue());
    }

    public final String getFrequencyValue() {
        return realmGet$frequencyValue();
    }

    public final TaskGroupPlan getGroup() {
        return realmGet$group();
    }

    public final boolean getHasErrored() {
        return realmGet$hasErrored();
    }

    public final String getId() {
        return realmGet$id();
    }

    public final int getLightTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_100;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_100;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_100;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_100;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_100;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_100;
        }
        return R.color.blue_100;
    }

    public final int getLightestTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_700;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_700;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_700;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_700;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_700;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_700;
        }
        return R.color.blue_700;
    }

    public final int getLowSaturationTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_sub_text;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_sub_text;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_sub_text;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_sub_text;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_sub_text;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_sub_text;
        }
        return R.color.blue_sub_text;
    }

    public final int getMediumTaskColor() {
        if (realmGet$value() < -20.0d) {
            return R.color.maroon_50;
        }
        if (realmGet$value() < -10.0d) {
            return R.color.red_50;
        }
        if (realmGet$value() < -1.0d) {
            return R.color.orange_50;
        }
        if (realmGet$value() < 1.0d) {
            return R.color.yellow_10;
        }
        if (realmGet$value() < 5.0d) {
            return R.color.green_50;
        }
        if (realmGet$value() < 10.0d) {
            return R.color.teal_50;
        }
        return R.color.blue_50;
    }

    public final x0<Date> getNextDue() {
        return realmGet$nextDue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r7.isBefore(r1) == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.ZonedDateTime getNextReminderOccurrence(com.habitrpg.android.habitica.models.tasks.RemindersItem r7, android.content.Context r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            qc.q.i(r8, r0)
            r0 = 0
            if (r7 != 0) goto L9
            return r0
        L9:
            java.lang.String r7 = r7.getTime()
            if (r7 == 0) goto L14
            j$.time.ZonedDateTime r7 = com.habitrpg.android.habitica.extensions.ZonedDateExtensionsKt.parseToZonedDateTime(r7)
            goto L15
        L14:
            r7 = r0
        L15:
            j$.time.ZonedDateTime r1 = j$.time.ZonedDateTime.now()
            io.realm.x0 r2 = r6.realmGet$nextDue()
            if (r2 == 0) goto L26
            java.lang.Object r2 = ec.r.c0(r2)
            java.util.Date r2 = (java.util.Date) r2
            goto L27
        L26:
            r2 = r0
        L27:
            if (r2 == 0) goto Le6
            boolean r2 = r6.isDisplayedActive()
            r3 = 0
            if (r2 == 0) goto L3d
            if (r7 == 0) goto L3a
            boolean r2 = r7.isBefore(r1)
            r4 = 1
            if (r2 != r4) goto L3a
            goto L3b
        L3a:
            r4 = 0
        L3b:
            if (r4 == 0) goto Le6
        L3d:
            com.habitrpg.android.habitica.models.tasks.Days r2 = r6.realmGet$repeat()
            if (r2 == 0) goto L48
            java.util.List r8 = r2.dayStrings(r8)
            goto L49
        L48:
            r8 = r0
        L49:
            if (r8 == 0) goto L70
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L51:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r8.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            qc.q.f(r1)
            java.lang.String r5 = com.habitrpg.android.habitica.extensions.ZonedDateExtensionsKt.dayOfWeekString(r1)
            boolean r4 = qc.q.d(r4, r5)
            if (r4 == 0) goto L51
            goto L6d
        L6c:
            r2 = r0
        L6d:
            java.lang.String r2 = (java.lang.String) r2
            goto L71
        L70:
            r2 = r0
        L71:
            java.lang.String r8 = "of(...)"
            if (r2 == 0) goto La3
            j$.time.LocalDateTime r0 = j$.time.LocalDateTime.now()
            int r1 = r0.getYear()
            j$.time.Month r2 = r0.getMonth()
            int r0 = r0.getDayOfMonth()
            if (r7 == 0) goto L8c
            int r4 = r7.getHour()
            goto L8d
        L8c:
            r4 = 0
        L8d:
            if (r7 == 0) goto L93
            int r3 = r7.getMinute()
        L93:
            j$.time.LocalDateTime r7 = j$.time.LocalDateTime.of(r1, r2, r0, r4, r3)
            qc.q.h(r7, r8)
            j$.time.ZoneId r8 = j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r7 = r7.atZone(r8)
            goto Le6
        La3:
            io.realm.x0 r1 = r6.realmGet$nextDue()
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = ec.r.c0(r1)
            java.util.Date r1 = (java.util.Date) r1
            if (r1 == 0) goto Lb5
            j$.time.Instant r0 = j$.util.DateRetargetClass.toInstant(r1)
        Lb5:
            j$.time.ZoneId r1 = j$.time.ZoneId.systemDefault()
            j$.time.LocalDateTime r0 = j$.time.LocalDateTime.ofInstant(r0, r1)
            int r1 = r0.getYear()
            j$.time.Month r2 = r0.getMonth()
            int r0 = r0.getDayOfMonth()
            if (r7 == 0) goto Ld0
            int r4 = r7.getHour()
            goto Ld1
        Ld0:
            r4 = 0
        Ld1:
            if (r7 == 0) goto Ld7
            int r3 = r7.getMinute()
        Ld7:
            j$.time.LocalDateTime r7 = j$.time.LocalDateTime.of(r1, r2, r0, r4, r3)
            qc.q.h(r7, r8)
            j$.time.ZoneId r8 = j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r7 = r7.atZone(r8)
        Le6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.models.tasks.Task.getNextReminderOccurrence(com.habitrpg.android.habitica.models.tasks.RemindersItem, android.content.Context):j$.time.ZonedDateTime");
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    public final String getOwnerID() {
        return realmGet$ownerID();
    }

    public final Spanned getParsedNotes() {
        return this.parsedNotes;
    }

    public final Spanned getParsedText() {
        return this.parsedText;
    }

    public final int getPosition() {
        return realmGet$position();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$id();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "id";
    }

    public final float getPriority() {
        return realmGet$priority();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<Task> getRealmClass() {
        return Task.class;
    }

    public final x0<RemindersItem> getReminders() {
        return realmGet$reminders();
    }

    public final Days getRepeat() {
        return realmGet$repeat();
    }

    public final Date getStartDate() {
        return realmGet$startDate();
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public Integer getStreak() {
        return realmGet$streak();
    }

    public final String getStreakString() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str = null;
        int i14 = 0;
        if (getCounterUp() != null) {
            Integer counterUp = getCounterUp();
            if (counterUp != null) {
                i12 = counterUp.intValue();
            } else {
                i12 = 0;
            }
            if (i12 > 0 && getCounterDown() != null) {
                Integer counterDown = getCounterDown();
                if (counterDown != null) {
                    i13 = counterDown.intValue();
                } else {
                    i13 = 0;
                }
                if (i13 > 0) {
                    Integer counterUp2 = getCounterUp();
                    Integer counterDown2 = getCounterDown();
                    if (counterDown2 != null) {
                        str = counterDown2.toString();
                    }
                    return "+" + counterUp2 + " | -" + str;
                }
            }
        }
        if (getCounterUp() != null) {
            Integer counterUp3 = getCounterUp();
            if (counterUp3 != null) {
                i11 = counterUp3.intValue();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                return "+" + getCounterUp();
            }
        }
        if (getCounterDown() != null) {
            Integer counterDown3 = getCounterDown();
            if (counterDown3 != null) {
                i10 = counterDown3.intValue();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                return "-" + getCounterDown();
            }
        }
        Integer streak = getStreak();
        if (streak != null) {
            i14 = streak.intValue();
        }
        if (i14 <= 0) {
            return null;
        }
        return String.valueOf(getStreak());
    }

    public final x0<Tag> getTags() {
        return realmGet$tags();
    }

    public final String getText() {
        return realmGet$text();
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public TaskType getType() {
        return TaskType.Companion.from(realmGet$typeValue());
    }

    public final Boolean getUp() {
        return realmGet$up();
    }

    public final Date getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public final double getValue() {
        return realmGet$value();
    }

    public final List<Integer> getWeeksOfMonth() {
        List<Integer> C0;
        if (this.weeksOfMonth == null) {
            ArrayList arrayList = new ArrayList();
            if (realmGet$weeksOfMonthString() != null) {
                try {
                    JSONArray jSONArray = new JSONArray(realmGet$weeksOfMonthString());
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add(Integer.valueOf(jSONArray.getInt(i10)));
                    }
                } catch (JSONException e10) {
                    ExceptionHandler.Companion.reportError(e10);
                }
            }
            C0 = b0.C0(arrayList);
            this.weeksOfMonth = C0;
        }
        return this.weeksOfMonth;
    }

    public final String getWeeksOfMonthString() {
        return realmGet$weeksOfMonthString();
    }

    public final boolean getYesterDaily() {
        return realmGet$yesterDaily();
    }

    public int hashCode() {
        String realmGet$id = realmGet$id();
        if (realmGet$id != null) {
            return realmGet$id.hashCode();
        }
        return 0;
    }

    public final boolean isAssignedToUser(String str) {
        x0<String> assignedUsers;
        q.i(str, "userID");
        TaskGroupPlan realmGet$group = realmGet$group();
        if (realmGet$group == null || (assignedUsers = realmGet$group.getAssignedUsers()) == null || !assignedUsers.contains(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isBeingEdited(com.habitrpg.android.habitica.models.tasks.Task r11) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.models.tasks.Task.isBeingEdited(com.habitrpg.android.habitica.models.tasks.Task):boolean");
    }

    public final boolean isChecklistDisplayActive() {
        x0 realmGet$checklist = realmGet$checklist();
        boolean z10 = false;
        if (realmGet$checklist != null && realmGet$checklist.size() == getCompletedChecklistCount()) {
            z10 = true;
        }
        return !z10;
    }

    public final boolean isCreating() {
        return realmGet$isCreating();
    }

    public final Boolean isDayOrMorePastDue() {
        ZonedDateTime zonedDateTime;
        LocalDate localDate;
        Date realmGet$dueDate = realmGet$dueDate();
        if (realmGet$dueDate != null) {
            zonedDateTime = ZonedDateExtensionsKt.toZonedDateTime(realmGet$dueDate);
        } else {
            zonedDateTime = null;
        }
        if (zonedDateTime == null || (localDate = zonedDateTime.toLocalDate()) == null) {
            return null;
        }
        return Boolean.valueOf(localDate.isBefore(LocalDate.now()));
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public boolean isDisplayedActive() {
        return BaseTask.DefaultImpls.isDisplayedActive(this);
    }

    public final boolean isDisplayedActiveForUser(String str) {
        boolean z10;
        if ((q.d(isDue(), Boolean.TRUE) && getType() == TaskType.DAILY) || getType() == TaskType.TODO) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || completed(str)) {
            return false;
        }
        return true;
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public Boolean isDue() {
        return realmGet$isDue();
    }

    public final Boolean isDueToday() {
        ZonedDateTime zonedDateTime;
        boolean z10;
        Date realmGet$dueDate = realmGet$dueDate();
        if (realmGet$dueDate != null) {
            zonedDateTime = ZonedDateExtensionsKt.toZonedDateTime(realmGet$dueDate);
        } else {
            zonedDateTime = null;
        }
        if (zonedDateTime == null) {
            return null;
        }
        int dayOfYear = ZonedDateTime.now().getDayOfYear();
        int year = ZonedDateTime.now().getYear();
        if (zonedDateTime.getDayOfYear() == dayOfYear && zonedDateTime.getYear() == year) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public final boolean isGroupTask() {
        String groupID;
        boolean u10;
        TaskGroupPlan realmGet$group = realmGet$group();
        if (realmGet$group != null && (groupID = realmGet$group.getGroupID()) != null) {
            u10 = v.u(groupID);
            if ((!u10) != true) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isPendingApproval() {
        boolean z10;
        boolean z11;
        boolean z12;
        TaskGroupPlan realmGet$group = realmGet$group();
        if (realmGet$group != null) {
            z10 = q.d(realmGet$group.getApprovalRequired(), Boolean.TRUE);
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        TaskGroupPlan realmGet$group2 = realmGet$group();
        if (realmGet$group2 != null) {
            z11 = q.d(realmGet$group2.getApprovalRequested(), Boolean.TRUE);
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        TaskGroupPlan realmGet$group3 = realmGet$group();
        if (realmGet$group3 != null) {
            z12 = q.d(realmGet$group3.getApprovalApproved(), Boolean.FALSE);
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        return true;
    }

    public final boolean isSaving() {
        return realmGet$isSaving();
    }

    public final boolean isUpdatedToday() {
        Date realmGet$updatedAt = realmGet$updatedAt();
        if (realmGet$updatedAt == null) {
            return false;
        }
        return ZonedDateTime.ofInstant(DateRetargetClass.toInstant(realmGet$updatedAt), ZoneId.systemDefault()).toLocalDate().equals(ZonedDateTime.now().withZoneSameLocal(ZoneId.systemDefault()).toLocalDate());
    }

    public final CharSequence markdownNotes(l<? super CharSequence, w> lVar) {
        boolean z10;
        q.i(lVar, "callback");
        Spanned spanned = this.parsedNotes;
        if (spanned != null) {
            return spanned;
        }
        String realmGet$notes = realmGet$notes();
        boolean z11 = false;
        if (realmGet$notes != null) {
            if (realmGet$notes.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            MarkdownParser.INSTANCE.parseMarkdownAsync(realmGet$notes(), new Task$markdownNotes$1(this, lVar));
        }
        return realmGet$notes();
    }

    public final CharSequence markdownText(l<? super CharSequence, w> lVar) {
        q.i(lVar, "callback");
        Spanned spanned = this.parsedText;
        if (spanned != null) {
            if (spanned == null) {
                return "";
            }
            return spanned;
        }
        MarkdownParser.INSTANCE.parseMarkdownAsync(realmGet$text(), new Task$markdownText$1(this, lVar));
        return realmGet$text();
    }

    public final void parseMarkdown() {
        MarkdownParser markdownParser = MarkdownParser.INSTANCE;
        this.parsedText = markdownParser.parseMarkdown(realmGet$text());
        this.parsedNotes = markdownParser.parseMarkdown(realmGet$notes());
    }

    @Override // io.realm.p5
    public String realmGet$attributeValue() {
        return this.attributeValue;
    }

    @Override // io.realm.p5
    public String realmGet$challengeBroken() {
        return this.challengeBroken;
    }

    @Override // io.realm.p5
    public String realmGet$challengeID() {
        return this.challengeID;
    }

    @Override // io.realm.p5
    public x0 realmGet$checklist() {
        return this.checklist;
    }

    @Override // io.realm.p5
    public String realmGet$combinedID() {
        return this.combinedID;
    }

    @Override // io.realm.p5
    public boolean realmGet$completed() {
        return this.completed;
    }

    @Override // io.realm.p5
    public Integer realmGet$counterDown() {
        return this.counterDown;
    }

    @Override // io.realm.p5
    public Integer realmGet$counterUp() {
        return this.counterUp;
    }

    @Override // io.realm.p5
    public Date realmGet$dateCreated() {
        return this.dateCreated;
    }

    @Override // io.realm.p5
    public String realmGet$daysOfMonthString() {
        return this.daysOfMonthString;
    }

    @Override // io.realm.p5
    public Boolean realmGet$down() {
        return this.down;
    }

    @Override // io.realm.p5
    public Date realmGet$dueDate() {
        return this.dueDate;
    }

    @Override // io.realm.p5
    public Integer realmGet$everyX() {
        return this.everyX;
    }

    @Override // io.realm.p5
    public String realmGet$frequencyValue() {
        return this.frequencyValue;
    }

    @Override // io.realm.p5
    public TaskGroupPlan realmGet$group() {
        return this.group;
    }

    @Override // io.realm.p5
    public boolean realmGet$hasErrored() {
        return this.hasErrored;
    }

    @Override // io.realm.p5
    public String realmGet$id() {
        return this.f12530id;
    }

    @Override // io.realm.p5
    public boolean realmGet$isCreating() {
        return this.isCreating;
    }

    @Override // io.realm.p5
    public Boolean realmGet$isDue() {
        return this.isDue;
    }

    @Override // io.realm.p5
    public boolean realmGet$isSaving() {
        return this.isSaving;
    }

    @Override // io.realm.p5
    public x0 realmGet$nextDue() {
        return this.nextDue;
    }

    @Override // io.realm.p5
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.p5
    public String realmGet$ownerID() {
        return this.ownerID;
    }

    @Override // io.realm.p5
    public int realmGet$position() {
        return this.position;
    }

    @Override // io.realm.p5
    public float realmGet$priority() {
        return this.priority;
    }

    @Override // io.realm.p5
    public x0 realmGet$reminders() {
        return this.reminders;
    }

    @Override // io.realm.p5
    public Days realmGet$repeat() {
        return this.repeat;
    }

    @Override // io.realm.p5
    public Date realmGet$startDate() {
        return this.startDate;
    }

    @Override // io.realm.p5
    public Integer realmGet$streak() {
        return this.streak;
    }

    @Override // io.realm.p5
    public x0 realmGet$tags() {
        return this.tags;
    }

    @Override // io.realm.p5
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.p5
    public String realmGet$typeValue() {
        return this.typeValue;
    }

    @Override // io.realm.p5
    public Boolean realmGet$up() {
        return this.up;
    }

    @Override // io.realm.p5
    public Date realmGet$updatedAt() {
        return this.updatedAt;
    }

    @Override // io.realm.p5
    public double realmGet$value() {
        return this.value;
    }

    @Override // io.realm.p5
    public String realmGet$weeksOfMonthString() {
        return this.weeksOfMonthString;
    }

    @Override // io.realm.p5
    public boolean realmGet$yesterDaily() {
        return this.yesterDaily;
    }

    @Override // io.realm.p5
    public void realmSet$attributeValue(String str) {
        this.attributeValue = str;
    }

    @Override // io.realm.p5
    public void realmSet$challengeBroken(String str) {
        this.challengeBroken = str;
    }

    @Override // io.realm.p5
    public void realmSet$challengeID(String str) {
        this.challengeID = str;
    }

    @Override // io.realm.p5
    public void realmSet$checklist(x0 x0Var) {
        this.checklist = x0Var;
    }

    @Override // io.realm.p5
    public void realmSet$combinedID(String str) {
        this.combinedID = str;
    }

    @Override // io.realm.p5
    public void realmSet$completed(boolean z10) {
        this.completed = z10;
    }

    @Override // io.realm.p5
    public void realmSet$counterDown(Integer num) {
        this.counterDown = num;
    }

    @Override // io.realm.p5
    public void realmSet$counterUp(Integer num) {
        this.counterUp = num;
    }

    @Override // io.realm.p5
    public void realmSet$dateCreated(Date date) {
        this.dateCreated = date;
    }

    @Override // io.realm.p5
    public void realmSet$daysOfMonthString(String str) {
        this.daysOfMonthString = str;
    }

    @Override // io.realm.p5
    public void realmSet$down(Boolean bool) {
        this.down = bool;
    }

    @Override // io.realm.p5
    public void realmSet$dueDate(Date date) {
        this.dueDate = date;
    }

    @Override // io.realm.p5
    public void realmSet$everyX(Integer num) {
        this.everyX = num;
    }

    @Override // io.realm.p5
    public void realmSet$frequencyValue(String str) {
        this.frequencyValue = str;
    }

    @Override // io.realm.p5
    public void realmSet$group(TaskGroupPlan taskGroupPlan) {
        this.group = taskGroupPlan;
    }

    @Override // io.realm.p5
    public void realmSet$hasErrored(boolean z10) {
        this.hasErrored = z10;
    }

    @Override // io.realm.p5
    public void realmSet$id(String str) {
        this.f12530id = str;
    }

    @Override // io.realm.p5
    public void realmSet$isCreating(boolean z10) {
        this.isCreating = z10;
    }

    @Override // io.realm.p5
    public void realmSet$isDue(Boolean bool) {
        this.isDue = bool;
    }

    @Override // io.realm.p5
    public void realmSet$isSaving(boolean z10) {
        this.isSaving = z10;
    }

    @Override // io.realm.p5
    public void realmSet$nextDue(x0 x0Var) {
        this.nextDue = x0Var;
    }

    @Override // io.realm.p5
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.p5
    public void realmSet$ownerID(String str) {
        this.ownerID = str;
    }

    @Override // io.realm.p5
    public void realmSet$position(int i10) {
        this.position = i10;
    }

    @Override // io.realm.p5
    public void realmSet$priority(float f10) {
        this.priority = f10;
    }

    @Override // io.realm.p5
    public void realmSet$reminders(x0 x0Var) {
        this.reminders = x0Var;
    }

    @Override // io.realm.p5
    public void realmSet$repeat(Days days) {
        this.repeat = days;
    }

    @Override // io.realm.p5
    public void realmSet$startDate(Date date) {
        this.startDate = date;
    }

    @Override // io.realm.p5
    public void realmSet$streak(Integer num) {
        this.streak = num;
    }

    @Override // io.realm.p5
    public void realmSet$tags(x0 x0Var) {
        this.tags = x0Var;
    }

    @Override // io.realm.p5
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.p5
    public void realmSet$typeValue(String str) {
        this.typeValue = str;
    }

    @Override // io.realm.p5
    public void realmSet$up(Boolean bool) {
        this.up = bool;
    }

    @Override // io.realm.p5
    public void realmSet$updatedAt(Date date) {
        this.updatedAt = date;
    }

    @Override // io.realm.p5
    public void realmSet$value(double d10) {
        this.value = d10;
    }

    @Override // io.realm.p5
    public void realmSet$weeksOfMonthString(String str) {
        this.weeksOfMonthString = str;
    }

    @Override // io.realm.p5
    public void realmSet$yesterDaily(boolean z10) {
        this.yesterDaily = z10;
    }

    public final void setAttribute(Attribute attribute) {
        String str;
        if (attribute != null) {
            str = attribute.getValue();
        } else {
            str = null;
        }
        realmSet$attributeValue(str);
    }

    public final void setAttributeValue(String str) {
        realmSet$attributeValue(str);
    }

    public final void setChallengeBroken(String str) {
        realmSet$challengeBroken(str);
    }

    public final void setChallengeID(String str) {
        realmSet$challengeID(str);
    }

    public final void setChecklist(x0<ChecklistItem> x0Var) {
        realmSet$checklist(x0Var);
    }

    public final void setCombinedID(String str) {
        realmSet$combinedID(str);
    }

    public void setCompleted(boolean z10) {
        realmSet$completed(z10);
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public void setCounterDown(Integer num) {
        realmSet$counterDown(num);
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public void setCounterUp(Integer num) {
        realmSet$counterUp(num);
    }

    public final void setCreating(boolean z10) {
        realmSet$isCreating(z10);
    }

    public final void setDateCreated(Date date) {
        realmSet$dateCreated(date);
    }

    public final void setDaysOfMonth(List<Integer> list) {
        int i10;
        String str;
        this.daysOfMonth = list;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            List<Integer> list2 = this.daysOfMonth;
            if (list2 != null) {
                str = list2.toString();
            } else {
                str = null;
            }
            realmSet$daysOfMonthString(str);
            return;
        }
        realmSet$daysOfMonthString(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }

    public final void setDaysOfMonthString(String str) {
        realmSet$daysOfMonthString(str);
    }

    public final void setDown(Boolean bool) {
        realmSet$down(bool);
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public void setDue(Boolean bool) {
        realmSet$isDue(bool);
    }

    public final void setDueDate(Date date) {
        realmSet$dueDate(date);
    }

    public final void setEveryX(Integer num) {
        realmSet$everyX(num);
    }

    public final void setFrequency(Frequency frequency) {
        String str;
        if (frequency != null) {
            str = frequency.getValue();
        } else {
            str = null;
        }
        realmSet$frequencyValue(str);
    }

    public final void setFrequencyValue(String str) {
        realmSet$frequencyValue(str);
    }

    public final void setGroup(TaskGroupPlan taskGroupPlan) {
        realmSet$group(taskGroupPlan);
    }

    public final void setHasErrored(boolean z10) {
        realmSet$hasErrored(z10);
    }

    public final void setId(String str) {
        realmSet$id(str);
        realmSet$combinedID(realmGet$id() + realmGet$ownerID());
    }

    public final void setNextDue(x0<Date> x0Var) {
        realmSet$nextDue(x0Var);
    }

    public final void setNotes(String str) {
        realmSet$notes(str);
    }

    public final void setOwnerID(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$ownerID(str);
        realmSet$combinedID(realmGet$id() + realmGet$ownerID());
    }

    public final void setParsedNotes(Spanned spanned) {
        this.parsedNotes = spanned;
    }

    public final void setParsedText(Spanned spanned) {
        this.parsedText = spanned;
    }

    public final void setPosition(int i10) {
        realmSet$position(i10);
    }

    public final void setPriority(float f10) {
        realmSet$priority(f10);
    }

    public final void setReminders(x0<RemindersItem> x0Var) {
        realmSet$reminders(x0Var);
    }

    public final void setRepeat(Days days) {
        realmSet$repeat(days);
    }

    public final void setSaving(boolean z10) {
        realmSet$isSaving(z10);
    }

    public final void setStartDate(Date date) {
        realmSet$startDate(date);
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public void setStreak(Integer num) {
        realmSet$streak(num);
    }

    public final void setTags(x0<Tag> x0Var) {
        realmSet$tags(x0Var);
    }

    public final void setText(String str) {
        q.i(str, "<set-?>");
        realmSet$text(str);
    }

    @Override // com.habitrpg.shared.habitica.models.tasks.BaseTask
    public void setType(TaskType taskType) {
        String str;
        if (taskType != null) {
            str = taskType.getValue();
        } else {
            str = null;
        }
        realmSet$typeValue(str);
    }

    public final void setUp(Boolean bool) {
        realmSet$up(bool);
    }

    public final void setUpdatedAt(Date date) {
        realmSet$updatedAt(date);
    }

    public final void setValue(double d10) {
        realmSet$value(d10);
    }

    public final void setWeeksOfMonth(List<Integer> list) {
        int i10;
        String str;
        this.weeksOfMonth = list;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            List<Integer> list2 = this.weeksOfMonth;
            if (list2 != null) {
                str = list2.toString();
            } else {
                str = null;
            }
            realmSet$weeksOfMonthString(str);
            return;
        }
        realmSet$weeksOfMonthString(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }

    public final void setWeeksOfMonthString(String str) {
        realmSet$weeksOfMonthString(str);
    }

    public final void setYesterDaily(boolean z10) {
        realmSet$yesterDaily(z10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        long j10;
        long j11;
        int i11;
        q.i(parcel, "dest");
        parcel.writeString(realmGet$ownerID());
        parcel.writeValue(Float.valueOf(realmGet$priority()));
        parcel.writeString(realmGet$text());
        parcel.writeString(realmGet$notes());
        Attribute attribute = getAttribute();
        String str3 = null;
        if (attribute != null) {
            str = attribute.getValue();
        } else {
            str = null;
        }
        parcel.writeString(str);
        TaskType type = getType();
        if (type != null) {
            str2 = type.getValue();
        } else {
            str2 = null;
        }
        parcel.writeString(str2);
        parcel.writeDouble(realmGet$value());
        x0 realmGet$tags = realmGet$tags();
        if (!(realmGet$tags instanceof List)) {
            realmGet$tags = null;
        }
        parcel.writeList(realmGet$tags);
        Date realmGet$dateCreated = realmGet$dateCreated();
        long j12 = -1;
        if (realmGet$dateCreated != null) {
            j10 = realmGet$dateCreated.getTime();
        } else {
            j10 = -1;
        }
        parcel.writeLong(j10);
        parcel.writeInt(realmGet$position());
        parcel.writeValue(realmGet$up());
        parcel.writeValue(realmGet$down());
        parcel.writeByte(getCompleted() ? (byte) 1 : (byte) 0);
        x0 realmGet$checklist = realmGet$checklist();
        if (!(realmGet$checklist instanceof List)) {
            realmGet$checklist = null;
        }
        parcel.writeList(realmGet$checklist);
        x0 realmGet$reminders = realmGet$reminders();
        if (!(realmGet$reminders instanceof List)) {
            realmGet$reminders = null;
        }
        parcel.writeList(realmGet$reminders);
        Frequency frequency = getFrequency();
        if (frequency != null) {
            str3 = frequency.getValue();
        }
        parcel.writeString(str3);
        parcel.writeValue(realmGet$everyX());
        parcel.writeString(realmGet$daysOfMonthString());
        parcel.writeString(realmGet$weeksOfMonthString());
        parcel.writeValue(getStreak());
        Date realmGet$startDate = realmGet$startDate();
        if (realmGet$startDate != null) {
            j11 = realmGet$startDate.getTime();
        } else {
            j11 = -1;
        }
        parcel.writeLong(j11);
        parcel.writeParcelable(realmGet$repeat(), i10);
        Date realmGet$dueDate = realmGet$dueDate();
        if (realmGet$dueDate != null) {
            j12 = realmGet$dueDate.getTime();
        }
        parcel.writeLong(j12);
        parcel.writeString(realmGet$id());
        Integer counterUp = getCounterUp();
        int i12 = 0;
        if (counterUp != null) {
            i11 = counterUp.intValue();
        } else {
            i11 = 0;
        }
        parcel.writeInt(i11);
        Integer counterDown = getCounterDown();
        if (counterDown != null) {
            i12 = counterDown.intValue();
        }
        parcel.writeInt(i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Task(Parcel parcel) {
        q.i(parcel, "in");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$ownerID("");
        realmSet$text("");
        realmSet$attributeValue(Attribute.STRENGTH.getValue());
        realmSet$tags(new x0());
        Boolean bool = Boolean.FALSE;
        realmSet$up(bool);
        realmSet$down(bool);
        realmSet$counterUp(0);
        realmSet$counterDown(0);
        realmSet$checklist(new x0());
        realmSet$reminders(new x0());
        realmSet$everyX(0);
        realmSet$streak(0);
        realmSet$yesterDaily(true);
        String readString = parcel.readString();
        setOwnerID(readString == null ? "" : readString);
        Object readValue = parcel.readValue(Float.TYPE.getClassLoader());
        Float f10 = readValue instanceof Float ? (Float) readValue : null;
        realmSet$priority(f10 != null ? f10.floatValue() : 0.0f);
        String readString2 = parcel.readString();
        realmSet$text(readString2 == null ? "" : readString2);
        realmSet$notes(parcel.readString());
        Attribute.Companion companion = Attribute.Companion;
        String readString3 = parcel.readString();
        setAttribute(companion.from(readString3 == null ? "" : readString3));
        TaskType.Companion companion2 = TaskType.Companion;
        String readString4 = parcel.readString();
        setType(companion2.from(readString4 == null ? "" : readString4));
        realmSet$value(parcel.readDouble());
        realmSet$tags(new x0());
        x0 realmGet$tags = realmGet$tags();
        q.g(realmGet$tags, "null cannot be cast to non-null type kotlin.collections.List<*>");
        parcel.readList(realmGet$tags, TaskTag.class.getClassLoader());
        long readLong = parcel.readLong();
        realmSet$dateCreated(readLong == -1 ? null : new Date(readLong));
        realmSet$position(parcel.readInt());
        Class cls = Boolean.TYPE;
        Object readValue2 = parcel.readValue(cls.getClassLoader());
        Boolean bool2 = readValue2 instanceof Boolean ? (Boolean) readValue2 : null;
        realmSet$up(bool2 == null ? bool : bool2);
        Object readValue3 = parcel.readValue(cls.getClassLoader());
        Boolean bool3 = readValue3 instanceof Boolean ? (Boolean) readValue3 : null;
        realmSet$down(bool3 != null ? bool3 : bool);
        setCompleted(parcel.readByte() != 0);
        realmSet$checklist(new x0());
        x0 realmGet$checklist = realmGet$checklist();
        q.g(realmGet$checklist, "null cannot be cast to non-null type kotlin.collections.List<*>");
        parcel.readList(realmGet$checklist, ChecklistItem.class.getClassLoader());
        realmSet$reminders(new x0());
        x0 realmGet$reminders = realmGet$reminders();
        q.g(realmGet$reminders, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
        parcel.readList(k0.c(realmGet$reminders), RemindersItem.class.getClassLoader());
        Frequency.Companion companion3 = Frequency.Companion;
        String readString5 = parcel.readString();
        setFrequency(companion3.from(readString5 != null ? readString5 : ""));
        Class cls2 = Integer.TYPE;
        Object readValue4 = parcel.readValue(cls2.getClassLoader());
        Integer num = readValue4 instanceof Integer ? (Integer) readValue4 : null;
        realmSet$everyX(num == null ? 1 : num);
        realmSet$daysOfMonthString(parcel.readString());
        realmSet$weeksOfMonthString(parcel.readString());
        Object readValue5 = parcel.readValue(cls2.getClassLoader());
        Integer num2 = readValue5 instanceof Integer ? (Integer) readValue5 : null;
        setStreak(num2 == null ? 0 : num2);
        long readLong2 = parcel.readLong();
        realmSet$startDate(readLong2 == -1 ? null : new Date(readLong2));
        realmSet$repeat((Days) parcel.readParcelable(Days.class.getClassLoader()));
        long readLong3 = parcel.readLong();
        realmSet$dueDate(readLong3 != -1 ? new Date(readLong3) : null);
        setId(parcel.readString());
        setCounterUp(Integer.valueOf(parcel.readInt()));
        setCounterDown(Integer.valueOf(parcel.readInt()));
    }
}
