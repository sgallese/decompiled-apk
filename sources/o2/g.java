package o2;

import java.util.ArrayList;
import o2.e;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: i1  reason: collision with root package name */
    private e[] f20439i1;
    private int L0 = -1;
    private int M0 = -1;
    private int N0 = -1;
    private int O0 = -1;
    private int P0 = -1;
    private int Q0 = -1;
    private float R0 = 0.5f;
    private float S0 = 0.5f;
    private float T0 = 0.5f;
    private float U0 = 0.5f;
    private float V0 = 0.5f;
    private float W0 = 0.5f;
    private int X0 = 0;
    private int Y0 = 0;
    private int Z0 = 2;

    /* renamed from: a1  reason: collision with root package name */
    private int f20431a1 = 2;

    /* renamed from: b1  reason: collision with root package name */
    private int f20432b1 = 0;

    /* renamed from: c1  reason: collision with root package name */
    private int f20433c1 = -1;

    /* renamed from: d1  reason: collision with root package name */
    private int f20434d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    private ArrayList<a> f20435e1 = new ArrayList<>();

    /* renamed from: f1  reason: collision with root package name */
    private e[] f20436f1 = null;

    /* renamed from: g1  reason: collision with root package name */
    private e[] f20437g1 = null;

    /* renamed from: h1  reason: collision with root package name */
    private int[] f20438h1 = null;

    /* renamed from: j1  reason: collision with root package name */
    private int f20440j1 = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Flow.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private int f20441a;

        /* renamed from: d  reason: collision with root package name */
        private d f20444d;

        /* renamed from: e  reason: collision with root package name */
        private d f20445e;

        /* renamed from: f  reason: collision with root package name */
        private d f20446f;

        /* renamed from: g  reason: collision with root package name */
        private d f20447g;

        /* renamed from: h  reason: collision with root package name */
        private int f20448h;

        /* renamed from: i  reason: collision with root package name */
        private int f20449i;

        /* renamed from: j  reason: collision with root package name */
        private int f20450j;

        /* renamed from: k  reason: collision with root package name */
        private int f20451k;

        /* renamed from: q  reason: collision with root package name */
        private int f20457q;

        /* renamed from: b  reason: collision with root package name */
        private e f20442b = null;

        /* renamed from: c  reason: collision with root package name */
        int f20443c = 0;

        /* renamed from: l  reason: collision with root package name */
        private int f20452l = 0;

        /* renamed from: m  reason: collision with root package name */
        private int f20453m = 0;

        /* renamed from: n  reason: collision with root package name */
        private int f20454n = 0;

        /* renamed from: o  reason: collision with root package name */
        private int f20455o = 0;

        /* renamed from: p  reason: collision with root package name */
        private int f20456p = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f20448h = 0;
            this.f20449i = 0;
            this.f20450j = 0;
            this.f20451k = 0;
            this.f20457q = 0;
            this.f20441a = i10;
            this.f20444d = dVar;
            this.f20445e = dVar2;
            this.f20446f = dVar3;
            this.f20447g = dVar4;
            this.f20448h = g.this.P0();
            this.f20449i = g.this.R0();
            this.f20450j = g.this.Q0();
            this.f20451k = g.this.O0();
            this.f20457q = i11;
        }

        private void h() {
            this.f20452l = 0;
            this.f20453m = 0;
            this.f20442b = null;
            this.f20443c = 0;
            int i10 = this.f20455o;
            for (int i11 = 0; i11 < i10 && this.f20454n + i11 < g.this.f20440j1; i11++) {
                e eVar = g.this.f20439i1[this.f20454n + i11];
                if (this.f20441a != 0) {
                    int B1 = g.this.B1(eVar, this.f20457q);
                    int A1 = g.this.A1(eVar, this.f20457q);
                    int i12 = g.this.Y0;
                    if (eVar.O() == 8) {
                        i12 = 0;
                    }
                    this.f20453m += A1 + i12;
                    if (this.f20442b == null || this.f20443c < B1) {
                        this.f20442b = eVar;
                        this.f20443c = B1;
                        this.f20452l = B1;
                    }
                } else {
                    int P = eVar.P();
                    int i13 = g.this.X0;
                    if (eVar.O() == 8) {
                        i13 = 0;
                    }
                    this.f20452l += P + i13;
                    int A12 = g.this.A1(eVar, this.f20457q);
                    if (this.f20442b == null || this.f20443c < A12) {
                        this.f20442b = eVar;
                        this.f20443c = A12;
                        this.f20453m = A12;
                    }
                }
            }
        }

        public void b(e eVar) {
            int i10 = 0;
            if (this.f20441a == 0) {
                int B1 = g.this.B1(eVar, this.f20457q);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    this.f20456p++;
                    B1 = 0;
                }
                int i11 = g.this.X0;
                if (eVar.O() != 8) {
                    i10 = i11;
                }
                this.f20452l += B1 + i10;
                int A1 = g.this.A1(eVar, this.f20457q);
                if (this.f20442b == null || this.f20443c < A1) {
                    this.f20442b = eVar;
                    this.f20443c = A1;
                    this.f20453m = A1;
                }
            } else {
                int B12 = g.this.B1(eVar, this.f20457q);
                int A12 = g.this.A1(eVar, this.f20457q);
                if (eVar.M() == e.b.MATCH_CONSTRAINT) {
                    this.f20456p++;
                    A12 = 0;
                }
                int i12 = g.this.Y0;
                if (eVar.O() != 8) {
                    i10 = i12;
                }
                this.f20453m += A12 + i10;
                if (this.f20442b == null || this.f20443c < B12) {
                    this.f20442b = eVar;
                    this.f20443c = B12;
                    this.f20452l = B12;
                }
            }
            this.f20455o++;
        }

        public void c() {
            this.f20443c = 0;
            this.f20442b = null;
            this.f20452l = 0;
            this.f20453m = 0;
            this.f20454n = 0;
            this.f20455o = 0;
            this.f20456p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            int i11 = this.f20455o;
            for (int i12 = 0; i12 < i11 && this.f20454n + i12 < g.this.f20440j1; i12++) {
                e eVar2 = g.this.f20439i1[this.f20454n + i12];
                if (eVar2 != null) {
                    eVar2.Z();
                }
            }
            if (i11 == 0 || this.f20442b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = z10 ? (i11 - 1) - i15 : i15;
                if (this.f20454n + i16 >= g.this.f20440j1) {
                    break;
                }
                if (g.this.f20439i1[this.f20454n + i16].O() == 0) {
                    if (i13 == -1) {
                        i13 = i15;
                    }
                    i14 = i15;
                }
            }
            e eVar3 = null;
            if (this.f20441a == 0) {
                e eVar4 = this.f20442b;
                eVar4.y0(g.this.M0);
                int i17 = this.f20449i;
                if (i10 > 0) {
                    i17 += g.this.Y0;
                }
                eVar4.C.a(this.f20445e, i17);
                if (z11) {
                    eVar4.E.a(this.f20447g, this.f20451k);
                }
                if (i10 > 0) {
                    this.f20445e.f20371b.E.a(eVar4.C, 0);
                }
                if (g.this.f20431a1 == 3 && !eVar4.S()) {
                    for (int i18 = 0; i18 < i11; i18++) {
                        int i19 = z10 ? (i11 - 1) - i18 : i18;
                        if (this.f20454n + i19 >= g.this.f20440j1) {
                            break;
                        }
                        eVar = g.this.f20439i1[this.f20454n + i19];
                        if (eVar.S()) {
                            break;
                        }
                    }
                }
                eVar = eVar4;
                int i20 = 0;
                while (i20 < i11) {
                    int i21 = z10 ? (i11 - 1) - i20 : i20;
                    if (this.f20454n + i21 >= g.this.f20440j1) {
                        return;
                    }
                    e eVar5 = g.this.f20439i1[this.f20454n + i21];
                    if (i20 == 0) {
                        eVar5.j(eVar5.B, this.f20444d, this.f20448h);
                    }
                    if (i21 == 0) {
                        int i22 = g.this.L0;
                        float f10 = g.this.R0;
                        if (this.f20454n != 0 || g.this.N0 == -1) {
                            if (z11 && g.this.P0 != -1) {
                                i22 = g.this.P0;
                                f10 = g.this.V0;
                            }
                        } else {
                            i22 = g.this.N0;
                            f10 = g.this.T0;
                        }
                        eVar5.j0(i22);
                        eVar5.i0(f10);
                    }
                    if (i20 == i11 - 1) {
                        eVar5.j(eVar5.D, this.f20446f, this.f20450j);
                    }
                    if (eVar3 != null) {
                        eVar5.B.a(eVar3.D, g.this.X0);
                        if (i20 == i13) {
                            eVar5.B.n(this.f20448h);
                        }
                        eVar3.D.a(eVar5.B, 0);
                        if (i20 == i14 + 1) {
                            eVar3.D.n(this.f20450j);
                        }
                    }
                    if (eVar5 != eVar4) {
                        if (g.this.f20431a1 != 3 || !eVar.S() || eVar5 == eVar || !eVar5.S()) {
                            int i23 = g.this.f20431a1;
                            if (i23 == 0) {
                                eVar5.C.a(eVar4.C, 0);
                            } else if (i23 == 1) {
                                eVar5.E.a(eVar4.E, 0);
                            } else if (z12) {
                                eVar5.C.a(this.f20445e, this.f20449i);
                                eVar5.E.a(this.f20447g, this.f20451k);
                            } else {
                                eVar5.C.a(eVar4.C, 0);
                                eVar5.E.a(eVar4.E, 0);
                            }
                        } else {
                            eVar5.F.a(eVar.F, 0);
                        }
                    }
                    i20++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f20442b;
            eVar6.j0(g.this.L0);
            int i24 = this.f20448h;
            if (i10 > 0) {
                i24 += g.this.X0;
            }
            if (z10) {
                eVar6.D.a(this.f20446f, i24);
                if (z11) {
                    eVar6.B.a(this.f20444d, this.f20450j);
                }
                if (i10 > 0) {
                    this.f20446f.f20371b.B.a(eVar6.D, 0);
                }
            } else {
                eVar6.B.a(this.f20444d, i24);
                if (z11) {
                    eVar6.D.a(this.f20446f, this.f20450j);
                }
                if (i10 > 0) {
                    this.f20444d.f20371b.D.a(eVar6.B, 0);
                }
            }
            int i25 = 0;
            while (i25 < i11 && this.f20454n + i25 < g.this.f20440j1) {
                e eVar7 = g.this.f20439i1[this.f20454n + i25];
                if (i25 == 0) {
                    eVar7.j(eVar7.C, this.f20445e, this.f20449i);
                    int i26 = g.this.M0;
                    float f11 = g.this.S0;
                    if (this.f20454n != 0 || g.this.O0 == -1) {
                        if (z11 && g.this.Q0 != -1) {
                            i26 = g.this.Q0;
                            f11 = g.this.W0;
                        }
                    } else {
                        i26 = g.this.O0;
                        f11 = g.this.U0;
                    }
                    eVar7.y0(i26);
                    eVar7.x0(f11);
                }
                if (i25 == i11 - 1) {
                    eVar7.j(eVar7.E, this.f20447g, this.f20451k);
                }
                if (eVar3 != null) {
                    eVar7.C.a(eVar3.E, g.this.Y0);
                    if (i25 == i13) {
                        eVar7.C.n(this.f20449i);
                    }
                    eVar3.E.a(eVar7.C, 0);
                    if (i25 == i14 + 1) {
                        eVar3.E.n(this.f20451k);
                    }
                }
                if (eVar7 != eVar6) {
                    if (z10) {
                        int i27 = g.this.Z0;
                        if (i27 == 0) {
                            eVar7.D.a(eVar6.D, 0);
                        } else if (i27 == 1) {
                            eVar7.B.a(eVar6.B, 0);
                        } else if (i27 == 2) {
                            eVar7.B.a(eVar6.B, 0);
                            eVar7.D.a(eVar6.D, 0);
                        }
                    } else {
                        int i28 = g.this.Z0;
                        if (i28 == 0) {
                            eVar7.B.a(eVar6.B, 0);
                        } else if (i28 == 1) {
                            eVar7.D.a(eVar6.D, 0);
                        } else if (i28 == 2) {
                            if (z12) {
                                eVar7.B.a(this.f20444d, this.f20448h);
                                eVar7.D.a(this.f20446f, this.f20450j);
                            } else {
                                eVar7.B.a(eVar6.B, 0);
                                eVar7.D.a(eVar6.D, 0);
                            }
                        }
                        i25++;
                        eVar3 = eVar7;
                    }
                }
                i25++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            if (this.f20441a == 1) {
                return this.f20453m - g.this.Y0;
            }
            return this.f20453m;
        }

        public int f() {
            if (this.f20441a == 0) {
                return this.f20452l - g.this.X0;
            }
            return this.f20452l;
        }

        public void g(int i10) {
            int i11 = this.f20456p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f20455o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f20454n + i14 < g.this.f20440j1; i14++) {
                e eVar = g.this.f20439i1[this.f20454n + i14];
                if (this.f20441a == 0) {
                    if (eVar != null && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f20401l == 0) {
                        g.this.T0(eVar, e.b.FIXED, i13, eVar.M(), eVar.v());
                    }
                } else if (eVar != null && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f20403m == 0) {
                    g.this.T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i13);
                }
            }
            h();
        }

        public void i(int i10) {
            this.f20454n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f20441a = i10;
            this.f20444d = dVar;
            this.f20445e = dVar2;
            this.f20446f = dVar3;
            this.f20447g = dVar4;
            this.f20448h = i11;
            this.f20449i = i12;
            this.f20450j = i13;
            this.f20451k = i14;
            this.f20457q = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A1(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.M() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f20403m;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f20417t * i10);
                if (i12 != eVar.v()) {
                    T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.v();
            } else {
                if (i11 == 3) {
                    return (int) ((eVar.P() * eVar.Q) + 0.5f);
                }
            }
        }
        return eVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B1(e eVar, int i10) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.y() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f20401l;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f20411q * i10);
                if (i12 != eVar.P()) {
                    T0(eVar, e.b.FIXED, i12, eVar.M(), eVar.v());
                }
                return i12;
            } else if (i11 == 1) {
                return eVar.P();
            } else {
                if (i11 == 3) {
                    return (int) ((eVar.v() * eVar.Q) + 0.5f);
                }
            }
        }
        return eVar.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C1(o2.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.g.C1(o2.e[], int, int, int, int[]):void");
    }

    private void D1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        int i15;
        d dVar;
        int Q0;
        d dVar2;
        int O0;
        boolean z12;
        int i16;
        if (i10 == 0) {
            return;
        }
        this.f20435e1.clear();
        a aVar = new a(i11, this.B, this.C, this.D, this.E, i12);
        this.f20435e1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int B1 = B1(eVar, i12);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                if ((i17 == i12 || this.X0 + i17 + B1 > i12) && aVar.f20442b != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12 && i18 > 0 && (i16 = this.f20433c1) > 0 && i18 % i16 == 0) {
                    z12 = true;
                }
                if (z12) {
                    aVar = new a(i11, this.B, this.C, this.D, this.E, i12);
                    aVar.i(i18);
                    this.f20435e1.add(aVar);
                } else if (i18 > 0) {
                    i17 += this.X0 + B1;
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = B1;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int A1 = A1(eVar2, i12);
                if (eVar2.M() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                if ((i20 == i12 || this.Y0 + i20 + A1 > i12) && aVar.f20442b != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && i21 > 0 && (i14 = this.f20433c1) > 0 && i21 % i14 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = new a(i11, this.B, this.C, this.D, this.E, i12);
                    aVar.i(i21);
                    this.f20435e1.add(aVar);
                } else if (i21 > 0) {
                    i20 += this.Y0 + A1;
                    aVar.b(eVar2);
                    i21++;
                    i13 = i22;
                }
                i20 = A1;
                aVar.b(eVar2);
                i21++;
                i13 = i22;
            }
        }
        int size = this.f20435e1.size();
        d dVar3 = this.B;
        d dVar4 = this.C;
        d dVar5 = this.D;
        d dVar6 = this.E;
        int P0 = P0();
        int R0 = R0();
        int Q02 = Q0();
        int O02 = O0();
        e.b y10 = y();
        e.b bVar = e.b.WRAP_CONTENT;
        if (y10 != bVar && M() != bVar) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i13 > 0 && z11) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = this.f20435e1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        int i24 = R0;
        int i25 = Q02;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = P0;
        d dVar7 = dVar4;
        d dVar8 = dVar3;
        int i30 = O02;
        while (i28 < size) {
            a aVar3 = this.f20435e1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar2 = this.f20435e1.get(i28 + 1).f20442b.C;
                    O0 = 0;
                } else {
                    dVar2 = this.E;
                    O0 = O0();
                }
                d dVar9 = aVar3.f20442b.E;
                d dVar10 = dVar8;
                d dVar11 = dVar8;
                int i31 = i26;
                d dVar12 = dVar7;
                int i32 = i27;
                d dVar13 = dVar5;
                d dVar14 = dVar5;
                i15 = i28;
                aVar3.j(i11, dVar10, dVar12, dVar13, dVar2, i29, i24, i25, O0, i12);
                int max = Math.max(i32, aVar3.f());
                i26 = i31 + aVar3.e();
                if (i15 > 0) {
                    i26 += this.Y0;
                }
                dVar8 = dVar11;
                i27 = max;
                dVar7 = dVar9;
                i24 = 0;
                dVar = dVar14;
                int i33 = O0;
                dVar6 = dVar2;
                i30 = i33;
            } else {
                d dVar15 = dVar8;
                int i34 = i26;
                int i35 = i27;
                i15 = i28;
                if (i15 < size - 1) {
                    dVar = this.f20435e1.get(i15 + 1).f20442b.B;
                    Q0 = 0;
                } else {
                    dVar = this.D;
                    Q0 = Q0();
                }
                d dVar16 = aVar3.f20442b.D;
                aVar3.j(i11, dVar15, dVar7, dVar, dVar6, i29, i24, Q0, i30, i12);
                i27 = i35 + aVar3.f();
                int max2 = Math.max(i34, aVar3.e());
                if (i15 > 0) {
                    i27 += this.X0;
                }
                i26 = max2;
                i25 = Q0;
                dVar8 = dVar16;
                i29 = 0;
            }
            i28 = i15 + 1;
            dVar5 = dVar;
        }
        iArr[0] = i27;
        iArr[1] = i26;
    }

    private void E1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f20435e1.size() == 0) {
            aVar = new a(i11, this.B, this.C, this.D, this.E, i12);
            this.f20435e1.add(aVar);
        } else {
            a aVar2 = this.f20435e1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i11, this.B, this.C, this.D, this.E, P0(), R0(), Q0(), O0(), i12);
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    private void z1(boolean z10) {
        e eVar;
        int i10;
        if (this.f20438h1 != null && this.f20437g1 != null && this.f20436f1 != null) {
            for (int i11 = 0; i11 < this.f20440j1; i11++) {
                this.f20439i1[i11].Z();
            }
            int[] iArr = this.f20438h1;
            int i12 = iArr[0];
            int i13 = iArr[1];
            e eVar2 = null;
            for (int i14 = 0; i14 < i12; i14++) {
                if (z10) {
                    i10 = (i12 - i14) - 1;
                } else {
                    i10 = i14;
                }
                e eVar3 = this.f20437g1[i10];
                if (eVar3 != null && eVar3.O() != 8) {
                    if (i14 == 0) {
                        eVar3.j(eVar3.B, this.B, P0());
                        eVar3.j0(this.L0);
                        eVar3.i0(this.R0);
                    }
                    if (i14 == i12 - 1) {
                        eVar3.j(eVar3.D, this.D, Q0());
                    }
                    if (i14 > 0) {
                        eVar3.j(eVar3.B, eVar2.D, this.X0);
                        eVar2.j(eVar2.D, eVar3.B, 0);
                    }
                    eVar2 = eVar3;
                }
            }
            for (int i15 = 0; i15 < i13; i15++) {
                e eVar4 = this.f20436f1[i15];
                if (eVar4 != null && eVar4.O() != 8) {
                    if (i15 == 0) {
                        eVar4.j(eVar4.C, this.C, R0());
                        eVar4.y0(this.M0);
                        eVar4.x0(this.S0);
                    }
                    if (i15 == i13 - 1) {
                        eVar4.j(eVar4.E, this.E, O0());
                    }
                    if (i15 > 0) {
                        eVar4.j(eVar4.C, eVar2.E, this.Y0);
                        eVar2.j(eVar2.E, eVar4.C, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i16 = 0; i16 < i12; i16++) {
                for (int i17 = 0; i17 < i13; i17++) {
                    int i18 = (i17 * i12) + i16;
                    if (this.f20434d1 == 1) {
                        i18 = (i16 * i13) + i17;
                    }
                    e[] eVarArr = this.f20439i1;
                    if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.O() != 8) {
                        e eVar5 = this.f20437g1[i16];
                        e eVar6 = this.f20436f1[i17];
                        if (eVar != eVar5) {
                            eVar.j(eVar.B, eVar5.B, 0);
                            eVar.j(eVar.D, eVar5.D, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.j(eVar.C, eVar6.C, 0);
                            eVar.j(eVar.E, eVar6.E, 0);
                        }
                    }
                }
            }
        }
    }

    public void F1(float f10) {
        this.T0 = f10;
    }

    public void G1(int i10) {
        this.N0 = i10;
    }

    public void H1(float f10) {
        this.U0 = f10;
    }

    public void I1(int i10) {
        this.O0 = i10;
    }

    public void J1(int i10) {
        this.Z0 = i10;
    }

    public void K1(float f10) {
        this.R0 = f10;
    }

    public void L1(int i10) {
        this.X0 = i10;
    }

    public void M1(int i10) {
        this.L0 = i10;
    }

    public void N1(float f10) {
        this.V0 = f10;
    }

    public void O1(int i10) {
        this.P0 = i10;
    }

    public void P1(float f10) {
        this.W0 = f10;
    }

    public void Q1(int i10) {
        this.Q0 = i10;
    }

    public void R1(int i10) {
        this.f20433c1 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    @Override // o2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S0(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.g.S0(int, int, int, int):void");
    }

    public void S1(int i10) {
        this.f20434d1 = i10;
    }

    public void T1(int i10) {
        this.f20431a1 = i10;
    }

    public void U1(float f10) {
        this.S0 = f10;
    }

    public void V1(int i10) {
        this.Y0 = i10;
    }

    public void W1(int i10) {
        this.M0 = i10;
    }

    public void X1(int i10) {
        this.f20432b1 = i10;
    }

    @Override // o2.e
    public void f(n2.d dVar) {
        boolean z10;
        boolean z11;
        super.f(dVar);
        if (G() != null) {
            z10 = ((f) G()).a1();
        } else {
            z10 = false;
        }
        int i10 = this.f20432b1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    z1(z10);
                }
            } else {
                int size = this.f20435e1.size();
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar = this.f20435e1.get(i11);
                    if (i11 == size - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    aVar.d(z10, i11, z11);
                }
            }
        } else if (this.f20435e1.size() > 0) {
            this.f20435e1.get(0).d(z10, 0, true);
        }
        W0(false);
    }
}
