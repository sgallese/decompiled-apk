package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.fragments.purchases.GemsPurchaseFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment;

/* compiled from: GemPurchaseActivity.kt */
/* loaded from: classes4.dex */
public final class GemPurchaseActivity extends Hilt_GemPurchaseActivity {
    public static final int $stable = 0;

    private final void createFragment(boolean z10) {
        Fragment gemsPurchaseFragment;
        if (z10) {
            gemsPurchaseFragment = new SubscriptionFragment();
        } else {
            gemsPurchaseFragment = new GemsPurchaseFragment();
        }
        getSupportFragmentManager().q().s(R.id.fragment_container, gemsPurchaseFragment).j();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_gem_purchase);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        super.onCreate(bundle);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.u(true);
        }
        androidx.appcompat.app.a supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.E("");
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("openSubscription")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Bundle extras2 = getIntent().getExtras();
            if (extras2 != null && !extras2.getBoolean("openSubscription")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                createFragment(false);
                return;
            } else {
                createFragment(true);
                return;
            }
        }
        createFragment(true);
    }
}
