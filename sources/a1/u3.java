package a1;

/* compiled from: ImageBitmap.kt */
/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f198b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f199c = g(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f200d = g(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f201e = g(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f202f = g(3);

    /* renamed from: g  reason: collision with root package name */
    private static final int f203g = g(4);

    /* renamed from: a  reason: collision with root package name */
    private final int f204a;

    /* compiled from: ImageBitmap.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a() {
            return u3.f200d;
        }

        public final int b() {
            return u3.f199c;
        }

        public final int c() {
            return u3.f202f;
        }

        public final int d() {
            return u3.f203g;
        }

        public final int e() {
            return u3.f201e;
        }
    }

    private /* synthetic */ u3(int i10) {
        this.f204a = i10;
    }

    public static final /* synthetic */ u3 f(int i10) {
        return new u3(i10);
    }

    public static boolean h(int i10, Object obj) {
        if (!(obj instanceof u3) || i10 != ((u3) obj).l()) {
            return false;
        }
        return true;
    }

    public static final boolean i(int i10, int i11) {
        if (i10 == i11) {
            return true;
        }
        return false;
    }

    public static String k(int i10) {
        if (i(i10, f199c)) {
            return "Argb8888";
        }
        if (i(i10, f200d)) {
            return "Alpha8";
        }
        if (i(i10, f201e)) {
            return "Rgb565";
        }
        if (i(i10, f202f)) {
            return "F16";
        }
        if (i(i10, f203g)) {
            return "Gpu";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f204a, obj);
    }

    public int hashCode() {
        return j(this.f204a);
    }

    public final /* synthetic */ int l() {
        return this.f204a;
    }

    public String toString() {
        return k(this.f204a);
    }

    public static int g(int i10) {
        return i10;
    }

    public static int j(int i10) {
        return i10;
    }
}
