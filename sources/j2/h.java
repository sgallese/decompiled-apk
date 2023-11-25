package j2;

/* compiled from: Dp.kt */
/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f18979m = new a(null);

    /* renamed from: p  reason: collision with root package name */
    private static final float f18980p = j(0.0f);

    /* renamed from: q  reason: collision with root package name */
    private static final float f18981q = j(Float.POSITIVE_INFINITY);

    /* renamed from: r  reason: collision with root package name */
    private static final float f18982r = j(Float.NaN);

    /* renamed from: f  reason: collision with root package name */
    private final float f18983f;

    /* compiled from: Dp.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final float a() {
            return h.f18980p;
        }

        public final float b() {
            return h.f18982r;
        }
    }

    private /* synthetic */ h(float f10) {
        this.f18983f = f10;
    }

    public static final /* synthetic */ h f(float f10) {
        return new h(f10);
    }

    public static int i(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static boolean k(float f10, Object obj) {
        if (!(obj instanceof h) || Float.compare(f10, ((h) obj).o()) != 0) {
            return false;
        }
        return true;
    }

    public static final boolean l(float f10, float f11) {
        if (Float.compare(f10, f11) == 0) {
            return true;
        }
        return false;
    }

    public static int m(float f10) {
        return Float.floatToIntBits(f10);
    }

    public static String n(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return g(hVar.o());
    }

    public boolean equals(Object obj) {
        return k(this.f18983f, obj);
    }

    public int g(float f10) {
        return i(this.f18983f, f10);
    }

    public int hashCode() {
        return m(this.f18983f);
    }

    public final /* synthetic */ float o() {
        return this.f18983f;
    }

    public String toString() {
        return n(this.f18983f);
    }

    public static float j(float f10) {
        return f10;
    }
}
