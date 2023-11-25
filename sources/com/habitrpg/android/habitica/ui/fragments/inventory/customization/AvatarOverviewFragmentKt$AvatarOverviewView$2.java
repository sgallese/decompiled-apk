package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import dc.w;
import j0.z1;
import pc.p;
import pc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AvatarOverviewFragment.kt */
/* loaded from: classes4.dex */
public final class AvatarOverviewFragmentKt$AvatarOverviewView$2 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $battleGearTwoHanded;
    final /* synthetic */ boolean $costumeTwoHanded;
    final /* synthetic */ p<String, String, w> $onAvatarEquipmentTap;
    final /* synthetic */ p<String, String, w> $onCustomizationTap;
    final /* synthetic */ q<String, String, Boolean, w> $onEquipmentTap;
    final /* synthetic */ boolean $showCustomization;
    final /* synthetic */ boolean $showEquipment;
    final /* synthetic */ MainUserViewModel $userViewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AvatarOverviewFragmentKt$AvatarOverviewView$2(MainUserViewModel mainUserViewModel, boolean z10, boolean z11, boolean z12, boolean z13, p<? super String, ? super String, w> pVar, p<? super String, ? super String, w> pVar2, q<? super String, ? super String, ? super Boolean, w> qVar, int i10, int i11) {
        super(2);
        this.$userViewModel = mainUserViewModel;
        this.$showCustomization = z10;
        this.$showEquipment = z11;
        this.$battleGearTwoHanded = z12;
        this.$costumeTwoHanded = z13;
        this.$onCustomizationTap = pVar;
        this.$onAvatarEquipmentTap = pVar2;
        this.$onEquipmentTap = qVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        AvatarOverviewFragmentKt.AvatarOverviewView(this.$userViewModel, this.$showCustomization, this.$showEquipment, this.$battleGearTwoHanded, this.$costumeTwoHanded, this.$onCustomizationTap, this.$onAvatarEquipmentTap, this.$onEquipmentTap, lVar, z1.a(this.$$changed | 1), this.$$default);
    }
}
