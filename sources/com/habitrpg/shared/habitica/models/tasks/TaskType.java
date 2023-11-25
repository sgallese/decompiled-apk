package com.habitrpg.shared.habitica.models.tasks;

import jc.a;
import jc.b;
import qc.h;
import qc.q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaskType.kt */
/* loaded from: classes4.dex */
public final class TaskType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskType[] $VALUES;
    public static final Companion Companion;
    private final String value;
    public static final TaskType HABIT = new TaskType("HABIT", 0, "habit");
    public static final TaskType DAILY = new TaskType("DAILY", 1, "daily");
    public static final TaskType TODO = new TaskType("TODO", 2, "todo");
    public static final TaskType REWARD = new TaskType("REWARD", 3, "reward");

    /* compiled from: TaskType.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final TaskType from(String str) {
            for (TaskType taskType : TaskType.values()) {
                if (q.d(taskType.getValue(), str)) {
                    return taskType;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ TaskType[] $values() {
        return new TaskType[]{HABIT, DAILY, TODO, REWARD};
    }

    static {
        TaskType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new Companion(null);
    }

    private TaskType(String str, int i10, String str2) {
        this.value = str2;
    }

    public static a<TaskType> getEntries() {
        return $ENTRIES;
    }

    public static TaskType valueOf(String str) {
        return (TaskType) Enum.valueOf(TaskType.class, str);
    }

    public static TaskType[] values() {
        return (TaskType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
