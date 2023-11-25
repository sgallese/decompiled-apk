package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.models.responses.BulkTaskScoringData;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ic.d;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$bulkScoreTasks$2", f = "ApiClientImpl.kt", l = {462}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$bulkScoreTasks$2 extends l implements pc.l<Continuation<? super HabitResponse<BulkTaskScoringData>>, Object> {
    final /* synthetic */ List<Map<String, String>> $data;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiClientImpl$bulkScoreTasks$2(ApiClientImpl apiClientImpl, List<? extends Map<String, String>> list, Continuation<? super ApiClientImpl$bulkScoreTasks$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$data = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$bulkScoreTasks$2(this.this$0, this.$data, continuation);
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
            List<Map<String, String>> list = this.$data;
            this.label = 1;
            obj = apiService.bulkScoreTasks(list, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<BulkTaskScoringData>> continuation) {
        return ((ApiClientImpl$bulkScoreTasks$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
