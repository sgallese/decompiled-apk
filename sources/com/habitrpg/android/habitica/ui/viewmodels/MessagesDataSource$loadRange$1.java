package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import androidx.paging.a2;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.n;
import dc.w;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import yc.v;

/* compiled from: InboxViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MessagesDataSource$loadRange$1", f = "InboxViewModel.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MessagesDataSource$loadRange$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ a2.d<ChatMessage> $callback;
    final /* synthetic */ a2.e $params;
    int label;
    final /* synthetic */ MessagesDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesDataSource$loadRange$1(MessagesDataSource messagesDataSource, a2.e eVar, a2.d<ChatMessage> dVar, Continuation<? super MessagesDataSource$loadRange$1> continuation) {
        super(2, continuation);
        this.this$0 = messagesDataSource;
        this.$params = eVar;
        this.$callback = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MessagesDataSource$loadRange$1(this.this$0, this.$params, this.$callback, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MessagesDataSource$loadRange$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        boolean u10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            String recipientID = this.this$0.getRecipientID();
            boolean z10 = false;
            if (recipientID != null) {
                u10 = v.u(recipientID);
                if ((!u10) == true) {
                    z10 = true;
                }
            }
            if (!z10) {
                return w.f13270a;
            }
            a2.e eVar = this.$params;
            int ceil = (int) Math.ceil(eVar.f5399a / eVar.f5400b);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            String recipientID2 = this.this$0.getRecipientID();
            if (recipientID2 == null) {
                recipientID2 = "";
            }
            this.label = 1;
            obj = socialRepository.retrieveInboxMessages(recipientID2, ceil, this);
            if (obj == d10) {
                return d10;
            }
        }
        List<? extends ChatMessage> list = (List) obj;
        if (list == null) {
            return w.f13270a;
        }
        if (list.size() < 10) {
            this.this$0.lastFetchWasEnd = true;
            this.$callback.a(list);
        } else {
            this.$callback.a(list);
        }
        return w.f13270a;
    }
}
