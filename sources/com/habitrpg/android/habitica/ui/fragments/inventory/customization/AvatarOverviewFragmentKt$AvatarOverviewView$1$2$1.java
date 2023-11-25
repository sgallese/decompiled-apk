package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import dc.w;
import qc.r;

/* compiled from: AvatarOverviewFragment.kt */
/* loaded from: classes4.dex */
final class AvatarOverviewFragmentKt$AvatarOverviewView$1$2$1 extends r implements pc.l<Boolean, w> {
    final /* synthetic */ MainUserViewModel $userViewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarOverviewFragmentKt$AvatarOverviewView$1$2$1(MainUserViewModel mainUserViewModel) {
        super(1);
        this.$userViewModel = mainUserViewModel;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return w.f13270a;
    }

    public final void invoke(boolean z10) {
        this.$userViewModel.updateUser("preferences.autoEquip", Boolean.valueOf(z10));
    }
}
