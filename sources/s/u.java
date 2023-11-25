package s;

/* compiled from: ComplexDouble.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private double f22829a;

    /* renamed from: b  reason: collision with root package name */
    private double f22830b;

    public u(double d10, double d11) {
        this.f22829a = d10;
        this.f22830b = d11;
    }

    public final double e() {
        return this.f22830b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (Double.compare(this.f22829a, uVar.f22829a) == 0 && Double.compare(this.f22830b, uVar.f22830b) == 0) {
            return true;
        }
        return false;
    }

    public final double f() {
        return this.f22829a;
    }

    public int hashCode() {
        return (t.a(this.f22829a) * 31) + t.a(this.f22830b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f22829a + ", _imaginary=" + this.f22830b + ')';
    }
}
