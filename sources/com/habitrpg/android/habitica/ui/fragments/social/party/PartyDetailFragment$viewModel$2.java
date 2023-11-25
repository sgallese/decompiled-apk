package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
public final class PartyDetailFragment$viewModel$2 extends qc.r implements pc.a<c1> {
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$viewModel$2(PartyDetailFragment partyDetailFragment) {
        super(0);
        this.this$0 = partyDetailFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final c1 invoke() {
        Fragment parentFragment = this.this$0.getParentFragment();
        qc.q.g(parentFragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return parentFragment;
    }
}
