package com.habitrpg.android.habitica.helpers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Analytics.kt */
/* loaded from: classes4.dex */
public final class AnalyticsTarget {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ AnalyticsTarget[] $VALUES;
    public static final AnalyticsTarget AMPLITUDE = new AnalyticsTarget("AMPLITUDE", 0);
    public static final AnalyticsTarget FIREBASE = new AnalyticsTarget("FIREBASE", 1);

    private static final /* synthetic */ AnalyticsTarget[] $values() {
        return new AnalyticsTarget[]{AMPLITUDE, FIREBASE};
    }

    static {
        AnalyticsTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private AnalyticsTarget(String str, int i10) {
    }

    public static jc.a<AnalyticsTarget> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsTarget valueOf(String str) {
        return (AnalyticsTarget) Enum.valueOf(AnalyticsTarget.class, str);
    }

    public static AnalyticsTarget[] values() {
        return (AnalyticsTarget[]) $VALUES.clone();
    }
}
