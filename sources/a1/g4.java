package a1;

/* compiled from: PathFillType.kt */
/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f102b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f103c = d(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f104d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f105a;

    /* compiled from: PathFillType.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return g4.f104d;
        }

        public final int b() {
            return g4.f103c;
        }
    }

    private /* synthetic */ g4(int i10) {
        this.f105a = i10;
    }

    public static final /* synthetic */ g4 c(int i10) {
        return new g4(i10);
    }

    public static boolean e(int i10, Object obj) {
        if (!(obj instanceof g4) || i10 != ((g4) obj).i()) {
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
        if (f(i10, f103c)) {
            return "NonZero";
        }
        if (f(i10, f104d)) {
            return "EvenOdd";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f105a, obj);
    }

    public int hashCode() {
        return g(this.f105a);
    }

    public final /* synthetic */ int i() {
        return this.f105a;
    }

    public String toString() {
        return h(this.f105a);
    }

    public static int d(int i10) {
        return i10;
    }

    public static int g(int i10) {
        return i10;
    }
}
