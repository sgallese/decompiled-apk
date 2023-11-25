package com.habitrpg.android.habitica.ui.fragments.social;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.c1;
import qc.q;
import qc.r;

/* compiled from: PartyChatFragment.kt */
/* loaded from: classes4.dex */
final class PartyChatFragment$viewModel$2 extends r implements pc.a<c1> {
    final /* synthetic */ PartyChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyChatFragment$viewModel$2(PartyChatFragment partyChatFragment) {
        super(0);
        this.this$0 = partyChatFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final c1 invoke() {
        Fragment requireParentFragment = this.this$0.requireParentFragment();
        q.h(requireParentFragment, "requireParentFragment(...)");
        return requireParentFragment;
    }
}
