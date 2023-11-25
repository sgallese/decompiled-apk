package b1;

/* compiled from: WhitePoint.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final float f7734a;

    /* renamed from: b  reason: collision with root package name */
    private final float f7735b;

    public y(float f10, float f11) {
        this.f7734a = f10;
        this.f7735b = f11;
    }

    public final float a() {
        return this.f7734a;
    }

    public final float b() {
        return this.f7735b;
    }

    public final float[] c() {
        float f10 = this.f7734a;
        float f11 = this.f7735b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (Float.compare(this.f7734a, yVar.f7734a) == 0 && Float.compare(this.f7735b, yVar.f7735b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f7734a) * 31) + Float.floatToIntBits(this.f7735b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f7734a + ", y=" + this.f7735b + ')';
    }

    public y(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private y(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }
}
