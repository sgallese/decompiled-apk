package com.habitrpg.android.habitica.helpers;

import ad.k0;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.n;
import dc.w;
import ec.b0;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$displayConfirmationDialog$2", f = "PurchaseHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseHandler$displayConfirmationDialog$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $giftedTo;
    final /* synthetic */ Purchase $purchase;
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$displayConfirmationDialog$2(PurchaseHandler purchaseHandler, Purchase purchase, String str, Continuation<? super PurchaseHandler$displayConfirmationDialog$2> continuation) {
        super(2, continuation);
        this.this$0 = purchaseHandler;
        this.$purchase = purchase;
        this.$giftedTo = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseHandler$displayConfirmationDialog$2(this.this$0, this.$purchase, this.$giftedTo, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseHandler$displayConfirmationDialog$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        HabiticaBaseApplication habiticaBaseApplication;
        Object c02;
        Context context2;
        String str;
        Context context3;
        String gemAmountString;
        Context context4;
        Context context5;
        String gemAmountString2;
        Context context6;
        String durationString;
        Context context7;
        BaseActivity baseActivity;
        Context context8;
        Context context9;
        String durationString2;
        Context context10;
        ic.d.d();
        if (this.label == 0) {
            n.b(obj);
            context = this.this$0.context;
            if (context instanceof HabiticaBaseApplication) {
                habiticaBaseApplication = (HabiticaBaseApplication) context;
            } else {
                habiticaBaseApplication = null;
            }
            if (habiticaBaseApplication == null) {
                context10 = this.this$0.context;
                Context applicationContext = context10.getApplicationContext();
                if (applicationContext instanceof HabiticaBaseApplication) {
                    habiticaBaseApplication = (HabiticaBaseApplication) applicationContext;
                } else {
                    habiticaBaseApplication = null;
                }
                if (habiticaBaseApplication == null) {
                    return w.f13270a;
                }
            }
            List<String> c10 = this.$purchase.c();
            q.h(c10, "getProducts(...)");
            c02 = b0.c0(c10);
            String str2 = (String) c02;
            if (str2 != null) {
                context2 = this.this$0.context;
                String string = context2.getString(R.string.successful_purchase_generic);
                q.h(string, "getString(...)");
                PurchaseTypes purchaseTypes = PurchaseTypes.INSTANCE;
                if (purchaseTypes.getAllSubscriptionNoRenewTypes().contains(str2)) {
                    context8 = this.this$0.context;
                    string = context8.getString(R.string.gift_confirmation_title);
                    q.h(string, "getString(...)");
                    context9 = this.this$0.context;
                    durationString2 = this.this$0.durationString(str2);
                    str = context9.getString(R.string.gift_confirmation_text_sub, this.$giftedTo, durationString2);
                } else if (purchaseTypes.getAllSubscriptionTypes().contains(str2)) {
                    if (q.d(str2, PurchaseTypes.Subscription1Month)) {
                        context7 = this.this$0.context;
                        str = context7.getString(R.string.subscription_confirmation);
                    } else {
                        context6 = this.this$0.context;
                        durationString = this.this$0.durationString(str2);
                        str = context6.getString(R.string.subscription_confirmation_multiple, durationString);
                    }
                } else if (purchaseTypes.getAllGemTypes().contains(str2) && this.$giftedTo != null) {
                    context4 = this.this$0.context;
                    string = context4.getString(R.string.gift_confirmation_title);
                    q.h(string, "getString(...)");
                    context5 = this.this$0.context;
                    gemAmountString2 = this.this$0.gemAmountString(str2);
                    str = context5.getString(R.string.gift_confirmation_text_gems_new, this.$giftedTo, gemAmountString2);
                } else if (purchaseTypes.getAllGemTypes().contains(str2) && this.$giftedTo == null) {
                    context3 = this.this$0.context;
                    gemAmountString = this.this$0.gemAmountString(str2);
                    str = context3.getString(R.string.gem_purchase_confirmation, gemAmountString);
                } else {
                    str = null;
                }
                WeakReference<BaseActivity> currentActivity = habiticaBaseApplication.getCurrentActivity();
                if (currentActivity != null && (baseActivity = currentActivity.get()) != null) {
                    HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(baseActivity);
                    habiticaAlertDialog.setTitle(string);
                    if (str != null) {
                        habiticaAlertDialog.setMessage(str);
                    }
                    AlertDialogExtensionsKt.addOkButton$default(habiticaAlertDialog, false, new PurchaseHandler$displayConfirmationDialog$2$1$2(baseActivity), 1, null);
                    habiticaAlertDialog.enqueue();
                }
                return w.f13270a;
            }
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
