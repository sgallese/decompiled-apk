package s;

/* compiled from: AnimationVectors.kt */
/* loaded from: classes.dex */
public final class o extends q {

    /* renamed from: a  reason: collision with root package name */
    private float f22807a;

    /* renamed from: b  reason: collision with root package name */
    private float f22808b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22809c;

    public o(float f10, float f11) {
        super(null);
        this.f22807a = f10;
        this.f22808b = f11;
        this.f22809c = 2;
    }

    @Override // s.q
    public float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return 0.0f;
            }
            return this.f22808b;
        }
        return this.f22807a;
    }

    @Override // s.q
    public int b() {
        return this.f22809c;
    }

    @Override // s.q
    public void d() {
        this.f22807a = 0.0f;
        this.f22808b = 0.0f;
    }

    @Override // s.q
    public void e(int i10, float f10) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f22808b = f10;
                return;
            }
            return;
        }
        this.f22807a = f10;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (oVar.f22807a == this.f22807a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (oVar.f22808b == this.f22808b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    public final float f() {
        return this.f22807a;
    }

    public final float g() {
        return this.f22808b;
    }

    @Override // s.q
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public o c() {
        return new o(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f22807a) * 31) + Float.floatToIntBits(this.f22808b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f22807a + ", v2 = " + this.f22808b;
    }
}
