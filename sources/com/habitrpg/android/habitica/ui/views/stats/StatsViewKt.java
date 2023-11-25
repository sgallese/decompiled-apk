package com.habitrpg.android.habitica.ui.views.stats;

import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.R;
import dc.w;
import f0.f2;
import f0.s0;
import j0.f;
import j0.g2;
import j0.i2;
import j0.j;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import j2.t;
import n1.i0;
import n1.x;
import okhttp3.internal.http2.Http2;
import p1.g;
import pc.p;
import qc.q;
import r.i;
import v0.b;
import w.a;
import w.b0;
import w.h;
import w.k;
import w.y;
import w.z;

/* compiled from: StatsView.kt */
/* loaded from: classes4.dex */
public final class StatsViewKt {
    /* renamed from: StatsViewComposable-oC9nPe0  reason: not valid java name */
    public static final void m178StatsViewComposableoC9nPe0(String str, long j10, int i10, int i11, int i12, int i13, boolean z10, pc.a<w> aVar, l lVar, int i14) {
        int i15;
        l lVar2;
        q.i(str, "statText");
        q.i(aVar, "allocateAction");
        l q10 = lVar.q(1825790606);
        if ((i14 & 14) == 0) {
            i15 = (q10.Q(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= q10.j(j10) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            i15 |= q10.i(i10) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : 128;
        }
        if ((i14 & 7168) == 0) {
            i15 |= q10.i(i11) ? RecyclerView.m.FLAG_MOVED : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((57344 & i14) == 0) {
            i15 |= q10.i(i12) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i14) == 0) {
            i15 |= q10.i(i13) ? 131072 : 65536;
        }
        if ((3670016 & i14) == 0) {
            i15 |= q10.c(z10) ? 1048576 : 524288;
        }
        if ((29360128 & i14) == 0) {
            i15 |= q10.l(aVar) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if ((23967451 & i16) == 4793490 && q10.t()) {
            q10.z();
            lVar2 = q10;
        } else {
            if (n.K()) {
                n.V(1825790606, i16, -1, "com.habitrpg.android.habitica.ui.views.stats.StatsViewComposable (StatsView.kt:51)");
            }
            e.a aVar2 = e.f2335a;
            e a10 = x0.e.a(androidx.compose.foundation.c.d(aVar2, s1.c.a(R.color.window_background, q10, 6), null, 2, null), s0.f15068a.b(q10, s0.f15069b).a());
            q10.e(-483455358);
            w.a aVar3 = w.a.f25135a;
            a.l f10 = aVar3.f();
            b.a aVar4 = v0.b.f24258a;
            i0 a11 = h.a(f10, aVar4.j(), q10, 0);
            q10.e(-1323940314);
            int a12 = j.a(q10, 0);
            v F = q10.F();
            g.a aVar5 = g.f20790l;
            pc.a<g> a13 = aVar5.a();
            pc.q<i2<g>, l, Integer, w> a14 = x.a(a10);
            if (!(q10.u() instanceof f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a13);
            } else {
                q10.H();
            }
            l a15 = l3.a(q10);
            l3.b(a15, a11, aVar5.e());
            l3.b(a15, F, aVar5.g());
            p<g, Integer, w> b10 = aVar5.b();
            if (a15.n() || !q.d(a15.f(), Integer.valueOf(a12))) {
                a15.J(Integer.valueOf(a12));
                a15.I(Integer.valueOf(a12), b10);
            }
            a14.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            k kVar = k.f25176a;
            e k10 = androidx.compose.foundation.layout.j.k(androidx.compose.foundation.c.d(m.h(m.i(aVar2, j2.h.j(43)), 0.0f, 1, null), j10, null, 2, null), j2.h.j(12), 0.0f, 2, null);
            a.e c10 = aVar3.c();
            b.c h10 = aVar4.h();
            q10.e(693286680);
            i0 a16 = y.a(c10, h10, q10, 54);
            q10.e(-1323940314);
            int a17 = j.a(q10, 0);
            v F2 = q10.F();
            pc.a<g> a18 = aVar5.a();
            pc.q<i2<g>, l, Integer, w> a19 = x.a(k10);
            if (!(q10.u() instanceof f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a18);
            } else {
                q10.H();
            }
            l a20 = l3.a(q10);
            l3.b(a20, a16, aVar5.e());
            l3.b(a20, F2, aVar5.g());
            p<g, Integer, w> b11 = aVar5.b();
            if (a20.n() || !q.d(a20.f(), Integer.valueOf(a17))) {
                a20.J(Integer.valueOf(a17));
                a20.I(Integer.valueOf(a17), b11);
            }
            a19.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            b0 b0Var = b0.f25155a;
            f2.b(str, null, s1.c.a(R.color.white, q10, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, i16 & 14, 0, 131066);
            f2.b(String.valueOf(i10 + i11 + i12 + i13), null, s1.c.a(R.color.white, q10, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 0, 0, 131066);
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            e i17 = m.i(aVar2, j2.h.j(61));
            a.e d10 = aVar3.d();
            b.c h11 = aVar4.h();
            q10.e(693286680);
            i0 a21 = y.a(d10, h11, q10, 54);
            q10.e(-1323940314);
            int a22 = j.a(q10, 0);
            v F3 = q10.F();
            pc.a<g> a23 = aVar5.a();
            pc.q<i2<g>, l, Integer, w> a24 = x.a(i17);
            if (!(q10.u() instanceof f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a23);
            } else {
                q10.H();
            }
            l a25 = l3.a(q10);
            l3.b(a25, a21, aVar5.e());
            l3.b(a25, F3, aVar5.g());
            p<g, Integer, w> b12 = aVar5.b();
            if (a25.n() || !q.d(a25.f(), Integer.valueOf(a22))) {
                a25.J(Integer.valueOf(a22));
                a25.I(Integer.valueOf(a22), b12);
            }
            a24.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            e a26 = z.a(b0Var, aVar2, 1.0f, false, 2, null);
            a.e b13 = aVar3.b();
            b.InterfaceC0571b f11 = aVar4.f();
            q10.e(-483455358);
            i0 a27 = h.a(b13, f11, q10, 54);
            q10.e(-1323940314);
            int a28 = j.a(q10, 0);
            v F4 = q10.F();
            pc.a<g> a29 = aVar5.a();
            pc.q<i2<g>, l, Integer, w> a30 = x.a(a26);
            if (!(q10.u() instanceof f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a29);
            } else {
                q10.H();
            }
            l a31 = l3.a(q10);
            l3.b(a31, a27, aVar5.e());
            l3.b(a31, F4, aVar5.g());
            p<g, Integer, w> b14 = aVar5.b();
            if (a31.n() || !q.d(a31.f(), Integer.valueOf(a28))) {
                a31.J(Integer.valueOf(a28));
                a31.I(Integer.valueOf(a28), b14);
            }
            a30.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            f2.b(String.valueOf(i10), null, 0L, t.g(20), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3072, 0, 131062);
            f2.b(s1.h.a(R.string.level, q10, 6), null, s1.c.a(R.color.text_quad, q10, 6), t.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3072, 0, 131058);
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            e a32 = z.a(b0Var, aVar2, 1.0f, false, 2, null);
            a.e b15 = aVar3.b();
            b.InterfaceC0571b f12 = aVar4.f();
            q10.e(-483455358);
            i0 a33 = h.a(b15, f12, q10, 54);
            q10.e(-1323940314);
            int a34 = j.a(q10, 0);
            v F5 = q10.F();
            pc.a<g> a35 = aVar5.a();
            pc.q<i2<g>, l, Integer, w> a36 = x.a(a32);
            if (!(q10.u() instanceof f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a35);
            } else {
                q10.H();
            }
            l a37 = l3.a(q10);
            l3.b(a37, a33, aVar5.e());
            l3.b(a37, F5, aVar5.g());
            p<g, Integer, w> b16 = aVar5.b();
            if (a37.n() || !q.d(a37.f(), Integer.valueOf(a34))) {
                a37.J(Integer.valueOf(a34));
                a37.I(Integer.valueOf(a34), b16);
            }
            a36.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            f2.b(String.valueOf(i11), null, 0L, t.g(20), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3072, 0, 131062);
            f2.b(s1.h.a(R.string.sidebar_equipment, q10, 6), null, s1.c.a(R.color.text_quad, q10, 6), t.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3072, 0, 131058);
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            e a38 = z.a(b0Var, aVar2, 1.0f, false, 2, null);
            a.e b17 = aVar3.b();
            b.InterfaceC0571b f13 = aVar4.f();
            q10.e(-483455358);
            i0 a39 = h.a(b17, f13, q10, 54);
            q10.e(-1323940314);
            int a40 = j.a(q10, 0);
            v F6 = q10.F();
            pc.a<g> a41 = aVar5.a();
            pc.q<i2<g>, l, Integer, w> a42 = x.a(a38);
            if (!(q10.u() instanceof f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a41);
            } else {
                q10.H();
            }
            l a43 = l3.a(q10);
            l3.b(a43, a39, aVar5.e());
            l3.b(a43, F6, aVar5.g());
            p<g, Integer, w> b18 = aVar5.b();
            if (a43.n() || !q.d(a43.f(), Integer.valueOf(a40))) {
                a43.J(Integer.valueOf(a40));
                a43.I(Integer.valueOf(a40), b18);
            }
            a42.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            f2.b(String.valueOf(i12), null, 0L, t.g(20), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3072, 0, 131062);
            f2.b(s1.h.a(R.string.buffs, q10, 6), null, s1.c.a(R.color.text_quad, q10, 6), t.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3072, 0, 131058);
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            e d11 = androidx.compose.foundation.c.d(m.d(z.a(b0Var, aVar2, 1.0f, false, 2, null), 0.0f, 1, null), s1.c.a(z10 ? R.color.offset_background_30 : R.color.window_background, q10, 0), null, 2, null);
            a.e b19 = aVar3.b();
            b.InterfaceC0571b f14 = aVar4.f();
            q10.e(-483455358);
            i0 a44 = h.a(b19, f14, q10, 54);
            q10.e(-1323940314);
            int a45 = j.a(q10, 0);
            v F7 = q10.F();
            pc.a<g> a46 = aVar5.a();
            pc.q<i2<g>, l, Integer, w> a47 = x.a(d11);
            if (!(q10.u() instanceof f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a46);
            } else {
                q10.H();
            }
            l a48 = l3.a(q10);
            l3.b(a48, a44, aVar5.e());
            l3.b(a48, F7, aVar5.g());
            p<g, Integer, w> b20 = aVar5.b();
            if (a48.n() || !q.d(a48.f(), Integer.valueOf(a45))) {
                a48.J(Integer.valueOf(a45));
                a48.I(Integer.valueOf(a45), b20);
            }
            a47.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            String valueOf = String.valueOf(i13);
            long g10 = t.g(20);
            q10.e(-1397376937);
            long a49 = z10 ? j10 : s1.c.a(R.color.text_primary, q10, 6);
            q10.N();
            f2.b(valueOf, null, a49, g10, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3072, 0, 131058);
            String a50 = s1.h.a(R.string.allocated, q10, 6);
            q10.e(-1397376796);
            long a51 = z10 ? j10 : s1.c.a(R.color.text_quad, q10, 6);
            q10.N();
            f2.b(a50, null, a51, t.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 3072, 0, 131058);
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            lVar2 = q10;
            i.d(b0Var, z10, null, null, null, null, q0.c.b(q10, 987756357, true, new StatsViewKt$StatsViewComposable$1$2$5(aVar, i16)), lVar2, 1572870 | ((i16 >> 15) & 112), 30);
            lVar2.N();
            lVar2.O();
            lVar2.N();
            lVar2.N();
            lVar2.N();
            lVar2.O();
            lVar2.N();
            lVar2.N();
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = lVar2.w();
        if (w10 == null) {
            return;
        }
        w10.a(new StatsViewKt$StatsViewComposable$2(str, j10, i10, i11, i12, i13, z10, aVar, i14));
    }

    public static final void StatsViewPreview(l lVar, int i10) {
        l q10 = lVar.q(766371939);
        if (i10 == 0 && q10.t()) {
            q10.z();
        } else {
            if (n.K()) {
                n.V(766371939, i10, -1, "com.habitrpg.android.habitica.ui.views.stats.StatsViewPreview (StatsView.kt:116)");
            }
            e d10 = androidx.compose.foundation.c.d(e.f2335a, s1.c.a(R.color.content_background, q10, 6), null, 2, null);
            q10.e(-483455358);
            i0 a10 = h.a(w.a.f25135a.f(), v0.b.f24258a.j(), q10, 0);
            q10.e(-1323940314);
            int a11 = j.a(q10, 0);
            v F = q10.F();
            g.a aVar = g.f20790l;
            pc.a<g> a12 = aVar.a();
            pc.q<i2<g>, l, Integer, w> a13 = x.a(d10);
            if (!(q10.u() instanceof f)) {
                j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a12);
            } else {
                q10.H();
            }
            l a14 = l3.a(q10);
            l3.b(a14, a10, aVar.e());
            l3.b(a14, F, aVar.g());
            p<g, Integer, w> b10 = aVar.b();
            if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
                a14.J(Integer.valueOf(a11));
                a14.I(Integer.valueOf(a11), b10);
            }
            a13.invoke(i2.a(i2.b(q10)), q10, 0);
            q10.e(2058660585);
            k kVar = k.f25176a;
            m178StatsViewComposableoC9nPe0("Strength", s1.c.a(R.color.red_50, q10, 6), 10, 5, 4, 8, false, StatsViewKt$StatsViewPreview$1$1.INSTANCE, q10, 14380422);
            m178StatsViewComposableoC9nPe0("Intelligence", s1.c.a(R.color.blue_50, q10, 6), 10, 5, 4, 20, true, StatsViewKt$StatsViewPreview$1$2.INSTANCE, q10, 14380422);
            q10.N();
            q10.O();
            q10.N();
            q10.N();
            if (n.K()) {
                n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new StatsViewKt$StatsViewPreview$2(i10));
        }
    }
}
