package com.habitrpg.android.habitica.models.promotions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentGemPurchaseBinding;
import com.habitrpg.android.habitica.databinding.FragmentPromoInfoBinding;
import com.habitrpg.android.habitica.databinding.FragmentSubscriptionBinding;
import com.habitrpg.android.habitica.databinding.PurchaseGemViewBinding;
import com.habitrpg.android.habitica.extensions.DateUtils;
import com.habitrpg.android.habitica.models.promotions.SpookyExtraGemsHabiticaPromotion;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment;
import com.habitrpg.android.habitica.ui.views.promo.PromoMenuView;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import qc.q;

/* compiled from: SpookyExtraGemsHabiticaPromotion.kt */
/* loaded from: classes4.dex */
public final class SpookyExtraGemsHabiticaPromotion extends HabiticaPromotion {
    public static final int $stable = 8;
    private final Date endDate;
    private final Date startDate;

    public SpookyExtraGemsHabiticaPromotion(Date date, Date date2) {
        this.startDate = date == null ? DateUtils.Companion.createDate(2020, 9, 29) : date;
        this.endDate = date2 == null ? DateUtils.Companion.createDate(2020, 10, 2) : date2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureInfoFragment$lambda$1(View view) {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.gemPurchaseActivity, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurePromoMenuView$lambda$0(SpookyExtraGemsHabiticaPromotion spookyExtraGemsHabiticaPromotion, Context context, View view) {
        q.i(spookyExtraGemsHabiticaPromotion, "this$0");
        q.f(context);
        spookyExtraGemsHabiticaPromotion.menuOnNavigation(context);
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public int backgroundColor(Context context) {
        q.i(context, "context");
        return a.c(context, R.color.gray_10);
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Drawable buttonDrawable(Context context) {
        q.i(context, "context");
        Drawable e10 = a.e(context, R.drawable.spooky_promo_button_bg);
        if (e10 == null) {
            return new ShapeDrawable();
        }
        return e10;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    @SuppressLint({"SetTextI18n"})
    public void configureGemView(PurchaseGemViewBinding purchaseGemViewBinding, int i10) {
        q.i(purchaseGemViewBinding, "binding");
        Context context = purchaseGemViewBinding.getRoot().getContext();
        LinearLayout root = purchaseGemViewBinding.getRoot();
        q.f(context);
        root.setBackground(promoBackgroundDrawable(context));
        purchaseGemViewBinding.purchaseButton.setBackground(buttonDrawable(context));
        purchaseGemViewBinding.purchaseButton.setTextColor(a.c(context, R.color.white));
        purchaseGemViewBinding.gemAmount.setTextColor(Color.parseColor("#FEE2B6"));
        purchaseGemViewBinding.gemLabel.setTextColor(Color.parseColor("#FEE2B6"));
        purchaseGemViewBinding.footerTextView.setVisibility(0);
        purchaseGemViewBinding.footerTextView.setText(context.getString(R.string.usually_x_gems, Integer.valueOf(i10)));
        if (i10 != 4) {
            if (i10 != 21) {
                if (i10 != 42) {
                    if (i10 != 84) {
                        String.valueOf(i10);
                        return;
                    }
                    purchaseGemViewBinding.gemAmount.setText("125");
                    purchaseGemViewBinding.gemImage.setImageResource(R.drawable.spooky_gems_84);
                    return;
                }
                purchaseGemViewBinding.gemAmount.setText("60");
                purchaseGemViewBinding.gemImage.setImageResource(R.drawable.spooky_gems_42);
                return;
            }
            purchaseGemViewBinding.gemAmount.setText("30");
            purchaseGemViewBinding.gemImage.setImageResource(R.drawable.spooky_gems_21);
            return;
        }
        purchaseGemViewBinding.gemAmount.setText("5");
        purchaseGemViewBinding.gemImage.setImageResource(R.drawable.spooky_gems_4);
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configureInfoFragment(PromoInfoFragment promoInfoFragment) {
        RelativeLayout relativeLayout;
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
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        q.i(promoInfoFragment, "fragment");
        Context context = promoInfoFragment.getContext();
        if (context == null) {
            return;
        }
        FragmentPromoInfoBinding binding = promoInfoFragment.getBinding();
        TextView textView12 = null;
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
            imageView3.setImageDrawable(a.e(context, R.drawable.spooky_promo_info_left));
        }
        FragmentPromoInfoBinding binding3 = promoInfoFragment.getBinding();
        if (binding3 != null && (imageView2 = binding3.promoBannerRightImage) != null) {
            imageView2.setImageDrawable(a.e(context, R.drawable.spooky_promo_info_right));
        }
        FragmentPromoInfoBinding binding4 = promoInfoFragment.getBinding();
        if (binding4 != null && (imageView = binding4.promoBannerTitleImage) != null) {
            imageView.setImageDrawable(a.e(context, R.drawable.spooky_promo_title));
        }
        FragmentPromoInfoBinding binding5 = promoInfoFragment.getBinding();
        if (binding5 != null && (textView11 = binding5.promoBannerSubtitleView) != null) {
            textView11.setText(R.string.limited_event);
        }
        FragmentPromoInfoBinding binding6 = promoInfoFragment.getBinding();
        if (binding6 != null && (textView10 = binding6.promoBannerDurationView) != null) {
            textView10.setTextColor(a.c(context, R.color.white));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d", Locale.getDefault());
        FragmentPromoInfoBinding binding7 = promoInfoFragment.getBinding();
        if (binding7 != null) {
            textView = binding7.promoBannerDurationView;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(context.getString(R.string.x_to_y, simpleDateFormat.format(getStartDate()), simpleDateFormat.format(getEndDate())));
        }
        FragmentPromoInfoBinding binding8 = promoInfoFragment.getBinding();
        if (binding8 != null && (textView9 = binding8.promoBannerDurationView) != null) {
            textView9.setTextColor(a.c(context, R.color.white));
        }
        FragmentPromoInfoBinding binding9 = promoInfoFragment.getBinding();
        if (binding9 != null && (textView8 = binding9.promptText) != null) {
            textView8.setText(R.string.spooky_promo_info_prompt);
        }
        FragmentPromoInfoBinding binding10 = promoInfoFragment.getBinding();
        if (binding10 != null && (textView7 = binding10.promptText) != null) {
            textView7.setTextColor(a.c(context, R.color.orange_50));
        }
        FragmentPromoInfoBinding binding11 = promoInfoFragment.getBinding();
        if (binding11 != null) {
            textView2 = binding11.promptButton;
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            textView2.setBackground(buttonDrawable(context));
        }
        FragmentPromoInfoBinding binding12 = promoInfoFragment.getBinding();
        if (binding12 != null && (textView6 = binding12.promptButton) != null) {
            textView6.setText(R.string.view_gem_bundles);
        }
        FragmentPromoInfoBinding binding13 = promoInfoFragment.getBinding();
        if (binding13 != null && (textView5 = binding13.promptButton) != null) {
            textView5.setTextColor(a.c(context, R.color.white));
        }
        FragmentPromoInfoBinding binding14 = promoInfoFragment.getBinding();
        if (binding14 != null && (textView4 = binding14.promptButton) != null) {
            textView4.setOnClickListener(new View.OnClickListener() { // from class: ka.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SpookyExtraGemsHabiticaPromotion.configureInfoFragment$lambda$1(view);
                }
            });
        }
        FragmentPromoInfoBinding binding15 = promoInfoFragment.getBinding();
        if (binding15 != null) {
            textView3 = binding15.instructionDescriptionView;
        } else {
            textView3 = null;
        }
        if (textView3 != null) {
            textView3.setText(context.getString(R.string.spooky_promo_info_instructions, simpleDateFormat.format(getStartDate()), simpleDateFormat.format(getEndDate())));
        }
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        DateFormat timeInstance = DateFormat.getTimeInstance(1);
        timeInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        FragmentPromoInfoBinding binding16 = promoInfoFragment.getBinding();
        if (binding16 != null) {
            textView12 = binding16.limitationsDescriptionView;
        }
        if (textView12 != null) {
            textView12.setText(context.getString(R.string.gems_promo_info_limitations_fixed, dateTimeInstance.format(getStartDate()), timeInstance.format(getStartDate()), dateTimeInstance.format(getEndDate()), timeInstance.format(getEndDate())));
        }
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePromoMenuView(PromoMenuView promoMenuView) {
        q.i(promoMenuView, "view");
        final Context context = promoMenuView.getContext();
        q.f(context);
        promoMenuView.setBackgroundColor(backgroundColor(context));
        promoMenuView.setTitleImage(a.e(context, R.drawable.spooky_promo_title));
        promoMenuView.setTitleText(null);
        promoMenuView.setSubtitleImage(a.e(context, R.drawable.spooky_promo_menu_description));
        promoMenuView.setSubtitleText(null);
        promoMenuView.setDecoration(a.e(context, R.drawable.spooky_promo_menu_left), a.e(context, R.drawable.spooky_promo_menu_right));
        promoMenuView.getBinding().button.setBackgroundTintList(a.d(context, R.color.gray_1));
        promoMenuView.getBinding().button.setText(R.string.learn_more);
        promoMenuView.getBinding().button.setTextColor(a.c(context, R.color.white));
        promoMenuView.getBinding().button.setOnClickListener(new View.OnClickListener() { // from class: ka.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpookyExtraGemsHabiticaPromotion.configurePromoMenuView$lambda$0(SpookyExtraGemsHabiticaPromotion.this, context, view);
            }
        });
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePurchaseBanner(FragmentSubscriptionBinding fragmentSubscriptionBinding) {
        q.i(fragmentSubscriptionBinding, "binding");
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Date getEndDate() {
        return this.endDate;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public String getIdentifier() {
        return "spooky_extra_gems";
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public PromoType getPromoType() {
        return PromoType.GEMS_AMOUNT;
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
        Drawable e10 = a.e(context, R.drawable.spooky_promo_pill_bg);
        if (e10 == null) {
            return new ShapeDrawable();
        }
        return e10;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Drawable promoBackgroundDrawable(Context context) {
        q.i(context, "context");
        Drawable e10 = a.e(context, R.drawable.layout_rounded_bg_gray_10);
        if (e10 == null) {
            return new ShapeDrawable();
        }
        return e10;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePurchaseBanner(FragmentGemPurchaseBinding fragmentGemPurchaseBinding) {
        q.i(fragmentGemPurchaseBinding, "binding");
        Context context = fragmentGemPurchaseBinding.getRoot().getContext();
        fragmentGemPurchaseBinding.promoBanner.setVisibility(0);
        RelativeLayout relativeLayout = fragmentGemPurchaseBinding.promoBanner;
        q.f(context);
        relativeLayout.setBackground(promoBackgroundDrawable(context));
        fragmentGemPurchaseBinding.promoBannerLeftImage.setImageDrawable(a.e(context, R.drawable.spooky_promo_banner_left));
        fragmentGemPurchaseBinding.promoBannerRightImage.setImageDrawable(a.e(context, R.drawable.spooky_promo_banner_right));
        fragmentGemPurchaseBinding.promoBannerTitleImage.setImageDrawable(a.e(context, R.drawable.spooky_promo_title));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d", Locale.getDefault());
        fragmentGemPurchaseBinding.promoBannerDurationView.setText(context.getString(R.string.x_to_y, simpleDateFormat.format(getStartDate()), simpleDateFormat.format(getEndDate())));
        fragmentGemPurchaseBinding.promoBannerDurationView.setTextColor(a.c(context, R.color.white));
    }
}
