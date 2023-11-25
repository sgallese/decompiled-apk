package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.ui.views.CurrencyTextKt;
import dc.w;
import j0.l;
import j0.n;
import pc.p;
import qc.r;

/* compiled from: TimeTravelersShopFragment.kt */
/* loaded from: classes4.dex */
final class TimeTravelersShopFragment$initializeCurrencyViews$1 extends r implements p<l, Integer, w> {
    final /* synthetic */ TimeTravelersShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeTravelersShopFragment$initializeCurrencyViews$1(TimeTravelersShopFragment timeTravelersShopFragment) {
        super(2);
        this.this$0 = timeTravelersShopFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1922497775, i10, -1, "com.habitrpg.android.habitica.ui.fragments.inventory.shops.TimeTravelersShopFragment.initializeCurrencyViews.<anonymous> (TimeTravelersShopFragment.kt:28)");
        }
        Double value = this.this$0.getHourglasses$Habitica_2311256681_prodRelease().getValue();
        if (value != null) {
            CurrencyTextKt.m161CurrencyTextWlsLnLQ("hourglasses", value.doubleValue(), (e) null, 0L, 0, 0, false, lVar, 6, 124);
        }
        if (n.K()) {
            n.U();
        }
    }
}
