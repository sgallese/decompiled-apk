package com.habitrpg.shared.habitica.models.tasks;

import jc.a;
import jc.b;
import qc.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaskDifficulty.kt */
/* loaded from: classes4.dex */
public final class TaskDifficulty {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskDifficulty[] $VALUES;
    public static final Companion Companion;
    private final float value;
    public static final TaskDifficulty TRIVIAL = new TaskDifficulty("TRIVIAL", 0, 0.1f);
    public static final TaskDifficulty EASY = new TaskDifficulty("EASY", 1, 1.0f);
    public static final TaskDifficulty MEDIUM = new TaskDifficulty("MEDIUM", 2, 1.5f);
    public static final TaskDifficulty HARD = new TaskDifficulty("HARD", 3, 2.0f);

    /* compiled from: TaskDifficulty.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final TaskDifficulty valueOf(float f10) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13 = true;
            if (f10 == 0.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return TaskDifficulty.TRIVIAL;
            }
            if (f10 == 1.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return TaskDifficulty.EASY;
            }
            if (f10 == 1.5f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return TaskDifficulty.MEDIUM;
            }
            if (f10 != 2.0f) {
                z13 = false;
            }
            if (z13) {
                return TaskDifficulty.HARD;
            }
            return TaskDifficulty.MEDIUM;
        }
    }

    private static final /* synthetic */ TaskDifficulty[] $values() {
        return new TaskDifficulty[]{TRIVIAL, EASY, MEDIUM, HARD};
    }

    static {
        TaskDifficulty[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new Companion(null);
    }

    private TaskDifficulty(String str, int i10, float f10) {
        this.value = f10;
    }

    public static a<TaskDifficulty> getEntries() {
        return $ENTRIES;
    }

    public static TaskDifficulty valueOf(String str) {
        return (TaskDifficulty) Enum.valueOf(TaskDifficulty.class, str);
    }

    public static TaskDifficulty[] values() {
        return (TaskDifficulty[]) $VALUES.clone();
    }

    public final float getValue() {
        return this.value;
    }
}
