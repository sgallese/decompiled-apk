package s;

/* compiled from: AnimationVectors.kt */
/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: a  reason: collision with root package name */
    private float f22795a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22796b;

    public n(float f10) {
        super(null);
        this.f22795a = f10;
        this.f22796b = 1;
    }

    @Override // s.q
    public float a(int i10) {
        if (i10 == 0) {
            return this.f22795a;
        }
        return 0.0f;
    }

    @Override // s.q
    public int b() {
        return this.f22796b;
    }

    @Override // s.q
    public void d() {
        this.f22795a = 0.0f;
    }

    @Override // s.q
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f22795a = f10;
        }
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof n)) {
            return false;
        }
        if (((n) obj).f22795a == this.f22795a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public final float f() {
        return this.f22795a;
    }

    @Override // s.q
    /* renamed from: g  reason: merged with bridge method [inline-methods] */
    public n c() {
        return new n(0.0f);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f22795a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f22795a;
    }
}
