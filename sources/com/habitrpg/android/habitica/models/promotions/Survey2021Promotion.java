package com.habitrpg.android.habitica.models.promotions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.core.content.a;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentGemPurchaseBinding;
import com.habitrpg.android.habitica.databinding.FragmentSubscriptionBinding;
import com.habitrpg.android.habitica.databinding.PurchaseGemViewBinding;
import com.habitrpg.android.habitica.models.promotions.Survey2021Promotion;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment;
import com.habitrpg.android.habitica.ui.fragments.PromoWebFragmentArgs;
import com.habitrpg.android.habitica.ui.views.promo.PromoMenuView;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import java.util.Date;
import qc.q;

/* compiled from: Survey2021Promotion.kt */
/* loaded from: classes4.dex */
public final class Survey2021Promotion extends HabiticaPromotion implements HabiticaWebPromotion {
    public static final int $stable = 8;
    private String url;
    private final Date startDate = new Date();
    private final Date endDate = new Date();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configurePromoMenuView$lambda$0(Survey2021Promotion survey2021Promotion, Context context, View view) {
        q.i(survey2021Promotion, "this$0");
        q.f(context);
        survey2021Promotion.menuOnNavigation(context);
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public int backgroundColor(Context context) {
        q.i(context, "context");
        return a.c(context, R.color.blue_1);
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
    public void configureInfoFragment(PromoInfoFragment promoInfoFragment) {
        q.i(promoInfoFragment, "fragment");
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePromoMenuView(PromoMenuView promoMenuView) {
        q.i(promoMenuView, "view");
        final Context context = promoMenuView.getContext();
        promoMenuView.setCanClose(true);
        promoMenuView.getBinding().closeButton.setColorFilter(a.c(context, R.color.blue_100));
        promoMenuView.setBackgroundColor(a.c(context, R.color.blue_1));
        promoMenuView.setTitleText(context.getString(R.string.survey_title));
        promoMenuView.setSubtitleText(context.getString(R.string.survey_menu_description));
        promoMenuView.setDecoration(a.e(context, R.drawable.survey_art_left), a.e(context, R.drawable.survey_art_right));
        promoMenuView.getBinding().button.setBackgroundTintList(a.d(context, R.color.white));
        promoMenuView.getBinding().button.setText(R.string.go_to_survey);
        promoMenuView.getBinding().button.setTextColor(a.c(context, R.color.blue_10));
        promoMenuView.getBinding().button.setOnClickListener(new View.OnClickListener() { // from class: ka.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Survey2021Promotion.configurePromoMenuView$lambda$0(Survey2021Promotion.this, context, view);
            }
        });
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePurchaseBanner(FragmentGemPurchaseBinding fragmentGemPurchaseBinding) {
        q.i(fragmentGemPurchaseBinding, "binding");
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Date getEndDate() {
        return this.endDate;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public String getIdentifier() {
        return "survey2021";
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public PromoType getPromoType() {
        return PromoType.SURVEY;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public Date getStartDate() {
        return this.startDate;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaWebPromotion
    public String getUrl() {
        return this.url;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void menuOnNavigation(Context context) {
        q.i(context, "context");
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        String url = getUrl();
        if (url == null) {
            url = "";
        }
        mainNavigationController.navigate(R.id.promoWebFragment, new PromoWebFragmentArgs.Builder(url).build().toBundle());
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

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaWebPromotion
    public void setUrl(String str) {
        this.url = str;
    }

    @Override // com.habitrpg.android.habitica.models.promotions.HabiticaPromotion
    public void configurePurchaseBanner(FragmentSubscriptionBinding fragmentSubscriptionBinding) {
        q.i(fragmentSubscriptionBinding, "binding");
    }
}
