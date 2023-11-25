package com.habitrpg.android.habitica.ui.views.promo;

import androidx.compose.ui.e;
import dc.w;
import j0.l;
import j0.z1;
import java.util.Date;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayMenuView.kt */
/* loaded from: classes4.dex */
public final class BirthdayMenuViewKt$BirthdayBanner$3 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Date $endDate;
    final /* synthetic */ e $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayMenuViewKt$BirthdayBanner$3(Date date, e eVar, int i10, int i11) {
        super(2);
        this.$endDate = date;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        BirthdayMenuViewKt.BirthdayBanner(this.$endDate, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
