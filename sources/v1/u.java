package v1;

/* compiled from: Placeholder.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final long f24504a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24505b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24506c;

    public final long a() {
        return this.f24505b;
    }

    public final int b() {
        return this.f24506c;
    }

    public final long c() {
        return this.f24504a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (j2.s.e(this.f24504a, uVar.f24504a) && j2.s.e(this.f24505b, uVar.f24505b) && v.i(this.f24506c, uVar.f24506c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((j2.s.i(this.f24504a) * 31) + j2.s.i(this.f24505b)) * 31) + v.j(this.f24506c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) j2.s.j(this.f24504a)) + ", height=" + ((Object) j2.s.j(this.f24505b)) + ", placeholderVerticalAlign=" + ((Object) v.k(this.f24506c)) + ')';
    }
}
