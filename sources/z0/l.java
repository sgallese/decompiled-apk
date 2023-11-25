package z0;

import r.x;

/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f26375b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f26376c = m.a(0.0f, 0.0f);

    /* renamed from: d  reason: collision with root package name */
    private static final long f26377d = m.a(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final long f26378a;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return l.f26377d;
        }

        public final long b() {
            return l.f26376c;
        }
    }

    private /* synthetic */ l(long j10) {
        this.f26378a = j10;
    }

    public static final /* synthetic */ l c(long j10) {
        return new l(j10);
    }

    public static boolean e(long j10, Object obj) {
        if (!(obj instanceof l) || j10 != ((l) obj).m()) {
            return false;
        }
        return true;
    }

    public static final boolean f(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float g(long j10) {
        boolean z10;
        if (j10 != f26377d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float h(long j10) {
        return Math.min(Math.abs(i(j10)), Math.abs(g(j10)));
    }

    public static final float i(long j10) {
        boolean z10;
        if (j10 != f26377d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static int j(long j10) {
        return x.a(j10);
    }

    public static final boolean k(long j10) {
        if (i(j10) > 0.0f && g(j10) > 0.0f) {
            return false;
        }
        return true;
    }

    public static String l(long j10) {
        boolean z10;
        if (j10 != f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "Size(" + c.a(i(j10), 1) + ", " + c.a(g(j10), 1) + ')';
        }
        return "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return e(this.f26378a, obj);
    }

    public int hashCode() {
        return j(this.f26378a);
    }

    public final /* synthetic */ long m() {
        return this.f26378a;
    }

    public String toString() {
        return l(this.f26378a);
    }

    public static long d(long j10) {
        return j10;
    }
}
