package com.habitrpg.shared.habitica.models.tasks;

import jc.a;
import jc.b;
import qc.h;
import qc.q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Frequency.kt */
/* loaded from: classes4.dex */
public final class Frequency {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Frequency[] $VALUES;
    public static final Companion Companion;
    private final String value;
    public static final Frequency WEEKLY = new Frequency("WEEKLY", 0, "weekly");
    public static final Frequency DAILY = new Frequency("DAILY", 1, "daily");
    public static final Frequency MONTHLY = new Frequency("MONTHLY", 2, "monthly");
    public static final Frequency YEARLY = new Frequency("YEARLY", 3, "yearly");

    /* compiled from: Frequency.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final Frequency from(String str) {
            for (Frequency frequency : Frequency.values()) {
                if (q.d(frequency.getValue(), str)) {
                    return frequency;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ Frequency[] $values() {
        return new Frequency[]{WEEKLY, DAILY, MONTHLY, YEARLY};
    }

    static {
        Frequency[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new Companion(null);
    }

    private Frequency(String str, int i10, String str2) {
        this.value = str2;
    }

    public static a<Frequency> getEntries() {
        return $ENTRIES;
    }

    public static Frequency valueOf(String str) {
        return (Frequency) Enum.valueOf(Frequency.class, str);
    }

    public static Frequency[] values() {
        return (Frequency[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
