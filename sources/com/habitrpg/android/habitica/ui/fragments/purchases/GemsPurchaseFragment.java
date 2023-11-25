package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.a1;
import ad.l0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.w;
import com.android.billingclient.api.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentGemPurchaseBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.helpers.PurchaseTypes;
import com.habitrpg.android.habitica.models.WorldStateEvent;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.models.promotions.PromoType;
import com.habitrpg.android.habitica.ui.GemPurchaseOptionsView;
import com.habitrpg.android.habitica.ui.fragments.PromoInfoFragment;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.util.Date;

/* compiled from: GemsPurchaseFragment.kt */
/* loaded from: classes4.dex */
public final class GemsPurchaseFragment extends Hilt_GemsPurchaseFragment<FragmentGemPurchaseBinding> {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private FragmentGemPurchaseBinding binding;
    private boolean isGemSaleHappening;
    public PurchaseHandler purchaseHandler;
    public UserRepository userRepository;

    private final void loadInventory() {
        ad.g.d(l0.a(a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GemsPurchaseFragment$loadInventory$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(GemsPurchaseFragment gemsPurchaseFragment, View view) {
        GemPurchaseOptionsView gemPurchaseOptionsView;
        qc.q.i(gemsPurchaseFragment, "this$0");
        FragmentGemPurchaseBinding binding = gemsPurchaseFragment.getBinding();
        if (binding != null) {
            gemPurchaseOptionsView = binding.gems4View;
        } else {
            gemPurchaseOptionsView = null;
        }
        gemsPurchaseFragment.purchaseGems(gemPurchaseOptionsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(GemsPurchaseFragment gemsPurchaseFragment, View view) {
        GemPurchaseOptionsView gemPurchaseOptionsView;
        qc.q.i(gemsPurchaseFragment, "this$0");
        FragmentGemPurchaseBinding binding = gemsPurchaseFragment.getBinding();
        if (binding != null) {
            gemPurchaseOptionsView = binding.gems21View;
        } else {
            gemPurchaseOptionsView = null;
        }
        gemsPurchaseFragment.purchaseGems(gemPurchaseOptionsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(GemsPurchaseFragment gemsPurchaseFragment, View view) {
        GemPurchaseOptionsView gemPurchaseOptionsView;
        qc.q.i(gemsPurchaseFragment, "this$0");
        FragmentGemPurchaseBinding binding = gemsPurchaseFragment.getBinding();
        if (binding != null) {
            gemPurchaseOptionsView = binding.gems42View;
        } else {
            gemPurchaseOptionsView = null;
        }
        gemsPurchaseFragment.purchaseGems(gemPurchaseOptionsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(GemsPurchaseFragment gemsPurchaseFragment, View view) {
        GemPurchaseOptionsView gemPurchaseOptionsView;
        qc.q.i(gemsPurchaseFragment, "this$0");
        FragmentGemPurchaseBinding binding = gemsPurchaseFragment.getBinding();
        if (binding != null) {
            gemPurchaseOptionsView = binding.gems84View;
        } else {
            gemPurchaseOptionsView = null;
        }
        gemsPurchaseFragment.purchaseGems(gemPurchaseOptionsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(GemsPurchaseFragment gemsPurchaseFragment, View view) {
        qc.q.i(gemsPurchaseFragment, "this$0");
        gemsPurchaseFragment.showGiftGemsDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(GemsPurchaseFragment gemsPurchaseFragment, View view) {
        qc.q.i(gemsPurchaseFragment, "this$0");
        gemsPurchaseFragment.getParentFragmentManager().q().s(R.id.fragment_container, new PromoInfoFragment()).j();
    }

    private final void purchaseGems(GemPurchaseOptionsView gemPurchaseOptionsView) {
        com.android.billingclient.api.e sku;
        androidx.fragment.app.q activity;
        if (gemPurchaseOptionsView != null && (sku = gemPurchaseOptionsView.getSku()) != null && (activity = getActivity()) != null) {
            getPurchaseHandler().purchase(activity, sku, null, null, this.isGemSaleHappening);
        }
    }

    private final void showGiftGemsDialog() {
        View view;
        LayoutInflater layoutInflater;
        androidx.fragment.app.q activity = getActivity();
        if (activity != null && (layoutInflater = activity.getLayoutInflater()) != null) {
            view = layoutInflater.inflate(R.layout.dialog_choose_message_recipient, (ViewGroup) null);
        } else {
            view = null;
        }
        androidx.fragment.app.q activity2 = getActivity();
        if (activity2 != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(activity2);
            habiticaAlertDialog.setTitle(getString(R.string.gift_title));
            String string = getString(R.string.action_continue);
            qc.q.h(string, "getString(...)");
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (pc.p) new GemsPurchaseFragment$showGiftGemsDialog$1$1(view, activity2, this), 12, (Object) null);
            AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, new GemsPurchaseFragment$showGiftGemsDialog$1$2(activity2), 1, null);
            habiticaAlertDialog.setAdditionalContentView(view);
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonLabel(com.android.billingclient.api.e eVar) {
        String str;
        String b10 = eVar.b();
        GemPurchaseOptionsView gemPurchaseOptionsView = null;
        switch (b10.hashCode()) {
            case -709112814:
                if (b10.equals(PurchaseTypes.Purchase4Gems)) {
                    FragmentGemPurchaseBinding binding = getBinding();
                    if (binding != null) {
                        gemPurchaseOptionsView = binding.gems4View;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case -614737367:
                if (b10.equals(PurchaseTypes.Purchase21Gems)) {
                    FragmentGemPurchaseBinding binding2 = getBinding();
                    if (binding2 != null) {
                        gemPurchaseOptionsView = binding2.gems21View;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case -556555544:
                if (b10.equals(PurchaseTypes.Purchase42Gems)) {
                    FragmentGemPurchaseBinding binding3 = getBinding();
                    if (binding3 != null) {
                        gemPurchaseOptionsView = binding3.gems42View;
                        break;
                    }
                } else {
                    return;
                }
                break;
            case -440191898:
                if (b10.equals(PurchaseTypes.Purchase84Gems)) {
                    FragmentGemPurchaseBinding binding4 = getBinding();
                    if (binding4 != null) {
                        gemPurchaseOptionsView = binding4.gems84View;
                        break;
                    }
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        if (gemPurchaseOptionsView != null) {
            e.a a10 = eVar.a();
            if (a10 == null || (str = a10.a()) == null) {
                str = "";
            }
            gemPurchaseOptionsView.setPurchaseButtonText(str);
            gemPurchaseOptionsView.setSku(eVar);
        }
    }

    public final AppConfigManager getAppConfigManager() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("appConfigManager");
        return null;
    }

    public final PurchaseHandler getPurchaseHandler() {
        PurchaseHandler purchaseHandler = this.purchaseHandler;
        if (purchaseHandler != null) {
            return purchaseHandler;
        }
        qc.q.z("purchaseHandler");
        return null;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new GemsPurchaseFragment$onResume$1(this, null), 1, null);
        loadInventory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        RelativeLayout relativeLayout;
        Date date;
        ComposeView composeView;
        RelativeLayout relativeLayout2;
        FragmentGemPurchaseBinding binding;
        ImageView imageView;
        Button button;
        GemPurchaseOptionsView gemPurchaseOptionsView;
        GemPurchaseOptionsView gemPurchaseOptionsView2;
        GemPurchaseOptionsView gemPurchaseOptionsView3;
        GemPurchaseOptionsView gemPurchaseOptionsView4;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentGemPurchaseBinding binding2 = getBinding();
        if (binding2 != null && (gemPurchaseOptionsView4 = binding2.gems4View) != null) {
            gemPurchaseOptionsView4.setOnPurchaseClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GemsPurchaseFragment.onViewCreated$lambda$0(GemsPurchaseFragment.this, view2);
                }
            });
        }
        FragmentGemPurchaseBinding binding3 = getBinding();
        if (binding3 != null && (gemPurchaseOptionsView3 = binding3.gems21View) != null) {
            gemPurchaseOptionsView3.setOnPurchaseClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GemsPurchaseFragment.onViewCreated$lambda$1(GemsPurchaseFragment.this, view2);
                }
            });
        }
        FragmentGemPurchaseBinding binding4 = getBinding();
        if (binding4 != null && (gemPurchaseOptionsView2 = binding4.gems42View) != null) {
            gemPurchaseOptionsView2.setOnPurchaseClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GemsPurchaseFragment.onViewCreated$lambda$2(GemsPurchaseFragment.this, view2);
                }
            });
        }
        FragmentGemPurchaseBinding binding5 = getBinding();
        if (binding5 != null && (gemPurchaseOptionsView = binding5.gems84View) != null) {
            gemPurchaseOptionsView.setOnPurchaseClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GemsPurchaseFragment.onViewCreated$lambda$3(GemsPurchaseFragment.this, view2);
                }
            });
        }
        FragmentGemPurchaseBinding binding6 = getBinding();
        if (binding6 != null && (button = binding6.giftGemsButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GemsPurchaseFragment.onViewCreated$lambda$4(GemsPurchaseFragment.this, view2);
                }
            });
        }
        Context context = getContext();
        if (context != null && ContextExtensionsKt.isUsingNightModeResources(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (binding = getBinding()) != null && (imageView = binding.headerImageView) != null) {
            imageView.setImageResource(R.drawable.gem_purchase_header_dark);
        }
        HabiticaPromotion activePromo = getAppConfigManager().activePromo();
        ComposeView composeView2 = null;
        if (activePromo != null) {
            FragmentGemPurchaseBinding binding7 = getBinding();
            if (binding7 != null) {
                this.isGemSaleHappening = true;
                activePromo.configurePurchaseBanner(binding7);
                if (activePromo.getPromoType() != PromoType.SUBSCRIPTION) {
                    activePromo.configureGemView(binding7.gems4View.getBinding(), 4);
                    activePromo.configureGemView(binding7.gems21View.getBinding(), 21);
                    activePromo.configureGemView(binding7.gems42View.getBinding(), 42);
                    activePromo.configureGemView(binding7.gems84View.getBinding(), 84);
                }
            }
            FragmentGemPurchaseBinding binding8 = getBinding();
            if (binding8 != null && (relativeLayout2 = binding8.promoBanner) != null) {
                relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        GemsPurchaseFragment.onViewCreated$lambda$6(GemsPurchaseFragment.this, view2);
                    }
                });
            }
        } else {
            FragmentGemPurchaseBinding binding9 = getBinding();
            if (binding9 != null) {
                relativeLayout = binding9.promoBanner;
            } else {
                relativeLayout = null;
            }
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
        }
        WorldStateEvent birthdayEvent = getAppConfigManager().getBirthdayEvent();
        if (birthdayEvent != null) {
            date = birthdayEvent.getEnd();
        } else {
            date = null;
        }
        if (date != null) {
            FragmentGemPurchaseBinding binding10 = getBinding();
            if (binding10 != null && (composeView = binding10.promoComposeView) != null) {
                composeView.setContent(q0.c.c(-716128658, true, new GemsPurchaseFragment$onViewCreated$8(date)));
            }
            FragmentGemPurchaseBinding binding11 = getBinding();
            if (binding11 != null) {
                composeView2 = binding11.promoComposeView;
            }
            if (composeView2 != null) {
                composeView2.setVisibility(0);
            }
        }
        Analytics.INSTANCE.sendNavigationEvent("gem screen");
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setPurchaseHandler(PurchaseHandler purchaseHandler) {
        qc.q.i(purchaseHandler, "<set-?>");
        this.purchaseHandler = purchaseHandler;
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentGemPurchaseBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentGemPurchaseBinding inflate = FragmentGemPurchaseBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentGemPurchaseBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentGemPurchaseBinding fragmentGemPurchaseBinding) {
        this.binding = fragmentGemPurchaseBinding;
    }
}
