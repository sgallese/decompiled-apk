package p1;

import j0.d3;

/* compiled from: IntrinsicsPolicy.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: c  reason: collision with root package name */
    private static final a f20990c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final j0 f20991a;

    /* renamed from: b  reason: collision with root package name */
    private final j0.j1 f20992b;

    /* compiled from: IntrinsicsPolicy.kt */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public z(j0 j0Var) {
        j0.j1 e10;
        qc.q.i(j0Var, "layoutNode");
        this.f20991a = j0Var;
        e10 = d3.e(null, null, 2, null);
        this.f20992b = e10;
    }

    private final n1.i0 a() {
        return (n1.i0) this.f20992b.getValue();
    }

    private final n1.i0 f() {
        n1.i0 a10 = a();
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }

    private final void k(n1.i0 i0Var) {
        this.f20992b.setValue(i0Var);
    }

    public final int b(int i10) {
        return f().maxIntrinsicHeight(this.f20991a.j0(), this.f20991a.E(), i10);
    }

    public final int c(int i10) {
        return f().maxIntrinsicWidth(this.f20991a.j0(), this.f20991a.E(), i10);
    }

    public final int d(int i10) {
        return f().maxIntrinsicHeight(this.f20991a.j0(), this.f20991a.D(), i10);
    }

    public final int e(int i10) {
        return f().maxIntrinsicWidth(this.f20991a.j0(), this.f20991a.D(), i10);
    }

    public final int g(int i10) {
        return f().minIntrinsicHeight(this.f20991a.j0(), this.f20991a.E(), i10);
    }

    public final int h(int i10) {
        return f().minIntrinsicWidth(this.f20991a.j0(), this.f20991a.E(), i10);
    }

    public final int i(int i10) {
        return f().minIntrinsicHeight(this.f20991a.j0(), this.f20991a.D(), i10);
    }

    public final int j(int i10) {
        return f().minIntrinsicWidth(this.f20991a.j0(), this.f20991a.D(), i10);
    }

    public final void l(n1.i0 i0Var) {
        qc.q.i(i0Var, "measurePolicy");
        k(i0Var);
    }
}
