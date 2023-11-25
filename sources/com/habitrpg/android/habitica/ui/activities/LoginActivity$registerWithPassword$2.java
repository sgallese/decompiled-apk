package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoginActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.LoginActivity$registerWithPassword$2", f = "LoginActivity.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginActivity$registerWithPassword$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $confirmPassword;
    final /* synthetic */ String $email;
    final /* synthetic */ String $password;
    final /* synthetic */ String $username;
    int label;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActivity$registerWithPassword$2(LoginActivity loginActivity, String str, String str2, String str3, String str4, Continuation<? super LoginActivity$registerWithPassword$2> continuation) {
        super(2, continuation);
        this.this$0 = loginActivity;
        this.$username = str;
        this.$email = str2;
        this.$password = str3;
        this.$confirmPassword = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new LoginActivity$registerWithPassword$2(this.this$0, this.$username, this.$email, this.$password, this.$confirmPassword, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((LoginActivity$registerWithPassword$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            String str2 = this.$email;
            String str3 = this.$password;
            String str4 = this.$confirmPassword;
            this.label = 1;
            obj = apiClient.registerUser(str, str2, str3, str4, this);
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
