package com.habitrpg.android.habitica.ui.adapter.social;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.DiffCallback;
import com.habitrpg.android.habitica.ui.viewHolders.ChatRecyclerMessageViewHolder;
import dc.w;
import java.util.List;
import pc.l;
import qc.q;

/* compiled from: ChatRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class ChatRecyclerViewAdapter extends BaseRecyclerViewAdapter<ChatMessage, RecyclerView.f0> {
    public static final int $stable = 8;
    private String expandedMessageId;
    private final boolean isTavern;
    private l<? super ChatMessage, w> onCopyMessage;
    private l<? super ChatMessage, w> onDeleteMessage;
    private l<? super ChatMessage, w> onFlagMessage;
    private l<? super ChatMessage, w> onMessageLike;
    private l<? super String, w> onOpenProfile;
    private l<? super String, w> onReply;
    private User user;
    private String uuid;

    public ChatRecyclerViewAdapter(User user, boolean z10) {
        String id2;
        this.isTavern = z10;
        this.user = user;
        String str = "";
        this.uuid = "";
        if (user != null && (id2 = user.getId()) != null) {
            str = id2;
        }
        this.uuid = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expandMessage(ChatMessage chatMessage, Integer num) {
        String id2;
        int indexOf;
        if (q.d(this.expandedMessageId, chatMessage.getId())) {
            id2 = null;
        } else {
            id2 = chatMessage.getId();
        }
        this.expandedMessageId = id2;
        if (num != null) {
            indexOf = num.intValue();
        } else {
            indexOf = getData().indexOf(chatMessage);
        }
        notifyItemChanged(indexOf);
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.BaseRecyclerViewAdapter
    public DiffCallback<ChatMessage> getDiffCallback(List<? extends ChatMessage> list, List<? extends ChatMessage> list2) {
        q.i(list, "oldList");
        q.i(list2, "newList");
        return new ChatDiffCallback(list, list2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (getData().size() <= i10) {
            return 0;
        }
        return !getData().get(i10).isSystemMessage();
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

    public final l<ChatMessage, w> getOnMessageLike() {
        return this.onMessageLike;
    }

    public final l<String, w> getOnOpenProfile() {
        return this.onOpenProfile;
    }

    public final l<String, w> getOnReply() {
        return this.onReply;
    }

    public final User getUser$Habitica_2311256681_prodRelease() {
        return this.user;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        q.i(f0Var, "holder");
        ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder = null;
        SystemChatMessageViewHolder systemChatMessageViewHolder = null;
        if (getData().get(i10).isSystemMessage()) {
            if (f0Var instanceof SystemChatMessageViewHolder) {
                systemChatMessageViewHolder = (SystemChatMessageViewHolder) f0Var;
            }
            if (systemChatMessageViewHolder == null) {
                return;
            }
            ChatMessage chatMessage = getData().get(i10);
            systemChatMessageViewHolder.bind(chatMessage, q.d(this.expandedMessageId, getData().get(i10).getId()));
            systemChatMessageViewHolder.setOnShouldExpand(new ChatRecyclerViewAdapter$onBindViewHolder$1(this, chatMessage, i10));
            return;
        }
        if (f0Var instanceof ChatRecyclerMessageViewHolder) {
            chatRecyclerMessageViewHolder = (ChatRecyclerMessageViewHolder) f0Var;
        }
        if (chatRecyclerMessageViewHolder == null) {
            return;
        }
        ChatMessage chatMessage2 = getData().get(i10);
        chatRecyclerMessageViewHolder.bind(chatMessage2, this.uuid, this.user, q.d(this.expandedMessageId, chatMessage2.getId()));
        chatRecyclerMessageViewHolder.setOnShouldExpand(new ChatRecyclerViewAdapter$onBindViewHolder$2(this, chatMessage2, i10));
        chatRecyclerMessageViewHolder.setOnLikeMessage(this.onMessageLike);
        chatRecyclerMessageViewHolder.setOnOpenProfile(this.onOpenProfile);
        chatRecyclerMessageViewHolder.setOnReply(this.onReply);
        chatRecyclerMessageViewHolder.setOnCopyMessage(this.onCopyMessage);
        chatRecyclerMessageViewHolder.setOnFlagMessage(this.onFlagMessage);
        chatRecyclerMessageViewHolder.setOnDeleteMessage(this.onDeleteMessage);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        q.i(viewGroup, "parent");
        if (i10 == 0) {
            return new SystemChatMessageViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.system_chat_message, false, 2, null));
        }
        return new ChatRecyclerMessageViewHolder(ViewGroupExt.inflate$default(viewGroup, R.layout.chat_item, false, 2, null), this.uuid, this.isTavern);
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

    public final void setOnMessageLike(l<? super ChatMessage, w> lVar) {
        this.onMessageLike = lVar;
    }

    public final void setOnOpenProfile(l<? super String, w> lVar) {
        this.onOpenProfile = lVar;
    }

    public final void setOnReply(l<? super String, w> lVar) {
        this.onReply = lVar;
    }

    public final void setUser$Habitica_2311256681_prodRelease(User user) {
        String str;
        this.user = user;
        if (user == null || (str = user.getId()) == null) {
            str = "";
        }
        this.uuid = str;
    }
}
