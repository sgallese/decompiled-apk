package com.habitrpg.android.habitica.ui.activities;

import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
public final class BirthdayActivityKt$BirthdayActivityView$3 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Date $endDate;
    final /* synthetic */ boolean $hasEquipped;
    final /* synthetic */ boolean $hasGryphatrice;
    final /* synthetic */ boolean $isPurchasing;
    final /* synthetic */ pc.a<dc.w> $onEquipClick;
    final /* synthetic */ pc.a<dc.w> $onGemPurchaseClick;
    final /* synthetic */ pc.a<dc.w> $onPurchaseClick;
    final /* synthetic */ String $price;
    final /* synthetic */ f0.g1 $scaffoldState;
    final /* synthetic */ Date $startDate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivityKt$BirthdayActivityView$3(f0.g1 g1Var, boolean z10, boolean z11, boolean z12, String str, Date date, Date date2, pc.a<dc.w> aVar, pc.a<dc.w> aVar2, pc.a<dc.w> aVar3, int i10) {
        super(2);
        this.$scaffoldState = g1Var;
        this.$isPurchasing = z10;
        this.$hasGryphatrice = z11;
        this.$hasEquipped = z12;
        this.$price = str;
        this.$startDate = date;
        this.$endDate = date2;
        this.$onPurchaseClick = aVar;
        this.$onGemPurchaseClick = aVar2;
        this.$onEquipClick = aVar3;
        this.$$changed = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        BirthdayActivityKt.BirthdayActivityView(this.$scaffoldState, this.$isPurchasing, this.$hasGryphatrice, this.$hasEquipped, this.$price, this.$startDate, this.$endDate, this.$onPurchaseClick, this.$onGemPurchaseClick, this.$onEquipClick, lVar, j0.z1.a(this.$$changed | 1));
    }
}
