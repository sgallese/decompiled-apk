package t1;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f23416b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f23417c = d(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f23418d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f23419a;

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return g.f23418d;
        }

        public final int b() {
            return g.f23417c;
        }
    }

    private /* synthetic */ g(int i10) {
        this.f23419a = i10;
    }

    public static final /* synthetic */ g c(int i10) {
        return new g(i10);
    }

    public static boolean e(int i10, Object obj) {
        if (!(obj instanceof g) || i10 != ((g) obj).i()) {
            return false;
        }
        return true;
    }

    public static final boolean f(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String h(int i10) {
        if (f(i10, f23417c)) {
            return "Polite";
        }
        if (f(i10, f23418d)) {
            return "Assertive";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f23419a, obj);
    }

    public int hashCode() {
        return g(this.f23419a);
    }

    public final /* synthetic */ int i() {
        return this.f23419a;
    }

    public String toString() {
        return h(this.f23419a);
    }

    private static int d(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
