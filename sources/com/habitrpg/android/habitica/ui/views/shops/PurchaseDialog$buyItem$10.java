package com.habitrpg.android.habitica.ui.views.shops;

import ad.k0;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$buyItem$10", f = "PurchaseDialog.kt", l = {446, 468, 469}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseDialog$buyItem$10 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ HabiticaBaseApplication $application;
    final /* synthetic */ pc.l<Continuation<Object>, Object> $observable;
    final /* synthetic */ String[] $snackbarText;
    int label;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseDialog$buyItem$10(pc.l<? super Continuation<Object>, ? extends Object> lVar, String[] strArr, PurchaseDialog purchaseDialog, HabiticaBaseApplication habiticaBaseApplication, Continuation<? super PurchaseDialog$buyItem$10> continuation) {
        super(2, continuation);
        this.$observable = lVar;
        this.$snackbarText = strArr;
        this.this$0 = purchaseDialog;
        this.$application = habiticaBaseApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseDialog$buyItem$10(this.$observable, this.$snackbarText, this.this$0, this.$application, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseDialog$buyItem$10) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$buyItem$10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
