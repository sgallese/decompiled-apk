package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.android.habitica.models.responses.BuyResponse;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ec.m0;
import ic.d;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$buyItem$2", f = "ApiClientImpl.kt", l = {369}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$buyItem$2 extends l implements pc.l<Continuation<? super HabitResponse<BuyResponse>>, Object> {
    final /* synthetic */ String $itemKey;
    final /* synthetic */ int $purchaseQuantity;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$buyItem$2(ApiClientImpl apiClientImpl, String str, int i10, Continuation<? super ApiClientImpl$buyItem$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$itemKey = str;
        this.$purchaseQuantity = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$buyItem$2(this.this$0, this.$itemKey, this.$purchaseQuantity, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ApiService apiService;
        Map<String, Integer> e10;
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
            String str = this.$itemKey;
            e10 = m0.e(new dc.l("quantity", b.d(this.$purchaseQuantity)));
            this.label = 1;
            obj = apiService.buyItem(str, e10, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<BuyResponse>> continuation) {
        return ((ApiClientImpl$buyItem$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
