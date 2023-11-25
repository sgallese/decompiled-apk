package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.OwnedItem;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import ic.d;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.q;

/* compiled from: Merge.kt */
@f(c = "com.habitrpg.android.habitica.data.implementation.InventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2", f = "InventoryRepositoryImpl.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class InventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2 extends l implements q<h<? super Map<String, ? extends OwnedItem>>, String, Continuation<? super w>, Object> {
    final /* synthetic */ boolean $includeZero$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InventoryRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2(Continuation continuation, InventoryRepositoryImpl inventoryRepositoryImpl, boolean z10) {
        super(3, continuation);
        this.this$0 = inventoryRepositoryImpl;
        this.$includeZero$inlined = z10;
    }

    @Override // pc.q
    public final Object invoke(h<? super Map<String, ? extends OwnedItem>> hVar, String str, Continuation<? super w> continuation) {
        InventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2 inventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2 = new InventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2(continuation, this.this$0, this.$includeZero$inlined);
        inventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2.L$0 = hVar;
        inventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2.L$1 = str;
        return inventoryRepositoryImpl$getOwnedItems$$inlined$flatMapLatest$2.invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            h hVar = (h) this.L$0;
            g<Map<String, OwnedItem>> ownedItems = this.this$0.getLocalRepository().getOwnedItems((String) this.L$1, this.$includeZero$inlined);
            this.label = 1;
            if (i.r(hVar, ownedItems, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
