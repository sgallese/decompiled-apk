package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.models.social.Challenge;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$createChallenge$2", f = "ApiClientImpl.kt", l = {718}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$createChallenge$2 extends l implements pc.l<Continuation<? super HabitResponse<Challenge>>, Object> {
    final /* synthetic */ Challenge $challenge;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$createChallenge$2(ApiClientImpl apiClientImpl, Challenge challenge, Continuation<? super ApiClientImpl$createChallenge$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$challenge = challenge;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$createChallenge$2(this.this$0, this.$challenge, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ApiService apiService;
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
            Challenge challenge = this.$challenge;
            this.label = 1;
            obj = apiService.createChallenge(challenge, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<Challenge>> continuation) {
        return ((ApiClientImpl$createChallenge$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
