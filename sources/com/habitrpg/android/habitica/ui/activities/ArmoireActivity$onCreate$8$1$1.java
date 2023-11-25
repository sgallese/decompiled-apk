package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.InventoryRepository;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArmoireActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.ArmoireActivity$onCreate$8$1$1", f = "ArmoireActivity.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ArmoireActivity$onCreate$8$1$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ String $it1;
    int label;
    final /* synthetic */ ArmoireActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArmoireActivity$onCreate$8$1$1(ArmoireActivity armoireActivity, String str, Continuation<? super ArmoireActivity$onCreate$8$1$1> continuation) {
        super(2, continuation);
        this.this$0 = armoireActivity;
        this.$it1 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new ArmoireActivity$onCreate$8$1$1(this.this$0, this.$it1, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((ArmoireActivity$onCreate$8$1$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            InventoryRepository inventoryRepository$Habitica_2311256681_prodRelease = this.this$0.getInventoryRepository$Habitica_2311256681_prodRelease();
            String str = this.$it1;
            this.label = 1;
            if (inventoryRepository$Habitica_2311256681_prodRelease.equip("equipped", str, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
