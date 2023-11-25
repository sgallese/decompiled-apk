package p1;

/* compiled from: DepthSortedSet.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final m f20856a;

    /* renamed from: b  reason: collision with root package name */
    private final m f20857b;

    public n(boolean z10) {
        this.f20856a = new m(z10);
        this.f20857b = new m(z10);
    }

    public final void c(j0 j0Var, boolean z10) {
        qc.q.i(j0Var, "node");
        if (z10) {
            this.f20856a.a(j0Var);
        } else if (!this.f20856a.b(j0Var)) {
            this.f20857b.a(j0Var);
        }
    }

    public final boolean d(j0 j0Var) {
        qc.q.i(j0Var, "node");
        if (!this.f20856a.b(j0Var) && !this.f20857b.b(j0Var)) {
            return false;
        }
        return true;
    }

    public final boolean e(j0 j0Var, boolean z10) {
        qc.q.i(j0Var, "node");
        boolean b10 = this.f20856a.b(j0Var);
        if (!z10) {
            if (!b10 && !this.f20857b.b(j0Var)) {
                return false;
            }
            return true;
        }
        return b10;
    }

    public final boolean f() {
        if (this.f20857b.d() && this.f20856a.d()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return !f();
    }

    public final boolean h(j0 j0Var) {
        qc.q.i(j0Var, "node");
        boolean f10 = this.f20856a.f(j0Var);
        if (!this.f20857b.f(j0Var) && !f10) {
            return false;
        }
        return true;
    }

    public final boolean i(j0 j0Var, boolean z10) {
        qc.q.i(j0Var, "node");
        if (z10) {
            return this.f20856a.f(j0Var);
        }
        return this.f20857b.f(j0Var);
    }
}
