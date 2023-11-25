package z0;

import r.x;

/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f26354b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f26355c = g.a(0.0f, 0.0f);

    /* renamed from: d  reason: collision with root package name */
    private static final long f26356d = g.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e  reason: collision with root package name */
    private static final long f26357e = g.a(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final long f26358a;

    /* compiled from: Offset.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return f.f26356d;
        }

        public final long b() {
            return f.f26357e;
        }

        public final long c() {
            return f.f26355c;
        }
    }

    private /* synthetic */ f(long j10) {
        this.f26358a = j10;
    }

    public static final /* synthetic */ f d(long j10) {
        return new f(j10);
    }

    public static final float e(long j10) {
        return o(j10);
    }

    public static final float f(long j10) {
        return p(j10);
    }

    public static final long h(long j10, float f10, float f11) {
        return g.a(f10, f11);
    }

    public static /* synthetic */ long i(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = o(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = p(j10);
        }
        return h(j10, f10, f11);
    }

    public static final long j(long j10, float f10) {
        return g.a(o(j10) / f10, p(j10) / f10);
    }

    public static boolean k(long j10, Object obj) {
        if (!(obj instanceof f) || j10 != ((f) obj).x()) {
            return false;
        }
        return true;
    }

    public static final boolean l(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float m(long j10) {
        return (float) Math.sqrt((o(j10) * o(j10)) + (p(j10) * p(j10)));
    }

    public static final float n(long j10) {
        return (o(j10) * o(j10)) + (p(j10) * p(j10));
    }

    public static final float o(long j10) {
        boolean z10;
        if (j10 != f26357e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float p(long j10) {
        boolean z10;
        if (j10 != f26357e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static int q(long j10) {
        return x.a(j10);
    }

    public static final boolean r(long j10) {
        boolean z10;
        if (!Float.isNaN(o(j10)) && !Float.isNaN(p(j10))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    public static final long s(long j10, long j11) {
        return g.a(o(j10) - o(j11), p(j10) - p(j11));
    }

    public static final long t(long j10, long j11) {
        return g.a(o(j10) + o(j11), p(j10) + p(j11));
    }

    public static final long u(long j10, float f10) {
        return g.a(o(j10) * f10, p(j10) * f10);
    }

    public static String v(long j10) {
        if (g.c(j10)) {
            return "Offset(" + c.a(o(j10), 1) + ", " + c.a(p(j10), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    public static final long w(long j10) {
        return g.a(-o(j10), -p(j10));
    }

    public boolean equals(Object obj) {
        return k(this.f26358a, obj);
    }

    public int hashCode() {
        return q(this.f26358a);
    }

    public String toString() {
        return v(this.f26358a);
    }

    public final /* synthetic */ long x() {
        return this.f26358a;
    }

    public static long g(long j10) {
        return j10;
    }
}
