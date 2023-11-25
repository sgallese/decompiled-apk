package k1;

/* compiled from: PointerEvent.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f19150a;

    private /* synthetic */ b0(long j10) {
        this.f19150a = j10;
    }

    public static final /* synthetic */ b0 a(long j10) {
        return new b0(j10);
    }

    public static boolean c(long j10, Object obj) {
        if (!(obj instanceof b0) || j10 != ((b0) obj).g()) {
            return false;
        }
        return true;
    }

    public static final boolean d(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static int e(long j10) {
        return r.x.a(j10);
    }

    public static String f(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f19150a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f19150a;
    }

    public int hashCode() {
        return e(this.f19150a);
    }

    public String toString() {
        return f(this.f19150a);
    }

    public static long b(long j10) {
        return j10;
    }
}
