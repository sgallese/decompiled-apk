package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p0;
import androidx.lifecycle.u0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentViewpagerBinding;
import com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel;
import qc.g0;

/* compiled from: PartyInvitePagerFragment.kt */
/* loaded from: classes4.dex */
public final class PartyInvitePagerFragment extends Hilt_PartyInvitePagerFragment<FragmentViewpagerBinding> {
    public static final int $stable = 8;
    private FragmentViewpagerBinding binding;
    private final dc.f viewModel$delegate;

    public PartyInvitePagerFragment() {
        dc.f a10;
        a10 = dc.h.a(dc.j.NONE, new PartyInvitePagerFragment$special$$inlined$viewModels$default$2(new PartyInvitePagerFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(PartyViewModel.class), new PartyInvitePagerFragment$special$$inlined$viewModels$default$3(a10), new PartyInvitePagerFragment$special$$inlined$viewModels$default$4(null, a10), new PartyInvitePagerFragment$special$$inlined$viewModels$default$5(this, a10));
    }

    private final void setViewPagerAdapter() {
        ViewPager2 viewPager2;
        FragmentViewpagerBinding binding;
        ViewPager2 viewPager22;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        qc.q.h(childFragmentManager, "getChildFragmentManager(...)");
        FragmentViewpagerBinding binding2 = getBinding();
        if (binding2 != null) {
            viewPager2 = binding2.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            final androidx.lifecycle.p lifecycle = getLifecycle();
            viewPager2.setAdapter(new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.PartyInvitePagerFragment$setViewPagerAdapter$1
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public Fragment createFragment(int i10) {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            return new Fragment();
                        }
                        return new PartyInviteFragment();
                    } else if (this.getViewModel$Habitica_2311256681_prodRelease().isLeader()) {
                        return new PartySeekingFragment();
                    } else {
                        return new PartyInviteFragment();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.h
                public int getItemCount() {
                    if (this.getViewModel$Habitica_2311256681_prodRelease().isLeader()) {
                        return 2;
                    }
                    return 1;
                }
            });
        }
        TabLayout tabLayout = getTabLayout();
        if (tabLayout != null && (binding = getBinding()) != null && (viewPager22 = binding.viewPager) != null) {
            new com.google.android.material.tabs.e(tabLayout, viewPager22, new e.b() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.t
                @Override // com.google.android.material.tabs.e.b
                public final void a(TabLayout.g gVar, int i10) {
                    PartyInvitePagerFragment.setViewPagerAdapter$lambda$2$lambda$1$lambda$0(PartyInvitePagerFragment.this, gVar, i10);
                }
            }).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewPagerAdapter$lambda$2$lambda$1$lambda$0(PartyInvitePagerFragment partyInvitePagerFragment, TabLayout.g gVar, int i10) {
        String str;
        qc.q.i(partyInvitePagerFragment, "this$0");
        qc.q.i(gVar, "tab");
        String str2 = null;
        if (i10 != 0) {
            if (i10 != 1) {
                str = "";
                gVar.s(str);
            }
            Context context = partyInvitePagerFragment.getContext();
            if (context != null) {
                str2 = context.getString(R.string.by_invite);
            }
        } else {
            Context context2 = partyInvitePagerFragment.getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.list);
            }
        }
        str = str2;
        gVar.s(str);
    }

    public final PartyViewModel getViewModel$Habitica_2311256681_prodRelease() {
        return (PartyViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setUsesTabLayout(true);
        setHidesToolbar(true);
        setShowsBackButton(true);
        getViewModel$Habitica_2311256681_prodRelease().loadPartyID();
        u0.a(getViewModel$Habitica_2311256681_prodRelease().getGroupData()).j(getViewLifecycleOwner(), new PartyInvitePagerFragment$sam$androidx_lifecycle_Observer$0(new PartyInvitePagerFragment$onCreateView$1(this)));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewPager2 viewPager2;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        setViewPagerAdapter();
        FragmentViewpagerBinding binding = getBinding();
        if (binding != null) {
            viewPager2 = binding.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
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
