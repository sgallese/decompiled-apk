package com.habitrpg.android.habitica.helpers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Analytics.kt */
/* loaded from: classes4.dex */
public final class EventCategory {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ EventCategory[] $VALUES;
    public static final EventCategory BEHAVIOUR = new EventCategory("BEHAVIOUR", 0, "behaviour");
    public static final EventCategory NAVIGATION = new EventCategory("NAVIGATION", 1, "navigation");
    private final String key;

    private static final /* synthetic */ EventCategory[] $values() {
        return new EventCategory[]{BEHAVIOUR, NAVIGATION};
    }

    static {
        EventCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private EventCategory(String str, int i10, String str2) {
        this.key = str2;
    }

    public static jc.a<EventCategory> getEntries() {
        return $ENTRIES;
    }

    public static EventCategory valueOf(String str) {
        return (EventCategory) Enum.valueOf(EventCategory.class, str);
    }

    public static EventCategory[] values() {
        return (EventCategory[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
