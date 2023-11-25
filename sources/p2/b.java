package p2;

import java.util.ArrayList;
import o2.d;
import o2.e;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<o2.e> f20993a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f20994b = new a();

    /* renamed from: c  reason: collision with root package name */
    private o2.f f20995c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.b f20996a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f20997b;

        /* renamed from: c  reason: collision with root package name */
        public int f20998c;

        /* renamed from: d  reason: collision with root package name */
        public int f20999d;

        /* renamed from: e  reason: collision with root package name */
        public int f21000e;

        /* renamed from: f  reason: collision with root package name */
        public int f21001f;

        /* renamed from: g  reason: collision with root package name */
        public int f21002g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f21003h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f21004i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f21005j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: p2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0474b {
        void a();

        void b(o2.e eVar, a aVar);
    }

    public b(o2.f fVar) {
        this.f20995c = fVar;
    }

    private boolean a(InterfaceC0474b interfaceC0474b, o2.e eVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        this.f20994b.f20996a = eVar.y();
        this.f20994b.f20997b = eVar.M();
        this.f20994b.f20998c = eVar.P();
        this.f20994b.f20999d = eVar.v();
        a aVar = this.f20994b;
        aVar.f21004i = false;
        aVar.f21005j = z10;
        e.b bVar = aVar.f20996a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (aVar.f20997b == bVar2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && eVar.Q > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && eVar.Q > 0.0f) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 && eVar.f20405n[0] == 4) {
            aVar.f20996a = e.b.FIXED;
        }
        if (z14 && eVar.f20405n[1] == 4) {
            aVar.f20997b = e.b.FIXED;
        }
        interfaceC0474b.b(eVar, aVar);
        eVar.E0(this.f20994b.f21000e);
        eVar.h0(this.f20994b.f21001f);
        eVar.g0(this.f20994b.f21003h);
        eVar.b0(this.f20994b.f21002g);
        a aVar2 = this.f20994b;
        aVar2.f21005j = false;
        return aVar2.f21004i;
    }

    private void b(o2.f fVar) {
        int size = fVar.f20469w0.size();
        InterfaceC0474b U0 = fVar.U0();
        for (int i10 = 0; i10 < size; i10++) {
            o2.e eVar = fVar.f20469w0.get(i10);
            if (!(eVar instanceof o2.h) && (!eVar.f20387e.f21047e.f21026j || !eVar.f20389f.f21047e.f21026j)) {
                e.b s10 = eVar.s(0);
                boolean z10 = true;
                e.b s11 = eVar.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar || eVar.f20401l == 1 || s11 != bVar || eVar.f20403m == 1) {
                    z10 = false;
                }
                if (!z10) {
                    a(U0, eVar, false);
                }
            }
        }
        U0.a();
    }

    private void c(o2.f fVar, String str, int i10, int i11) {
        int E = fVar.E();
        int D = fVar.D();
        fVar.u0(0);
        fVar.t0(0);
        fVar.E0(i10);
        fVar.h0(i11);
        fVar.u0(E);
        fVar.t0(D);
        this.f20995c.K0();
    }

    public long d(o2.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i19;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i20;
        int i21;
        InterfaceC0474b interfaceC0474b;
        int i22;
        boolean z17;
        boolean z18;
        int i23;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        InterfaceC0474b U0 = fVar.U0();
        int size = fVar.f20469w0.size();
        int P = fVar.P();
        int v10 = fVar.v();
        boolean b10 = o2.k.b(i10, 128);
        if (!b10 && !o2.k.b(i10, 64)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            for (int i24 = 0; i24 < size; i24++) {
                o2.e eVar = fVar.f20469w0.get(i24);
                e.b y10 = eVar.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y10 == bVar) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (eVar.M() == bVar) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (z21 && z22 && eVar.t() > 0.0f) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if ((eVar.V() && z23) || ((eVar.X() && z23) || (eVar instanceof o2.l) || eVar.V() || eVar.X())) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            boolean z24 = n2.d.f20072r;
        }
        if ((i13 == 1073741824 && i15 == 1073741824) || b10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            int min = Math.min(fVar.C(), i14);
            int min2 = Math.min(fVar.B(), i16);
            if (i13 == 1073741824 && fVar.P() != min) {
                fVar.E0(min);
                fVar.X0();
            }
            if (i15 == 1073741824 && fVar.v() != min2) {
                fVar.h0(min2);
                fVar.X0();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z12 = fVar.R0(b10);
                i19 = 2;
            } else {
                boolean S0 = fVar.S0(b10);
                if (i13 == 1073741824) {
                    z18 = S0 & fVar.T0(b10, 0);
                    i23 = 1;
                } else {
                    z18 = S0;
                    i23 = 0;
                }
                if (i15 == 1073741824) {
                    boolean T0 = fVar.T0(b10, 1) & z18;
                    i19 = i23 + 1;
                    z12 = T0;
                } else {
                    i19 = i23;
                    z12 = z18;
                }
            }
            if (z12) {
                if (i13 == 1073741824) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (i15 == 1073741824) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                fVar.I0(z19, z20);
            }
        } else {
            z12 = false;
            i19 = 0;
        }
        if (!z12 || i19 != 2) {
            if (size > 0) {
                b(fVar);
            }
            int V0 = fVar.V0();
            int size2 = this.f20993a.size();
            if (size > 0) {
                c(fVar, "First pass", P, v10);
            }
            if (size2 > 0) {
                e.b y11 = fVar.y();
                e.b bVar2 = e.b.WRAP_CONTENT;
                if (y11 == bVar2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (fVar.M() == bVar2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int max = Math.max(fVar.P(), this.f20995c.E());
                int max2 = Math.max(fVar.v(), this.f20995c.D());
                int i25 = 0;
                boolean z25 = false;
                while (i25 < size2) {
                    o2.e eVar2 = this.f20993a.get(i25);
                    if (!(eVar2 instanceof o2.l)) {
                        i22 = V0;
                    } else {
                        int P2 = eVar2.P();
                        int v11 = eVar2.v();
                        i22 = V0;
                        boolean a10 = z25 | a(U0, eVar2, true);
                        int P3 = eVar2.P();
                        int v12 = eVar2.v();
                        if (P3 != P2) {
                            eVar2.E0(P3);
                            if (z13 && eVar2.I() > max) {
                                max = Math.max(max, eVar2.I() + eVar2.m(d.b.RIGHT).c());
                            }
                            z17 = true;
                        } else {
                            z17 = a10;
                        }
                        if (v12 != v11) {
                            eVar2.h0(v12);
                            if (z14 && eVar2.p() > max2) {
                                max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).c());
                            }
                            z17 = true;
                        }
                        z25 = z17 | ((o2.l) eVar2).V0();
                    }
                    i25++;
                    V0 = i22;
                }
                int i26 = V0;
                int i27 = 0;
                while (i27 < 2) {
                    int i28 = 0;
                    while (i28 < size2) {
                        o2.e eVar3 = this.f20993a.get(i28);
                        if (((eVar3 instanceof o2.i) && !(eVar3 instanceof o2.l)) || (eVar3 instanceof o2.h) || eVar3.O() == 8 || ((eVar3.f20387e.f21047e.f21026j && eVar3.f20389f.f21047e.f21026j) || (eVar3 instanceof o2.l))) {
                            i21 = i27;
                            i20 = size2;
                            interfaceC0474b = U0;
                        } else {
                            int P4 = eVar3.P();
                            int v13 = eVar3.v();
                            i20 = size2;
                            int n10 = eVar3.n();
                            i21 = i27;
                            z25 |= a(U0, eVar3, true);
                            int P5 = eVar3.P();
                            interfaceC0474b = U0;
                            int v14 = eVar3.v();
                            if (P5 != P4) {
                                eVar3.E0(P5);
                                if (z13 && eVar3.I() > max) {
                                    max = Math.max(max, eVar3.I() + eVar3.m(d.b.RIGHT).c());
                                }
                                z25 = true;
                            }
                            if (v14 != v13) {
                                eVar3.h0(v14);
                                if (z14 && eVar3.p() > max2) {
                                    max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).c());
                                }
                                z25 = true;
                            }
                            if (eVar3.S() && n10 != eVar3.n()) {
                                z25 = true;
                            }
                        }
                        i28++;
                        size2 = i20;
                        U0 = interfaceC0474b;
                        i27 = i21;
                    }
                    int i29 = i27;
                    int i30 = size2;
                    InterfaceC0474b interfaceC0474b2 = U0;
                    if (z25) {
                        c(fVar, "intermediate pass", P, v10);
                        z25 = false;
                    }
                    i27 = i29 + 1;
                    size2 = i30;
                    U0 = interfaceC0474b2;
                }
                if (z25) {
                    c(fVar, "2nd pass", P, v10);
                    if (fVar.P() < max) {
                        fVar.E0(max);
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (fVar.v() < max2) {
                        fVar.h0(max2);
                        z16 = true;
                    } else {
                        z16 = z15;
                    }
                    if (z16) {
                        c(fVar, "3rd pass", P, v10);
                    }
                }
                V0 = i26;
            }
            fVar.g1(V0);
            return 0L;
        }
        return 0L;
    }

    public void e(o2.f fVar) {
        this.f20993a.clear();
        int size = fVar.f20469w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            o2.e eVar = fVar.f20469w0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 != bVar) {
                e.b y11 = eVar.y();
                e.b bVar2 = e.b.MATCH_PARENT;
                if (y11 != bVar2 && eVar.M() != bVar && eVar.M() != bVar2) {
                }
            }
            this.f20993a.add(eVar);
        }
        fVar.X0();
    }
}
