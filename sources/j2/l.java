package j2;

import r.x;

/* compiled from: IntOffset.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18992b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f18993c = m.a(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final long f18994a;

    /* compiled from: IntOffset.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return l.f18993c;
        }
    }

    private /* synthetic */ l(long j10) {
        this.f18994a = j10;
    }

    public static final /* synthetic */ l b(long j10) {
        return new l(j10);
    }

    public static final int c(long j10) {
        return j(j10);
    }

    public static final int d(long j10) {
        return k(j10);
    }

    public static final long f(long j10, int i10, int i11) {
        return m.a(i10, i11);
    }

    public static /* synthetic */ long g(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = j(j10);
        }
        if ((i12 & 2) != 0) {
            i11 = k(j10);
        }
        return f(j10, i10, i11);
    }

    public static boolean h(long j10, Object obj) {
        if (!(obj instanceof l) || j10 != ((l) obj).n()) {
            return false;
        }
        return true;
    }

    public static final boolean i(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final int j(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int k(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int l(long j10) {
        return x.a(j10);
    }

    public static String m(long j10) {
        return '(' + j(j10) + ", " + k(j10) + ')';
    }

    public boolean equals(Object obj) {
        return h(this.f18994a, obj);
    }

    public int hashCode() {
        return l(this.f18994a);
    }

    public final /* synthetic */ long n() {
        return this.f18994a;
    }

    public String toString() {
        return m(this.f18994a);
    }

    public static long e(long j10) {
        return j10;
    }
}
