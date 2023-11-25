package o2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import o2.e;
import p2.b;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class f extends m {
    int C0;
    int D0;
    int E0;
    int F0;

    /* renamed from: x0  reason: collision with root package name */
    p2.b f20428x0 = new p2.b(this);

    /* renamed from: y0  reason: collision with root package name */
    public p2.e f20429y0 = new p2.e(this);

    /* renamed from: z0  reason: collision with root package name */
    protected b.InterfaceC0474b f20430z0 = null;
    private boolean A0 = false;
    protected n2.d B0 = new n2.d();
    int G0 = 0;
    int H0 = 0;
    c[] I0 = new c[4];
    c[] J0 = new c[4];
    public boolean K0 = false;
    public boolean L0 = false;
    public boolean M0 = false;
    public int N0 = 0;
    public int O0 = 0;
    private int P0 = 263;
    public boolean Q0 = false;
    private boolean R0 = false;
    private boolean S0 = false;
    int T0 = 0;

    private void P0(e eVar) {
        int i10 = this.G0 + 1;
        c[] cVarArr = this.J0;
        if (i10 >= cVarArr.length) {
            this.J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.J0[this.G0] = new c(eVar, 0, a1());
        this.G0++;
    }

    private void Q0(e eVar) {
        int i10 = this.H0 + 1;
        c[] cVarArr = this.I0;
        if (i10 >= cVarArr.length) {
            this.I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.I0[this.H0] = new c(eVar, 1, a1());
        this.H0++;
    }

    private void e1() {
        this.G0 = 0;
        this.H0 = 0;
    }

    @Override // o2.e
    public void I0(boolean z10, boolean z11) {
        super.I0(z10, z11);
        int size = this.f20469w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20469w0.get(i10).I0(z10, z11);
        }
    }

    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // o2.m
    public void K0() {
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r11;
        boolean z13;
        this.S = 0;
        this.T = 0;
        int max = Math.max(0, P());
        int max2 = Math.max(0, v());
        this.R0 = false;
        this.S0 = false;
        if (!d1(64) && !d1(128)) {
            z10 = false;
        } else {
            z10 = true;
        }
        n2.d dVar = this.B0;
        dVar.f20081g = false;
        dVar.f20082h = false;
        if (this.P0 != 0 && z10) {
            dVar.f20082h = true;
        }
        e.b[] bVarArr = this.M;
        e.b bVar = bVarArr[1];
        e.b bVar2 = bVarArr[0];
        ArrayList<e> arrayList = this.f20469w0;
        e.b y10 = y();
        e.b bVar3 = e.b.WRAP_CONTENT;
        if (y10 != bVar3 && M() != bVar3) {
            z11 = false;
        } else {
            z11 = true;
        }
        e1();
        int size = this.f20469w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f20469w0.get(i10);
            if (eVar instanceof m) {
                ((m) eVar).K0();
            }
        }
        int i11 = 0;
        boolean z14 = true;
        boolean z15 = false;
        while (z14) {
            int i12 = i11 + 1;
            try {
                this.B0.D();
                e1();
                l(this.B0);
                for (int i13 = 0; i13 < size; i13++) {
                    this.f20469w0.get(i13).l(this.B0);
                }
                z14 = O0(this.B0);
                if (z14) {
                    this.B0.z();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                System.out.println("EXCEPTION : " + e10);
            }
            if (z14) {
                i1(this.B0, k.f20466a);
            } else {
                J0(this.B0);
                for (int i14 = 0; i14 < size; i14++) {
                    this.f20469w0.get(i14).J0(this.B0);
                }
            }
            if (z11 && i12 < 8 && k.f20466a[2]) {
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    e eVar2 = this.f20469w0.get(i17);
                    i15 = Math.max(i15, eVar2.S + eVar2.P());
                    i16 = Math.max(i16, eVar2.T + eVar2.v());
                }
                int max3 = Math.max(this.Z, i15);
                int max4 = Math.max(this.f20380a0, i16);
                e.b bVar4 = e.b.WRAP_CONTENT;
                if (bVar2 == bVar4 && P() < max3) {
                    E0(max3);
                    this.M[0] = bVar4;
                    z12 = true;
                    z15 = true;
                } else {
                    z12 = false;
                }
                if (bVar == bVar4 && v() < max4) {
                    h0(max4);
                    this.M[1] = bVar4;
                    z12 = true;
                    z15 = true;
                }
            } else {
                z12 = false;
            }
            int max5 = Math.max(this.Z, P());
            if (max5 > P()) {
                E0(max5);
                this.M[0] = e.b.FIXED;
                z12 = true;
                z15 = true;
            }
            int max6 = Math.max(this.f20380a0, v());
            if (max6 > v()) {
                h0(max6);
                r11 = 1;
                this.M[1] = e.b.FIXED;
                z12 = true;
                z13 = true;
            } else {
                r11 = 1;
                z13 = z15;
            }
            if (!z13) {
                e.b bVar5 = this.M[0];
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && P() > max) {
                    this.R0 = r11;
                    this.M[0] = e.b.FIXED;
                    E0(max);
                    z12 = true;
                    z13 = true;
                }
                if (this.M[r11] == bVar6 && max2 > 0 && v() > max2) {
                    this.S0 = r11;
                    this.M[r11] = e.b.FIXED;
                    h0(max2);
                    z14 = true;
                    z15 = true;
                    i11 = i12;
                }
            }
            z14 = z12;
            z15 = z13;
            i11 = i12;
        }
        this.f20469w0 = arrayList;
        if (z15) {
            e.b[] bVarArr2 = this.M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        a0(this.B0.v());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0(e eVar, int i10) {
        if (i10 == 0) {
            P0(eVar);
        } else if (i10 == 1) {
            Q0(eVar);
        }
    }

    public boolean O0(n2.d dVar) {
        f(dVar);
        int size = this.f20469w0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f20469w0.get(i10);
            eVar.o0(0, false);
            eVar.o0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.f20469w0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).N0();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.f20469w0.get(i12);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            e eVar4 = this.f20469w0.get(i13);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.l0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(bVar2);
                }
            } else {
                k.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.G0 > 0) {
            b.a(this, dVar, 0);
        }
        if (this.H0 > 0) {
            b.a(this, dVar, 1);
        }
        return true;
    }

    public boolean R0(boolean z10) {
        return this.f20429y0.f(z10);
    }

    public boolean S0(boolean z10) {
        return this.f20429y0.g(z10);
    }

    public boolean T0(boolean z10, int i10) {
        return this.f20429y0.h(z10, i10);
    }

    public b.InterfaceC0474b U0() {
        return this.f20430z0;
    }

    public int V0() {
        return this.P0;
    }

    public boolean W0() {
        return false;
    }

    public void X0() {
        this.f20429y0.j();
    }

    @Override // o2.m, o2.e
    public void Y() {
        this.B0.D();
        this.C0 = 0;
        this.E0 = 0;
        this.D0 = 0;
        this.F0 = 0;
        this.Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.f20429y0.k();
    }

    public boolean Z0() {
        return this.S0;
    }

    public boolean a1() {
        return this.A0;
    }

    public boolean b1() {
        return this.R0;
    }

    public long c1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.C0 = i17;
        this.D0 = i18;
        return this.f20428x0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean d1(int i10) {
        if ((this.P0 & i10) == i10) {
            return true;
        }
        return false;
    }

    public void f1(b.InterfaceC0474b interfaceC0474b) {
        this.f20430z0 = interfaceC0474b;
        this.f20429y0.n(interfaceC0474b);
    }

    public void g1(int i10) {
        this.P0 = i10;
        n2.d.f20072r = k.b(i10, UserVerificationMethods.USER_VERIFY_HANDPRINT);
    }

    public void h1(boolean z10) {
        this.A0 = z10;
    }

    public void i1(n2.d dVar, boolean[] zArr) {
        zArr[2] = false;
        J0(dVar);
        int size = this.f20469w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20469w0.get(i10).J0(dVar);
        }
    }

    public void j1() {
        this.f20428x0.e(this);
    }
}
