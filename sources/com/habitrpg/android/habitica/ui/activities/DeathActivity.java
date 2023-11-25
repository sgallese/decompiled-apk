package com.habitrpg.android.habitica.ui.activities;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.m;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.ActivityDeathBinding;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.helpers.AdHandler;
import com.habitrpg.android.habitica.helpers.AdType;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.android.habitica.ui.views.ads.AdButton;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.helpers.Animations;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import java.util.Date;

/* compiled from: DeathActivity.kt */
/* loaded from: classes4.dex */
public final class DeathActivity extends Hilt_DeathActivity implements SnackbarActivity {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private ActivityDeathBinding binding;
    public InventoryRepository inventoryRepository;
    public SharedPreferences sharedPreferences;
    public MainUserViewModel userViewModel;

    private final void makeCoins(int i10) {
        int[] iArr = {0, 0};
        ActivityDeathBinding activityDeathBinding = this.binding;
        ActivityDeathBinding activityDeathBinding2 = null;
        if (activityDeathBinding == null) {
            qc.q.z("binding");
            activityDeathBinding = null;
        }
        activityDeathBinding.heartView.getLocationOnScreen(iArr);
        ActivityDeathBinding activityDeathBinding3 = this.binding;
        if (activityDeathBinding3 == null) {
            qc.q.z("binding");
            activityDeathBinding3 = null;
        }
        ma.d y10 = new ma.d(activityDeathBinding3.confettiContainer, 14, new BitmapDrawable(getResources(), HabiticaIconsHelper.imageOfGold()), 5000L).s(0, m.e.DEFAULT_DRAG_ANIMATION_DURATION).w(0.5f, 0.8f).z(0.01f, 0.03f).r(4000L, new AccelerateInterpolator()).y(0.01f, 0.03f, i10, i10 + 80);
        ActivityDeathBinding activityDeathBinding4 = this.binding;
        if (activityDeathBinding4 == null) {
            qc.q.z("binding");
            activityDeathBinding4 = null;
        }
        int width = activityDeathBinding4.getRoot().getWidth() / 2;
        int i11 = iArr[1];
        ActivityDeathBinding activityDeathBinding5 = this.binding;
        if (activityDeathBinding5 == null) {
            qc.q.z("binding");
        } else {
            activityDeathBinding2 = activityDeathBinding5;
        }
        y10.j(width, i11 + (activityDeathBinding2.heartView.getHeight() / 2), 3, 6000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(DeathActivity deathActivity, User user) {
        Stats stats;
        Double gp;
        Stats stats2;
        Integer lvl;
        qc.q.i(deathActivity, "this$0");
        ActivityDeathBinding activityDeathBinding = deathActivity.binding;
        Integer num = null;
        if (activityDeathBinding == null) {
            qc.q.z("binding");
            activityDeathBinding = null;
        }
        TextView textView = activityDeathBinding.lossDescription;
        int i10 = 2;
        Object[] objArr = new Object[2];
        if (user != null && (stats2 = user.getStats()) != null && (lvl = stats2.getLvl()) != null) {
            i10 = lvl.intValue();
        }
        objArr[0] = Integer.valueOf(i10 - 1);
        if (user != null && (stats = user.getStats()) != null && (gp = stats.getGp()) != null) {
            num = Integer.valueOf((int) gp.doubleValue());
        }
        objArr[1] = num;
        String string = deathActivity.getString(R.string.faint_loss_description, objArr);
        qc.q.h(string, "getString(...)");
        textView.setText(StringExtensionsKt.fromHtml(string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(DeathActivity deathActivity, AdHandler adHandler, View view) {
        qc.q.i(deathActivity, "this$0");
        qc.q.i(adHandler, "$handler");
        ActivityDeathBinding activityDeathBinding = deathActivity.binding;
        if (activityDeathBinding == null) {
            qc.q.z("binding");
            activityDeathBinding = null;
        }
        activityDeathBinding.adButton.setState(AdButton.State.LOADING);
        adHandler.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(DeathActivity deathActivity, View view) {
        qc.q.i(deathActivity, "this$0");
        Analytics.sendEvent$default(Analytics.INSTANCE, "second chance perk", EventCategory.BEHAVIOUR, HitType.EVENT, null, null, 24, null);
        SharedPreferences.Editor edit = deathActivity.getSharedPreferences().edit();
        edit.putLong("last_sub_revive", new Date().getTime());
        edit.apply();
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(deathActivity), null, new DeathActivity$onCreate$5$2(deathActivity, null), 1, null);
        ad.i.d(androidx.lifecycle.w.a(deathActivity), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new DeathActivity$onCreate$5$3(deathActivity, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(DeathActivity deathActivity, View view) {
        qc.q.i(deathActivity, "this$0");
        ActivityDeathBinding activityDeathBinding = deathActivity.binding;
        if (activityDeathBinding == null) {
            qc.q.z("binding");
            activityDeathBinding = null;
        }
        activityDeathBinding.restartButton.setEnabled(false);
        ad.i.d(androidx.lifecycle.w.a(deathActivity), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new DeathActivity$onCreate$6$1(deathActivity, null), 2, null);
    }

    private final void startAnimating() {
        ActivityDeathBinding activityDeathBinding = this.binding;
        ActivityDeathBinding activityDeathBinding2 = null;
        if (activityDeathBinding == null) {
            qc.q.z("binding");
            activityDeathBinding = null;
        }
        activityDeathBinding.ghostView.startAnimation(Animations.bobbingAnimation$default(Animations.INSTANCE, 0.0f, 1, null));
        ActivityDeathBinding activityDeathBinding3 = this.binding;
        if (activityDeathBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityDeathBinding2 = activityDeathBinding3;
        }
        activityDeathBinding2.heartView.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.activities.g0
            @Override // java.lang.Runnable
            public final void run() {
                DeathActivity.startAnimating$lambda$5(DeathActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimating$lambda$5(DeathActivity deathActivity) {
        qc.q.i(deathActivity, "this$0");
        deathActivity.makeCoins(305);
        deathActivity.makeCoins(160);
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
        ActivityDeathBinding inflate = ActivityDeathBinding.inflate(getLayoutInflater());
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
        return Integer.valueOf((int) R.layout.activity_death);
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        qc.q.z("sharedPreferences");
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseViewModelExtensionsKt.observeOnce(getUserViewModel().getUser(), this, new androidx.lifecycle.g0() { // from class: com.habitrpg.android.habitica.ui.activities.c0
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                DeathActivity.onCreate$lambda$0(DeathActivity.this, (User) obj);
            }
        });
        ActivityDeathBinding activityDeathBinding = null;
        if (getAppConfigManager$Habitica_2311256681_prodRelease().enableFaintAds()) {
            AdType adType = AdType.FAINT;
            final AdHandler adHandler = new AdHandler(this, adType, new DeathActivity$onCreate$handler$1(this));
            adHandler.prepare(new DeathActivity$onCreate$2(this));
            ActivityDeathBinding activityDeathBinding2 = this.binding;
            if (activityDeathBinding2 == null) {
                qc.q.z("binding");
                activityDeathBinding2 = null;
            }
            activityDeathBinding2.adButton.updateForAdType(adType, androidx.lifecycle.w.a(this));
            ActivityDeathBinding activityDeathBinding3 = this.binding;
            if (activityDeathBinding3 == null) {
                qc.q.z("binding");
                activityDeathBinding3 = null;
            }
            activityDeathBinding3.adButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeathActivity.onCreate$lambda$1(DeathActivity.this, adHandler, view);
                }
            });
        } else {
            ActivityDeathBinding activityDeathBinding4 = this.binding;
            if (activityDeathBinding4 == null) {
                qc.q.z("binding");
                activityDeathBinding4 = null;
            }
            activityDeathBinding4.adButton.setVisibility(8);
        }
        if (getAppConfigManager$Habitica_2311256681_prodRelease().enableFaintSubs()) {
            getUserViewModel().getUser().j(this, new DeathActivity$sam$androidx_lifecycle_Observer$0(new DeathActivity$onCreate$4(this)));
        } else {
            ActivityDeathBinding activityDeathBinding5 = this.binding;
            if (activityDeathBinding5 == null) {
                qc.q.z("binding");
                activityDeathBinding5 = null;
            }
            activityDeathBinding5.reviveSubscriberWrapper.setVisibility(8);
            ActivityDeathBinding activityDeathBinding6 = this.binding;
            if (activityDeathBinding6 == null) {
                qc.q.z("binding");
                activityDeathBinding6 = null;
            }
            activityDeathBinding6.unsubbedWrapper.setVisibility(8);
            ActivityDeathBinding activityDeathBinding7 = this.binding;
            if (activityDeathBinding7 == null) {
                qc.q.z("binding");
                activityDeathBinding7 = null;
            }
            activityDeathBinding7.subscriberBenefitUsedView.setVisibility(8);
        }
        ActivityDeathBinding activityDeathBinding8 = this.binding;
        if (activityDeathBinding8 == null) {
            qc.q.z("binding");
            activityDeathBinding8 = null;
        }
        activityDeathBinding8.reviveSubscriberButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeathActivity.onCreate$lambda$3(DeathActivity.this, view);
            }
        });
        ActivityDeathBinding activityDeathBinding9 = this.binding;
        if (activityDeathBinding9 == null) {
            qc.q.z("binding");
        } else {
            activityDeathBinding = activityDeathBinding9;
        }
        activityDeathBinding.restartButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeathActivity.onCreate$lambda$4(DeathActivity.this, view);
            }
        });
        startAnimating();
    }

    public final void setAppConfigManager$Habitica_2311256681_prodRelease(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setInventoryRepository$Habitica_2311256681_prodRelease(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        qc.q.i(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.views.SnackbarActivity
    public void showSnackbar(Drawable drawable, CharSequence charSequence, CharSequence charSequence2, View view, Drawable drawable2, Integer num, String str, HabiticaSnackbar.SnackbarDisplayType snackbarDisplayType, boolean z10) {
        SnackbarActivity.DefaultImpls.showSnackbar(this, drawable, charSequence, charSequence2, view, drawable2, num, str, snackbarDisplayType, z10);
    }

    @Override // com.habitrpg.android.habitica.ui.views.SnackbarActivity
    public ViewGroup snackbarContainer() {
        ActivityDeathBinding activityDeathBinding = this.binding;
        if (activityDeathBinding == null) {
            qc.q.z("binding");
            activityDeathBinding = null;
        }
        FrameLayout frameLayout = activityDeathBinding.snackbarContainer;
        qc.q.h(frameLayout, "snackbarContainer");
        return frameLayout;
    }
}
