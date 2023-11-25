package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.LoginActivity$loginWithPassword$2", f = "LoginActivity.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginActivity$loginWithPassword$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $password;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$loginWithPassword$2(LoginActivity loginActivity, String str, String str2, Continuation<? super LoginActivity$loginWithPassword$2> continuation) {
        super(2, continuation);
        this.this$0 = loginActivity;
        this.$username = str;
        this.$password = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new LoginActivity$loginWithPassword$2(this.this$0, this.$username, this.$password, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((LoginActivity$loginWithPassword$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            ApiClient apiClient = this.this$0.getApiClient();
            String str = this.$username;
            String str2 = this.$password;
            this.label = 1;
            obj = apiClient.connectUser(str, str2, this);
            if (obj == d10) {
                return d10;
            }
        }
        UserAuthResponse userAuthResponse = (UserAuthResponse) obj;
        if (userAuthResponse != null) {
            this.this$0.handleAuthResponse(userAuthResponse);
        } else {
            this.this$0.hideProgress();
        }
        return dc.w.f13270a;
    }
}
