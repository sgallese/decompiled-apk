package com.habitrpg.android.habitica.ui.activities;

import com.android.billingclient.api.e;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import kotlin.coroutines.Continuation;

/* compiled from: BirthdayActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.BirthdayActivity$onCreate$4", f = "BirthdayActivity.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BirthdayActivity$onCreate$4 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BirthdayActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayActivity$onCreate$4(BirthdayActivity birthdayActivity, Continuation<? super BirthdayActivity$onCreate$4> continuation) {
        super(2, continuation);
        this.this$0 = birthdayActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new BirthdayActivity$onCreate$4(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((BirthdayActivity$onCreate$4) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        BirthdayActivity birthdayActivity;
        j0.j1 j1Var;
        com.android.billingclient.api.e eVar;
        String str;
        e.a a10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                birthdayActivity = (BirthdayActivity) this.L$0;
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            BirthdayActivity birthdayActivity2 = this.this$0;
            PurchaseHandler purchaseHandler = birthdayActivity2.getPurchaseHandler();
            this.L$0 = birthdayActivity2;
            this.label = 1;
            Object gryphatriceSKU = purchaseHandler.getGryphatriceSKU(this);
            if (gryphatriceSKU == d10) {
                return d10;
            }
            birthdayActivity = birthdayActivity2;
            obj = gryphatriceSKU;
        }
        birthdayActivity.gryphatriceProductDetails = (com.android.billingclient.api.e) obj;
        j1Var = this.this$0.price;
        eVar = this.this$0.gryphatriceProductDetails;
        if (eVar != null && (a10 = eVar.a()) != null) {
            str = a10.a();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        j1Var.setValue(str);
        return dc.w.f13270a;
    }
}
