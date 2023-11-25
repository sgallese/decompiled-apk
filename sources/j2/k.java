package j2;

import j2.h;
import r.x;

/* compiled from: Dp.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18988b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f18989c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f18990d;

    /* renamed from: a  reason: collision with root package name */
    private final long f18991a;

    /* compiled from: Dp.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return k.f18990d;
        }

        public final long b() {
            return k.f18989c;
        }
    }

    static {
        float f10 = 0;
        f18989c = i.b(h.j(f10), h.j(f10));
        h.a aVar = h.f18979m;
        f18990d = i.b(aVar.b(), aVar.b());
    }

    private /* synthetic */ k(long j10) {
        this.f18991a = j10;
    }

    public static final /* synthetic */ k c(long j10) {
        return new k(j10);
    }

    public static boolean e(long j10, Object obj) {
        if (!(obj instanceof k) || j10 != ((k) obj).k()) {
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
        if (j10 != f18990d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return h.j(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float h(long j10) {
        boolean z10;
        if (j10 != f18990d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return h.j(Float.intBitsToFloat((int) (j10 >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static int i(long j10) {
        return x.a(j10);
    }

    public static String j(long j10) {
        boolean z10;
        if (j10 != f18988b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return ((Object) h.n(h(j10))) + " x " + ((Object) h.n(g(j10)));
        }
        return "DpSize.Unspecified";
    }

    public boolean equals(Object obj) {
        return e(this.f18991a, obj);
    }

    public int hashCode() {
        return i(this.f18991a);
    }

    public final /* synthetic */ long k() {
        return this.f18991a;
    }

    public String toString() {
        return j(this.f18991a);
    }

    public static long d(long j10) {
        return j10;
    }
}
