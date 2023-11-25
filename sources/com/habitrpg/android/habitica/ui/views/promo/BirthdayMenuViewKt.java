package com.habitrpg.android.habitica.ui.views.promo;

import a2.c0;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.extensions.DateExtensionsKt;
import com.habitrpg.android.habitica.ui.views.PixelArtViewKt;
import dc.w;
import f0.f2;
import j0.d3;
import j0.f;
import j0.g2;
import j0.h0;
import j0.i2;
import j0.j;
import j0.j1;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import j2.t;
import java.util.Date;
import java.util.Locale;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import qc.q;
import t.u;
import v0.b;
import w.a;
import w.b0;
import w.d0;
import w.h;
import w.k;
import w.y;
import w.z;

/* compiled from: BirthdayMenuView.kt */
/* loaded from: classes4.dex */
public final class BirthdayMenuViewKt {
    public static final void BirthdayBanner(Date date, e eVar, l lVar, int i10, int i11) {
        q.i(date, "endDate");
        l q10 = lVar.q(1834333160);
        e.a aVar = (i11 & 2) != 0 ? e.f2335a : eVar;
        if (n.K()) {
            n.V(1834333160, i10, -1, "com.habitrpg.android.habitica.ui.views.promo.BirthdayBanner (BirthdayMenuView.kt:46)");
        }
        e e10 = androidx.compose.foundation.e.e(m.h(aVar, 0.0f, 1, null), false, null, null, BirthdayMenuViewKt$BirthdayBanner$1.INSTANCE, 7, null);
        q10.e(-483455358);
        w.a aVar2 = w.a.f25135a;
        a.l f10 = aVar2.f();
        b.a aVar3 = b.f24258a;
        i0 a10 = h.a(f10, aVar3.j(), q10, 0);
        q10.e(-1323940314);
        int a11 = j.a(q10, 0);
        v F = q10.F();
        g.a aVar4 = g.f20790l;
        pc.a<g> a12 = aVar4.a();
        pc.q<i2<g>, l, Integer, w> a13 = x.a(e10);
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
        l3.b(a14, a10, aVar4.e());
        l3.b(a14, F, aVar4.g());
        p<g, Integer, w> b10 = aVar4.b();
        if (a14.n() || !q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        k kVar = k.f25176a;
        e.a aVar5 = e.f2335a;
        e h10 = m.h(aVar5, 0.0f, 1, null);
        q10.e(-483455358);
        i0 a15 = h.a(aVar2.f(), aVar3.j(), q10, 0);
        q10.e(-1323940314);
        int a16 = j.a(q10, 0);
        v F2 = q10.F();
        pc.a<g> a17 = aVar4.a();
        pc.q<i2<g>, l, Integer, w> a18 = x.a(h10);
        if (!(q10.u() instanceof f)) {
            j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a17);
        } else {
            q10.H();
        }
        l a19 = l3.a(q10);
        l3.b(a19, a15, aVar4.e());
        l3.b(a19, F2, aVar4.g());
        p<g, Integer, w> b11 = aVar4.b();
        if (a19.n() || !q.d(a19.f(), Integer.valueOf(a16))) {
            a19.J(Integer.valueOf(a16));
            a19.I(Integer.valueOf(a16), b11);
        }
        a18.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        b g10 = aVar3.g();
        e d10 = c.d(m.h(m.i(aVar5, j2.h.j(67)), 0.0f, 1, null), s1.c.a(R.color.brand_100, q10, 6), null, 2, null);
        q10.e(733328855);
        i0 h11 = d.h(g10, false, q10, 6);
        q10.e(-1323940314);
        int a20 = j.a(q10, 0);
        v F3 = q10.F();
        pc.a<g> a21 = aVar4.a();
        pc.q<i2<g>, l, Integer, w> a22 = x.a(d10);
        if (!(q10.u() instanceof f)) {
            j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a21);
        } else {
            q10.H();
        }
        l a23 = l3.a(q10);
        l3.b(a23, h11, aVar4.e());
        l3.b(a23, F3, aVar4.g());
        p<g, Integer, w> b12 = aVar4.b();
        if (a23.n() || !q.d(a23.f(), Integer.valueOf(a20))) {
            a23.J(Integer.valueOf(a20));
            a23.I(Integer.valueOf(a20), b12);
        }
        a22.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        e b13 = androidx.compose.foundation.layout.e.f2083a.b(aVar5, aVar3.e());
        q10.e(693286680);
        i0 a24 = y.a(aVar2.e(), aVar3.k(), q10, 0);
        q10.e(-1323940314);
        int a25 = j.a(q10, 0);
        v F4 = q10.F();
        pc.a<g> a26 = aVar4.a();
        pc.q<i2<g>, l, Integer, w> a27 = x.a(b13);
        if (!(q10.u() instanceof f)) {
            j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a26);
        } else {
            q10.H();
        }
        l a28 = l3.a(q10);
        l3.b(a28, a24, aVar4.e());
        l3.b(a28, F4, aVar4.g());
        p<g, Integer, w> b14 = aVar4.b();
        if (a28.n() || !q.d(a28.f(), Integer.valueOf(a25))) {
            a28.J(Integer.valueOf(a25));
            a28.I(Integer.valueOf(a25), b14);
        }
        a27.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        b0 b0Var = b0.f25155a;
        u.a(s1.f.d(R.drawable.birthday_menu_gems, q10, 6), null, androidx.compose.foundation.layout.g.c(b0Var.b(aVar5, aVar3.k()), j2.h.j(40), 0.0f, 2, null), null, null, 0.0f, null, q10, 56, 120);
        PixelArtViewKt.PixelArtView("stable_Pet-Gryphatrice-Jubilant", androidx.compose.foundation.layout.g.c(x0.l.b(m.m(aVar5, j2.h.j(104)), -1.0f, 1.0f), j2.h.j(-30), 0.0f, 2, null), null, q10, 54, 4);
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        float f11 = 2;
        a.l o10 = aVar2.o(j2.h.j(f11), aVar3.h());
        e m10 = androidx.compose.foundation.layout.j.m(aVar5, j2.h.j(8), 0.0f, 0.0f, 0.0f, 14, null);
        q10.e(-483455358);
        i0 a29 = h.a(o10, aVar3.j(), q10, 6);
        q10.e(-1323940314);
        int a30 = j.a(q10, 0);
        v F5 = q10.F();
        pc.a<g> a31 = aVar4.a();
        pc.q<i2<g>, l, Integer, w> a32 = x.a(m10);
        if (!(q10.u() instanceof f)) {
            j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a31);
        } else {
            q10.H();
        }
        l a33 = l3.a(q10);
        l3.b(a33, a29, aVar4.e());
        l3.b(a33, F5, aVar4.g());
        p<g, Integer, w> b15 = aVar4.b();
        if (a33.n() || !q.d(a33.f(), Integer.valueOf(a30))) {
            a33.J(Integer.valueOf(a30));
            a33.I(Integer.valueOf(a30), b15);
        }
        a32.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        u.a(s1.f.d(R.drawable.birthday_menu_text, q10, 6), null, null, null, null, 0.0f, null, q10, 56, 124);
        String a34 = s1.h.a(R.string.exclusive_items_await, q10, 6);
        long a35 = s1.c.a(R.color.yellow_100, q10, 6);
        long g11 = t.g(14);
        c0.a aVar6 = c0.f239m;
        f2.b(a34, androidx.compose.foundation.layout.j.m(aVar5, j2.h.j(f11), 0.0f, 0.0f, 0.0f, 14, null), a35, g11, null, aVar6.f(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 199728, 0, 131024);
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        b.c h12 = aVar3.h();
        e k10 = androidx.compose.foundation.layout.j.k(c.d(m.i(m.h(aVar5, 0.0f, 1, null), j2.h.j(33)), s1.c.a(R.color.brand_300, q10, 6), null, 2, null), j2.h.j(10), 0.0f, 2, null);
        q10.e(693286680);
        i0 a36 = y.a(aVar2.e(), h12, q10, 48);
        q10.e(-1323940314);
        int a37 = j.a(q10, 0);
        v F6 = q10.F();
        pc.a<g> a38 = aVar4.a();
        pc.q<i2<g>, l, Integer, w> a39 = x.a(k10);
        if (!(q10.u() instanceof f)) {
            j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a38);
        } else {
            q10.H();
        }
        l a40 = l3.a(q10);
        l3.b(a40, a36, aVar4.e());
        l3.b(a40, F6, aVar4.g());
        p<g, Integer, w> b16 = aVar4.b();
        if (a40.n() || !q.d(a40.f(), Integer.valueOf(a37))) {
            a40.J(Integer.valueOf(a37));
            a40.I(Integer.valueOf(a37), b16);
        }
        a39.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        e eVar2 = aVar;
        m173TimeRemainingTextmhOCef0(date, R.string.ends_in_x, s1.c.a(R.color.yellow_50, q10, 6), t.g(12), aVar6.b(), q10, 27704);
        d0.a(z.a(b0Var, aVar5, 1.0f, false, 2, null), q10, 0);
        String upperCase = s1.h.a(R.string.see_more, q10, 6).toUpperCase(Locale.ROOT);
        q.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        f2.b(upperCase, null, s1.c.a(R.color.white, q10, 6), t.g(12), null, aVar6.b(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, 199680, 0, 131026);
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        q10.N();
        q10.O();
        q10.N();
        q10.N();
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new BirthdayMenuViewKt$BirthdayBanner$3(date, eVar2, i10, i11));
    }

    /* renamed from: TimeRemainingText-mhOCef0  reason: not valid java name */
    public static final void m173TimeRemainingTextmhOCef0(Date date, int i10, long j10, long j11, c0 c0Var, l lVar, int i11) {
        q.i(date, "endDate");
        q.i(c0Var, "fontWeight");
        l q10 = lVar.q(-1725144082);
        if (n.K()) {
            n.V(-1725144082, i11, -1, "com.habitrpg.android.habitica.ui.views.promo.TimeRemainingText (BirthdayMenuView.kt:146)");
        }
        q10.e(-492369756);
        Object f10 = q10.f();
        if (f10 == l.f18688a.a()) {
            f10 = d3.e(0, null, 2, null);
            q10.J(f10);
        }
        q10.N();
        j1 j1Var = (j1) f10;
        h0.d(Integer.valueOf(TimeRemainingText_mhOCef0$lambda$7(j1Var)), new BirthdayMenuViewKt$TimeRemainingText$1(date, j1Var, null), q10, 64);
        int i12 = i11 << 3;
        f2.b(buildString(TimeRemainingText_mhOCef0$lambda$7(j1Var), date, i10, q10, 64 | (i12 & 896)), null, j10, j11, null, c0Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, q10, (i11 & 896) | (i11 & 7168) | (i12 & 458752), 0, 131026);
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new BirthdayMenuViewKt$TimeRemainingText$2(date, i10, j10, j11, c0Var, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int TimeRemainingText_mhOCef0$lambda$7(j1<Integer> j1Var) {
        return j1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimeRemainingText_mhOCef0$lambda$8(j1<Integer> j1Var, int i10) {
        j1Var.setValue(Integer.valueOf(i10));
    }

    private static final String buildString(int i10, Date date, int i11, l lVar, int i12) {
        lVar.e(-60549164);
        if (n.K()) {
            n.V(-60549164, i12, -1, "com.habitrpg.android.habitica.ui.views.promo.buildString (BirthdayMenuView.kt:132)");
        }
        String upperCase = s1.h.b(i11, new Object[]{DateExtensionsKt.getShortRemainingString(date)}, lVar, ((i12 >> 6) & 14) | 64).toUpperCase(Locale.ROOT);
        q.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return upperCase;
    }
}
