package p2;

import o2.d;
import o2.e;
import p2.f;
import p2.m;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: k  reason: collision with root package name */
    public f f21040k;

    /* renamed from: l  reason: collision with root package name */
    g f21041l;

    /* compiled from: VerticalWidgetRun.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21042a;

        static {
            int[] iArr = new int[m.b.values().length];
            f21042a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21042a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21042a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(o2.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f21040k = fVar;
        this.f21041l = null;
        this.f21050h.f21021e = f.a.TOP;
        this.f21051i.f21021e = f.a.BOTTOM;
        fVar.f21021e = f.a.BASELINE;
        this.f21048f = 1;
    }

    @Override // p2.m, p2.d
    public void a(d dVar) {
        float f10;
        float t10;
        float f11;
        int i10;
        int i11 = a.f21042a[this.f21052j.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    o2.e eVar = this.f21044b;
                    n(dVar, eVar.C, eVar.E, 1);
                    return;
                }
            } else {
                o(dVar);
            }
        } else {
            p(dVar);
        }
        g gVar = this.f21047e;
        if (gVar.f21019c && !gVar.f21026j && this.f21046d == e.b.MATCH_CONSTRAINT) {
            o2.e eVar2 = this.f21044b;
            int i12 = eVar2.f20403m;
            if (i12 != 2) {
                if (i12 == 3 && eVar2.f20387e.f21047e.f21026j) {
                    int u10 = eVar2.u();
                    if (u10 != -1) {
                        if (u10 != 0) {
                            if (u10 != 1) {
                                i10 = 0;
                                this.f21047e.d(i10);
                            } else {
                                o2.e eVar3 = this.f21044b;
                                f10 = eVar3.f20387e.f21047e.f21023g;
                                t10 = eVar3.t();
                            }
                        } else {
                            f11 = r7.f20387e.f21047e.f21023g * this.f21044b.t();
                            i10 = (int) (f11 + 0.5f);
                            this.f21047e.d(i10);
                        }
                    } else {
                        o2.e eVar4 = this.f21044b;
                        f10 = eVar4.f20387e.f21047e.f21023g;
                        t10 = eVar4.t();
                    }
                    f11 = f10 / t10;
                    i10 = (int) (f11 + 0.5f);
                    this.f21047e.d(i10);
                }
            } else {
                o2.e G = eVar2.G();
                if (G != null) {
                    if (G.f20389f.f21047e.f21026j) {
                        this.f21047e.d((int) ((r7.f21023g * this.f21044b.f20417t) + 0.5f));
                    }
                }
            }
        }
        f fVar = this.f21050h;
        if (fVar.f21019c) {
            f fVar2 = this.f21051i;
            if (fVar2.f21019c) {
                if (fVar.f21026j && fVar2.f21026j && this.f21047e.f21026j) {
                    return;
                }
                if (!this.f21047e.f21026j && this.f21046d == e.b.MATCH_CONSTRAINT) {
                    o2.e eVar5 = this.f21044b;
                    if (eVar5.f20401l == 0 && !eVar5.X()) {
                        f fVar3 = this.f21050h.f21028l.get(0);
                        f fVar4 = this.f21051i.f21028l.get(0);
                        int i13 = fVar3.f21023g;
                        f fVar5 = this.f21050h;
                        int i14 = i13 + fVar5.f21022f;
                        int i15 = fVar4.f21023g + this.f21051i.f21022f;
                        fVar5.d(i14);
                        this.f21051i.d(i15);
                        this.f21047e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f21047e.f21026j && this.f21046d == e.b.MATCH_CONSTRAINT && this.f21043a == 1 && this.f21050h.f21028l.size() > 0 && this.f21051i.f21028l.size() > 0) {
                    f fVar6 = this.f21050h.f21028l.get(0);
                    int i16 = (this.f21051i.f21028l.get(0).f21023g + this.f21051i.f21022f) - (fVar6.f21023g + this.f21050h.f21022f);
                    g gVar2 = this.f21047e;
                    int i17 = gVar2.f21029m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f21047e.f21026j && this.f21050h.f21028l.size() > 0 && this.f21051i.f21028l.size() > 0) {
                    f fVar7 = this.f21050h.f21028l.get(0);
                    f fVar8 = this.f21051i.f21028l.get(0);
                    int i18 = fVar7.f21023g + this.f21050h.f21022f;
                    int i19 = fVar8.f21023g + this.f21051i.f21022f;
                    float K = this.f21044b.K();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f21023g;
                        i19 = fVar8.f21023g;
                        K = 0.5f;
                    }
                    this.f21050h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f21047e.f21023g) * K)));
                    this.f21051i.d(this.f21050h.f21023g + this.f21047e.f21023g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void d() {
        o2.e G;
        o2.e G2;
        o2.e eVar = this.f21044b;
        if (eVar.f20379a) {
            this.f21047e.d(eVar.v());
        }
        if (!this.f21047e.f21026j) {
            this.f21046d = this.f21044b.M();
            if (this.f21044b.S()) {
                this.f21041l = new p2.a(this);
            }
            e.b bVar = this.f21046d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (G2 = this.f21044b.G()) != null && G2.M() == e.b.FIXED) {
                    int v10 = (G2.v() - this.f21044b.C.c()) - this.f21044b.E.c();
                    b(this.f21050h, G2.f20389f.f21050h, this.f21044b.C.c());
                    b(this.f21051i, G2.f20389f.f21051i, -this.f21044b.E.c());
                    this.f21047e.d(v10);
                    return;
                } else if (this.f21046d == e.b.FIXED) {
                    this.f21047e.d(this.f21044b.v());
                }
            }
        } else if (this.f21046d == e.b.MATCH_PARENT && (G = this.f21044b.G()) != null && G.M() == e.b.FIXED) {
            b(this.f21050h, G.f20389f.f21050h, this.f21044b.C.c());
            b(this.f21051i, G.f20389f.f21051i, -this.f21044b.E.c());
            return;
        }
        g gVar = this.f21047e;
        boolean z10 = gVar.f21026j;
        if (z10) {
            o2.e eVar2 = this.f21044b;
            if (eVar2.f20379a) {
                o2.d[] dVarArr = eVar2.J;
                o2.d dVar = dVarArr[2];
                o2.d dVar2 = dVar.f20373d;
                if (dVar2 != null && dVarArr[3].f20373d != null) {
                    if (eVar2.X()) {
                        this.f21050h.f21022f = this.f21044b.J[2].c();
                        this.f21051i.f21022f = -this.f21044b.J[3].c();
                    } else {
                        f h10 = h(this.f21044b.J[2]);
                        if (h10 != null) {
                            b(this.f21050h, h10, this.f21044b.J[2].c());
                        }
                        f h11 = h(this.f21044b.J[3]);
                        if (h11 != null) {
                            b(this.f21051i, h11, -this.f21044b.J[3].c());
                        }
                        this.f21050h.f21018b = true;
                        this.f21051i.f21018b = true;
                    }
                    if (this.f21044b.S()) {
                        b(this.f21040k, this.f21050h, this.f21044b.n());
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f21050h, h12, this.f21044b.J[2].c());
                        b(this.f21051i, this.f21050h, this.f21047e.f21023g);
                        if (this.f21044b.S()) {
                            b(this.f21040k, this.f21050h, this.f21044b.n());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    o2.d dVar3 = dVarArr[3];
                    if (dVar3.f20373d != null) {
                        f h13 = h(dVar3);
                        if (h13 != null) {
                            b(this.f21051i, h13, -this.f21044b.J[3].c());
                            b(this.f21050h, this.f21051i, -this.f21047e.f21023g);
                        }
                        if (this.f21044b.S()) {
                            b(this.f21040k, this.f21050h, this.f21044b.n());
                            return;
                        }
                        return;
                    }
                    o2.d dVar4 = dVarArr[4];
                    if (dVar4.f20373d != null) {
                        f h14 = h(dVar4);
                        if (h14 != null) {
                            b(this.f21040k, h14, 0);
                            b(this.f21050h, this.f21040k, -this.f21044b.n());
                            b(this.f21051i, this.f21050h, this.f21047e.f21023g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof o2.i) && eVar2.G() != null && this.f21044b.m(d.b.CENTER).f20373d == null) {
                        b(this.f21050h, this.f21044b.G().f20389f.f21050h, this.f21044b.R());
                        b(this.f21051i, this.f21050h, this.f21047e.f21023g);
                        if (this.f21044b.S()) {
                            b(this.f21040k, this.f21050h, this.f21044b.n());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z10 && this.f21046d == e.b.MATCH_CONSTRAINT) {
            o2.e eVar3 = this.f21044b;
            int i10 = eVar3.f20403m;
            if (i10 != 2) {
                if (i10 == 3 && !eVar3.X()) {
                    o2.e eVar4 = this.f21044b;
                    if (eVar4.f20401l != 3) {
                        g gVar2 = eVar4.f20387e.f21047e;
                        this.f21047e.f21028l.add(gVar2);
                        gVar2.f21027k.add(this.f21047e);
                        g gVar3 = this.f21047e;
                        gVar3.f21018b = true;
                        gVar3.f21027k.add(this.f21050h);
                        this.f21047e.f21027k.add(this.f21051i);
                    }
                }
            } else {
                o2.e G3 = eVar3.G();
                if (G3 != null) {
                    g gVar4 = G3.f20389f.f21047e;
                    this.f21047e.f21028l.add(gVar4);
                    gVar4.f21027k.add(this.f21047e);
                    g gVar5 = this.f21047e;
                    gVar5.f21018b = true;
                    gVar5.f21027k.add(this.f21050h);
                    this.f21047e.f21027k.add(this.f21051i);
                }
            }
        } else {
            gVar.b(this);
        }
        o2.e eVar5 = this.f21044b;
        o2.d[] dVarArr2 = eVar5.J;
        o2.d dVar5 = dVarArr2[2];
        o2.d dVar6 = dVar5.f20373d;
        if (dVar6 != null && dVarArr2[3].f20373d != null) {
            if (eVar5.X()) {
                this.f21050h.f21022f = this.f21044b.J[2].c();
                this.f21051i.f21022f = -this.f21044b.J[3].c();
            } else {
                f h15 = h(this.f21044b.J[2]);
                f h16 = h(this.f21044b.J[3]);
                h15.b(this);
                h16.b(this);
                this.f21052j = m.b.CENTER;
            }
            if (this.f21044b.S()) {
                c(this.f21040k, this.f21050h, 1, this.f21041l);
            }
        } else if (dVar6 != null) {
            f h17 = h(dVar5);
            if (h17 != null) {
                b(this.f21050h, h17, this.f21044b.J[2].c());
                c(this.f21051i, this.f21050h, 1, this.f21047e);
                if (this.f21044b.S()) {
                    c(this.f21040k, this.f21050h, 1, this.f21041l);
                }
                e.b bVar2 = this.f21046d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f21044b.t() > 0.0f) {
                    j jVar = this.f21044b.f20387e;
                    if (jVar.f21046d == bVar3) {
                        jVar.f21047e.f21027k.add(this.f21047e);
                        this.f21047e.f21028l.add(this.f21044b.f20387e.f21047e);
                        this.f21047e.f21017a = this;
                    }
                }
            }
        } else {
            o2.d dVar7 = dVarArr2[3];
            if (dVar7.f20373d != null) {
                f h18 = h(dVar7);
                if (h18 != null) {
                    b(this.f21051i, h18, -this.f21044b.J[3].c());
                    c(this.f21050h, this.f21051i, -1, this.f21047e);
                    if (this.f21044b.S()) {
                        c(this.f21040k, this.f21050h, 1, this.f21041l);
                    }
                }
            } else {
                o2.d dVar8 = dVarArr2[4];
                if (dVar8.f20373d != null) {
                    f h19 = h(dVar8);
                    if (h19 != null) {
                        b(this.f21040k, h19, 0);
                        c(this.f21050h, this.f21040k, -1, this.f21041l);
                        c(this.f21051i, this.f21050h, 1, this.f21047e);
                    }
                } else if (!(eVar5 instanceof o2.i) && eVar5.G() != null) {
                    b(this.f21050h, this.f21044b.G().f20389f.f21050h, this.f21044b.R());
                    c(this.f21051i, this.f21050h, 1, this.f21047e);
                    if (this.f21044b.S()) {
                        c(this.f21040k, this.f21050h, 1, this.f21041l);
                    }
                    e.b bVar4 = this.f21046d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f21044b.t() > 0.0f) {
                        j jVar2 = this.f21044b.f20387e;
                        if (jVar2.f21046d == bVar5) {
                            jVar2.f21047e.f21027k.add(this.f21047e);
                            this.f21047e.f21028l.add(this.f21044b.f20387e.f21047e);
                            this.f21047e.f21017a = this;
                        }
                    }
                }
            }
        }
        if (this.f21047e.f21028l.size() == 0) {
            this.f21047e.f21019c = true;
        }
    }

    @Override // p2.m
    public void e() {
        f fVar = this.f21050h;
        if (fVar.f21026j) {
            this.f21044b.G0(fVar.f21023g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void f() {
        this.f21045c = null;
        this.f21050h.c();
        this.f21051i.c();
        this.f21040k.c();
        this.f21047e.c();
        this.f21049g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public boolean m() {
        if (this.f21046d != e.b.MATCH_CONSTRAINT || this.f21044b.f20403m == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f21049g = false;
        this.f21050h.c();
        this.f21050h.f21026j = false;
        this.f21051i.c();
        this.f21051i.f21026j = false;
        this.f21040k.c();
        this.f21040k.f21026j = false;
        this.f21047e.f21026j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f21044b.r();
    }
}
