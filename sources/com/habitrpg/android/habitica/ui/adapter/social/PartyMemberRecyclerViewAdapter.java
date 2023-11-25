package com.habitrpg.android.habitica.ui.adapter.social;

import android.view.ViewGroup;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.viewHolders.GroupMemberViewHolder;
import dc.w;
import pc.l;
import qc.q;

/* compiled from: PartyMemberRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class PartyMemberRecyclerViewAdapter extends BaseRecyclerViewAdapter<Member, GroupMemberViewHolder> {
    public static final int $stable = 8;
    private String leaderID;
    private l<? super String, w> onUserClicked;

    public final String getLeaderID() {
        return this.leaderID;
    }

    public final l<String, w> getOnUserClicked() {
        return this.onUserClicked;
    }

    public final void setLeaderID(String str) {
        this.leaderID = str;
    }

    public final void setOnUserClicked(l<? super String, w> lVar) {
        this.onUserClicked = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(GroupMemberViewHolder groupMemberViewHolder, int i10) {
        q.i(groupMemberViewHolder, "holder");
        groupMemberViewHolder.bind(getData().get(i10), this.leaderID, null);
        groupMemberViewHolder.setOnClickEvent(new PartyMemberRecyclerViewAdapter$onBindViewHolder$1(this, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public GroupMemberViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        return new GroupMemberViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.party_member, false, 2, null));
    }
}
