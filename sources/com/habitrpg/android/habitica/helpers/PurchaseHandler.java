package com.habitrpg.android.habitica.helpers;

import ad.a1;
import ad.i;
import ad.l0;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c;
import com.android.billingclient.api.e;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.models.IAPGift;
import com.habitrpg.common.habitica.models.PurchaseValidationRequest;
import com.habitrpg.common.habitica.models.Transaction;
import com.habitrpg.shared.habitica.models.responses.ErrorResponse;
import dc.q;
import ec.b0;
import ec.s;
import ec.u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import qc.k0;
import retrofit2.HttpException;
import x5.l;
import x5.n;

/* compiled from: PurchaseHandler.kt */
/* loaded from: classes4.dex */
public final class PurchaseHandler implements n, l {
    private static final String PENDING_GIFTS_KEY = "PENDING_GIFTS_DATED";
    private static SharedPreferences preferences;
    private boolean alreadyTriedCancellation;
    private final ApiClient apiClient;
    private final com.android.billingclient.api.a billingClient;
    private BillingClientState billingClientState;
    private final Context context;
    private final List<String> displayedConfirmations;
    private boolean isSaleGemPurchase;
    private int listeningRetryCount;
    private Set<String> processedPurchases;
    private final MainUserViewModel userViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static Map<String, q<Date, String, String>> pendingGifts = new HashMap();

    /* compiled from: PurchaseHandler.kt */
    /* loaded from: classes4.dex */
    public static final class BillingClientState {
        private static final /* synthetic */ jc.a $ENTRIES;
        private static final /* synthetic */ BillingClientState[] $VALUES;
        public static final BillingClientState UNINITIALIZED = new BillingClientState("UNINITIALIZED", 0);
        public static final BillingClientState READY = new BillingClientState("READY", 1);
        public static final BillingClientState UNAVAILABLE = new BillingClientState("UNAVAILABLE", 2);
        public static final BillingClientState DISCONNECTED = new BillingClientState("DISCONNECTED", 3);
        public static final BillingClientState CONNECTING = new BillingClientState("CONNECTING", 4);

        private static final /* synthetic */ BillingClientState[] $values() {
            return new BillingClientState[]{UNINITIALIZED, READY, UNAVAILABLE, DISCONNECTED, CONNECTING};
        }

        static {
            BillingClientState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = jc.b.a($values);
        }

        private BillingClientState(String str, int i10) {
            super(str, i10);
        }

        public static jc.a<BillingClientState> getEntries() {
            return $ENTRIES;
        }

        public static BillingClientState valueOf(String str) {
            return (BillingClientState) Enum.valueOf(BillingClientState.class, str);
        }

        public static BillingClientState[] values() {
            return (BillingClientState[]) $VALUES.clone();
        }

        public final boolean getCanMaybePurchase() {
            if (this != UNINITIALIZED && this != READY && this != CONNECTING) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: PurchaseHandler.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final q<Date, String, String> removeGift(String str) {
            q<Date, String, String> qVar = (q) k0.d(PurchaseHandler.pendingGifts).remove(str);
            savePendingGifts();
            return qVar;
        }

        private final void savePendingGifts() {
            Map map = PurchaseHandler.pendingGifts;
            qc.q.g(map, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            String jSONObject = new JSONObject(map).toString();
            qc.q.h(jSONObject, "toString(...)");
            SharedPreferences sharedPreferences = PurchaseHandler.preferences;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(PurchaseHandler.PENDING_GIFTS_KEY, jSONObject);
                edit.apply();
            }
        }

        public final void addGift(String str, String str2, String str3) {
            qc.q.i(str, "sku");
            qc.q.i(str2, "userID");
            qc.q.i(str3, "username");
            PurchaseHandler.pendingGifts.put(str, new q(new Date(), str2, str3));
            savePendingGifts();
        }
    }

