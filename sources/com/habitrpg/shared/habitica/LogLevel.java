package com.habitrpg.shared.habitica;

import jc.a;
import jc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Logger.kt */
/* loaded from: classes4.dex */
public final class LogLevel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel ERROR = new LogLevel("ERROR", 0);
    public static final LogLevel INFO = new LogLevel("INFO", 1);
    public static final LogLevel WARNING = new LogLevel("WARNING", 2);
    public static final LogLevel DEBUG = new LogLevel("DEBUG", 3);

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{ERROR, INFO, WARNING, DEBUG};
    }

    static {
        LogLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LogLevel(String str, int i10) {
    }

    public static a<LogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
