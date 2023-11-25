package d0;

import qc.q;

/* compiled from: InlineDensity.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0300a f12969a = new C0300a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f12970b = b(Float.NaN, Float.NaN);

    /* compiled from: InlineDensity.kt */
    /* renamed from: d0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0300a {
        private C0300a() {
        }

        public /* synthetic */ C0300a(qc.h hVar) {
            this();
        }

        public final long a() {
            return a.f12970b;
        }
    }

    public static long b(float f10, float f11) {
        return c((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static long d(j2.e eVar) {
        q.i(eVar, "density");
        return b(eVar.getDensity(), eVar.p0());
    }

    public static final boolean e(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    private static long c(long j10) {
        return j10;
    }
}
