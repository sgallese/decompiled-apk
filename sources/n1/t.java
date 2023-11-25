package n1;

/* compiled from: LayoutCoordinates.kt */
/* loaded from: classes.dex */
public final class t {
    public static final z0.h a(s sVar) {
        z0.h a10;
        qc.q.i(sVar, "<this>");
        s H = sVar.H();
        if (H == null || (a10 = r.a(H, sVar, false, 2, null)) == null) {
            return new z0.h(0.0f, 0.0f, j2.p.g(sVar.a()), j2.p.f(sVar.a()));
        }
        return a10;
    }

    public static final z0.h b(s sVar) {
        qc.q.i(sVar, "<this>");
        return r.a(d(sVar), sVar, false, 2, null);
    }

    public static final z0.h c(s sVar) {
        float k10;
        float k11;
        float k12;
        float k13;
        boolean z10;
        boolean z11;
        float h10;
        float h11;
        float g10;
        float g11;
        qc.q.i(sVar, "<this>");
        s d10 = d(sVar);
        z0.h b10 = b(sVar);
        float g12 = j2.p.g(d10.a());
        float f10 = j2.p.f(d10.a());
        k10 = vc.l.k(b10.i(), 0.0f, g12);
        k11 = vc.l.k(b10.l(), 0.0f, f10);
        k12 = vc.l.k(b10.j(), 0.0f, g12);
        k13 = vc.l.k(b10.e(), 0.0f, f10);
        if (k10 == k12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (k11 == k13) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long n10 = d10.n(z0.g.a(k10, k11));
                long n11 = d10.n(z0.g.a(k12, k11));
                long n12 = d10.n(z0.g.a(k12, k13));
                long n13 = d10.n(z0.g.a(k10, k13));
                h10 = gc.d.h(z0.f.o(n10), z0.f.o(n11), z0.f.o(n13), z0.f.o(n12));
                h11 = gc.d.h(z0.f.p(n10), z0.f.p(n11), z0.f.p(n13), z0.f.p(n12));
                g10 = gc.d.g(z0.f.o(n10), z0.f.o(n11), z0.f.o(n13), z0.f.o(n12));
                g11 = gc.d.g(z0.f.p(n10), z0.f.p(n11), z0.f.p(n13), z0.f.p(n12));
                return new z0.h(h10, h11, g10, g11);
            }
        }
        return z0.h.f26359e.a();
    }

    public static final s d(s sVar) {
        s sVar2;
        p1.x0 x0Var;
        qc.q.i(sVar, "<this>");
        s H = sVar.H();
        while (true) {
            s sVar3 = H;
            sVar2 = sVar;
            sVar = sVar3;
            if (sVar == null) {
                break;
            }
            H = sVar.H();
        }
        if (sVar2 instanceof p1.x0) {
            x0Var = (p1.x0) sVar2;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            return sVar2;
        }
        p1.x0 V1 = x0Var.V1();
        while (true) {
            p1.x0 x0Var2 = V1;
            p1.x0 x0Var3 = x0Var;
            x0Var = x0Var2;
            if (x0Var != null) {
                V1 = x0Var.V1();
            } else {
                return x0Var3;
            }
        }
    }

    public static final long e(s sVar) {
        qc.q.i(sVar, "<this>");
        return sVar.U(z0.f.f26354b.c());
    }

    public static final long f(s sVar) {
        qc.q.i(sVar, "<this>");
        return sVar.n(z0.f.f26354b.c());
    }
}
