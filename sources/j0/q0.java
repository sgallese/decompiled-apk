package j0;

/* compiled from: JoinedKey.kt */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f18863a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f18864b;

    public q0(Object obj, Object obj2) {
        this.f18863a = obj;
        this.f18864b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (qc.q.d(this.f18863a, q0Var.f18863a) && qc.q.d(this.f18864b, q0Var.f18864b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a(this.f18863a) * 31) + a(this.f18864b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f18863a + ", right=" + this.f18864b + ')';
    }
}
