package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.adapter.social.InboxAdapter;
import com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: InboxMessageListFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$onViewCreated$1", f = "InboxMessageListFragment.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InboxMessageListFragment$onViewCreated$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$onViewCreated$1(InboxMessageListFragment inboxMessageListFragment, Continuation<? super InboxMessageListFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxMessageListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InboxMessageListFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InboxMessageListFragment$onViewCreated$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
                viewModel2 = this.this$0.getViewModel();
                recipientID = viewModel2.getRecipientUsername();
                if (recipientID == null) {
                    recipientID = "";
                }
            }
            dd.g<Member> member = socialRepository.getMember(recipientID);
            final InboxMessageListFragment inboxMessageListFragment = this.this$0;
            dd.h<? super Member> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$onViewCreated$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Member) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(Member member2, Continuation<? super w> continuation) {
                    InboxAdapter inboxAdapter;
                    MainActivity mainActivity = InboxMessageListFragment.this.getMainActivity();
                    if (mainActivity != null) {
                        mainActivity.setTitle(member2 != null ? member2.getDisplayName() : null);
                    }
                    inboxAdapter = InboxMessageListFragment.this.chatAdapter;
                    if (inboxAdapter != null) {
                        inboxAdapter.setReplyToUser$Habitica_2311256681_prodRelease(member2);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (member.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
