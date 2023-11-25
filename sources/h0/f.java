package h0;

/* compiled from: RippleTheme.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final float f16358a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16359b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16360c;

    /* renamed from: d  reason: collision with root package name */
    private final float f16361d;

    public f(float f10, float f11, float f12, float f13) {
        this.f16358a = f10;
        this.f16359b = f11;
        this.f16360c = f12;
        this.f16361d = f13;
    }

    public final float a() {
        return this.f16358a;
    }

    public final float b() {
        return this.f16359b;
    }

    public final float c() {
        return this.f16360c;
    }

    public final float d() {
        return this.f16361d;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f16358a == fVar.f16358a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f16359b == fVar.f16359b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (this.f16360c == fVar.f16360c) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        if (this.f16361d == fVar.f16361d) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f16358a) * 31) + Float.floatToIntBits(this.f16359b)) * 31) + Float.floatToIntBits(this.f16360c)) * 31) + Float.floatToIntBits(this.f16361d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f16358a + ", focusedAlpha=" + this.f16359b + ", hoveredAlpha=" + this.f16360c + ", pressedAlpha=" + this.f16361d + ')';
    }
}
