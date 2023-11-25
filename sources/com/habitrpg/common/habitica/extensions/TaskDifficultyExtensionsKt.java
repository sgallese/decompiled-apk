package com.habitrpg.common.habitica.extensions;

import com.habitrpg.common.habitica.R;
import com.habitrpg.shared.habitica.models.tasks.TaskDifficulty;
import kotlin.NoWhenBranchMatchedException;
import qc.q;

/* compiled from: TaskDifficultyExtensions.kt */
/* loaded from: classes4.dex */
public final class TaskDifficultyExtensionsKt {

    /* compiled from: TaskDifficultyExtensions.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskDifficulty.values().length];
            try {
                iArr[TaskDifficulty.TRIVIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskDifficulty.EASY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskDifficulty.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskDifficulty.HARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getNameRes(TaskDifficulty taskDifficulty) {
        q.i(taskDifficulty, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[taskDifficulty.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return R.string.hard;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return R.string.medium;
            }
            return R.string.easy;
        }
        return R.string.trivial;
    }

    public static final int getNameSentenceRes(TaskDifficulty taskDifficulty) {
        q.i(taskDifficulty, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[taskDifficulty.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return R.string.hard_sentence;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return R.string.medium_sentence;
            }
            return R.string.easy_sentence;
        }
        return R.string.trivial_sentence;
    }
}
