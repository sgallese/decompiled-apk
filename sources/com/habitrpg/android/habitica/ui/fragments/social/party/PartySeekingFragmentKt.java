package com.habitrpg.android.habitica.ui.fragments.social.party;

import ad.k0;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.ui.views.progress.HabiticaPullRefreshIndicatorKt;
import dc.w;
import j0.g2;
import j0.h0;
import j0.i2;
import j0.j1;
import j0.l3;
import j0.v;
import j0.x;
import n1.i0;
import p1.g;
import v0.b;

/* compiled from: PartySeekingFragment.kt */
/* loaded from: classes4.dex */
public final class PartySeekingFragmentKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InviteButton(com.habitrpg.android.habitica.ui.views.LoadingButtonState r17, pc.a<dc.w> r18, androidx.compose.ui.e r19, boolean r20, j0.l r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingFragmentKt.InviteButton(com.habitrpg.android.habitica.ui.views.LoadingButtonState, pc.a, androidx.compose.ui.e, boolean, j0.l, int, int):void");
    }

    public static final void PartySeekingView(PartySeekingViewModel partySeekingViewModel, androidx.compose.ui.e eVar, j0.l lVar, int i10, int i11) {
        e.a aVar;
        boolean z10;
        qc.q.i(partySeekingViewModel, "viewModel");
        j0.l q10 = lVar.q(-500538498);
        if ((i11 & 2) != 0) {
            aVar = androidx.compose.ui.e.f2335a;
        } else {
            aVar = eVar;
        }
        if (j0.n.K()) {
            j0.n.V(-500538498, i10, -1, "com.habitrpg.android.habitica.ui.fragments.social.party.PartySeekingView (PartySeekingFragment.kt:198)");
        }
        n3.a b10 = n3.b.b(partySeekingViewModel.getSeekingUsers(), null, q10, 8, 1);
        j1<Boolean> isRefreshing = partySeekingViewModel.isRefreshing();
        g0.e a10 = g0.f.a(PartySeekingView$lambda$0(isRefreshing), new PartySeekingFragmentKt$PartySeekingView$pullRefreshState$1(b10), 0.0f, 0.0f, q10, 0, 12);
        q10.e(773894976);
        q10.e(-492369756);
        Object f10 = q10.f();
        if (f10 == j0.l.f18688a.a()) {
            x xVar = new x(h0.h(hc.g.f16601f, q10));
            q10.J(xVar);
            f10 = xVar;
        }
        q10.N();
        k0 a11 = ((x) f10).a();
        q10.N();
        androidx.compose.ui.e d10 = g0.c.d(androidx.compose.foundation.layout.m.f(aVar, 0.0f, 1, null), a10, false, 2, null);
        q10.e(733328855);
        b.a aVar2 = v0.b.f24258a;
        i0 h10 = androidx.compose.foundation.layout.d.h(aVar2.n(), false, q10, 0);
        q10.e(-1323940314);
        int a12 = j0.j.a(q10, 0);
        v F = q10.F();
        g.a aVar3 = p1.g.f20790l;
        pc.a<p1.g> a13 = aVar3.a();
        pc.q<i2<p1.g>, j0.l, Integer, w> a14 = n1.x.a(d10);
        if (!(q10.u() instanceof j0.f)) {
            j0.j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a13);
        } else {
            q10.H();
        }
        j0.l a15 = l3.a(q10);
        l3.b(a15, h10, aVar3.e());
        l3.b(a15, F, aVar3.g());
        pc.p<p1.g, Integer, w> b11 = aVar3.b();
        if (a15.n() || !qc.q.d(a15.f(), Integer.valueOf(a12))) {
            a15.J(Integer.valueOf(a12));
            a15.I(Integer.valueOf(a12), b11);
        }
        a14.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2083a;
        androidx.compose.ui.e eVar3 = aVar;
        x.b.a(null, null, null, false, null, null, null, false, new PartySeekingFragmentKt$PartySeekingView$1$1(b10, partySeekingViewModel, a11), q10, 0, 255);
        if (b10.g() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        HabiticaPullRefreshIndicatorKt.m172HabiticaPullRefreshIndicatorFHprtrg(z10, PartySeekingView$lambda$0(isRefreshing), a10, eVar2.b(androidx.compose.ui.e.f2335a, aVar2.l()), 0L, false, q10, g0.e.f15984j << 6, 48);
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new PartySeekingFragmentKt$PartySeekingView$2(partySeekingViewModel, eVar3, i10, i11));
        }
    }

    private static final boolean PartySeekingView$lambda$0(j1<Boolean> j1Var) {
        return j1Var.getValue().booleanValue();
    }
}
