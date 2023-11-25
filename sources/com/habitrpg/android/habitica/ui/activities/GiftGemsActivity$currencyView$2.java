package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.views.CurrencyView;

/* compiled from: GiftGemsActivity.kt */
/* loaded from: classes4.dex */
final class GiftGemsActivity$currencyView$2 extends qc.r implements pc.a<CurrencyView> {
    final /* synthetic */ GiftGemsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGemsActivity$currencyView$2(GiftGemsActivity giftGemsActivity) {
        super(0);
        this.this$0 = giftGemsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final CurrencyView invoke() {
        return new CurrencyView(this.this$0, NavigationDrawerFragment.SIDEBAR_GEMS, true);
    }
}
