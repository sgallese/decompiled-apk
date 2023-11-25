package o2;

import java.util.ArrayList;
import o2.e;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    protected e f20348a;

    /* renamed from: b  reason: collision with root package name */
    protected e f20349b;

    /* renamed from: c  reason: collision with root package name */
    protected e f20350c;

    /* renamed from: d  reason: collision with root package name */
    protected e f20351d;

    /* renamed from: e  reason: collision with root package name */
    protected e f20352e;

    /* renamed from: f  reason: collision with root package name */
    protected e f20353f;

    /* renamed from: g  reason: collision with root package name */
    protected e f20354g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f20355h;

    /* renamed from: i  reason: collision with root package name */
    protected int f20356i;

    /* renamed from: j  reason: collision with root package name */
    protected int f20357j;

    /* renamed from: k  reason: collision with root package name */
    protected float f20358k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f20359l;

    /* renamed from: m  reason: collision with root package name */
    int f20360m;

    /* renamed from: n  reason: collision with root package name */
    int f20361n;

    /* renamed from: o  reason: collision with root package name */
    boolean f20362o;

    /* renamed from: p  reason: collision with root package name */
    private int f20363p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f20364q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f20365r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f20366s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f20367t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f20368u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f20369v;

    public c(e eVar, int i10, boolean z10) {
        this.f20348a = eVar;
        this.f20363p = i10;
        this.f20364q = z10;
    }

    private void b() {
        int i10 = this.f20363p * 2;
        e eVar = this.f20348a;
        boolean z10 = true;
        this.f20362o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f20356i++;
            e[] eVarArr = eVar.f20416s0;
            int i11 = this.f20363p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f20414r0[i11] = null;
            if (eVar.O() != 8) {
                this.f20359l++;
                e.b s10 = eVar.s(this.f20363p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar) {
                    this.f20360m += eVar.A(this.f20363p);
                }
                int c10 = this.f20360m + eVar.J[i10].c();
                this.f20360m = c10;
                int i12 = i10 + 1;
                this.f20360m = c10 + eVar.J[i12].c();
                int c11 = this.f20361n + eVar.J[i10].c();
                this.f20361n = c11;
                this.f20361n = c11 + eVar.J[i12].c();
                if (this.f20349b == null) {
                    this.f20349b = eVar;
                }
                this.f20351d = eVar;
                e.b[] bVarArr = eVar.M;
                int i13 = this.f20363p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f20405n[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f20357j++;
                        float f10 = eVar.f20412q0[i13];
                        if (f10 > 0.0f) {
                            this.f20358k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f20365r = true;
                            } else {
                                this.f20366s = true;
                            }
                            if (this.f20355h == null) {
                                this.f20355h = new ArrayList<>();
                            }
                            this.f20355h.add(eVar);
                        }
                        if (this.f20353f == null) {
                            this.f20353f = eVar;
                        }
                        e eVar4 = this.f20354g;
                        if (eVar4 != null) {
                            eVar4.f20414r0[this.f20363p] = eVar;
                        }
                        this.f20354g = eVar;
                    }
                    if (this.f20363p == 0) {
                        if (eVar.f20401l != 0) {
                            this.f20362o = false;
                        } else if (eVar.f20407o != 0 || eVar.f20409p != 0) {
                            this.f20362o = false;
                        }
                    } else if (eVar.f20403m != 0) {
                        this.f20362o = false;
                    } else if (eVar.f20413r != 0 || eVar.f20415s != 0) {
                        this.f20362o = false;
                    }
                    if (eVar.Q != 0.0f) {
                        this.f20362o = false;
                        this.f20368u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f20416s0[this.f20363p] = eVar;
            }
            d dVar = eVar.J[i10 + 1].f20373d;
            if (dVar != null) {
                e eVar5 = dVar.f20371b;
                d dVar2 = eVar5.J[i10].f20373d;
                if (dVar2 != null && dVar2.f20371b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f20349b;
        if (eVar6 != null) {
            this.f20360m -= eVar6.J[i10].c();
        }
        e eVar7 = this.f20351d;
        if (eVar7 != null) {
            this.f20360m -= eVar7.J[i10 + 1].c();
        }
        this.f20350c = eVar;
        if (this.f20363p == 0 && this.f20364q) {
            this.f20352e = eVar;
        } else {
            this.f20352e = this.f20348a;
        }
        if (!this.f20366s || !this.f20365r) {
            z10 = false;
        }
        this.f20367t = z10;
    }

    private static boolean c(e eVar, int i10) {
        int i11;
        if (eVar.O() != 8 && eVar.M[i10] == e.b.MATCH_CONSTRAINT && ((i11 = eVar.f20405n[i10]) == 0 || i11 == 3)) {
            return true;
        }
        return false;
    }

    public void a() {
        if (!this.f20369v) {
            b();
        }
        this.f20369v = true;
    }
}
