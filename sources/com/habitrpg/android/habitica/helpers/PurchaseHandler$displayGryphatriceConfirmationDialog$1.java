package com.habitrpg.android.habitica.helpers;

import ad.k0;
import android.content.Context;
import com.habitrpg.android.habitica.HabiticaBaseApplication;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.ui.activities.BaseActivity;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.n;
import dc.w;
import java.lang.ref.WeakReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$displayGryphatriceConfirmationDialog$1", f = "PurchaseHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseHandler$displayGryphatriceConfirmationDialog$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $giftedTo;
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$displayGryphatriceConfirmationDialog$1(PurchaseHandler purchaseHandler, String str, Continuation<? super PurchaseHandler$displayGryphatriceConfirmationDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = purchaseHandler;
        this.$giftedTo = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseHandler$displayGryphatriceConfirmationDialog$1(this.this$0, this.$giftedTo, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseHandler$displayGryphatriceConfirmationDialog$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        HabiticaBaseApplication habiticaBaseApplication;
        Context context2;
        Context context3;
        String string;
        BaseActivity baseActivity;
        Context context4;
        Context context5;
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
                context5 = this.this$0.context;
                Context applicationContext = context5.getApplicationContext();
                if (applicationContext instanceof HabiticaBaseApplication) {
                    habiticaBaseApplication = (HabiticaBaseApplication) applicationContext;
                } else {
                    habiticaBaseApplication = null;
                }
                if (habiticaBaseApplication == null) {
                    return w.f13270a;
                }
            }
            context2 = this.this$0.context;
            String string2 = context2.getString(R.string.successful_purchase_generic);
            q.h(string2, "getString(...)");
            if (this.$giftedTo != null) {
                context4 = this.this$0.context;
                string = context4.getString(R.string.jubilant_gryphatrice_confirmation_gift);
            } else {
                context3 = this.this$0.context;
                string = context3.getString(R.string.jubilant_gryphatrice_confirmation);
            }
            q.f(string);
            WeakReference<BaseActivity> currentActivity = habiticaBaseApplication.getCurrentActivity();
            if (currentActivity != null && (baseActivity = currentActivity.get()) != null) {
                HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(baseActivity);
                habiticaAlertDialog.setTitle(string2);
                habiticaAlertDialog.setMessage(string);
                AlertDialogExtensionsKt.addOkButton$default(habiticaAlertDialog, false, new PurchaseHandler$displayGryphatriceConfirmationDialog$1$1$1(baseActivity), 1, null);
                habiticaAlertDialog.enqueue();
            }
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
