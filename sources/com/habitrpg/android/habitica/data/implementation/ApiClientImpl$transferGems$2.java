package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.api.ApiService;
import com.habitrpg.common.habitica.models.HabitResponse;
import dc.n;
import dc.w;
import ec.n0;
import ic.d;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$transferGems$2", f = "ApiClientImpl.kt", l = {832}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ApiClientImpl$transferGems$2 extends l implements pc.l<Continuation<? super HabitResponse<Void>>, Object> {
    final /* synthetic */ int $amount;
    final /* synthetic */ String $giftedID;
    int label;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$transferGems$2(ApiClientImpl apiClientImpl, String str, int i10, Continuation<? super ApiClientImpl$transferGems$2> continuation) {
        super(1, continuation);
        this.this$0 = apiClientImpl;
        this.$giftedID = str;
        this.$amount = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$transferGems$2(this.this$0, this.$giftedID, this.$amount, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ApiService apiService;
        Map<String, Object> k10;
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
            k10 = n0.k(new dc.l("toUserId", this.$giftedID), new dc.l("gemAmount", b.d(this.$amount)));
            this.label = 1;
            obj = apiService.transferGems(k10, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<Void>> continuation) {
        return ((ApiClientImpl$transferGems$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
