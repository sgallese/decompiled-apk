package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.p0;
import com.habitrpg.android.habitica.databinding.FragmentComposeBinding;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import qc.g0;

/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
public final class PartySeekingFragment extends Hilt_PartySeekingFragment<FragmentComposeBinding> {
    public static final int $stable = 8;
    private FragmentComposeBinding binding;
    private final dc.f viewModel$delegate;

    public PartySeekingFragment() {
        dc.f a10;
        a10 = dc.h.a(dc.j.NONE, new PartySeekingFragment$special$$inlined$viewModels$default$2(new PartySeekingFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(PartySeekingViewModel.class), new PartySeekingFragment$special$$inlined$viewModels$default$3(a10), new PartySeekingFragment$special$$inlined$viewModels$default$4(null, a10), new PartySeekingFragment$special$$inlined$viewModels$default$5(this, a10));
    }

    public final PartySeekingViewModel getViewModel() {
        return (PartySeekingViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView;
        qc.q.i(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentComposeBinding binding = getBinding();
        if (binding != null && (composeView = binding.composeView) != null) {
            composeView.setContent(q0.c.c(-775036543, true, new PartySeekingFragment$onCreateView$1(this)));
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Analytics.sendEvent$default(Analytics.INSTANCE, "View Find Members", EventCategory.NAVIGATION, HitType.EVENT, null, null, 24, null);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentComposeBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentComposeBinding inflate = FragmentComposeBinding.inflate(layoutInflater);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentComposeBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentComposeBinding fragmentComposeBinding) {
        this.binding = fragmentComposeBinding;
    }
}
