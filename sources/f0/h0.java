package f0;

/* compiled from: Scaffold.kt */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14764b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f14765c = c(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f14766d = c(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f14767a;

    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return h0.f14766d;
        }
    }

    private /* synthetic */ h0(int i10) {
        this.f14767a = i10;
    }

    public static final /* synthetic */ h0 b(int i10) {
        return new h0(i10);
    }

    public static boolean d(int i10, Object obj) {
        if (!(obj instanceof h0) || i10 != ((h0) obj).h()) {
            return false;
        }
        return true;
    }

    public static final boolean e(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String g(int i10) {
        if (e(i10, f14765c)) {
            return "FabPosition.Center";
        }
        return "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return d(this.f14767a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f14767a;
    }

    public int hashCode() {
        return f(this.f14767a);
    }

    public String toString() {
        return g(this.f14767a);
    }

    public static int c(int i10) {
        return i10;
    }

    public static int f(int i10) {
        return i10;
    }
}
