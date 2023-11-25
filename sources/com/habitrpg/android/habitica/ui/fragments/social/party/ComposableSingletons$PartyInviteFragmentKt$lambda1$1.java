package com.habitrpg.android.habitica.ui.fragments.social.party;

import a2.c0;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.f2;
import j0.i2;
import j0.l3;
import j0.v;
import n1.i0;
import n1.x;
import p1.g;
import v0.b;
import v1.k0;

/* compiled from: PartyInviteFragment.kt */
/* renamed from: com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartyInviteFragmentKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$PartyInviteFragmentKt$lambda1$1 extends qc.r implements pc.q<x.d, j0.l, Integer, w> {
    public static final ComposableSingletons$PartyInviteFragmentKt$lambda1$1 INSTANCE = new ComposableSingletons$PartyInviteFragmentKt$lambda1$1();

    ComposableSingletons$PartyInviteFragmentKt$lambda1$1() {
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
            j0.n.V(912099682, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.ComposableSingletons$PartyInviteFragmentKt.lambda-1.<anonymous> (PartyInviteFragment.kt:158)");
        }
        b.InterfaceC0571b f10 = v0.b.f24258a.f();
        e.a aVar = androidx.compose.ui.e.f2335a;
        androidx.compose.ui.e m10 = androidx.compose.foundation.layout.j.m(androidx.compose.foundation.layout.m.h(aVar, 0.0f, 1, null), 0.0f, j2.h.j(22), 0.0f, j2.h.j(14), 5, null);
        lVar.e(-483455358);
        i0 a10 = w.h.a(w.a.f25135a.f(), f10, lVar, 48);
        lVar.e(-1323940314);
        int a11 = j0.j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar2 = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar2.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(m10);
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
        pc.p<p1.g, Integer, w> b10 = aVar2.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        w.k kVar = w.k.f25176a;
        String a15 = s1.h.a(R.string.invite_with_username_email, lVar, 6);
        HabiticaTheme habiticaTheme = HabiticaTheme.INSTANCE;
        int i11 = HabiticaTheme.$stable;
        long m134getTextPrimary0d7_KjU = habiticaTheme.getColors(lVar, i11).m134getTextPrimary0d7_KjU();
        long g10 = j2.t.g(16);
        c0.a aVar3 = c0.f239m;
        f2.b(a15, androidx.compose.foundation.layout.j.m(aVar, 0.0f, 0.0f, 0.0f, j2.h.j(4), 7, null), m134getTextPrimary0d7_KjU, g10, null, aVar3.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 199728, 0, 131024);
        f2.b(s1.h.a(R.string.habiticans_send_invite, lVar, 6), null, habiticaTheme.getColors(lVar, i11).m136getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new k0(0L, j2.t.g(16), aVar3.e(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, 16777209, null), lVar, 0, 1572864, 65530);
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
