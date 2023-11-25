package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import j0.d3;

/* compiled from: BirthdayActivity.kt */
/* loaded from: classes4.dex */
public final class BirthdayActivity extends Hilt_BirthdayActivity {
    public static final int $stable = 8;
    public AppConfigManager configManager;
    private com.android.billingclient.api.e gryphatriceProductDetails;
    private final j0.j1<Boolean> hasEquipped;
    private final j0.j1<Boolean> hasGryphatrice;
    public InventoryRepository inventoryRepository;
    private final j0.j1<Boolean> isPurchasing;
    private final j0.j1<String> price;
    public PurchaseHandler purchaseHandler;
    private final f0.g1 scaffoldState;
    public MainUserViewModel userViewModel;

    /* JADX WARN: Type inference failed for: r3v0, types: [pc.l, qc.h] */
    public BirthdayActivity() {
        j0.j1<Boolean> e10;
        j0.j1<String> e11;
        j0.j1<Boolean> e12;
        j0.j1<Boolean> e13;
        ?? r32 = 0;
        this.scaffoldState = new f0.g1(new f0.a0(f0.b0.Closed, r32, 2, r32), new f0.n1());
        Boolean bool = Boolean.FALSE;
        e10 = d3.e(bool, null, 2, null);
        this.isPurchasing = e10;
        e11 = d3.e("", null, 2, null);
        this.price = e11;
        e12 = d3.e(bool, null, 2, null);
        this.hasGryphatrice = e12;
        e13 = d3.e(bool, null, 2, null);
        this.hasEquipped = e13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchaseWithGems(kotlin.coroutines.Continuation<? super dc.w> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.habitrpg.android.habitica.ui.activities.BirthdayActivity$purchaseWithGems$1
            if (r0 == 0) goto L13
            r0 = r10
            com.habitrpg.android.habitica.ui.activities.BirthdayActivity$purchaseWithGems$1 r0 = (com.habitrpg.android.habitica.ui.activities.BirthdayActivity$purchaseWithGems$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.ui.activities.BirthdayActivity$purchaseWithGems$1 r0 = new com.habitrpg.android.habitica.ui.activities.BirthdayActivity$purchaseWithGems$1
            r0.<init>(r9, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.result
            java.lang.Object r0 = ic.b.d()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r0 = r5.L$0
            com.habitrpg.android.habitica.ui.activities.BirthdayActivity r0 = (com.habitrpg.android.habitica.ui.activities.BirthdayActivity) r0
            dc.n.b(r10)
            goto L73
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            java.lang.Object r1 = r5.L$0
            com.habitrpg.android.habitica.ui.activities.BirthdayActivity r1 = (com.habitrpg.android.habitica.ui.activities.BirthdayActivity) r1
            dc.n.b(r10)
            r10 = r1
            goto L59
        L42:
            dc.n.b(r10)
            com.habitrpg.android.habitica.data.InventoryRepository r10 = r9.getInventoryRepository()
            r5.L$0 = r9
            r5.label = r3
            java.lang.String r1 = "pets"
            java.lang.String r4 = "Gryphatrice-Jubilant"
            java.lang.Object r10 = r10.purchaseItem(r1, r4, r3, r5)
            if (r10 != r0) goto L58
            return r0
        L58:
            r10 = r9
        L59:
            com.habitrpg.android.habitica.data.UserRepository r1 = r10.getUserRepository()
            r3 = 0
            r4 = 1
            r6 = 0
            r7 = 4
            r8 = 0
            r5.L$0 = r10
            r5.label = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            java.lang.Object r1 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r0) goto L72
            return r0
        L72:
            r0 = r10
        L73:
            j0.j1<java.lang.Boolean> r10 = r0.isPurchasing
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            r10.setValue(r0)
            dc.w r10 = dc.w.f13270a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.BirthdayActivity.purchaseWithGems(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("configManager");
        return null;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return null;
    }

    public final PurchaseHandler getPurchaseHandler() {
        PurchaseHandler purchaseHandler = this.purchaseHandler;
        if (purchaseHandler != null) {
            return purchaseHandler;
        }
        qc.q.z("purchaseHandler");
        return null;
    }

    public final f0.g1 getScaffoldState() {
        return this.scaffoldState;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.b.b(this, null, q0.c.c(-1468566599, true, new BirthdayActivity$onCreate$1(this, getConfigManager().getBirthdayEvent())), 1, null);
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new BirthdayActivity$onCreate$2(this, null), 1, null);
        getUserViewModel().getUser().j(this, new BirthdayActivityKt$sam$androidx_lifecycle_Observer$0(new BirthdayActivity$onCreate$3(this)));
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new BirthdayActivity$onCreate$4(this, null), 1, null);
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setPurchaseHandler(PurchaseHandler purchaseHandler) {
        qc.q.i(purchaseHandler, "<set-?>");
        this.purchaseHandler = purchaseHandler;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }
}
