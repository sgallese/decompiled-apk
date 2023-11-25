package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class SubscriptionBenefitsBinding implements a {
    public final LinearLayout benefitArmoireWrapper;
    public final LinearLayout benefitFaintWrapper;
    public final LinearLayout benefitGemsForGoldWrapper;
    public final LinearLayout benefitHourglassesWrapper;
    private final View rootView;
    public final PixelArtView subBenefitsMysteryItemIcon;
    public final TextView subBenefitsMysteryItemText;

    private SubscriptionBenefitsBinding(View view, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, PixelArtView pixelArtView, TextView textView) {
        this.rootView = view;
        this.benefitArmoireWrapper = linearLayout;
        this.benefitFaintWrapper = linearLayout2;
        this.benefitGemsForGoldWrapper = linearLayout3;
        this.benefitHourglassesWrapper = linearLayout4;
        this.subBenefitsMysteryItemIcon = pixelArtView;
        this.subBenefitsMysteryItemText = textView;
    }

    public static SubscriptionBenefitsBinding bind(View view) {
        int i10 = R.id.benefit_armoire_wrapper;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.benefit_armoire_wrapper);
        if (linearLayout != null) {
            i10 = R.id.benefit_faint_wrapper;
            LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.benefit_faint_wrapper);
            if (linearLayout2 != null) {
                i10 = R.id.benefit_gems_for_gold_wrapper;
                LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.benefit_gems_for_gold_wrapper);
                if (linearLayout3 != null) {
                    i10 = R.id.benefit_hourglasses_wrapper;
                    LinearLayout linearLayout4 = (LinearLayout) b.a(view, R.id.benefit_hourglasses_wrapper);
                    if (linearLayout4 != null) {
                        i10 = R.id.sub_benefits_mystery_item_icon;
                        PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.sub_benefits_mystery_item_icon);
                        if (pixelArtView != null) {
                            i10 = R.id.sub_benefits_mystery_item_text;
                            TextView textView = (TextView) b.a(view, R.id.sub_benefits_mystery_item_text);
                            if (textView != null) {
                                return new SubscriptionBenefitsBinding(view, linearLayout, linearLayout2, linearLayout3, linearLayout4, pixelArtView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SubscriptionBenefitsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.subscription_benefits, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // e4.a
    public View getRoot() {
        return this.rootView;
    }
}
