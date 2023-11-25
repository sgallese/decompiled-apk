package com.habitrpg.android.habitica.ui.fragments.social;

import androidx.paging.n1;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.ui.adapter.social.InboxAdapter;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: InboxMessageListFragment.kt */
/* loaded from: classes4.dex */
final class InboxMessageListFragment$onViewCreated$4 extends r implements l<n1<ChatMessage>, w> {
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$onViewCreated$4(InboxMessageListFragment inboxMessageListFragment) {
        super(1);
        this.this$0 = inboxMessageListFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(n1<ChatMessage> n1Var) {
        invoke2(n1Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(n1<ChatMessage> n1Var) {
        InboxAdapter inboxAdapter;
        InboxMessageListFragment inboxMessageListFragment = this.this$0;
        q.f(n1Var);
        inboxMessageListFragment.markMessagesAsRead(n1Var);
        inboxAdapter = this.this$0.chatAdapter;
        if (inboxAdapter != null) {
            inboxAdapter.submitList(n1Var);
        }
    }
}
