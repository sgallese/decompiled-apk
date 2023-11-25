package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.adapter.social.ChallengesListViewAdapter;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeFilterDialogHolder;
import com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengesOverviewFragmentDirections;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.EmptyItem;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: ChallengeListFragment.kt */
/* loaded from: classes4.dex */
public final class ChallengeListFragment extends Hilt_ChallengeListFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    public static final int $stable = 8;
    private FragmentRefreshRecyclerviewBinding binding;
    private ChallengesListViewAdapter challengeAdapter;
    public ChallengeRepository challengeRepository;
    private List<? extends Challenge> challenges;
    private List<Group> filterGroups;
    private ChallengeFilterOptions filterOptions;
    private boolean loadedAllData;
    private int nextPageToLoad;
    public SocialRepository socialRepository;
    public UserRepository userRepository;
    public MainUserViewModel userViewModel;
    private boolean viewUserChallengesOnly;

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeFilter(ChallengeFilterOptions challengeFilterOptions) {
        this.filterOptions = challengeFilterOptions;
        ChallengesListViewAdapter challengesListViewAdapter = this.challengeAdapter;
        if (challengesListViewAdapter != null) {
            challengesListViewAdapter.filter(challengeFilterOptions);
        }
    }

    private final void loadLocalChallenges() {
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ChallengeListFragment$loadLocalChallenges$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openDetailFragment(String str) {
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        ChallengesOverviewFragmentDirections.OpenChallengeDetail openChallengeDetail = ChallengesOverviewFragmentDirections.openChallengeDetail(str);
        q.h(openChallengeDetail, "openChallengeDetail(...)");
        mainNavigationController.navigate(openChallengeDetail);
    }

    public static /* synthetic */ void retrieveChallengesPage$Habitica_2311256681_prodRelease$default(ChallengeListFragment challengeListFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        challengeListFragment.retrieveChallengesPage$Habitica_2311256681_prodRelease(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshing(boolean z10) {
        SwipeRefreshLayout swipeRefreshLayout;
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null) {
            swipeRefreshLayout = binding.refreshLayout;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(z10);
        }
    }

    public final ChallengeRepository getChallengeRepository() {
        ChallengeRepository challengeRepository = this.challengeRepository;
        if (challengeRepository != null) {
            return challengeRepository;
        }
        q.z("challengeRepository");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        q.z("socialRepository");
        return null;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getChallengeRepository().close();
        super.onDestroy();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        this.nextPageToLoad = 0;
        this.loadedAllData = false;
        retrieveChallengesPage$Habitica_2311256681_prodRelease(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        FragmentRefreshRecyclerviewBinding binding;
        RecyclerViewEmptySupport recyclerViewEmptySupport4;
        RecyclerViewEmptySupport recyclerViewEmptySupport5;
        SwipeRefreshLayout swipeRefreshLayout;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        ChallengesListViewAdapter challengesListViewAdapter = new ChallengesListViewAdapter(this.viewUserChallengesOnly, getUserViewModel().getUserID());
        this.challengeAdapter = challengesListViewAdapter;
        challengesListViewAdapter.setOnOpenChallengeFragment(new ChallengeListFragment$onViewCreated$1(this));
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null && (swipeRefreshLayout = binding2.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        RecyclerViewEmptySupport recyclerViewEmptySupport6 = null;
        if (this.viewUserChallengesOnly) {
            FragmentRefreshRecyclerviewBinding binding3 = getBinding();
            if (binding3 != null) {
                recyclerViewEmptySupport5 = binding3.recyclerView;
            } else {
                recyclerViewEmptySupport5 = null;
            }
            if (recyclerViewEmptySupport5 != null) {
                String string = getString(R.string.empty_challenge_list);
                q.h(string, "getString(...)");
                recyclerViewEmptySupport5.setEmptyItem(new EmptyItem(string, getString(R.string.empty_discover_description), null, false, null, 28, null));
            }
        }
        FragmentRefreshRecyclerviewBinding binding4 = getBinding();
        if (binding4 != null) {
            recyclerViewEmptySupport = binding4.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        FragmentRefreshRecyclerviewBinding binding5 = getBinding();
        if (binding5 != null) {
            recyclerViewEmptySupport2 = binding5.recyclerView;
        } else {
            recyclerViewEmptySupport2 = null;
        }
        if (recyclerViewEmptySupport2 != null) {
            recyclerViewEmptySupport2.setAdapter(this.challengeAdapter);
        }
        if (!this.viewUserChallengesOnly && (binding = getBinding()) != null && (recyclerViewEmptySupport4 = binding.recyclerView) != null) {
            recyclerViewEmptySupport4.setBackgroundResource(R.color.content_background);
        }
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new ChallengeListFragment$onViewCreated$2(this, null), 2, null);
        FragmentRefreshRecyclerviewBinding binding6 = getBinding();
        if (binding6 != null) {
            recyclerViewEmptySupport6 = binding6.recyclerView;
        }
        if (recyclerViewEmptySupport6 != null) {
            recyclerViewEmptySupport6.setItemAnimator(new SafeDefaultItemAnimator());
        }
        ChallengesListViewAdapter challengesListViewAdapter2 = this.challengeAdapter;
        if (challengesListViewAdapter2 != null) {
            challengesListViewAdapter2.updateUnfilteredData(this.challenges);
        }
        loadLocalChallenges();
        FragmentRefreshRecyclerviewBinding binding7 = getBinding();
        if (binding7 != null && (recyclerViewEmptySupport3 = binding7.recyclerView) != null) {
            recyclerViewEmptySupport3.addOnScrollListener(new RecyclerView.u() { // from class: com.habitrpg.android.habitica.ui.fragments.social.challenges.ChallengeListFragment$onViewCreated$3
                @Override // androidx.recyclerview.widget.RecyclerView.u
                public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                    q.i(recyclerView, "recyclerView");
                    super.onScrollStateChanged(recyclerView, i10);
                    if (!recyclerView.canScrollVertically(1)) {
                        ChallengeListFragment.retrieveChallengesPage$Habitica_2311256681_prodRelease$default(ChallengeListFragment.this, false, 1, null);
                    }
                }
            });
        }
        retrieveChallengesPage$Habitica_2311256681_prodRelease(true);
    }

    public final void retrieveChallengesPage$Habitica_2311256681_prodRelease(boolean z10) {
        SwipeRefreshLayout swipeRefreshLayout;
        if (!z10) {
            FragmentRefreshRecyclerviewBinding binding = getBinding();
            boolean z11 = false;
            if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null && swipeRefreshLayout.i()) {
                z11 = true;
            }
            if (z11) {
                return;
            }
        }
        if (!this.loadedAllData && this.challengeRepository != null) {
            setRefreshing(true);
            ExceptionHandlerKt.launchCatching$default(w.a(this), null, new ChallengeListFragment$retrieveChallengesPage$1(this, null), 1, null);
        }
    }

    public final void setChallengeRepository(ChallengeRepository challengeRepository) {
        q.i(challengeRepository, "<set-?>");
        this.challengeRepository = challengeRepository;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    public final void setViewUserChallengesOnly(boolean z10) {
        this.viewUserChallengesOnly = z10;
    }

    public final void showFilterDialog$Habitica_2311256681_prodRelease() {
        androidx.fragment.app.q activity = getActivity();
        if (activity != null) {
            ChallengeFilterDialogHolder.Companion companion = ChallengeFilterDialogHolder.Companion;
            List<Group> list = this.filterGroups;
            if (list == null) {
                list = t.i();
            }
            companion.showDialog(activity, list, this.filterOptions, new ChallengeListFragment$showFilterDialog$1$1(this));
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentRefreshRecyclerviewBinding inflate = FragmentRefreshRecyclerviewBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentRefreshRecyclerviewBinding fragmentRefreshRecyclerviewBinding) {
        this.binding = fragmentRefreshRecyclerviewBinding;
    }
}
