package p2;

import o2.d;
import o2.e;
import p2.f;
import p2.m;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f21030k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21031a;

        static {
            int[] iArr = new int[m.b.values().length];
            f21031a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21031a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21031a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(o2.e eVar) {
        super(eVar);
        this.f21050h.f21021e = f.a.LEFT;
        this.f21051i.f21021e = f.a.RIGHT;
        this.f21048f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    iArr[0] = i15;
                    iArr[1] = (int) ((i15 * f10) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i16 * f10) + 0.5f);
            iArr[1] = i16;
            return;
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02bc, code lost:
    
        if (r14 != 1) goto L135;
     */
    @Override // p2.m, p2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(p2.d r17) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.j.a(p2.d):void");
    }

    @Override // p2.m
    void d() {
        o2.e G;
        o2.e G2;
        o2.e eVar = this.f21044b;
        if (eVar.f20379a) {
            this.f21047e.d(eVar.P());
        }
        if (!this.f21047e.f21026j) {
            e.b y10 = this.f21044b.y();
            this.f21046d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y10 == bVar && (((G2 = this.f21044b.G()) != null && G2.y() == e.b.FIXED) || G2.y() == bVar)) {
                    int P = (G2.P() - this.f21044b.B.c()) - this.f21044b.D.c();
                    b(this.f21050h, G2.f20387e.f21050h, this.f21044b.B.c());
                    b(this.f21051i, G2.f20387e.f21051i, -this.f21044b.D.c());
                    this.f21047e.d(P);
                    return;
                } else if (this.f21046d == e.b.FIXED) {
                    this.f21047e.d(this.f21044b.P());
                }
            }
        } else {
            e.b bVar2 = this.f21046d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((G = this.f21044b.G()) != null && G.y() == e.b.FIXED) || G.y() == bVar3)) {
                b(this.f21050h, G.f20387e.f21050h, this.f21044b.B.c());
                b(this.f21051i, G.f20387e.f21051i, -this.f21044b.D.c());
                return;
            }
        }
        g gVar = this.f21047e;
        if (gVar.f21026j) {
            o2.e eVar2 = this.f21044b;
            if (eVar2.f20379a) {
                o2.d[] dVarArr = eVar2.J;
                o2.d dVar = dVarArr[0];
                o2.d dVar2 = dVar.f20373d;
                if (dVar2 != null && dVarArr[1].f20373d != null) {
                    if (eVar2.V()) {
                        this.f21050h.f21022f = this.f21044b.J[0].c();
                        this.f21051i.f21022f = -this.f21044b.J[1].c();
                        return;
                    }
                    f h10 = h(this.f21044b.J[0]);
                    if (h10 != null) {
                        b(this.f21050h, h10, this.f21044b.J[0].c());
                    }
                    f h11 = h(this.f21044b.J[1]);
                    if (h11 != null) {
                        b(this.f21051i, h11, -this.f21044b.J[1].c());
                    }
                    this.f21050h.f21018b = true;
                    this.f21051i.f21018b = true;
                    return;
                } else if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f21050h, h12, this.f21044b.J[0].c());
                        b(this.f21051i, this.f21050h, this.f21047e.f21023g);
                        return;
                    }
                    return;
                } else {
                    o2.d dVar3 = dVarArr[1];
                    if (dVar3.f20373d != null) {
                        f h13 = h(dVar3);
                        if (h13 != null) {
                            b(this.f21051i, h13, -this.f21044b.J[1].c());
                            b(this.f21050h, this.f21051i, -this.f21047e.f21023g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof o2.i) && eVar2.G() != null && this.f21044b.m(d.b.CENTER).f20373d == null) {
                        b(this.f21050h, this.f21044b.G().f20387e.f21050h, this.f21044b.Q());
                        b(this.f21051i, this.f21050h, this.f21047e.f21023g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.f21046d == e.b.MATCH_CONSTRAINT) {
            o2.e eVar3 = this.f21044b;
            int i10 = eVar3.f20401l;
            if (i10 != 2) {
                if (i10 == 3) {
                    if (eVar3.f20403m == 3) {
                        this.f21050h.f21017a = this;
                        this.f21051i.f21017a = this;
                        l lVar = eVar3.f20389f;
                        lVar.f21050h.f21017a = this;
                        lVar.f21051i.f21017a = this;
                        gVar.f21017a = this;
                        if (eVar3.X()) {
                            this.f21047e.f21028l.add(this.f21044b.f20389f.f21047e);
                            this.f21044b.f20389f.f21047e.f21027k.add(this.f21047e);
                            l lVar2 = this.f21044b.f20389f;
                            lVar2.f21047e.f21017a = this;
                            this.f21047e.f21028l.add(lVar2.f21050h);
                            this.f21047e.f21028l.add(this.f21044b.f20389f.f21051i);
                            this.f21044b.f20389f.f21050h.f21027k.add(this.f21047e);
                            this.f21044b.f20389f.f21051i.f21027k.add(this.f21047e);
                        } else if (this.f21044b.V()) {
                            this.f21044b.f20389f.f21047e.f21028l.add(this.f21047e);
                            this.f21047e.f21027k.add(this.f21044b.f20389f.f21047e);
                        } else {
                            this.f21044b.f20389f.f21047e.f21028l.add(this.f21047e);
                        }
                    } else {
                        g gVar2 = eVar3.f20389f.f21047e;
                        gVar.f21028l.add(gVar2);
                        gVar2.f21027k.add(this.f21047e);
                        this.f21044b.f20389f.f21050h.f21027k.add(this.f21047e);
                        this.f21044b.f20389f.f21051i.f21027k.add(this.f21047e);
                        g gVar3 = this.f21047e;
                        gVar3.f21018b = true;
                        gVar3.f21027k.add(this.f21050h);
                        this.f21047e.f21027k.add(this.f21051i);
                        this.f21050h.f21028l.add(this.f21047e);
                        this.f21051i.f21028l.add(this.f21047e);
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
        }
        o2.e eVar4 = this.f21044b;
        o2.d[] dVarArr2 = eVar4.J;
        o2.d dVar4 = dVarArr2[0];
        o2.d dVar5 = dVar4.f20373d;
        if (dVar5 != null && dVarArr2[1].f20373d != null) {
            if (eVar4.V()) {
                this.f21050h.f21022f = this.f21044b.J[0].c();
                this.f21051i.f21022f = -this.f21044b.J[1].c();
                return;
            }
            f h14 = h(this.f21044b.J[0]);
            f h15 = h(this.f21044b.J[1]);
            h14.b(this);
            h15.b(this);
            this.f21052j = m.b.CENTER;
        } else if (dVar5 != null) {
            f h16 = h(dVar4);
            if (h16 != null) {
                b(this.f21050h, h16, this.f21044b.J[0].c());
                c(this.f21051i, this.f21050h, 1, this.f21047e);
            }
        } else {
            o2.d dVar6 = dVarArr2[1];
            if (dVar6.f20373d != null) {
                f h17 = h(dVar6);
                if (h17 != null) {
                    b(this.f21051i, h17, -this.f21044b.J[1].c());
                    c(this.f21050h, this.f21051i, -1, this.f21047e);
                }
            } else if (!(eVar4 instanceof o2.i) && eVar4.G() != null) {
                b(this.f21050h, this.f21044b.G().f20387e.f21050h, this.f21044b.Q());
                c(this.f21051i, this.f21050h, 1, this.f21047e);
            }
        }
    }

    @Override // p2.m
    public void e() {
        f fVar = this.f21050h;
        if (fVar.f21026j) {
            this.f21044b.F0(fVar.f21023g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p2.m
    public void f() {
        this.f21045c = null;
        this.f21050h.c();
        this.f21051i.c();
        this.f21047e.c();
        this.f21049g = false;
    }

    @Override // p2.m
    boolean m() {
        if (this.f21046d != e.b.MATCH_CONSTRAINT || this.f21044b.f20401l == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f21049g = false;
        this.f21050h.c();
        this.f21050h.f21026j = false;
        this.f21051i.c();
        this.f21051i.f21026j = false;
        this.f21047e.f21026j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f21044b.r();
    }
}
