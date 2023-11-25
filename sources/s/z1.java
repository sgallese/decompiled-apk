package s;

import j2.h;
import j2.l;
import j2.p;
import java.util.Map;
import z0.f;
import z0.h;
import z0.l;

/* compiled from: VisibilityThresholds.kt */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    private static final z0.h f22889a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<i1<?, ?>, Float> f22890b;

    static {
        Map<i1<?, ?>, Float> k10;
        Float valueOf = Float.valueOf(0.5f);
        f22889a = new z0.h(0.5f, 0.5f, 0.5f, 0.5f);
        i1<Integer, n> g10 = k1.g(qc.p.f21686a);
        Float valueOf2 = Float.valueOf(1.0f);
        i1<j2.h, n> b10 = k1.b(j2.h.f18979m);
        Float valueOf3 = Float.valueOf(0.1f);
        k10 = ec.n0.k(dc.r.a(g10, valueOf2), dc.r.a(k1.e(j2.p.f19001b), valueOf2), dc.r.a(k1.d(j2.l.f18992b), valueOf2), dc.r.a(k1.f(qc.j.f21682a), Float.valueOf(0.01f)), dc.r.a(k1.i(z0.h.f26359e), valueOf), dc.r.a(k1.j(z0.l.f26375b), valueOf), dc.r.a(k1.h(z0.f.f26354b), valueOf), dc.r.a(b10, valueOf3), dc.r.a(k1.c(j2.j.f18984b), valueOf3));
        f22890b = k10;
    }

    public static final float a(h.a aVar) {
        qc.q.i(aVar, "<this>");
        return j2.h.j(0.1f);
    }

    public static final int b(qc.p pVar) {
        qc.q.i(pVar, "<this>");
        return 1;
    }

    public static final long c(l.a aVar) {
        qc.q.i(aVar, "<this>");
        return j2.m.a(1, 1);
    }

    public static final long d(p.a aVar) {
        qc.q.i(aVar, "<this>");
        return j2.q.a(1, 1);
    }

    public static final long e(f.a aVar) {
        qc.q.i(aVar, "<this>");
        return z0.g.a(0.5f, 0.5f);
    }

    public static final long f(l.a aVar) {
        qc.q.i(aVar, "<this>");
        return z0.m.a(0.5f, 0.5f);
    }

    public static final z0.h g(h.a aVar) {
        qc.q.i(aVar, "<this>");
        return f22889a;
    }

    public static final Map<i1<?, ?>, Float> h() {
        return f22890b;
    }
}
