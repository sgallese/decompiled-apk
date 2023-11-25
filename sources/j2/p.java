package j2;

import r.x;

/* compiled from: IntSize.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19001b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f19002c = c(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f19003a;

    /* compiled from: IntSize.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return p.f19002c;
        }
    }

    private /* synthetic */ p(long j10) {
        this.f19003a = j10;
    }

    public static final /* synthetic */ p b(long j10) {
        return new p(j10);
    }

    public static boolean d(long j10, Object obj) {
        if (!(obj instanceof p) || j10 != ((p) obj).j()) {
            return false;
        }
        return true;
    }

    public static final boolean e(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static int h(long j10) {
        return x.a(j10);
    }

    public static String i(long j10) {
        return g(j10) + " x " + f(j10);
    }

    public boolean equals(Object obj) {
        return d(this.f19003a, obj);
    }

    public int hashCode() {
        return h(this.f19003a);
    }

    public final /* synthetic */ long j() {
        return this.f19003a;
    }

    public String toString() {
        return i(this.f19003a);
    }

    public static long c(long j10) {
        return j10;
    }
}
