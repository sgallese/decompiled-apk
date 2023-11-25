package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.common.habitica.models.HabitResponse;
import com.habitrpg.common.habitica.models.auth.UserAuthResponse;
import dc.n;
import dc.w;
import ec.m0;
import ic.d;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$loginApple$2", f = "ApiClientImpl.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$loginApple$2 extends l implements pc.l<Continuation<? super HabitResponse<UserAuthResponse>>, Object> {
    final /* synthetic */ String $authToken;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$loginApple$2(ApiClientImpl apiClientImpl, String str, Continuation<? super ApiClientImpl$loginApple$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$authToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$loginApple$2(this.this$0, this.$authToken, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ApiService apiService;
        Map<String, Object> e10;
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
            apiService = this.this$0.apiService;
            if (apiService == null) {
                q.z("apiService");
                apiService = null;
            }
            e10 = m0.e(new dc.l("code", this.$authToken));
            this.label = 1;
            obj = apiService.loginApple(e10, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<UserAuthResponse>> continuation) {
        return ((ApiClientImpl$loginApple$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
