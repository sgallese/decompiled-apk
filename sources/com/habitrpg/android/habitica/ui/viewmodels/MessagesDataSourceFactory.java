package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.f0;
import androidx.paging.o;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import qc.q;

/* compiled from: InboxViewModel.kt */
/* loaded from: classes4.dex */
public final class MessagesDataSourceFactory extends o.c<Integer, ChatMessage> {
    public static final int $stable = 8;
    private final ChatMessage footer;
    private MessagesDataSource latestSource;
    private String recipientID;
    private final SocialRepository socialRepository;
    private final f0<MessagesDataSource> sourceLiveData;

    public MessagesDataSourceFactory(SocialRepository socialRepository, String str, ChatMessage chatMessage) {
        q.i(socialRepository, "socialRepository");
        this.socialRepository = socialRepository;
        this.recipientID = str;
        this.footer = chatMessage;
        this.sourceLiveData = new f0<>();
        this.latestSource = new MessagesDataSource(socialRepository, this.recipientID, chatMessage);
    }

    @Override // androidx.paging.o.c
    public o<Integer, ChatMessage> create() {
        MessagesDataSource messagesDataSource = new MessagesDataSource(this.socialRepository, this.recipientID, this.footer);
        this.latestSource = messagesDataSource;
        this.sourceLiveData.n(messagesDataSource);
        return this.latestSource;
    }

    public final ChatMessage getFooter() {
        return this.footer;
    }

    public final MessagesDataSource getLatestSource() {
        return this.latestSource;
    }

    public final String getRecipientID() {
        return this.recipientID;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    public final f0<MessagesDataSource> getSourceLiveData() {
        return this.sourceLiveData;
    }

    public final void setLatestSource(MessagesDataSource messagesDataSource) {
        q.i(messagesDataSource, "<set-?>");
        this.latestSource = messagesDataSource;
    }

    public final void setRecipientID(String str) {
        this.recipientID = str;
    }

    public final void updateRecipientID(String str) {
        this.recipientID = str;
        this.latestSource.setRecipientID(str);
    }
}
