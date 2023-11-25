package com.habitrpg.android.habitica.ui.views.progress;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import dc.w;
import j0.f;
import j0.i2;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import n1.i0;
import n1.x;
import p1.g;
import pc.a;
import pc.p;
import pc.q;
import qc.r;
import r.j;
import v0.b;

/* compiled from: HabiticaPullRefreshIndicator.kt */
/* renamed from: com.habitrpg.android.habitica.ui.views.progress.ComposableSingletons$HabiticaPullRefreshIndicatorKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$HabiticaPullRefreshIndicatorKt$lambda1$1 extends r implements q<j, l, Integer, w> {
    public static final ComposableSingletons$HabiticaPullRefreshIndicatorKt$lambda1$1 INSTANCE = new ComposableSingletons$HabiticaPullRefreshIndicatorKt$lambda1$1();

    ComposableSingletons$HabiticaPullRefreshIndicatorKt$lambda1$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(j jVar, l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j jVar, l lVar, int i10) {
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(1687242114, i10, -1, "com.habitrpg.android.habitica.ui.views.progress.ComposableSingletons$HabiticaPullRefreshIndicatorKt.lambda-1.<anonymous> (HabiticaPullRefreshIndicator.kt:43)");
        }
        b d10 = b.f24258a.d();
        e.a aVar = e.f2335a;
        e f10 = m.f(aVar, 0.0f, 1, null);
        lVar.e(733328855);
        i0 h10 = d.h(d10, false, lVar, 6);
        lVar.e(-1323940314);
        int a10 = j0.j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar2 = g.f20790l;
        a<g> a11 = aVar2.a();
        q<i2<g>, l, Integer, w> a12 = x.a(f10);
        if (!(lVar.u() instanceof f)) {
            j0.j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a11);
        } else {
            lVar.H();
        }
        l a13 = l3.a(lVar);
        l3.b(a13, h10, aVar2.e());
        l3.b(a13, F, aVar2.g());
        p<g, Integer, w> b10 = aVar2.b();
        if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
            a13.J(Integer.valueOf(a10));
            a13.I(Integer.valueOf(a10), b10);
        }
        a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
        HabiticaCircularProgressViewKt.m171HabiticaCircularProgressViewQuyCDyQ(aVar, 0.0f, false, 0.0f, 0, 0.0f, lVar, 6, 62);
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (n.K()) {
            n.U();
        }
    }
}
