package com.habitrpg.android.habitica.ui.views.shops;

import ad.a1;
import ad.k0;
import ad.l0;
import ad.x1;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.core.os.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.DialogPurchaseGemsBinding;
import com.habitrpg.android.habitica.databinding.DialogPurchaseShopitemButtonBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HapticFeedbackManager;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.EventOutcomeSubscriptionBottomSheetFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import com.habitrpg.android.habitica.ui.views.CurrencyViews;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGoldDialog;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientHourglassesDialog;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientSubscriberGemsDialog;
import com.habitrpg.android.habitica.ui.views.tasks.form.StepperValueFormView;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.Avatar;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dc.f;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ec.n0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: PurchaseDialog.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialog extends HabiticaAlertDialog {
    public static final int $stable = 8;
    private TextView amountErrorLabel;
    private final View buyButton;
    private final TextView buyLabel;
    private final CurrencyViews currencyView;
    private final f customHeader$delegate;
    private final InventoryRepository inventoryRepository;
    private boolean isPinned;
    private final ShopItem item;
    private final TextView limitedTextView;
    private x1 limitedTextViewJob;
    private l<? super ShopItem, w> onShopNeedsRefresh;
    private final d parentActivity;
    private final LinearLayout pinButton;
    private final ImageView pinIcon;
    private final TextView pinTextView;
    private final CurrencyView priceLabel;
    private l<? super ShopItem, w> purchaseCardAction;
    private int purchaseQuantity;
    private String shopIdentifier;
    private ShopItem shopItem;
    private User user;
    private final UserRepository userRepository;

    /* compiled from: PurchaseDialog.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass2 extends r implements p<HabiticaAlertDialog, Integer, w> {
        AnonymousClass2() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
            invoke(habiticaAlertDialog, num.intValue());
            return w.f13270a;
        }

        public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
            q.i(habiticaAlertDialog, "<anonymous parameter 0>");
            PurchaseDialog.this.onBuyButtonClicked();
        }
    }

    /* compiled from: PurchaseDialog.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$4", f = "PurchaseDialog.kt", l = {292}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass4) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                g u10 = i.u(PurchaseDialog.this.userRepository.getUser());
                final PurchaseDialog purchaseDialog = PurchaseDialog.this;
                h hVar = new h() { // from class: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog.4.1
                    public final Object emit(User user, Continuation<? super w> continuation) {
                        PurchaseDialog.this.setUser(user);
                        return w.f13270a;
                    }

                    @Override // dd.h
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((User) obj2, (Continuation<? super w>) continuation);
                    }
                };
                this.label = 1;
                if (u10.collect(hVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public /* synthetic */ PurchaseDialog(Context context, UserRepository userRepository, InventoryRepository inventoryRepository, ShopItem shopItem, d dVar, int i10, qc.h hVar) {
        this(context, userRepository, inventoryRepository, shopItem, (i10 & 16) != 0 ? null : dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(PurchaseDialog purchaseDialog, View view) {
        q.i(purchaseDialog, "this$0");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(purchaseDialog), null, new PurchaseDialog$3$1(purchaseDialog, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buyItem(int i10) {
        Application application;
        HabiticaBaseApplication habiticaBaseApplication;
        l purchaseDialog$buyItem$6;
        l purchaseDialog$buyItem$9;
        l lVar;
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null) {
            application = ownerActivity.getApplication();
        } else {
            application = null;
        }
        if (application instanceof HabiticaBaseApplication) {
            habiticaBaseApplication = (HabiticaBaseApplication) application;
        } else {
            habiticaBaseApplication = null;
        }
        FirebaseAnalytics.getInstance(getContext()).a("item_purchased", e.a(new dc.l("shop", this.shopIdentifier), new dc.l(TaskFormActivity.TASK_TYPE_KEY, this.shopItem.getPurchaseType()), new dc.l("key", this.shopItem.getKey())));
        HapticFeedbackManager.Companion.tap(this.buyButton);
        String[] strArr = {""};
        String str = this.shopIdentifier;
        if ((str == null || !q.d(str, "timeTravelersShop")) && !q.d("mystery_set", this.shopItem.getPurchaseType()) && !q.d(this.shopItem.getCurrency(), "hourglasses")) {
            if (q.d(this.shopItem.getPurchaseType(), "fortify")) {
                purchaseDialog$buyItem$6 = new PurchaseDialog$buyItem$3(this, null);
            } else if (q.d(this.shopItem.getPurchaseType(), "quests") && q.d(this.shopItem.getCurrency(), "gold")) {
                purchaseDialog$buyItem$6 = new PurchaseDialog$buyItem$4(this, null);
            } else if (q.d(this.shopItem.getPurchaseType(), "debuffPotion")) {
                purchaseDialog$buyItem$6 = new PurchaseDialog$buyItem$5(this, null);
            } else if (!q.d(this.shopItem.getPurchaseType(), "customization") && !q.d(this.shopItem.getPurchaseType(), "background") && !q.d(this.shopItem.getPurchaseType(), "backgrounds") && !q.d(this.shopItem.getPurchaseType(), "customizationSet")) {
                if (q.d(this.shopItem.getPurchaseType(), "debuffPotion")) {
                    purchaseDialog$buyItem$6 = new PurchaseDialog$buyItem$7(this, null);
                } else if (q.d(this.shopItem.getPurchaseType(), "card")) {
                    l<? super ShopItem, w> lVar2 = this.purchaseCardAction;
                    if (lVar2 != null) {
                        lVar2.invoke(this.shopItem);
                    }
                    dismiss();
                    return;
                } else {
                    if (q.d("gold", this.shopItem.getCurrency()) && !q.d("gem", this.shopItem.getKey())) {
                        purchaseDialog$buyItem$9 = new PurchaseDialog$buyItem$8(this, i10, null);
                    } else {
                        purchaseDialog$buyItem$9 = new PurchaseDialog$buyItem$9(this, i10, null);
                    }
                    lVar = purchaseDialog$buyItem$9;
                    ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new PurchaseDialog$buyItem$10(lVar, strArr, this, habiticaBaseApplication, null), 1, null);
                }
            } else {
                purchaseDialog$buyItem$6 = new PurchaseDialog$buyItem$6(this, null);
            }
        } else if (q.d(this.shopItem.getPurchaseType(), "gear")) {
            purchaseDialog$buyItem$6 = new PurchaseDialog$buyItem$1(this, null);
        } else {
            purchaseDialog$buyItem$6 = new PurchaseDialog$buyItem$2(this, null);
        }
        lVar = purchaseDialog$buyItem$6;
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new PurchaseDialog$buyItem$10(lVar, strArr, this, habiticaBaseApplication, null), 1, null);
    }

    private final void checkGearClass() {
        if (q.d(this.shopItem.getPurchaseType(), NavigationDrawerFragment.SIDEBAR_GEMS)) {
            return;
        }
        setLimitedTextView();
    }

    private final void displayNoRemainingConfirmationDialog() {
        Context context = getContext();
        q.h(context, "getContext(...)");
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(R.string.excess_items);
        habiticaAlertDialog.setMessage(getContext().getString(R.string.excessItemsNoneLeft, this.item.getText(), Integer.valueOf(this.purchaseQuantity), this.item.getText()));
        String string = getContext().getString(R.string.purchaseX, Integer.valueOf(this.purchaseQuantity));
        q.h(string, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (p) new PurchaseDialog$displayNoRemainingConfirmationDialog$1(this), 8, (Object) null);
        AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
        habiticaAlertDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayPurchaseConfirmationDialog(int i10) {
        if (i10 == 0) {
            displayNoRemainingConfirmationDialog();
        } else {
            displaySomeRemainingConfirmationDialog(i10);
        }
    }

    private final void displaySomeRemainingConfirmationDialog(int i10) {
        Context context = getContext();
        q.h(context, "getContext(...)");
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(R.string.excess_items);
        habiticaAlertDialog.setMessage(getContext().getString(R.string.excessItemsXLeft, Integer.valueOf(i10), this.item.getText(), Integer.valueOf(this.purchaseQuantity)));
        String string = getContext().getString(R.string.purchaseX, Integer.valueOf(this.purchaseQuantity));
        q.h(string, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (p) new PurchaseDialog$displaySomeRemainingConfirmationDialog$1(this), 8, (Object) null);
        String string2 = getContext().getString(R.string.purchaseX, Integer.valueOf(i10));
        q.h(string2, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string2, false, false, false, (p) new PurchaseDialog$displaySomeRemainingConfirmationDialog$2(this, i10), 8, (Object) null);
        habiticaAlertDialog.setExtraCloseButtonVisibility(0);
        habiticaAlertDialog.show();
    }

    private final SnackbarActivity findSnackBarActivity(Context context) {
        HabiticaBaseApplication habiticaBaseApplication;
        BaseActivity baseActivity;
        WeakReference<BaseActivity> currentActivity;
        if (context instanceof SnackbarActivity) {
            return (SnackbarActivity) context;
        }
        if (context instanceof ViewComponentManager$FragmentContextWrapper) {
            Context baseContext = ((ViewComponentManager$FragmentContextWrapper) context).getBaseContext();
            q.h(baseContext, "getBaseContext(...)");
            return findSnackBarActivity(baseContext);
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof HabiticaBaseApplication) {
            habiticaBaseApplication = (HabiticaBaseApplication) applicationContext;
        } else {
            habiticaBaseApplication = null;
        }
        if (habiticaBaseApplication != null && (currentActivity = habiticaBaseApplication.getCurrentActivity()) != null) {
            baseActivity = currentActivity.get();
        } else {
            baseActivity = null;
        }
        if (!(baseActivity instanceof SnackbarActivity)) {
            return null;
        }
        return (SnackbarActivity) baseActivity;
    }

    private final View getCustomHeader() {
        Object value = this.customHeader$delegate.getValue();
        q.h(value, "getValue(...)");
        return (View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBuyButtonClicked() {
        Integer num;
        Map k10;
        if (this.shopItem.isValid() && !this.shopItem.getLocked()) {
            boolean z10 = false;
            if (this.shopItem.getLimitedNumberLeft() != null) {
                num = this.shopItem.getLimitedNumberLeft();
            } else {
                num = 0;
            }
            if ((num != null && num.intValue() == 0 && q.d(this.shopItem.getPurchaseType(), NavigationDrawerFragment.SIDEBAR_GEMS)) || this.shopItem.canAfford(this.user, this.purchaseQuantity)) {
                ad.i.d(l0.b(), a1.c(), null, new PurchaseDialog$onBuyButtonClicked$1(this, null), 2, null);
            } else if (q.d(NavigationDrawerFragment.SIDEBAR_GEMS, this.shopItem.getPurchaseType())) {
                if (this.shopItem.canAfford(this.user, this.purchaseQuantity)) {
                    Context context = getContext();
                    q.h(context, "getContext(...)");
                    new InsufficientSubscriberGemsDialog(context).show();
                    return;
                }
                Context context2 = getContext();
                q.h(context2, "getContext(...)");
                new InsufficientGoldDialog(context2).show();
                return;
            } else if (q.d("gold", this.shopItem.getCurrency())) {
                Context context3 = getContext();
                q.h(context3, "getContext(...)");
                new InsufficientGoldDialog(context3).show();
                return;
            } else if (q.d(NavigationDrawerFragment.SIDEBAR_GEMS, this.shopItem.getCurrency())) {
                Analytics analytics = Analytics.INSTANCE;
                EventCategory eventCategory = EventCategory.BEHAVIOUR;
                HitType hitType = HitType.EVENT;
                k10 = n0.k(dc.r.a("reason", "purchase modal"), dc.r.a("item", this.shopItem.getKey()));
                Analytics.sendEvent$default(analytics, "show insufficient gems modal", eventCategory, hitType, k10, null, 16, null);
                d dVar = this.parentActivity;
                if (dVar != null) {
                    new InsufficientGemsDialog(dVar, this.shopItem.getValue()).show();
                    return;
                }
                return;
            } else if (q.d("hourglasses", this.shopItem.getCurrency())) {
                User user = this.user;
                if (user != null && user.isSubscribed()) {
                    z10 = true;
                }
                if (z10) {
                    Context context4 = getContext();
                    q.h(context4, "getContext(...)");
                    new InsufficientHourglassesDialog(context4).show();
                    return;
                }
                EventOutcomeSubscriptionBottomSheetFragment eventOutcomeSubscriptionBottomSheetFragment = new EventOutcomeSubscriptionBottomSheetFragment();
                eventOutcomeSubscriptionBottomSheetFragment.setEventType(EventOutcomeSubscriptionBottomSheetFragment.EVENT_HOURGLASS_SHOP_OPENED);
                d dVar2 = this.parentActivity;
                if (dVar2 != null) {
                    eventOutcomeSubscriptionBottomSheetFragment.show(dVar2.getSupportFragmentManager(), SubscriptionBottomSheetFragment.TAG);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0273 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remainingPurchaseQuantity(pc.l<? super java.lang.Integer, dc.w> r18, kotlin.coroutines.Continuation<? super dc.w> r19) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog.remainingPurchaseQuantity(pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setLimitedTextView() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog.setLimitedTextView():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setShopItem(com.habitrpg.android.habitica.models.shops.ShopItem r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog.setShopItem(com.habitrpg.android.habitica.models.shops.ShopItem):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUser(User user) {
        double d10;
        int i10;
        Integer num;
        PurchaseDialogGemsContent purchaseDialogGemsContent;
        SubscriptionPlan plan;
        DialogPurchaseGemsBinding binding$Habitica_2311256681_prodRelease;
        SubscriptionPlan plan2;
        SubscriptionPlan plan3;
        Double gp;
        this.user = user;
        CurrencyViews currencyViews = this.currencyView;
        Stats stats = user.getStats();
        if (stats != null && (gp = stats.getGp()) != null) {
            d10 = gp.doubleValue();
        } else {
            d10 = 0.0d;
        }
        currencyViews.setGold(d10);
        this.currencyView.setGems(user.getGemCount());
        this.currencyView.setHourglasses(user.getHourglassCount());
        if (q.d(NavigationDrawerFragment.SIDEBAR_GEMS, this.shopItem.getPurchaseType())) {
            Purchases purchased = user.getPurchased();
            if (purchased != null && (plan3 = purchased.getPlan()) != null) {
                i10 = plan3.getTotalNumberOfGems();
            } else {
                i10 = 0;
            }
            Purchases purchased2 = user.getPurchased();
            StepperValueFormView stepperValueFormView = null;
            if (purchased2 != null && (plan2 = purchased2.getPlan()) != null) {
                num = Integer.valueOf(plan2.getNumberOfGemsLeft());
            } else {
                num = null;
            }
            int i11 = 1;
            if (i10 > 0) {
                this.limitedTextView.setText(getContext().getString(R.string.gems_left_max, num, Integer.valueOf(i10)));
            } else {
                this.limitedTextView.setText(getContext().getString(R.string.gems_left_nomax, num));
            }
            this.limitedTextView.setVisibility(0);
            if (num != null && num.intValue() == 0) {
                this.limitedTextView.setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.orange_10));
            } else {
                this.limitedTextView.setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.green_10));
            }
            View additionalContentView$Habitica_2311256681_prodRelease = getAdditionalContentView$Habitica_2311256681_prodRelease();
            if (additionalContentView$Habitica_2311256681_prodRelease instanceof PurchaseDialogGemsContent) {
                purchaseDialogGemsContent = (PurchaseDialogGemsContent) additionalContentView$Habitica_2311256681_prodRelease;
            } else {
                purchaseDialogGemsContent = null;
            }
            if (purchaseDialogGemsContent != null && (binding$Habitica_2311256681_prodRelease = purchaseDialogGemsContent.getBinding$Habitica_2311256681_prodRelease()) != null) {
                stepperValueFormView = binding$Habitica_2311256681_prodRelease.stepperView;
            }
            if (stepperValueFormView != null) {
                Purchases purchased3 = user.getPurchased();
                if (purchased3 != null && (plan = purchased3.getPlan()) != null) {
                    i11 = plan.getNumberOfGemsLeft();
                }
                stepperValueFormView.setMaxValue(Double.valueOf(i11));
            }
        }
        this.buyButton.setElevation(0.0f);
        updatePurchaseTotal();
        if (this.shopItem.isTypeGear()) {
            checkGearClass();
        }
        setLimitedTextView();
        if (getAdditionalContentView$Habitica_2311256681_prodRelease() instanceof PurchaseDialogBackgroundContent) {
            View additionalContentView$Habitica_2311256681_prodRelease2 = getAdditionalContentView$Habitica_2311256681_prodRelease();
            q.g(additionalContentView$Habitica_2311256681_prodRelease2, "null cannot be cast to non-null type com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogBackgroundContent");
            ((PurchaseDialogBackgroundContent) additionalContentView$Habitica_2311256681_prodRelease2).setAvatarWithBackgroundPreview((Avatar) this.userRepository.getUnmanagedCopy((UserRepository) user), this.shopItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        if (r0 < r5.purchaseQuantity) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updatePurchaseTotal() {
        /*
            r5 = this;
            com.habitrpg.android.habitica.ui.views.CurrencyView r0 = r5.priceLabel
            com.habitrpg.android.habitica.models.shops.ShopItem r1 = r5.shopItem
            int r1 = r1.getValue()
            double r1 = (double) r1
            int r3 = r5.purchaseQuantity
            double r3 = (double) r3
            double r1 = r1 * r3
            r0.setValue(r1)
            com.habitrpg.android.habitica.models.shops.ShopItem r0 = r5.shopItem
            java.lang.String r0 = r0.getCurrency()
            java.lang.String r1 = "gold"
            boolean r0 = qc.q.d(r0, r1)
            r1 = 1
            if (r0 == 0) goto L2c
            com.habitrpg.android.habitica.models.shops.ShopItem r0 = r5.shopItem
            com.habitrpg.android.habitica.models.user.User r2 = r5.user
            int r3 = r5.purchaseQuantity
            boolean r0 = r0.canAfford(r2, r3)
            if (r0 == 0) goto L66
        L2c:
            com.habitrpg.android.habitica.models.shops.ShopItem r0 = r5.shopItem
            boolean r0 = r0.getLocked()
            if (r0 != 0) goto L66
            int r0 = r5.purchaseQuantity
            if (r0 < r1) goto L66
            android.view.View r0 = r5.buyButton
            android.content.Context r2 = r5.getContext()
            r3 = 2131230904(0x7f0800b8, float:1.8077874E38)
            android.graphics.drawable.Drawable r2 = androidx.core.content.a.e(r2, r3)
            r0.setBackground(r2)
            com.habitrpg.android.habitica.ui.views.CurrencyView r0 = r5.priceLabel
            android.content.Context r2 = r5.getContext()
            r3 = 2131100684(0x7f06040c, float:1.7813756E38)
            int r2 = androidx.core.content.a.c(r2, r3)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r5.buyLabel
            android.content.Context r2 = r5.getContext()
            int r2 = androidx.core.content.a.c(r2, r3)
            r0.setTextColor(r2)
            goto L93
        L66:
            android.view.View r0 = r5.buyButton
            android.content.Context r2 = r5.getContext()
            r3 = 2131230903(0x7f0800b7, float:1.8077872E38)
            android.graphics.drawable.Drawable r2 = androidx.core.content.a.e(r2, r3)
            r0.setBackground(r2)
            com.habitrpg.android.habitica.ui.views.CurrencyView r0 = r5.priceLabel
            android.content.Context r2 = r5.getContext()
            r3 = 2131100659(0x7f0603f3, float:1.7813706E38)
            int r2 = androidx.core.content.a.c(r2, r3)
            r0.setTextColor(r2)
            android.widget.TextView r0 = r5.buyLabel
            android.content.Context r2 = r5.getContext()
            int r2 = androidx.core.content.a.c(r2, r3)
            r0.setTextColor(r2)
        L93:
            int r0 = r5.purchaseQuantity
            r2 = 0
            if (r0 < r1) goto Lbe
            com.habitrpg.android.habitica.models.shops.ShopItem r0 = r5.shopItem
            java.lang.Integer r0 = r0.getLimitedNumberLeft()
            if (r0 == 0) goto Lb3
            com.habitrpg.android.habitica.models.shops.ShopItem r0 = r5.shopItem
            java.lang.Integer r0 = r0.getLimitedNumberLeft()
            if (r0 == 0) goto Lad
            int r0 = r0.intValue()
            goto Lae
        Lad:
            r0 = 0
        Lae:
            int r1 = r5.purchaseQuantity
            if (r0 >= r1) goto Lb3
            goto Lbe
        Lb3:
            android.widget.TextView r0 = r5.amountErrorLabel
            if (r0 != 0) goto Lb8
            goto Lc6
        Lb8:
            r1 = 8
            r0.setVisibility(r1)
            goto Lc6
        Lbe:
            android.widget.TextView r0 = r5.amountErrorLabel
            if (r0 != 0) goto Lc3
            goto Lc6
        Lc3:
            r0.setVisibility(r2)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog.updatePurchaseTotal():void");
    }

    @Override // com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog, androidx.appcompat.app.x, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.userRepository.close();
        this.inventoryRepository.close();
        x1 x1Var = this.limitedTextViewJob;
        if (x1Var != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        super.dismiss();
    }

    public final ShopItem getItem() {
        return this.item;
    }

    public final l<ShopItem, w> getOnShopNeedsRefresh() {
        return this.onShopNeedsRefresh;
    }

    public final String getShopIdentifier() {
        return this.shopIdentifier;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final void setOnShopNeedsRefresh(l<? super ShopItem, w> lVar) {
        this.onShopNeedsRefresh = lVar;
    }

    public final void setPinned(boolean z10) {
        this.isPinned = z10;
        if (z10) {
            this.pinIcon.setImageDrawable(new BitmapDrawable(getContext().getResources(), HabiticaIconsHelper.imageOfUnpinItem()));
            this.pinIcon.setImageTintList(androidx.core.content.a.d(getContext(), R.color.text_red));
            this.pinTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_red));
            this.pinTextView.setText(getContext().getText(R.string.unpin));
            return;
        }
        this.pinIcon.setImageDrawable(new BitmapDrawable(getContext().getResources(), HabiticaIconsHelper.imageOfPinItem()));
        this.pinIcon.setImageTintList(androidx.core.content.a.d(getContext(), R.color.text_brand));
        this.pinTextView.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_brand));
        this.pinTextView.setText(getContext().getText(R.string.pin));
    }

    public final void setShopIdentifier(String str) {
        this.shopIdentifier = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog(Context context, UserRepository userRepository, InventoryRepository inventoryRepository, ShopItem shopItem, d dVar) {
        super(context);
        f b10;
        q.i(context, "context");
        q.i(userRepository, "userRepository");
        q.i(inventoryRepository, "inventoryRepository");
        q.i(shopItem, "item");
        this.userRepository = userRepository;
        this.inventoryRepository = inventoryRepository;
        this.item = shopItem;
        this.parentActivity = dVar;
        b10 = dc.h.b(new PurchaseDialog$customHeader$2(context));
        this.customHeader$delegate = b10;
        this.purchaseQuantity = 1;
        this.shopItem = shopItem;
        SnackbarActivity findSnackBarActivity = findSnackBarActivity(context);
        if (findSnackBarActivity != null) {
            Activity activity = findSnackBarActivity instanceof Activity ? (Activity) findSnackBarActivity : null;
            if (activity != null) {
                setOwnerActivity(activity);
            }
        }
        setForceScrollableLayout(true);
        setCustomHeaderView(getCustomHeader());
        View findViewById = getCustomHeader().findViewById(R.id.currencyView);
        q.h(findViewById, "findViewById(...)");
        this.currencyView = (CurrencyViews) findViewById;
        View findViewById2 = getCustomHeader().findViewById(R.id.limitedTextView);
        q.h(findViewById2, "findViewById(...)");
        this.limitedTextView = (TextView) findViewById2;
        View findViewById3 = getCustomHeader().findViewById(R.id.pin_button);
        q.h(findViewById3, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        this.pinButton = linearLayout;
        View findViewById4 = getCustomHeader().findViewById(R.id.pin_icon);
        q.h(findViewById4, "findViewById(...)");
        this.pinIcon = (ImageView) findViewById4;
        View findViewById5 = getCustomHeader().findViewById(R.id.pin_text);
        q.h(findViewById5, "findViewById(...)");
        this.pinTextView = (TextView) findViewById5;
        AlertDialogExtensionsKt.addCloseButton$default(this, false, null, 3, null);
        LinearLayout root = DialogPurchaseShopitemButtonBinding.inflate(getLayoutInflater()).getRoot();
        q.h(root, "getRoot(...)");
        View addButton = addButton(root, false, new AnonymousClass2());
        this.buyButton = addButton;
        View findViewById6 = addButton.findViewById(R.id.priceLabel);
        q.h(findViewById6, "findViewById(...)");
        CurrencyView currencyView = (CurrencyView) findViewById6;
        this.priceLabel = currencyView;
        currencyView.setAnimationDuration(0L);
        View findViewById7 = addButton.findViewById(R.id.buy_label);
        q.h(findViewById7, "findViewById(...)");
        this.buyLabel = (TextView) findViewById7;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.shops.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseDialog._init_$lambda$3(PurchaseDialog.this, view);
            }
        });
        setShopItem(shopItem);
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new AnonymousClass4(null), 1, null);
        if (q.d(shopItem.getKey(), "armoire")) {
            linearLayout.setVisibility(8);
        }
    }
}
