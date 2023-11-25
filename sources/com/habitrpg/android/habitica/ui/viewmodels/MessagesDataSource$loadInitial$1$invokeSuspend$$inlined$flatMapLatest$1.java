package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.w;
import dd.h;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1", f = "InboxViewModel.kt", l = {221, 193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1 extends l implements q<h<? super List<? extends ChatMessage>>, List<? extends ChatMessage>, Continuation<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MessagesDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, MessagesDataSource messagesDataSource) {
        super(3, continuation);
        this.this$0 = messagesDataSource;
    }

    @Override // pc.q
    public final Object invoke(h<? super List<? extends ChatMessage>> hVar, List<? extends ChatMessage> list, Continuation<? super w> continuation) {
        MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1 messagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1 = new MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        messagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = hVar;
        messagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = list;
        return messagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            dc.n.b(r7)
            goto L95
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            java.lang.Object r1 = r6.L$0
            dd.h r1 = (dd.h) r1
            dc.n.b(r7)
            goto L6a
        L23:
            dc.n.b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            dd.h r1 = (dd.h) r1
            java.lang.Object r7 = r6.L$1
            java.util.List r7 = (java.util.List) r7
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L85
            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource r4 = r6.this$0
            java.lang.String r4 = r4.getRecipientID()
            r5 = 0
            if (r4 == 0) goto L47
            boolean r4 = yc.m.u(r4)
            r4 = r4 ^ r3
            if (r4 != r3) goto L47
            r4 = 1
            goto L48
        L47:
            r4 = 0
        L48:
            if (r4 != 0) goto L4f
            dd.g r7 = dd.i.B(r7)
            goto L89
        L4f:
            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource r7 = r6.this$0
            com.habitrpg.android.habitica.data.SocialRepository r7 = r7.getSocialRepository()
            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource r4 = r6.this$0
            java.lang.String r4 = r4.getRecipientID()
            if (r4 != 0) goto L5f
            java.lang.String r4 = ""
        L5f:
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.retrieveInboxMessages(r4, r5, r6)
            if (r7 != r0) goto L6a
            return r0
        L6a:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L73
            dd.g r7 = dd.i.s()
            goto L89
        L73:
            int r4 = r7.size()
            r5 = 10
            if (r4 >= r5) goto L80
            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource r4 = r6.this$0
            com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource.access$setLastFetchWasEnd$p(r4, r3)
        L80:
            dd.g r7 = dd.i.B(r7)
            goto L89
        L85:
            dd.g r7 = dd.i.B(r7)
        L89:
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = dd.i.r(r1, r7, r6)
            if (r7 != r0) goto L95
            return r0
        L95:
            dc.w r7 = dc.w.f13270a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadInitial$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
