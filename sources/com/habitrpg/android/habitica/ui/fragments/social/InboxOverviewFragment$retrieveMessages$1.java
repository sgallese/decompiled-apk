package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentInboxBinding;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: InboxOverviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxOverviewFragment$retrieveMessages$1", f = "InboxOverviewFragment.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InboxOverviewFragment$retrieveMessages$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ InboxOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxOverviewFragment$retrieveMessages$1(InboxOverviewFragment inboxOverviewFragment, Continuation<? super InboxOverviewFragment$retrieveMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = inboxOverviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InboxOverviewFragment$retrieveMessages$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InboxOverviewFragment$retrieveMessages$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        SwipeRefreshLayout swipeRefreshLayout;
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
            this.label = 1;
            if (socialRepository.retrieveInboxConversations(this) == d10) {
                return d10;
            }
        }
        FragmentInboxBinding binding = this.this$0.getBinding();
        if (binding != null) {
            swipeRefreshLayout = binding.inboxRefreshLayout;
        } else {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return w.f13270a;
    }
}
