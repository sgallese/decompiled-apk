package com.habitrpg.android.habitica.ui.adapter.social;

import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.ui.adapter.DiffCallback;
import java.util.List;
import qc.q;

/* compiled from: ChatRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public final class ChatDiffCallback extends DiffCallback<ChatMessage> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatDiffCallback(List<? extends BaseMainObject> list, List<? extends BaseMainObject> list2) {
        super(list, list2);
        q.i(list, "oldList");
        q.i(list2, "newList");
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.DiffCallback, androidx.recyclerview.widget.i.b
    public boolean areContentsTheSame(int i10, int i11) {
        BaseMainObject baseMainObject = getOldList().get(i10);
        q.g(baseMainObject, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.social.ChatMessage");
        ChatMessage chatMessage = (ChatMessage) baseMainObject;
        BaseMainObject baseMainObject2 = getNewList().get(i11);
        q.g(baseMainObject2, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.social.ChatMessage");
        ChatMessage chatMessage2 = (ChatMessage) baseMainObject2;
        if (chatMessage.getLikeCount() == chatMessage2.getLikeCount() && q.d(chatMessage.getId(), chatMessage2.getId())) {
            return true;
        }
        return false;
    }

    @Override // com.habitrpg.android.habitica.ui.adapter.DiffCallback, androidx.recyclerview.widget.i.b
    public boolean areItemsTheSame(int i10, int i11) {
        return q.d(getOldList().get(i10).getPrimaryIdentifier(), getNewList().get(i11).getPrimaryIdentifier());
    }
}
