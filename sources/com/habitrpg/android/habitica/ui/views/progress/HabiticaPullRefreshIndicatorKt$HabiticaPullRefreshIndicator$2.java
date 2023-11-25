package com.habitrpg.android.habitica.ui.views.progress;

import androidx.compose.ui.e;
import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HabiticaPullRefreshIndicator.kt */
/* loaded from: classes4.dex */
public final class HabiticaPullRefreshIndicatorKt$HabiticaPullRefreshIndicator$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ boolean $isInitial;
    final /* synthetic */ boolean $isRefreshing;
    final /* synthetic */ e $modifier;
    final /* synthetic */ boolean $scale;
    final /* synthetic */ g0.e $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabiticaPullRefreshIndicatorKt$HabiticaPullRefreshIndicator$2(boolean z10, boolean z11, g0.e eVar, e eVar2, long j10, boolean z12, int i10, int i11) {
        super(2);
        this.$isInitial = z10;
        this.$isRefreshing = z11;
        this.$state = eVar;
        this.$modifier = eVar2;
        this.$backgroundColor = j10;
        this.$scale = z12;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        HabiticaPullRefreshIndicatorKt.m172HabiticaPullRefreshIndicatorFHprtrg(this.$isInitial, this.$isRefreshing, this.$state, this.$modifier, this.$backgroundColor, this.$scale, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
