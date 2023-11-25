package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;

/* compiled from: NavigationDrawerFragment.kt */
/* loaded from: classes4.dex */
final class NavigationDrawerFragment$updatePromo$1$2 extends qc.r implements pc.a<Boolean> {
    final /* synthetic */ HabiticaPromotion $activePromo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerFragment$updatePromo$1$2(HabiticaPromotion habiticaPromotion) {
        super(0);
        this.$activePromo = habiticaPromotion;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.$activePromo.isActive());
    }
}
