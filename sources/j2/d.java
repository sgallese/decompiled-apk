package j2;

/* compiled from: Density.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class d {
    public static int a(e eVar, float f10) {
        int d10;
        float v02 = eVar.v0(f10);
        if (!Float.isInfinite(v02)) {
            d10 = sc.c.d(v02);
            return d10;
        }
        return Integer.MAX_VALUE;
    }

    public static float b(e eVar, long j10) {
        if (u.g(s.g(j10), u.f19008b.b())) {
            return h.j(s.h(j10) * eVar.p0());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float c(e eVar, float f10) {
        return h.j(f10 / eVar.getDensity());
    }

    public static float d(e eVar, int i10) {
        return h.j(i10 / eVar.getDensity());
    }

    public static long e(e eVar, long j10) {
        boolean z10;
        if (j10 != z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return i.b(eVar.j0(z0.l.i(j10)), eVar.j0(z0.l.g(j10)));
        }
        return k.f18988b.a();
    }

    public static float f(e eVar, long j10) {
        if (u.g(s.g(j10), u.f19008b.b())) {
            return s.h(j10) * eVar.p0() * eVar.getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static float g(e eVar, float f10) {
        return f10 * eVar.getDensity();
    }

    public static long h(e eVar, long j10) {
        boolean z10;
        if (j10 != k.f18988b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return z0.m.a(eVar.v0(k.h(j10)), eVar.v0(k.g(j10)));
        }
        return z0.l.f26375b.a();
    }

    public static long i(e eVar, float f10) {
        return t.f(f10 / (eVar.p0() * eVar.getDensity()));
    }
}
