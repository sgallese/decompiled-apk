package com.habitrpg.android.habitica.ui.fragments.social;

import android.content.Context;
import com.habitrpg.android.habitica.databinding.FragmentInboxMessageListBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.social.ChatBarView;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: InboxMessageListFragment.kt */
/* loaded from: classes4.dex */
final class InboxMessageListFragment$sendMessage$1$1 extends r implements l<Throwable, w> {
    final /* synthetic */ String $chatText;
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$sendMessage$1$1(InboxMessageListFragment inboxMessageListFragment, String str) {
        super(1);
        this.this$0 = inboxMessageListFragment;
        this.$chatText = str;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        q.i(th, "error");
        ExceptionHandler.Companion.reportError(th);
        FragmentInboxMessageListBinding binding = this.this$0.getBinding();
        if (binding != null) {
            Context context = binding.chatBarView.getContext();
            q.h(context, "getContext(...)");
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setTitle("You cannot reply to this conversation");
            habiticaAlertDialog.setMessage("This user is unable to receive your private message");
            AlertDialogExtensionsKt.addOkButton$default(habiticaAlertDialog, false, null, 3, null);
            habiticaAlertDialog.show();
        }
        FragmentInboxMessageListBinding binding2 = this.this$0.getBinding();
        ChatBarView chatBarView = binding2 != null ? binding2.chatBarView : null;
        if (chatBarView == null) {
            return;
        }
        chatBarView.setMessage(this.$chatText);
    }
}
