package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.LoginActivity$handleAuthResponse$2", f = "LoginActivity.kt", l = {296}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginActivity$handleAuthResponse$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ boolean $isNew;
    int label;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$handleAuthResponse$2(LoginActivity loginActivity, boolean z10, Continuation<? super LoginActivity$handleAuthResponse$2> continuation) {
        super(2, continuation);
        this.this$0 = loginActivity;
        this.$isNew = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new LoginActivity$handleAuthResponse$2(this.this$0, this.$isNew, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((LoginActivity$handleAuthResponse$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, true, true, false, this, 4, null) == d10) {
                return d10;
            }
        }
        if (this.$isNew) {
            this.this$0.startSetupActivity();
        } else {
            this.this$0.startMainActivity();
            Analytics.sendEvent$default(Analytics.INSTANCE, "login", EventCategory.BEHAVIOUR, HitType.EVENT, null, null, 24, null);
        }
        return dc.w.f13270a;
    }
}
