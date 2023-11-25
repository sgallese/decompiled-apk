package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.ui.views.progress.HabiticaCircularProgressViewKt;
import dc.w;
import j0.i2;
import j0.l3;
import j0.v;
import n1.i0;
import n1.x;
import p1.g;
import v0.b;
import w.a;

/* compiled from: PartySeekingFragment.kt */
/* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartySeekingFragmentKt$lambda-5$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$PartySeekingFragmentKt$lambda5$1 extends qc.r implements pc.q<x.d, j0.l, Integer, w> {
    public static final ComposableSingletons$PartySeekingFragmentKt$lambda5$1 INSTANCE = new ComposableSingletons$PartySeekingFragmentKt$lambda5$1();

    ComposableSingletons$PartySeekingFragmentKt$lambda5$1() {
        super(3);
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(x.d dVar, j0.l lVar, Integer num) {
        invoke(dVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(x.d dVar, j0.l lVar, int i10) {
        qc.q.i(dVar, "$this$item");
        if ((i10 & 14) == 0) {
            i10 |= lVar.Q(dVar) ? 4 : 2;
        }
        if ((i10 & 91) == 18 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-2111128519, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartySeekingFragmentKt.lambda-5.<anonymous> (PartySeekingFragment.kt:287)");
        }
        androidx.compose.ui.e b10 = x.c.b(dVar, androidx.compose.ui.e.f2335a, 0.0f, 1, null);
        b.InterfaceC0571b f10 = v0.b.f24258a.f();
        a.e b11 = w.a.f25135a.b();
        lVar.e(-483455358);
        i0 a10 = w.h.a(b11, f10, lVar, 54);
        lVar.e(-1323940314);
        int a11 = j0.j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(b10);
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
        l3.b(a14, a10, aVar.e());
        l3.b(a14, F, aVar.g());
        pc.p<p1.g, Integer, w> b12 = aVar.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b12);
        }
        a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        w.k kVar = w.k.f25176a;
        HabiticaCircularProgressViewKt.m171HabiticaCircularProgressViewQuyCDyQ(null, 0.0f, false, 0.0f, 0, 0.0f, lVar, 0, 63);
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
