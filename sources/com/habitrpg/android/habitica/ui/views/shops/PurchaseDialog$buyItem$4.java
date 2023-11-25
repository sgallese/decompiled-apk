package com.habitrpg.android.habitica.ui.views.shops;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$buyItem$4", f = "PurchaseDialog.kt", l = {416}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseDialog$buyItem$4 extends l implements pc.l<Continuation<? super Void>, Object> {
    int label;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$buyItem$4(PurchaseDialog purchaseDialog, Continuation<? super PurchaseDialog$buyItem$4> continuation) {
        super(1, continuation);
        this.this$0 = purchaseDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new PurchaseDialog$buyItem$4(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        InventoryRepository inventoryRepository;
        ShopItem shopItem;
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
            inventoryRepository = this.this$0.inventoryRepository;
            shopItem = this.this$0.shopItem;
            String key = shopItem.getKey();
            this.label = 1;
            obj = inventoryRepository.purchaseQuest(key, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super Void> continuation) {
        return ((PurchaseDialog$buyItem$4) create(continuation)).invokeSuspend(w.f13270a);
    }
}
