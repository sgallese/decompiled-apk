package com.habitrpg.android.habitica.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.ActivityArmoireBinding;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.helpers.AdHandler;
import com.habitrpg.android.habitica.helpers.AdType;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.purchases.EventOutcomeSubscriptionBottomSheetFragment;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.ads.AdButton;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaBottomSheetDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.Animations;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import java.util.Locale;

/* compiled from: ArmoireActivity.kt */
/* loaded from: classes4.dex */
public final class ArmoireActivity extends Hilt_ArmoireActivity {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private ActivityArmoireBinding binding;
    private String equipmentKey;
    private Double gold;
    private boolean hasAnimatedChanges;
    public InventoryRepository inventoryRepository;
    public ReviewManager reviewManager;
    public MainUserViewModel userViewModel;

    public static /* synthetic */ void configure$default(ArmoireActivity armoireActivity, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = "";
        }
        armoireActivity.configure(str, str2, str3, str4);
    }

    private final void createParticles(FrameLayout frameLayout, int i10) {
        ma.d r10 = new ma.d(frameLayout, 30, androidx.core.content.a.e(this, i10), 6000L).u(144.0f).w(1.0f, 1.6f).x(-0.15f, 0.15f, 0.15f, 0.45f).r(200L, new AccelerateInterpolator());
        ActivityArmoireBinding activityArmoireBinding = this.binding;
        if (activityArmoireBinding == null) {
            qc.q.z("binding");
            activityArmoireBinding = null;
        }
        r10.l(activityArmoireBinding.confettiAnchor, 48, 15, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean giveUserArmoire() {
        Stats stats;
        Double gp;
        ActivityArmoireBinding activityArmoireBinding = this.binding;
        if (activityArmoireBinding == null) {
            qc.q.z("binding");
            activityArmoireBinding = null;
        }
        activityArmoireBinding.iconWrapper.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.activities.h
            @Override // java.lang.Runnable
            public final void run() {
                ArmoireActivity.giveUserArmoire$lambda$12(ArmoireActivity.this);
            }
        });
        ActivityArmoireBinding activityArmoireBinding2 = this.binding;
        if (activityArmoireBinding2 == null) {
            qc.q.z("binding");
            activityArmoireBinding2 = null;
        }
        ViewPropertyAnimator animate = activityArmoireBinding2.progressView.animate();
        animate.alpha(1.0f);
        animate.setStartDelay(0L);
        animate.start();
        ActivityArmoireBinding activityArmoireBinding3 = this.binding;
        if (activityArmoireBinding3 == null) {
            qc.q.z("binding");
            activityArmoireBinding3 = null;
        }
        ViewPropertyAnimator animate2 = activityArmoireBinding3.titleView.animate();
        animate2.alpha(0.0f);
        animate2.setDuration(300L);
        animate2.setStartDelay(0L);
        animate2.start();
        ActivityArmoireBinding activityArmoireBinding4 = this.binding;
        if (activityArmoireBinding4 == null) {
            qc.q.z("binding");
            activityArmoireBinding4 = null;
        }
        ViewPropertyAnimator animate3 = activityArmoireBinding4.subtitleView.animate();
        animate3.alpha(0.0f);
        animate3.setDuration(300L);
        animate3.setStartDelay(0L);
        animate3.start();
        ActivityArmoireBinding activityArmoireBinding5 = this.binding;
        if (activityArmoireBinding5 == null) {
            qc.q.z("binding");
            activityArmoireBinding5 = null;
        }
        ViewPropertyAnimator animate4 = activityArmoireBinding5.goldView.animate();
        animate4.alpha(0.0f);
        animate4.start();
        User f10 = getUserViewModel().getUser().f();
        if (f10 == null || (stats = f10.getStats()) == null || (gp = stats.getGp()) == null) {
            return true;
        }
        double doubleValue = gp.doubleValue();
        ActivityArmoireBinding activityArmoireBinding6 = this.binding;
        if (activityArmoireBinding6 == null) {
            qc.q.z("binding");
            activityArmoireBinding6 = null;
        }
        if (activityArmoireBinding6.adButton.getVisibility() == 0) {
            ActivityArmoireBinding activityArmoireBinding7 = this.binding;
            if (activityArmoireBinding7 == null) {
                qc.q.z("binding");
                activityArmoireBinding7 = null;
            }
            activityArmoireBinding7.adButton.setState(AdButton.State.UNAVAILABLE);
            ActivityArmoireBinding activityArmoireBinding8 = this.binding;
            if (activityArmoireBinding8 == null) {
                qc.q.z("binding");
                activityArmoireBinding8 = null;
            }
            activityArmoireBinding8.adButton.setVisibility(4);
        } else {
            ActivityArmoireBinding activityArmoireBinding9 = this.binding;
            if (activityArmoireBinding9 == null) {
                qc.q.z("binding");
                activityArmoireBinding9 = null;
            }
            if (activityArmoireBinding9.openArmoireSubscriberWrapper.getVisibility() == 0) {
                ActivityArmoireBinding activityArmoireBinding10 = this.binding;
                if (activityArmoireBinding10 == null) {
                    qc.q.z("binding");
                    activityArmoireBinding10 = null;
                }
                activityArmoireBinding10.openArmoireSubscriberWrapper.setVisibility(4);
            }
        }
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new ArmoireActivity$giveUserArmoire$6(this, doubleValue, f10, null), 2, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void giveUserArmoire$lambda$12(ArmoireActivity armoireActivity) {
        qc.q.i(armoireActivity, "this$0");
        ActivityArmoireBinding activityArmoireBinding = armoireActivity.binding;
        ActivityArmoireBinding activityArmoireBinding2 = null;
        if (activityArmoireBinding == null) {
            qc.q.z("binding");
            activityArmoireBinding = null;
        }
        activityArmoireBinding.iconView.setBitmap(null);
        Animations animations = Animations.INSTANCE;
        ActivityArmoireBinding activityArmoireBinding3 = armoireActivity.binding;
        if (activityArmoireBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityArmoireBinding2 = activityArmoireBinding3;
        }
        RelativeLayout relativeLayout = activityArmoireBinding2.iconWrapper;
        qc.q.h(relativeLayout, "iconWrapper");
        Animations.circularHide$default(animations, relativeLayout, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ArmoireActivity armoireActivity, AdHandler adHandler, View view) {
        qc.q.i(armoireActivity, "this$0");
        qc.q.i(adHandler, "$handler");
        ActivityArmoireBinding activityArmoireBinding = armoireActivity.binding;
        if (activityArmoireBinding == null) {
            qc.q.z("binding");
            activityArmoireBinding = null;
        }
        activityArmoireBinding.adButton.setState(AdButton.State.LOADING);
        adHandler.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ArmoireActivity armoireActivity, View view) {
        qc.q.i(armoireActivity, "this$0");
        Analytics.sendEvent$default(Analytics.INSTANCE, "Free armoire perk", EventCategory.BEHAVIOUR, HitType.EVENT, null, null, 24, null);
        armoireActivity.giveUserArmoire();
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(armoireActivity), null, new ArmoireActivity$onCreate$5$1(armoireActivity, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$11$lambda$10(ArmoireActivity armoireActivity, User user) {
        qc.q.i(armoireActivity, "this$0");
        if (user != null) {
            armoireActivity.getReviewManager().requestReview(armoireActivity, user.getLoginIncentives());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(ArmoireActivity armoireActivity, View view) {
        qc.q.i(armoireActivity, "this$0");
        Analytics.sendEvent$default(Analytics.INSTANCE, "View armoire sub CTA", EventCategory.BEHAVIOUR, HitType.EVENT, null, null, 24, null);
        EventOutcomeSubscriptionBottomSheetFragment eventOutcomeSubscriptionBottomSheetFragment = new EventOutcomeSubscriptionBottomSheetFragment();
        eventOutcomeSubscriptionBottomSheetFragment.setEventType(EventOutcomeSubscriptionBottomSheetFragment.EVENT_ARMOIRE_OPENED);
        eventOutcomeSubscriptionBottomSheetFragment.show(armoireActivity.getSupportFragmentManager(), EventOutcomeSubscriptionBottomSheetFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(ArmoireActivity armoireActivity, View view) {
        qc.q.i(armoireActivity, "this$0");
        armoireActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(ArmoireActivity armoireActivity, View view) {
        qc.q.i(armoireActivity, "this$0");
        String str = armoireActivity.equipmentKey;
        if (str != null) {
            ExceptionHandlerKt.launchCatching$default(ad.l0.b(), null, new ArmoireActivity$onCreate$8$1$1(armoireActivity, str, null), 1, null);
        }
        armoireActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(ArmoireActivity armoireActivity, View view) {
        qc.q.i(armoireActivity, "this$0");
        armoireActivity.showDropRateDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(ArmoireActivity armoireActivity, View view) {
        qc.q.i(armoireActivity, "this$0");
        armoireActivity.showDropRateDialog();
    }

    private final void showDropRateDialog() {
        HabiticaBottomSheetDialog habiticaBottomSheetDialog = new HabiticaBottomSheetDialog(this);
        habiticaBottomSheetDialog.setContentView(R.layout.armoire_drop_rate_dialog);
        habiticaBottomSheetDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimation(boolean z10) {
        Integer num;
        Double d10 = this.gold;
        ActivityArmoireBinding activityArmoireBinding = null;
        if (d10 != null) {
            num = Integer.valueOf((int) d10.doubleValue());
        } else {
            num = null;
        }
        if (this.hasAnimatedChanges) {
            return;
        }
        if (num != null && z10) {
            ActivityArmoireBinding activityArmoireBinding2 = this.binding;
            if (activityArmoireBinding2 == null) {
                qc.q.z("binding");
                activityArmoireBinding2 = null;
            }
            activityArmoireBinding2.goldView.setValue(num.intValue() + 100);
            ActivityArmoireBinding activityArmoireBinding3 = this.binding;
            if (activityArmoireBinding3 == null) {
                qc.q.z("binding");
                activityArmoireBinding3 = null;
            }
            activityArmoireBinding3.goldView.setValue(num.intValue());
        }
        ActivityArmoireBinding activityArmoireBinding4 = this.binding;
        if (activityArmoireBinding4 == null) {
            qc.q.z("binding");
            activityArmoireBinding4 = null;
        }
        ViewPropertyAnimator animate = activityArmoireBinding4.progressView.animate();
        animate.alpha(0.0f);
        animate.setStartDelay(0L);
        animate.start();
        ActivityArmoireBinding activityArmoireBinding5 = this.binding;
        if (activityArmoireBinding5 == null) {
            qc.q.z("binding");
            activityArmoireBinding5 = null;
        }
        final FrameLayout frameLayout = activityArmoireBinding5.confettiAnchor;
        qc.q.h(frameLayout, "confettiAnchor");
        frameLayout.postDelayed(new Runnable() { // from class: com.habitrpg.android.habitica.ui.activities.e
            @Override // java.lang.Runnable
            public final void run() {
                ArmoireActivity.startAnimation$lambda$18(ArmoireActivity.this, frameLayout);
            }
        }, 500L);
        ActivityArmoireBinding activityArmoireBinding6 = this.binding;
        if (activityArmoireBinding6 == null) {
            qc.q.z("binding");
            activityArmoireBinding6 = null;
        }
        activityArmoireBinding6.iconView.startAnimation(Animations.bobbingAnimation$default(Animations.INSTANCE, 0.0f, 1, null));
        ActivityArmoireBinding activityArmoireBinding7 = this.binding;
        if (activityArmoireBinding7 == null) {
            qc.q.z("binding");
            activityArmoireBinding7 = null;
        }
        activityArmoireBinding7.titleView.setAlpha(0.0f);
        ActivityArmoireBinding activityArmoireBinding8 = this.binding;
        if (activityArmoireBinding8 == null) {
            qc.q.z("binding");
            activityArmoireBinding8 = null;
        }
        activityArmoireBinding8.subtitleView.setAlpha(0.0f);
        ActivityArmoireBinding activityArmoireBinding9 = this.binding;
        if (activityArmoireBinding9 == null) {
            qc.q.z("binding");
            activityArmoireBinding9 = null;
        }
        activityArmoireBinding9.iconWrapper.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.activities.g
            @Override // java.lang.Runnable
            public final void run() {
                ArmoireActivity.startAnimation$lambda$19(ArmoireActivity.this);
            }
        });
        ActivityArmoireBinding activityArmoireBinding10 = this.binding;
        if (activityArmoireBinding10 == null) {
            qc.q.z("binding");
            activityArmoireBinding10 = null;
        }
        activityArmoireBinding10.leftSparkView.startAnimating();
        ActivityArmoireBinding activityArmoireBinding11 = this.binding;
        if (activityArmoireBinding11 == null) {
            qc.q.z("binding");
            activityArmoireBinding11 = null;
        }
        activityArmoireBinding11.rightSparkView.startAnimating();
        ActivityArmoireBinding activityArmoireBinding12 = this.binding;
        if (activityArmoireBinding12 == null) {
            qc.q.z("binding");
            activityArmoireBinding12 = null;
        }
        ViewPropertyAnimator animate2 = activityArmoireBinding12.titleView.animate();
        animate2.alpha(1.0f);
        animate2.setDuration(300L);
        animate2.setStartDelay(600L);
        animate2.start();
        ActivityArmoireBinding activityArmoireBinding13 = this.binding;
        if (activityArmoireBinding13 == null) {
            qc.q.z("binding");
        } else {
            activityArmoireBinding = activityArmoireBinding13;
        }
        ViewPropertyAnimator animate3 = activityArmoireBinding.subtitleView.animate();
        animate3.alpha(1.0f);
        animate3.setDuration(300L);
        animate3.setStartDelay(900L);
        animate3.start();
        this.hasAnimatedChanges = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$18(ArmoireActivity armoireActivity, FrameLayout frameLayout) {
        qc.q.i(armoireActivity, "this$0");
        qc.q.i(frameLayout, "$container");
        armoireActivity.createParticles(frameLayout, R.drawable.confetti_blue);
        armoireActivity.createParticles(frameLayout, R.drawable.confetti_red);
        armoireActivity.createParticles(frameLayout, R.drawable.confetti_yellow);
        armoireActivity.createParticles(frameLayout, R.drawable.confetti_purple);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$19(ArmoireActivity armoireActivity) {
        qc.q.i(armoireActivity, "this$0");
        Animations animations = Animations.INSTANCE;
        ActivityArmoireBinding activityArmoireBinding = armoireActivity.binding;
        if (activityArmoireBinding == null) {
            qc.q.z("binding");
            activityArmoireBinding = null;
        }
        RelativeLayout relativeLayout = activityArmoireBinding.iconWrapper;
        qc.q.h(relativeLayout, "iconWrapper");
        animations.circularReveal(relativeLayout, 300L);
    }

    public final void configure(String str, String str2, String str3, String str4) {
        boolean z10;
        String valueOf;
        qc.q.i(str, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(str2, "key");
        qc.q.i(str3, "text");
        ActivityArmoireBinding activityArmoireBinding = this.binding;
        ActivityArmoireBinding activityArmoireBinding2 = null;
        if (activityArmoireBinding == null) {
            qc.q.z("binding");
            activityArmoireBinding = null;
        }
        TextView textView = activityArmoireBinding.titleView;
        int i10 = 0;
        if (str3.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str3.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                qc.q.h(locale, "getDefault(...)");
                valueOf = yc.b.d(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf);
            String substring = str3.substring(1);
            qc.q.h(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            str3 = sb2.toString();
        }
        textView.setText(str3);
        ActivityArmoireBinding activityArmoireBinding3 = this.binding;
        if (activityArmoireBinding3 == null) {
            qc.q.z("binding");
            activityArmoireBinding3 = null;
        }
        Button button = activityArmoireBinding3.equipButton;
        if (!qc.q.d(str, "gear")) {
            i10 = 8;
        }
        button.setVisibility(i10);
        if (qc.q.d(str, "gear")) {
            ActivityArmoireBinding activityArmoireBinding4 = this.binding;
            if (activityArmoireBinding4 == null) {
                qc.q.z("binding");
                activityArmoireBinding4 = null;
            }
            activityArmoireBinding4.subtitleView.setText(getString(R.string.armoireEquipment_new));
            ActivityArmoireBinding activityArmoireBinding5 = this.binding;
            if (activityArmoireBinding5 == null) {
                qc.q.z("binding");
                activityArmoireBinding5 = null;
            }
            PixelArtView pixelArtView = activityArmoireBinding5.iconView;
            qc.q.h(pixelArtView, "iconView");
            DataBindingUtilsKt.loadImage$default(pixelArtView, "shop_" + str2, null, 2, null);
        } else if (qc.q.d(str, "food")) {
            ActivityArmoireBinding activityArmoireBinding6 = this.binding;
            if (activityArmoireBinding6 == null) {
                qc.q.z("binding");
                activityArmoireBinding6 = null;
            }
            activityArmoireBinding6.subtitleView.setText(getString(R.string.armoireFood_new));
            ActivityArmoireBinding activityArmoireBinding7 = this.binding;
            if (activityArmoireBinding7 == null) {
                qc.q.z("binding");
                activityArmoireBinding7 = null;
            }
            PixelArtView pixelArtView2 = activityArmoireBinding7.iconView;
            qc.q.h(pixelArtView2, "iconView");
            DataBindingUtilsKt.loadImage$default(pixelArtView2, "Pet_Food_" + str2, null, 2, null);
        } else {
            ActivityArmoireBinding activityArmoireBinding8 = this.binding;
            if (activityArmoireBinding8 == null) {
                qc.q.z("binding");
                activityArmoireBinding8 = null;
            }
            TextView textView2 = activityArmoireBinding8.titleView;
            ActivityArmoireBinding activityArmoireBinding9 = this.binding;
            if (activityArmoireBinding9 == null) {
                qc.q.z("binding");
                activityArmoireBinding9 = null;
            }
            textView2.setText("+" + str4 + " " + ((Object) activityArmoireBinding9.titleView.getText()));
            ActivityArmoireBinding activityArmoireBinding10 = this.binding;
            if (activityArmoireBinding10 == null) {
                qc.q.z("binding");
                activityArmoireBinding10 = null;
            }
            activityArmoireBinding10.subtitleView.setText(getString(R.string.armoireExp));
            ActivityArmoireBinding activityArmoireBinding11 = this.binding;
            if (activityArmoireBinding11 == null) {
                qc.q.z("binding");
                activityArmoireBinding11 = null;
            }
            activityArmoireBinding11.iconView.setImageResource(R.drawable.armoire_experience);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(IntExtensionsKt.dpToPx(108, (Context) this), IntExtensionsKt.dpToPx(122, (Context) this));
            layoutParams.addRule(13);
            ActivityArmoireBinding activityArmoireBinding12 = this.binding;
            if (activityArmoireBinding12 == null) {
                qc.q.z("binding");
            } else {
                activityArmoireBinding2 = activityArmoireBinding12;
            }
            activityArmoireBinding2.iconView.setLayoutParams(layoutParams);
        }
    }

    public final AppConfigManager getAppConfigManager$Habitica_2311256681_prodRelease() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("appConfigManager");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityArmoireBinding inflate = ActivityArmoireBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        FrameLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    public final InventoryRepository getInventoryRepository$Habitica_2311256681_prodRelease() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_armoire);
    }

    public final ReviewManager getReviewManager() {
        ReviewManager reviewManager = this.reviewManager;
        if (reviewManager != null) {
            return reviewManager;
        }
        qc.q.z("reviewManager");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityArmoireBinding activityArmoireBinding = this.binding;
        ActivityArmoireBinding activityArmoireBinding2 = null;
        if (activityArmoireBinding == null) {
            qc.q.z("binding");
            activityArmoireBinding = null;
        }
        activityArmoireBinding.goldView.setCurrency("gold");
        ActivityArmoireBinding activityArmoireBinding3 = this.binding;
        if (activityArmoireBinding3 == null) {
            qc.q.z("binding");
            activityArmoireBinding3 = null;
        }
        activityArmoireBinding3.goldView.setAnimationDuration(1000L);
        ActivityArmoireBinding activityArmoireBinding4 = this.binding;
        if (activityArmoireBinding4 == null) {
            qc.q.z("binding");
            activityArmoireBinding4 = null;
        }
        activityArmoireBinding4.goldView.setAnimationDelay(500L);
        ActivityArmoireBinding activityArmoireBinding5 = this.binding;
        if (activityArmoireBinding5 == null) {
            qc.q.z("binding");
            activityArmoireBinding5 = null;
        }
        activityArmoireBinding5.goldView.setMinForAbbrevation(1000000);
        ActivityArmoireBinding activityArmoireBinding6 = this.binding;
        if (activityArmoireBinding6 == null) {
            qc.q.z("binding");
            activityArmoireBinding6 = null;
        }
        activityArmoireBinding6.goldView.setDecimals(0);
        getUserViewModel().getUser().j(this, new ArmoireActivity$sam$androidx_lifecycle_Observer$0(new ArmoireActivity$onCreate$1(this)));
        ActivityArmoireBinding activityArmoireBinding7 = this.binding;
        if (activityArmoireBinding7 == null) {
            qc.q.z("binding");
            activityArmoireBinding7 = null;
        }
        activityArmoireBinding7.progressView.setContent(ComposableSingletons$ArmoireActivityKt.INSTANCE.m17getLambda1$Habitica_2311256681_prodRelease());
        if (getAppConfigManager$Habitica_2311256681_prodRelease().enableArmoireAds()) {
            AdType adType = AdType.ARMOIRE;
            final AdHandler adHandler = new AdHandler(this, adType, new ArmoireActivity$onCreate$handler$1(this));
            adHandler.prepare(new ArmoireActivity$onCreate$2(this));
            ActivityArmoireBinding activityArmoireBinding8 = this.binding;
            if (activityArmoireBinding8 == null) {
                qc.q.z("binding");
                activityArmoireBinding8 = null;
            }
            activityArmoireBinding8.adButton.updateForAdType(adType, androidx.lifecycle.w.a(this));
            ActivityArmoireBinding activityArmoireBinding9 = this.binding;
            if (activityArmoireBinding9 == null) {
                qc.q.z("binding");
                activityArmoireBinding9 = null;
            }
            activityArmoireBinding9.adButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArmoireActivity.onCreate$lambda$0(ArmoireActivity.this, adHandler, view);
                }
            });
        } else {
            ActivityArmoireBinding activityArmoireBinding10 = this.binding;
            if (activityArmoireBinding10 == null) {
                qc.q.z("binding");
                activityArmoireBinding10 = null;
            }
            activityArmoireBinding10.adButton.setVisibility(8);
        }
        if (getAppConfigManager$Habitica_2311256681_prodRelease().enableArmoireSubs()) {
            getUserViewModel().getUser().j(this, new ArmoireActivity$sam$androidx_lifecycle_Observer$0(new ArmoireActivity$onCreate$4(this)));
        } else {
            ActivityArmoireBinding activityArmoireBinding11 = this.binding;
            if (activityArmoireBinding11 == null) {
                qc.q.z("binding");
                activityArmoireBinding11 = null;
            }
            activityArmoireBinding11.openArmoireSubscriberWrapper.setVisibility(8);
            ActivityArmoireBinding activityArmoireBinding12 = this.binding;
            if (activityArmoireBinding12 == null) {
                qc.q.z("binding");
                activityArmoireBinding12 = null;
            }
            activityArmoireBinding12.unsubbedWrapper.setVisibility(8);
            ActivityArmoireBinding activityArmoireBinding13 = this.binding;
            if (activityArmoireBinding13 == null) {
                qc.q.z("binding");
                activityArmoireBinding13 = null;
            }
            activityArmoireBinding13.dropRateButton.setVisibility(0);
        }
        ActivityArmoireBinding activityArmoireBinding14 = this.binding;
        if (activityArmoireBinding14 == null) {
            qc.q.z("binding");
            activityArmoireBinding14 = null;
        }
        activityArmoireBinding14.openArmoireSubscriberButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArmoireActivity.onCreate$lambda$1(ArmoireActivity.this, view);
            }
        });
        ActivityArmoireBinding activityArmoireBinding15 = this.binding;
        if (activityArmoireBinding15 == null) {
            qc.q.z("binding");
            activityArmoireBinding15 = null;
        }
        activityArmoireBinding15.subscribeModalButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArmoireActivity.onCreate$lambda$3(ArmoireActivity.this, view);
            }
        });
        ActivityArmoireBinding activityArmoireBinding16 = this.binding;
        if (activityArmoireBinding16 == null) {
            qc.q.z("binding");
            activityArmoireBinding16 = null;
        }
        activityArmoireBinding16.closeButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArmoireActivity.onCreate$lambda$4(ArmoireActivity.this, view);
            }
        });
        ActivityArmoireBinding activityArmoireBinding17 = this.binding;
        if (activityArmoireBinding17 == null) {
            qc.q.z("binding");
            activityArmoireBinding17 = null;
        }
        activityArmoireBinding17.equipButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArmoireActivity.onCreate$lambda$6(ArmoireActivity.this, view);
            }
        });
        ActivityArmoireBinding activityArmoireBinding18 = this.binding;
        if (activityArmoireBinding18 == null) {
            qc.q.z("binding");
            activityArmoireBinding18 = null;
        }
        activityArmoireBinding18.dropRateButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArmoireActivity.onCreate$lambda$7(ArmoireActivity.this, view);
            }
        });
        ActivityArmoireBinding activityArmoireBinding19 = this.binding;
        if (activityArmoireBinding19 == null) {
            qc.q.z("binding");
        } else {
            activityArmoireBinding2 = activityArmoireBinding19;
        }
        activityArmoireBinding2.dropRateButtonUnsubbed.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArmoireActivity.onCreate$lambda$8(ArmoireActivity.this, view);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ArmoireActivityArgs fromBundle = ArmoireActivityArgs.fromBundle(extras);
            qc.q.h(fromBundle, "fromBundle(...)");
            this.equipmentKey = fromBundle.getKey();
            String type = fromBundle.getType();
            qc.q.h(type, "getType(...)");
            String key = fromBundle.getKey();
            qc.q.h(key, "getKey(...)");
            String text = fromBundle.getText();
            qc.q.h(text, "getText(...)");
            configure(type, key, text, fromBundle.getValue());
            if (qc.q.d(fromBundle.getType(), "gear")) {
                BaseViewModelExtensionsKt.observeOnce(getUserViewModel().getUser(), this, new androidx.lifecycle.g0() { // from class: com.habitrpg.android.habitica.ui.activities.f
                    @Override // androidx.lifecycle.g0
                    public final void onChanged(Object obj) {
                        ArmoireActivity.onCreate$lambda$11$lambda$10(ArmoireActivity.this, (User) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, android.app.Activity
    public void onResume() {
        super.onResume();
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new ArmoireActivity$onResume$1(this, null), 1, null);
    }

    public final void setAppConfigManager$Habitica_2311256681_prodRelease(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setInventoryRepository$Habitica_2311256681_prodRelease(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setReviewManager(ReviewManager reviewManager) {
        qc.q.i(reviewManager, "<set-?>");
        this.reviewManager = reviewManager;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }
}
