package s;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class z0<T> implements e0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final float f22886a;

    /* renamed from: b  reason: collision with root package name */
    private final float f22887b;

    /* renamed from: c  reason: collision with root package name */
    private final T f22888c;

    public z0() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (z0Var.f22886a == this.f22886a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (z0Var.f22887b == this.f22887b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || !qc.q.d(z0Var.f22888c, this.f22888c)) {
            return false;
        }
        return true;
    }

    public final float f() {
        return this.f22886a;
    }

    public final float g() {
        return this.f22887b;
    }

    public final T h() {
        return this.f22888c;
    }

    public int hashCode() {
        int i10;
        T t10 = this.f22888c;
        if (t10 != null) {
            i10 = t10.hashCode();
        } else {
            i10 = 0;
        }
        return (((i10 * 31) + Float.floatToIntBits(this.f22886a)) * 31) + Float.floatToIntBits(this.f22887b);
    }

    @Override // s.j
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public <V extends q> x1<V> a(i1<T, V> i1Var) {
        q b10;
        qc.q.i(i1Var, "converter");
        float f10 = this.f22886a;
        float f11 = this.f22887b;
        b10 = k.b(i1Var, this.f22888c);
        return new x1<>(f10, f11, b10);
    }

    public z0(float f10, float f11, T t10) {
        this.f22886a = f10;
        this.f22887b = f11;
        this.f22888c = t10;
    }

    public /* synthetic */ z0(float f10, float f11, Object obj, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
