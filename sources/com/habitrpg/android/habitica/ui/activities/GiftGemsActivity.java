package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityGiftGemsBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.fragments.purchases.GiftBalanceGemsFragment;
import com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment;
import com.habitrpg.android.habitica.ui.views.CurrencyView;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;

/* compiled from: GiftGemsActivity.kt */
/* loaded from: classes4.dex */
public final class GiftGemsActivity extends Hilt_GiftGemsActivity {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private GiftBalanceGemsFragment balanceFragment;
    private ActivityGiftGemsBinding binding;
    private final dc.f currencyView$delegate;
    private Member giftedMember;
    private String giftedUserID;
    private String giftedUsername;
    private GiftPurchaseGemsFragment purchaseFragment;
    public PurchaseHandler purchaseHandler;
    public SocialRepository socialRepository;

    public GiftGemsActivity() {
        dc.f b10;
        b10 = dc.h.b(new GiftGemsActivity$currencyView$2(this));
        this.currencyView$delegate = b10;
    }

    private final void setViewPagerAdapter() {
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        final androidx.lifecycle.p lifecycle = getLifecycle();
        FragmentStateAdapter fragmentStateAdapter = new FragmentStateAdapter(supportFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.activities.GiftGemsActivity$setViewPagerAdapter$statePagerAdapter$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                GiftBalanceGemsFragment giftBalanceGemsFragment;
                Member member;
                GiftBalanceGemsFragment giftBalanceGemsFragment2;
                GiftPurchaseGemsFragment giftPurchaseGemsFragment;
                Member member2;
                if (i10 == 0) {
                    GiftPurchaseGemsFragment giftPurchaseGemsFragment2 = new GiftPurchaseGemsFragment();
                    giftPurchaseGemsFragment2.setPurchaseHandler(GiftGemsActivity.this.getPurchaseHandler());
                    giftPurchaseGemsFragment2.setupCheckout();
                    GiftGemsActivity.this.purchaseFragment = giftPurchaseGemsFragment2;
                    giftPurchaseGemsFragment = GiftGemsActivity.this.purchaseFragment;
                    giftBalanceGemsFragment2 = giftPurchaseGemsFragment2;
                    if (giftPurchaseGemsFragment != null) {
                        member2 = GiftGemsActivity.this.giftedMember;
                        giftPurchaseGemsFragment.setGiftedMember(member2);
                        giftBalanceGemsFragment2 = giftPurchaseGemsFragment2;
                    }
                } else {
                    GiftBalanceGemsFragment giftBalanceGemsFragment3 = new GiftBalanceGemsFragment();
                    GiftGemsActivity.this.balanceFragment = giftBalanceGemsFragment3;
                    giftBalanceGemsFragment = GiftGemsActivity.this.balanceFragment;
                    giftBalanceGemsFragment2 = giftBalanceGemsFragment3;
                    if (giftBalanceGemsFragment != null) {
                        member = GiftGemsActivity.this.giftedMember;
                        giftBalanceGemsFragment.setGiftedMember(member);
                        giftBalanceGemsFragment2 = giftBalanceGemsFragment3;
                    }
                }
                return giftBalanceGemsFragment2;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public int getItemCount() {
                return 2;
            }
        };
        ActivityGiftGemsBinding activityGiftGemsBinding = this.binding;
        ActivityGiftGemsBinding activityGiftGemsBinding2 = null;
        if (activityGiftGemsBinding == null) {
            qc.q.z("binding");
            activityGiftGemsBinding = null;
        }
        activityGiftGemsBinding.viewPager.setAdapter(fragmentStateAdapter);
        ActivityGiftGemsBinding activityGiftGemsBinding3 = this.binding;
        if (activityGiftGemsBinding3 == null) {
            qc.q.z("binding");
            activityGiftGemsBinding3 = null;
        }
        TabLayout tabLayout = activityGiftGemsBinding3.tabLayout;
        ActivityGiftGemsBinding activityGiftGemsBinding4 = this.binding;
        if (activityGiftGemsBinding4 == null) {
            qc.q.z("binding");
        } else {
            activityGiftGemsBinding2 = activityGiftGemsBinding4;
        }
        new com.google.android.material.tabs.e(tabLayout, activityGiftGemsBinding2.viewPager, new e.b() { // from class: com.habitrpg.android.habitica.ui.activities.p0
            @Override // com.google.android.material.tabs.e.b
            public final void a(TabLayout.g gVar, int i10) {
                GiftGemsActivity.setViewPagerAdapter$lambda$0(GiftGemsActivity.this, gVar, i10);
            }
        }).a();
        fragmentStateAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewPagerAdapter$lambda$0(GiftGemsActivity giftGemsActivity, TabLayout.g gVar, int i10) {
        String string;
        qc.q.i(giftGemsActivity, "this$0");
        qc.q.i(gVar, "tab");
        if (i10 != 0) {
            if (i10 != 1) {
                string = "";
            } else {
                string = giftGemsActivity.getString(R.string.from_balance);
            }
        } else {
            string = giftGemsActivity.getString(R.string.purchase);
        }
        gVar.s(string);
    }

    public final AppConfigManager getAppConfigManager() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("appConfigManager");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityGiftGemsBinding inflate = ActivityGiftGemsBinding.inflate(getLayoutInflater());
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

    public final CurrencyView getCurrencyView$Habitica_2311256681_prodRelease() {
        return (CurrencyView) this.currencyView$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_gift_gems);
    }

    public final PurchaseHandler getPurchaseHandler() {
        PurchaseHandler purchaseHandler = this.purchaseHandler;
        if (purchaseHandler != null) {
            return purchaseHandler;
        }
        qc.q.z("purchaseHandler");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.gift_gems);
        ActivityGiftGemsBinding activityGiftGemsBinding = this.binding;
        if (activityGiftGemsBinding == null) {
            qc.q.z("binding");
            activityGiftGemsBinding = null;
        }
        setSupportActionBar(activityGiftGemsBinding.toolbar);
        ActivityGiftGemsBinding activityGiftGemsBinding2 = this.binding;
        if (activityGiftGemsBinding2 == null) {
            qc.q.z("binding");
            activityGiftGemsBinding2 = null;
        }
        activityGiftGemsBinding2.toolbarAccessoryContainer.addView(getCurrencyView$Habitica_2311256681_prodRelease());
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.u(true);
        }
        this.giftedUserID = getIntent().getStringExtra("userID");
        String stringExtra = getIntent().getStringExtra("username");
        this.giftedUsername = stringExtra;
        if (this.giftedUserID == null && stringExtra == null) {
            this.giftedUserID = ((GiftGemsActivityArgs) new k3.g(qc.g0.b(GiftGemsActivityArgs.class), new GiftGemsActivity$onCreate$$inlined$navArgs$1(this)).getValue()).getUserID();
            this.giftedUsername = ((GiftGemsActivityArgs) new k3.g(qc.g0.b(GiftGemsActivityArgs.class), new GiftGemsActivity$onCreate$$inlined$navArgs$2(this)).getValue()).getUsername();
        }
        setViewPagerAdapter();
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new GiftGemsActivity$onCreate$1(this, null), 2, null);
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setPurchaseHandler(PurchaseHandler purchaseHandler) {
        qc.q.i(purchaseHandler, "<set-?>");
        this.purchaseHandler = purchaseHandler;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }
}
