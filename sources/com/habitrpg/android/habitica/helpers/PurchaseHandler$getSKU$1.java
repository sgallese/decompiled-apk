package com.habitrpg.android.habitica.helpers;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler", f = "PurchaseHandler.kt", l = {229}, m = "getSKU")
/* loaded from: classes4.dex */
public final class PurchaseHandler$getSKU$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$getSKU$1(PurchaseHandler purchaseHandler, Continuation<? super PurchaseHandler$getSKU$1> continuation) {
        super(continuation);
        this.this$0 = purchaseHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object sku;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        sku = this.this$0.getSKU(null, null, this);
        return sku;
    }
}
