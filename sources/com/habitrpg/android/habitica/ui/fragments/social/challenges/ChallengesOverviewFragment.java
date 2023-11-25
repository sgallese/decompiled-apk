package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.databinding.FragmentViewpagerBinding;
import com.habitrpg.android.habitica.ui.activities.ChallengeFormActivity;
import qc.q;

/* compiled from: ChallengesOverviewFragment.kt */
/* loaded from: classes4.dex */
public final class ChallengesOverviewFragment extends Hilt_ChallengesOverviewFragment<FragmentViewpagerBinding> {
    public static final int $stable = 8;
    private FragmentViewpagerBinding binding;
    public ChallengeRepository challengeRepository;
    private FragmentStateAdapter statePagerAdapter;
    private ChallengeListFragment userChallengesFragment = new ChallengeListFragment();
    private ChallengeListFragment availableChallengesFragment = new ChallengeListFragment();

    private final ChallengeListFragment getActiveFragment() {
        ViewPager2 viewPager2;
        FragmentViewpagerBinding binding = getBinding();
        boolean z10 = false;
        if (binding != null && (viewPager2 = binding.viewPager) != null && viewPager2.getCurrentItem() == 0) {
            z10 = true;
        }
        if (z10) {
            return this.userChallengesFragment;
        }
        return this.availableChallengesFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateOptionsMenu$lambda$0(ChallengesOverviewFragment challengesOverviewFragment, View view) {
        q.i(challengesOverviewFragment, "this$0");
        ChallengeListFragment activeFragment = challengesOverviewFragment.getActiveFragment();
        if (activeFragment != null) {
            activeFragment.showFilterDialog$Habitica_2311256681_prodRelease();
        }
    }

    private final void setViewPagerAdapter() {
        ViewPager2 viewPager2;
        FragmentViewpagerBinding binding;
        ViewPager2 viewPager22;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        q.h(childFragmentManager, "getChildFragmentManager(...)");
        final p lifecycle = getLifecycle();
        this.statePagerAdapter = new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengesOverviewFragment$setViewPagerAdapter$1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                ChallengeListFragment challengeListFragment = i10 == 0 ? this.userChallengesFragment : this.availableChallengesFragment;
                if (challengeListFragment == null) {
                    return new Fragment();
                }
                return challengeListFragment;
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
            viewPager2.setAdapter(this.statePagerAdapter);
        }
        TabLayout tabLayout = getTabLayout();
        if (tabLayout != null && (binding = getBinding()) != null && (viewPager22 = binding.viewPager) != null) {
            new com.google.android.material.tabs.e(tabLayout, viewPager22, new e.b() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.j
                @Override // com.google.android.material.tabs.e.b
                public final void a(TabLayout.g gVar, int i10) {
                    ChallengesOverviewFragment.setViewPagerAdapter$lambda$3$lambda$2$lambda$1(ChallengesOverviewFragment.this, gVar, i10);
                }
            }).a();
        }
        FragmentStateAdapter fragmentStateAdapter = this.statePagerAdapter;
        if (fragmentStateAdapter != null) {
            fragmentStateAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewPagerAdapter$lambda$3$lambda$2$lambda$1(ChallengesOverviewFragment challengesOverviewFragment, TabLayout.g gVar, int i10) {
        String string;
        q.i(challengesOverviewFragment, "this$0");
        q.i(gVar, "tab");
        if (i10 != 0) {
            if (i10 != 1) {
                string = "";
            } else {
                string = challengesOverviewFragment.getString(R.string.discover);
            }
        } else {
            string = challengesOverviewFragment.getString(R.string.my_challenges);
        }
        gVar.s(string);
    }

    public final ChallengeRepository getChallengeRepository$Habitica_2311256681_prodRelease() {
        ChallengeRepository challengeRepository = this.challengeRepository;
        if (challengeRepository != null) {
            return challengeRepository;
        }
        q.z("challengeRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        RelativeLayout relativeLayout;
        q.i(menu, "menu");
        q.i(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_list_challenges, menu);
        View a10 = y.a(menu.findItem(R.id.action_search));
        if (a10 instanceof RelativeLayout) {
            relativeLayout = (RelativeLayout) a10;
        } else {
            relativeLayout = null;
        }
        if (relativeLayout != null) {
            TextView textView = (TextView) relativeLayout.findViewById(R.id.badge_textview);
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengesOverviewFragment.onCreateOptionsMenu$lambda$0(ChallengesOverviewFragment.this, view);
                }
            });
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setUsesTabLayout(true);
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getChallengeRepository$Habitica_2311256681_prodRelease().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        q.i(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId != R.id.action_create_challenge) {
            if (itemId != R.id.action_reload) {
                if (itemId != R.id.action_search) {
                    return super.onOptionsItemSelected(menuItem);
                }
                ChallengeListFragment activeFragment = getActiveFragment();
                if (activeFragment != null) {
                    activeFragment.showFilterDialog$Habitica_2311256681_prodRelease();
                }
                return true;
            }
            ChallengeListFragment activeFragment2 = getActiveFragment();
            if (activeFragment2 != null) {
                ChallengeListFragment.retrieveChallengesPage$Habitica_2311256681_prodRelease$default(activeFragment2, false, 1, null);
            }
            return true;
        }
        startActivity(new Intent(getActivity(), ChallengeFormActivity.class));
        return true;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChallengeListFragment activeFragment = getActiveFragment();
        if (activeFragment != null) {
            ChallengeListFragment.retrieveChallengesPage$Habitica_2311256681_prodRelease$default(activeFragment, false, 1, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        ChallengeListFragment challengeListFragment = this.userChallengesFragment;
        if (challengeListFragment != null) {
            challengeListFragment.setViewUserChallengesOnly(true);
        }
        ChallengeListFragment challengeListFragment2 = this.availableChallengesFragment;
        if (challengeListFragment2 != null) {
            challengeListFragment2.setViewUserChallengesOnly(false);
        }
        setViewPagerAdapter();
    }

    public final void setChallengeRepository$Habitica_2311256681_prodRelease(ChallengeRepository challengeRepository) {
        q.i(challengeRepository, "<set-?>");
        this.challengeRepository = challengeRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentViewpagerBinding inflate = FragmentViewpagerBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
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
