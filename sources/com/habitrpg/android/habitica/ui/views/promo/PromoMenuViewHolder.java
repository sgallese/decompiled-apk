package com.habitrpg.android.habitica.ui.views.promo;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import qc.q;

/* compiled from: PromoMenuViewHolder.kt */
/* loaded from: classes4.dex */
public final class PromoMenuViewHolder extends RecyclerView.f0 {
    public static final int $stable = 8;
    private final PromoMenuView promoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoMenuViewHolder(PromoMenuView promoMenuView) {
        super(promoMenuView);
        q.i(promoMenuView, "promoView");
        this.promoView = promoMenuView;
    }

    public final void bind(HabiticaPromotion habiticaPromotion) {
        q.i(habiticaPromotion, NavigationDrawerFragment.SIDEBAR_PROMO);
        habiticaPromotion.configurePromoMenuView(this.promoView);
    }

    public final PromoMenuView getPromoView() {
        return this.promoView;
    }
}
