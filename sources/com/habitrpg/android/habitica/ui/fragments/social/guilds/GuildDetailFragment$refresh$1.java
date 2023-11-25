package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.databinding.FragmentGuildDetailBinding;
import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuildDetailFragment.kt */
/* loaded from: classes4.dex */
public final class GuildDetailFragment$refresh$1 extends r implements pc.a<w> {
    final /* synthetic */ GuildDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildDetailFragment$refresh$1(GuildDetailFragment guildDetailFragment) {
        super(0);
        this.this$0 = guildDetailFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentGuildDetailBinding binding = this.this$0.getBinding();
        SwipeRefreshLayout swipeRefreshLayout = binding != null ? binding.refreshLayout : null;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }
}
