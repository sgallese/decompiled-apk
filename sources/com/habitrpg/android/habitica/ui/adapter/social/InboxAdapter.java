package com.habitrpg.android.habitica.ui.adapter.social;

import android.view.View;
import android.view.ViewGroup;
import androidx.paging.o1;
import androidx.recyclerview.widget.i;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewHolders.ChatRecyclerIntroViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.ChatRecyclerMessageViewHolder;
import com.habitrpg.android.habitica.ui.viewHolders.ChatRecyclerViewHolder;
import dc.w;
import pc.l;
import qc.h;
import qc.q;

/* compiled from: InboxAdapter.kt */
/* loaded from: classes4.dex */
public final class InboxAdapter extends o1<ChatMessage, ChatRecyclerViewHolder> {
    private final int FIRST_MESSAGE;
    private final int NORMAL_MESSAGE;
    private String expandedMessageId;
    private l<? super ChatMessage, w> onCopyMessage;
    private l<? super ChatMessage, w> onDeleteMessage;
    private l<? super ChatMessage, w> onFlagMessage;
    private l<? super String, w> onOpenProfile;
    private l<? super String, w> onReply;
    private Member replyToUser;
    private User user;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InboxAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK = new i.f<ChatMessage>() { // from class: com.habitrpg.android.habitica.ui.adapter.social.InboxAdapter$Companion$DIFF_CALLBACK$1
        @Override // androidx.recyclerview.widget.i.f
        public boolean areContentsTheSame(ChatMessage chatMessage, ChatMessage chatMessage2) {
            q.i(chatMessage, "oldConcert");
            q.i(chatMessage2, "newConcert");
            return q.d(chatMessage.getText(), chatMessage2.getText());
        }

        @Override // androidx.recyclerview.widget.i.f
        public boolean areItemsTheSame(ChatMessage chatMessage, ChatMessage chatMessage2) {
            q.i(chatMessage, "oldConcert");
            q.i(chatMessage2, "newConcert");
            return q.d(chatMessage.getId(), chatMessage2.getId());
        }
    };

    /* compiled from: InboxAdapter.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public InboxAdapter(User user) {
        super(DIFF_CALLBACK);
        this.user = user;
        this.NORMAL_MESSAGE = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expandMessage(String str, int i10) {
        if (isPositionIntroMessage(i10)) {
            return;
        }
        if (q.d(this.expandedMessageId, str)) {
            str = null;
        }
        this.expandedMessageId = str;
        notifyItemChanged(i10);
    }

    private final boolean isPositionIntroMessage(int i10) {
        if (i10 == super.getItemCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        if (isPositionIntroMessage(i10)) {
            return -1L;
        }
        return super.getItemId(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (isPositionIntroMessage(i10)) {
            return this.FIRST_MESSAGE;
        }
        return this.NORMAL_MESSAGE;
    }

    public final l<ChatMessage, w> getOnCopyMessage() {
        return this.onCopyMessage;
    }

    public final l<ChatMessage, w> getOnDeleteMessage() {
        return this.onDeleteMessage;
    }

    public final l<ChatMessage, w> getOnFlagMessage() {
        return this.onFlagMessage;
    }

    public final l<String, w> getOnOpenProfile() {
        return this.onOpenProfile;
    }

    public final l<String, w> getOnReply() {
        return this.onReply;
    }

    public final Member getReplyToUser$Habitica_2311256681_prodRelease() {
        return this.replyToUser;
    }

    public final void setOnCopyMessage(l<? super ChatMessage, w> lVar) {
        this.onCopyMessage = lVar;
    }

    public final void setOnDeleteMessage(l<? super ChatMessage, w> lVar) {
        this.onDeleteMessage = lVar;
    }

    public final void setOnFlagMessage(l<? super ChatMessage, w> lVar) {
        this.onFlagMessage = lVar;
    }

    public final void setOnOpenProfile(l<? super String, w> lVar) {
        this.onOpenProfile = lVar;
    }

    public final void setOnReply(l<? super String, w> lVar) {
        this.onReply = lVar;
    }

    public final void setReplyToUser$Habitica_2311256681_prodRelease(Member member) {
        this.replyToUser = member;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.o1
    public ChatMessage getItem(int i10) {
        return isPositionIntroMessage(i10) ? new ChatMessage() : (ChatMessage) super.getItem(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(ChatRecyclerViewHolder chatRecyclerViewHolder, int i10) {
        String str;
        q.i(chatRecyclerViewHolder, "holder");
        if (getItemViewType(i10) == this.FIRST_MESSAGE) {
            ChatRecyclerIntroViewHolder chatRecyclerIntroViewHolder = (ChatRecyclerIntroViewHolder) chatRecyclerViewHolder;
            chatRecyclerIntroViewHolder.bind(this.replyToUser);
            chatRecyclerIntroViewHolder.setOnOpenProfile(this.onOpenProfile);
            return;
        }
        ChatMessage item = getItem(i10);
        if (item == null) {
            return;
        }
        ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder = (ChatRecyclerMessageViewHolder) chatRecyclerViewHolder;
        User user = this.user;
        if (user == null || (str = user.getId()) == null) {
            str = "";
        }
        chatRecyclerMessageViewHolder.bind(item, str, this.user, q.d(this.expandedMessageId, item.getId()));
        chatRecyclerMessageViewHolder.setOnShouldExpand(new InboxAdapter$onBindViewHolder$1(this, item, i10));
        chatRecyclerMessageViewHolder.setOnOpenProfile(this.onOpenProfile);
        chatRecyclerMessageViewHolder.setOnReply(this.onReply);
        chatRecyclerMessageViewHolder.setOnCopyMessage(this.onCopyMessage);
        chatRecyclerMessageViewHolder.setOnFlagMessage(this.onFlagMessage);
        chatRecyclerMessageViewHolder.setOnDeleteMessage(this.onDeleteMessage);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public ChatRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        ChatRecyclerViewHolder chatRecyclerMessageViewHolder;
        String id2;
        String id3;
        q.i(viewGroup, "parent");
        String str = "";
        if (i10 == this.FIRST_MESSAGE) {
            View inflate$default = ViewGroupExt.inflate$default(viewGroup, R.layout.tavern_chat_intro_item, false, 2, null);
            Member member = this.replyToUser;
            if (member != null && (id3 = member.getId()) != null) {
                str = id3;
            }
            chatRecyclerMessageViewHolder = new ChatRecyclerIntroViewHolder(inflate$default, str);
        } else {
            View inflate$default2 = ViewGroupExt.inflate$default(viewGroup, R.layout.chat_item, false, 2, null);
            User user = this.user;
            if (user != null && (id2 = user.getId()) != null) {
                str = id2;
            }
            chatRecyclerMessageViewHolder = new ChatRecyclerMessageViewHolder(inflate$default2, str, false);
        }
        return chatRecyclerMessageViewHolder;
    }
}
