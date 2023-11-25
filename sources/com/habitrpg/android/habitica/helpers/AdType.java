package com.habitrpg.android.habitica.helpers;

import java.util.Date;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdHandler.kt */
/* loaded from: classes4.dex */
public final class AdType {
    private static final /* synthetic */ jc.a $ENTRIES;
    private static final /* synthetic */ AdType[] $VALUES;
    public static final AdType ARMOIRE = new AdType("ARMOIRE", 0);
    public static final AdType SPELL = new AdType("SPELL", 1);
    public static final AdType FAINT = new AdType("FAINT", 2);

    /* compiled from: AdHandler.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdType.values().length];
            try {
                iArr[AdType.ARMOIRE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdType.SPELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdType.FAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AdType[] $values() {
        return new AdType[]{ARMOIRE, SPELL, FAINT};
    }

    static {
        AdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = jc.b.a($values);
    }

    private AdType(String str, int i10) {
    }

    public static jc.a<AdType> getEntries() {
        return $ENTRIES;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) $VALUES.clone();
    }

    public final String getAdUnitID() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return "ca-app-pub-5911973472413421/1738504765";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "ca-app-pub-5911973472413421/9392092486";
    }

    public final Date getCooldownTime() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] == 2) {
            return new Date(new Date().getTime() + zc.a.q(zc.c.o(1, zc.d.HOURS)));
        }
        return null;
    }
}
