package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: SocialRepositoryImpl.kt */
/* loaded from: classes4.dex */
final class SocialRepositoryImpl$markSomePrivateMessagesAsRead$3 extends r implements l<ChatMessage, w> {
    public static final SocialRepositoryImpl$markSomePrivateMessagesAsRead$3 INSTANCE = new SocialRepositoryImpl$markSomePrivateMessagesAsRead$3();

    SocialRepositoryImpl$markSomePrivateMessagesAsRead$3() {
        super(1);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(ChatMessage chatMessage) {
        invoke2(chatMessage);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ChatMessage chatMessage) {
        q.i(chatMessage, "it");
        chatMessage.setSeen(true);
    }
}
