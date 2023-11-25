package com.habitrpg.android.habitica.ui.adapter.social;

import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.w;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InboxAdapter.kt */
/* loaded from: classes4.dex */
public final class InboxAdapter$onBindViewHolder$1 extends r implements pc.a<w> {
    final /* synthetic */ ChatMessage $message;
    final /* synthetic */ int $position;
    final /* synthetic */ InboxAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxAdapter$onBindViewHolder$1(InboxAdapter inboxAdapter, ChatMessage chatMessage, int i10) {
        super(0);
        this.this$0 = inboxAdapter;
        this.$message = chatMessage;
        this.$position = i10;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.expandMessage(this.$message.getId(), this.$position);
    }
}
