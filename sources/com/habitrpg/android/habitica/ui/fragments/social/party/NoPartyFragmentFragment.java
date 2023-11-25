package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.w;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentNoPartyBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.ui.activities.GroupFormActivity;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.social.InvitationsView;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;

/* compiled from: NoPartyFragmentFragment.kt */
/* loaded from: classes4.dex */
public final class NoPartyFragmentFragment extends Hilt_NoPartyFragmentFragment<FragmentNoPartyBinding> {
    public static final int $stable = 8;
    private FragmentNoPartyBinding binding;
    public AppConfigManager configManager;
    private final androidx.activity.result.b<Intent> groupFormResult;
    public SocialRepository socialRepository;
    public MainUserViewModel userViewModel;

    public NoPartyFragmentFragment() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.a
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                NoPartyFragmentFragment.groupFormResult$lambda$5(NoPartyFragmentFragment.this, (ActivityResult) obj);
            }
        });
        qc.q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.groupFormResult = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void groupFormResult$lambda$5(NoPartyFragmentFragment noPartyFragmentFragment, ActivityResult activityResult) {
        Bundle bundle;
        String str;
        qc.q.i(noPartyFragmentFragment, "this$0");
        if (activityResult.b() == -1) {
            Intent a10 = activityResult.a();
            if (a10 != null) {
                bundle = a10.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                str = bundle.getString("groupType");
            } else {
                str = null;
            }
            if (qc.q.d(str, NavigationDrawerFragment.SIDEBAR_PARTY)) {
                ad.i.d(w.a(noPartyFragmentFragment), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NoPartyFragmentFragment$groupFormResult$1$1(noPartyFragmentFragment, bundle, null), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(NoPartyFragmentFragment noPartyFragmentFragment) {
        qc.q.i(noPartyFragmentFragment, "this$0");
        noPartyFragmentFragment.refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(NoPartyFragmentFragment noPartyFragmentFragment, View view) {
        qc.q.i(noPartyFragmentFragment, "this$0");
        ExceptionHandlerKt.launchCatching$default(w.a(noPartyFragmentFragment), null, new NoPartyFragmentFragment$onViewCreated$6$1(noPartyFragmentFragment, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(NoPartyFragmentFragment noPartyFragmentFragment, View view) {
        qc.q.i(noPartyFragmentFragment, "this$0");
        ExceptionHandlerKt.launchCatching$default(w.a(noPartyFragmentFragment), null, new NoPartyFragmentFragment$onViewCreated$7$1(noPartyFragmentFragment, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(NoPartyFragmentFragment noPartyFragmentFragment, View view) {
        qc.q.i(noPartyFragmentFragment, "this$0");
        Bundle bundle = new Bundle();
        bundle.putString("groupType", NavigationDrawerFragment.SIDEBAR_PARTY);
        bundle.putString("leader", noPartyFragmentFragment.getUserViewModel().getUserID());
        Intent intent = new Intent(noPartyFragmentFragment.getMainActivity(), GroupFormActivity.class);
        intent.putExtras(bundle);
        intent.setFlags(131072);
        noPartyFragmentFragment.groupFormResult.a(intent);
    }

    private final void refresh() {
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new NoPartyFragmentFragment$refresh$1(this, null), 2, null);
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("configManager");
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

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getSocialRepository().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InvitationsView invitationsView;
        InvitationsView invitationsView2;
        InvitationsView invitationsView3;
        Button button;
        Button button2;
        Button button3;
        SwipeRefreshLayout swipeRefreshLayout;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentNoPartyBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.b
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
                public final void onRefresh() {
                    NoPartyFragmentFragment.onViewCreated$lambda$0(NoPartyFragmentFragment.this);
                }
            });
        }
        refresh();
        FragmentNoPartyBinding binding2 = getBinding();
        if (binding2 != null) {
            invitationsView = binding2.invitationsView;
        } else {
            invitationsView = null;
        }
        if (invitationsView != null) {
            invitationsView.setAcceptCall(new NoPartyFragmentFragment$onViewCreated$2(this));
        }
        FragmentNoPartyBinding binding3 = getBinding();
        if (binding3 != null) {
            invitationsView2 = binding3.invitationsView;
        } else {
            invitationsView2 = null;
        }
        if (invitationsView2 != null) {
            invitationsView2.setRejectCall(new NoPartyFragmentFragment$onViewCreated$3(this));
        }
        FragmentNoPartyBinding binding4 = getBinding();
        if (binding4 != null) {
            invitationsView3 = binding4.invitationsView;
        } else {
            invitationsView3 = null;
        }
        if (invitationsView3 != null) {
            invitationsView3.setGetLeader(new NoPartyFragmentFragment$onViewCreated$4(this, null));
        }
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new NoPartyFragmentFragment$sam$androidx_lifecycle_Observer$0(new NoPartyFragmentFragment$onViewCreated$5(this)));
        FragmentNoPartyBinding binding5 = getBinding();
        if (binding5 != null && (button3 = binding5.seekPartyButton) != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoPartyFragmentFragment.onViewCreated$lambda$1(NoPartyFragmentFragment.this, view2);
                }
            });
        }
        FragmentNoPartyBinding binding6 = getBinding();
        if (binding6 != null && (button2 = binding6.leaveSeekingButton) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoPartyFragmentFragment.onViewCreated$lambda$2(NoPartyFragmentFragment.this, view2);
                }
            });
        }
        FragmentNoPartyBinding binding7 = getBinding();
        if (binding7 != null && (button = binding7.createPartyButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.party.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoPartyFragmentFragment.onViewCreated$lambda$3(NoPartyFragmentFragment.this, view2);
                }
            });
        }
        Context context = getContext();
        if (context != null) {
            DataBindingUtils.INSTANCE.loadImage(context, "timeTravelersShop_background_fall", new NoPartyFragmentFragment$onViewCreated$9$1(context, this));
        }
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentNoPartyBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentNoPartyBinding inflate = FragmentNoPartyBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentNoPartyBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentNoPartyBinding fragmentNoPartyBinding) {
        this.binding = fragmentNoPartyBinding;
    }
}
