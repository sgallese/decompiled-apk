package com.habitrpg.android.habitica.ui.fragments.purchases;

import android.os.Bundle;
import android.view.View;
import com.habitrpg.android.habitica.R;

/* compiled from: EventOutcomeSubscriptionBottomSheetFragment.kt */
/* loaded from: classes4.dex */
public final class EventOutcomeSubscriptionBottomSheetFragment extends SubscriptionBottomSheetFragment {
    public static final String EVENT_ARMOIRE_OPENED = "armoire_opened";
    public static final String EVENT_DEATH_SCREEN = "death_screen";
    public static final String EVENT_GEMS_FOR_GOLD = "gems_for_gold";
    public static final String EVENT_HOURGLASS_SHOP_OPENED = "hourglass_shop_opened";
    public static final String TAG = "EventOutcomeSubscriptionBottomSheet";
    private String eventType = "";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EventOutcomeSubscriptionBottomSheetFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    private final void setArmoireEventSubscriptionViews() {
        getBinding().subscriberBenefitBanner.setVisibility(8);
        getBinding().subscribeBenefits.setText(getString(R.string.subscribe_second_armoire_open_text));
        getBinding().subscriberBenefits.hideArmoireBenefit();
    }

    private final void setDeathScreenEventSubscriptionViews() {
        getBinding().subscriberBenefitBanner.setVisibility(8);
        getBinding().subscribeBenefits.setText(getString(R.string.subscribe_second_chance_incentive_text));
        getBinding().subscriberBenefits.hideDeathBenefit();
    }

    private final void setGemsForGoldEventSubscriptionViews() {
        getBinding().subscribeBenefits.setText(getString(R.string.subscribe_gems_for_gold_incentive_text));
        getBinding().subscriberBenefits.hideGemsForGoldBenefit();
        getBinding().subscription3month.setVisibility(8);
    }

    private final void setHourglassShopEventSubscriptionViews() {
        getBinding().subscriberBenefitBanner.setVisibility(8);
        getBinding().subscribeBenefits.setText(getString(R.string.subscribe_hourglass_incentive_text));
        getBinding().subscriberBenefits.hideMysticHourglassBenefit();
        getBinding().subscription1month.setVisibility(8);
    }

    public final String getEventType() {
        return this.eventType;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        String str = this.eventType;
        switch (str.hashCode()) {
            case 491077783:
                if (str.equals(EVENT_DEATH_SCREEN)) {
                    setDeathScreenEventSubscriptionViews();
                    return;
                }
                return;
            case 986874751:
                if (str.equals(EVENT_ARMOIRE_OPENED)) {
                    setArmoireEventSubscriptionViews();
                    return;
                }
                return;
            case 1125137649:
                if (str.equals(EVENT_GEMS_FOR_GOLD)) {
                    setGemsForGoldEventSubscriptionViews();
                    return;
                }
                return;
            case 2005525547:
                if (str.equals(EVENT_HOURGLASS_SHOP_OPENED)) {
                    setHourglassShopEventSubscriptionViews();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void setEventType(String str) {
        qc.q.i(str, "<set-?>");
        this.eventType = str;
    }
}
