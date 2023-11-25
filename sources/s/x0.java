package s;

/* compiled from: SpringSimulation.kt */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private float f22870a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22872c;

    /* renamed from: d  reason: collision with root package name */
    private double f22873d;

    /* renamed from: e  reason: collision with root package name */
    private double f22874e;

    /* renamed from: f  reason: collision with root package name */
    private double f22875f;

    /* renamed from: b  reason: collision with root package name */
    private double f22871b = Math.sqrt(50.0d);

    /* renamed from: g  reason: collision with root package name */
    private float f22876g = 1.0f;

    public x0(float f10) {
        this.f22870a = f10;
    }

    private final void c() {
        boolean z10;
        if (this.f22872c) {
            return;
        }
        if (this.f22870a == y0.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            float f10 = this.f22876g;
            double d10 = f10 * f10;
            if (f10 > 1.0f) {
                double d11 = this.f22871b;
                double d12 = d10 - 1;
                this.f22873d = ((-f10) * d11) + (d11 * Math.sqrt(d12));
                double d13 = -this.f22876g;
                double d14 = this.f22871b;
                this.f22874e = (d13 * d14) - (d14 * Math.sqrt(d12));
            } else if (f10 >= 0.0f && f10 < 1.0f) {
                this.f22875f = this.f22871b * Math.sqrt(1 - d10);
            }
            this.f22872c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public final float a() {
        return this.f22876g;
    }

    public final float b() {
        double d10 = this.f22871b;
        return (float) (d10 * d10);
    }

    public final void d(float f10) {
        if (f10 >= 0.0f) {
            this.f22876g = f10;
            this.f22872c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void e(float f10) {
        this.f22870a = f10;
    }

    public final void f(float f10) {
        if (b() > 0.0f) {
            this.f22871b = Math.sqrt(f10);
            this.f22872c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final long g(float f10, float f11, long j10) {
        boolean z10;
        double cos;
        double d10;
        c();
        float f12 = f10 - this.f22870a;
        double d11 = j10 / 1000.0d;
        float f13 = this.f22876g;
        if (f13 > 1.0f) {
            double d12 = f12;
            double d13 = this.f22874e;
            double d14 = f11;
            double d15 = this.f22873d;
            double d16 = d12 - (((d13 * d12) - d14) / (d13 - d15));
            double d17 = ((d12 * d13) - d14) / (d13 - d15);
            d10 = (Math.exp(d13 * d11) * d16) + (Math.exp(this.f22873d * d11) * d17);
            double d18 = this.f22874e;
            double exp = d16 * d18 * Math.exp(d18 * d11);
            double d19 = this.f22873d;
            cos = exp + (d17 * d19 * Math.exp(d19 * d11));
        } else {
            if (f13 == 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                double d20 = this.f22871b;
                double d21 = f12;
                double d22 = f11 + (d20 * d21);
                double d23 = d21 + (d22 * d11);
                double exp2 = Math.exp((-d20) * d11) * d23;
                double exp3 = d23 * Math.exp((-this.f22871b) * d11);
                double d24 = this.f22871b;
                cos = (exp3 * (-d24)) + (d22 * Math.exp((-d24) * d11));
                d10 = exp2;
            } else {
                double d25 = 1 / this.f22875f;
                double d26 = this.f22871b;
                double d27 = f12;
                double d28 = d25 * ((f13 * d26 * d27) + f11);
                double exp4 = Math.exp((-f13) * d26 * d11) * ((Math.cos(this.f22875f * d11) * d27) + (Math.sin(this.f22875f * d11) * d28));
                double d29 = this.f22871b;
                double d30 = (-d29) * exp4 * this.f22876g;
                double exp5 = Math.exp((-r5) * d29 * d11);
                double d31 = this.f22875f;
                double sin = (-d31) * d27 * Math.sin(d31 * d11);
                double d32 = this.f22875f;
                cos = d30 + (exp5 * (sin + (d28 * d32 * Math.cos(d32 * d11))));
                d10 = exp4;
            }
        }
        return y0.a((float) (d10 + this.f22870a), (float) cos);
    }
}
