package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.models.responses.UnlockResponse;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$unlockPath$2", f = "ApiClientImpl.kt", l = {450}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$unlockPath$2 extends l implements pc.l<Continuation<? super HabitResponse<UnlockResponse>>, Object> {
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$unlockPath$2(ApiClientImpl apiClientImpl, String str, Continuation<? super ApiClientImpl$unlockPath$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$unlockPath$2(this.this$0, this.$path, continuation);
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
            String str = this.$path;
            this.label = 1;
            obj = apiService.unlockPath(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<UnlockResponse>> continuation) {
        return ((ApiClientImpl$unlockPath$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
