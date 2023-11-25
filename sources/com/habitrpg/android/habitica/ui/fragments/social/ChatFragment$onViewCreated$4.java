package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.w;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
final class ChatFragment$onViewCreated$4 extends r implements l<List<? extends ChatMessage>, w> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onViewCreated$4(ChatFragment chatFragment) {
        super(1);
        this.this$0 = chatFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(List<? extends ChatMessage> list) {
        invoke2(list);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends ChatMessage> list) {
        ChatFragment chatFragment = this.this$0;
        q.f(list);
        chatFragment.setChatMessages(list);
    }
}