    public PurchaseHandler(Context context, ApiClient apiClient, MainUserViewModel mainUserViewModel) {
        qc.q.i(context, "context");
        qc.q.i(apiClient, "apiClient");
        qc.q.i(mainUserViewModel, "userViewModel");
        this.context = context;
        this.apiClient = apiClient;
        this.userViewModel = mainUserViewModel;
        com.android.billingclient.api.a a10 = com.android.billingclient.api.a.g(context).c(this).b().a();
        qc.q.h(a10, "build(...)");
        this.billingClient = a10;
        startListening();
        this.billingClientState = BillingClientState.UNINITIALIZED;
        this.processedPurchases = new LinkedHashSet();
        this.displayedConfirmations = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acknowledgePurchase(com.android.billingclient.api.Purchase r10, int r11, kotlin.coroutines.Continuation<? super dc.w> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.habitrpg.android.habitica.helpers.PurchaseHandler$acknowledgePurchase$1
            if (r0 == 0) goto L13
            r0 = r12
            com.habitrpg.android.habitica.helpers.PurchaseHandler$acknowledgePurchase$1 r0 = (com.habitrpg.android.habitica.helpers.PurchaseHandler$acknowledgePurchase$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.helpers.PurchaseHandler$acknowledgePurchase$1 r0 = new com.habitrpg.android.habitica.helpers.PurchaseHandler$acknowledgePurchase$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            dc.n.b(r12)
            goto La9
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            com.android.billingclient.api.Purchase r11 = (com.android.billingclient.api.Purchase) r11
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.helpers.PurchaseHandler r2 = (com.habitrpg.android.habitica.helpers.PurchaseHandler) r2
            dc.n.b(r12)
            goto L9a
        L46:
            int r11 = r0.I$0
            java.lang.Object r10 = r0.L$1
            com.android.billingclient.api.Purchase r10 = (com.android.billingclient.api.Purchase) r10
            java.lang.Object r2 = r0.L$0
            com.habitrpg.android.habitica.helpers.PurchaseHandler r2 = (com.habitrpg.android.habitica.helpers.PurchaseHandler) r2
            dc.n.b(r12)
            goto L7e
        L54:
            dc.n.b(r12)
            x5.a$a r12 = x5.a.b()
            java.lang.String r2 = r10.f()
            x5.a$a r12 = r12.b(r2)
            x5.a r12 = r12.a()
            java.lang.String r2 = "build(...)"
            qc.q.h(r12, r2)
            com.android.billingclient.api.a r2 = r9.billingClient
            r0.L$0 = r9
            r0.L$1 = r10
            r0.I$0 = r11
            r0.label = r5
            java.lang.Object r12 = x5.d.a(r2, r12, r0)
            if (r12 != r1) goto L7d
            return r1
        L7d:
            r2 = r9
        L7e:
            com.android.billingclient.api.d r12 = (com.android.billingclient.api.d) r12
            int r12 = r12.b()
            if (r12 == 0) goto Lac
            r0.L$0 = r2
            r0.L$1 = r10
            r0.I$0 = r11
            r0.label = r4
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r12 = ad.u0.a(r6, r0)
            if (r12 != r1) goto L97
            return r1
        L97:
            r8 = r11
            r11 = r10
            r10 = r8
        L9a:
            int r10 = r10 - r5
            r12 = 0
            r0.L$0 = r12
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r10 = r2.acknowledgePurchase(r11, r10, r0)
            if (r10 != r1) goto La9
            return r1
        La9:
            dc.w r10 = dc.w.f13270a
            return r10
        Lac:
            dc.w r10 = dc.w.f13270a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.acknowledgePurchase(com.android.billingclient.api.Purchase, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object acknowledgePurchase$default(PurchaseHandler purchaseHandler, Purchase purchase, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        return purchaseHandler.acknowledgePurchase(purchase, i10, continuation);
    }

    private final PurchaseValidationRequest buildValidationRequest(Purchase purchase) {
        Object c02;
        PurchaseValidationRequest purchaseValidationRequest = new PurchaseValidationRequest();
        List<String> c10 = purchase.c();
        qc.q.h(c10, "getProducts(...)");
        c02 = b0.c0(c10);
        purchaseValidationRequest.setSku((String) c02);
        purchaseValidationRequest.setTransaction(new Transaction());
        Transaction transaction = purchaseValidationRequest.getTransaction();
        if (transaction != null) {
            transaction.setReceipt(purchase.b());
        }
        Transaction transaction2 = purchaseValidationRequest.getTransaction();
        if (transaction2 != null) {
            transaction2.setSignature(purchase.g());
        }
        q<Date, String, String> qVar = pendingGifts.get(purchaseValidationRequest.getSku());
        if (qVar != null) {
            if (Math.abs(qVar.d().getTime() - purchase.e()) < zc.a.q(zc.c.o(5, zc.d.MINUTES))) {
                purchaseValidationRequest.setGift(new IAPGift(qVar.e()));
            } else {
                Companion companion = Companion;
                String sku = purchaseValidationRequest.getSku();
                if (sku == null) {
                    sku = "";
                }
                companion.removeGift(sku);
            }
        }
        return purchaseValidationRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object consume(com.android.billingclient.api.Purchase r21, int r22, kotlin.coroutines.Continuation<? super dc.w> r23) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.consume(com.android.billingclient.api.Purchase, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object consume$default(PurchaseHandler purchaseHandler, Purchase purchase, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        return purchaseHandler.consume(purchase, i10, continuation);
    }

    public final void displayConfirmationDialog(Purchase purchase, String str) {
        boolean T;
        T = b0.T(this.displayedConfirmations, purchase.a());
        if (T) {
            return;
        }
        String a10 = purchase.a();
        if (a10 != null) {
            this.displayedConfirmations.add(a10);
        }
        ExceptionHandlerKt.launchCatching$default(l0.a(a1.c()), null, new PurchaseHandler$displayConfirmationDialog$2(this, purchase, str, null), 1, null);
    }

    public static /* synthetic */ void displayConfirmationDialog$default(PurchaseHandler purchaseHandler, Purchase purchase, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        purchaseHandler.displayConfirmationDialog(purchase, str);
    }

    public final void displayGryphatriceConfirmationDialog(Purchase purchase, String str) {
        i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PurchaseHandler$displayGryphatriceConfirmationDialog$1(this, str, null), 2, null);
    }

    static /* synthetic */ void displayGryphatriceConfirmationDialog$default(PurchaseHandler purchaseHandler, Purchase purchase, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        purchaseHandler.displayGryphatriceConfirmationDialog(purchase, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0035 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0059 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String durationString(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -2028149442: goto L50;
                case -1680960131: goto L44;
                case -1623701829: goto L38;
                case -1537814376: goto L2c;
                case 958953680: goto L23;
                case 1016211982: goto L1a;
                case 1102099435: goto L11;
                case 2033868337: goto L8;
                default: goto L7;
            }
        L7:
            goto L5c
        L8:
            java.lang.String r0 = "com.habitrpg.android.habitica.norenew_subscription.12month"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L59
            goto L5c
        L11:
            java.lang.String r0 = "com.habitrpg.android.habitica.subscription.6month"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L35
            goto L5c
        L1a:
            java.lang.String r0 = "com.habitrpg.android.habitica.subscription.3month"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L5c
        L23:
            java.lang.String r0 = "com.habitrpg.android.habitica.subscription.1month"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4d
            goto L5c
        L2c:
            java.lang.String r0 = "com.habitrpg.android.habitica.norenew_subscription.6month"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L35
            goto L5c
        L35:
            java.lang.String r2 = "6"
            goto L5e
        L38:
            java.lang.String r0 = "com.habitrpg.android.habitica.norenew_subscription.3month"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L5c
        L41:
            java.lang.String r2 = "3"
            goto L5e
        L44:
            java.lang.String r0 = "com.habitrpg.android.habitica.norenew_subscription.1month"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4d
            goto L5c
        L4d:
            java.lang.String r2 = "1"
            goto L5e
        L50:
            java.lang.String r0 = "com.habitrpg.android.habitica.subscription.12month"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L59
            goto L5c
        L59:
            java.lang.String r2 = "12"
            goto L5e
        L5c:
            java.lang.String r2 = ""
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.durationString(java.lang.String):java.lang.String");
    }

    private final Purchase findMostRecentSubscription(List<? extends Purchase> list) {
        List<Purchase> x02;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Purchase) obj).h()) {
                arrayList.add(obj);
            }
        }
        x02 = b0.x0(arrayList, new Comparator() { // from class: com.habitrpg.android.habitica.helpers.PurchaseHandler$findMostRecentSubscription$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int d10;
                d10 = gc.c.d(Long.valueOf(((Purchase) t11).e()), Long.valueOf(((Purchase) t10).e()));
                return d10;
            }
        });
        Purchase purchase = null;
        for (Purchase purchase2 : x02) {
            if (purchase2.i()) {
                return purchase2;
            }
            if (!purchase2.i() && purchase == null) {
                purchase = purchase2;
            }
        }
        return purchase;
    }

    public final String gemAmountString(String str) {
        if (this.isSaleGemPurchase) {
            this.isSaleGemPurchase = false;
            switch (str.hashCode()) {
                case -709112814:
                    if (!str.equals(PurchaseTypes.Purchase4Gems)) {
                        return "";
                    }
                    return "5";
                case -614737367:
                    if (!str.equals(PurchaseTypes.Purchase21Gems)) {
                        return "";
                    }
                    return "30";
                case -556555544:
                    if (!str.equals(PurchaseTypes.Purchase42Gems)) {
                        return "";
                    }
                    return "60";
                case -440191898:
                    if (!str.equals(PurchaseTypes.Purchase84Gems)) {
                        return "";
                    }
                    return "125";
                default:
                    return "";
            }
        }
        switch (str.hashCode()) {
            case -709112814:
                if (!str.equals(PurchaseTypes.Purchase4Gems)) {
                    return "";
                }
                return "4";
            case -614737367:
                if (!str.equals(PurchaseTypes.Purchase21Gems)) {
                    return "";
                }
                return "21";
            case -556555544:
                if (!str.equals(PurchaseTypes.Purchase42Gems)) {
                    return "";
                }
                return "42";
            case -440191898:
                if (!str.equals(PurchaseTypes.Purchase84Gems)) {
                    return "";
                }
                return "84";
            default:
                return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSKU(java.lang.String r5, java.lang.String r6, kotlin.coroutines.Continuation<? super com.android.billingclient.api.e> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKU$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKU$1 r0 = (com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKU$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKU$1 r0 = new com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKU$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dc.n.b(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            dc.n.b(r7)
            java.util.List r6 = ec.r.d(r6)
            r0.label = r3
            java.lang.Object r7 = r4.loadInventory(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L4c
            java.lang.Object r5 = ec.r.c0(r7)
            com.android.billingclient.api.e r5 = (com.android.billingclient.api.e) r5
            goto L4d
        L4c:
            r5 = 0
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.getSKU(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSKUs(java.lang.String r5, java.util.List<java.lang.String> r6, kotlin.coroutines.Continuation<? super java.util.List<com.android.billingclient.api.e>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKUs$1
            if (r0 == 0) goto L13
            r0 = r7
            com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKUs$1 r0 = (com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKUs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKUs$1 r0 = new com.habitrpg.android.habitica.helpers.PurchaseHandler$getSKUs$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dc.n.b(r7)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            dc.n.b(r7)
            r0.label = r3
            java.lang.Object r7 = r4.loadInventory(r5, r6, r0)
            if (r7 != r1) goto L3d
            return r1
        L3d:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L45
            java.util.List r7 = ec.r.i()
        L45:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.getSKUs(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void handle(Purchase purchase) {
        boolean T;
        Object c02;
        boolean T2;
        boolean T3;
        boolean T4;
        if (purchase.d() == 1) {
            T = b0.T(this.processedPurchases, purchase.a());
            if (!T) {
                String a10 = purchase.a();
                if (a10 != null) {
                    this.processedPurchases.add(a10);
                }
                List<String> c10 = purchase.c();
                qc.q.h(c10, "getProducts(...)");
                c02 = b0.c0(c10);
                String str = (String) c02;
                if (qc.q.d(str, PurchaseTypes.JubilantGrphatrice)) {
                    ExceptionHandlerKt.launchCatching$default(l0.b(), null, new PurchaseHandler$handle$2(this, buildValidationRequest(purchase), purchase, str, null), 1, null);
                    return;
                }
                PurchaseTypes purchaseTypes = PurchaseTypes.INSTANCE;
                T2 = b0.T(purchaseTypes.getAllGemTypes(), str);
                if (!T2) {
                    T3 = b0.T(purchaseTypes.getAllSubscriptionNoRenewTypes(), str);
                    if (!T3) {
                        T4 = b0.T(purchaseTypes.getAllSubscriptionTypes(), str);
                        if (T4) {
                            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new PurchaseHandler$handle$5(this, buildValidationRequest(purchase), purchase, null), 1, null);
                            return;
                        }
                        return;
                    }
                    ExceptionHandlerKt.launchCatching$default(l0.b(), null, new PurchaseHandler$handle$4(this, buildValidationRequest(purchase), purchase, str, null), 1, null);
                    return;
                }
                ExceptionHandlerKt.launchCatching$default(l0.b(), null, new PurchaseHandler$handle$3(this, buildValidationRequest(purchase), purchase, str, null), 1, null);
            }
        }
    }

    public final void handleError(Throwable th, Purchase purchase) {
        Object c02;
        if (!(th instanceof HttpException)) {
            i.d(l0.a(a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PurchaseHandler$handleError$2(this, purchase, null), 2, null);
        } else {
            HttpException httpException = (HttpException) th;
            if (httpException.code() == 401) {
                ErrorResponse errorResponse = this.apiClient.getErrorResponse(httpException);
                if (errorResponse.getMessage() != null && qc.q.d(errorResponse.getMessage(), "RECEIPT_ALREADY_USED")) {
                    processedPurchase(purchase);
                    Companion companion = Companion;
                    List<String> c10 = purchase.c();
                    qc.q.h(c10, "getProducts(...)");
                    c02 = b0.c0(c10);
                    companion.removeGift((String) c02);
                    i.d(l0.a(a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PurchaseHandler$handleError$1(this, purchase, null), 2, null);
                    return;
                }
            }
        }
        Set<String> set = this.processedPurchases;
        k0.a(set).remove(purchase.a());
        com.google.firebase.crashlytics.a.a().d(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098 A[LOOP:0: B:51:0x0092->B:53:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadInventory(java.lang.String r18, java.util.List<java.lang.String> r19, kotlin.coroutines.Continuation<? super java.util.List<com.android.billingclient.api.e>> r20) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.loadInventory(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void processPurchases(com.android.billingclient.api.d dVar, List<? extends Purchase> list) {
        int b10 = dVar.b();
        if (b10 != -1) {
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 == 7) {
                        i.d(l0.a(a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PurchaseHandler$processPurchases$2(list, this, null), 2, null);
                        return;
                    } else {
                        com.google.firebase.crashlytics.a.a().d(new Throwable(dVar.a()));
                        return;
                    }
                }
                return;
            }
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new PurchaseHandler$processPurchases$1(this, list, findMostRecentSubscription(list), null), 1, null);
            return;
        }
        startListening();
    }

    public final void processedPurchase(Purchase purchase) {
        i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PurchaseHandler$processedPurchase$1(this, null), 2, null);
    }

    public static /* synthetic */ void purchase$default(PurchaseHandler purchaseHandler, Activity activity, com.android.billingclient.api.e eVar, String str, String str2, boolean z10, int i10, Object obj) {
        String str3;
        String str4;
        boolean z11;
        if ((i10 & 4) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        purchaseHandler.purchase(activity, eVar, str3, str4, z11);
    }

    public final void retryListening() {
        this.listeningRetryCount++;
        ExceptionHandlerKt.launchCatching$default(l0.a(a1.b()), null, new PurchaseHandler$retryListening$1(this, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071 A[PHI: r10
      0x0071: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:51:0x006e, B:39:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cancelSubscription(kotlin.coroutines.Continuation<? super com.habitrpg.android.habitica.models.user.User> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.helpers.PurchaseHandler$cancelSubscription$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.helpers.PurchaseHandler$cancelSubscription$1 r0 = (com.habitrpg.android.habitica.helpers.PurchaseHandler$cancelSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.helpers.PurchaseHandler$cancelSubscription$1 r0 = new com.habitrpg.android.habitica.helpers.PurchaseHandler$cancelSubscription$1
            r0.<init>(r9, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            dc.n.b(r10)
            goto L71
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            java.lang.Object r1 = r5.L$0
            com.habitrpg.android.habitica.helpers.PurchaseHandler r1 = (com.habitrpg.android.habitica.helpers.PurchaseHandler) r1
            dc.n.b(r10)
            goto L56
        L3e:
            dc.n.b(r10)
            boolean r10 = r9.alreadyTriedCancellation
            if (r10 == 0) goto L46
            return r2
        L46:
            r9.alreadyTriedCancellation = r4
            com.habitrpg.android.habitica.data.ApiClient r10 = r9.apiClient
            r5.L$0 = r9
            r5.label = r4
            java.lang.Object r10 = r10.cancelSubscription(r5)
            if (r10 != r0) goto L55
            return r0
        L55:
            r1 = r9
        L56:
            com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel r10 = r1.userViewModel
            com.habitrpg.android.habitica.data.UserRepository r1 = r10.getUserRepository()
            r10 = 0
            r4 = 1
            r6 = 0
            r7 = 4
            r8 = 0
            r5.L$0 = r2
            r5.label = r3
            r2 = r10
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            java.lang.Object r10 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L71
            return r0
        L71:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.cancelSubscription(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkForSubscription(kotlin.coroutines.Continuation<? super com.android.billingclient.api.Purchase> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.helpers.PurchaseHandler$checkForSubscription$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.helpers.PurchaseHandler$checkForSubscription$1 r0 = (com.habitrpg.android.habitica.helpers.PurchaseHandler$checkForSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.helpers.PurchaseHandler$checkForSubscription$1 r0 = new com.habitrpg.android.habitica.helpers.PurchaseHandler$checkForSubscription$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.helpers.PurchaseHandler r0 = (com.habitrpg.android.habitica.helpers.PurchaseHandler) r0
            dc.n.b(r6)
            goto L4e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            dc.n.b(r6)
            ad.g0 r6 = ad.a1.b()
            com.habitrpg.android.habitica.helpers.PurchaseHandler$checkForSubscription$result$1 r2 = new com.habitrpg.android.habitica.helpers.PurchaseHandler$checkForSubscription$result$1
            r2.<init>(r5, r3)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = ad.g.g(r6, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r5
        L4e:
            x5.m r6 = (x5.m) r6
            com.android.billingclient.api.d r1 = r6.a()
            int r1 = r1.b()
            if (r1 != 0) goto L63
            java.util.List r6 = r6.b()
            com.android.billingclient.api.Purchase r6 = r0.findMostRecentSubscription(r6)
            return r6
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.checkForSubscription(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getAllGemSKUs(Continuation<? super List<com.android.billingclient.api.e>> continuation) {
        return getSKUs("inapp", PurchaseTypes.INSTANCE.getAllGemTypes(), continuation);
    }

    public final Object getAllGiftSubscriptionProducts(Continuation<? super List<com.android.billingclient.api.e>> continuation) {
        return getSKUs("inapp", PurchaseTypes.INSTANCE.getAllSubscriptionNoRenewTypes(), continuation);
    }

    public final Object getAllSubscriptionProducts(Continuation<? super List<com.android.billingclient.api.e>> continuation) {
        return getSKUs("subs", PurchaseTypes.INSTANCE.getAllSubscriptionTypes(), continuation);
    }

    public final Object getGryphatriceSKU(Continuation<? super com.android.billingclient.api.e> continuation) {
        return getSKU("inapp", PurchaseTypes.JubilantGrphatrice, continuation);
    }

    public final Object getInAppPurchaseSKU(String str, Continuation<? super com.android.billingclient.api.e> continuation) {
        return getSKU("inapp", str, continuation);
    }

    @Override // x5.n
    public void onPurchasesUpdated(com.android.billingclient.api.d dVar, List<Purchase> list) {
        qc.q.i(dVar, "result");
        if (list != null) {
            processPurchases(dVar, list);
        }
    }

    @Override // x5.l
    public void onQueryPurchasesResponse(com.android.billingclient.api.d dVar, List<Purchase> list) {
        qc.q.i(dVar, "result");
        qc.q.i(list, "purchases");
        processPurchases(dVar, list);
    }

    public final void purchase(Activity activity, com.android.billingclient.api.e eVar, String str, String str2, boolean z10) {
        List d10;
        int s10;
        Object a02;
        qc.q.i(activity, "activity");
        qc.q.i(eVar, "skuDetails");
        this.isSaleGemPurchase = z10;
        if (str != null) {
            Companion companion = Companion;
            String b10 = eVar.b();
            qc.q.h(b10, "getProductId(...)");
            if (str2 == null) {
                str2 = str;
            }
            companion.addGift(b10, str, str2);
        }
        c.a a10 = com.android.billingclient.api.c.a();
        d10 = s.d(eVar);
        List<com.android.billingclient.api.e> list = d10;
        s10 = u.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (com.android.billingclient.api.e eVar2 : list) {
            c.b.a c10 = c.b.a().c(eVar);
            List<e.d> d11 = eVar.d();
            if (d11 != null) {
                qc.q.f(d11);
                a02 = b0.a0(d11);
                e.d dVar = (e.d) a02;
                if (dVar != null && (r1 = dVar.a()) != null) {
                    arrayList.add(c10.b(r1).a());
                }
            }
            String str3 = "";
            arrayList.add(c10.b(str3).a());
        }
        com.android.billingclient.api.c a11 = a10.b(arrayList).a();
        qc.q.h(a11, "build(...)");
        this.billingClient.f(activity, a11);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queryPurchases(kotlin.coroutines.Continuation<? super dc.w> r19) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler.queryPurchases(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void startListening() {
        if (this.billingClient.d() == 1 || this.billingClient.d() == 2 || this.billingClientState == BillingClientState.UNAVAILABLE || this.listeningRetryCount > 10) {
            return;
        }
        this.billingClientState = BillingClientState.CONNECTING;
        this.billingClient.j(new x5.e() { // from class: com.habitrpg.android.habitica.helpers.PurchaseHandler$startListening$1
            @Override // x5.e
            public void onBillingServiceDisconnected() {
                PurchaseHandler.this.billingClientState = PurchaseHandler.BillingClientState.DISCONNECTED;
                PurchaseHandler.this.retryListening();
            }

            @Override // x5.e
            public void onBillingSetupFinished(com.android.billingclient.api.d dVar) {
                qc.q.i(dVar, "billingResult");
                int b10 = dVar.b();
                if (b10 == -3) {
                    PurchaseHandler.this.retryListening();
                } else if (b10 == -1) {
                    PurchaseHandler.this.retryListening();
                } else if (b10 != 0) {
                    PurchaseHandler.this.billingClientState = PurchaseHandler.BillingClientState.UNAVAILABLE;
                } else {
                    PurchaseHandler.this.billingClientState = PurchaseHandler.BillingClientState.READY;
                    ExceptionHandlerKt.launchCatching$default(l0.b(), null, new PurchaseHandler$startListening$1$onBillingSetupFinished$1(PurchaseHandler.this, null), 1, null);
                }
            }
        });
    }

    public final void stopListening() {
        this.billingClient.c();
    }
}
