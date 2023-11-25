package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
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
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$postTaskNewPosition$2", f = "ApiClientImpl.kt", l = {466}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$postTaskNewPosition$2 extends l implements pc.l<Continuation<? super HabitResponse<List<? extends String>>>, Object> {
    final /* synthetic */ String $id;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$postTaskNewPosition$2(ApiClientImpl apiClientImpl, String str, int i10, Continuation<? super ApiClientImpl$postTaskNewPosition$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$id = str;
        this.$position = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$postTaskNewPosition$2(this.this$0, this.$id, this.$position, continuation);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super HabitResponse<List<? extends String>>> continuation) {
        return invoke2((Continuation<? super HabitResponse<List<String>>>) continuation);
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
            String str = this.$id;
            int i11 = this.$position;
            this.label = 1;
            obj = apiService.postTaskNewPosition(str, i11, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super HabitResponse<List<String>>> continuation) {
        return ((ApiClientImpl$postTaskNewPosition$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
