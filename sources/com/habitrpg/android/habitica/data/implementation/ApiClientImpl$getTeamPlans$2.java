package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ic.d;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$getTeamPlans$2", f = "ApiClientImpl.kt", l = {836}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$getTeamPlans$2 extends l implements pc.l<Continuation<? super HabitResponse<List<? extends TeamPlan>>>, Object> {
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$getTeamPlans$2(ApiClientImpl apiClientImpl, Continuation<? super ApiClientImpl$getTeamPlans$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$getTeamPlans$2(this.this$0, continuation);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super HabitResponse<List<? extends TeamPlan>>> continuation) {
        return invoke2((Continuation<? super HabitResponse<List<TeamPlan>>>) continuation);
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
            this.label = 1;
            obj = apiService.getTeamPlans(this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super HabitResponse<List<TeamPlan>>> continuation) {
        return ((ApiClientImpl$getTeamPlans$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
