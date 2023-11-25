package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivityViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel$retrieveUser$2", f = "MainActivityViewModel.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActivityViewModel$retrieveUser$2 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$retrieveUser$2(MainActivityViewModel mainActivityViewModel, Continuation<? super MainActivityViewModel$retrieveUser$2> continuation) {
        super(2, continuation);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MainActivityViewModel$retrieveUser$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MainActivityViewModel$retrieveUser$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            UserRepository userRepository = this.this$0.getUserRepository();
            this.label = 1;
            if (userRepository.retrieveTeamPlans(this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
