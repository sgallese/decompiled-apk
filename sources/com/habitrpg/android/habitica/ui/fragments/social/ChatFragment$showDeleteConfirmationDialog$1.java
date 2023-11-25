package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
public final class ChatFragment$showDeleteConfirmationDialog$1 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ ChatMessage $chatMessage;
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$showDeleteConfirmationDialog$1(ChatFragment chatFragment, ChatMessage chatMessage) {
        super(2);
        this.this$0 = chatFragment;
        this.$chatMessage = chatMessage;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        this.this$0.getViewModel().deleteMessage(this.$chatMessage);
    }
}
