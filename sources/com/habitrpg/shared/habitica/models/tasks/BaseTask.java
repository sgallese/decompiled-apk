package com.habitrpg.shared.habitica.models.tasks;

import qc.q;

/* compiled from: BaseTask.kt */
/* loaded from: classes4.dex */
public interface BaseTask {

    /* compiled from: BaseTask.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static boolean isDisplayedActive(BaseTask baseTask) {
            if (((q.d(baseTask.isDue(), Boolean.TRUE) && baseTask.getType() == TaskType.DAILY) || baseTask.getType() == TaskType.TODO) && !baseTask.getCompleted()) {
                return true;
            }
            return false;
        }
    }

    boolean getCompleted();

    Integer getCounterDown();

    Integer getCounterUp();

    Integer getStreak();

    TaskType getType();

    boolean isDisplayedActive();

    Boolean isDue();

    void setCounterDown(Integer num);

    void setCounterUp(Integer num);

    void setDue(Boolean bool);

    void setStreak(Integer num);

    void setType(TaskType taskType);
}
