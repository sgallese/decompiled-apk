package com.habitrpg.android.habitica.ui.adapter.social;

import dc.w;
import pc.l;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartyMemberRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class PartyMemberRecyclerViewAdapter$onBindViewHolder$1 extends r implements pc.a<w> {
    final /* synthetic */ int $position;
    final /* synthetic */ PartyMemberRecyclerViewAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartyMemberRecyclerViewAdapter$onBindViewHolder$1(PartyMemberRecyclerViewAdapter partyMemberRecyclerViewAdapter, int i10) {
        super(0);
        this.this$0 = partyMemberRecyclerViewAdapter;
        this.$position = i10;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l<String, w> onUserClicked = this.this$0.getOnUserClicked();
        if (onUserClicked != null) {
            onUserClicked.invoke(this.this$0.getData().get(this.$position).getId());
        }
    }
}
