package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InboxMessageListFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$refreshConversation$1", f = "InboxMessageListFragment.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class InboxMessageListFragment$refreshConversation$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$refreshConversation$1(InboxMessageListFragment inboxMessageListFragment, Continuation<? super InboxMessageListFragment$refreshConversation$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxMessageListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InboxMessageListFragment$refreshConversation$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InboxMessageListFragment$refreshConversation$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        InboxViewModel viewModel;
        InboxViewModel viewModel2;
        d10 = ic.d.d();
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
            viewModel = this.this$0.getViewModel();
            String recipientID = viewModel.getRecipientID();
            if (recipientID == null) {
                recipientID = "";
            }
            this.label = 1;
            if (socialRepository.retrieveInboxMessages(recipientID, 0, this) == d10) {
                return d10;
            }
        }
        viewModel2 = this.this$0.getViewModel();
        viewModel2.invalidateDataSource();
        return w.f13270a;
    }
}
