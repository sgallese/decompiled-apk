package com.habitrpg.android.habitica.ui.fragments.social.party;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.p0;
import com.habitrpg.android.habitica.databinding.FragmentComposeBinding;
import qc.g0;

/* compiled from: PartyInviteFragment.kt */
/* loaded from: classes4.dex */
public final class PartyInviteFragment extends Hilt_PartyInviteFragment<FragmentComposeBinding> {
    public static final int $stable = 8;
    private FragmentComposeBinding binding;
    private final dc.f viewModel$delegate;

    public PartyInviteFragment() {
        dc.f a10;
        a10 = dc.h.a(dc.j.NONE, new PartyInviteFragment$special$$inlined$viewModels$default$2(new PartyInviteFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = p0.b(this, g0.b(PartyInviteViewModel.class), new PartyInviteFragment$special$$inlined$viewModels$default$3(a10), new PartyInviteFragment$special$$inlined$viewModels$default$4(null, a10), new PartyInviteFragment$special$$inlined$viewModels$default$5(this, a10));
    }

    public final PartyInviteViewModel getViewModel() {
        return (PartyInviteViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView;
        qc.q.i(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        FragmentComposeBinding binding = getBinding();
        if (binding != null && (composeView = binding.composeView) != null) {
            composeView.setContent(q0.c.c(67614305, true, new PartyInviteFragment$onCreateView$1(this)));
        }
        return onCreateView;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentComposeBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentComposeBinding inflate = FragmentComposeBinding.inflate(layoutInflater, viewGroup, false);
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
