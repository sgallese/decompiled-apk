package g2;

/* compiled from: BaselineShift.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0379a f16011b = new C0379a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f16012c = c(0.5f);

    /* renamed from: d  reason: collision with root package name */
    private static final float f16013d = c(-0.5f);

    /* renamed from: e  reason: collision with root package name */
    private static final float f16014e = c(0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f16015a;

    /* compiled from: BaselineShift.kt */
    /* renamed from: g2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0379a {
        private C0379a() {
        }

        public /* synthetic */ C0379a(qc.h hVar) {
            this();
        }

        public final float a() {
            return a.f16014e;
        }
    }

    private /* synthetic */ a(float f10) {
        this.f16015a = f10;
    }

    public static final /* synthetic */ a b(float f10) {
        return new a(f10);
    }

    public static boolean d(float f10, Object obj) {
        if (!(obj instanceof a) || Float.compare(f10, ((a) obj).h()) != 0) {
            return false;
        }
        return true;
    }

    public static final boolean e(float f10, float f11) {
        if (Float.compare(f10, f11) == 0) {
            return true;
        }
        return false;
    }

    public static int f(float f10) {
        return Float.floatToIntBits(f10);
    }

    public static String g(float f10) {
        return "BaselineShift(multiplier=" + f10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f16015a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f16015a;
    }

    public int hashCode() {
        return f(this.f16015a);
    }

    public String toString() {
        return g(this.f16015a);
    }

    public static float c(float f10) {
        return f10;
    }
}
