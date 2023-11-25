package com.habitrpg.android.habitica.ui.fragments.social;

import androidx.fragment.app.p0;
import com.habitrpg.android.habitica.ui.viewmodels.PartyViewModel;
import qc.g0;

/* compiled from: PartyChatFragment.kt */
/* loaded from: classes4.dex */
public final class PartyChatFragment extends ChatFragment {
    public static final int $stable = 8;
    private final dc.f viewModel$delegate;

    public PartyChatFragment() {
        dc.f a10;
        a10 = dc.h.a(dc.j.NONE, new PartyChatFragment$special$$inlined$viewModels$default$1(new PartyChatFragment$viewModel$2(this)));
        this.viewModel$delegate = p0.b(this, g0.b(PartyViewModel.class), new PartyChatFragment$special$$inlined$viewModels$default$2(a10), new PartyChatFragment$special$$inlined$viewModels$default$3(null, a10), new PartyChatFragment$special$$inlined$viewModels$default$4(this, a10));
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.social.ChatFragment
    public PartyViewModel getViewModel() {
        return (PartyViewModel) this.viewModel$delegate.getValue();
    }
}
