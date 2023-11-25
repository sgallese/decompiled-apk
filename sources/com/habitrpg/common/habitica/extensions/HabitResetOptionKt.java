package com.habitrpg.common.habitica.extensions;

import com.habitrpg.common.habitica.R;
import com.habitrpg.shared.habitica.models.tasks.HabitResetOption;
import kotlin.NoWhenBranchMatchedException;
import qc.q;

/* compiled from: HabitResetOption.kt */
/* loaded from: classes4.dex */
public final class HabitResetOptionKt {

    /* compiled from: HabitResetOption.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HabitResetOption.values().length];
            try {
                iArr[HabitResetOption.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HabitResetOption.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HabitResetOption.MONTHLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getNameRes(HabitResetOption habitResetOption) {
        q.i(habitResetOption, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[habitResetOption.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return R.string.monthly;
                }
                throw new NoWhenBranchMatchedException();
            }
            return R.string.weekly;
        }
        return R.string.daily;
    }
}
