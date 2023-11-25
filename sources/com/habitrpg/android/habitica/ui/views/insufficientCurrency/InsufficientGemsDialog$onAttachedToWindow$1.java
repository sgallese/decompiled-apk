package com.habitrpg.android.habitica.ui.views.insufficientCurrency;

import ad.a1;
import ad.g;
import ad.i2;
import ad.k0;
import ad.l0;
import android.view.View;
import android.widget.Button;
import com.android.billingclient.api.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog$onAttachedToWindow$1;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* compiled from: InsufficientGemsDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog$onAttachedToWindow$1", f = "InsufficientGemsDialog.kt", l = {83, 85}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InsufficientGemsDialog$onAttachedToWindow$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $gemSku;
    final /* synthetic */ Button $purchaseButton;
    int label;
    final /* synthetic */ InsufficientGemsDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InsufficientGemsDialog.kt */
    @f(c = "com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog$onAttachedToWindow$1$1", f = "InsufficientGemsDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.views.insufficientCurrency.InsufficientGemsDialog$onAttachedToWindow$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Button $purchaseButton;
        final /* synthetic */ e $sku;
        int label;
        final /* synthetic */ InsufficientGemsDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Button button, e eVar, InsufficientGemsDialog insufficientGemsDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$purchaseButton = button;
            this.$sku = eVar;
            this.this$0 = insufficientGemsDialog;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InsufficientGemsDialog insufficientGemsDialog, View view) {
            FirebaseAnalytics.getInstance(insufficientGemsDialog.getContext()).a("purchased_gems_from_insufficient", androidx.core.os.e.a(new dc.l("gemPrice", Integer.valueOf(insufficientGemsDialog.getGemPrice())), new dc.l("sku", "")));
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new InsufficientGemsDialog$onAttachedToWindow$1$1$1$1(insufficientGemsDialog, null), 1, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$purchaseButton, this.$sku, this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            d.d();
            if (this.label == 0) {
                n.b(obj);
                Button button = this.$purchaseButton;
                if (button != null) {
                    e.a a10 = this.$sku.a();
                    if (a10 != null) {
                        str = a10.a();
                    } else {
                        str = null;
                    }
                    button.setText(str);
                }
                View findViewById = this.this$0.m167getContentView().findViewById(R.id.loading_indicator);
                q.h(findViewById, "findViewById(...)");
                findViewById.setVisibility(8);
                Button button2 = this.$purchaseButton;
                q.h(button2, "$purchaseButton");
                button2.setVisibility(0);
                Button button3 = this.$purchaseButton;
                if (button3 != null) {
                    final InsufficientGemsDialog insufficientGemsDialog = this.this$0;
                    button3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.insufficientCurrency.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InsufficientGemsDialog$onAttachedToWindow$1.AnonymousClass1.invokeSuspend$lambda$0(InsufficientGemsDialog.this, view);
                        }
                    });
                }
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientGemsDialog$onAttachedToWindow$1(InsufficientGemsDialog insufficientGemsDialog, String str, Button button, Continuation<? super InsufficientGemsDialog$onAttachedToWindow$1> continuation) {
        super(2, continuation);
        this.this$0 = insufficientGemsDialog;
        this.$gemSku = str;
        this.$purchaseButton = button;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new InsufficientGemsDialog$onAttachedToWindow$1(this.this$0, this.$gemSku, this.$purchaseButton, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((InsufficientGemsDialog$onAttachedToWindow$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    n.b(obj);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            PurchaseHandler purchaseHandler = this.this$0.getPurchaseHandler();
            String str = this.$gemSku;
            this.label = 1;
            obj = purchaseHandler.getInAppPurchaseSKU(str, this);
            if (obj == d10) {
                return d10;
            }
        }
        e eVar = (e) obj;
        if (eVar == null) {
            return w.f13270a;
        }
        i2 c10 = a1.c();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$purchaseButton, eVar, this.this$0, null);
        this.label = 2;
        if (g.g(c10, anonymousClass1, this) == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
