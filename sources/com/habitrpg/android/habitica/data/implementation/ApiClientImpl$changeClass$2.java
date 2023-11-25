package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$changeClass$2", f = "ApiClientImpl.kt", l = {520, 522}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$changeClass$2 extends l implements pc.l<Continuation<? super HabitResponse<User>>, Object> {
    final /* synthetic */ String $className;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$changeClass$2(String str, ApiClientImpl apiClientImpl, Continuation<? super ApiClientImpl$changeClass$2> continuation) {
        super(1, continuation);
        this.$className = str;
        this.this$0 = apiClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$changeClass$2(this.$className, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ApiService apiService;
        ApiService apiService2;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    return (HabitResponse) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            return (HabitResponse) obj;
        }
        n.b(obj);
        ApiService apiService3 = null;
        if (this.$className != null) {
            apiService2 = this.this$0.apiService;
            if (apiService2 == null) {
                q.z("apiService");
            } else {
                apiService3 = apiService2;
            }
            String str = this.$className;
            this.label = 1;
            obj = apiService3.changeClass(str, this);
            if (obj == d10) {
                return d10;
            }
            return (HabitResponse) obj;
        }
        apiService = this.this$0.apiService;
        if (apiService == null) {
            q.z("apiService");
        } else {
            apiService3 = apiService;
        }
        this.label = 2;
        obj = apiService3.changeClass(this);
        if (obj == d10) {
            return d10;
        }
        return (HabitResponse) obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<User>> continuation) {
        return ((ApiClientImpl$changeClass$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
