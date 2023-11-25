package com.habitrpg.android.habitica.utils;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.habitrpg.android.habitica.extensions.JsonObjectExtensionsKt;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Days;
import com.habitrpg.android.habitica.models.tasks.RemindersItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.shared.habitica.models.tasks.Attribute;
import com.habitrpg.shared.habitica.models.tasks.Frequency;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import yc.v;

/* compiled from: TaskSerializer.kt */
/* loaded from: classes4.dex */
public final class TaskSerializer implements q<Task>, k<Task> {
    public static final int $stable = 0;

    /* compiled from: TaskSerializer.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.HABIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final List<Integer> getIntListFromJsonArray(i iVar) {
        ArrayList arrayList = new ArrayList();
        int size = iVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(iVar.t(i10).g()));
        }
        return arrayList;
    }

    private final void getMonthlyDays(n nVar, Task task) {
        i y10 = nVar.y("weeksOfMonth");
        if (y10 != null && y10.size() > 0) {
            task.setWeeksOfMonth(getIntListFromJsonArray(y10));
        }
        i y11 = nVar.y("daysOfMonth");
        if (y11 != null && y11.size() > 0) {
            task.setDaysOfMonth(getIntListFromJsonArray(y11));
        }
    }

    private final i serializeChecklist(List<? extends ChecklistItem> list) {
        i iVar = new i();
        if (list != null) {
            for (ChecklistItem checklistItem : list) {
                n nVar = new n();
                nVar.u("text", checklistItem.getText());
                nVar.u("id", checklistItem.getId());
                nVar.s(Task.FILTER_COMPLETED, Boolean.valueOf(checklistItem.getCompleted()));
                iVar.r(nVar);
            }
        }
        return iVar;
    }

    private final i serializeReminders(List<? extends RemindersItem> list) {
        i iVar = new i();
        if (list != null) {
            for (RemindersItem remindersItem : list) {
                n nVar = new n();
                nVar.u("id", remindersItem.getId());
                if (remindersItem.getStartDate() != null) {
                    nVar.u("startDate", remindersItem.getStartDate());
                }
                nVar.u("time", remindersItem.getTime());
                iVar.r(nVar);
            }
        }
        return iVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    @Override // com.google.gson.k
    public Task deserialize(l lVar, Type type, j jVar) {
        l safeGet;
        boolean asBooleanOrFalse;
        boolean asBooleanOrFalse2;
        boolean asBooleanOrFalse3;
        boolean u10;
        qc.q.i(jVar, "context");
        Task task = new Task();
        n nVar = lVar instanceof n ? (n) lVar : null;
        if (nVar == null) {
            return task;
        }
        task.setText(JsonObjectExtensionsKt.getAsString(nVar, "text"));
        task.setNotes(JsonObjectExtensionsKt.getAsString(nVar, "notes"));
        task.setOwnerID(JsonObjectExtensionsKt.getAsString(nVar, TaskFormActivity.USER_ID_KEY));
        l x10 = nVar.x(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        task.setValue(x10 != null ? x10.e() : 0.0d);
        TaskType from = TaskType.Companion.from(JsonObjectExtensionsKt.getAsString(nVar, TaskFormActivity.TASK_TYPE_KEY));
        if (from == null) {
            from = TaskType.HABIT;
        }
        task.setType(from);
        task.setFrequency(Frequency.Companion.from(JsonObjectExtensionsKt.getAsString(nVar, "frequency")));
        task.setAttribute(Attribute.Companion.from(JsonObjectExtensionsKt.getAsString(nVar, "attribute")));
        l x11 = nVar.x("everyX");
        task.setEveryX(x11 != null ? Integer.valueOf(x11.g()) : null);
        l x12 = nVar.x("priority");
        task.setPriority(x12 != null ? x12.f() : 1.0f);
        l x13 = nVar.x(Task.FILTER_COMPLETED);
        boolean z10 = false;
        task.setCompleted(x13 != null ? x13.a() : false);
        l x14 = nVar.x("up");
        task.setUp(x14 != null ? Boolean.valueOf(x14.a()) : Boolean.FALSE);
        l x15 = nVar.x("down");
        task.setDown(x15 != null ? Boolean.valueOf(x15.a()) : Boolean.FALSE);
        safeGet = TaskSerializerKt.safeGet(nVar, "streak");
        task.setStreak(safeGet != null ? Integer.valueOf(safeGet.g()) : null);
        if (nVar.A(ClientData.KEY_CHALLENGE).D("id")) {
            task.setChallengeID(nVar.A(ClientData.KEY_CHALLENGE).x("id").l());
            if (nVar.A(ClientData.KEY_CHALLENGE).D("broken")) {
                task.setChallengeBroken(nVar.A(ClientData.KEY_CHALLENGE).x("broken").l());
            }
        }
        try {
            l x16 = nVar.x("counterUp");
            task.setCounterUp(x16 != null ? Integer.valueOf(x16.g()) : null);
            l x17 = nVar.x("counterDown");
            task.setCounterDown(x17 != null ? Integer.valueOf(x17.g()) : null);
        } catch (UnsupportedOperationException unused) {
        }
        task.setDateCreated((Date) jVar.a(nVar.x("createdAt"), Date.class));
        task.setDueDate((Date) jVar.a(nVar.x("date"), Date.class));
        task.setUpdatedAt((Date) jVar.a(nVar.x("updatedAt"), Date.class));
        task.setStartDate((Date) jVar.a(nVar.x("startDate"), Date.class));
        l x18 = nVar.x("isDue");
        task.setDue(x18 != null ? Boolean.valueOf(x18.a()) : null);
        if (nVar.D("nextDue")) {
            task.setNextDue(new x0<>());
            Iterator<l> it = nVar.y("nextDue").iterator();
            while (it.hasNext()) {
                l next = it.next();
                x0<Date> nextDue = task.getNextDue();
                if (nextDue != null) {
                    nextDue.add(jVar.a(next, Date.class));
                }
            }
        }
        if (nVar.D("checklist")) {
            task.setChecklist(new x0<>());
            Iterator<l> it2 = nVar.y("checklist").iterator();
            while (it2.hasNext()) {
                n i10 = it2.next().i();
                x0<ChecklistItem> checklist = task.getChecklist();
                if (checklist != null) {
                    checklist.add(new ChecklistItem(JsonObjectExtensionsKt.getAsString(i10, "id"), JsonObjectExtensionsKt.getAsString(i10, "text"), i10.x(Task.FILTER_COMPLETED).a()));
                }
            }
        }
        if (nVar.D("reminders")) {
            task.setReminders(new x0<>());
            Iterator<l> it3 = nVar.y("reminders").iterator();
            while (it3.hasNext()) {
                n i11 = it3.next().i();
                RemindersItem remindersItem = new RemindersItem();
                remindersItem.setId(JsonObjectExtensionsKt.getAsString(i11, "id"));
                remindersItem.setStartDate(JsonObjectExtensionsKt.getAsString(i11, "startDate"));
                remindersItem.setTime(JsonObjectExtensionsKt.getAsString(i11, "time"));
                x0<RemindersItem> reminders = task.getReminders();
                if (reminders != null) {
                    reminders.add(remindersItem);
                }
            }
        }
        if (nVar.D("repeat")) {
            task.setRepeat((Days) jVar.a(nVar.x("repeat"), Days.class));
        }
        if (nVar.D("group")) {
            n A = nVar.A("group");
            Object a10 = jVar.a(A, TaskGroupPlan.class);
            qc.q.h(a10, "deserialize(...)");
            TaskGroupPlan taskGroupPlan = (TaskGroupPlan) a10;
            String groupID = taskGroupPlan.getGroupID();
            if (groupID != null) {
                u10 = v.u(groupID);
                if ((!u10) == true) {
                    z10 = true;
                }
            }
            if (z10 && A.D("approval")) {
                n A2 = A.A("approval");
                if (A2.D("requested")) {
                    o C = A2.C("requested");
                    qc.q.h(C, "getAsJsonPrimitive(...)");
                    asBooleanOrFalse3 = TaskSerializerKt.getAsBooleanOrFalse(C);
                    taskGroupPlan.setApprovalRequested(Boolean.valueOf(asBooleanOrFalse3));
                }
                if (A2.D("approved")) {
                    o C2 = A2.C("approved");
                    qc.q.h(C2, "getAsJsonPrimitive(...)");
                    asBooleanOrFalse2 = TaskSerializerKt.getAsBooleanOrFalse(C2);
                    taskGroupPlan.setApprovalApproved(Boolean.valueOf(asBooleanOrFalse2));
                }
                if (A2.D("required")) {
                    o C3 = A2.C("required");
                    qc.q.h(C3, "getAsJsonPrimitive(...)");
                    asBooleanOrFalse = TaskSerializerKt.getAsBooleanOrFalse(C3);
                    taskGroupPlan.setApprovalRequired(Boolean.valueOf(asBooleanOrFalse));
                }
            }
            task.setGroup(taskGroupPlan);
        }
        getMonthlyDays(nVar, task);
        task.setId(JsonObjectExtensionsKt.getAsString(nVar, "_id"));
        return task;
    }

    @Override // com.google.gson.q
    public l serialize(Task task, Type type, p pVar) {
        qc.q.i(task, "task");
        qc.q.i(type, "typeOfSrc");
        qc.q.i(pVar, "context");
        n nVar = new n();
        nVar.u("_id", task.getId());
        nVar.u("text", task.getText());
        nVar.u("notes", task.getNotes());
        nVar.t(AppMeasurementSdk.ConditionalUserProperty.VALUE, Double.valueOf(task.getValue()));
        nVar.t("priority", Float.valueOf(task.getPriority()));
        Attribute attribute = task.getAttribute();
        nVar.u("attribute", attribute != null ? attribute.getValue() : null);
        TaskType type2 = task.getType();
        nVar.u(TaskFormActivity.TASK_TYPE_KEY, type2 != null ? type2.getValue() : null);
        i iVar = new i();
        x0<Tag> tags = task.getTags();
        if (tags != null) {
            Iterator<Tag> it = tags.iterator();
            while (it.hasNext()) {
                iVar.s(it.next().getId());
            }
        }
        nVar.r("tags", iVar);
        TaskType type3 = task.getType();
        int i10 = type3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type3.ordinal()];
        if (i10 == 1) {
            nVar.s("up", task.getUp());
            nVar.s("down", task.getDown());
            Frequency frequency = task.getFrequency();
            nVar.u("frequency", frequency != null ? frequency.getValue() : null);
            nVar.t("counterUp", task.getCounterUp());
            nVar.t("counterDown", task.getCounterDown());
        } else if (i10 == 2) {
            Frequency frequency2 = task.getFrequency();
            nVar.u("frequency", frequency2 != null ? frequency2.getValue() : null);
            nVar.t("everyX", task.getEveryX());
            nVar.r("repeat", pVar.b(task.getRepeat()));
            nVar.r("startDate", pVar.b(task.getStartDate()));
            nVar.t("streak", task.getStreak());
            if (task.getChecklist() != null) {
                nVar.r("checklist", serializeChecklist(task.getChecklist()));
            }
            if (task.getReminders() != null) {
                nVar.r("reminders", serializeReminders(task.getReminders()));
            }
            nVar.r("reminders", pVar.b(task.getReminders()));
            nVar.r("daysOfMonth", pVar.b(task.getDaysOfMonth()));
            nVar.r("weeksOfMonth", pVar.b(task.getWeeksOfMonth()));
            nVar.s(Task.FILTER_COMPLETED, Boolean.valueOf(task.getCompleted()));
        } else if (i10 == 3) {
            if (task.getDueDate() == null) {
                nVar.u("date", "");
            } else {
                nVar.r("date", pVar.b(task.getDueDate()));
            }
            if (task.getChecklist() != null) {
                nVar.r("checklist", serializeChecklist(task.getChecklist()));
            }
            if (task.getReminders() != null) {
                nVar.r("reminders", serializeReminders(task.getReminders()));
            }
            nVar.s(Task.FILTER_COMPLETED, Boolean.valueOf(task.getCompleted()));
        }
        return nVar;
    }
}
