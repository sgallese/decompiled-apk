package com.habitrpg.android.habitica.ui.fragments.social.party;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.habitrpg.android.habitica.databinding.FragmentViewpagerBinding;
import com.habitrpg.android.habitica.models.social.Group;
import dc.w;

/* compiled from: PartyInvitePagerFragment.kt */
/* loaded from: classes4.dex */
final class PartyInvitePagerFragment$onCreateView$1 extends qc.r implements pc.l<Group, w> {
    final /* synthetic */ PartyInvitePagerFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyInvitePagerFragment$onCreateView$1(PartyInvitePagerFragment partyInvitePagerFragment) {
        super(1);
        this.this$0 = partyInvitePagerFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Group group) {
        invoke2(group);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Group group) {
        ViewPager2 viewPager2;
        RecyclerView.h adapter;
        FragmentViewpagerBinding binding = this.this$0.getBinding();
        if (binding != null && (viewPager2 = binding.viewPager) != null && (adapter = viewPager2.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        PartyInvitePagerFragment partyInvitePagerFragment = this.this$0;
        partyInvitePagerFragment.setUsesTabLayout(partyInvitePagerFragment.getViewModel$Habitica_2311256681_prodRelease().isLeader());
    }
}
