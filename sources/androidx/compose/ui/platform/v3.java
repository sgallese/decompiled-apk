package androidx.compose.ui.platform;

import a1.z3;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ShapeContainingUtil.kt */
/* loaded from: classes.dex */
public final class v3 {
    private static final boolean a(z0.j jVar) {
        if (z0.a.d(jVar.h()) + z0.a.d(jVar.i()) <= jVar.j() && z0.a.d(jVar.b()) + z0.a.d(jVar.c()) <= jVar.j() && z0.a.e(jVar.h()) + z0.a.e(jVar.b()) <= jVar.d() && z0.a.e(jVar.i()) + z0.a.e(jVar.c()) <= jVar.d()) {
            return true;
        }
        return false;
    }

    public static final boolean b(a1.z3 z3Var, float f10, float f11, a1.e4 e4Var, a1.e4 e4Var2) {
        qc.q.i(z3Var, "outline");
        if (z3Var instanceof z3.b) {
            return d(((z3.b) z3Var).a(), f10, f11);
        }
        if (z3Var instanceof z3.c) {
            return e((z3.c) z3Var, f10, f11, e4Var, e4Var2);
        }
        if (z3Var instanceof z3.a) {
            return c(((z3.a) z3Var).a(), f10, f11, e4Var, e4Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean c(a1.e4 e4Var, float f10, float f11, a1.e4 e4Var2, a1.e4 e4Var3) {
        z0.h hVar = new z0.h(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (e4Var2 == null) {
            e4Var2 = a1.u0.a();
        }
        e4Var2.o(hVar);
        if (e4Var3 == null) {
            e4Var3 = a1.u0.a();
        }
        e4Var3.k(e4Var, e4Var2, a1.i4.f108a.b());
        boolean isEmpty = e4Var3.isEmpty();
        e4Var3.s();
        e4Var2.s();
        return !isEmpty;
    }

    private static final boolean d(z0.h hVar, float f10, float f11) {
        if (hVar.i() <= f10 && f10 < hVar.j() && hVar.l() <= f11 && f11 < hVar.e()) {
            return true;
        }
        return false;
    }

    private static final boolean e(z3.c cVar, float f10, float f11, a1.e4 e4Var, a1.e4 e4Var2) {
        a1.e4 e4Var3;
        z0.j a10 = cVar.a();
        if (f10 >= a10.e() && f10 < a10.f() && f11 >= a10.g() && f11 < a10.a()) {
            if (!a(a10)) {
                if (e4Var2 == null) {
                    e4Var3 = a1.u0.a();
                } else {
                    e4Var3 = e4Var2;
                }
                e4Var3.i(a10);
                return c(e4Var3, f10, f11, e4Var, e4Var2);
            }
            float d10 = z0.a.d(a10.h()) + a10.e();
            float e10 = z0.a.e(a10.h()) + a10.g();
            float f12 = a10.f() - z0.a.d(a10.i());
            float e11 = z0.a.e(a10.i()) + a10.g();
            float f13 = a10.f() - z0.a.d(a10.c());
            float a11 = a10.a() - z0.a.e(a10.c());
            float a12 = a10.a() - z0.a.e(a10.b());
            float d11 = z0.a.d(a10.b()) + a10.e();
            if (f10 < d10 && f11 < e10) {
                return f(f10, f11, a10.h(), d10, e10);
            }
            if (f10 < d11 && f11 > a12) {
                return f(f10, f11, a10.b(), d11, a12);
            }
            if (f10 > f12 && f11 < e11) {
                return f(f10, f11, a10.i(), f12, e11);
            }
            if (f10 > f13 && f11 > a11) {
                return f(f10, f11, a10.c(), f13, a11);
            }
            return true;
        }
        return false;
    }

    private static final boolean f(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float d10 = z0.a.d(j10);
        float e10 = z0.a.e(j10);
        if (((f14 * f14) / (d10 * d10)) + ((f15 * f15) / (e10 * e10)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
