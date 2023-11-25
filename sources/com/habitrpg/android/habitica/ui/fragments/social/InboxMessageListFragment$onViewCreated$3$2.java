package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: InboxMessageListFragment.kt */
/* loaded from: classes4.dex */
final class InboxMessageListFragment$onViewCreated$3$2 extends r implements l<ChatMessage, w> {
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$onViewCreated$3$2(InboxMessageListFragment inboxMessageListFragment) {
        super(1);
        this.this$0 = inboxMessageListFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(ChatMessage chatMessage) {
        invoke2(chatMessage);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatMessage chatMessage) {
        q.i(chatMessage, "it");
        this.this$0.showDeleteConfirmationDialog(chatMessage);
    }
}
