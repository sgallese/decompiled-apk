package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.ui.views.progress.HabiticaCircularProgressViewKt;
import dc.w;
import j0.i2;
import j0.l3;
import j0.v;
import n1.i0;
import n1.x;
import p1.g;

/* compiled from: PartySeekingFragment.kt */
/* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartySeekingFragmentKt$lambda-6$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$PartySeekingFragmentKt$lambda6$1 extends qc.r implements pc.q<x.d, j0.l, Integer, w> {
    public static final ComposableSingletons$PartySeekingFragmentKt$lambda6$1 INSTANCE = new ComposableSingletons$PartySeekingFragmentKt$lambda6$1();

    ComposableSingletons$PartySeekingFragmentKt$lambda6$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(x.d dVar, j0.l lVar, Integer num) {
        invoke(dVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(x.d dVar, j0.l lVar, int i10) {
        qc.q.i(dVar, "$this$item");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-1127061392, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartySeekingFragmentKt.lambda-6.<anonymous> (PartySeekingFragment.kt:307)");
        }
        androidx.compose.ui.e i11 = androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.m.h(androidx.compose.ui.e.f2335a, 0.0f, 1, null), j2.h.j(12));
        v0.b d10 = v0.b.f24258a.d();
        lVar.e(733328855);
        i0 h10 = androidx.compose.foundation.layout.d.h(d10, false, lVar, 6);
        lVar.e(-1323940314);
        int a10 = j0.j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar = p1.g.f20790l;
        pc.a<p1.g> a11 = aVar.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a12 = x.a(i11);
        if (!(lVar.u() instanceof j0.f)) {
            j0.j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a11);
        } else {
            lVar.H();
        }
        j0.l a13 = l3.a(lVar);
        l3.b(a13, h10, aVar.e());
        l3.b(a13, F, aVar.g());
        pc.p<p1.g, Integer, w> b10 = aVar.b();
        if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
            a13.J(Integer.valueOf(a10));
            a13.I(Integer.valueOf(a10), b10);
        }
        a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
        HabiticaCircularProgressViewKt.m171HabiticaCircularProgressViewQuyCDyQ(null, 0.0f, false, j2.h.j(32), 0, 0.0f, lVar, 3072, 55);
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
