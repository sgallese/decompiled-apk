package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.k0;
import com.habitrpg.android.habitica.models.user.User;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: SubscriptionBottomSheetFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment$onViewCreated$3", f = "SubscriptionBottomSheetFragment.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubscriptionBottomSheetFragment$onViewCreated$3 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ SubscriptionBottomSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionBottomSheetFragment$onViewCreated$3(SubscriptionBottomSheetFragment subscriptionBottomSheetFragment, Continuation<? super SubscriptionBottomSheetFragment$onViewCreated$3> continuation) {
        super(2, continuation);
        this.this$0 = subscriptionBottomSheetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SubscriptionBottomSheetFragment$onViewCreated$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SubscriptionBottomSheetFragment$onViewCreated$3) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<User> user = this.this$0.getUserRepository().getUser();
            final SubscriptionBottomSheetFragment subscriptionBottomSheetFragment = this.this$0;
            dd.h<? super User> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionBottomSheetFragment$onViewCreated$3.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((User) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(User user2, Continuation<? super w> continuation) {
                    if (user2 != null) {
                        SubscriptionBottomSheetFragment.this.setUser(user2);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (user.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
