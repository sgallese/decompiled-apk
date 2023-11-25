package com.habitrpg.android.habitica.ui.fragments.social;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.c1;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
public final class ChatFragment$viewModel$2 extends r implements pc.a<c1> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$viewModel$2(ChatFragment chatFragment) {
        super(0);
        this.this$0 = chatFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final c1 invoke() {
        Fragment requireParentFragment = this.this$0.requireParentFragment();
        q.h(requireParentFragment, "requireParentFragment(...)");
        return requireParentFragment;
    }
}
