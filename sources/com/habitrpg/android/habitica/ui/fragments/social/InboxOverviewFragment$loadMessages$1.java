package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import com.habitrpg.android.habitica.models.social.InboxConversation;
import dc.n;
import dc.w;
import io.realm.g1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InboxOverviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment$loadMessages$1", f = "InboxOverviewFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class InboxOverviewFragment$loadMessages$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ InboxOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxOverviewFragment$loadMessages$1(InboxOverviewFragment inboxOverviewFragment, Continuation<? super InboxOverviewFragment$loadMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxOverviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InboxOverviewFragment$loadMessages$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InboxOverviewFragment$loadMessages$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            dd.g<g1<InboxConversation>> inboxConversations = this.this$0.getSocialRepository().getInboxConversations();
            final InboxOverviewFragment inboxOverviewFragment = this.this$0;
            dd.h<? super g1<InboxConversation>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment$loadMessages$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((g1) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(g1<InboxConversation> g1Var, Continuation<? super w> continuation) {
                    InboxOverviewFragment.this.setInboxMessages(g1Var);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (inboxConversations.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
