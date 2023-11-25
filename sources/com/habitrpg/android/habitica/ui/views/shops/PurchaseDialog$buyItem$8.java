package com.habitrpg.android.habitica.ui.views.shops;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.responses.BuyResponse;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.ArmoireActivityDirections;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$buyItem$8", f = "PurchaseDialog.kt", l = {429}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseDialog$buyItem$8 extends l implements pc.l<Continuation<? super w>, Object> {
    final /* synthetic */ int $quantity;
    int label;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$buyItem$8(PurchaseDialog purchaseDialog, int i10, Continuation<? super PurchaseDialog$buyItem$8> continuation) {
        super(1, continuation);
        this.this$0 = purchaseDialog;
        this.$quantity = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new PurchaseDialog$buyItem$8(this.this$0, this.$quantity, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        InventoryRepository inventoryRepository;
        User user;
        ShopItem shopItem;
        ShopItem shopItem2;
        ShopItem shopItem3;
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
            user = this.this$0.user;
            shopItem = this.this$0.shopItem;
            String key = shopItem.getKey();
            shopItem2 = this.this$0.shopItem;
            double value = shopItem2.getValue();
            int i11 = this.$quantity;
            this.label = 1;
            obj = inventoryRepository.buyItem(user, key, value, i11, this);
            if (obj == d10) {
                return d10;
            }
        }
        BuyResponse buyResponse = (BuyResponse) obj;
        shopItem3 = this.this$0.shopItem;
        if (q.d(shopItem3.getKey(), "armoire") && buyResponse != null) {
            MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
            String str = buyResponse.armoire.get(TaskFormActivity.TASK_TYPE_KEY);
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = buyResponse.armoire.get("dropText");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = buyResponse.armoire.get("dropKey");
            if (str4 == null) {
                str4 = "";
            }
            String str5 = buyResponse.armoire.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (str5 != null) {
                str2 = str5;
            }
            mainNavigationController.navigate(R.id.armoireActivity, ArmoireActivityDirections.openArmoireActivity(str, str3, str4, str2).getArguments());
        }
        return w.f13270a;
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super w> continuation) {
        return ((PurchaseDialog$buyItem$8) create(continuation)).invokeSuspend(w.f13270a);
    }
}
