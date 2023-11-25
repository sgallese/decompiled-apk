package com.habitrpg.android.habitica.ui.fragments.inventory.equipment;

import dc.w;
import qc.r;

/* compiled from: EquipmentDetailFragment.kt */
/* loaded from: classes4.dex */
final class EquipmentDetailFragment$onViewCreated$2 extends r implements pc.a<w> {
    final /* synthetic */ EquipmentDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentDetailFragment$onViewCreated$2(EquipmentDetailFragment equipmentDetailFragment) {
        super(0);
        this.this$0 = equipmentDetailFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.onRefresh();
    }
}
