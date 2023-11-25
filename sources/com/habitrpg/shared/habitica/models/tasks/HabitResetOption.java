package com.habitrpg.shared.habitica.models.tasks;

import jc.a;
import jc.b;
import qc.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HabitResetOption.kt */
/* loaded from: classes4.dex */
public final class HabitResetOption {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HabitResetOption[] $VALUES;
    public static final Companion Companion;
    private final Frequency value;
    public static final HabitResetOption DAILY = new HabitResetOption("DAILY", 0, Frequency.DAILY);
    public static final HabitResetOption WEEKLY = new HabitResetOption("WEEKLY", 1, Frequency.WEEKLY);
    public static final HabitResetOption MONTHLY = new HabitResetOption("MONTHLY", 2, Frequency.MONTHLY);

    /* compiled from: HabitResetOption.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final HabitResetOption from(Frequency frequency) {
            boolean z10;
            for (HabitResetOption habitResetOption : HabitResetOption.values()) {
                if (habitResetOption.getValue() == frequency) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return habitResetOption;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ HabitResetOption[] $values() {
        return new HabitResetOption[]{DAILY, WEEKLY, MONTHLY};
    }

    static {
        HabitResetOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new Companion(null);
    }

    private HabitResetOption(String str, int i10, Frequency frequency) {
        this.value = frequency;
    }

    public static a<HabitResetOption> getEntries() {
        return $ENTRIES;
    }

    public static HabitResetOption valueOf(String str) {
        return (HabitResetOption) Enum.valueOf(HabitResetOption.class, str);
    }

    public static HabitResetOption[] values() {
        return (HabitResetOption[]) $VALUES.clone();
    }

    public final Frequency getValue() {
        return this.value;
    }
}
