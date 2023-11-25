package dc;

/* compiled from: ULong.kt */
/* loaded from: classes4.dex */
public final class t implements Comparable<t> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f13267m = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final long f13268f;

    /* compiled from: ULong.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    private /* synthetic */ t(long j10) {
        this.f13268f = j10;
    }

    public static final /* synthetic */ t b(long j10) {
        return new t(j10);
    }

    public static boolean f(long j10, Object obj) {
        if (!(obj instanceof t) || j10 != ((t) obj).k()) {
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

    public static int i(long j10) {
        return r.x.a(j10);
    }

    public static String j(long j10) {
        return y.c(j10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(t tVar) {
        return y.a(k(), tVar.k());
    }

    public boolean equals(Object obj) {
        return f(this.f13268f, obj);
    }

    public int hashCode() {
        return i(this.f13268f);
    }

    public final /* synthetic */ long k() {
        return this.f13268f;
    }

    public String toString() {
        return j(this.f13268f);
    }

    public static long d(long j10) {
        return j10;
    }
}
