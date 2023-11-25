package v1;

/* compiled from: TextRange.kt */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24470b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f24471c = j0.a(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f24472a;

    /* compiled from: TextRange.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return i0.f24471c;
        }
    }

    private /* synthetic */ i0(long j10) {
        this.f24472a = j10;
    }

    public static final /* synthetic */ i0 b(long j10) {
        return new i0(j10);
    }

    public static final boolean d(long j10, long j11) {
        if (l(j10) <= l(j11) && k(j11) <= k(j10)) {
            return true;
        }
        return false;
    }

    public static final boolean e(long j10, int i10) {
        int l10 = l(j10);
        if (i10 >= k(j10) || l10 > i10) {
            return false;
        }
        return true;
    }

    public static boolean f(long j10, Object obj) {
        if (!(obj instanceof i0) || j10 != ((i0) obj).r()) {
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

    public static final boolean h(long j10) {
        if (n(j10) == i(j10)) {
            return true;
        }
        return false;
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int j(long j10) {
        return k(j10) - l(j10);
    }

    public static final int k(long j10) {
        if (n(j10) > i(j10)) {
            return n(j10);
        }
        return i(j10);
    }

    public static final int l(long j10) {
        if (n(j10) > i(j10)) {
            return i(j10);
        }
        return n(j10);
    }

    public static final boolean m(long j10) {
        if (n(j10) > i(j10)) {
            return true;
        }
        return false;
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    public static int o(long j10) {
        return r.x.a(j10);
    }

    public static final boolean p(long j10, long j11) {
        if (l(j10) < k(j11) && l(j11) < k(j10)) {
            return true;
        }
        return false;
    }

    public static String q(long j10) {
        return "TextRange(" + n(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f24472a, obj);
    }

    public int hashCode() {
        return o(this.f24472a);
    }

    public final /* synthetic */ long r() {
        return this.f24472a;
    }

    public String toString() {
        return q(this.f24472a);
    }

    public static long c(long j10) {
        return j10;
    }
}
