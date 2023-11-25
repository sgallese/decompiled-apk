package o2;

import o2.e;
import p2.b;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class l extends j {

    /* renamed from: y0  reason: collision with root package name */
    private int f20467y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    private int f20468z0 = 0;
    private int A0 = 0;
    private int B0 = 0;
    private int C0 = 0;
    private int D0 = 0;
    private int E0 = 0;
    private int F0 = 0;
    private boolean G0 = false;
    private int H0 = 0;
    private int I0 = 0;
    protected b.a J0 = new b.a();
    b.InterfaceC0474b K0 = null;

    public void K0(boolean z10) {
        int i10 = this.C0;
        if (i10 > 0 || this.D0 > 0) {
            if (z10) {
                this.E0 = this.D0;
                this.F0 = i10;
                return;
            }
            this.E0 = i10;
            this.F0 = this.D0;
        }
    }

    public void L0() {
        for (int i10 = 0; i10 < this.f20465x0; i10++) {
            e eVar = this.f20464w0[i10];
            if (eVar != null) {
                eVar.q0(true);
            }
        }
    }

    public int M0() {
        return this.I0;
    }

    public int N0() {
        return this.H0;
    }

    public int O0() {
        return this.f20468z0;
    }

    public int P0() {
        return this.E0;
    }

    public int Q0() {
        return this.F0;
    }

    public int R0() {
        return this.f20467y0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void T0(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.K0 == null && G() != null) {
            this.K0 = ((f) G()).U0();
        }
        b.a aVar = this.J0;
        aVar.f20996a = bVar;
        aVar.f20997b = bVar2;
        aVar.f20998c = i10;
        aVar.f20999d = i11;
        this.K0.b(eVar, aVar);
        eVar.E0(this.J0.f21000e);
        eVar.h0(this.J0.f21001f);
        eVar.g0(this.J0.f21003h);
        eVar.b0(this.J0.f21002g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean U0() {
        b.InterfaceC0474b interfaceC0474b;
        e eVar = this.N;
        if (eVar != null) {
            interfaceC0474b = ((f) eVar).U0();
        } else {
            interfaceC0474b = null;
        }
        if (interfaceC0474b == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f20465x0) {
                return true;
            }
            e eVar2 = this.f20464w0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b s10 = eVar2.s(0);
                e.b s11 = eVar2.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s10 != bVar || eVar2.f20401l == 1 || s11 != bVar || eVar2.f20403m == 1) {
                    z10 = false;
                }
                if (!z10) {
                    if (s10 == bVar) {
                        s10 = e.b.WRAP_CONTENT;
                    }
                    if (s11 == bVar) {
                        s11 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.J0;
                    aVar.f20996a = s10;
                    aVar.f20997b = s11;
                    aVar.f20998c = eVar2.P();
                    this.J0.f20999d = eVar2.v();
                    interfaceC0474b.b(eVar2, this.J0);
                    eVar2.E0(this.J0.f21000e);
                    eVar2.h0(this.J0.f21001f);
                    eVar2.b0(this.J0.f21002g);
                }
            }
            i10++;
        }
    }

    public boolean V0() {
        return this.G0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W0(boolean z10) {
        this.G0 = z10;
    }

    public void X0(int i10, int i11) {
        this.H0 = i10;
        this.I0 = i11;
    }

    public void Y0(int i10) {
        this.A0 = i10;
        this.f20467y0 = i10;
        this.B0 = i10;
        this.f20468z0 = i10;
        this.C0 = i10;
        this.D0 = i10;
    }

    public void Z0(int i10) {
        this.f20468z0 = i10;
    }

    public void a1(int i10) {
        this.D0 = i10;
    }

    public void b1(int i10) {
        this.A0 = i10;
        this.E0 = i10;
    }

    @Override // o2.j, o2.i
    public void c(f fVar) {
        L0();
    }

    public void c1(int i10) {
        this.B0 = i10;
        this.F0 = i10;
    }

    public void d1(int i10) {
        this.C0 = i10;
        this.E0 = i10;
        this.F0 = i10;
    }

    public void e1(int i10) {
        this.f20467y0 = i10;
    }

    public void S0(int i10, int i11, int i12, int i13) {
    }
}
