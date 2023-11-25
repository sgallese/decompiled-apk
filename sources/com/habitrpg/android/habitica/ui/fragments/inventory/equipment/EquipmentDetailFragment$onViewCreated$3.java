package com.habitrpg.android.habitica.ui.fragments.inventory.equipment;

import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import qc.r;

/* compiled from: EquipmentDetailFragment.kt */
/* loaded from: classes4.dex */
final class EquipmentDetailFragment$onViewCreated$3 extends r implements pc.a<w> {
    public static final EquipmentDetailFragment$onViewCreated$3 INSTANCE = new EquipmentDetailFragment$onViewCreated$3();

    EquipmentDetailFragment$onViewCreated$3() {
        super(0);
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.marketFragment, null, 2, null);
    }
}
