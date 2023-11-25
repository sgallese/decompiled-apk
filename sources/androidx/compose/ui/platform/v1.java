package androidx.compose.ui.platform;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
final class v1 implements w1<Float> {

    /* renamed from: a  reason: collision with root package name */
    private final float f2855a;

    /* renamed from: b  reason: collision with root package name */
    private final float f2856b;

    public v1(float f10, float f11) {
        this.f2855a = f10;
        this.f2856b = f11;
    }

    @Override // androidx.compose.ui.platform.w1
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public Float b() {
        return Float.valueOf(this.f2856b);
    }

    @Override // androidx.compose.ui.platform.w1
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Float a() {
        return Float.valueOf(this.f2855a);
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (!(obj instanceof v1)) {
            return false;
        }
        if (!isEmpty() || !((v1) obj).isEmpty()) {
            v1 v1Var = (v1) obj;
            if (this.f2855a == v1Var.f2855a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            if (this.f2856b == v1Var.f2856b) {
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
        return (Float.floatToIntBits(this.f2855a) * 31) + Float.floatToIntBits(this.f2856b);
    }

    @Override // androidx.compose.ui.platform.w1
    public boolean isEmpty() {
        if (this.f2855a >= this.f2856b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f2855a + "..<" + this.f2856b;
    }
}
