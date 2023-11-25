package v1;

/* compiled from: ParagraphStyle.kt */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final long f24503a = j2.s.f19004b.a();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (j2.s.e(r12, r23.g()) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v1.s a(v1.s r23, g2.j r24, g2.l r25, long r26, g2.r r28, v1.w r29, g2.h r30, g2.f r31, g2.e r32, g2.t r33) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.t.a(v1.s, g2.j, g2.l, long, g2.r, v1.w, g2.h, g2.f, g2.e, g2.t):v1.s");
    }

    public static final s b(s sVar, s sVar2, float f10) {
        qc.q.i(sVar, "start");
        qc.q.i(sVar2, "stop");
        g2.j jVar = (g2.j) c0.d(sVar.j(), sVar2.j(), f10);
        g2.l lVar = (g2.l) c0.d(sVar.l(), sVar2.l(), f10);
        long f11 = c0.f(sVar.g(), sVar2.g(), f10);
        g2.r m10 = sVar.m();
        if (m10 == null) {
            m10 = g2.r.f16086c.a();
        }
        g2.r m11 = sVar2.m();
        if (m11 == null) {
            m11 = g2.r.f16086c.a();
        }
        return new s(jVar, lVar, f11, g2.s.a(m10, m11, f10), c(sVar.i(), sVar2.i(), f10), (g2.h) c0.d(sVar.h(), sVar2.h(), f10), (g2.f) c0.d(sVar.e(), sVar2.e(), f10), (g2.e) c0.d(sVar.c(), sVar2.c(), f10), (g2.t) c0.d(sVar.n(), sVar2.n(), f10), null);
    }

    private static final w c(w wVar, w wVar2, float f10) {
        if (wVar == null && wVar2 == null) {
            return null;
        }
        if (wVar == null) {
            wVar = w.f24515c.a();
        }
        if (wVar2 == null) {
            wVar2 = w.f24515c.a();
        }
        return c.b(wVar, wVar2, f10);
    }

    private static final w d(s sVar, w wVar) {
        if (sVar.i() == null) {
            return wVar;
        }
        if (wVar == null) {
            return sVar.i();
        }
        return sVar.i().d(wVar);
    }

    public static final s e(s sVar, j2.r rVar) {
        long g10;
        qc.q.i(sVar, "style");
        qc.q.i(rVar, "direction");
        g2.j g11 = g2.j.g(sVar.k());
        g2.l f10 = g2.l.f(l0.e(rVar, sVar.l()));
        if (j2.t.h(sVar.g())) {
            g10 = f24503a;
        } else {
            g10 = sVar.g();
        }
        g2.r m10 = sVar.m();
        if (m10 == null) {
            m10 = g2.r.f16086c.a();
        }
        g2.r rVar2 = m10;
        w i10 = sVar.i();
        g2.h h10 = sVar.h();
        g2.f b10 = g2.f.b(sVar.f());
        g2.e c10 = g2.e.c(sVar.d());
        g2.t n10 = sVar.n();
        if (n10 == null) {
            n10 = g2.t.f16090c.a();
        }
        return new s(g11, f10, g10, rVar2, i10, h10, b10, c10, n10, null);
    }
}
