package com.habitrpg.android.habitica.ui.activities;

import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.views.CurrencyTextKt;
import j0.l3;
import p1.g;
import v0.b;
import w.a;

/* compiled from: BirthdayActivity.kt */
/* renamed from: com.habitrpg.android.habitica.ui.activities.ComposableSingletons$BirthdayActivityKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$BirthdayActivityKt$lambda1$1 extends qc.r implements pc.p<j0.l, Integer, dc.w> {
    public static final ComposableSingletons$BirthdayActivityKt$lambda1$1 INSTANCE = new ComposableSingletons$BirthdayActivityKt$lambda1$1();

    ComposableSingletons$BirthdayActivityKt$lambda1$1() {
        super(2);
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return dc.w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(903904461, i10, -1, "com.habitrpg.android.habitica.ui.activities.ComposableSingletons$BirthdayActivityKt.lambda-1.<anonymous> (BirthdayActivity.kt:423)");
        }
        b.c h10 = v0.b.f24258a.h();
        a.e m10 = w.a.f25135a.m(j2.h.j(4));
        lVar.e(693286680);
        e.a aVar = androidx.compose.ui.e.f2335a;
        n1.i0 a10 = w.y.a(m10, h10, lVar, 54);
        lVar.e(-1323940314);
        int a11 = j0.j.a(lVar, 0);
        j0.v F = lVar.F();
        g.a aVar2 = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar2.a();
        pc.q<j0.i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(aVar);
        if (!(lVar.u() instanceof j0.f)) {
            j0.j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a12);
        } else {
            lVar.H();
        }
        j0.l a14 = l3.a(lVar);
        l3.b(a14, a10, aVar2.e());
        l3.b(a14, F, aVar2.g());
        pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(j0.i2.a(j0.i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        w.b0 b0Var = w.b0.f25155a;
        f0.f2.b(s1.h.a(R.string.buy_for, lVar, 6), null, 0L, j2.t.g(18), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 3072, 0, 131062);
        CurrencyTextKt.m162CurrencyTextWlsLnLQ(NavigationDrawerFragment.SIDEBAR_GEMS, 60, (androidx.compose.ui.e) null, j2.t.g(18), 0, 0, false, lVar, 3126, 116);
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
