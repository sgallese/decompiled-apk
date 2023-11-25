package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ApiClientImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.ApiClientImpl", f = "ApiClientImpl.kt", l = {93}, m = "process")
/* loaded from: classes4.dex */
public final class ApiClientImpl$process$1<T> extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ApiClientImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$process$1(ApiClientImpl apiClientImpl, Continuation<? super ApiClientImpl$process$1> continuation) {
        super(continuation);
        this.this$0 = apiClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object process;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        process = this.this$0.process(null, this);
        return process;
    }
}
