package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: SubscriptionBottomSheetFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment$refresh$1", f = "SubscriptionBottomSheetFragment.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubscriptionBottomSheetFragment$refresh$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ SubscriptionBottomSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionBottomSheetFragment$refresh$1(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, Continuation<? super SubscriptionBottomSheetFragment$refresh$1> continuation) {
        super(2, continuation);
        this.this$0 = subscriptionBottomSheetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SubscriptionBottomSheetFragment$refresh$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SubscriptionBottomSheetFragment$refresh$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            UserRepository userRepository = this.this$0.getUserRepository();
            this.label = 1;
            if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, false, true, false, this, 4, null) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
