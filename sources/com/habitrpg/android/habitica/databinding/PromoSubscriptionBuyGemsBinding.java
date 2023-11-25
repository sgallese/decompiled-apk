package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class PromoSubscriptionBuyGemsBinding implements a {
    public final Button button;
    public final LinearLayout contentWrapper;
    private final View rootView;

    private PromoSubscriptionBuyGemsBinding(View view, Button button, LinearLayout linearLayout) {
        this.rootView = view;
        this.button = button;
        this.contentWrapper = linearLayout;
    }

    public static PromoSubscriptionBuyGemsBinding bind(View view) {
        int i10 = R.id.button;
        Button button = (Button) b.a(view, R.id.button);
        if (button != null) {
            i10 = R.id.contentWrapper;
            LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.contentWrapper);
            if (linearLayout != null) {
                return new PromoSubscriptionBuyGemsBinding(view, button, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static PromoSubscriptionBuyGemsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.promo_subscription_buy_gems, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
