package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.c1;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuildDetailFragment.kt */
/* loaded from: classes4.dex */
public final class GuildDetailFragment$viewModel$2 extends r implements pc.a<c1> {
    final /* synthetic */ GuildDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildDetailFragment$viewModel$2(GuildDetailFragment guildDetailFragment) {
        super(0);
        this.this$0 = guildDetailFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final c1 invoke() {
        Fragment parentFragment = this.this$0.getParentFragment();
        q.g(parentFragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return parentFragment;
    }
}
