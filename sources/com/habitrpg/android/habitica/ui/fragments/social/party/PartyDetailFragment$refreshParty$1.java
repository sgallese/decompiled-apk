package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.databinding.FragmentPartyDetailBinding;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyDetailFragment.kt */
/* loaded from: classes4.dex */
public final class PartyDetailFragment$refreshParty$1 extends qc.r implements pc.a<w> {
    final /* synthetic */ PartyDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyDetailFragment$refreshParty$1(PartyDetailFragment partyDetailFragment) {
        super(0);
        this.this$0 = partyDetailFragment;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentPartyDetailBinding binding = this.this$0.getBinding();
        SwipeRefreshLayout swipeRefreshLayout = binding != null ? binding.refreshLayout : null;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }
}
