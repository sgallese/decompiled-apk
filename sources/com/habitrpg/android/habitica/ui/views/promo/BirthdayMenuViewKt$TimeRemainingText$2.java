package com.habitrpg.android.habitica.ui.views.promo;

import a2.c0;
import dc.w;
import j0.l;
import j0.z1;
import java.util.Date;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayMenuView.kt */
/* loaded from: classes4.dex */
public final class BirthdayMenuViewKt$TimeRemainingText$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ Date $endDate;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ c0 $fontWeight;
    final /* synthetic */ int $formatString;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayMenuViewKt$TimeRemainingText$2(Date date, int i10, long j10, long j11, c0 c0Var, int i11) {
        super(2);
        this.$endDate = date;
        this.$formatString = i10;
        this.$color = j10;
        this.$fontSize = j11;
        this.$fontWeight = c0Var;
        this.$$changed = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        BirthdayMenuViewKt.m173TimeRemainingTextmhOCef0(this.$endDate, this.$formatString, this.$color, this.$fontSize, this.$fontWeight, lVar, z1.a(this.$$changed | 1));
    }
}
