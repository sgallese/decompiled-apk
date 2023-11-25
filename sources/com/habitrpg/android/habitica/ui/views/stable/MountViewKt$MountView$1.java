package com.habitrpg.android.habitica.ui.views.stable;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.models.inventory.Mount;
import dc.w;
import j0.l;
import j0.z1;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MountView.kt */
/* loaded from: classes4.dex */
public final class MountViewKt$MountView$1 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Mount $mount;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MountViewKt$MountView$1(Mount mount, e eVar, int i10, int i11) {
        super(2);
        this.$mount = mount;
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
        MountViewKt.MountView(this.$mount, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
