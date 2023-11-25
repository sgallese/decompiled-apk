package com.habitrpg.android.habitica.models.promotions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentGemPurchaseBinding;
import com.habitrpg.android.habitica.databinding.FragmentPromoInfoBinding;
import com.habitrpg.android.habitica.databinding.FragmentSubscriptionBinding;
import com.habitrpg.android.habitica.databinding.PurchaseGemViewBinding;
import com.habitrpg.android.habitica.extensions.DateUtils;
import com.habitrpg.android.habitica.models.promotions.GiftOneGetOneHabiticaPromotion;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment;
import com.habitrpg.android.habitica.ui.views.promo.PromoMenuView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import qc.q;

/* compiled from: GiftOneGetOneHabiticaPromotion.kt */
/* loaded from: classes4.dex */
public final class GiftOneGetOneHabiticaPromotion extends HabiticaPromotion {
    public static final int $stable = 8;
    private final Date endDate;
    private final Date startDate;

    public GiftOneGetOneHabiticaPromotion(Date date, Date date2) {
        this.startDate = date == null ? DateUtils.Companion.createDate(2020, 11, 17) : date;
        this.endDate = date2 == null ? DateUtils.Companion.createDate(2021, 0, 7) : date2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureInfoFragment$lambda$2(PromoInfoFragment promoInfoFragment, View view) {
        q.i(promoInfoFragment, "$fragment");
        Context context = promoInfoFragment.getContext();
        if (context != null) {
            SubscriptionFragment.Companion.showGiftSubscriptionDialog(context, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurePromoMenuView$lambda$0(GiftOneGetOneHabiticaPromotion giftOneGetOneHabiticaPromotion, Context context, View view) {
        q.i(giftOneGetOneHabiticaPromotion, "this$0");
        q.f(context);
        giftOneGetOneHabiticaPromotion.menuOnNavigation(context);
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public int backgroundColor(Context context) {
        q.i(context, "context");
        return a.c(context, R.color.gray_10);
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Drawable buttonDrawable(Context context) {
        q.i(context, "context");
        Drawable e10 = a.e(context, R.drawable.layout_rounded_bg_content);
        if (e10 == null) {
            return new ShapeDrawable();
        }
        return e10;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configureGemView(PurchaseGemViewBinding purchaseGemViewBinding, int i10) {
        q.i(purchaseGemViewBinding, "binding");
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configureInfoFragment(final PromoInfoFragment promoInfoFragment) {
        RelativeLayout relativeLayout;
        ImageView imageView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ImageView imageView2;
        ImageView imageView3;
        q.i(promoInfoFragment, "fragment");
        Context context = promoInfoFragment.getContext();
        if (context == null) {
            return;
        }
        FragmentPromoInfoBinding binding = promoInfoFragment.getBinding();
        TextView textView13 = null;
        if (binding != null) {
            relativeLayout = binding.promoBanner;
        } else {
            relativeLayout = null;
        }
        if (relativeLayout != null) {
            relativeLayout.setBackground(promoBackgroundDrawable(context));
        }
        FragmentPromoInfoBinding binding2 = promoInfoFragment.getBinding();
        if (binding2 != null && (imageView3 = binding2.promoBannerLeftImage) != null) {
            imageView3.setImageDrawable(a.e(context, R.drawable.g1g1_promo_left));
        }
        FragmentPromoInfoBinding binding3 = promoInfoFragment.getBinding();
        if (binding3 != null && (imageView2 = binding3.promoBannerRightImage) != null) {
            imageView2.setImageDrawable(a.e(context, R.drawable.g1g1_promo_right));
        }
        FragmentPromoInfoBinding binding4 = promoInfoFragment.getBinding();
        if (binding4 != null) {
            imageView = binding4.promoBannerTitleImage;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        FragmentPromoInfoBinding binding5 = promoInfoFragment.getBinding();
        if (binding5 != null) {
            textView = binding5.promoBannerTitleText;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        FragmentPromoInfoBinding binding6 = promoInfoFragment.getBinding();
        if (binding6 != null) {
            textView2 = binding6.promoBannerTitleText;
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            textView2.setText(context.getString(R.string.gift_one_get_one));
        }
        FragmentPromoInfoBinding binding7 = promoInfoFragment.getBinding();
        if (binding7 != null && (textView12 = binding7.promoBannerSubtitleView) != null) {
            textView12.setText(R.string.limited_event);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d", Locale.getDefault());
        FragmentPromoInfoBinding binding8 = promoInfoFragment.getBinding();
        if (binding8 != null) {
            textView3 = binding8.promoBannerDurationView;
        } else {
            textView3 = null;
        }
        if (textView3 != null) {
            textView3.setText(context.getString(R.string.x_to_y, simpleDateFormat.format(getStartDate()), simpleDateFormat.format(getEndDate())));
        }
        FragmentPromoInfoBinding binding9 = promoInfoFragment.getBinding();
        if (binding9 != null && (textView11 = binding9.promoBannerDurationView) != null) {
            textView11.setTextColor(a.c(context, R.color.white));
        }
        FragmentPromoInfoBinding binding10 = promoInfoFragment.getBinding();
        if (binding10 != null && (textView10 = binding10.promptText) != null) {
            textView10.setText(R.string.g1g1_promo_info_prompt);
        }
        FragmentPromoInfoBinding binding11 = promoInfoFragment.getBinding();
        if (binding11 != null && (textView9 = binding11.promptText) != null) {
            textView9.setTextColor(a.c(context, R.color.text_teal));
        }
        FragmentPromoInfoBinding binding12 = promoInfoFragment.getBinding();
        if (binding12 != null) {
            textView4 = binding12.promptButton;
        } else {
            textView4 = null;
        }
        if (textView4 != null) {
            textView4.setBackground(a.e(context, R.drawable.layout_rounded_bg_brand_400));
        }
        FragmentPromoInfoBinding binding13 = promoInfoFragment.getBinding();
        if (binding13 != null && (textView8 = binding13.promptButton) != null) {
            textView8.setText(R.string.gift_a_subscription);
        }
        FragmentPromoInfoBinding binding14 = promoInfoFragment.getBinding();
        if (binding14 != null && (textView7 = binding14.promptButton) != null) {
            textView7.setTextColor(a.c(context, R.color.white));
        }
        FragmentPromoInfoBinding binding15 = promoInfoFragment.getBinding();
        if (binding15 != null && (textView6 = binding15.promptButton) != null) {
            textView6.setOnClickListener(new View.OnClickListener() { // from class: ka.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GiftOneGetOneHabiticaPromotion.configureInfoFragment$lambda$2(PromoInfoFragment.this, view);
                }
            });
        }
        FragmentPromoInfoBinding binding16 = promoInfoFragment.getBinding();
        if (binding16 != null) {
            textView5 = binding16.instructionDescriptionView;
        } else {
            textView5 = null;
        }
        if (textView5 != null) {
            textView5.setText(context.getString(R.string.g1g1_promo_info_instructions));
        }
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(1, 1);
        DateFormat timeInstance = DateFormat.getTimeInstance(1);
        timeInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        FragmentPromoInfoBinding binding17 = promoInfoFragment.getBinding();
        if (binding17 != null) {
            textView13 = binding17.limitationsDescriptionView;
        }
        if (textView13 != null) {
            textView13.setText(context.getString(R.string.g1g1_promo_info_limitations_fixed, dateTimeInstance.format(getStartDate()), timeInstance.format(getStartDate()), dateTimeInstance.format(getEndDate()), timeInstance.format(getStartDate())));
        }
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePromoMenuView(PromoMenuView promoMenuView) {
        q.i(promoMenuView, "view");
        final Context context = promoMenuView.getContext();
        promoMenuView.setBackground(a.e(context, R.drawable.g1g1_menu_background));
        promoMenuView.setTitleText(context.getString(R.string.promo_g1g1_prompt));
        promoMenuView.setSubtitleText(context.getString(R.string.promo_g1g1_description));
        promoMenuView.setDecoration(a.e(context, R.drawable.g1g1_promo_menu_left), a.e(context, R.drawable.g1g1_promo_menu_right));
        promoMenuView.getBinding().button.setBackgroundTintList(a.d(context, R.color.content_background));
        promoMenuView.getBinding().button.setText(R.string.learn_more);
        q.f(context);
        if (ContextExtensionsKt.isUsingNightModeResources(context)) {
            promoMenuView.getBinding().button.setTextColor(a.c(context, R.color.teal_100));
        } else {
            promoMenuView.getBinding().button.setTextColor(a.c(context, R.color.teal_10));
        }
        promoMenuView.getBinding().button.setOnClickListener(new View.OnClickListener() { // from class: ka.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftOneGetOneHabiticaPromotion.configurePromoMenuView$lambda$0(GiftOneGetOneHabiticaPromotion.this, context, view);
            }
        });
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePurchaseBanner(FragmentGemPurchaseBinding fragmentGemPurchaseBinding) {
        q.i(fragmentGemPurchaseBinding, "binding");
        Context context = fragmentGemPurchaseBinding.getRoot().getContext();
        fragmentGemPurchaseBinding.promoBanner.setVisibility(0);
        RelativeLayout relativeLayout = fragmentGemPurchaseBinding.promoBanner;
        q.f(context);
        relativeLayout.setBackground(promoBackgroundDrawable(context));
        fragmentGemPurchaseBinding.promoBannerLeftImage.setImageDrawable(a.e(context, R.drawable.g1g1_promo_left_small));
        fragmentGemPurchaseBinding.promoBannerRightImage.setImageDrawable(a.e(context, R.drawable.g1g1_promo_right_small));
        fragmentGemPurchaseBinding.promoBannerTitleImage.setVisibility(8);
        fragmentGemPurchaseBinding.promoBannerDurationView.setVisibility(8);
        fragmentGemPurchaseBinding.promoBannerTitleText.setVisibility(0);
        fragmentGemPurchaseBinding.promoBannerTitleText.setText(context.getString(R.string.gift_one_get_one_purchase_banner, new SimpleDateFormat("MMM d", Locale.getDefault()).format(getEndDate())));
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Date getEndDate() {
        return this.endDate;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public String getIdentifier() {
        return "g1g1";
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public PromoType getPromoType() {
        return PromoType.SUBSCRIPTION;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Date getStartDate() {
        return this.startDate;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void menuOnNavigation(Context context) {
        q.i(context, "context");
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.promoInfoFragment, null, 2, null);
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Drawable pillBackgroundDrawable(Context context) {
        q.i(context, "context");
        Drawable e10 = a.e(context, R.drawable.g1g1_promo_pill_bg);
        if (e10 == null) {
            return new ShapeDrawable();
        }
        return e10;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Drawable promoBackgroundDrawable(Context context) {
        q.i(context, "context");
        Drawable e10 = a.e(context, R.drawable.g1g1_promo_background);
        if (e10 == null) {
            return new ShapeDrawable();
        }
        return e10;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePurchaseBanner(FragmentSubscriptionBinding fragmentSubscriptionBinding) {
        q.i(fragmentSubscriptionBinding, "binding");
        Context context = fragmentSubscriptionBinding.getRoot().getContext();
        fragmentSubscriptionBinding.promoBanner.setVisibility(0);
        RelativeLayout relativeLayout = fragmentSubscriptionBinding.promoBanner;
        q.f(context);
        relativeLayout.setBackground(promoBackgroundDrawable(context));
        fragmentSubscriptionBinding.promoBannerLeftImage.setImageDrawable(a.e(context, R.drawable.g1g1_promo_left_small));
        fragmentSubscriptionBinding.promoBannerRightImage.setImageDrawable(a.e(context, R.drawable.g1g1_promo_right_small));
        fragmentSubscriptionBinding.promoBannerTitleImage.setVisibility(8);
        fragmentSubscriptionBinding.promoBannerDurationView.setVisibility(8);
        fragmentSubscriptionBinding.promoBannerTitleText.setVisibility(0);
        fragmentSubscriptionBinding.promoBannerTitleText.setText(context.getString(R.string.gift_one_get_one_purchase_banner, new SimpleDateFormat("MMM d", Locale.getDefault()).format(getEndDate())));
    }
}
