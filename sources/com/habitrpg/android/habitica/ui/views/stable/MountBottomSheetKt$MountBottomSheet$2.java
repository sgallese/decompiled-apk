package com.habitrpg.android.habitica.ui.views.stable;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.models.inventory.Mount;
import dc.w;
import j0.l;
import j0.z1;
import pc.a;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MountBottomSheet.kt */
/* loaded from: classes4.dex */
public final class MountBottomSheetKt$MountBottomSheet$2 extends r implements p<l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isCurrentMount;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Mount $mount;
    final /* synthetic */ a<w> $onDismiss;
    final /* synthetic */ pc.l<String, w> $onEquip;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MountBottomSheetKt$MountBottomSheet$2(Mount mount, boolean z10, pc.l<? super String, w> lVar, a<w> aVar, e eVar, int i10, int i11) {
        super(2);
        this.$mount = mount;
        this.$isCurrentMount = z10;
        this.$onEquip = lVar;
        this.$onDismiss = aVar;
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
        MountBottomSheetKt.MountBottomSheet(this.$mount, this.$isCurrentMount, this.$onEquip, this.$onDismiss, this.$modifier, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
