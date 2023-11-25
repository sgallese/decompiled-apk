package s;

/* compiled from: Easing.kt */
/* loaded from: classes.dex */
public final class w implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f22852a;

    /* renamed from: b  reason: collision with root package name */
    private final float f22853b;

    /* renamed from: c  reason: collision with root package name */
    private final float f22854c;

    /* renamed from: d  reason: collision with root package name */
    private final float f22855d;

    public w(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f22852a = f10;
        this.f22853b = f11;
        this.f22854c = f12;
        this.f22855d = f13;
        if (!Float.isNaN(f10) && !Float.isNaN(f11) && !Float.isNaN(f12) && !Float.isNaN(f13)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.').toString());
    }

    private final float b(float f10, float f11, float f12) {
        float f13 = 3;
        float f14 = 1 - f12;
        return (f10 * f13 * f14 * f14 * f12) + (f13 * f11 * f14 * f12 * f12) + (f12 * f12 * f12);
    }

    @Override // s.c0
    public float a(float f10) {
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            float f12 = 1.0f;
            if (f10 < 1.0f) {
                while (true) {
                    float f13 = (f11 + f12) / 2;
                    float b10 = b(this.f22852a, this.f22854c, f13);
                    if (Math.abs(f10 - b10) < 0.001f) {
                        return b(this.f22853b, this.f22855d, f13);
                    }
                    if (b10 < f10) {
                        f11 = f13;
                    } else {
                        f12 = f13;
                    }
                }
            }
        }
        return f10;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f22852a == wVar.f22852a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f22853b == wVar.f22853b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (this.f22854c == wVar.f22854c) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        if (this.f22855d == wVar.f22855d) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f22852a) * 31) + Float.floatToIntBits(this.f22853b)) * 31) + Float.floatToIntBits(this.f22854c)) * 31) + Float.floatToIntBits(this.f22855d);
    }
}
