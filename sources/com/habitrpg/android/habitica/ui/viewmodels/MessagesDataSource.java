package com.habitrpg.android.habitica.ui.viewmodels;

import ad.a1;
import ad.i;
import ad.l0;
import androidx.paging.a2;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: InboxViewModel.kt */
/* loaded from: classes4.dex */
public final class MessagesDataSource extends a2<ChatMessage> {
    public static final int $stable = 8;
    private ChatMessage footer;
    private boolean lastFetchWasEnd;
    private String recipientID;
    private final SocialRepository socialRepository;

    public MessagesDataSource(SocialRepository socialRepository, String str, ChatMessage chatMessage) {
        q.i(socialRepository, "socialRepository");
        this.socialRepository = socialRepository;
        this.recipientID = str;
        this.footer = chatMessage;
    }

    public final ChatMessage getFooter() {
        return this.footer;
    }

    public final String getRecipientID() {
        return this.recipientID;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    @Override // androidx.paging.a2
    public void loadInitial(a2.c cVar, a2.b<ChatMessage> bVar) {
        q.i(cVar, "params");
        q.i(bVar, "callback");
        this.lastFetchWasEnd = false;
        i.d(l0.b(), a1.c().N0(), null, new MessagesDataSource$loadInitial$1(this, bVar, null), 2, null);
    }

    @Override // androidx.paging.a2
    public void loadRange(a2.e eVar, a2.d<ChatMessage> dVar) {
        List<? extends ChatMessage> i10;
        q.i(eVar, "params");
        q.i(dVar, "callback");
        if (this.lastFetchWasEnd) {
            i10 = t.i();
            dVar.a(i10);
            return;
        }
        i.d(l0.b(), a1.c().N0(), null, new MessagesDataSource$loadRange$1(this, eVar, dVar, null), 2, null);
    }

    public final void setFooter(ChatMessage chatMessage) {
        this.footer = chatMessage;
    }

    public final void setRecipientID(String str) {
        this.recipientID = str;
    }
}
