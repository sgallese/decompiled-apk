package e0;

import androidx.compose.ui.platform.g4;

/* compiled from: TextSelectionMouseDetector.kt */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final g4 f13616a;

    /* renamed from: b  reason: collision with root package name */
    private int f13617b;

    /* renamed from: c  reason: collision with root package name */
    private k1.c0 f13618c;

    public c(g4 g4Var) {
        qc.q.i(g4Var, "viewConfiguration");
        this.f13616a = g4Var;
    }

    public final int a() {
        return this.f13617b;
    }

    public final boolean b(k1.c0 c0Var, k1.c0 c0Var2) {
        qc.q.i(c0Var, "prevClick");
        qc.q.i(c0Var2, "newClick");
        if (z0.f.m(z0.f.s(c0Var2.g(), c0Var.g())) < 100.0d) {
            return true;
        }
        return false;
    }

    public final boolean c(k1.c0 c0Var, k1.c0 c0Var2) {
        qc.q.i(c0Var, "prevClick");
        qc.q.i(c0Var2, "newClick");
        if (c0Var2.n() - c0Var.n() < this.f13616a.a()) {
            return true;
        }
        return false;
    }

    public final void d(k1.r rVar) {
        qc.q.i(rVar, "event");
        k1.c0 c0Var = this.f13618c;
        k1.c0 c0Var2 = rVar.c().get(0);
        if (c0Var != null && c(c0Var, c0Var2) && b(c0Var, c0Var2)) {
            this.f13617b++;
        } else {
            this.f13617b = 1;
        }
        this.f13618c = c0Var2;
    }
}
