package com.habitrpg.shared.habitica.models.responses;

import jc.a;
import jc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaskDirection.kt */
/* loaded from: classes4.dex */
public final class TaskDirection {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskDirection[] $VALUES;
    private final String text;
    public static final TaskDirection UP = new TaskDirection("UP", 0, "up");
    public static final TaskDirection DOWN = new TaskDirection("DOWN", 1, "down");

    private static final /* synthetic */ TaskDirection[] $values() {
        return new TaskDirection[]{UP, DOWN};
    }

    static {
        TaskDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TaskDirection(String str, int i10, String str2) {
        this.text = str2;
    }

    public static a<TaskDirection> getEntries() {
        return $ENTRIES;
    }

    public static TaskDirection valueOf(String str) {
        return (TaskDirection) Enum.valueOf(TaskDirection.class, str);
    }

    public static TaskDirection[] values() {
        return (TaskDirection[]) $VALUES.clone();
    }

    public final String getText() {
        return this.text;
    }
}
