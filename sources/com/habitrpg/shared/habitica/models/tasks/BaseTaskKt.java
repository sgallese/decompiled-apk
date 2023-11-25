package com.habitrpg.shared.habitica.models.tasks;

import qc.q;

/* compiled from: BaseTask.kt */
/* loaded from: classes4.dex */
public final class BaseTaskKt {
    public static final String getStreakString(BaseTask baseTask) {
        int i10;
        int i11;
        int i12;
        int i13;
        q.i(baseTask, "<this>");
        Integer counterUp = baseTask.getCounterUp();
        int i14 = 0;
        if (counterUp != null) {
            i10 = counterUp.intValue();
        } else {
            i10 = 0;
        }
        String str = null;
        if (i10 > 0) {
            Integer counterDown = baseTask.getCounterDown();
            if (counterDown != null) {
                i13 = counterDown.intValue();
            } else {
                i13 = 0;
            }
            if (i13 > 0) {
                Integer counterUp2 = baseTask.getCounterUp();
                Integer counterDown2 = baseTask.getCounterDown();
                if (counterDown2 != null) {
                    str = counterDown2.toString();
                }
                return "+" + counterUp2 + " | -" + str;
            }
        }
        Integer counterUp3 = baseTask.getCounterUp();
        if (counterUp3 != null) {
            i11 = counterUp3.intValue();
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            return "+" + baseTask.getCounterUp();
        }
        Integer counterDown3 = baseTask.getCounterDown();
        if (counterDown3 != null) {
            i12 = counterDown3.intValue();
        } else {
            i12 = 0;
        }
        if (i12 > 0) {
            return "-" + baseTask.getCounterDown();
        }
        Integer streak = baseTask.getStreak();
        if (streak != null) {
            i14 = streak.intValue();
        }
        if (i14 <= 0) {
            return null;
        }
        return String.valueOf(baseTask.getStreak());
    }
}
