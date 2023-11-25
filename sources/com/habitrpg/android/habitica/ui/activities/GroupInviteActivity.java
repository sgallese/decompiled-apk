package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityPartyInviteBinding;
import com.habitrpg.android.habitica.ui.fragments.social.party.PartyInviteFragment;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtilKt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GroupInviteActivity.kt */
/* loaded from: classes4.dex */
public final class GroupInviteActivity extends Hilt_GroupInviteActivity {
    public static final String EMAILS_KEY = "emails";
    public static final String IS_EMAIL_KEY = "isEmail";
    public static final int RESULT_SEND_INVITES = 100;
    public static final String USER_IDS_KEY = "userIDs";
    private ActivityPartyInviteBinding binding;
    private List<PartyInviteFragment> fragments = new ArrayList();
    public SocialRepository socialRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GroupInviteActivity.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    private final Intent createResultIntent() {
        Intent intent = new Intent();
        this.fragments.size();
        return intent;
    }

    private final void setViewPagerAdapter() {
        final FragmentManager supportFragmentManager = getSupportFragmentManager();
        qc.q.h(supportFragmentManager, "getSupportFragmentManager(...)");
        final androidx.lifecycle.p lifecycle = getLifecycle();
        FragmentStateAdapter fragmentStateAdapter = new FragmentStateAdapter(supportFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.activities.GroupInviteActivity$setViewPagerAdapter$statePagerAdapter$1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                PartyInviteFragment partyInviteFragment = new PartyInviteFragment();
                this.getFragments$Habitica_2311256681_prodRelease().add(partyInviteFragment);
                return partyInviteFragment;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public int getItemCount() {
                return 2;
            }
        };
        ActivityPartyInviteBinding activityPartyInviteBinding = this.binding;
        ActivityPartyInviteBinding activityPartyInviteBinding2 = null;
        if (activityPartyInviteBinding == null) {
            qc.q.z("binding");
            activityPartyInviteBinding = null;
        }
        activityPartyInviteBinding.viewPager.setAdapter(fragmentStateAdapter);
        ActivityPartyInviteBinding activityPartyInviteBinding3 = this.binding;
        if (activityPartyInviteBinding3 == null) {
            qc.q.z("binding");
            activityPartyInviteBinding3 = null;
        }
        TabLayout tabLayout = activityPartyInviteBinding3.tabLayout;
        ActivityPartyInviteBinding activityPartyInviteBinding4 = this.binding;
        if (activityPartyInviteBinding4 == null) {
            qc.q.z("binding");
        } else {
            activityPartyInviteBinding2 = activityPartyInviteBinding4;
        }
        new com.google.android.material.tabs.e(tabLayout, activityPartyInviteBinding2.viewPager, new e.b() { // from class: com.habitrpg.android.habitica.ui.activities.w0
            @Override // com.google.android.material.tabs.e.b
            public final void a(TabLayout.g gVar, int i10) {
                GroupInviteActivity.setViewPagerAdapter$lambda$0(GroupInviteActivity.this, gVar, i10);
            }
        }).a();
        fragmentStateAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewPagerAdapter$lambda$0(GroupInviteActivity groupInviteActivity, TabLayout.g gVar, int i10) {
        String string;
        qc.q.i(groupInviteActivity, "this$0");
        qc.q.i(gVar, "tab");
        if (i10 != 0) {
            if (i10 != 1) {
                string = "";
            } else {
                string = groupInviteActivity.getString(R.string.by_email);
            }
        } else {
            string = groupInviteActivity.getString(R.string.invite_existing_users);
        }
        gVar.s(string);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityPartyInviteBinding inflate = ActivityPartyInviteBinding.inflate(getLayoutInflater());
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

    public final List<PartyInviteFragment> getFragments$Habitica_2311256681_prodRelease() {
        return this.fragments;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_party_invite);
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
        setupToolbar((Toolbar) findViewById(R.id.toolbar));
        ActivityPartyInviteBinding activityPartyInviteBinding = this.binding;
        if (activityPartyInviteBinding == null) {
            qc.q.z("binding");
            activityPartyInviteBinding = null;
        }
        activityPartyInviteBinding.viewPager.setCurrentItem(0);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.E(null);
        }
        setViewPagerAdapter();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        qc.q.i(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_party_invite, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            if (itemId != R.id.action_send_invites) {
                return super.onOptionsItemSelected(menuItem);
            }
            setResult(-1, createResultIntent());
            KeyboardUtilKt.dismissKeyboard(this);
            return true;
        }
        onBackPressed();
        return true;
    }

    public final void setFragments$Habitica_2311256681_prodRelease(List<PartyInviteFragment> list) {
        qc.q.i(list, "<set-?>");
        this.fragments = list;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }
}
