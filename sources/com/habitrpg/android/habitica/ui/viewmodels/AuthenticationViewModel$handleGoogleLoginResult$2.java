package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import android.app.Activity;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.habitrpg.android.habitica.BuildConfig;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.b0;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.AuthenticationViewModel$handleGoogleLoginResult$2", f = "AuthenticationViewModel.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AuthenticationViewModel$handleGoogleLoginResult$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ b0 $newUser;
    final /* synthetic */ pc.l<Boolean, w> $onSuccess;
    final /* synthetic */ String $scopes;
    int label;
    final /* synthetic */ AuthenticationViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationViewModel$handleGoogleLoginResult$2(Activity activity, AuthenticationViewModel authenticationViewModel, String str, b0 b0Var, pc.l<? super Boolean, w> lVar, Continuation<? super AuthenticationViewModel$handleGoogleLoginResult$2> continuation) {
        super(2, continuation);
        this.$activity = activity;
        this.this$0 = authenticationViewModel;
        this.$scopes = str;
        this.$newUser = b0Var;
        this.$onSuccess = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AuthenticationViewModel$handleGoogleLoginResult$2(this.$activity, this.this$0, this.$scopes, this.$newUser, this.$onSuccess, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AuthenticationViewModel$handleGoogleLoginResult$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            Activity activity = this.$activity;
            String googleEmail = this.this$0.getGoogleEmail();
            String str = "";
            if (googleEmail == null) {
                googleEmail = "";
            }
            String token = GoogleAuthUtil.getToken(activity, googleEmail, this.$scopes);
            q.h(token, "getToken(...)");
            ApiClient apiClient = this.this$0.getApiClient();
            String googleEmail2 = this.this$0.getGoogleEmail();
            if (googleEmail2 != null) {
                str = googleEmail2;
            }
            this.label = 1;
            obj = apiClient.connectSocial(BuildConfig.STORE, str, token, this);
            if (obj == d10) {
                return d10;
            }
        }
        UserAuthResponse userAuthResponse = (UserAuthResponse) obj;
        if (userAuthResponse == null) {
            return w.f13270a;
        }
        this.$newUser.f21657f = userAuthResponse.getNewUser();
        this.this$0.handleAuthResponse(userAuthResponse);
        this.$onSuccess.invoke(b.a(this.$newUser.f21657f));
        return w.f13270a;
    }
}
