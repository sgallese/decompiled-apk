package com.habitrpg.android.habitica.ui.views.shops;

import ad.k0;
import ad.u0;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.DateExtensionsKt;
import com.habitrpg.android.habitica.models.inventory.ItemEvent;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import dc.n;
import dc.w;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import zc.c;
import zc.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$setLimitedTextView$1", f = "PurchaseDialog.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseDialog$setLimitedTextView$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$setLimitedTextView$1(PurchaseDialog purchaseDialog, Continuation<? super PurchaseDialog$setLimitedTextView$1> continuation) {
        super(2, continuation);
        this.this$0 = purchaseDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseDialog$setLimitedTextView$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseDialog$setLimitedTextView$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        TextView textView;
        ShopItem shopItem;
        boolean z10;
        ShopItem shopItem2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        Date end;
        TextView textView5;
        ShopItem shopItem3;
        String str;
        ShopItem shopItem4;
        long j10;
        d dVar;
        long o10;
        Date end2;
        Date end3;
        Date end4;
        d10 = ic.d.d();
        int i10 = this.label;
        boolean z11 = false;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            textView = this.this$0.limitedTextView;
            textView.setVisibility(0);
        }
        do {
            shopItem = this.this$0.shopItem;
            ItemEvent event = shopItem.getEvent();
            if (event != null && (end4 = event.getEnd()) != null && end4.after(new Date())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                textView5 = this.this$0.limitedTextView;
                Context context = this.this$0.getContext();
                Object[] objArr = new Object[1];
                shopItem3 = this.this$0.shopItem;
                ItemEvent event2 = shopItem3.getEvent();
                if (event2 != null && (end3 = event2.getEnd()) != null) {
                    str = DateExtensionsKt.getShortRemainingString(end3);
                } else {
                    str = null;
                }
                objArr[0] = str;
                textView5.setText(context.getString(R.string.available_for, objArr));
                shopItem4 = this.this$0.shopItem;
                ItemEvent event3 = shopItem4.getEvent();
                if (event3 != null && (end2 = event3.getEnd()) != null) {
                    j10 = end2.getTime();
                } else {
                    j10 = 0;
                }
                if (j10 - new Date().getTime() < 3600000) {
                    dVar = d.SECONDS;
                } else {
                    dVar = d.MINUTES;
                }
                o10 = c.o(1, dVar);
                this.label = 1;
            } else {
                shopItem2 = this.this$0.shopItem;
                ItemEvent event4 = shopItem2.getEvent();
                if (event4 != null && (end = event4.getEnd()) != null && end.before(new Date())) {
                    z11 = true;
                }
                if (z11) {
                    textView2 = this.this$0.limitedTextView;
                    textView2.setText(this.this$0.getContext().getString(R.string.no_longer_available));
                    textView3 = this.this$0.limitedTextView;
                    textView3.setBackground(new ColorDrawable(androidx.core.content.a.c(this.this$0.getContext(), R.color.offset_background)));
                    textView4 = this.this$0.limitedTextView;
                    textView4.setTextColor(androidx.core.content.a.c(this.this$0.getContext(), R.color.text_secondary));
                }
                return w.f13270a;
            }
        } while (u0.b(o10, this) != d10);
        return d10;
    }
}
