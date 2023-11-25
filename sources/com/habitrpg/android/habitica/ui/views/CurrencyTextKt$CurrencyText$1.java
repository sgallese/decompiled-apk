package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CurrencyText.kt */
/* loaded from: classes4.dex */
public final class CurrencyTextKt$CurrencyText$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $animated;
    final /* synthetic */ String $currency;
    final /* synthetic */ int $decimals;
    final /* synthetic */ long $fontSize;
    final /* synthetic */ int $minForAbbreviation;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ int $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyTextKt$CurrencyText$1(String str, int i10, androidx.compose.ui.e eVar, long j10, int i11, int i12, boolean z10, int i13, int i14) {
        super(2);
        this.$currency = str;
        this.$value = i10;
        this.$modifier = eVar;
        this.$fontSize = j10;
        this.$decimals = i11;
        this.$minForAbbreviation = i12;
        this.$animated = z10;
        this.$$changed = i13;
        this.$$default = i14;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        CurrencyTextKt.m162CurrencyTextWlsLnLQ(this.$currency, this.$value, this.$modifier, this.$fontSize, this.$decimals, this.$minForAbbreviation, this.$animated, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
