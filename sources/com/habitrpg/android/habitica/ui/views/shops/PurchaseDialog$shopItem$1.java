package com.habitrpg.android.habitica.ui.views.shops;

import ad.k0;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import dc.n;
import dc.w;
import dd.g;
import dd.i;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$shopItem$1", f = "PurchaseDialog.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseDialog$shopItem$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ PurchaseDialogContent $contentView;
    int label;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$shopItem$1(PurchaseDialog purchaseDialog, PurchaseDialogContent purchaseDialogContent, Continuation<? super PurchaseDialog$shopItem$1> continuation) {
        super(2, continuation);
        this.this$0 = purchaseDialog;
        this.$contentView = purchaseDialogContent;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseDialog$shopItem$1(this.this$0, this.$contentView, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseDialog$shopItem$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            g<QuestContent> questContent = inventoryRepository.getQuestContent(shopItem.getKey());
            this.label = 1;
            obj = i.x(questContent, this);
            if (obj == d10) {
                return d10;
            }
        }
        QuestContent questContent2 = (QuestContent) obj;
        if (questContent2 != null) {
            this.$contentView.setQuestContentItem(questContent2);
        }
        return w.f13270a;
    }
}
