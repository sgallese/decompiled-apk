package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: SocialRepositoryImpl.kt */
/* loaded from: classes4.dex */
final class SocialRepositoryImpl$markPrivateMessagesRead$2 extends r implements l<User, w> {
    public static final SocialRepositoryImpl$markPrivateMessagesRead$2 INSTANCE = new SocialRepositoryImpl$markPrivateMessagesRead$2();

    SocialRepositoryImpl$markPrivateMessagesRead$2() {
        super(1);
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
        if (inbox == null) {
            return;
        }
        inbox.setHasUserSeenInbox(true);
    }
}
