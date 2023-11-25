package o2;

import o2.e;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class a extends j {

    /* renamed from: y0  reason: collision with root package name */
    private int f20346y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f20347z0 = true;
    private int A0 = 0;

    public boolean K0() {
        return this.f20347z0;
    }

    public int L0() {
        return this.f20346y0;
    }

    public int M0() {
        return this.A0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N0() {
        for (int i10 = 0; i10 < this.f20465x0; i10++) {
            e eVar = this.f20464w0[i10];
            int i11 = this.f20346y0;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    eVar.o0(1, true);
                }
            } else {
                eVar.o0(0, true);
            }
        }
    }

    public void O0(boolean z10) {
        this.f20347z0 = z10;
    }

    public void P0(int i10) {
        this.f20346y0 = i10;
    }

    public void Q0(int i10) {
        this.A0 = i10;
    }

    @Override // o2.e
    public void f(n2.d dVar) {
        d[] dVarArr;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        d[] dVarArr2 = this.J;
        dVarArr2[0] = this.B;
        dVarArr2[2] = this.C;
        dVarArr2[1] = this.D;
        dVarArr2[3] = this.E;
        int i15 = 0;
        while (true) {
            dVarArr = this.J;
            if (i15 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i15];
            dVar2.f20376g = dVar.q(dVar2);
            i15++;
        }
        int i16 = this.f20346y0;
        if (i16 >= 0 && i16 < 4) {
            d dVar3 = dVarArr[i16];
            for (int i17 = 0; i17 < this.f20465x0; i17++) {
                e eVar = this.f20464w0[i17];
                if ((this.f20347z0 || eVar.g()) && ((((i13 = this.f20346y0) == 0 || i13 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.B.f20373d != null && eVar.D.f20373d != null) || (((i14 = this.f20346y0) == 2 || i14 == 3) && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.C.f20373d != null && eVar.E.f20373d != null))) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            if (!this.B.i() && !this.D.i()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!this.C.i() && !this.E.i()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z10 && (((i12 = this.f20346y0) == 0 && z11) || ((i12 == 2 && z12) || ((i12 == 1 && z11) || (i12 == 3 && z12))))) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                i10 = 4;
            } else {
                i10 = 5;
            }
            for (int i18 = 0; i18 < this.f20465x0; i18++) {
                e eVar2 = this.f20464w0[i18];
                if (this.f20347z0 || eVar2.g()) {
                    n2.i q10 = dVar.q(eVar2.J[this.f20346y0]);
                    d[] dVarArr3 = eVar2.J;
                    int i19 = this.f20346y0;
                    d dVar4 = dVarArr3[i19];
                    dVar4.f20376g = q10;
                    d dVar5 = dVar4.f20373d;
                    if (dVar5 != null && dVar5.f20371b == this) {
                        i11 = dVar4.f20374e + 0;
                    } else {
                        i11 = 0;
                    }
                    if (i19 != 0 && i19 != 2) {
                        dVar.g(dVar3.f20376g, q10, this.A0 + i11, z10);
                    } else {
                        dVar.i(dVar3.f20376g, q10, this.A0 - i11, z10);
                    }
                    dVar.e(dVar3.f20376g, q10, this.A0 + i11, i10);
                }
            }
            int i20 = this.f20346y0;
            if (i20 == 0) {
                dVar.e(this.D.f20376g, this.B.f20376g, 0, 8);
                dVar.e(this.B.f20376g, this.N.D.f20376g, 0, 4);
                dVar.e(this.B.f20376g, this.N.B.f20376g, 0, 0);
            } else if (i20 == 1) {
                dVar.e(this.B.f20376g, this.D.f20376g, 0, 8);
                dVar.e(this.B.f20376g, this.N.B.f20376g, 0, 4);
                dVar.e(this.B.f20376g, this.N.D.f20376g, 0, 0);
            } else if (i20 == 2) {
                dVar.e(this.E.f20376g, this.C.f20376g, 0, 8);
                dVar.e(this.C.f20376g, this.N.E.f20376g, 0, 4);
                dVar.e(this.C.f20376g, this.N.C.f20376g, 0, 0);
            } else if (i20 == 3) {
                dVar.e(this.C.f20376g, this.E.f20376g, 0, 8);
                dVar.e(this.C.f20376g, this.N.C.f20376g, 0, 4);
                dVar.e(this.C.f20376g, this.N.E.f20376g, 0, 0);
            }
        }
    }

    @Override // o2.e
    public boolean g() {
        return true;
    }

    @Override // o2.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.f20465x0; i10++) {
            e eVar = this.f20464w0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
