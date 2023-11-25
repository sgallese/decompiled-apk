package com.habitrpg.android.habitica.data.implementation;

import ad.k0;
import com.habitrpg.android.habitica.data.local.UserLocalRepository;
import com.habitrpg.android.habitica.models.user.User;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.UserRepositoryImpl$retrieveUser$2", f = "UserRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$retrieveUser$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ UserRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$retrieveUser$2(UserRepositoryImpl userRepositoryImpl, User user, Continuation<? super UserRepositoryImpl$retrieveUser$2> continuation) {
        super(2, continuation);
        this.this$0 = userRepositoryImpl;
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new UserRepositoryImpl$retrieveUser$2(this.this$0, this.$user, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((UserRepositoryImpl$retrieveUser$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d.d();
        if (this.label == 0) {
            n.b(obj);
            UserLocalRepository.DefaultImpls.saveUser$default(this.this$0.getLocalRepository(), this.$user, false, 2, null);
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
