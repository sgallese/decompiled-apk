package com.habitrpg.android.habitica.models.promotions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.habitrpg.android.habitica.databinding.FragmentGemPurchaseBinding;
import com.habitrpg.android.habitica.databinding.FragmentSubscriptionBinding;
import com.habitrpg.android.habitica.databinding.PurchaseGemViewBinding;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment;
import com.habitrpg.android.habitica.ui.views.promo.PromoMenuView;
import java.util.Date;

/* compiled from: HabiticaPromotion.kt */
/* loaded from: classes4.dex */
public abstract class HabiticaPromotion {
    public static final int $stable = 0;

    public abstract int backgroundColor(Context context);

    public abstract Drawable buttonDrawable(Context context);

    public abstract void configureGemView(PurchaseGemViewBinding purchaseGemViewBinding, int i10);

    public abstract void configureInfoFragment(PromoInfoFragment promoInfoFragment);

    public abstract void configurePromoMenuView(PromoMenuView promoMenuView);

    public abstract void configurePurchaseBanner(FragmentGemPurchaseBinding fragmentGemPurchaseBinding);

    public abstract void configurePurchaseBanner(FragmentSubscriptionBinding fragmentSubscriptionBinding);

    public abstract Date getEndDate();

    public abstract String getIdentifier();

    public abstract PromoType getPromoType();

    public abstract Date getStartDate();

    public final boolean isActive() {
        Date date = new Date();
        if (getStartDate().before(date) && getEndDate().after(date)) {
            return true;
        }
        return false;
    }

    public abstract void menuOnNavigation(Context context);

    public abstract Drawable pillBackgroundDrawable(Context context);

    public abstract Drawable promoBackgroundDrawable(Context context);
}
