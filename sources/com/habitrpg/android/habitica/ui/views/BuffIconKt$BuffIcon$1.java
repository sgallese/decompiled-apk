package com.habitrpg.android.habitica.ui.views;

import dc.w;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuffIcon.kt */
/* loaded from: classes4.dex */
public final class BuffIconKt$BuffIcon$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Boolean $buffed;
    final /* synthetic */ androidx.compose.ui.e $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuffIconKt$BuffIcon$1(Boolean bool, androidx.compose.ui.e eVar, int i10, int i11) {
        super(2);
        this.$buffed = bool;
        this.$modifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        BuffIconKt.BuffIcon(this.$buffed, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
