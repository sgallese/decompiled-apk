package v1;

import a1.d4;
import a1.e1;
import a1.e4;
import a1.h1;
import a1.o4;
import a1.p1;
import a1.u0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MultiParagraph.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final i f24454a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24455b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24456c;

    /* renamed from: d  reason: collision with root package name */
    private final float f24457d;

    /* renamed from: e  reason: collision with root package name */
    private final float f24458e;

    /* renamed from: f  reason: collision with root package name */
    private final int f24459f;

    /* renamed from: g  reason: collision with root package name */
    private final List<z0.h> f24460g;

    /* renamed from: h  reason: collision with root package name */
    private final List<n> f24461h;

    public /* synthetic */ h(i iVar, long j10, int i10, boolean z10, qc.h hVar) {
        this(iVar, j10, i10, z10);
    }

    public static /* synthetic */ void B(h hVar, h1 h1Var, long j10, o4 o4Var, g2.k kVar, c1.g gVar, int i10, int i11, Object obj) {
        long j11;
        o4 o4Var2;
        g2.k kVar2;
        int i12;
        if ((i11 & 2) != 0) {
            j11 = p1.f146b.e();
        } else {
            j11 = j10;
        }
        c1.g gVar2 = null;
        if ((i11 & 4) != 0) {
            o4Var2 = null;
        } else {
            o4Var2 = o4Var;
        }
        if ((i11 & 8) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        if ((i11 & 16) == 0) {
            gVar2 = gVar;
        }
        if ((i11 & 32) != 0) {
            i12 = c1.f.f8679g.a();
        } else {
            i12 = i10;
        }
        hVar.A(h1Var, j11, o4Var2, kVar2, gVar2, i12);
    }

    public static /* synthetic */ void D(h hVar, h1 h1Var, e1 e1Var, float f10, o4 o4Var, g2.k kVar, c1.g gVar, int i10, int i11, Object obj) {
        float f11;
        o4 o4Var2;
        g2.k kVar2;
        c1.g gVar2;
        int i12;
        if ((i11 & 4) != 0) {
            f11 = Float.NaN;
        } else {
            f11 = f10;
        }
        if ((i11 & 8) != 0) {
            o4Var2 = null;
        } else {
            o4Var2 = o4Var;
        }
        if ((i11 & 16) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        if ((i11 & 32) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i11 & 64) != 0) {
            i12 = c1.f.f8679g.a();
        } else {
            i12 = i10;
        }
        hVar.C(h1Var, e1Var, f11, o4Var2, kVar2, gVar2, i12);
    }

    private final void E(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < a().i().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + a().length() + ')').toString());
    }

    private final void F(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= a().i().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + a().length() + ']').toString());
    }

    private final void G(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24459f) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + this.f24459f + ')').toString());
    }

    private final d a() {
        return this.f24454a.e();
    }

    public final void A(h1 h1Var, long j10, o4 o4Var, g2.k kVar, c1.g gVar, int i10) {
        qc.q.i(h1Var, "canvas");
        h1Var.k();
        List<n> list = this.f24461h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = list.get(i11);
            nVar.e().s(h1Var, j10, o4Var, kVar, gVar, i10);
            h1Var.b(0.0f, nVar.e().getHeight());
        }
        h1Var.p();
    }

    public final void C(h1 h1Var, e1 e1Var, float f10, o4 o4Var, g2.k kVar, c1.g gVar, int i10) {
        qc.q.i(h1Var, "canvas");
        qc.q.i(e1Var, "brush");
        d2.b.a(this, h1Var, e1Var, f10, o4Var, kVar, gVar, i10);
    }

    public final g2.i b(int i10) {
        int a10;
        F(i10);
        if (i10 == a().length()) {
            a10 = ec.t.k(this.f24461h);
        } else {
            a10 = k.a(this.f24461h, i10);
        }
        n nVar = this.f24461h.get(a10);
        return nVar.e().j(nVar.p(i10));
    }

    public final z0.h c(int i10) {
        E(i10);
        n nVar = this.f24461h.get(k.a(this.f24461h, i10));
        return nVar.j(nVar.e().m(nVar.p(i10)));
    }

    public final z0.h d(int i10) {
        int a10;
        F(i10);
        if (i10 == a().length()) {
            a10 = ec.t.k(this.f24461h);
        } else {
            a10 = k.a(this.f24461h, i10);
        }
        n nVar = this.f24461h.get(a10);
        return nVar.j(nVar.e().f(nVar.p(i10)));
    }

    public final boolean e() {
        return this.f24456c;
    }

    public final float f() {
        if (this.f24461h.isEmpty()) {
            return 0.0f;
        }
        return this.f24461h.get(0).e().i();
    }

    public final float g() {
        return this.f24458e;
    }

    public final float h(int i10, boolean z10) {
        int a10;
        F(i10);
        if (i10 == a().length()) {
            a10 = ec.t.k(this.f24461h);
        } else {
            a10 = k.a(this.f24461h, i10);
        }
        n nVar = this.f24461h.get(a10);
        return nVar.e().w(nVar.p(i10), z10);
    }

    public final i i() {
        return this.f24454a;
    }

    public final float j() {
        Object m02;
        if (!this.f24461h.isEmpty()) {
            m02 = ec.b0.m0(this.f24461h);
            n nVar = (n) m02;
            return nVar.n(nVar.e().e());
        }
        return 0.0f;
    }

    public final float k(int i10) {
        G(i10);
        n nVar = this.f24461h.get(k.b(this.f24461h, i10));
        return nVar.n(nVar.e().k(nVar.q(i10)));
    }

    public final int l() {
        return this.f24459f;
    }

    public final int m(int i10, boolean z10) {
        G(i10);
        n nVar = this.f24461h.get(k.b(this.f24461h, i10));
        return nVar.l(nVar.e().p(nVar.q(i10), z10));
    }

    public final int n(int i10) {
        int a10;
        if (i10 >= a().length()) {
            a10 = ec.t.k(this.f24461h);
        } else if (i10 < 0) {
            a10 = 0;
        } else {
            a10 = k.a(this.f24461h, i10);
        }
        n nVar = this.f24461h.get(a10);
        return nVar.m(nVar.e().h(nVar.p(i10)));
    }

    public final int o(float f10) {
        int c10;
        if (f10 <= 0.0f) {
            c10 = 0;
        } else if (f10 >= this.f24458e) {
            c10 = ec.t.k(this.f24461h);
        } else {
            c10 = k.c(this.f24461h, f10);
        }
        n nVar = this.f24461h.get(c10);
        if (nVar.d() == 0) {
            return Math.max(0, nVar.f() - 1);
        }
        return nVar.m(nVar.e().u(nVar.r(f10)));
    }

    public final float p(int i10) {
        G(i10);
        n nVar = this.f24461h.get(k.b(this.f24461h, i10));
        return nVar.e().x(nVar.q(i10));
    }

    public final float q(int i10) {
        G(i10);
        n nVar = this.f24461h.get(k.b(this.f24461h, i10));
        return nVar.e().r(nVar.q(i10));
    }

    public final int r(int i10) {
        G(i10);
        n nVar = this.f24461h.get(k.b(this.f24461h, i10));
        return nVar.l(nVar.e().o(nVar.q(i10)));
    }

    public final float s(int i10) {
        G(i10);
        n nVar = this.f24461h.get(k.b(this.f24461h, i10));
        return nVar.n(nVar.e().d(nVar.q(i10)));
    }

    public final int t(long j10) {
        int c10;
        if (z0.f.p(j10) <= 0.0f) {
            c10 = 0;
        } else if (z0.f.p(j10) >= this.f24458e) {
            c10 = ec.t.k(this.f24461h);
        } else {
            c10 = k.c(this.f24461h, z0.f.p(j10));
        }
        n nVar = this.f24461h.get(c10);
        if (nVar.d() == 0) {
            return Math.max(0, nVar.f() - 1);
        }
        return nVar.l(nVar.e().l(nVar.o(j10)));
    }

    public final g2.i u(int i10) {
        int a10;
        F(i10);
        if (i10 == a().length()) {
            a10 = ec.t.k(this.f24461h);
        } else {
            a10 = k.a(this.f24461h, i10);
        }
        n nVar = this.f24461h.get(a10);
        return nVar.e().c(nVar.p(i10));
    }

    public final List<n> v() {
        return this.f24461h;
    }

    public final e4 w(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || i11 > a().i().length()) {
            z11 = false;
        }
        if (z11) {
            if (i10 == i11) {
                return u0.a();
            }
            e4 a10 = u0.a();
            int size = this.f24461h.size();
            for (int a11 = k.a(this.f24461h, i10); a11 < size; a11++) {
                n nVar = this.f24461h.get(a11);
                if (nVar.f() >= i11) {
                    break;
                }
                if (nVar.f() != nVar.b()) {
                    d4.a(a10, nVar.i(nVar.e().v(nVar.p(i10), nVar.p(i11))), 0L, 2, null);
                }
            }
            return a10;
        }
        throw new IllegalArgumentException(("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + a().i().length() + "), or start > end!").toString());
    }

    public final List<z0.h> x() {
        return this.f24460g;
    }

    public final float y() {
        return this.f24457d;
    }

    public final long z(int i10) {
        int a10;
        F(i10);
        if (i10 == a().length()) {
            a10 = ec.t.k(this.f24461h);
        } else {
            a10 = k.a(this.f24461h, i10);
        }
        n nVar = this.f24461h.get(a10);
        return nVar.k(nVar.e().g(nVar.p(i10)));
    }

    private h(i iVar, long j10, int i10, boolean z10) {
        boolean z11;
        int m10;
        int k10;
        qc.q.i(iVar, "intrinsics");
        this.f24454a = iVar;
        this.f24455b = i10;
        int i11 = 0;
        if (j2.b.p(j10) == 0 && j2.b.o(j10) == 0) {
            ArrayList arrayList = new ArrayList();
            List<o> f10 = iVar.f();
            int size = f10.size();
            int i12 = 0;
            int i13 = 0;
            float f11 = 0.0f;
            while (i12 < size) {
                o oVar = f10.get(i12);
                p b10 = oVar.b();
                int n10 = j2.b.n(j10);
                if (j2.b.i(j10)) {
                    m10 = vc.l.d(j2.b.m(j10) - r.d(f11), i11);
                } else {
                    m10 = j2.b.m(j10);
                }
                m c10 = r.c(b10, j2.c.b(0, n10, 0, m10, 5, null), this.f24455b - i13, z10);
                float height = f11 + c10.getHeight();
                int q10 = i13 + c10.q();
                arrayList.add(new n(c10, oVar.c(), oVar.a(), i13, q10, f11, height));
                if (!c10.t()) {
                    if (q10 == this.f24455b) {
                        k10 = ec.t.k(this.f24454a.f());
                        if (i12 != k10) {
                        }
                    }
                    i12++;
                    i13 = q10;
                    f11 = height;
                    i11 = 0;
                }
                i13 = q10;
                f11 = height;
                z11 = true;
                break;
            }
            z11 = false;
            this.f24458e = f11;
            this.f24459f = i13;
            this.f24456c = z11;
            this.f24461h = arrayList;
            this.f24457d = j2.b.n(j10);
            List<z0.h> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                n nVar = (n) arrayList.get(i14);
                List<z0.h> n11 = nVar.e().n();
                ArrayList arrayList3 = new ArrayList(n11.size());
                int size3 = n11.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    z0.h hVar = n11.get(i15);
                    arrayList3.add(hVar != null ? nVar.j(hVar) : null);
                }
                ec.y.w(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f24454a.g().size()) {
                int size4 = this.f24454a.g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i16 = 0; i16 < size4; i16++) {
                    arrayList4.add(null);
                }
                arrayList2 = ec.b0.r0(arrayList2, arrayList4);
            }
            this.f24460g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }
}
