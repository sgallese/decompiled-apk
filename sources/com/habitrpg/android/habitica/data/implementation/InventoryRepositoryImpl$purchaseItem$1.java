package com.habitrpg.android.habitica.data.implementation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InventoryRepositoryImpl.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl", f = "InventoryRepositoryImpl.kt", l = {302}, m = "purchaseItem")
/* loaded from: classes4.dex */
public final class InventoryRepositoryImpl$purchaseItem$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InventoryRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryRepositoryImpl$purchaseItem$1(InventoryRepositoryImpl inventoryRepositoryImpl, Continuation<? super InventoryRepositoryImpl$purchaseItem$1> continuation) {
        super(continuation);
        this.this$0 = inventoryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.purchaseItem(null, null, 0, this);
    }
}
