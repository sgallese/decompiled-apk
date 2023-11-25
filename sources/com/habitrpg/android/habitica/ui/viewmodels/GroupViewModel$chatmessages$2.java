package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.f0;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import java.util.List;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
/* loaded from: classes4.dex */
public final class GroupViewModel$chatmessages$2 extends r implements pc.a<f0<List<? extends ChatMessage>>> {
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$chatmessages$2(GroupViewModel groupViewModel) {
        super(0);
        this.this$0 = groupViewModel;
    }

    @Override // pc.a
    public final f0<List<? extends ChatMessage>> invoke() {
        f0<List<? extends ChatMessage>> f0Var;
        f0Var = this.this$0.get_chatMessages();
        return f0Var;
    }
}
