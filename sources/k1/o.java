package k1;

import androidx.compose.ui.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1.o1;
import p1.z0;

/* compiled from: HitPathTracker.kt */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: b  reason: collision with root package name */
    private final e.c f19216b;

    /* renamed from: c  reason: collision with root package name */
    private final k0.f<b0> f19217c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<b0, c0> f19218d;

    /* renamed from: e  reason: collision with root package name */
    private n1.s f19219e;

    /* renamed from: f  reason: collision with root package name */
    private r f19220f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19221g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19222h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19223i;

    public o(e.c cVar) {
        qc.q.i(cVar, "modifierNode");
        this.f19216b = cVar;
        this.f19217c = new k0.f<>(new b0[16], 0);
        this.f19218d = new LinkedHashMap();
        this.f19222h = true;
        this.f19223i = true;
    }

    private final void i() {
        this.f19218d.clear();
        this.f19219e = null;
    }

    private final boolean l(r rVar, r rVar2) {
        if (rVar == null || rVar.c().size() != rVar2.c().size()) {
            return true;
        }
        int size = rVar2.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!z0.f.l(rVar.c().get(i10).g(), rVar2.c().get(i10).g())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0201  */
    @Override // k1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.util.Map<k1.b0, k1.c0> r34, n1.s r35, k1.j r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.o.a(java.util.Map, n1.s, k1.j, boolean):boolean");
    }

    @Override // k1.p
    public void b(j jVar) {
        boolean z10;
        qc.q.i(jVar, "internalPointerEvent");
        super.b(jVar);
        r rVar = this.f19220f;
        if (rVar == null) {
            return;
        }
        this.f19221g = this.f19222h;
        List<c0> c10 = rVar.c();
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = c10.get(i10);
            if (!c0Var.h() && (!jVar.d(c0Var.f()) || !this.f19222h)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f19217c.v(b0.a(c0Var.f()));
            }
        }
        this.f19222h = false;
        this.f19223i = u.i(rVar.f(), u.f19238a.b());
    }

    @Override // k1.p
    public void d() {
        boolean z10;
        boolean z11;
        k0.f<o> g10 = g();
        int o10 = g10.o();
        if (o10 > 0) {
            o[] n10 = g10.n();
            int i10 = 0;
            do {
                n10[i10].d();
                i10++;
            } while (i10 < o10);
        }
        e.c cVar = this.f19216b;
        int a10 = z0.a(16);
        k0.f fVar = null;
        while (cVar != null) {
            if (cVar instanceof o1) {
                ((o1) cVar).a0();
            } else {
                if ((cVar.k1() & a10) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (cVar instanceof p1.l)) {
                    int i11 = 0;
                    for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                        if ((J1.k1() & a10) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i11++;
                            if (i11 == 1) {
                                cVar = J1;
                            } else {
                                if (fVar == null) {
                                    fVar = new k0.f(new e.c[16], 0);
                                }
                                if (cVar != null) {
                                    fVar.d(cVar);
                                    cVar = null;
                                }
                                fVar.d(J1);
                            }
                        }
                    }
                    if (i11 == 1) {
                    }
                }
            }
            cVar = p1.k.g(fVar);
        }
    }

    @Override // k1.p
    public boolean e(j jVar) {
        k0.f<o> g10;
        int o10;
        boolean z10;
        boolean z11;
        qc.q.i(jVar, "internalPointerEvent");
        boolean z12 = false;
        int i10 = 0;
        z12 = false;
        if (!this.f19218d.isEmpty() && this.f19216b.p1()) {
            r rVar = this.f19220f;
            qc.q.f(rVar);
            n1.s sVar = this.f19219e;
            qc.q.f(sVar);
            long a10 = sVar.a();
            e.c cVar = this.f19216b;
            int a11 = z0.a(16);
            k0.f fVar = null;
            while (cVar != null) {
                if (cVar instanceof o1) {
                    ((o1) cVar).O(rVar, t.Final, a10);
                } else {
                    if ((cVar.k1() & a11) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && (cVar instanceof p1.l)) {
                        int i11 = 0;
                        for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                            if ((J1.k1() & a11) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                i11++;
                                if (i11 == 1) {
                                    cVar = J1;
                                } else {
                                    if (fVar == null) {
                                        fVar = new k0.f(new e.c[16], 0);
                                    }
                                    if (cVar != null) {
                                        fVar.d(cVar);
                                        cVar = null;
                                    }
                                    fVar.d(J1);
                                }
                            }
                        }
                        if (i11 == 1) {
                        }
                    }
                }
                cVar = p1.k.g(fVar);
            }
            if (this.f19216b.p1() && (o10 = (g10 = g()).o()) > 0) {
                o[] n10 = g10.n();
                do {
                    n10[i10].e(jVar);
                    i10++;
                } while (i10 < o10);
            }
            z12 = true;
        }
        b(jVar);
        i();
        return z12;
    }

    @Override // k1.p
    public boolean f(Map<b0, c0> map, n1.s sVar, j jVar, boolean z10) {
        boolean z11;
        boolean z12;
        k0.f<o> g10;
        int o10;
        boolean z13;
        boolean z14;
        qc.q.i(map, "changes");
        qc.q.i(sVar, "parentCoordinates");
        qc.q.i(jVar, "internalPointerEvent");
        if (this.f19218d.isEmpty() || !this.f19216b.p1()) {
            return false;
        }
        r rVar = this.f19220f;
        qc.q.f(rVar);
        n1.s sVar2 = this.f19219e;
        qc.q.f(sVar2);
        long a10 = sVar2.a();
        e.c cVar = this.f19216b;
        int a11 = z0.a(16);
        k0.f fVar = null;
        while (cVar != null) {
            if (cVar instanceof o1) {
                ((o1) cVar).O(rVar, t.Initial, a10);
            } else {
                if ((cVar.k1() & a11) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && (cVar instanceof p1.l)) {
                    int i10 = 0;
                    for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                        if ((J1.k1() & a11) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i10++;
                            if (i10 == 1) {
                                cVar = J1;
                            } else {
                                if (fVar == null) {
                                    fVar = new k0.f(new e.c[16], 0);
                                }
                                if (cVar != null) {
                                    fVar.d(cVar);
                                    cVar = null;
                                }
                                fVar.d(J1);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
            }
            cVar = p1.k.g(fVar);
        }
        if (this.f19216b.p1() && (o10 = (g10 = g()).o()) > 0) {
            o[] n10 = g10.n();
            int i11 = 0;
            do {
                o oVar = n10[i11];
                Map<b0, c0> map2 = this.f19218d;
                n1.s sVar3 = this.f19219e;
                qc.q.f(sVar3);
                oVar.f(map2, sVar3, jVar, z10);
                i11++;
            } while (i11 < o10);
        }
        if (this.f19216b.p1()) {
            e.c cVar2 = this.f19216b;
            int a12 = z0.a(16);
            k0.f fVar2 = null;
            while (cVar2 != null) {
                if (cVar2 instanceof o1) {
                    ((o1) cVar2).O(rVar, t.Main, a10);
                } else {
                    if ((cVar2.k1() & a12) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && (cVar2 instanceof p1.l)) {
                        int i12 = 0;
                        for (e.c J12 = ((p1.l) cVar2).J1(); J12 != null; J12 = J12.g1()) {
                            if ((J12.k1() & a12) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                i12++;
                                if (i12 == 1) {
                                    cVar2 = J12;
                                } else {
                                    if (fVar2 == null) {
                                        fVar2 = new k0.f(new e.c[16], 0);
                                    }
                                    if (cVar2 != null) {
                                        fVar2.d(cVar2);
                                        cVar2 = null;
                                    }
                                    fVar2.d(J12);
                                }
                            }
                        }
                        if (i12 == 1) {
                        }
                    }
                }
                cVar2 = p1.k.g(fVar2);
            }
        }
        return true;
    }

    public final e.c j() {
        return this.f19216b;
    }

    public final k0.f<b0> k() {
        return this.f19217c;
    }

    public final void m() {
        this.f19222h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f19216b + ", children=" + g() + ", pointerIds=" + this.f19217c + ')';
    }
}
