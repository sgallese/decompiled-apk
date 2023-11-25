package b2;

/* compiled from: TextInputService.kt */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private final l0 f7836a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f7837b;

    public r0(l0 l0Var, e0 e0Var) {
        qc.q.i(l0Var, "textInputService");
        qc.q.i(e0Var, "platformTextInputService");
        this.f7836a = l0Var;
        this.f7837b = e0Var;
    }

    public final void a() {
        this.f7836a.c(this);
    }

    public final boolean b() {
        boolean c10 = c();
        if (c10) {
            this.f7837b.f();
        }
        return c10;
    }

    public final boolean c() {
        return qc.q.d(this.f7836a.a(), this);
    }

    public final boolean d(z0.h hVar) {
        qc.q.i(hVar, "rect");
        boolean c10 = c();
        if (c10) {
            this.f7837b.c(hVar);
        }
        return c10;
    }

    public final boolean e() {
        boolean c10 = c();
        if (c10) {
            this.f7837b.a();
        }
        return c10;
    }

    public final boolean f(j0 j0Var, j0 j0Var2) {
        qc.q.i(j0Var2, "newValue");
        boolean c10 = c();
        if (c10) {
            this.f7837b.e(j0Var, j0Var2);
        }
        return c10;
    }
}
