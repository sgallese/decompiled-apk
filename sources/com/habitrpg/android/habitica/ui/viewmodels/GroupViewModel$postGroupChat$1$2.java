package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import androidx.lifecycle.f0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.responses.PostChatMessageResult;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import dc.n;
import dc.w;
import ec.b0;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GroupViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.GroupViewModel$postGroupChat$1$2", f = "GroupViewModel.kt", l = {259}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GroupViewModel$postGroupChat$1$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $chatText;
    final /* synthetic */ String $groupID;
    final /* synthetic */ pc.a<w> $onComplete;
    int label;
    final /* synthetic */ GroupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewModel$postGroupChat$1$2(GroupViewModel groupViewModel, String str, String str2, pc.a<w> aVar, Continuation<? super GroupViewModel$postGroupChat$1$2> continuation) {
        super(2, continuation);
        this.this$0 = groupViewModel;
        this.$groupID = str;
        this.$chatText = str2;
        this.$onComplete = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GroupViewModel$postGroupChat$1$2(this.this$0, this.$groupID, this.$chatText, this.$onComplete, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GroupViewModel$postGroupChat$1$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        f0 f0Var;
        List list;
        f0 f0Var2;
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
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            String str = this.$groupID;
            String str2 = this.$chatText;
            this.label = 1;
            obj = socialRepository.postGroupChat(str, str2, this);
            if (obj == d10) {
                return d10;
            }
        }
        PostChatMessageResult postChatMessageResult = (PostChatMessageResult) obj;
        f0Var = this.this$0.get_chatMessages();
        List list2 = (List) f0Var.f();
        if (list2 != null) {
            list = b0.F0(list2);
        } else {
            list = null;
        }
        if (postChatMessageResult != null && list != null) {
            ChatMessage chatMessage = postChatMessageResult.message;
            q.h(chatMessage, "message");
            list.add(0, chatMessage);
        }
        f0Var2 = this.this$0.get_chatMessages();
        f0Var2.n(list);
        this.$onComplete.invoke();
        return w.f13270a;
    }
}
