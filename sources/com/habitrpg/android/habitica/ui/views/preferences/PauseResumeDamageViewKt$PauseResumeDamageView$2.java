package com.habitrpg.android.habitica.ui.views.preferences;

import androidx.compose.ui.e;
import dc.w;
import j0.l;
import j0.z1;
import pc.a;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PauseResumeDamageView.kt */
/* loaded from: classes4.dex */
public final class PauseResumeDamageViewKt$PauseResumeDamageView$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isPaused;
    final /* synthetic */ e $modifier;
    final /* synthetic */ a<w> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PauseResumeDamageViewKt$PauseResumeDamageView$2(boolean z10, a<w> aVar, e eVar, int i10, int i11) {
        super(2);
        this.$isPaused = z10;
        this.$onClick = aVar;
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
        PauseResumeDamageViewKt.PauseResumeDamageView(this.$isPaused, this.$onClick, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
