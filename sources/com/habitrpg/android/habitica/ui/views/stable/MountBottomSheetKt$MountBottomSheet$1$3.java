package com.habitrpg.android.habitica.ui.views.stable;

import com.habitrpg.android.habitica.models.inventory.Mount;
import dc.w;
import pc.a;
import pc.l;
import qc.r;

/* compiled from: MountBottomSheet.kt */
/* loaded from: classes4.dex */
final class MountBottomSheetKt$MountBottomSheet$1$3 extends r implements a<w> {
    final /* synthetic */ Mount $mount;
    final /* synthetic */ a<w> $onDismiss;
    final /* synthetic */ l<String, w> $onEquip;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MountBottomSheetKt$MountBottomSheet$1$3(l<? super String, w> lVar, Mount mount, a<w> aVar) {
        super(0);
        this.$onEquip = lVar;
        this.$mount = mount;
        this.$onDismiss = aVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l<String, w> lVar = this.$onEquip;
        if (lVar != null) {
            lVar.invoke(this.$mount.getKey());
        }
        this.$onDismiss.invoke();
    }
}
