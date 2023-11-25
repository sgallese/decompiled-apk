package com.habitrpg.android.habitica.ui.views.shops;

import ad.k0;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$3$1", f = "PurchaseDialog.kt", l = {285}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseDialog$3$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$3$1(PurchaseDialog purchaseDialog, Continuation<? super PurchaseDialog$3$1> continuation) {
        super(2, continuation);
        this.this$0 = purchaseDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseDialog$3$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseDialog$3$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            this.label = 1;
            if (inventoryRepository.togglePinnedItem(shopItem, this) == d10) {
                return d10;
            }
        }
        this.this$0.setPinned(!r4.isPinned());
        return w.f13270a;
    }
}
