package v1;

import a1.o4;
import a1.p1;
import a1.p4;
import a1.r1;

/* compiled from: SpanStyle.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f24409a = j2.t.g(14);

    /* renamed from: b  reason: collision with root package name */
    private static final long f24410b = j2.t.g(0);

    /* renamed from: c  reason: collision with root package name */
    private static final long f24411c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f24412d;

    /* compiled from: SpanStyle.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<g2.o> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f24413f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final g2.o invoke() {
            return g2.o.f16079a.b(c0.f24412d);
        }
    }

    static {
        p1.a aVar = p1.f146b;
        f24411c = aVar.d();
        f24412d = aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (a1.p1.q(r23, r22.t().e()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (j2.s.e(r34, r22.o()) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if ((r26 == r22.t().d()) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        if (j2.s.e(r27, r22.k()) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v1.b0 b(v1.b0 r22, long r23, a1.e1 r25, float r26, long r27, a2.c0 r29, a2.x r30, a2.y r31, a2.l r32, java.lang.String r33, long r34, g2.a r36, g2.p r37, c2.i r38, long r39, g2.k r41, a1.o4 r42, v1.x r43, c1.g r44) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.c0.b(v1.b0, long, a1.e1, float, long, a2.c0, a2.x, a2.y, a2.l, java.lang.String, long, g2.a, g2.p, c2.i, long, g2.k, a1.o4, v1.x, c1.g):v1.b0");
    }

    public static final b0 c(b0 b0Var, b0 b0Var2, float f10) {
        float c10;
        float c11;
        qc.q.i(b0Var, "start");
        qc.q.i(b0Var2, "stop");
        g2.o b10 = g2.m.b(b0Var.t(), b0Var2.t(), f10);
        a2.l lVar = (a2.l) d(b0Var.i(), b0Var2.i(), f10);
        long f11 = f(b0Var.k(), b0Var2.k(), f10);
        a2.c0 n10 = b0Var.n();
        if (n10 == null) {
            n10 = a2.c0.f239m.e();
        }
        a2.c0 n11 = b0Var2.n();
        if (n11 == null) {
            n11 = a2.c0.f239m.e();
        }
        a2.c0 a10 = a2.d0.a(n10, n11, f10);
        a2.x xVar = (a2.x) d(b0Var.l(), b0Var2.l(), f10);
        a2.y yVar = (a2.y) d(b0Var.m(), b0Var2.m(), f10);
        String str = (String) d(b0Var.j(), b0Var2.j(), f10);
        long f12 = f(b0Var.o(), b0Var2.o(), f10);
        g2.a e10 = b0Var.e();
        if (e10 != null) {
            c10 = e10.h();
        } else {
            c10 = g2.a.c(0.0f);
        }
        g2.a e11 = b0Var2.e();
        if (e11 != null) {
            c11 = e11.h();
        } else {
            c11 = g2.a.c(0.0f);
        }
        float a11 = g2.b.a(c10, c11, f10);
        g2.p u10 = b0Var.u();
        if (u10 == null) {
            u10 = g2.p.f16082c.a();
        }
        g2.p u11 = b0Var2.u();
        if (u11 == null) {
            u11 = g2.p.f16082c.a();
        }
        g2.p a12 = g2.q.a(u10, u11, f10);
        c2.i iVar = (c2.i) d(b0Var.p(), b0Var2.p(), f10);
        long h10 = r1.h(b0Var.d(), b0Var2.d(), f10);
        g2.k kVar = (g2.k) d(b0Var.s(), b0Var2.s(), f10);
        o4 r10 = b0Var.r();
        if (r10 == null) {
            r10 = new o4(0L, 0L, 0.0f, 7, null);
        }
        o4 r11 = b0Var2.r();
        if (r11 == null) {
            r11 = new o4(0L, 0L, 0.0f, 7, null);
        }
        return new b0(b10, f11, a10, xVar, yVar, lVar, str, f12, g2.a.b(a11), a12, iVar, h10, kVar, p4.a(r10, r11, f10), e(b0Var.q(), b0Var2.q(), f10), (c1.g) d(b0Var.h(), b0Var2.h(), f10), (qc.h) null);
    }

    public static final <T> T d(T t10, T t11, float f10) {
        if (f10 >= 0.5d) {
            return t11;
        }
        return t10;
    }

    private static final x e(x xVar, x xVar2, float f10) {
        if (xVar == null && xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            xVar = x.f24519a.a();
        }
        if (xVar2 == null) {
            xVar2 = x.f24519a.a();
        }
        return c.c(xVar, xVar2, f10);
    }

    public static final long f(long j10, long j11, float f10) {
        if (!j2.t.h(j10) && !j2.t.h(j11)) {
            return j2.t.i(j10, j11, f10);
        }
        return ((j2.s) d(j2.s.b(j10), j2.s.b(j11), f10)).k();
    }

    private static final x g(b0 b0Var, x xVar) {
        if (b0Var.q() == null) {
            return xVar;
        }
        if (xVar == null) {
            return b0Var.q();
        }
        return b0Var.q().b(xVar);
    }

    public static final b0 h(b0 b0Var) {
        long k10;
        int b10;
        int a10;
        long o10;
        float a11;
        boolean z10;
        qc.q.i(b0Var, "style");
        g2.o a12 = b0Var.t().a(a.f24413f);
        if (j2.t.h(b0Var.k())) {
            k10 = f24409a;
        } else {
            k10 = b0Var.k();
        }
        long j10 = k10;
        a2.c0 n10 = b0Var.n();
        if (n10 == null) {
            n10 = a2.c0.f239m.e();
        }
        a2.c0 c0Var = n10;
        a2.x l10 = b0Var.l();
        if (l10 != null) {
            b10 = l10.i();
        } else {
            b10 = a2.x.f339b.b();
        }
        a2.x c10 = a2.x.c(b10);
        a2.y m10 = b0Var.m();
        if (m10 != null) {
            a10 = m10.m();
        } else {
            a10 = a2.y.f348b.a();
        }
        a2.y e10 = a2.y.e(a10);
        a2.l i10 = b0Var.i();
        if (i10 == null) {
            i10 = a2.l.f298m.b();
        }
        a2.l lVar = i10;
        String j11 = b0Var.j();
        if (j11 == null) {
            j11 = "";
        }
        String str = j11;
        if (j2.t.h(b0Var.o())) {
            o10 = f24410b;
        } else {
            o10 = b0Var.o();
        }
        long j12 = o10;
        g2.a e11 = b0Var.e();
        if (e11 != null) {
            a11 = e11.h();
        } else {
            a11 = g2.a.f16011b.a();
        }
        g2.a b11 = g2.a.b(a11);
        g2.p u10 = b0Var.u();
        if (u10 == null) {
            u10 = g2.p.f16082c.a();
        }
        g2.p pVar = u10;
        c2.i p10 = b0Var.p();
        if (p10 == null) {
            p10 = c2.i.f8698p.a();
        }
        c2.i iVar = p10;
        long d10 = b0Var.d();
        if (d10 != p1.f146b.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            d10 = f24411c;
        }
        long j13 = d10;
        g2.k s10 = b0Var.s();
        if (s10 == null) {
            s10 = g2.k.f16065b.c();
        }
        g2.k kVar = s10;
        o4 r10 = b0Var.r();
        if (r10 == null) {
            r10 = o4.f137d.a();
        }
        o4 o4Var = r10;
        x q10 = b0Var.q();
        c1.g h10 = b0Var.h();
        if (h10 == null) {
            h10 = c1.k.f8683a;
        }
        return new b0(a12, j10, c0Var, c10, e10, lVar, str, j12, b11, pVar, iVar, j13, kVar, o4Var, q10, h10, (qc.h) null);
    }
}
