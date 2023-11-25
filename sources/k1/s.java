package k1;

/* compiled from: PointerEvent.kt */
/* loaded from: classes.dex */
public final class s {
    public static final boolean a(c0 c0Var) {
        qc.q.i(c0Var, "<this>");
        if (!c0Var.o() && !c0Var.k() && c0Var.h()) {
            return true;
        }
        return false;
    }

    public static final boolean b(c0 c0Var) {
        qc.q.i(c0Var, "<this>");
        if (!c0Var.k() && c0Var.h()) {
            return true;
        }
        return false;
    }

    public static final boolean c(c0 c0Var) {
        qc.q.i(c0Var, "<this>");
        if (!c0Var.o() && c0Var.k() && !c0Var.h()) {
            return true;
        }
        return false;
    }

    public static final boolean d(c0 c0Var) {
        qc.q.i(c0Var, "<this>");
        if (c0Var.k() && !c0Var.h()) {
            return true;
        }
        return false;
    }

    public static final boolean e(c0 c0Var, long j10) {
        qc.q.i(c0Var, "$this$isOutOfBounds");
        long g10 = c0Var.g();
        float o10 = z0.f.o(g10);
        float p10 = z0.f.p(g10);
        int g11 = j2.p.g(j10);
        int f10 = j2.p.f(j10);
        if (o10 >= 0.0f && o10 <= g11 && p10 >= 0.0f && p10 <= f10) {
            return false;
        }
        return true;
    }

    public static final boolean f(c0 c0Var, long j10, long j11) {
        qc.q.i(c0Var, "$this$isOutOfBounds");
        if (!q0.g(c0Var.m(), q0.f19226a.d())) {
            return e(c0Var, j10);
        }
        long g10 = c0Var.g();
        float o10 = z0.f.o(g10);
        float p10 = z0.f.p(g10);
        float f10 = -z0.l.i(j11);
        float g11 = j2.p.g(j10) + z0.l.i(j11);
        float f11 = -z0.l.g(j11);
        float f12 = j2.p.f(j10) + z0.l.g(j11);
        if (o10 >= f10 && o10 <= g11 && p10 >= f11 && p10 <= f12) {
            return false;
        }
        return true;
    }

    public static final long g(c0 c0Var) {
        qc.q.i(c0Var, "<this>");
        return i(c0Var, false);
    }

    public static final long h(c0 c0Var) {
        qc.q.i(c0Var, "<this>");
        return i(c0Var, true);
    }

    private static final long i(c0 c0Var, boolean z10) {
        long s10 = z0.f.s(c0Var.g(), c0Var.j());
        if (!z10 && c0Var.o()) {
            return z0.f.f26354b.c();
        }
        return s10;
    }

    public static final boolean j(c0 c0Var) {
        qc.q.i(c0Var, "<this>");
        return !z0.f.l(i(c0Var, true), z0.f.f26354b.c());
    }
}
