package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.common.habitica.models.HabitResponse;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl$feedPet$2", f = "ApiClientImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ApiClientImpl$feedPet$2 extends l implements pc.l<Continuation<? super HabitResponse<FeedResponse>>, Object> {
    final /* synthetic */ HabitResponse<FeedResponse> $response;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$feedPet$2(HabitResponse<FeedResponse> habitResponse, Continuation<? super ApiClientImpl$feedPet$2> continuation) {
        super(1, continuation);
        this.$response = habitResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new ApiClientImpl$feedPet$2(this.$response, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d.d();
        if (this.label == 0) {
            n.b(obj);
            return this.$response;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super HabitResponse<FeedResponse>> continuation) {
        return ((ApiClientImpl$feedPet$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
