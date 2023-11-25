package e2;

import a1.e1;
import a1.m4;
import a1.o4;
import a1.p1;
import a1.r1;
import a1.r4;
import a2.c0;
import a2.l;
import a2.x;
import a2.y;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import dc.w;
import ec.p;
import g2.h;
import g2.k;
import j2.s;
import j2.t;
import j2.u;
import java.util.ArrayList;
import java.util.List;
import pc.q;
import qc.r;
import v1.b0;
import v1.d;
import v1.k0;
import y1.m;
import y1.n;
import y1.o;

/* compiled from: SpannableExtensions.android.kt */
/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpannableExtensions.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements q<b0, Integer, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Spannable f14010f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.r<l, c0, x, y, Typeface> f14011m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Spannable spannable, pc.r<? super l, ? super c0, ? super x, ? super y, ? extends Typeface> rVar) {
            super(3);
            this.f14010f = spannable;
            this.f14011m = rVar;
        }

        public final void a(b0 b0Var, int i10, int i11) {
            int b10;
            int a10;
            qc.q.i(b0Var, "spanStyle");
            Spannable spannable = this.f14010f;
            pc.r<l, c0, x, y, Typeface> rVar = this.f14011m;
            l i12 = b0Var.i();
            c0 n10 = b0Var.n();
            if (n10 == null) {
                n10 = c0.f239m.e();
            }
            x l10 = b0Var.l();
            if (l10 != null) {
                b10 = l10.i();
            } else {
                b10 = x.f339b.b();
            }
            x c10 = x.c(b10);
            y m10 = b0Var.m();
            if (m10 != null) {
                a10 = m10.m();
            } else {
                a10 = y.f348b.a();
            }
            spannable.setSpan(new o(rVar.invoke(i12, n10, c10, y.e(a10))), i10, i11, 33);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ w invoke(b0 b0Var, Integer num, Integer num2) {
            a(b0Var, num.intValue(), num2.intValue());
            return w.f13270a;
        }
    }

    private static final MetricAffectingSpan a(long j10, j2.e eVar) {
        long g10 = s.g(j10);
        u.a aVar = u.f19008b;
        if (u.g(g10, aVar.b())) {
            return new y1.f(eVar.W0(j10));
        }
        if (u.g(g10, aVar.a())) {
            return new y1.e(s.h(j10));
        }
        return null;
    }

    public static final void b(b0 b0Var, List<d.b<b0>> list, q<? super b0, ? super Integer, ? super Integer, w> qVar) {
        Object L;
        qc.q.i(list, "spanStyles");
        qc.q.i(qVar, "block");
        if (list.size() <= 1) {
            if ((!list.isEmpty()) != false) {
                qVar.invoke(e(b0Var, list.get(0).e()), Integer.valueOf(list.get(0).f()), Integer.valueOf(list.get(0).d()));
                return;
            }
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            d.b<b0> bVar = list.get(i12);
            numArr[i12] = Integer.valueOf(bVar.f());
            numArr[i12 + size] = Integer.valueOf(bVar.d());
        }
        ec.o.B(numArr);
        L = p.L(numArr);
        int intValue = ((Number) L).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            int intValue2 = numArr[i13].intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                b0 b0Var2 = b0Var;
                for (int i14 = 0; i14 < size3; i14++) {
                    d.b<b0> bVar2 = list.get(i14);
                    if (bVar2.f() != bVar2.d() && v1.e.l(intValue, intValue2, bVar2.f(), bVar2.d())) {
                        b0Var2 = e(b0Var2, bVar2.e());
                    }
                }
                if (b0Var2 != null) {
                    qVar.invoke(b0Var2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean c(b0 b0Var) {
        long g10 = s.g(b0Var.o());
        u.a aVar = u.f19008b;
        if (!u.g(g10, aVar.b()) && !u.g(s.g(b0Var.o()), aVar.a())) {
            return false;
        }
        return true;
    }

    private static final boolean d(k0 k0Var) {
        if (!h.d(k0Var.M()) && k0Var.n() == null) {
            return false;
        }
        return true;
    }

    private static final b0 e(b0 b0Var, b0 b0Var2) {
        if (b0Var == null) {
            return b0Var2;
        }
        return b0Var.x(b0Var2);
    }

    private static final float f(long j10, float f10, j2.e eVar) {
        long g10 = s.g(j10);
        u.a aVar = u.f19008b;
        if (u.g(g10, aVar.b())) {
            return eVar.W0(j10);
        }
        if (u.g(g10, aVar.a())) {
            return s.h(j10) * f10;
        }
        return Float.NaN;
    }

    public static final void g(Spannable spannable, long j10, int i10, int i11) {
        boolean z10;
        qc.q.i(spannable, "$this$setBackground");
        if (j10 != p1.f146b.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            t(spannable, new BackgroundColorSpan(r1.k(j10)), i10, i11);
        }
    }

    private static final void h(Spannable spannable, g2.a aVar, int i10, int i11) {
        if (aVar != null) {
            t(spannable, new y1.a(aVar.h()), i10, i11);
        }
    }

    private static final void i(Spannable spannable, e1 e1Var, float f10, int i10, int i11) {
        if (e1Var != null) {
            if (e1Var instanceof r4) {
                j(spannable, ((r4) e1Var).b(), i10, i11);
            } else if (e1Var instanceof m4) {
                t(spannable, new f2.b((m4) e1Var, f10), i10, i11);
            }
        }
    }

    public static final void j(Spannable spannable, long j10, int i10, int i11) {
        boolean z10;
        qc.q.i(spannable, "$this$setColor");
        if (j10 != p1.f146b.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            t(spannable, new ForegroundColorSpan(r1.k(j10)), i10, i11);
        }
    }

    private static final void k(Spannable spannable, c1.g gVar, int i10, int i11) {
        if (gVar != null) {
            t(spannable, new f2.a(gVar), i10, i11);
        }
    }

    private static final void l(Spannable spannable, k0 k0Var, List<d.b<b0>> list, pc.r<? super l, ? super c0, ? super x, ? super y, ? extends Typeface> rVar) {
        b0 b0Var;
        boolean z10;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.b<b0> bVar = list.get(i10);
            d.b<b0> bVar2 = bVar;
            if (!h.d(bVar2.e()) && bVar2.e().m() == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                arrayList.add(bVar);
            }
        }
        if (d(k0Var)) {
            long j10 = 0;
            long j11 = 0;
            b0Var = new b0(j10, j11, k0Var.o(), k0Var.m(), k0Var.n(), k0Var.j(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null);
        } else {
            b0Var = null;
        }
        b(b0Var, arrayList, new a(spannable, rVar));
    }

    private static final void m(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            t(spannable, new y1.b(str), i10, i11);
        }
    }

    public static final void n(Spannable spannable, long j10, j2.e eVar, int i10, int i11) {
        int d10;
        qc.q.i(spannable, "$this$setFontSize");
        qc.q.i(eVar, "density");
        long g10 = s.g(j10);
        u.a aVar = u.f19008b;
        if (u.g(g10, aVar.b())) {
            d10 = sc.c.d(eVar.W0(j10));
            t(spannable, new AbsoluteSizeSpan(d10, false), i10, i11);
        } else if (u.g(g10, aVar.a())) {
            t(spannable, new RelativeSizeSpan(s.h(j10)), i10, i11);
        }
    }

    private static final void o(Spannable spannable, g2.p pVar, int i10, int i11) {
        if (pVar != null) {
            t(spannable, new ScaleXSpan(pVar.b()), i10, i11);
            t(spannable, new m(pVar.c()), i10, i11);
        }
    }

    public static final void p(Spannable spannable, long j10, float f10, j2.e eVar, g2.h hVar) {
        boolean z10;
        int length;
        char Y0;
        qc.q.i(spannable, "$this$setLineHeight");
        qc.q.i(eVar, "density");
        qc.q.i(hVar, "lineHeightStyle");
        float f11 = f(j10, f10, eVar);
        if (!Float.isNaN(f11)) {
            if (spannable.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Y0 = yc.y.Y0(spannable);
                if (Y0 != '\n') {
                    length = spannable.length();
                    t(spannable, new y1.h(f11, 0, length, h.c.e(hVar.c()), h.c.f(hVar.c()), hVar.b()), 0, spannable.length());
                }
            }
            length = spannable.length() + 1;
            t(spannable, new y1.h(f11, 0, length, h.c.e(hVar.c()), h.c.f(hVar.c()), hVar.b()), 0, spannable.length());
        }
    }

    public static final void q(Spannable spannable, long j10, float f10, j2.e eVar) {
        qc.q.i(spannable, "$this$setLineHeight");
        qc.q.i(eVar, "density");
        float f11 = f(j10, f10, eVar);
        if (!Float.isNaN(f11)) {
            t(spannable, new y1.g(f11), 0, spannable.length());
        }
    }

    public static final void r(Spannable spannable, c2.i iVar, int i10, int i11) {
        c2.h e10;
        Object localeSpan;
        qc.q.i(spannable, "<this>");
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = e.f14009a.a(iVar);
            } else {
                if (iVar.isEmpty()) {
                    e10 = c2.h.f8696b.a();
                } else {
                    e10 = iVar.e(0);
                }
                localeSpan = new LocaleSpan(e2.a.a(e10));
            }
            t(spannable, localeSpan, i10, i11);
        }
    }

    private static final void s(Spannable spannable, o4 o4Var, int i10, int i11) {
        if (o4Var != null) {
            t(spannable, new y1.l(r1.k(o4Var.c()), z0.f.o(o4Var.d()), z0.f.p(o4Var.d()), h.b(o4Var.b())), i10, i11);
        }
    }

    public static final void t(Spannable spannable, Object obj, int i10, int i11) {
        qc.q.i(spannable, "<this>");
        qc.q.i(obj, "span");
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void u(Spannable spannable, d.b<b0> bVar, j2.e eVar) {
        int f10 = bVar.f();
        int d10 = bVar.d();
        b0 e10 = bVar.e();
        h(spannable, e10.e(), f10, d10);
        j(spannable, e10.g(), f10, d10);
        i(spannable, e10.f(), e10.c(), f10, d10);
        w(spannable, e10.s(), f10, d10);
        n(spannable, e10.k(), eVar, f10, d10);
        m(spannable, e10.j(), f10, d10);
        o(spannable, e10.u(), f10, d10);
        r(spannable, e10.p(), f10, d10);
        g(spannable, e10.d(), f10, d10);
        s(spannable, e10.r(), f10, d10);
        k(spannable, e10.h(), f10, d10);
    }

    public static final void v(Spannable spannable, k0 k0Var, List<d.b<b0>> list, j2.e eVar, pc.r<? super l, ? super c0, ? super x, ? super y, ? extends Typeface> rVar) {
        MetricAffectingSpan a10;
        qc.q.i(spannable, "<this>");
        qc.q.i(k0Var, "contextTextStyle");
        qc.q.i(list, "spanStyles");
        qc.q.i(eVar, "density");
        qc.q.i(rVar, "resolveTypeface");
        l(spannable, k0Var, list, rVar);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            d.b<b0> bVar = list.get(i10);
            int f10 = bVar.f();
            int d10 = bVar.d();
            if (f10 >= 0 && f10 < spannable.length() && d10 > f10 && d10 <= spannable.length()) {
                u(spannable, bVar, eVar);
                if (c(bVar.e())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                d.b<b0> bVar2 = list.get(i11);
                int f11 = bVar2.f();
                int d11 = bVar2.d();
                b0 e10 = bVar2.e();
                if (f11 >= 0 && f11 < spannable.length() && d11 > f11 && d11 <= spannable.length() && (a10 = a(e10.o(), eVar)) != null) {
                    t(spannable, a10, f11, d11);
                }
            }
        }
    }

    public static final void w(Spannable spannable, k kVar, int i10, int i11) {
        qc.q.i(spannable, "<this>");
        if (kVar != null) {
            k.a aVar = k.f16065b;
            t(spannable, new n(kVar.d(aVar.d()), kVar.d(aVar.b())), i10, i11);
        }
    }

    public static final void x(Spannable spannable, g2.r rVar, float f10, j2.e eVar) {
        float f11;
        qc.q.i(spannable, "<this>");
        qc.q.i(eVar, "density");
        if (rVar != null) {
            if ((!s.e(rVar.b(), t.g(0)) || !s.e(rVar.c(), t.g(0))) && !t.h(rVar.b()) && !t.h(rVar.c())) {
                long g10 = s.g(rVar.b());
                u.a aVar = u.f19008b;
                float f12 = 0.0f;
                if (u.g(g10, aVar.b())) {
                    f11 = eVar.W0(rVar.b());
                } else if (u.g(g10, aVar.a())) {
                    f11 = s.h(rVar.b()) * f10;
                } else {
                    f11 = 0.0f;
                }
                long g11 = s.g(rVar.c());
                if (u.g(g11, aVar.b())) {
                    f12 = eVar.W0(rVar.c());
                } else if (u.g(g11, aVar.a())) {
                    f12 = s.h(rVar.c()) * f10;
                }
                t(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(f11), (int) Math.ceil(f12)), 0, spannable.length());
            }
        }
    }
}
