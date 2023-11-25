package e0;

import e0.b;
import v1.g0;
import v1.i0;
import v1.j0;

/* compiled from: TextPreparedSelection.kt */
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f13608h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final v1.d f13609a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13610b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f13611c;

    /* renamed from: d  reason: collision with root package name */
    private final b2.x f13612d;

    /* renamed from: e  reason: collision with root package name */
    private final y f13613e;

    /* renamed from: f  reason: collision with root package name */
    private long f13614f;

    /* renamed from: g  reason: collision with root package name */
    private v1.d f13615g;

    /* compiled from: TextPreparedSelection.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ b(v1.d dVar, long j10, g0 g0Var, b2.x xVar, y yVar, qc.h hVar) {
        this(dVar, j10, g0Var, xVar, yVar);
    }

    private final int A(g0 g0Var, int i10) {
        int X = X();
        if (this.f13613e.a() == null) {
            this.f13613e.c(Float.valueOf(g0Var.d(X).i()));
        }
        int p10 = g0Var.p(X) + i10;
        if (p10 < 0) {
            return 0;
        }
        if (p10 >= g0Var.m()) {
            return y().length();
        }
        float l10 = g0Var.l(p10) - 1;
        Float a10 = this.f13613e.a();
        qc.q.f(a10);
        float floatValue = a10.floatValue();
        if ((z() && floatValue >= g0Var.s(p10)) || (!z() && floatValue <= g0Var.r(p10))) {
            return g0Var.n(p10, true);
        }
        return this.f13612d.a(g0Var.w(z0.g.a(a10.floatValue(), l10)));
    }

    private final T E() {
        boolean z10;
        int l10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (l10 = l()) != -1) {
            V(l10);
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T G() {
        boolean z10;
        Integer m10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (m10 = m()) != null) {
            V(m10.intValue());
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T H() {
        boolean z10;
        int s10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (s10 = s()) != -1) {
            V(s10);
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T J() {
        boolean z10;
        Integer v10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (v10 = v()) != null) {
            V(v10.intValue());
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int X() {
        return this.f13612d.b(i0.i(this.f13614f));
    }

    private final int Y() {
        return this.f13612d.b(i0.k(this.f13614f));
    }

    private final int Z() {
        return this.f13612d.b(i0.l(this.f13614f));
    }

    private final int a(int i10) {
        int h10;
        h10 = vc.l.h(i10, y().length() - 1);
        return h10;
    }

    private final int g(g0 g0Var, int i10) {
        return this.f13612d.a(g0Var.n(g0Var.p(i10), true));
    }

    static /* synthetic */ int h(b bVar, g0 g0Var, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.Y();
            }
            return bVar.g(g0Var, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    private final int j(g0 g0Var, int i10) {
        return this.f13612d.a(g0Var.t(g0Var.p(i10)));
    }

    static /* synthetic */ int k(b bVar, g0 g0Var, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.Z();
            }
            return bVar.j(g0Var, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    private final int n(g0 g0Var, int i10) {
        while (i10 < this.f13609a.length()) {
            long B = g0Var.B(a(i10));
            if (i0.i(B) <= i10) {
                i10++;
            } else {
                return this.f13612d.a(i0.i(B));
            }
        }
        return this.f13609a.length();
    }

    static /* synthetic */ int o(b bVar, g0 g0Var, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.X();
            }
            return bVar.n(g0Var, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    private final int q() {
        return c0.a0.a(y(), i0.k(this.f13614f));
    }

    private final int r() {
        return c0.a0.b(y(), i0.l(this.f13614f));
    }

    private final int t(g0 g0Var, int i10) {
        while (i10 > 0) {
            long B = g0Var.B(a(i10));
            if (i0.n(B) >= i10) {
                i10--;
            } else {
                return this.f13612d.a(i0.n(B));
            }
        }
        return 0;
    }

    static /* synthetic */ int u(b bVar, g0 g0Var, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.X();
            }
            return bVar.t(g0Var, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean z() {
        g2.i iVar;
        g0 g0Var = this.f13611c;
        if (g0Var != null) {
            iVar = g0Var.x(X());
        } else {
            iVar = null;
        }
        if (iVar != g2.i.Rtl) {
            return true;
        }
        return false;
    }

    public final T B() {
        boolean z10;
        g0 g0Var;
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (g0Var = this.f13611c) != null) {
            V(A(g0Var, 1));
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T C() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z()) {
                H();
            } else {
                E();
            }
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T D() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z()) {
                J();
            } else {
                G();
            }
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T F() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            V(q());
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T I() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            V(r());
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T K() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z()) {
                E();
            } else {
                H();
            }
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T L() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z()) {
                G();
            } else {
                J();
            }
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T M() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            V(y().length());
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T N() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            V(0);
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T O() {
        boolean z10;
        Integer f10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (f10 = f()) != null) {
            V(f10.intValue());
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T P() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z()) {
                R();
            } else {
                O();
            }
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T Q() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z()) {
                O();
            } else {
                R();
            }
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T R() {
        boolean z10;
        Integer i10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i10 = i()) != null) {
            V(i10.intValue());
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T S() {
        boolean z10;
        g0 g0Var;
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (g0Var = this.f13611c) != null) {
            V(A(g0Var, -1));
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T T() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            W(0, y().length());
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T U() {
        boolean z10;
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f13614f = j0.b(i0.n(this.f13610b), i0.i(this.f13614f));
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void V(int i10) {
        W(i10, i10);
    }

    protected final void W(int i10, int i11) {
        this.f13614f = j0.b(i10, i11);
    }

    public final T b(pc.l<? super T, dc.w> lVar) {
        boolean z10;
        qc.q.i(lVar, "or");
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i0.h(this.f13614f)) {
                qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                lVar.invoke(this);
            } else if (z()) {
                V(i0.l(this.f13614f));
            } else {
                V(i0.k(this.f13614f));
            }
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T c(pc.l<? super T, dc.w> lVar) {
        boolean z10;
        qc.q.i(lVar, "or");
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i0.h(this.f13614f)) {
                qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                lVar.invoke(this);
            } else if (z()) {
                V(i0.k(this.f13614f));
            } else {
                V(i0.l(this.f13614f));
            }
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T d() {
        boolean z10;
        x().b();
        if (y().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            V(i0.i(this.f13614f));
        }
        qc.q.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final v1.d e() {
        return this.f13615g;
    }

    public final Integer f() {
        g0 g0Var = this.f13611c;
        if (g0Var == null) {
            return null;
        }
        return Integer.valueOf(h(this, g0Var, 0, 1, null));
    }

    public final Integer i() {
        g0 g0Var = this.f13611c;
        if (g0Var == null) {
            return null;
        }
        return Integer.valueOf(k(this, g0Var, 0, 1, null));
    }

    public final int l() {
        return c0.b0.a(this.f13615g.i(), i0.i(this.f13614f));
    }

    public final Integer m() {
        g0 g0Var = this.f13611c;
        if (g0Var == null) {
            return null;
        }
        return Integer.valueOf(o(this, g0Var, 0, 1, null));
    }

    public final b2.x p() {
        return this.f13612d;
    }

    public final int s() {
        return c0.b0.b(this.f13615g.i(), i0.i(this.f13614f));
    }

    public final Integer v() {
        g0 g0Var = this.f13611c;
        if (g0Var == null) {
            return null;
        }
        return Integer.valueOf(u(this, g0Var, 0, 1, null));
    }

    public final long w() {
        return this.f13614f;
    }

    public final y x() {
        return this.f13613e;
    }

    public final String y() {
        return this.f13615g.i();
    }

    private b(v1.d dVar, long j10, g0 g0Var, b2.x xVar, y yVar) {
        qc.q.i(dVar, "originalText");
        qc.q.i(xVar, "offsetMapping");
        qc.q.i(yVar, "state");
        this.f13609a = dVar;
        this.f13610b = j10;
        this.f13611c = g0Var;
        this.f13612d = xVar;
        this.f13613e = yVar;
        this.f13614f = j10;
        this.f13615g = dVar;
    }
}
