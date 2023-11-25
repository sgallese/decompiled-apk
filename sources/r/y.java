package r;

/* compiled from: FlingCalculator.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final float f22047a;

    /* renamed from: b  reason: collision with root package name */
    private final j2.e f22048b;

    /* renamed from: c  reason: collision with root package name */
    private final float f22049c;

    /* compiled from: FlingCalculator.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final float f22050a;

        /* renamed from: b  reason: collision with root package name */
        private final float f22051b;

        /* renamed from: c  reason: collision with root package name */
        private final long f22052c;

        public a(float f10, float f11, long j10) {
            this.f22050a = f10;
            this.f22051b = f11;
            this.f22052c = j10;
        }

        public final float a(long j10) {
            float f10;
            long j11 = this.f22052c;
            if (j11 > 0) {
                f10 = ((float) j10) / ((float) j11);
            } else {
                f10 = 1.0f;
            }
            return this.f22051b * Math.signum(this.f22050a) * r.a.f21796a.b(f10).a();
        }

        public final float b(long j10) {
            float f10;
            long j11 = this.f22052c;
            if (j11 > 0) {
                f10 = ((float) j10) / ((float) j11);
            } else {
                f10 = 1.0f;
            }
            return (((r.a.f21796a.b(f10).b() * Math.signum(this.f22050a)) * this.f22051b) / ((float) this.f22052c)) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.f22050a, aVar.f22050a) == 0 && Float.compare(this.f22051b, aVar.f22051b) == 0 && this.f22052c == aVar.f22052c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.f22050a) * 31) + Float.floatToIntBits(this.f22051b)) * 31) + x.a(this.f22052c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f22050a + ", distance=" + this.f22051b + ", duration=" + this.f22052c + ')';
        }
    }

    public y(float f10, j2.e eVar) {
        qc.q.i(eVar, "density");
        this.f22047a = f10;
        this.f22048b = eVar;
        this.f22049c = a(eVar);
    }

    private final float a(j2.e eVar) {
        float c10;
        c10 = z.c(0.84f, eVar.getDensity());
        return c10;
    }

    private final double e(float f10) {
        return r.a.f21796a.a(f10, this.f22047a * this.f22049c);
    }

    public final float b(float f10) {
        float f11;
        float f12;
        double e10 = e(f10);
        f11 = z.f22053a;
        double d10 = f11 - 1.0d;
        double d11 = this.f22047a * this.f22049c;
        f12 = z.f22053a;
        return (float) (d11 * Math.exp((f12 / d10) * e10));
    }

    public final long c(float f10) {
        float f11;
        double e10 = e(f10);
        f11 = z.f22053a;
        return (long) (Math.exp(e10 / (f11 - 1.0d)) * 1000.0d);
    }

    public final a d(float f10) {
        float f11;
        float f12;
        double e10 = e(f10);
        f11 = z.f22053a;
        double d10 = f11 - 1.0d;
        double d11 = this.f22047a * this.f22049c;
        f12 = z.f22053a;
        return new a(f10, (float) (d11 * Math.exp((f12 / d10) * e10)), (long) (Math.exp(e10 / d10) * 1000.0d));
    }
}
