package o2;

import java.util.ArrayList;
import o2.d;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: v0  reason: collision with root package name */
    public static float f20378v0 = 0.5f;
    d I;
    public d[] J;
    protected ArrayList<d> K;
    private boolean[] L;
    public b[] M;
    public e N;
    int O;
    int P;
    public float Q;
    protected int R;
    protected int S;
    protected int T;
    int U;
    int V;
    protected int W;
    protected int X;
    int Y;
    protected int Z;

    /* renamed from: a0  reason: collision with root package name */
    protected int f20380a0;

    /* renamed from: b0  reason: collision with root package name */
    float f20382b0;

    /* renamed from: c  reason: collision with root package name */
    public p2.c f20383c;

    /* renamed from: c0  reason: collision with root package name */
    float f20384c0;

    /* renamed from: d  reason: collision with root package name */
    public p2.c f20385d;

    /* renamed from: d0  reason: collision with root package name */
    private Object f20386d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f20388e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f20390f0;

    /* renamed from: g0  reason: collision with root package name */
    private String f20392g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f20394h0;

    /* renamed from: i0  reason: collision with root package name */
    boolean f20396i0;

    /* renamed from: j0  reason: collision with root package name */
    boolean f20398j0;

    /* renamed from: k0  reason: collision with root package name */
    boolean f20400k0;

    /* renamed from: l0  reason: collision with root package name */
    boolean f20402l0;

    /* renamed from: m0  reason: collision with root package name */
    int f20404m0;

    /* renamed from: n0  reason: collision with root package name */
    int f20406n0;

    /* renamed from: o0  reason: collision with root package name */
    boolean f20408o0;

    /* renamed from: p0  reason: collision with root package name */
    boolean f20410p0;

    /* renamed from: q0  reason: collision with root package name */
    public float[] f20412q0;

    /* renamed from: r0  reason: collision with root package name */
    protected e[] f20414r0;

    /* renamed from: s0  reason: collision with root package name */
    protected e[] f20416s0;

    /* renamed from: t0  reason: collision with root package name */
    e f20418t0;

    /* renamed from: u0  reason: collision with root package name */
    e f20420u0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f20425z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20379a = false;

    /* renamed from: b  reason: collision with root package name */
    public p2.m[] f20381b = new p2.m[2];

    /* renamed from: e  reason: collision with root package name */
    public p2.j f20387e = new p2.j(this);

    /* renamed from: f  reason: collision with root package name */
    public p2.l f20389f = new p2.l(this);

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f20391g = {true, true};

    /* renamed from: h  reason: collision with root package name */
    public int[] f20393h = {0, 0, 0, 0};

    /* renamed from: i  reason: collision with root package name */
    boolean f20395i = false;

    /* renamed from: j  reason: collision with root package name */
    public int f20397j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f20399k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f20401l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f20403m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int[] f20405n = new int[2];

    /* renamed from: o  reason: collision with root package name */
    public int f20407o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f20409p = 0;

    /* renamed from: q  reason: collision with root package name */
    public float f20411q = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    public int f20413r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f20415s = 0;

    /* renamed from: t  reason: collision with root package name */
    public float f20417t = 1.0f;

    /* renamed from: u  reason: collision with root package name */
    int f20419u = -1;

    /* renamed from: v  reason: collision with root package name */
    float f20421v = 1.0f;

    /* renamed from: w  reason: collision with root package name */
    private int[] f20422w = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: x  reason: collision with root package name */
    private float f20423x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    private boolean f20424y = false;
    private boolean A = false;
    public d B = new d(this, d.b.LEFT);
    public d C = new d(this, d.b.TOP);
    public d D = new d(this, d.b.RIGHT);
    public d E = new d(this, d.b.BOTTOM);
    d F = new d(this, d.b.BASELINE);
    d G = new d(this, d.b.CENTER_X);
    d H = new d(this, d.b.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20426a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f20427b;

        static {
            int[] iArr = new int[b.values().length];
            f20427b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20427b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20427b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20427b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f20426a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20426a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20426a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20426a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20426a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20426a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20426a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20426a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20426a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.I = dVar;
        this.J = new d[]{this.B, this.D, this.C, this.E, this.F, dVar};
        this.K = new ArrayList<>();
        this.L = new boolean[2];
        b bVar = b.FIXED;
        this.M = new b[]{bVar, bVar};
        this.N = null;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f10 = f20378v0;
        this.f20382b0 = f10;
        this.f20384c0 = f10;
        this.f20388e0 = 0;
        this.f20390f0 = 0;
        this.f20392g0 = null;
        this.f20394h0 = null;
        this.f20400k0 = false;
        this.f20402l0 = false;
        this.f20404m0 = 0;
        this.f20406n0 = 0;
        this.f20412q0 = new float[]{-1.0f, -1.0f};
        this.f20414r0 = new e[]{null, null};
        this.f20416s0 = new e[]{null, null};
        this.f20418t0 = null;
        this.f20420u0 = null;
        d();
    }

    private boolean U(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.J;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f20373d;
        if (dVar4 != null && dVar4.f20373d != dVar3 && (dVar2 = (dVar = dVarArr[i11 + 1]).f20373d) != null && dVar2.f20373d == dVar) {
            return true;
        }
        return false;
    }

    private void d() {
        this.K.add(this.B);
        this.K.add(this.C);
        this.K.add(this.D);
        this.K.add(this.E);
        this.K.add(this.G);
        this.K.add(this.H);
        this.K.add(this.I);
        this.K.add(this.F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x0449, code lost:
    
        if (r1[r22] == r4) goto L298;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0326 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h(n2.d r32, boolean r33, boolean r34, boolean r35, boolean r36, n2.i r37, n2.i r38, o2.e.b r39, boolean r40, o2.d r41, o2.d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.e.h(n2.d, boolean, boolean, boolean, boolean, n2.i, n2.i, o2.e$b, boolean, o2.d, o2.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int A(int i10) {
        if (i10 == 0) {
            return P();
        }
        if (i10 == 1) {
            return v();
        }
        return 0;
    }

    public void A0(b bVar) {
        this.M[1] = bVar;
    }

    public int B() {
        return this.f20422w[1];
    }

    public void B0(int i10, int i11, int i12, float f10) {
        this.f20403m = i10;
        this.f20413r = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f20415s = i12;
        this.f20417t = f10;
        if (f10 > 0.0f && f10 < 1.0f && i10 == 0) {
            this.f20403m = 2;
        }
    }

    public int C() {
        return this.f20422w[0];
    }

    public void C0(float f10) {
        this.f20412q0[1] = f10;
    }

    public int D() {
        return this.f20380a0;
    }

    public void D0(int i10) {
        this.f20390f0 = i10;
    }

    public int E() {
        return this.Z;
    }

    public void E0(int i10) {
        this.O = i10;
        int i11 = this.Z;
        if (i10 < i11) {
            this.O = i11;
        }
    }

    public e F(int i10) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.D;
            d dVar4 = dVar3.f20373d;
            if (dVar4 != null && dVar4.f20373d == dVar3) {
                return dVar4.f20371b;
            }
            return null;
        } else if (i10 == 1 && (dVar2 = (dVar = this.E).f20373d) != null && dVar2.f20373d == dVar) {
            return dVar2.f20371b;
        } else {
            return null;
        }
    }

    public void F0(int i10) {
        this.S = i10;
    }

    public e G() {
        return this.N;
    }

    public void G0(int i10) {
        this.T = i10;
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.B;
            d dVar4 = dVar3.f20373d;
            if (dVar4 != null && dVar4.f20373d == dVar3) {
                return dVar4.f20371b;
            }
            return null;
        } else if (i10 == 1 && (dVar2 = (dVar = this.C).f20373d) != null && dVar2.f20373d == dVar) {
            return dVar2.f20371b;
        } else {
            return null;
        }
    }

    public void H0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f20419u == -1) {
            if (z12 && !z13) {
                this.f20419u = 0;
            } else if (!z12 && z13) {
                this.f20419u = 1;
                if (this.R == -1) {
                    this.f20421v = 1.0f / this.f20421v;
                }
            }
        }
        if (this.f20419u == 0 && (!this.C.j() || !this.E.j())) {
            this.f20419u = 1;
        } else if (this.f20419u == 1 && (!this.B.j() || !this.D.j())) {
            this.f20419u = 0;
        }
        if (this.f20419u == -1 && (!this.C.j() || !this.E.j() || !this.B.j() || !this.D.j())) {
            if (this.C.j() && this.E.j()) {
                this.f20419u = 0;
            } else if (this.B.j() && this.D.j()) {
                this.f20421v = 1.0f / this.f20421v;
                this.f20419u = 1;
            }
        }
        if (this.f20419u == -1) {
            int i10 = this.f20407o;
            if (i10 > 0 && this.f20413r == 0) {
                this.f20419u = 0;
            } else if (i10 == 0 && this.f20413r > 0) {
                this.f20421v = 1.0f / this.f20421v;
                this.f20419u = 1;
            }
        }
    }

    public int I() {
        return Q() + this.O;
    }

    public void I0(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f20387e.k();
        boolean k11 = z11 & this.f20389f.k();
        p2.j jVar = this.f20387e;
        int i12 = jVar.f21050h.f21023g;
        p2.l lVar = this.f20389f;
        int i13 = lVar.f21050h.f21023g;
        int i14 = jVar.f21051i.f21023g;
        int i15 = lVar.f21051i.f21023g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.S = i12;
        }
        if (k11) {
            this.T = i13;
        }
        if (this.f20390f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        if (k10) {
            if (this.M[0] == b.FIXED && i17 < (i11 = this.O)) {
                i17 = i11;
            }
            this.O = i17;
            int i19 = this.Z;
            if (i17 < i19) {
                this.O = i19;
            }
        }
        if (k11) {
            if (this.M[1] == b.FIXED && i18 < (i10 = this.P)) {
                i18 = i10;
            }
            this.P = i18;
            int i20 = this.f20380a0;
            if (i18 < i20) {
                this.P = i20;
            }
        }
    }

    public p2.m J(int i10) {
        if (i10 == 0) {
            return this.f20387e;
        }
        if (i10 == 1) {
            return this.f20389f;
        }
        return null;
    }

    public void J0(n2.d dVar) {
        int x10 = dVar.x(this.B);
        int x11 = dVar.x(this.C);
        int x12 = dVar.x(this.D);
        int x13 = dVar.x(this.E);
        p2.j jVar = this.f20387e;
        p2.f fVar = jVar.f21050h;
        if (fVar.f21026j) {
            p2.f fVar2 = jVar.f21051i;
            if (fVar2.f21026j) {
                x10 = fVar.f21023g;
                x12 = fVar2.f21023g;
            }
        }
        p2.l lVar = this.f20389f;
        p2.f fVar3 = lVar.f21050h;
        if (fVar3.f21026j) {
            p2.f fVar4 = lVar.f21051i;
            if (fVar4.f21026j) {
                x11 = fVar3.f21023g;
                x13 = fVar4.f21023g;
            }
        }
        int i10 = x13 - x11;
        if (x12 - x10 < 0 || i10 < 0 || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE) {
            x10 = 0;
            x13 = 0;
            x11 = 0;
            x12 = 0;
        }
        f0(x10, x11, x12, x13);
    }

    public float K() {
        return this.f20384c0;
    }

    public int L() {
        return this.f20406n0;
    }

    public b M() {
        return this.M[1];
    }

    public int N() {
        int i10 = 0;
        if (this.B != null) {
            i10 = 0 + this.C.f20374e;
        }
        if (this.D != null) {
            return i10 + this.E.f20374e;
        }
        return i10;
    }

    public int O() {
        return this.f20390f0;
    }

    public int P() {
        if (this.f20390f0 == 8) {
            return 0;
        }
        return this.O;
    }

    public int Q() {
        e eVar = this.N;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).C0 + this.S;
        }
        return this.S;
    }

    public int R() {
        e eVar = this.N;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).D0 + this.T;
        }
        return this.T;
    }

    public boolean S() {
        return this.f20424y;
    }

    public void T(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).b(eVar.m(bVar2), i10, i11, true);
    }

    public boolean V() {
        d dVar = this.B;
        d dVar2 = dVar.f20373d;
        if (dVar2 == null || dVar2.f20373d != dVar) {
            d dVar3 = this.D;
            d dVar4 = dVar3.f20373d;
            if (dVar4 != null && dVar4.f20373d == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean W() {
        return this.f20425z;
    }

    public boolean X() {
        d dVar = this.C;
        d dVar2 = dVar.f20373d;
        if (dVar2 == null || dVar2.f20373d != dVar) {
            d dVar3 = this.E;
            d dVar4 = dVar3.f20373d;
            if (dVar4 != null && dVar4.f20373d == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void Y() {
        this.B.l();
        this.C.l();
        this.D.l();
        this.E.l();
        this.F.l();
        this.G.l();
        this.H.l();
        this.I.l();
        this.N = null;
        this.f20423x = 0.0f;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f20380a0 = 0;
        float f10 = f20378v0;
        this.f20382b0 = f10;
        this.f20384c0 = f10;
        b[] bVarArr = this.M;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f20386d0 = null;
        this.f20388e0 = 0;
        this.f20390f0 = 0;
        this.f20394h0 = null;
        this.f20396i0 = false;
        this.f20398j0 = false;
        this.f20404m0 = 0;
        this.f20406n0 = 0;
        this.f20408o0 = false;
        this.f20410p0 = false;
        float[] fArr = this.f20412q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f20397j = -1;
        this.f20399k = -1;
        int[] iArr = this.f20422w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f20401l = 0;
        this.f20403m = 0;
        this.f20411q = 1.0f;
        this.f20417t = 1.0f;
        this.f20409p = Integer.MAX_VALUE;
        this.f20415s = Integer.MAX_VALUE;
        this.f20407o = 0;
        this.f20413r = 0;
        this.f20395i = false;
        this.f20419u = -1;
        this.f20421v = 1.0f;
        this.f20400k0 = false;
        this.f20402l0 = false;
        boolean[] zArr = this.f20391g;
        zArr[0] = true;
        zArr[1] = true;
        this.A = false;
        boolean[] zArr2 = this.L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void Z() {
        e G = G();
        if (G != null && (G instanceof f) && ((f) G()).W0()) {
            return;
        }
        int size = this.K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K.get(i10).l();
        }
    }

    public void a0(n2.c cVar) {
        this.B.m(cVar);
        this.C.m(cVar);
        this.D.m(cVar);
        this.E.m(cVar);
        this.F.m(cVar);
        this.I.m(cVar);
        this.G.m(cVar);
        this.H.m(cVar);
    }

    public void b0(int i10) {
        boolean z10;
        this.Y = i10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20424y = z10;
    }

    public void c0(Object obj) {
        this.f20386d0 = obj;
    }

    public void d0(String str) {
        this.f20392g0 = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        if (!(this instanceof l) && !(this instanceof h)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0087 -> B:41:0x0088). Please submit an issue!!! */
    public void e0(String str) {
        float f10;
        int i10 = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i11 = 0;
            int i12 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                }
                i12 = i11;
                i11 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i11, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i12 == 1) {
                            f10 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f10 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f10 = 0.0f;
            } else {
                String substring4 = str.substring(i11);
                if (substring4.length() > 0) {
                    f10 = Float.parseFloat(substring4);
                }
                f10 = 0.0f;
            }
            i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
            if (i10 > 0) {
                this.Q = f10;
                this.R = i12;
                return;
            }
            return;
        }
        this.Q = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(n2.d r48) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.e.f(n2.d):void");
    }

    public void f0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.S = i10;
        this.T = i11;
        if (this.f20390f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        b[] bVarArr = this.M;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.O)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.P)) {
            i17 = i14;
        }
        this.O = i16;
        this.P = i17;
        int i18 = this.f20380a0;
        if (i17 < i18) {
            this.P = i18;
        }
        int i19 = this.Z;
        if (i16 < i19) {
            this.O = i19;
        }
    }

    public boolean g() {
        if (this.f20390f0 != 8) {
            return true;
        }
        return false;
    }

    public void g0(boolean z10) {
        this.f20424y = z10;
    }

    public void h0(int i10) {
        this.P = i10;
        int i11 = this.f20380a0;
        if (i10 < i11) {
            this.P = i11;
        }
    }

    public void i(d.b bVar, e eVar, d.b bVar2, int i10) {
        d.b bVar3;
        d.b bVar4;
        boolean z10;
        d.b bVar5 = d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 == bVar5) {
                d.b bVar6 = d.b.LEFT;
                d m10 = m(bVar6);
                d.b bVar7 = d.b.RIGHT;
                d m11 = m(bVar7);
                d.b bVar8 = d.b.TOP;
                d m12 = m(bVar8);
                d.b bVar9 = d.b.BOTTOM;
                d m13 = m(bVar9);
                boolean z11 = true;
                if ((m10 != null && m10.j()) || (m11 != null && m11.j())) {
                    z10 = false;
                } else {
                    i(bVar6, eVar, bVar6, 0);
                    i(bVar7, eVar, bVar7, 0);
                    z10 = true;
                }
                if ((m12 != null && m12.j()) || (m13 != null && m13.j())) {
                    z11 = false;
                } else {
                    i(bVar8, eVar, bVar8, 0);
                    i(bVar9, eVar, bVar9, 0);
                }
                if (z10 && z11) {
                    m(bVar5).a(eVar.m(bVar5), 0);
                    return;
                } else if (z10) {
                    d.b bVar10 = d.b.CENTER_X;
                    m(bVar10).a(eVar.m(bVar10), 0);
                    return;
                } else if (z11) {
                    d.b bVar11 = d.b.CENTER_Y;
                    m(bVar11).a(eVar.m(bVar11), 0);
                    return;
                } else {
                    return;
                }
            }
            d.b bVar12 = d.b.LEFT;
            if (bVar2 != bVar12 && bVar2 != d.b.RIGHT) {
                d.b bVar13 = d.b.TOP;
                if (bVar2 == bVar13 || bVar2 == d.b.BOTTOM) {
                    i(bVar13, eVar, bVar2, 0);
                    i(d.b.BOTTOM, eVar, bVar2, 0);
                    m(bVar5).a(eVar.m(bVar2), 0);
                    return;
                }
                return;
            }
            i(bVar12, eVar, bVar2, 0);
            i(d.b.RIGHT, eVar, bVar2, 0);
            m(bVar5).a(eVar.m(bVar2), 0);
            return;
        }
        d.b bVar14 = d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = d.b.LEFT) || bVar2 == d.b.RIGHT)) {
            d m14 = m(bVar4);
            d m15 = eVar.m(bVar2);
            d m16 = m(d.b.RIGHT);
            m14.a(m15, 0);
            m16.a(m15, 0);
            m(bVar14).a(m15, 0);
            return;
        }
        d.b bVar15 = d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = d.b.TOP) || bVar2 == d.b.BOTTOM)) {
            d m17 = eVar.m(bVar2);
            m(bVar3).a(m17, 0);
            m(d.b.BOTTOM).a(m17, 0);
            m(bVar15).a(m17, 0);
        } else if (bVar == bVar14 && bVar2 == bVar14) {
            d.b bVar16 = d.b.LEFT;
            m(bVar16).a(eVar.m(bVar16), 0);
            d.b bVar17 = d.b.RIGHT;
            m(bVar17).a(eVar.m(bVar17), 0);
            m(bVar14).a(eVar.m(bVar2), 0);
        } else if (bVar == bVar15 && bVar2 == bVar15) {
            d.b bVar18 = d.b.TOP;
            m(bVar18).a(eVar.m(bVar18), 0);
            d.b bVar19 = d.b.BOTTOM;
            m(bVar19).a(eVar.m(bVar19), 0);
            m(bVar15).a(eVar.m(bVar2), 0);
        } else {
            d m18 = m(bVar);
            d m19 = eVar.m(bVar2);
            if (m18.k(m19)) {
                d.b bVar20 = d.b.BASELINE;
                if (bVar == bVar20) {
                    d m20 = m(d.b.TOP);
                    d m21 = m(d.b.BOTTOM);
                    if (m20 != null) {
                        m20.l();
                    }
                    if (m21 != null) {
                        m21.l();
                    }
                    i10 = 0;
                } else if (bVar != d.b.TOP && bVar != d.b.BOTTOM) {
                    if (bVar == d.b.LEFT || bVar == d.b.RIGHT) {
                        d m22 = m(bVar5);
                        if (m22.g() != m19) {
                            m22.l();
                        }
                        d d10 = m(bVar).d();
                        d m23 = m(bVar14);
                        if (m23.j()) {
                            d10.l();
                            m23.l();
                        }
                    }
                } else {
                    d m24 = m(bVar20);
                    if (m24 != null) {
                        m24.l();
                    }
                    d m25 = m(bVar5);
                    if (m25.g() != m19) {
                        m25.l();
                    }
                    d d11 = m(bVar).d();
                    d m26 = m(bVar15);
                    if (m26.j()) {
                        d11.l();
                        m26.l();
                    }
                }
                m18.a(m19, i10);
            }
        }
    }

    public void i0(float f10) {
        this.f20382b0 = f10;
    }

    public void j(d dVar, d dVar2, int i10) {
        if (dVar.e() == this) {
            i(dVar.h(), dVar2.e(), dVar2.h(), i10);
        }
    }

    public void j0(int i10) {
        this.f20404m0 = i10;
    }

    public void k(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        T(bVar, eVar, bVar, i10, 0);
        this.f20423x = f10;
    }

    public void k0(int i10, int i11) {
        this.S = i10;
        int i12 = i11 - i10;
        this.O = i12;
        int i13 = this.Z;
        if (i12 < i13) {
            this.O = i13;
        }
    }

    public void l(n2.d dVar) {
        dVar.q(this.B);
        dVar.q(this.C);
        dVar.q(this.D);
        dVar.q(this.E);
        if (this.Y > 0) {
            dVar.q(this.F);
        }
    }

    public void l0(b bVar) {
        this.M[0] = bVar;
    }

    public d m(d.b bVar) {
        switch (a.f20426a[bVar.ordinal()]) {
            case 1:
                return this.B;
            case 2:
                return this.C;
            case 3:
                return this.D;
            case 4:
                return this.E;
            case 5:
                return this.F;
            case 6:
                return this.I;
            case 7:
                return this.G;
            case 8:
                return this.H;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(int i10, int i11, int i12, float f10) {
        this.f20401l = i10;
        this.f20407o = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f20409p = i12;
        this.f20411q = f10;
        if (f10 > 0.0f && f10 < 1.0f && i10 == 0) {
            this.f20401l = 2;
        }
    }

    public int n() {
        return this.Y;
    }

    public void n0(float f10) {
        this.f20412q0[0] = f10;
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f20382b0;
        }
        if (i10 == 1) {
            return this.f20384c0;
        }
        return -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o0(int i10, boolean z10) {
        this.L[i10] = z10;
    }

    public int p() {
        return R() + this.P;
    }

    public void p0(boolean z10) {
        this.f20425z = z10;
    }

    public Object q() {
        return this.f20386d0;
    }

    public void q0(boolean z10) {
        this.A = z10;
    }

    public String r() {
        return this.f20392g0;
    }

    public void r0(int i10) {
        this.f20422w[1] = i10;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 == 1) {
            return M();
        }
        return null;
    }

    public void s0(int i10) {
        this.f20422w[0] = i10;
    }

    public float t() {
        return this.Q;
    }

    public void t0(int i10) {
        if (i10 < 0) {
            this.f20380a0 = 0;
        } else {
            this.f20380a0 = i10;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f20394h0 == null) {
            str = "";
        } else {
            str = "type: " + this.f20394h0 + " ";
        }
        sb2.append(str);
        if (this.f20392g0 != null) {
            str2 = "id: " + this.f20392g0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.S);
        sb2.append(", ");
        sb2.append(this.T);
        sb2.append(") - (");
        sb2.append(this.O);
        sb2.append(" x ");
        sb2.append(this.P);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.R;
    }

    public void u0(int i10) {
        if (i10 < 0) {
            this.Z = 0;
        } else {
            this.Z = i10;
        }
    }

    public int v() {
        if (this.f20390f0 == 8) {
            return 0;
        }
        return this.P;
    }

    public void v0(int i10, int i11) {
        this.S = i10;
        this.T = i11;
    }

    public float w() {
        return this.f20382b0;
    }

    public void w0(e eVar) {
        this.N = eVar;
    }

    public int x() {
        return this.f20404m0;
    }

    public void x0(float f10) {
        this.f20384c0 = f10;
    }

    public b y() {
        return this.M[0];
    }

    public void y0(int i10) {
        this.f20406n0 = i10;
    }

    public int z() {
        d dVar = this.B;
        int i10 = 0;
        if (dVar != null) {
            i10 = 0 + dVar.f20374e;
        }
        d dVar2 = this.D;
        if (dVar2 != null) {
            return i10 + dVar2.f20374e;
        }
        return i10;
    }

    public void z0(int i10, int i11) {
        this.T = i10;
        int i12 = i11 - i10;
        this.P = i12;
        int i13 = this.f20380a0;
        if (i12 < i13) {
            this.P = i13;
        }
    }
}
