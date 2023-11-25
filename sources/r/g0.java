package r;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<j2.p, j2.l> f21887a;

    /* renamed from: b  reason: collision with root package name */
    private final s.e0<j2.l> f21888b;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(pc.l<? super j2.p, j2.l> lVar, s.e0<j2.l> e0Var) {
        qc.q.i(lVar, "slideOffset");
        qc.q.i(e0Var, "animationSpec");
        this.f21887a = lVar;
        this.f21888b = e0Var;
    }

    public final s.e0<j2.l> a() {
        return this.f21888b;
    }

    public final pc.l<j2.p, j2.l> b() {
        return this.f21887a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (qc.q.d(this.f21887a, g0Var.f21887a) && qc.q.d(this.f21888b, g0Var.f21888b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f21887a.hashCode() * 31) + this.f21888b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f21887a + ", animationSpec=" + this.f21888b + ')';
    }
}
