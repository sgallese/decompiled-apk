package ec;

/* compiled from: IndexedValue.kt */
/* loaded from: classes4.dex */
public final class g0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f14176a;

    /* renamed from: b  reason: collision with root package name */
    private final T f14177b;

    public g0(int i10, T t10) {
        this.f14176a = i10;
        this.f14177b = t10;
    }

    public final int a() {
        return this.f14176a;
    }

    public final T b() {
        return this.f14177b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f14176a == g0Var.f14176a && qc.q.d(this.f14177b, g0Var.f14177b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i10 = this.f14176a * 31;
        T t10 = this.f14177b;
        if (t10 == null) {
            hashCode = 0;
        } else {
            hashCode = t10.hashCode();
        }
        return i10 + hashCode;
    }

    public String toString() {
        return "IndexedValue(index=" + this.f14176a + ", value=" + this.f14177b + ')';
    }
}
