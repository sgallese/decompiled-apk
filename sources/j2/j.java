package j2;

import j2.h;
import r.x;

/* compiled from: Dp.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18984b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f18985c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f18986d;

    /* renamed from: a  reason: collision with root package name */
    private final long f18987a;

    /* compiled from: Dp.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return j.f18986d;
        }
    }

    static {
        float f10 = 0;
        f18985c = i.a(h.j(f10), h.j(f10));
        h.a aVar = h.f18979m;
        f18986d = i.a(aVar.b(), aVar.b());
    }

    private /* synthetic */ j(long j10) {
        this.f18987a = j10;
    }

    public static final /* synthetic */ j b(long j10) {
        return new j(j10);
    }

    public static boolean d(long j10, Object obj) {
        if (!(obj instanceof j) || j10 != ((j) obj).i()) {
            return false;
        }
        return true;
    }

    public static final float e(long j10) {
        boolean z10;
        if (j10 != f18986d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return h.j(Float.intBitsToFloat((int) (j10 >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float f(long j10) {
        boolean z10;
        if (j10 != f18986d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.j jVar = qc.j.f21682a;
            return h.j(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static int g(long j10) {
        return x.a(j10);
    }

    public static String h(long j10) {
        boolean z10;
        if (j10 != f18984b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return '(' + ((Object) h.n(e(j10))) + ", " + ((Object) h.n(f(j10))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public boolean equals(Object obj) {
        return d(this.f18987a, obj);
    }

    public int hashCode() {
        return g(this.f18987a);
    }

    public final /* synthetic */ long i() {
        return this.f18987a;
    }

    public String toString() {
        return h(this.f18987a);
    }

    public static long c(long j10) {
        return j10;
    }
}
