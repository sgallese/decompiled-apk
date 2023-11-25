package j2;

import r.x;

/* compiled from: Velocity.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19013b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f19014c = w.a(0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final long f19015a;

    /* compiled from: Velocity.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return v.f19014c;
        }
    }

    private /* synthetic */ v(long j10) {
        this.f19015a = j10;
    }

    public static final /* synthetic */ v b(long j10) {
        return new v(j10);
    }

    public static final long d(long j10, float f10, float f11) {
        return w.a(f10, f11);
    }

    public static /* synthetic */ long e(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = h(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = i(j10);
        }
        return d(j10, f10, f11);
    }

    public static boolean f(long j10, Object obj) {
        if (!(obj instanceof v) || j10 != ((v) obj).o()) {
            return false;
        }
        return true;
    }

    public static final boolean g(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float h(long j10) {
        qc.j jVar = qc.j.f21682a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float i(long j10) {
        qc.j jVar = qc.j.f21682a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int j(long j10) {
        return x.a(j10);
    }

    public static final long k(long j10, long j11) {
        return w.a(h(j10) - h(j11), i(j10) - i(j11));
    }

    public static final long l(long j10, long j11) {
        return w.a(h(j10) + h(j11), i(j10) + i(j11));
    }

    public static final long m(long j10, float f10) {
        return w.a(h(j10) * f10, i(j10) * f10);
    }

    public static String n(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f19015a, obj);
    }

    public int hashCode() {
        return j(this.f19015a);
    }

    public final /* synthetic */ long o() {
        return this.f19015a;
    }

    public String toString() {
        return n(this.f19015a);
    }

    public static long c(long j10) {
        return j10;
    }
}
