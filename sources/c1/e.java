package c1;

import a1.e1;
import a1.e4;
import a1.f4;
import a1.q1;
import a1.t3;
import c1.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j2.q;
import z0.m;

/* compiled from: DrawScope.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class e {
    static {
        f.a aVar = f.f8679g;
    }

    public static long a(f fVar) {
        return m.b(fVar.y0().b());
    }

    public static long b(f fVar) {
        return fVar.y0().b();
    }

    public static long c(f fVar, long j10, long j11) {
        return m.a(z0.l.i(j10) - z0.f.o(j11), z0.l.g(j10) - z0.f.p(j11));
    }

    public static /* synthetic */ void d(f fVar, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, g gVar, q1 q1Var, int i10, int i11, Object obj) {
        long j13;
        long j14;
        float f13;
        k kVar;
        q1 q1Var2;
        int i12;
        if (obj == null) {
            if ((i11 & 16) != 0) {
                j13 = z0.f.f26354b.c();
            } else {
                j13 = j11;
            }
            if ((i11 & 32) != 0) {
                j14 = c(fVar, fVar.b(), j13);
            } else {
                j14 = j12;
            }
            if ((i11 & 64) != 0) {
                f13 = 1.0f;
            } else {
                f13 = f12;
            }
            if ((i11 & 128) != 0) {
                kVar = k.f8683a;
            } else {
                kVar = gVar;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i11 & 512) != 0) {
                i12 = f.f8679g.a();
            } else {
                i12 = i10;
            }
            fVar.R0(j10, f10, f11, z10, j13, j14, f13, kVar, q1Var2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    public static /* synthetic */ void e(f fVar, e1 e1Var, float f10, long j10, float f11, g gVar, q1 q1Var, int i10, int i11, Object obj) {
        float f12;
        long j11;
        float f13;
        g gVar2;
        q1 q1Var2;
        int i12;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                f12 = z0.l.h(fVar.b()) / 2.0f;
            } else {
                f12 = f10;
            }
            if ((i11 & 4) != 0) {
                j11 = fVar.O0();
            } else {
                j11 = j10;
            }
            if ((i11 & 8) != 0) {
                f13 = 1.0f;
            } else {
                f13 = f11;
            }
            if ((i11 & 16) != 0) {
                gVar2 = k.f8683a;
            } else {
                gVar2 = gVar;
            }
            if ((i11 & 32) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i11 & 64) != 0) {
                i12 = f.f8679g.a();
            } else {
                i12 = i10;
            }
            fVar.M0(e1Var, f12, j11, f13, gVar2, q1Var2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
    }

    public static /* synthetic */ void f(f fVar, long j10, float f10, long j11, float f11, g gVar, q1 q1Var, int i10, int i11, Object obj) {
        float f12;
        long j12;
        float f13;
        k kVar;
        q1 q1Var2;
        int i12;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                f12 = z0.l.h(fVar.b()) / 2.0f;
            } else {
                f12 = f10;
            }
            if ((i11 & 4) != 0) {
                j12 = fVar.O0();
            } else {
                j12 = j11;
            }
            if ((i11 & 8) != 0) {
                f13 = 1.0f;
            } else {
                f13 = f11;
            }
            if ((i11 & 16) != 0) {
                kVar = k.f8683a;
            } else {
                kVar = gVar;
            }
            if ((i11 & 32) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i11 & 64) != 0) {
                i12 = f.f8679g.a();
            } else {
                i12 = i10;
            }
            fVar.z(j10, f12, j12, f13, kVar, q1Var2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    public static /* synthetic */ void g(f fVar, t3 t3Var, long j10, long j11, long j12, long j13, float f10, g gVar, q1 q1Var, int i10, int i11, int i12, Object obj) {
        long j14;
        long j15;
        long j16;
        long j17;
        float f11;
        g gVar2;
        q1 q1Var2;
        int i13;
        int i14;
        if (obj == null) {
            if ((i12 & 2) != 0) {
                j14 = j2.l.f18992b.a();
            } else {
                j14 = j10;
            }
            if ((i12 & 4) != 0) {
                j15 = q.a(t3Var.getWidth(), t3Var.getHeight());
            } else {
                j15 = j11;
            }
            if ((i12 & 8) != 0) {
                j16 = j2.l.f18992b.a();
            } else {
                j16 = j12;
            }
            if ((i12 & 16) != 0) {
                j17 = j15;
            } else {
                j17 = j13;
            }
            if ((i12 & 32) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f10;
            }
            if ((i12 & 64) != 0) {
                gVar2 = k.f8683a;
            } else {
                gVar2 = gVar;
            }
            if ((i12 & 128) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                i13 = f.f8679g.a();
            } else {
                i13 = i10;
            }
            if ((i12 & 512) != 0) {
                i14 = f.f8679g.b();
            } else {
                i14 = i11;
            }
            fVar.P(t3Var, j14, j15, j16, j17, f11, gVar2, q1Var2, i13, i14);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    public static /* synthetic */ void h(f fVar, t3 t3Var, long j10, float f10, g gVar, q1 q1Var, int i10, int i11, Object obj) {
        long j11;
        float f11;
        g gVar2;
        q1 q1Var2;
        int i12;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j11 = z0.f.f26354b.c();
            } else {
                j11 = j10;
            }
            if ((i11 & 4) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f10;
            }
            if ((i11 & 8) != 0) {
                gVar2 = k.f8683a;
            } else {
                gVar2 = gVar;
            }
            if ((i11 & 16) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i11 & 32) != 0) {
                i12 = f.f8679g.a();
            } else {
                i12 = i10;
            }
            fVar.k0(t3Var, j11, f11, gVar2, q1Var2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    public static /* synthetic */ void i(f fVar, e1 e1Var, long j10, long j11, float f10, int i10, f4 f4Var, float f11, q1 q1Var, int i11, int i12, Object obj) {
        float f12;
        int i13;
        f4 f4Var2;
        float f13;
        q1 q1Var2;
        int i14;
        if (obj == null) {
            if ((i12 & 8) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f10;
            }
            if ((i12 & 16) != 0) {
                i13 = l.f8684f.a();
            } else {
                i13 = i10;
            }
            if ((i12 & 32) != 0) {
                f4Var2 = null;
            } else {
                f4Var2 = f4Var;
            }
            if ((i12 & 64) != 0) {
                f13 = 1.0f;
            } else {
                f13 = f11;
            }
            if ((i12 & 128) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                i14 = f.f8679g.a();
            } else {
                i14 = i11;
            }
            fVar.F(e1Var, j10, j11, f12, i13, f4Var2, f13, q1Var2, i14);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    public static /* synthetic */ void j(f fVar, long j10, long j11, long j12, float f10, int i10, f4 f4Var, float f11, q1 q1Var, int i11, int i12, Object obj) {
        float f12;
        int i13;
        f4 f4Var2;
        float f13;
        q1 q1Var2;
        int i14;
        if (obj == null) {
            if ((i12 & 8) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f10;
            }
            if ((i12 & 16) != 0) {
                i13 = l.f8684f.a();
            } else {
                i13 = i10;
            }
            if ((i12 & 32) != 0) {
                f4Var2 = null;
            } else {
                f4Var2 = f4Var;
            }
            if ((i12 & 64) != 0) {
                f13 = 1.0f;
            } else {
                f13 = f11;
            }
            if ((i12 & 128) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                i14 = f.f8679g.a();
            } else {
                i14 = i11;
            }
            fVar.a1(j10, j11, j12, f12, i13, f4Var2, f13, q1Var2, i14);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    public static /* synthetic */ void k(f fVar, e4 e4Var, e1 e1Var, float f10, g gVar, q1 q1Var, int i10, int i11, Object obj) {
        float f11;
        if (obj == null) {
            if ((i11 & 4) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f10;
            }
            if ((i11 & 8) != 0) {
                gVar = k.f8683a;
            }
            g gVar2 = gVar;
            if ((i11 & 16) != 0) {
                q1Var = null;
            }
            q1 q1Var2 = q1Var;
            if ((i11 & 32) != 0) {
                i10 = f.f8679g.a();
            }
            fVar.Q(e4Var, e1Var, f11, gVar2, q1Var2, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    public static /* synthetic */ void l(f fVar, e1 e1Var, long j10, long j11, float f10, g gVar, q1 q1Var, int i10, int i11, Object obj) {
        long j12;
        long j13;
        float f11;
        g gVar2;
        q1 q1Var2;
        int i12;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j12 = z0.f.f26354b.c();
            } else {
                j12 = j10;
            }
            if ((i11 & 4) != 0) {
                j13 = c(fVar, fVar.b(), j12);
            } else {
                j13 = j11;
            }
            if ((i11 & 8) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f10;
            }
            if ((i11 & 16) != 0) {
                gVar2 = k.f8683a;
            } else {
                gVar2 = gVar;
            }
            if ((i11 & 32) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i11 & 64) != 0) {
                i12 = f.f8679g.a();
            } else {
                i12 = i10;
            }
            fVar.D(e1Var, j12, j13, f11, gVar2, q1Var2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    public static /* synthetic */ void m(f fVar, long j10, long j11, long j12, float f10, g gVar, q1 q1Var, int i10, int i11, Object obj) {
        long j13;
        long j14;
        float f11;
        k kVar;
        q1 q1Var2;
        int i12;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j13 = z0.f.f26354b.c();
            } else {
                j13 = j11;
            }
            if ((i11 & 4) != 0) {
                j14 = c(fVar, fVar.b(), j13);
            } else {
                j14 = j12;
            }
            if ((i11 & 8) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f10;
            }
            if ((i11 & 16) != 0) {
                kVar = k.f8683a;
            } else {
                kVar = gVar;
            }
            if ((i11 & 32) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i11 & 64) != 0) {
                i12 = f.f8679g.a();
            } else {
                i12 = i10;
            }
            fVar.X0(j10, j13, j14, f11, kVar, q1Var2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    public static /* synthetic */ void n(f fVar, e1 e1Var, long j10, long j11, long j12, float f10, g gVar, q1 q1Var, int i10, int i11, Object obj) {
        long j13;
        long j14;
        long j15;
        float f11;
        g gVar2;
        q1 q1Var2;
        int i12;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j13 = z0.f.f26354b.c();
            } else {
                j13 = j10;
            }
            if ((i11 & 4) != 0) {
                j14 = c(fVar, fVar.b(), j13);
            } else {
                j14 = j11;
            }
            if ((i11 & 8) != 0) {
                j15 = z0.a.f26348a.a();
            } else {
                j15 = j12;
            }
            if ((i11 & 16) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f10;
            }
            if ((i11 & 32) != 0) {
                gVar2 = k.f8683a;
            } else {
                gVar2 = gVar;
            }
            if ((i11 & 64) != 0) {
                q1Var2 = null;
            } else {
                q1Var2 = q1Var;
            }
            if ((i11 & 128) != 0) {
                i12 = f.f8679g.a();
            } else {
                i12 = i10;
            }
            fVar.J(e1Var, j13, j14, j15, f11, gVar2, q1Var2, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }
}
