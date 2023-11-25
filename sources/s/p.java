package s;

/* compiled from: AnimationVectors.kt */
/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a  reason: collision with root package name */
    private float f22816a;

    /* renamed from: b  reason: collision with root package name */
    private float f22817b;

    /* renamed from: c  reason: collision with root package name */
    private float f22818c;

    /* renamed from: d  reason: collision with root package name */
    private float f22819d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22820e;

    public p(float f10, float f11, float f12, float f13) {
        super(null);
        this.f22816a = f10;
        this.f22817b = f11;
        this.f22818c = f12;
        this.f22819d = f13;
        this.f22820e = 4;
    }

    @Override // s.q
    public float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return 0.0f;
                    }
                    return this.f22819d;
                }
                return this.f22818c;
            }
            return this.f22817b;
        }
        return this.f22816a;
    }

    @Override // s.q
    public int b() {
        return this.f22820e;
    }

    @Override // s.q
    public void d() {
        this.f22816a = 0.0f;
        this.f22817b = 0.0f;
        this.f22818c = 0.0f;
        this.f22819d = 0.0f;
    }

    @Override // s.q
    public void e(int i10, float f10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.f22819d = f10;
                        return;
                    }
                    return;
                }
                this.f22818c = f10;
                return;
            }
            this.f22817b = f10;
            return;
        }
        this.f22816a = f10;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.f22816a == this.f22816a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (pVar.f22817b == this.f22817b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (pVar.f22818c == this.f22818c) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        if (pVar.f22819d == this.f22819d) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        return true;
    }

    public final float f() {
        return this.f22816a;
    }

    public final float g() {
        return this.f22817b;
    }

    public final float h() {
        return this.f22818c;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f22816a) * 31) + Float.floatToIntBits(this.f22817b)) * 31) + Float.floatToIntBits(this.f22818c)) * 31) + Float.floatToIntBits(this.f22819d);
    }

    public final float i() {
        return this.f22819d;
    }

    @Override // s.q
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public p c() {
        return new p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f22816a + ", v2 = " + this.f22817b + ", v3 = " + this.f22818c + ", v4 = " + this.f22819d;
    }
}
