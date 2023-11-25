package com.habitrpg.android.habitica.ui.fragments.social;

import ad.k0;
import ad.u0;
import androidx.recyclerview.widget.m;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.ui.viewmodels.InboxViewModel;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InboxMessageListFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.social.InboxMessageListFragment$sendMessage$1$2", f = "InboxMessageListFragment.kt", l = {188, 189}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class InboxMessageListFragment$sendMessage$1$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $chatText;
    final /* synthetic */ String $userID;
    int label;
    final /* synthetic */ InboxMessageListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxMessageListFragment$sendMessage$1$2(InboxMessageListFragment inboxMessageListFragment, String str, String str2, Continuation<? super InboxMessageListFragment$sendMessage$1$2> continuation) {
        super(2, continuation);
        this.this$0 = inboxMessageListFragment;
        this.$userID = str;
        this.$chatText = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InboxMessageListFragment$sendMessage$1$2(this.this$0, this.$userID, this.$chatText, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InboxMessageListFragment$sendMessage$1$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        InboxViewModel viewModel;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    viewModel = this.this$0.getViewModel();
                    viewModel.invalidateDataSource();
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            SocialRepository socialRepository = this.this$0.getSocialRepository();
            String str = this.$userID;
            String str2 = this.$chatText;
            this.label = 1;
            if (socialRepository.postPrivateMessage(str, str2, this) == d10) {
                return d10;
            }
        }
        long o10 = zc.c.o(m.e.DEFAULT_DRAG_ANIMATION_DURATION, zc.d.MILLISECONDS);
        this.label = 2;
        if (u0.b(o10, this) == d10) {
            return d10;
        }
        viewModel = this.this$0.getViewModel();
        viewModel.invalidateDataSource();
        return w.f13270a;
    }
}
