package com.habitrpg.android.habitica.interactors;

import android.app.Activity;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.interactors.UseCase;
import dc.w;
import qc.q;

/* compiled from: InsufficientGemsUseCase.kt */
/* loaded from: classes4.dex */
public final class InsufficientGemsUseCase extends UseCase<RequestValues, w> {
    public static final int $stable = 8;
    private final PurchaseHandler purchaseHandler;

    /* compiled from: InsufficientGemsUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class RequestValues implements UseCase.RequestValues {
        public static final int $stable = 8;
        private final Activity activity;
        private final int gemPrice;

        public RequestValues(int i10, Activity activity) {
            q.i(activity, "activity");
            this.gemPrice = i10;
            this.activity = activity;
        }

        public final Activity getActivity() {
            return this.activity;
        }

        public final int getGemPrice() {
            return this.gemPrice;
        }
    }

    public InsufficientGemsUseCase(PurchaseHandler purchaseHandler) {
        q.i(purchaseHandler, "purchaseHandler");
        this.purchaseHandler = purchaseHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    @Override // com.habitrpg.android.habitica.interactors.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object run(com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase.RequestValues r11, kotlin.coroutines.Continuation<? super dc.w> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase$run$1
            if (r0 == 0) goto L13
            r0 = r12
            com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase$run$1 r0 = (com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase$run$1 r0 = new com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase$run$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.L$1
            com.habitrpg.android.habitica.ui.activities.MainActivity r11 = (com.habitrpg.android.habitica.ui.activities.MainActivity) r11
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase r0 = (com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase) r0
            dc.n.b(r12)
            r3 = r11
            goto L6c
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            dc.n.b(r12)
            android.app.Activity r12 = r11.getActivity()
            boolean r2 = r12 instanceof com.habitrpg.android.habitica.ui.activities.MainActivity
            if (r2 == 0) goto L48
            com.habitrpg.android.habitica.ui.activities.MainActivity r12 = (com.habitrpg.android.habitica.ui.activities.MainActivity) r12
            goto L49
        L48:
            r12 = 0
        L49:
            if (r12 != 0) goto L4e
            dc.w r11 = dc.w.f13270a
            return r11
        L4e:
            int r11 = r11.getGemPrice()
            r2 = 4
            if (r11 <= r2) goto L58
            java.lang.String r11 = "com.habitrpg.android.habitica.iap.21gems"
            goto L5a
        L58:
            java.lang.String r11 = "com.habitrpg.android.habitica.iap.4gems"
        L5a:
            com.habitrpg.android.habitica.helpers.PurchaseHandler r2 = r10.purchaseHandler
            r0.L$0 = r10
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r11 = r2.getInAppPurchaseSKU(r11, r0)
            if (r11 != r1) goto L69
            return r1
        L69:
            r0 = r10
            r3 = r12
            r12 = r11
        L6c:
            r4 = r12
            com.android.billingclient.api.e r4 = (com.android.billingclient.api.e) r4
            if (r4 != 0) goto L74
            dc.w r11 = dc.w.f13270a
            return r11
        L74:
            com.habitrpg.android.habitica.helpers.PurchaseHandler r2 = r0.purchaseHandler
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 28
            r9 = 0
            com.habitrpg.android.habitica.helpers.PurchaseHandler.purchase$default(r2, r3, r4, r5, r6, r7, r8, r9)
            dc.w r11 = dc.w.f13270a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase.run(com.habitrpg.android.habitica.interactors.InsufficientGemsUseCase$RequestValues, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
