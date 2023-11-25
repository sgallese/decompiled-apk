package b1;

/* compiled from: ColorModel.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7632a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f7633b;

    /* renamed from: c  reason: collision with root package name */
    private static final long f7634c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f7635d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f7636e;

    /* compiled from: ColorModel.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return b.f7635d;
        }

        public final long b() {
            return b.f7633b;
        }

        public final long c() {
            return b.f7634c;
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f7633b = d((0 & 4294967295L) | j11);
        f7634c = d((1 & 4294967295L) | j11);
        f7635d = d(j11 | (2 & 4294967295L));
        f7636e = d((j10 & 4294967295L) | (4 << 32));
    }

    public static final boolean e(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static int g(long j10) {
        return r.x.a(j10);
    }

    public static String h(long j10) {
        if (e(j10, f7633b)) {
            return "Rgb";
        }
        if (e(j10, f7634c)) {
            return "Xyz";
        }
        if (e(j10, f7635d)) {
            return "Lab";
        }
        if (e(j10, f7636e)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public static long d(long j10) {
        return j10;
    }
}
