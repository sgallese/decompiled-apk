package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getTasks$4", f = "ApiClientImpl.kt", l = {438}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$getTasks$4 extends l implements pc.l<Continuation<? super HabitResponse<TaskList>>, Object> {
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$getTasks$4(ApiClientImpl apiClientImpl, String str, Continuation<? super ApiClientImpl$getTasks$4> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$type = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$getTasks$4(this.this$0, this.$type, continuation);
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
            String str = this.$type;
            this.label = 1;
            obj = apiService.getTasks(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<TaskList>> continuation) {
        return ((ApiClientImpl$getTasks$4) create(continuation)).invokeSuspend(w.f13270a);
    }
}
