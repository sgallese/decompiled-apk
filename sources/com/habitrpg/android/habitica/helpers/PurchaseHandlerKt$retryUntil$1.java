package com.habitrpg.android.habitica.helpers;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandlerKt", f = "PurchaseHandler.kt", l = {623, 624}, m = "retryUntil")
/* loaded from: classes4.dex */
public final class PurchaseHandlerKt$retryUntil$1 extends kotlin.coroutines.jvm.internal.d {
    double D$0;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PurchaseHandlerKt$retryUntil$1(Continuation<? super PurchaseHandlerKt$retryUntil$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return PurchaseHandlerKt.retryUntil(0, 0L, 0L, 0.0d, null, this);
    }
}
