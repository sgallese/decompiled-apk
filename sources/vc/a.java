package vc;

/* compiled from: Ranges.kt */
/* loaded from: classes4.dex */
final class a implements b<Float> {

    /* renamed from: f  reason: collision with root package name */
    private final float f25113f;

    /* renamed from: m  reason: collision with root package name */
    private final float f25114m;

    public a(float f10, float f11) {
        this.f25113f = f10;
        this.f25114m = f11;
    }

    @Override // vc.c
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public Float f() {
        return Float.valueOf(this.f25114m);
    }

    @Override // vc.c
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public Float a() {
        return Float.valueOf(this.f25113f);
    }

    public boolean d(float f10, float f11) {
        if (f10 <= f11) {
            return true;
        }
        return false;
    }

    @Override // vc.b
    public /* bridge */ /* synthetic */ boolean e(Float f10, Float f11) {
        return d(f10.floatValue(), f11.floatValue());
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (!(obj instanceof a)) {
            return false;
        }
        if (!isEmpty() || !((a) obj).isEmpty()) {
            a aVar = (a) obj;
            if (this.f25113f == aVar.f25113f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            if (this.f25114m == aVar.f25114m) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f25113f) * 31) + Float.floatToIntBits(this.f25114m);
    }

    @Override // vc.b, vc.c
    public boolean isEmpty() {
        if (this.f25113f > this.f25114m) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f25113f + ".." + this.f25114m;
    }
}
