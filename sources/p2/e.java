package p2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o2.e;
import p2.b;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private o2.f f21008a;

    /* renamed from: d  reason: collision with root package name */
    private o2.f f21011d;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21009b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21010c = true;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<m> f21012e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<k> f21013f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private b.InterfaceC0474b f21014g = null;

    /* renamed from: h  reason: collision with root package name */
    private b.a f21015h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList<k> f21016i = new ArrayList<>();

    public e(o2.f fVar) {
        this.f21008a = fVar;
        this.f21011d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<k> arrayList, k kVar) {
        m mVar = fVar.f21020d;
        if (mVar.f21045c == null) {
            o2.f fVar3 = this.f21008a;
            if (mVar != fVar3.f20387e && mVar != fVar3.f20389f) {
                if (kVar == null) {
                    kVar = new k(mVar, i11);
                    arrayList.add(kVar);
                }
                mVar.f21045c = kVar;
                kVar.a(mVar);
                for (d dVar : mVar.f21050h.f21027k) {
                    if (dVar instanceof f) {
                        a((f) dVar, i10, 0, fVar2, arrayList, kVar);
                    }
                }
                for (d dVar2 : mVar.f21051i.f21027k) {
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i10, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i10 == 1 && (mVar instanceof l)) {
                    for (d dVar3 : ((l) mVar).f21040k.f21027k) {
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i10, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (f fVar4 : mVar.f21050h.f21028l) {
                    if (fVar4 == fVar2) {
                        kVar.f21034b = true;
                    }
                    a(fVar4, i10, 0, fVar2, arrayList, kVar);
                }
                for (f fVar5 : mVar.f21051i.f21028l) {
                    if (fVar5 == fVar2) {
                        kVar.f21034b = true;
                    }
                    a(fVar5, i10, 1, fVar2, arrayList, kVar);
                }
                if (i10 == 1 && (mVar instanceof l)) {
                    Iterator<f> it = ((l) mVar).f21040k.f21028l.iterator();
                    while (it.hasNext()) {
                        a(it.next(), i10, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    private boolean b(o2.f fVar) {
        int i10;
        e.b bVar;
        int i11;
        e.b bVar2;
        e.b[] bVarArr;
        e.b bVar3;
        e.b bVar4;
        e.b bVar5;
        e.b bVar6;
        Iterator<o2.e> it = fVar.f20469w0.iterator();
        while (it.hasNext()) {
            o2.e next = it.next();
            e.b[] bVarArr2 = next.M;
            e.b bVar7 = bVarArr2[0];
            e.b bVar8 = bVarArr2[1];
            if (next.O() == 8) {
                next.f20379a = true;
            } else {
                if (next.f20411q < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    next.f20401l = 2;
                }
                if (next.f20417t < 1.0f && bVar8 == e.b.MATCH_CONSTRAINT) {
                    next.f20403m = 2;
                }
                if (next.t() > 0.0f) {
                    e.b bVar9 = e.b.MATCH_CONSTRAINT;
                    if (bVar7 == bVar9 && (bVar8 == e.b.WRAP_CONTENT || bVar8 == e.b.FIXED)) {
                        next.f20401l = 3;
                    } else if (bVar8 == bVar9 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        next.f20403m = 3;
                    } else if (bVar7 == bVar9 && bVar8 == bVar9) {
                        if (next.f20401l == 0) {
                            next.f20401l = 3;
                        }
                        if (next.f20403m == 0) {
                            next.f20403m = 3;
                        }
                    }
                }
                e.b bVar10 = e.b.MATCH_CONSTRAINT;
                if (bVar7 == bVar10 && next.f20401l == 1 && (next.B.f20373d == null || next.D.f20373d == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                e.b bVar11 = bVar7;
                if (bVar8 == bVar10 && next.f20403m == 1 && (next.C.f20373d == null || next.E.f20373d == null)) {
                    bVar8 = e.b.WRAP_CONTENT;
                }
                e.b bVar12 = bVar8;
                j jVar = next.f20387e;
                jVar.f21046d = bVar11;
                int i12 = next.f20401l;
                jVar.f21043a = i12;
                l lVar = next.f20389f;
                lVar.f21046d = bVar12;
                int i13 = next.f20403m;
                lVar.f21043a = i13;
                e.b bVar13 = e.b.MATCH_PARENT;
                if ((bVar11 != bVar13 && bVar11 != e.b.FIXED && bVar11 != e.b.WRAP_CONTENT) || (bVar12 != bVar13 && bVar12 != e.b.FIXED && bVar12 != e.b.WRAP_CONTENT)) {
                    if (bVar11 == bVar10 && (bVar12 == (bVar6 = e.b.WRAP_CONTENT) || bVar12 == e.b.FIXED)) {
                        if (i12 == 3) {
                            if (bVar12 == bVar6) {
                                l(next, bVar6, 0, bVar6, 0);
                            }
                            int v10 = next.v();
                            int i14 = (int) ((v10 * next.Q) + 0.5f);
                            e.b bVar14 = e.b.FIXED;
                            l(next, bVar14, i14, bVar14, v10);
                            next.f20387e.f21047e.d(next.P());
                            next.f20389f.f21047e.d(next.v());
                            next.f20379a = true;
                        } else if (i12 == 1) {
                            l(next, bVar6, 0, bVar12, 0);
                            next.f20387e.f21047e.f21029m = next.P();
                        } else if (i12 == 2) {
                            e.b bVar15 = fVar.M[0];
                            e.b bVar16 = e.b.FIXED;
                            if (bVar15 == bVar16 || bVar15 == bVar13) {
                                l(next, bVar16, (int) ((next.f20411q * fVar.P()) + 0.5f), bVar12, next.v());
                                next.f20387e.f21047e.d(next.P());
                                next.f20389f.f21047e.d(next.v());
                                next.f20379a = true;
                            }
                        } else {
                            o2.d[] dVarArr = next.J;
                            if (dVarArr[0].f20373d == null || dVarArr[1].f20373d == null) {
                                l(next, bVar6, 0, bVar12, 0);
                                next.f20387e.f21047e.d(next.P());
                                next.f20389f.f21047e.d(next.v());
                                next.f20379a = true;
                            }
                        }
                    }
                    if (bVar12 == bVar10 && (bVar11 == (bVar5 = e.b.WRAP_CONTENT) || bVar11 == e.b.FIXED)) {
                        if (i13 == 3) {
                            if (bVar11 == bVar5) {
                                l(next, bVar5, 0, bVar5, 0);
                            }
                            int P = next.P();
                            float f10 = next.Q;
                            if (next.u() == -1) {
                                f10 = 1.0f / f10;
                            }
                            e.b bVar17 = e.b.FIXED;
                            l(next, bVar17, P, bVar17, (int) ((P * f10) + 0.5f));
                            next.f20387e.f21047e.d(next.P());
                            next.f20389f.f21047e.d(next.v());
                            next.f20379a = true;
                        } else if (i13 == 1) {
                            l(next, bVar11, 0, bVar5, 0);
                            next.f20389f.f21047e.f21029m = next.v();
                        } else if (i13 == 2) {
                            e.b bVar18 = fVar.M[1];
                            e.b bVar19 = e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar13) {
                                l(next, bVar11, next.P(), bVar19, (int) ((next.f20417t * fVar.v()) + 0.5f));
                                next.f20387e.f21047e.d(next.P());
                                next.f20389f.f21047e.d(next.v());
                                next.f20379a = true;
                            }
                        } else {
                            o2.d[] dVarArr2 = next.J;
                            if (dVarArr2[2].f20373d == null || dVarArr2[3].f20373d == null) {
                                l(next, bVar5, 0, bVar12, 0);
                                next.f20387e.f21047e.d(next.P());
                                next.f20389f.f21047e.d(next.v());
                                next.f20379a = true;
                            }
                        }
                    }
                    if (bVar11 == bVar10 && bVar12 == bVar10) {
                        if (i12 != 1 && i13 != 1) {
                            if (i13 == 2 && i12 == 2 && ((bVar3 = (bVarArr = fVar.M)[0]) == (bVar4 = e.b.FIXED) || bVar3 == bVar4)) {
                                e.b bVar20 = bVarArr[1];
                                if (bVar20 == bVar4 || bVar20 == bVar4) {
                                    l(next, bVar4, (int) ((next.f20411q * fVar.P()) + 0.5f), bVar4, (int) ((next.f20417t * fVar.v()) + 0.5f));
                                    next.f20387e.f21047e.d(next.P());
                                    next.f20389f.f21047e.d(next.v());
                                    next.f20379a = true;
                                }
                            }
                        } else {
                            e.b bVar21 = e.b.WRAP_CONTENT;
                            l(next, bVar21, 0, bVar21, 0);
                            next.f20387e.f21047e.f21029m = next.P();
                            next.f20389f.f21047e.f21029m = next.v();
                        }
                    }
                } else {
                    int P2 = next.P();
                    if (bVar11 == bVar13) {
                        i10 = (fVar.P() - next.B.f20374e) - next.D.f20374e;
                        bVar = e.b.FIXED;
                    } else {
                        i10 = P2;
                        bVar = bVar11;
                    }
                    int v11 = next.v();
                    if (bVar12 == bVar13) {
                        i11 = (fVar.v() - next.C.f20374e) - next.E.f20374e;
                        bVar2 = e.b.FIXED;
                    } else {
                        i11 = v11;
                        bVar2 = bVar12;
                    }
                    l(next, bVar, i10, bVar2, i11);
                    next.f20387e.f21047e.d(next.P());
                    next.f20389f.f21047e.d(next.v());
                    next.f20379a = true;
                }
            }
        }
        return false;
    }

    private int e(o2.f fVar, int i10) {
        int size = this.f21016i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f21016i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(m mVar, int i10, ArrayList<k> arrayList) {
        for (d dVar : mVar.f21050h.f21027k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, mVar.f21051i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f21050h, i10, 0, mVar.f21051i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f21051i.f21027k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, mVar.f21050h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f21051i, i10, 1, mVar.f21050h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((l) mVar).f21040k.f21027k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(o2.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f21015h;
        aVar.f20996a = bVar;
        aVar.f20997b = bVar2;
        aVar.f20998c = i10;
        aVar.f20999d = i11;
        this.f21014g.b(eVar, aVar);
        eVar.E0(this.f21015h.f21000e);
        eVar.h0(this.f21015h.f21001f);
        eVar.g0(this.f21015h.f21003h);
        eVar.b0(this.f21015h.f21002g);
    }

    public void c() {
        d(this.f21012e);
        this.f21016i.clear();
        k.f21032h = 0;
        i(this.f21008a.f20387e, 0, this.f21016i);
        i(this.f21008a.f20389f, 1, this.f21016i);
        this.f21009b = false;
    }

    public void d(ArrayList<m> arrayList) {
        arrayList.clear();
        this.f21011d.f20387e.f();
        this.f21011d.f20389f.f();
        arrayList.add(this.f21011d.f20387e);
        arrayList.add(this.f21011d.f20389f);
        Iterator<o2.e> it = this.f21011d.f20469w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            o2.e next = it.next();
            if (next instanceof o2.h) {
                arrayList.add(new h(next));
            } else {
                if (next.V()) {
                    if (next.f20383c == null) {
                        next.f20383c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f20383c);
                } else {
                    arrayList.add(next.f20387e);
                }
                if (next.X()) {
                    if (next.f20385d == null) {
                        next.f20385d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f20385d);
                } else {
                    arrayList.add(next.f20389f);
                }
                if (next instanceof o2.j) {
                    arrayList.add(new i(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (next2.f21044b != this.f21011d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f21009b || this.f21010c) {
            Iterator<o2.e> it = this.f21008a.f20469w0.iterator();
            while (it.hasNext()) {
                o2.e next = it.next();
                next.f20379a = false;
                next.f20387e.r();
                next.f20389f.q();
            }
            o2.f fVar = this.f21008a;
            fVar.f20379a = false;
            fVar.f20387e.r();
            this.f21008a.f20389f.q();
            this.f21010c = false;
        }
        if (b(this.f21011d)) {
            return false;
        }
        this.f21008a.F0(0);
        this.f21008a.G0(0);
        e.b s10 = this.f21008a.s(0);
        e.b s11 = this.f21008a.s(1);
        if (this.f21009b) {
            c();
        }
        int Q = this.f21008a.Q();
        int R = this.f21008a.R();
        this.f21008a.f20387e.f21050h.d(Q);
        this.f21008a.f20389f.f21050h.d(R);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s10 == bVar || s11 == bVar) {
            if (z13) {
                Iterator<m> it2 = this.f21012e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().m()) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13 && s10 == e.b.WRAP_CONTENT) {
                this.f21008a.l0(e.b.FIXED);
                o2.f fVar2 = this.f21008a;
                fVar2.E0(e(fVar2, 0));
                o2.f fVar3 = this.f21008a;
                fVar3.f20387e.f21047e.d(fVar3.P());
            }
            if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f21008a.A0(e.b.FIXED);
                o2.f fVar4 = this.f21008a;
                fVar4.h0(e(fVar4, 1));
                o2.f fVar5 = this.f21008a;
                fVar5.f20389f.f21047e.d(fVar5.v());
            }
        }
        o2.f fVar6 = this.f21008a;
        e.b bVar2 = fVar6.M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 != bVar3 && bVar2 != e.b.MATCH_PARENT) {
            z11 = false;
        } else {
            int P = fVar6.P() + Q;
            this.f21008a.f20387e.f21051i.d(P);
            this.f21008a.f20387e.f21047e.d(P - Q);
            m();
            o2.f fVar7 = this.f21008a;
            e.b bVar4 = fVar7.M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int v10 = fVar7.v() + R;
                this.f21008a.f20389f.f21051i.d(v10);
                this.f21008a.f20389f.f21047e.d(v10 - R);
            }
            m();
            z11 = true;
        }
        Iterator<m> it3 = this.f21012e.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (next2.f21044b != this.f21008a || next2.f21049g) {
                next2.e();
            }
        }
        Iterator<m> it4 = this.f21012e.iterator();
        while (it4.hasNext()) {
            m next3 = it4.next();
            if (z11 || next3.f21044b != this.f21008a) {
                if (!next3.f21050h.f21026j || ((!next3.f21051i.f21026j && !(next3 instanceof h)) || (!next3.f21047e.f21026j && !(next3 instanceof c) && !(next3 instanceof h)))) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f21008a.l0(s10);
        this.f21008a.A0(s11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f21009b) {
            Iterator<o2.e> it = this.f21008a.f20469w0.iterator();
            while (it.hasNext()) {
                o2.e next = it.next();
                next.f20379a = false;
                j jVar = next.f20387e;
                jVar.f21047e.f21026j = false;
                jVar.f21049g = false;
                jVar.r();
                l lVar = next.f20389f;
                lVar.f21047e.f21026j = false;
                lVar.f21049g = false;
                lVar.q();
            }
            o2.f fVar = this.f21008a;
            fVar.f20379a = false;
            j jVar2 = fVar.f20387e;
            jVar2.f21047e.f21026j = false;
            jVar2.f21049g = false;
            jVar2.r();
            l lVar2 = this.f21008a.f20389f;
            lVar2.f21047e.f21026j = false;
            lVar2.f21049g = false;
            lVar2.q();
            c();
        }
        if (b(this.f21011d)) {
            return false;
        }
        this.f21008a.F0(0);
        this.f21008a.G0(0);
        this.f21008a.f20387e.f21050h.d(0);
        this.f21008a.f20389f.f21050h.d(0);
        return true;
    }

    public boolean h(boolean z10, int i10) {
        boolean z11;
        e.b bVar;
        boolean z12 = true;
        boolean z13 = z10 & true;
        e.b s10 = this.f21008a.s(0);
        e.b s11 = this.f21008a.s(1);
        int Q = this.f21008a.Q();
        int R = this.f21008a.R();
        if (z13 && (s10 == (bVar = e.b.WRAP_CONTENT) || s11 == bVar)) {
            Iterator<m> it = this.f21012e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m next = it.next();
                if (next.f21048f == i10 && !next.m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && s10 == e.b.WRAP_CONTENT) {
                    this.f21008a.l0(e.b.FIXED);
                    o2.f fVar = this.f21008a;
                    fVar.E0(e(fVar, 0));
                    o2.f fVar2 = this.f21008a;
                    fVar2.f20387e.f21047e.d(fVar2.P());
                }
            } else if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f21008a.A0(e.b.FIXED);
                o2.f fVar3 = this.f21008a;
                fVar3.h0(e(fVar3, 1));
                o2.f fVar4 = this.f21008a;
                fVar4.f20389f.f21047e.d(fVar4.v());
            }
        }
        if (i10 == 0) {
            o2.f fVar5 = this.f21008a;
            e.b bVar2 = fVar5.M[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int P = fVar5.P() + Q;
                this.f21008a.f20387e.f21051i.d(P);
                this.f21008a.f20387e.f21047e.d(P - Q);
                z11 = true;
            }
            z11 = false;
        } else {
            o2.f fVar6 = this.f21008a;
            e.b bVar3 = fVar6.M[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int v10 = fVar6.v() + R;
                this.f21008a.f20389f.f21051i.d(v10);
                this.f21008a.f20389f.f21047e.d(v10 - R);
                z11 = true;
            }
            z11 = false;
        }
        m();
        Iterator<m> it2 = this.f21012e.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2.f21048f == i10 && (next2.f21044b != this.f21008a || next2.f21049g)) {
                next2.e();
            }
        }
        Iterator<m> it3 = this.f21012e.iterator();
        while (it3.hasNext()) {
            m next3 = it3.next();
            if (next3.f21048f == i10 && (z11 || next3.f21044b != this.f21008a)) {
                if (!next3.f21050h.f21026j || !next3.f21051i.f21026j || (!(next3 instanceof c) && !next3.f21047e.f21026j)) {
                    z12 = false;
                    break;
                }
            }
        }
        this.f21008a.l0(s10);
        this.f21008a.A0(s11);
        return z12;
    }

    public void j() {
        this.f21009b = true;
    }

    public void k() {
        this.f21010c = true;
    }

    public void m() {
        boolean z10;
        g gVar;
        Iterator<o2.e> it = this.f21008a.f20469w0.iterator();
        while (it.hasNext()) {
            o2.e next = it.next();
            if (!next.f20379a) {
                e.b[] bVarArr = next.M;
                boolean z11 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f20401l;
                int i11 = next.f20403m;
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar != bVar3 && (bVar != e.b.MATCH_CONSTRAINT || i10 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z11 = true;
                }
                g gVar2 = next.f20387e.f21047e;
                boolean z12 = gVar2.f21026j;
                g gVar3 = next.f20389f.f21047e;
                boolean z13 = gVar3.f21026j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f21023g, bVar4, gVar3.f21023g);
                    next.f20379a = true;
                } else if (z12 && z11) {
                    l(next, e.b.FIXED, gVar2.f21023g, bVar3, gVar3.f21023g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f20389f.f21047e.f21029m = next.v();
                    } else {
                        next.f20389f.f21047e.d(next.v());
                        next.f20379a = true;
                    }
                } else if (z13 && z10) {
                    l(next, bVar3, gVar2.f21023g, e.b.FIXED, gVar3.f21023g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f20387e.f21047e.f21029m = next.P();
                    } else {
                        next.f20387e.f21047e.d(next.P());
                        next.f20379a = true;
                    }
                }
                if (next.f20379a && (gVar = next.f20389f.f21041l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0474b interfaceC0474b) {
        this.f21014g = interfaceC0474b;
    }
}
