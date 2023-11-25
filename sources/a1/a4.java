package a1;

import a1.z3;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Outline.kt */
/* loaded from: classes.dex */
public final class a4 {
    public static final void b(c1.f fVar, z3 z3Var, e1 e1Var, float f10, c1.g gVar, q1 q1Var, int i10) {
        e4 a10;
        qc.q.i(fVar, "$this$drawOutline");
        qc.q.i(z3Var, "outline");
        qc.q.i(e1Var, "brush");
        qc.q.i(gVar, "style");
        if (z3Var instanceof z3.b) {
            z0.h a11 = ((z3.b) z3Var).a();
            fVar.D(e1Var, i(a11), g(a11), f10, gVar, q1Var, i10);
            return;
        }
        if (z3Var instanceof z3.c) {
            z3.c cVar = (z3.c) z3Var;
            a10 = cVar.b();
            if (a10 == null) {
                z0.j a12 = cVar.a();
                fVar.J(e1Var, j(a12), h(a12), z0.b.b(z0.a.d(a12.b()), 0.0f, 2, null), f10, gVar, q1Var, i10);
                return;
            }
        } else if (z3Var instanceof z3.a) {
            a10 = ((z3.a) z3Var).a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        fVar.Q(a10, e1Var, f10, gVar, q1Var, i10);
    }

    public static /* synthetic */ void c(c1.f fVar, z3 z3Var, e1 e1Var, float f10, c1.g gVar, q1 q1Var, int i10, int i11, Object obj) {
        float f11;
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 8) != 0) {
            gVar = c1.k.f8683a;
        }
        c1.g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            q1Var = null;
        }
        q1 q1Var2 = q1Var;
        if ((i11 & 32) != 0) {
            i10 = c1.f.f8679g.a();
        }
        b(fVar, z3Var, e1Var, f11, gVar2, q1Var2, i10);
    }

    public static final void d(c1.f fVar, z3 z3Var, long j10, float f10, c1.g gVar, q1 q1Var, int i10) {
        e4 a10;
        qc.q.i(fVar, "$this$drawOutline");
        qc.q.i(z3Var, "outline");
        qc.q.i(gVar, "style");
        if (z3Var instanceof z3.b) {
            z0.h a11 = ((z3.b) z3Var).a();
            fVar.X0(j10, i(a11), g(a11), f10, gVar, q1Var, i10);
            return;
        }
        if (z3Var instanceof z3.c) {
            z3.c cVar = (z3.c) z3Var;
            a10 = cVar.b();
            if (a10 == null) {
                z0.j a12 = cVar.a();
                fVar.w0(j10, j(a12), h(a12), z0.b.b(z0.a.d(a12.b()), 0.0f, 2, null), gVar, f10, q1Var, i10);
                return;
            }
        } else if (z3Var instanceof z3.a) {
            a10 = ((z3.a) z3Var).a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        fVar.V(a10, j10, f10, gVar, q1Var, i10);
    }

    public static /* synthetic */ void e(c1.f fVar, z3 z3Var, long j10, float f10, c1.g gVar, q1 q1Var, int i10, int i11, Object obj) {
        float f11;
        c1.k kVar;
        q1 q1Var2;
        int i12;
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 8) != 0) {
            kVar = c1.k.f8683a;
        } else {
            kVar = gVar;
        }
        if ((i11 & 16) != 0) {
            q1Var2 = null;
        } else {
            q1Var2 = q1Var;
        }
        if ((i11 & 32) != 0) {
            i12 = c1.f.f8679g.a();
        } else {
            i12 = i10;
        }
        d(fVar, z3Var, j10, f11, kVar, q1Var2, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(z0.j r6) {
        /*
            long r0 = r6.b()
            float r0 = z0.a.d(r0)
            long r1 = r6.c()
            float r1 = z0.a.d(r1)
            r2 = 1
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L4f
            long r0 = r6.c()
            float r0 = z0.a.d(r0)
            long r4 = r6.i()
            float r1 = z0.a.d(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L4f
            long r0 = r6.i()
            float r0 = z0.a.d(r0)
            long r4 = r6.h()
            float r1 = z0.a.d(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = 1
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r0 == 0) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = 0
        L50:
            long r4 = r6.b()
            float r1 = z0.a.e(r4)
            long r4 = r6.c()
            float r4 = z0.a.e(r4)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L66
            r1 = 1
            goto L67
        L66:
            r1 = 0
        L67:
            if (r1 == 0) goto L9d
            long r4 = r6.c()
            float r1 = z0.a.e(r4)
            long r4 = r6.i()
            float r4 = z0.a.e(r4)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L7f
            r1 = 1
            goto L80
        L7f:
            r1 = 0
        L80:
            if (r1 == 0) goto L9d
            long r4 = r6.i()
            float r1 = z0.a.e(r4)
            long r4 = r6.h()
            float r6 = z0.a.e(r4)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 != 0) goto L98
            r6 = 1
            goto L99
        L98:
            r6 = 0
        L99:
            if (r6 == 0) goto L9d
            r6 = 1
            goto L9e
        L9d:
            r6 = 0
        L9e:
            if (r0 == 0) goto La3
            if (r6 == 0) goto La3
            goto La4
        La3:
            r2 = 0
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a4.f(z0.j):boolean");
    }

    private static final long g(z0.h hVar) {
        return z0.m.a(hVar.n(), hVar.h());
    }

    private static final long h(z0.j jVar) {
        return z0.m.a(jVar.j(), jVar.d());
    }

    private static final long i(z0.h hVar) {
        return z0.g.a(hVar.i(), hVar.l());
    }

    private static final long j(z0.j jVar) {
        return z0.g.a(jVar.e(), jVar.g());
    }
}
