package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadMarketGear$1", f = "ShopFragment.kt", l = {373, 375}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ShopFragment$loadMarketGear$1 extends l implements p<k0, Continuation<? super w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$loadMarketGear$1(ShopFragment shopFragment, Continuation<? super ShopFragment$loadMarketGear$1> continuation) {
        super(2, continuation);
        this.this$0 = shopFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new ShopFragment$loadMarketGear$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((ShopFragment$loadMarketGear$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[LOOP:0: B:23:0x0064->B:25:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r5.L$0
            com.habitrpg.android.habitica.models.shops.Shop r0 = (com.habitrpg.android.habitica.models.shops.Shop) r0
            dc.n.b(r6)
            goto L52
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            dc.n.b(r6)
            goto L34
        L22:
            dc.n.b(r6)
            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment r6 = r5.this$0
            com.habitrpg.android.habitica.data.InventoryRepository r6 = r6.getInventoryRepository()
            r5.label = r3
            java.lang.Object r6 = r6.retrieveMarketGear(r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            com.habitrpg.android.habitica.models.shops.Shop r6 = (com.habitrpg.android.habitica.models.shops.Shop) r6
            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment r1 = r5.this$0
            com.habitrpg.android.habitica.data.InventoryRepository r1 = r1.getInventoryRepository()
            dd.g r1 = r1.getOwnedEquipment()
            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadMarketGear$1$invokeSuspend$$inlined$map$1 r3 = new com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadMarketGear$1$invokeSuspend$$inlined$map$1
            r3.<init>()
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r1 = dd.i.x(r3, r5)
            if (r1 != r0) goto L50
            return r0
        L50:
            r0 = r6
            r6 = r1
        L52:
            java.util.List r6 = (java.util.List) r6
            if (r0 == 0) goto L5c
            java.util.List r1 = r0.getCategories()
            if (r1 != 0) goto L60
        L5c:
            java.util.List r1 = ec.r.i()
        L60:
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r1.next()
            com.habitrpg.android.habitica.models.shops.ShopCategory r2 = (com.habitrpg.android.habitica.models.shops.ShopCategory) r2
            java.util.List r3 = r2.getItems()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            xc.g r3 = ec.r.R(r3)
            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadMarketGear$1$items$1 r4 = new com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadMarketGear$1$items$1
            r4.<init>(r6)
            xc.g r3 = xc.j.m(r3, r4)
            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadMarketGear$1$invokeSuspend$$inlined$sortedBy$1 r4 = new com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadMarketGear$1$invokeSuspend$$inlined$sortedBy$1
            r4.<init>()
            xc.g r3 = xc.j.z(r3, r4)
            java.util.List r3 = xc.j.D(r3)
            java.util.List r4 = r2.getItems()
            r4.clear()
            java.util.List r2 = r2.getItems()
            java.util.Collection r3 = (java.util.Collection) r3
            r2.addAll(r3)
            goto L64
        La1:
            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment r6 = r5.this$0
            if (r0 == 0) goto Laa
            java.util.List r1 = r0.getCategories()
            goto Lab
        Laa:
            r1 = 0
        Lab:
            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment.access$setGearCategories$p(r6, r1)
            com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment r6 = r5.this$0
            com.habitrpg.android.habitica.ui.adapter.inventory.ShopRecyclerAdapter r6 = r6.getAdapter()
            if (r6 != 0) goto Lb7
            goto Lc7
        Lb7:
            if (r0 == 0) goto Lbf
            java.util.List r0 = r0.getCategories()
            if (r0 != 0) goto Lc4
        Lbf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc4:
            r6.setGearCategories(r0)
        Lc7:
            dc.w r6 = dc.w.f13270a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment$loadMarketGear$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
