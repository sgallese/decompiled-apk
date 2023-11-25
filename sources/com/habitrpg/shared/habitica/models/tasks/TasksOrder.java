package com.habitrpg.shared.habitica.models.tasks;

import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import ec.t;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import qc.q;

/* compiled from: TasksOrder.kt */
/* loaded from: classes4.dex */
public final class TasksOrder {
    private List<String> dailys;
    private List<String> habits;
    private List<String> rewards;
    private List<String> todos;

    /* compiled from: TasksOrder.kt */
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
            try {
                iArr[TaskType.REWARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TasksOrder() {
        List<String> i10;
        List<String> i11;
        List<String> i12;
        List<String> i13;
        i10 = t.i();
        this.habits = i10;
        i11 = t.i();
        this.dailys = i11;
        i12 = t.i();
        this.todos = i12;
        i13 = t.i();
        this.rewards = i13;
    }

    public final List<String> getDailys() {
        return this.dailys;
    }

    public final List<String> getHabits() {
        return this.habits;
    }

    public final List<String> getRewards() {
        return this.rewards;
    }

    public final List<String> getTodos() {
        return this.todos;
    }

    public final int positionOf(String str, TaskType taskType) {
        q.i(str, "key");
        q.i(taskType, TaskFormActivity.TASK_TYPE_KEY);
        int i10 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return this.rewards.indexOf(str);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return this.todos.indexOf(str);
            }
            return this.dailys.indexOf(str);
        }
        return this.habits.indexOf(str);
    }

    public final void setDailys(List<String> list) {
        q.i(list, "<set-?>");
        this.dailys = list;
    }

    public final void setHabits(List<String> list) {
        q.i(list, "<set-?>");
        this.habits = list;
    }

    public final void setRewards(List<String> list) {
        q.i(list, "<set-?>");
        this.rewards = list;
    }

    public final void setTodos(List<String> list) {
        q.i(list, "<set-?>");
        this.todos = list;
    }
}
