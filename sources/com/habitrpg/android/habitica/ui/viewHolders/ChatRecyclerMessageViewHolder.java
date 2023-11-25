package com.habitrpg.android.habitica.ui.viewHolders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ChatItemBinding;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;
import com.habitrpg.common.habitica.extensions.DataBindingUtils;
import dc.w;
import qc.q;

/* compiled from: ChatRecyclerViewHolder.kt */
/* loaded from: classes4.dex */
public final class ChatRecyclerMessageViewHolder extends ChatRecyclerViewHolder {
    public static final int $stable = 8;
    private final ChatItemBinding binding;
    private ChatMessage chatMessage;
    private final Context context;
    private final boolean isGroupChat;
    private pc.l<? super ChatMessage, w> onCopyMessage;
    private pc.l<? super ChatMessage, w> onDeleteMessage;
    private pc.l<? super ChatMessage, w> onFlagMessage;
    private pc.l<? super ChatMessage, w> onLikeMessage;
    private pc.l<? super String, w> onOpenProfile;
    private pc.l<? super String, w> onReply;
    private pc.a<w> onShouldExpand;
    private final Resources res;
    private User user;
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRecyclerMessageViewHolder(View view, String str, boolean z10) {
        super(view);
        q.i(view, "itemView");
        q.i(str, TaskFormActivity.USER_ID_KEY);
        this.userId = str;
        this.isGroupChat = z10;
        ChatItemBinding bind = ChatItemBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
        Context context = view.getContext();
        q.h(context, "getContext(...)");
        this.context = context;
        Resources resources = view.getResources();
        q.h(resources, "getResources(...)");
        this.res = resources;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$0(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.tvLikes.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$2(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.messageText.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$3(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.messageText.setMovementMethod(LinkMovementMethod.getInstance());
        bind.userLabel.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$5(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.avatarView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$7(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.replyButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$10(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.replyButton.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(resources, HabiticaIconsHelper.imageOfChatReplyIcon()), (Drawable) null, (Drawable) null, (Drawable) null);
        bind.copyButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$12(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.copyButton.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(resources, HabiticaIconsHelper.imageOfChatCopyIcon()), (Drawable) null, (Drawable) null, (Drawable) null);
        bind.reportButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$14(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.reportButton.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(resources, HabiticaIconsHelper.imageOfChatReportIcon()), (Drawable) null, (Drawable) null, (Drawable) null);
        bind.deleteButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerMessageViewHolder._init_$lambda$16(ChatRecyclerMessageViewHolder.this, view2);
            }
        });
        bind.deleteButton.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(resources, HabiticaIconsHelper.imageOfChatDeleteIcon()), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        q.i(chatRecyclerMessageViewHolder, "this$0");
        pc.a<w> aVar = chatRecyclerMessageViewHolder.onShouldExpand;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$10(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        String str;
        String user;
        pc.l<? super String, w> lVar;
        String username;
        pc.l<? super String, w> lVar2;
        q.i(chatRecyclerMessageViewHolder, "this$0");
        ChatMessage chatMessage = chatRecyclerMessageViewHolder.chatMessage;
        if (chatMessage != null) {
            str = chatMessage.getUsername();
        } else {
            str = null;
        }
        if (str != null) {
            ChatMessage chatMessage2 = chatRecyclerMessageViewHolder.chatMessage;
            if (chatMessage2 != null && (username = chatMessage2.getUsername()) != null && (lVar2 = chatRecyclerMessageViewHolder.onReply) != null) {
                lVar2.invoke(username);
                return;
            }
            return;
        }
        ChatMessage chatMessage3 = chatRecyclerMessageViewHolder.chatMessage;
        if (chatMessage3 != null && (user = chatMessage3.getUser()) != null && (lVar = chatRecyclerMessageViewHolder.onReply) != null) {
            lVar.invoke(user);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$12(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        pc.l<? super ChatMessage, w> lVar;
        q.i(chatRecyclerMessageViewHolder, "this$0");
        ChatMessage chatMessage = chatRecyclerMessageViewHolder.chatMessage;
        if (chatMessage != null && (lVar = chatRecyclerMessageViewHolder.onCopyMessage) != null) {
            lVar.invoke(chatMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$14(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        pc.l<? super ChatMessage, w> lVar;
        q.i(chatRecyclerMessageViewHolder, "this$0");
        ChatMessage chatMessage = chatRecyclerMessageViewHolder.chatMessage;
        if (chatMessage != null && (lVar = chatRecyclerMessageViewHolder.onFlagMessage) != null) {
            lVar.invoke(chatMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$16(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        pc.l<? super ChatMessage, w> lVar;
        q.i(chatRecyclerMessageViewHolder, "this$0");
        ChatMessage chatMessage = chatRecyclerMessageViewHolder.chatMessage;
        if (chatMessage != null && (lVar = chatRecyclerMessageViewHolder.onDeleteMessage) != null) {
            lVar.invoke(chatMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        SnackbarActivity snackbarActivity;
        q.i(chatRecyclerMessageViewHolder, "this$0");
        ChatMessage chatMessage = chatRecyclerMessageViewHolder.chatMessage;
        if (chatMessage != null) {
            if (!q.d(chatMessage.getUuid(), chatRecyclerMessageViewHolder.userId)) {
                pc.l<? super ChatMessage, w> lVar = chatRecyclerMessageViewHolder.onLikeMessage;
                if (lVar != null) {
                    lVar.invoke(chatMessage);
                    return;
                }
                return;
            }
            Context context = chatRecyclerMessageViewHolder.context;
            if (context instanceof SnackbarActivity) {
                snackbarActivity = (SnackbarActivity) context;
            } else {
                snackbarActivity = null;
            }
            SnackbarActivity snackbarActivity2 = snackbarActivity;
            if (snackbarActivity2 != null) {
                SnackbarActivity.DefaultImpls.showSnackbar$default(snackbarActivity2, null, null, context.getString(R.string.cant_like_own_message), null, null, null, null, HabiticaSnackbar.SnackbarDisplayType.FAILURE, false, 379, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        q.i(chatRecyclerMessageViewHolder, "this$0");
        pc.a<w> aVar = chatRecyclerMessageViewHolder.onShouldExpand;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        String uuid;
        pc.l<? super String, w> lVar;
        q.i(chatRecyclerMessageViewHolder, "this$0");
        ChatMessage chatMessage = chatRecyclerMessageViewHolder.chatMessage;
        if (chatMessage != null && (uuid = chatMessage.getUuid()) != null && (lVar = chatRecyclerMessageViewHolder.onOpenProfile) != null) {
            lVar.invoke(uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(ChatRecyclerMessageViewHolder chatRecyclerMessageViewHolder, View view) {
        String uuid;
        pc.l<? super String, w> lVar;
        q.i(chatRecyclerMessageViewHolder, "this$0");
        ChatMessage chatMessage = chatRecyclerMessageViewHolder.chatMessage;
        if (chatMessage != null && (uuid = chatMessage.getUuid()) != null && (lVar = chatRecyclerMessageViewHolder.onOpenProfile) != null) {
            lVar.invoke(uuid);
        }
    }

    private final boolean messageWasSent() {
        boolean z10;
        String str;
        ChatMessage chatMessage = this.chatMessage;
        if (chatMessage != null && chatMessage.getSent()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        ChatMessage chatMessage2 = this.chatMessage;
        if (chatMessage2 != null) {
            str = chatMessage2.getUuid();
        } else {
            str = null;
        }
        if (q.d(str, this.userId)) {
            return true;
        }
        return false;
    }

    private final void setLikeProperties() {
        int i10;
        Integer num;
        boolean z10;
        int i11;
        int i12;
        LinearLayout linearLayout = this.binding.likeBackgroundLayout;
        boolean z11 = false;
        if (this.isGroupChat) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        linearLayout.setVisibility(i10);
        TextView textView = this.binding.tvLikes;
        ChatMessage chatMessage = this.chatMessage;
        if (chatMessage != null) {
            num = Integer.valueOf(chatMessage.getLikeCount());
        } else {
            num = null;
        }
        textView.setText("+" + num);
        ChatMessage chatMessage2 = this.chatMessage;
        if (chatMessage2 != null && chatMessage2.getLikeCount() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ChatMessage chatMessage3 = this.chatMessage;
            if (chatMessage3 != null && chatMessage3.userLikesMessage(this.userId)) {
                z11 = true;
            }
            if (z11) {
                i11 = R.color.tavern_userliked_background;
                i12 = R.color.tavern_userliked_foreground;
            } else {
                i11 = R.color.tavern_somelikes_background;
                i12 = R.color.tavern_somelikes_foreground;
            }
        } else {
            i11 = R.color.tavern_nolikes_background;
            i12 = R.color.tavern_nolikes_foreground;
        }
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        LinearLayout linearLayout2 = this.binding.likeBackgroundLayout;
        q.h(linearLayout2, "likeBackgroundLayout");
        dataBindingUtils.setRoundedBackground(linearLayout2, androidx.core.content.a.c(this.context, i11));
        this.binding.tvLikes.setTextColor(androidx.core.content.a.c(this.context, i12));
    }

    private final boolean shouldShowDelete() {
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        ContributorInfo contributor;
        ChatMessage chatMessage = this.chatMessage;
        if (chatMessage != null && chatMessage.isSystemMessage()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ChatMessage chatMessage2 = this.chatMessage;
            if (chatMessage2 != null) {
                str = chatMessage2.getUuid();
            } else {
                str = null;
            }
            if (q.d(str, this.userId)) {
                return true;
            }
            User user = this.user;
            if (user != null && (contributor = user.getContributor()) != null && contributor.getAdmin()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
            ChatMessage chatMessage3 = this.chatMessage;
            if (chatMessage3 != null && chatMessage3.isInboxMessage()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02bf, code lost:
    
        if (r5 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d2, code lost:
    
        if (r1 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d4, code lost:
    
        r1 = androidx.core.content.a.e(r17.context, com.habitrpg.android.habitica.R.drawable.layout_rounded_bg_brand_700);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bind(com.habitrpg.android.habitica.models.social.ChatMessage r18, java.lang.String r19, com.habitrpg.android.habitica.models.user.User r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewHolders.ChatRecyclerMessageViewHolder.bind(com.habitrpg.android.habitica.models.social.ChatMessage, java.lang.String, com.habitrpg.android.habitica.models.user.User, boolean):void");
    }

    public final ChatItemBinding getBinding() {
        return this.binding;
    }

    public final Context getContext() {
        return this.context;
    }

    public final pc.l<ChatMessage, w> getOnCopyMessage() {
        return this.onCopyMessage;
    }

    public final pc.l<ChatMessage, w> getOnDeleteMessage() {
        return this.onDeleteMessage;
    }

    public final pc.l<ChatMessage, w> getOnFlagMessage() {
        return this.onFlagMessage;
    }

    public final pc.l<ChatMessage, w> getOnLikeMessage() {
        return this.onLikeMessage;
    }

    public final pc.l<String, w> getOnOpenProfile() {
        return this.onOpenProfile;
    }

    public final pc.l<String, w> getOnReply() {
        return this.onReply;
    }

    public final pc.a<w> getOnShouldExpand() {
        return this.onShouldExpand;
    }

    public final Resources getRes() {
        return this.res;
    }

    public final void setOnCopyMessage(pc.l<? super ChatMessage, w> lVar) {
        this.onCopyMessage = lVar;
    }

    public final void setOnDeleteMessage(pc.l<? super ChatMessage, w> lVar) {
        this.onDeleteMessage = lVar;
    }

    public final void setOnFlagMessage(pc.l<? super ChatMessage, w> lVar) {
        this.onFlagMessage = lVar;
    }

    public final void setOnLikeMessage(pc.l<? super ChatMessage, w> lVar) {
        this.onLikeMessage = lVar;
    }

    public final void setOnOpenProfile(pc.l<? super String, w> lVar) {
        this.onOpenProfile = lVar;
    }

    public final void setOnReply(pc.l<? super String, w> lVar) {
        this.onReply = lVar;
    }

    public final void setOnShouldExpand(pc.a<w> aVar) {
        this.onShouldExpand = aVar;
    }
}
