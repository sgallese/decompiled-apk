package com.habitrpg.android.habitica.ui.fragments.social;

import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
final class ChatFragment$onViewCreated$2 extends r implements l<String, w> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onViewCreated$2(ChatFragment chatFragment) {
        super(1);
        this.this$0 = chatFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(String str) {
        invoke2(str);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        q.i(str, "it");
        this.this$0.sendChatMessage(str);
    }
}
