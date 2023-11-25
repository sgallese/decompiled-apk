package b3;

import b3.b;

/* compiled from: SpringForce.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    double f7913a;

    /* renamed from: b  reason: collision with root package name */
    double f7914b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7915c;

    /* renamed from: d  reason: collision with root package name */
    private double f7916d;

    /* renamed from: e  reason: collision with root package name */
    private double f7917e;

    /* renamed from: f  reason: collision with root package name */
    private double f7918f;

    /* renamed from: g  reason: collision with root package name */
    private double f7919g;

    /* renamed from: h  reason: collision with root package name */
    private double f7920h;

    /* renamed from: i  reason: collision with root package name */
    private double f7921i;

    /* renamed from: j  reason: collision with root package name */
    private final b.o f7922j;

    public e() {
        this.f7913a = Math.sqrt(1500.0d);
        this.f7914b = 0.5d;
        this.f7915c = false;
        this.f7921i = Double.MAX_VALUE;
        this.f7922j = new b.o();
    }

    private void b() {
        if (this.f7915c) {
            return;
        }
        if (this.f7921i != Double.MAX_VALUE) {
            double d10 = this.f7914b;
            if (d10 > 1.0d) {
                double d11 = this.f7913a;
                this.f7918f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
                double d12 = this.f7914b;
                double d13 = this.f7913a;
                this.f7919g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
            } else if (d10 >= 0.0d && d10 < 1.0d) {
                this.f7920h = this.f7913a * Math.sqrt(1.0d - (d10 * d10));
            }
            this.f7915c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public float a() {
        return (float) this.f7921i;
    }

    public boolean c(float f10, float f11) {
        if (Math.abs(f11) < this.f7917e && Math.abs(f10 - a()) < this.f7916d) {
            return true;
        }
        return false;
    }

    public e d(float f10) {
        if (f10 >= 0.0f) {
            this.f7914b = f10;
            this.f7915c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public e e(float f10) {
        this.f7921i = f10;
        return this;
    }

    public e f(float f10) {
        if (f10 > 0.0f) {
            this.f7913a = Math.sqrt(f10);
            this.f7915c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(double d10) {
        double abs = Math.abs(d10);
        this.f7916d = abs;
        this.f7917e = abs * 62.5d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b.o h(double d10, double d11, long j10) {
        double cos;
        double d12;
        b();
        double d13 = j10 / 1000.0d;
        double d14 = d10 - this.f7921i;
        double d15 = this.f7914b;
        if (d15 > 1.0d) {
            double d16 = this.f7919g;
            double d17 = this.f7918f;
            double d18 = d14 - (((d16 * d14) - d11) / (d16 - d17));
            double d19 = ((d14 * d16) - d11) / (d16 - d17);
            d12 = (Math.pow(2.718281828459045d, d16 * d13) * d18) + (Math.pow(2.718281828459045d, this.f7918f * d13) * d19);
            double d20 = this.f7919g;
            double pow = d18 * d20 * Math.pow(2.718281828459045d, d20 * d13);
            double d21 = this.f7918f;
            cos = pow + (d19 * d21 * Math.pow(2.718281828459045d, d21 * d13));
        } else if (d15 == 1.0d) {
            double d22 = this.f7913a;
            double d23 = d11 + (d22 * d14);
            double d24 = d14 + (d23 * d13);
            d12 = Math.pow(2.718281828459045d, (-d22) * d13) * d24;
            double pow2 = d24 * Math.pow(2.718281828459045d, (-this.f7913a) * d13);
            double d25 = this.f7913a;
            cos = (d23 * Math.pow(2.718281828459045d, (-d25) * d13)) + (pow2 * (-d25));
        } else {
            double d26 = 1.0d / this.f7920h;
            double d27 = this.f7913a;
            double d28 = d26 * ((d15 * d27 * d14) + d11);
            double pow3 = Math.pow(2.718281828459045d, (-d15) * d27 * d13) * ((Math.cos(this.f7920h * d13) * d14) + (Math.sin(this.f7920h * d13) * d28));
            double d29 = this.f7913a;
            double d30 = this.f7914b;
            double d31 = (-d29) * pow3 * d30;
            double pow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d13);
            double d32 = this.f7920h;
            double sin = (-d32) * d14 * Math.sin(d32 * d13);
            double d33 = this.f7920h;
            cos = d31 + (pow4 * (sin + (d28 * d33 * Math.cos(d33 * d13))));
            d12 = pow3;
        }
        b.o oVar = this.f7922j;
        oVar.f7910a = (float) (d12 + this.f7921i);
        oVar.f7911b = (float) cos;
        return oVar;
    }

    public e(float f10) {
        this.f7913a = Math.sqrt(1500.0d);
        this.f7914b = 0.5d;
        this.f7915c = false;
        this.f7921i = Double.MAX_VALUE;
        this.f7922j = new b.o();
        this.f7921i = f10;
    }
}
