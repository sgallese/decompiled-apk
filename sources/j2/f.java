package j2;

/* compiled from: Density.kt */
/* loaded from: classes.dex */
final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    private final float f18977f;

    /* renamed from: m  reason: collision with root package name */
    private final float f18978m;

    public f(float f10, float f11) {
        this.f18977f = f10;
        this.f18978m = f11;
    }

    @Override // j2.e
    public /* synthetic */ long K(long j10) {
        return d.e(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ int K0(float f10) {
        return d.a(this, f10);
    }

    @Override // j2.e
    public /* synthetic */ long S0(long j10) {
        return d.h(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float T(long j10) {
        return d.b(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float W0(long j10) {
        return d.f(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ long c0(float f10) {
        return d.i(this, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Float.compare(this.f18977f, fVar.f18977f) == 0 && Float.compare(this.f18978m, fVar.f18978m) == 0) {
            return true;
        }
        return false;
    }

    @Override // j2.e
    public float getDensity() {
        return this.f18977f;
    }

    @Override // j2.e
    public /* synthetic */ float h0(int i10) {
        return d.d(this, i10);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f18977f) * 31) + Float.floatToIntBits(this.f18978m);
    }

    @Override // j2.e
    public /* synthetic */ float j0(float f10) {
        return d.c(this, f10);
    }

    @Override // j2.e
    public float p0() {
        return this.f18978m;
    }

    public String toString() {
        return "DensityImpl(density=" + this.f18977f + ", fontScale=" + this.f18978m + ')';
    }

    @Override // j2.e
    public /* synthetic */ float v0(float f10) {
        return d.g(this, f10);
    }
}
