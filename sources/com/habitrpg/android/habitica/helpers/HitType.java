package com.habitrpg.android.habitica.helpers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Analytics.kt */
/* loaded from: classes4.dex */
public final class HitType {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ HitType[] $VALUES;
    private final String key;
    public static final HitType EVENT = new HitType("EVENT", 0, "event");
    public static final HitType PAGEVIEW = new HitType("PAGEVIEW", 1, "pageview");
    public static final HitType CREATE_WIDGET = new HitType("CREATE_WIDGET", 2, "create");
    public static final HitType REMOVE_WIDGET = new HitType("REMOVE_WIDGET", 3, "remove");
    public static final HitType UPDATE_WIDGET = new HitType("UPDATE_WIDGET", 4, "update");

    private static final /* synthetic */ HitType[] $values() {
        return new HitType[]{EVENT, PAGEVIEW, CREATE_WIDGET, REMOVE_WIDGET, UPDATE_WIDGET};
    }

    static {
        HitType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private HitType(String str, int i10, String str2) {
        this.key = str2;
    }

    public static jc.a<HitType> getEntries() {
        return $ENTRIES;
    }

    public static HitType valueOf(String str) {
        return (HitType) Enum.valueOf(HitType.class, str);
    }

    public static HitType[] values() {
        return (HitType[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
