package com.habitrpg.android.habitica.ui.viewHolders;

import android.view.View;
import com.habitrpg.android.habitica.databinding.TavernChatIntroItemBinding;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import dc.w;
import qc.q;

/* compiled from: ChatRecyclerViewHolder.kt */
/* loaded from: classes4.dex */
public final class ChatRecyclerIntroViewHolder extends ChatRecyclerViewHolder {
    public static final int $stable = 8;
    private final TavernChatIntroItemBinding binding;
    private pc.l<? super String, w> onOpenProfile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRecyclerIntroViewHolder(View view, final String str) {
        super(view);
        q.i(view, "itemView");
        q.i(str, "replyToUUID");
        TavernChatIntroItemBinding bind = TavernChatIntroItemBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
        bind.avatarView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerIntroViewHolder._init_$lambda$0(ChatRecyclerIntroViewHolder.this, str, view2);
            }
        });
        bind.displayNameTextview.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerIntroViewHolder._init_$lambda$1(ChatRecyclerIntroViewHolder.this, str, view2);
            }
        });
        bind.sublineTextview.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ChatRecyclerIntroViewHolder._init_$lambda$2(ChatRecyclerIntroViewHolder.this, str, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChatRecyclerIntroViewHolder chatRecyclerIntroViewHolder, String str, View view) {
        q.i(chatRecyclerIntroViewHolder, "this$0");
        q.i(str, "$replyToUUID");
        pc.l<? super String, w> lVar = chatRecyclerIntroViewHolder.onOpenProfile;
        if (lVar != null) {
            lVar.invoke(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ChatRecyclerIntroViewHolder chatRecyclerIntroViewHolder, String str, View view) {
        q.i(chatRecyclerIntroViewHolder, "this$0");
        q.i(str, "$replyToUUID");
        pc.l<? super String, w> lVar = chatRecyclerIntroViewHolder.onOpenProfile;
        if (lVar != null) {
            lVar.invoke(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ChatRecyclerIntroViewHolder chatRecyclerIntroViewHolder, String str, View view) {
        q.i(chatRecyclerIntroViewHolder, "this$0");
        q.i(str, "$replyToUUID");
        pc.l<? super String, w> lVar = chatRecyclerIntroViewHolder.onOpenProfile;
        if (lVar != null) {
            lVar.invoke(str);
        }
    }

    public final void bind(Member member) {
        int i10;
        if (member == null) {
            return;
        }
        AvatarView avatarView = this.binding.avatarView;
        q.h(avatarView, "avatarView");
        AvatarView.setAvatar$default(avatarView, member, null, 2, null);
        this.binding.displayNameTextview.setUsername(member.getDisplayName());
        UsernameLabel usernameLabel = this.binding.displayNameTextview;
        ContributorInfo contributor = member.getContributor();
        if (contributor != null) {
            i10 = contributor.getLevel();
        } else {
            i10 = 0;
        }
        usernameLabel.setTier(i10);
        this.binding.sublineTextview.setText(member.getFormattedUsername());
    }

    public final pc.l<String, w> getOnOpenProfile() {
        return this.onOpenProfile;
    }

    public final void setOnOpenProfile(pc.l<? super String, w> lVar) {
        this.onOpenProfile = lVar;
    }
}
