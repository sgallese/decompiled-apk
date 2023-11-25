package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetupActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SetupActivity$onUserReceived$1", f = "SetupActivity.kt", l = {227, 228}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SetupActivity$onUserReceived$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ SetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupActivity$onUserReceived$1(SetupActivity setupActivity, Continuation<? super SetupActivity$onUserReceived$1> continuation) {
        super(2, continuation);
        this.this$0 = setupActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new SetupActivity$onUserReceived$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((SetupActivity$onUserReceived$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    dc.n.b(obj);
                    this.this$0.startMainActivity();
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dc.n.b(obj);
        } else {
            dc.n.b(obj);
            UserRepository userRepository = this.this$0.getUserRepository();
            Boolean a10 = kotlin.coroutines.jvm.internal.b.a(true);
            this.label = 1;
            if (userRepository.updateUser("flags.welcomed", a10, this) == d10) {
                return d10;
            }
        }
        UserRepository userRepository2 = this.this$0.getUserRepository();
        this.label = 2;
        if (UserRepository.DefaultImpls.retrieveUser$default(userRepository2, true, true, false, this, 4, null) == d10) {
            return d10;
        }
        this.this$0.startMainActivity();
        return dc.w.f13270a;
    }
}
