package com.habitrpg.android.habitica.models.promotions;

import jc.a;
import jc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HabiticaPromotion.kt */
/* loaded from: classes4.dex */
public final class PromoType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PromoType[] $VALUES;
    public static final PromoType GEMS_AMOUNT = new PromoType("GEMS_AMOUNT", 0);
    public static final PromoType GEMS_PRICE = new PromoType("GEMS_PRICE", 1);
    public static final PromoType SUBSCRIPTION = new PromoType("SUBSCRIPTION", 2);
    public static final PromoType SURVEY = new PromoType("SURVEY", 3);

    private static final /* synthetic */ PromoType[] $values() {
        return new PromoType[]{GEMS_AMOUNT, GEMS_PRICE, SUBSCRIPTION, SURVEY};
    }

    static {
        PromoType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PromoType(String str, int i10) {
    }

    public static a<PromoType> getEntries() {
        return $ENTRIES;
    }

    public static PromoType valueOf(String str) {
        return (PromoType) Enum.valueOf(PromoType.class, str);
    }

    public static PromoType[] values() {
        return (PromoType[]) $VALUES.clone();
    }
}
