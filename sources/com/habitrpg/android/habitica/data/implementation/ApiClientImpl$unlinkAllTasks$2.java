package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$unlinkAllTasks$2", f = "ApiClientImpl.kt", l = {373}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$unlinkAllTasks$2 extends l implements pc.l<Continuation<? super HabitResponse<Void>>, Object> {
    final /* synthetic */ String $challengeID;
    final /* synthetic */ String $keepOption;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$unlinkAllTasks$2(ApiClientImpl apiClientImpl, String str, String str2, Continuation<? super ApiClientImpl$unlinkAllTasks$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$challengeID = str;
        this.$keepOption = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$unlinkAllTasks$2(this.this$0, this.$challengeID, this.$keepOption, continuation);
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
            String str = this.$challengeID;
            String str2 = this.$keepOption;
            this.label = 1;
            obj = apiService.unlinkAllTasks(str, str2, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<Void>> continuation) {
        return ((ApiClientImpl$unlinkAllTasks$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
