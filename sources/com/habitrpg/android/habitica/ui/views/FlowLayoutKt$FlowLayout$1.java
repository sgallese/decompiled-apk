package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlowLayout.kt */
/* loaded from: classes4.dex */
public final class FlowLayoutKt$FlowLayout$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<j0.l, Integer, w> $content;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ int $spacing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowLayoutKt$FlowLayout$1(androidx.compose.ui.e eVar, int i10, p<? super j0.l, ? super Integer, w> pVar, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$spacing = i10;
        this.$content = pVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        FlowLayoutKt.FlowLayout(this.$modifier, this.$spacing, this.$content, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
