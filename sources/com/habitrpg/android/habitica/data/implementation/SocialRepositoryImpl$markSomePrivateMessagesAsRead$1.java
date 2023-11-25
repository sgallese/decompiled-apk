package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: SocialRepositoryImpl.kt */
/* loaded from: classes4.dex */
final class SocialRepositoryImpl$markSomePrivateMessagesAsRead$1 extends r implements l<User, w> {
    final /* synthetic */ int $numOfUnseenMessages;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialRepositoryImpl$markSomePrivateMessagesAsRead$1(int i10) {
        super(1);
        this.$numOfUnseenMessages = i10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(User user) {
        invoke2(user);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(User user) {
        q.i(user, "it");
        Inbox inbox = user.getInbox();
        int newMessages = inbox != null ? inbox.getNewMessages() : 0;
        if (newMessages > this.$numOfUnseenMessages) {
            Inbox inbox2 = user.getInbox();
            if (inbox2 == null) {
                return;
            }
            inbox2.setNewMessages(newMessages - this.$numOfUnseenMessages);
            return;
        }
        Inbox inbox3 = user.getInbox();
        if (inbox3 == null) {
            return;
        }
        inbox3.setNewMessages(0);
    }
}
