package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentViewpagerBinding;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.activities.GroupFormActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.fragments.social.PartyChatFragment;
import com.habitrpg.android.habitica.ui.viewmodels.GroupViewType;
import com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import java.util.List;
import qc.g0;
import yc.v;

/* compiled from: PartyFragment.kt */
/* loaded from: classes4.dex */
public final class PartyFragment extends Hilt_PartyFragment<FragmentViewpagerBinding> {
    public static final int $stable = 8;
    private FragmentViewpagerBinding binding;
    private PartyDetailFragment detailFragment;
    private final androidx.activity.result.b<Intent> groupFormResult;
    private final dc.f viewModel$delegate;
    private FragmentStateAdapter viewPagerAdapter;

    public PartyFragment() {
        dc.f a10;
        a10 = dc.h.a(dc.j.NONE, new PartyFragment$special$$inlined$viewModels$default$2(new PartyFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(PartyViewModel.class), new PartyFragment$special$$inlined$viewModels$default$3(a10), new PartyFragment$special$$inlined$viewModels$default$4(null, a10), new PartyFragment$special$$inlined$viewModels$default$5(this, a10));
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.q
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                PartyFragment.groupFormResult$lambda$2(PartyFragment.this, (ActivityResult) obj);
            }
        });
        qc.q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.groupFormResult = registerForActivityResult;
    }

    private final void displayEditForm() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        Bundle bundle = new Bundle();
        Group f10 = getViewModel$Habitica_2311256681_prodRelease().getGroupData().f();
        String str5 = null;
        if (f10 != null) {
            str = f10.getId();
        } else {
            str = null;
        }
        bundle.putString("groupID", str);
        if (f10 != null) {
            str2 = f10.getName();
        } else {
            str2 = null;
        }
        bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        if (f10 != null) {
            str3 = f10.getType();
        } else {
            str3 = null;
        }
        bundle.putString("groupType", str3);
        if (f10 != null) {
            str4 = f10.getDescription();
        } else {
            str4 = null;
        }
        bundle.putString("description", str4);
        if (f10 != null) {
            str5 = f10.getLeaderID();
        }
        bundle.putString("leader", str5);
        if (f10 != null) {
            z10 = f10.getLeaderOnlyChallenges();
        } else {
            z10 = false;
        }
        bundle.putBoolean("leaderCreateChallenge", z10);
        Intent intent = new Intent(getMainActivity(), GroupFormActivity.class);
        intent.putExtras(bundle);
        intent.setFlags(131072);
        this.groupFormResult.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void groupFormResult$lambda$2(PartyFragment partyFragment, ActivityResult activityResult) {
        Bundle bundle;
        qc.q.i(partyFragment, "this$0");
        if (activityResult.b() == -1) {
            PartyViewModel viewModel$Habitica_2311256681_prodRelease = partyFragment.getViewModel$Habitica_2311256681_prodRelease();
            Intent a10 = activityResult.a();
            if (a10 != null) {
                bundle = a10.getExtras();
            } else {
                bundle = null;
            }
            viewModel$Habitica_2311256681_prodRelease.updateOrCreateGroup(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(PartyFragment partyFragment, PartyFragmentArgs partyFragmentArgs) {
        ViewPager2 viewPager2;
        qc.q.i(partyFragment, "this$0");
        qc.q.i(partyFragmentArgs, "$args");
        FragmentViewpagerBinding binding = partyFragment.getBinding();
        if (binding != null) {
            viewPager2 = binding.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(partyFragmentArgs.getTabToOpen());
        }
    }

    private final void setViewPagerAdapter() {
        ViewPager2 viewPager2;
        FragmentViewpagerBinding binding;
        ViewPager2 viewPager22;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        qc.q.h(childFragmentManager, "getChildFragmentManager(...)");
        final androidx.lifecycle.p lifecycle = getLifecycle();
        this.viewPagerAdapter = new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.PartyFragment$setViewPagerAdapter$1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                Fragment fragment;
                if (i10 != 0) {
                    if (i10 != 1) {
                        fragment = new Fragment();
                    } else {
                        fragment = new PartyChatFragment();
                    }
                } else {
                    this.detailFragment = new PartyDetailFragment();
                    fragment = this.detailFragment;
                }
                if (fragment == null) {
                    return new Fragment();
                }
                return fragment;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public int getItemCount() {
                return 2;
            }
        };
        FragmentViewpagerBinding binding2 = getBinding();
        if (binding2 != null) {
            viewPager2 = binding2.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            viewPager2.setAdapter(this.viewPagerAdapter);
        }
        TabLayout tabLayout = getTabLayout();
        if (tabLayout != null && (binding = getBinding()) != null && (viewPager22 = binding.viewPager) != null) {
            new com.google.android.material.tabs.e(tabLayout, viewPager22, new e.b() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.p
                @Override // com.google.android.material.tabs.e.b
                public final void a(TabLayout.g gVar, int i10) {
                    PartyFragment.setViewPagerAdapter$lambda$5$lambda$4$lambda$3(PartyFragment.this, gVar, i10);
                }
            }).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewPagerAdapter$lambda$5$lambda$4$lambda$3(PartyFragment partyFragment, TabLayout.g gVar, int i10) {
        String str;
        qc.q.i(partyFragment, "this$0");
        qc.q.i(gVar, "tab");
        String str2 = null;
        if (i10 != 0) {
            if (i10 != 1) {
                str = "";
                gVar.s(str);
            }
            Context context = partyFragment.getContext();
            if (context != null) {
                str2 = context.getString(R.string.chat);
            }
        } else {
            Context context2 = partyFragment.getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.party);
            }
        }
        str = str2;
        gVar.s(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGroupUI(Group group) {
        FragmentStateAdapter fragmentStateAdapter = this.viewPagerAdapter;
        if (fragmentStateAdapter != null) {
            fragmentStateAdapter.notifyDataSetChanged();
        }
        if (group == null) {
            TabLayout tabLayout = getTabLayout();
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
                return;
            }
            return;
        }
        TabLayout tabLayout2 = getTabLayout();
        if (tabLayout2 != null) {
            tabLayout2.setVisibility(0);
        }
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.invalidateOptionsMenu();
        }
    }

    public final PartyViewModel getViewModel$Habitica_2311256681_prodRelease() {
        return (PartyViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        qc.q.i(menu, "menu");
        qc.q.i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        Group f10 = getViewModel$Habitica_2311256681_prodRelease().getGroupData().f();
        if (getViewModel$Habitica_2311256681_prodRelease().isLeader()) {
            menuInflater.inflate(R.menu.menu_party_admin, menu);
            MenuItem findItem = menu.findItem(R.id.menu_guild_leave);
            boolean z10 = false;
            if (f10 != null && f10.getMemberCount() == 1) {
                z10 = true;
            }
            findItem.setVisible(!z10);
            return;
        }
        menuInflater.inflate(R.menu.menu_party, menu);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setUsesTabLayout(true);
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        switch (menuItem.getItemId()) {
            case R.id.menu_guild_edit /* 2131297048 */:
                displayEditForm();
                return true;
            case R.id.menu_guild_join /* 2131297049 */:
            case R.id.menuHeaderView /* 2131297051 */:
            case R.id.menu_create_item /* 2131297052 */:
            default:
                return super.onOptionsItemSelected(menuItem);
            case R.id.menu_guild_leave /* 2131297050 */:
                PartyDetailFragment partyDetailFragment = this.detailFragment;
                if (partyDetailFragment != null) {
                    partyDetailFragment.leaveParty$Habitica_2311256681_prodRelease();
                }
                return true;
            case R.id.menu_guild_refresh /* 2131297053 */:
                getViewModel$Habitica_2311256681_prodRelease().retrieveGroupChat(PartyFragment$onOptionsItemSelected$1.INSTANCE);
                getViewModel$Habitica_2311256681_prodRelease().retrieveGroup(PartyFragment$onOptionsItemSelected$2.INSTANCE);
                return true;
            case R.id.menu_invite_item /* 2131297054 */:
                MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.partyInvitationFragment, null, 2, null);
                return true;
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        List<String> d10;
        if (getViewModel$Habitica_2311256681_prodRelease().isLeader()) {
            setTutorialStepIdentifier(NavigationDrawerFragment.SIDEBAR_PARTY);
            String string = getString(R.string.tutorial_party_created);
            qc.q.h(string, "getString(...)");
            d10 = ec.s.d(string);
            setTutorialTexts(d10);
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewPager2 viewPager2;
        boolean u10;
        ViewPager2 viewPager22;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel$Habitica_2311256681_prodRelease().setGroupViewType(GroupViewType.PARTY);
        getViewModel$Habitica_2311256681_prodRelease().getGroupData().j(getViewLifecycleOwner(), new PartyFragment$sam$androidx_lifecycle_Observer$0(new PartyFragment$onViewCreated$1(this)));
        FragmentViewpagerBinding binding = getBinding();
        if (binding != null) {
            viewPager2 = binding.viewPager;
        } else {
            viewPager2 = null;
        }
        boolean z10 = false;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
        setViewPagerAdapter();
        Bundle arguments = getArguments();
        if (arguments != null) {
            final PartyFragmentArgs fromBundle = PartyFragmentArgs.fromBundle(arguments);
            qc.q.h(fromBundle, "fromBundle(...)");
            FragmentViewpagerBinding binding2 = getBinding();
            if (binding2 != null && (viewPager22 = binding2.viewPager) != null) {
                viewPager22.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        PartyFragment.onViewCreated$lambda$1$lambda$0(PartyFragment.this, fromBundle);
                    }
                });
            }
            String partyID = fromBundle.getPartyID();
            if (partyID != null) {
                qc.q.f(partyID);
                u10 = v.u(partyID);
                if ((!u10) == true) {
                    z10 = true;
                }
            }
            if (z10) {
                PartyViewModel viewModel$Habitica_2311256681_prodRelease = getViewModel$Habitica_2311256681_prodRelease();
                String partyID2 = fromBundle.getPartyID();
                if (partyID2 == null) {
                    partyID2 = "";
                }
                qc.q.f(partyID2);
                viewModel$Habitica_2311256681_prodRelease.setGroupID(partyID2);
            }
        }
        getViewModel$Habitica_2311256681_prodRelease().loadPartyID();
        getViewModel$Habitica_2311256681_prodRelease().retrieveGroup(PartyFragment$onViewCreated$3.INSTANCE);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentViewpagerBinding inflate = FragmentViewpagerBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentViewpagerBinding fragmentViewpagerBinding) {
        this.binding = fragmentViewpagerBinding;
    }
}
