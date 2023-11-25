package com.habitrpg.common.habitica.helpers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppTestingLevel.kt */
/* loaded from: classes4.dex */
public final class AppTestingLevel {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ AppTestingLevel[] $VALUES;
    public static final AppTestingLevel STAFF = new AppTestingLevel("STAFF", 0);
    public static final AppTestingLevel PARTNERS = new AppTestingLevel("PARTNERS", 1);
    public static final AppTestingLevel ALPHA = new AppTestingLevel("ALPHA", 2);
    public static final AppTestingLevel BETA = new AppTestingLevel("BETA", 3);
    public static final AppTestingLevel PRODUCTION = new AppTestingLevel("PRODUCTION", 4);

    private static final /* synthetic */ AppTestingLevel[] $values() {
        return new AppTestingLevel[]{STAFF, PARTNERS, ALPHA, BETA, PRODUCTION};
    }

    static {
        AppTestingLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private AppTestingLevel(String str, int i10) {
    }

    public static jc.a<AppTestingLevel> getEntries() {
        return $ENTRIES;
    }

    public static AppTestingLevel valueOf(String str) {
        return (AppTestingLevel) Enum.valueOf(AppTestingLevel.class, str);
    }

    public static AppTestingLevel[] values() {
        return (AppTestingLevel[]) $VALUES.clone();
    }
}
