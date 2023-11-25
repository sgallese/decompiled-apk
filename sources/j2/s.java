package j2;

import j2.u;
import r.x;

/* compiled from: TextUnit.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19004b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final u[] f19005c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f19006d;

    /* renamed from: a  reason: collision with root package name */
    private final long f19007a;

    /* compiled from: TextUnit.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return s.f19006d;
        }
    }

    static {
        u.a aVar = u.f19008b;
        f19005c = new u[]{u.d(aVar.c()), u.d(aVar.b()), u.d(aVar.a())};
        f19006d = t.j(0L, Float.NaN);
    }

    private /* synthetic */ s(long j10) {
        this.f19007a = j10;
    }

    public static final /* synthetic */ s b(long j10) {
        return new s(j10);
    }

    public static boolean d(long j10, Object obj) {
        if (!(obj instanceof s) || j10 != ((s) obj).k()) {
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

    public static final long f(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long g(long j10) {
        return f19005c[(int) (f(j10) >>> 32)].j();
    }

    public static final float h(long j10) {
        qc.j jVar = qc.j.f21682a;
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int i(long j10) {
        return x.a(j10);
    }

    public static String j(long j10) {
        long g10 = g(j10);
        u.a aVar = u.f19008b;
        if (u.g(g10, aVar.c())) {
            return "Unspecified";
        }
        if (u.g(g10, aVar.b())) {
            return h(j10) + ".sp";
        } else if (u.g(g10, aVar.a())) {
            return h(j10) + ".em";
        } else {
            return "Invalid";
        }
    }

    public boolean equals(Object obj) {
        return d(this.f19007a, obj);
    }

    public int hashCode() {
        return i(this.f19007a);
    }

    public final /* synthetic */ long k() {
        return this.f19007a;
    }

    public String toString() {
        return j(this.f19007a);
    }

    public static long c(long j10) {
        return j10;
    }
}
