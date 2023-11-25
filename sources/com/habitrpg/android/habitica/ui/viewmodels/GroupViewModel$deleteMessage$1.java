package com.habitrpg.android.habitica.ui.viewmodels;

import androidx.lifecycle.f0;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.w;
import java.util.List;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
/* loaded from: classes4.dex */
public final class GroupViewModel$deleteMessage$1 extends r implements l<Throwable, w> {
    final /* synthetic */ ChatMessage $chatMessage;
    final /* synthetic */ List<ChatMessage> $list;
    final /* synthetic */ int $oldIndex;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$deleteMessage$1(List<ChatMessage> list, int i10, ChatMessage chatMessage, GroupViewModel groupViewModel) {
        super(1);
        this.$list = list;
        this.$oldIndex = i10;
        this.$chatMessage = chatMessage;
        this.this$0 = groupViewModel;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Throwable th) {
        invoke2(th);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        f0 f0Var;
        q.i(th, "it");
        List<ChatMessage> list = this.$list;
        if (list != null) {
            list.add(this.$oldIndex, this.$chatMessage);
        }
        f0Var = this.this$0.get_chatMessages();
        f0Var.n(this.$list);
        ExceptionHandler.Companion.reportError(th);
    }
}
