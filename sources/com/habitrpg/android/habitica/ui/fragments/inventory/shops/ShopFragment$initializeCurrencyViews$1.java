package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.views.CurrencyTextKt;
import dc.w;
import j0.f;
import j0.i2;
import j0.j;
import j0.j1;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import j2.h;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import pc.q;
import qc.r;
import w.a;
import w.b0;
import w.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShopFragment.kt */
/* loaded from: classes4.dex */
public final class ShopFragment$initializeCurrencyViews$1 extends r implements p<l, Integer, w> {
    final /* synthetic */ ShopFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFragment$initializeCurrencyViews$1(ShopFragment shopFragment) {
        super(2);
        this.this$0 = shopFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        j1 j1Var;
        j1 j1Var2;
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1956546805, i10, -1, "com.habitrpg.android.habitica.ui.fragments.inventory.shops.ShopFragment.initializeCurrencyViews.<anonymous> (ShopFragment.kt:235)");
        }
        a.e m10 = w.a.f25135a.m(h.j(12));
        ShopFragment shopFragment = this.this$0;
        lVar.e(693286680);
        e.a aVar = e.f2335a;
        i0 a10 = y.a(m10, v0.b.f24258a.k(), lVar, 6);
        lVar.e(-1323940314);
        int a11 = j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar2 = g.f20790l;
        pc.a<g> a12 = aVar2.a();
        q<i2<g>, l, Integer, w> a13 = x.a(aVar);
        if (!(lVar.u() instanceof f)) {
            j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a12);
        } else {
            lVar.H();
        }
        l a14 = l3.a(lVar);
        l3.b(a14, a10, aVar2.e());
        l3.b(a14, F, aVar2.g());
        p<g, Integer, w> b10 = aVar2.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        b0 b0Var = b0.f25155a;
        j1Var = shopFragment.gems;
        Double d10 = (Double) j1Var.getValue();
        lVar.e(-1996549509);
        if (d10 != null) {
            CurrencyTextKt.m161CurrencyTextWlsLnLQ(NavigationDrawerFragment.SIDEBAR_GEMS, d10.doubleValue(), (e) null, 0L, 0, 0, false, lVar, 6, 124);
        }
        lVar.N();
        j1Var2 = shopFragment.gold;
        Double d11 = (Double) j1Var2.getValue();
        lVar.e(-1776605526);
        if (d11 != null) {
            CurrencyTextKt.m161CurrencyTextWlsLnLQ("gold", d11.doubleValue(), (e) null, 0L, 0, 0, false, lVar, 6, 124);
        }
        lVar.N();
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (n.K()) {
            n.U();
        }
    }
}
