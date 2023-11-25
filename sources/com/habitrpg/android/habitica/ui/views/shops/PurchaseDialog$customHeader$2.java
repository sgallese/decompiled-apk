package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.widget.LinearLayout;
import com.habitrpg.android.habitica.databinding.DialogPurchaseShopitemHeaderBinding;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import qc.r;

/* compiled from: PurchaseDialog.kt */
/* loaded from: classes4.dex */
final class PurchaseDialog$customHeader$2 extends r implements pc.a<LinearLayout> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$customHeader$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // pc.a
    public final LinearLayout invoke() {
        return DialogPurchaseShopitemHeaderBinding.inflate(ContextExtensionsKt.getLayoutInflater(this.$context)).getRoot();
    }
}
