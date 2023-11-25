package com.habitrpg.android.habitica.helpers;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.tasks.Days;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.common.habitica.extensions.TaskDifficultyExtensionsKt;
import com.habitrpg.shared.habitica.models.tasks.Frequency;
import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import ec.b0;
import ec.t;
import ec.u;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import qc.q;

/* compiled from: TaskDescriptionBuilder.kt */
/* loaded from: classes4.dex */
public final class TaskDescriptionBuilder {
    public static final int $stable = 8;
    private final Context context;
    private final DateFormat dateFormatter;

    /* compiled from: TaskDescriptionBuilder.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.HABIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.TODO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.DAILY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Frequency.values().length];
            try {
                iArr2[Frequency.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Frequency.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Frequency.YEARLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Frequency.DAILY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public TaskDescriptionBuilder(Context context) {
        q.i(context, "context");
        this.context = context;
        this.dateFormatter = DateFormat.getDateInstance();
    }

    private final String describeDate(Date date) {
        String format = this.dateFormatter.format(date);
        q.h(format, "format(...)");
        return format;
    }

    private final String describeDifficulty(float f10) {
        String string = this.context.getString(TaskDifficultyExtensionsKt.getNameSentenceRes(TaskDifficulty.Companion.valueOf(f10)));
        q.h(string, "getString(...)");
        return string;
    }

    private final String describeHabitDirections(boolean z10, boolean z11) {
        if (z10 && z11) {
            String string = this.context.getString(R.string.positive_and_negative);
            q.f(string);
            return string;
        } else if (z10) {
            String string2 = this.context.getString(R.string.positive_sentence);
            q.f(string2);
            return string2;
        } else {
            String string3 = this.context.getString(R.string.negative_sentence);
            q.f(string3);
            return string3;
        }
    }

    private final Object describeRepeatDays(Task task) {
        int i10;
        boolean z10;
        boolean z11;
        List<String> i11;
        String joinToCount;
        boolean z12;
        boolean z13;
        String string;
        List<String> i12;
        Object a02;
        int s10;
        Integer everyX = task.getEveryX();
        String str = "";
        if (everyX != null && everyX.intValue() == 0) {
            return "";
        }
        Frequency frequency = task.getFrequency();
        if (frequency == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        }
        boolean z14 = false;
        if (i10 != 1) {
            Integer num = null;
            String str2 = null;
            ArrayList arrayList = null;
            if (i10 != 2) {
                if (i10 != 3) {
                    return "";
                }
                Context context = this.context;
                Object[] objArr = new Object[1];
                Date startDate = task.getStartDate();
                if (startDate != null) {
                    str2 = DateUtils.formatDateTime(this.context, startDate.getTime(), 24);
                }
                if (str2 != null) {
                    str = str2;
                }
                objArr[0] = str;
                return " " + context.getString(R.string.on_x, objArr);
            }
            if (task.getDaysOfMonth() != null && (!r0.isEmpty()) == true) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                List<Integer> daysOfMonth = task.getDaysOfMonth();
                if (daysOfMonth != null) {
                    List<Integer> list = daysOfMonth;
                    s10 = u.s(list, 10);
                    arrayList = new ArrayList(s10);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(withOrdinal(((Number) it.next()).intValue()));
                    }
                }
                str = this.context.getString(R.string.on_the_x, joinToCount(arrayList));
            } else {
                if (task.getWeeksOfMonth() != null && (!r0.isEmpty()) == true) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    List<Integer> weeksOfMonth = task.getWeeksOfMonth();
                    if (weeksOfMonth != null) {
                        a02 = b0.a0(weeksOfMonth);
                        num = (Integer) a02;
                    }
                    if (num != null && num.intValue() == 0) {
                        string = this.context.getString(R.string.first);
                    } else if (num != null && num.intValue() == 1) {
                        string = this.context.getString(R.string.second);
                    } else if (num != null && num.intValue() == 2) {
                        string = this.context.getString(R.string.third);
                    } else if (num != null && num.intValue() == 3) {
                        string = this.context.getString(R.string.fourth);
                    } else if (num == null || num.intValue() != 4) {
                        return "";
                    } else {
                        string = this.context.getString(R.string.fifth);
                    }
                    q.f(string);
                    Days repeat = task.getRepeat();
                    if (repeat == null || (i12 = repeat.dayStrings(this.context)) == null) {
                        i12 = t.i();
                    }
                    str = this.context.getString(R.string.on_the_x_of_month, string, joinToCount(i12));
                }
            }
            return " " + str;
        }
        Days repeat2 = task.getRepeat();
        if (repeat2 != null && repeat2.isEveryDay()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            joinToCount = this.context.getString(R.string.on_every_day_of_week);
        } else {
            Days repeat3 = task.getRepeat();
            if (repeat3 != null && repeat3.isOnlyWeekdays()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                joinToCount = this.context.getString(R.string.on_weekdays);
            } else {
                Days repeat4 = task.getRepeat();
                if (repeat4 != null && repeat4.isOnlyWeekends()) {
                    z14 = true;
                }
                if (z14) {
                    joinToCount = this.context.getString(R.string.on_weekends);
                } else {
                    Days repeat5 = task.getRepeat();
                    if (repeat5 == null || (i11 = repeat5.dayStrings(this.context)) == null) {
                        i11 = t.i();
                    }
                    joinToCount = joinToCount(i11);
                }
            }
        }
        return " " + joinToCount;
    }

    private final String describeRepeatInterval(Frequency frequency, int i10) {
        int i11;
        if (i10 == 0) {
            String string = this.context.getString(R.string.never);
            q.h(string, "getString(...)");
            return string;
        }
        if (frequency == null) {
            i11 = -1;
        } else {
            i11 = WhenMappings.$EnumSwitchMapping$1[frequency.ordinal()];
        }
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            String quantityString = this.context.getResources().getQuantityString(R.plurals.repeat_daily, i10, Integer.valueOf(i10));
                            q.h(quantityString, "getQuantityString(...)");
                            return quantityString;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    String quantityString2 = this.context.getResources().getQuantityString(R.plurals.repeat_yearly, i10, Integer.valueOf(i10));
                    q.h(quantityString2, "getQuantityString(...)");
                    return quantityString2;
                }
                String quantityString3 = this.context.getResources().getQuantityString(R.plurals.repeat_monthly, i10, Integer.valueOf(i10));
                q.h(quantityString3, "getQuantityString(...)");
                return quantityString3;
            }
            String quantityString4 = this.context.getResources().getQuantityString(R.plurals.repeat_weekly, i10, Integer.valueOf(i10));
            q.h(quantityString4, "getQuantityString(...)");
            return quantityString4;
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r10 = ec.b0.k0(r10, ", ", null, null, 0, null, null, 62, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String joinToCount(java.util.List<java.lang.String> r10) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r10 == 0) goto Ld
            int r3 = r10.size()
            if (r3 != r0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L28
            android.content.Context r3 = r9.context
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r4 = r10.get(r2)
            r0[r2] = r4
            java.lang.Object r10 = r10.get(r1)
            r0[r1] = r10
            r10 = 2131953455(0x7f13072f, float:1.9543381E38)
            java.lang.String r10 = r3.getString(r10, r0)
            goto L3f
        L28:
            if (r10 == 0) goto L3d
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            r8 = 0
            java.lang.String r10 = ec.r.k0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != 0) goto L3f
        L3d:
            java.lang.String r10 = ""
        L3f:
            qc.q.f(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.TaskDescriptionBuilder.joinToCount(java.util.List):java.lang.String");
    }

    private final String withOrdinal(int i10) {
        String format;
        if (Build.VERSION.SDK_INT >= 24) {
            h.a();
            format = g.a("{0,ordinal}", Locale.getDefault()).format(new Integer[]{Integer.valueOf(i10)});
            q.f(format);
            return format;
        }
        return String.valueOf(i10);
    }

    public final String describe(Task task) {
        int i10;
        boolean z10;
        boolean z11;
        String string;
        int i11;
        q.i(task, "task");
        TaskType type = task.getType();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "";
                }
                Context context = this.context;
                Object[] objArr = new Object[3];
                objArr[0] = describeDifficulty(task.getPriority());
                Frequency frequency = task.getFrequency();
                Integer everyX = task.getEveryX();
                if (everyX != null) {
                    i11 = everyX.intValue();
                } else {
                    i11 = 1;
                }
                objArr[1] = describeRepeatInterval(frequency, i11);
                objArr[2] = describeRepeatDays(task);
                String string2 = context.getString(R.string.daily_summary_description, objArr);
                q.h(string2, "getString(...)");
                return string2;
            }
            if (task.getDueDate() != null) {
                Context context2 = this.context;
                Date dueDate = task.getDueDate();
                q.f(dueDate);
                string = context2.getString(R.string.todo_summary_description_duedate, describeDifficulty(task.getPriority()), describeDate(dueDate));
            } else {
                string = this.context.getString(R.string.todo_summary_description, describeDifficulty(task.getPriority()));
            }
            q.f(string);
            return string;
        }
        Context context3 = this.context;
        Object[] objArr2 = new Object[2];
        Boolean up = task.getUp();
        if (up != null) {
            z10 = up.booleanValue();
        } else {
            z10 = false;
        }
        Boolean down = task.getDown();
        if (down != null) {
            z11 = down.booleanValue();
        } else {
            z11 = false;
        }
        objArr2[0] = describeHabitDirections(z10, z11);
        objArr2[1] = describeDifficulty(task.getPriority());
        String string3 = context3.getString(R.string.habit_summary_description, objArr2);
        q.h(string3, "getString(...)");
        return string3;
    }
}
