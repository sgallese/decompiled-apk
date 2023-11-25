package r;

/* compiled from: SplineBasedDecay.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21796a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f21797b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f21798c;

    /* compiled from: SplineBasedDecay.kt */
    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0484a {

        /* renamed from: a  reason: collision with root package name */
        private final float f21799a;

        /* renamed from: b  reason: collision with root package name */
        private final float f21800b;

        public C0484a(float f10, float f11) {
            this.f21799a = f10;
            this.f21800b = f11;
        }

        public final float a() {
            return this.f21799a;
        }

        public final float b() {
            return this.f21800b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0484a)) {
                return false;
            }
            C0484a c0484a = (C0484a) obj;
            if (Float.compare(this.f21799a, c0484a.f21799a) == 0 && Float.compare(this.f21800b, c0484a.f21800b) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f21799a) * 31) + Float.floatToIntBits(this.f21800b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f21799a + ", velocityCoefficient=" + this.f21800b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f21797b = fArr;
        float[] fArr2 = new float[101];
        f21798c = fArr2;
        i0.b(fArr, fArr2, 100);
    }

    private a() {
    }

    public final double a(float f10, float f11) {
        return Math.log((Math.abs(f10) * 0.35f) / f11);
    }

    public final C0484a b(float f10) {
        float f11;
        float f12;
        float f13 = 100;
        int i10 = (int) (f13 * f10);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f21797b;
            float f16 = fArr[i10];
            f12 = (fArr[i11] - f16) / (f15 - f14);
            f11 = f16 + ((f10 - f14) * f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        return new C0484a(f11, f12);
    }
}
