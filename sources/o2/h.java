package o2;

import o2.d;
import o2.e;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: w0  reason: collision with root package name */
    protected float f20459w0 = -1.0f;

    /* renamed from: x0  reason: collision with root package name */
    protected int f20460x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    protected int f20461y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    private d f20462z0 = this.C;
    private int A0 = 0;
    private int B0 = 0;

    /* compiled from: Guideline.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20463a;

        static {
            int[] iArr = new int[d.b.values().length];
            f20463a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20463a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20463a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20463a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20463a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20463a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20463a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20463a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20463a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.K.clear();
        this.K.add(this.f20462z0);
        int length = this.J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.J[i10] = this.f20462z0;
        }
    }

    @Override // o2.e
    public void J0(n2.d dVar) {
        if (G() == null) {
            return;
        }
        int x10 = dVar.x(this.f20462z0);
        if (this.A0 == 1) {
            F0(x10);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(x10);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.A0;
    }

    public int L0() {
        return this.f20460x0;
    }

    public int M0() {
        return this.f20461y0;
    }

    public float N0() {
        return this.f20459w0;
    }

    public void O0(int i10) {
        if (i10 > -1) {
            this.f20459w0 = -1.0f;
            this.f20460x0 = i10;
            this.f20461y0 = -1;
        }
    }

    public void P0(int i10) {
        if (i10 > -1) {
            this.f20459w0 = -1.0f;
            this.f20460x0 = -1;
            this.f20461y0 = i10;
        }
    }

    public void Q0(float f10) {
        if (f10 > -1.0f) {
            this.f20459w0 = f10;
            this.f20460x0 = -1;
            this.f20461y0 = -1;
        }
    }

    public void R0(int i10) {
        if (this.A0 == i10) {
            return;
        }
        this.A0 = i10;
        this.K.clear();
        if (this.A0 == 1) {
            this.f20462z0 = this.B;
        } else {
            this.f20462z0 = this.C;
        }
        this.K.add(this.f20462z0);
        int length = this.J.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.J[i11] = this.f20462z0;
        }
    }

    @Override // o2.e
    public void f(n2.d dVar) {
        boolean z10;
        f fVar = (f) G();
        if (fVar == null) {
            return;
        }
        d m10 = fVar.m(d.b.LEFT);
        d m11 = fVar.m(d.b.RIGHT);
        e eVar = this.N;
        boolean z11 = true;
        if (eVar != null && eVar.M[0] == e.b.WRAP_CONTENT) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.A0 == 0) {
            m10 = fVar.m(d.b.TOP);
            m11 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.N;
            if (eVar2 == null || eVar2.M[1] != e.b.WRAP_CONTENT) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f20460x0 != -1) {
            n2.i q10 = dVar.q(this.f20462z0);
            dVar.e(q10, dVar.q(m10), this.f20460x0, 8);
            if (z10) {
                dVar.h(dVar.q(m11), q10, 0, 5);
            }
        } else if (this.f20461y0 != -1) {
            n2.i q11 = dVar.q(this.f20462z0);
            n2.i q12 = dVar.q(m11);
            dVar.e(q11, q12, -this.f20461y0, 8);
            if (z10) {
                dVar.h(q11, dVar.q(m10), 0, 5);
                dVar.h(q12, q11, 0, 5);
            }
        } else if (this.f20459w0 != -1.0f) {
            dVar.d(n2.d.s(dVar, dVar.q(this.f20462z0), dVar.q(m11), this.f20459w0));
        }
    }

    @Override // o2.e
    public boolean g() {
        return true;
    }

    @Override // o2.e
    public d m(d.b bVar) {
        switch (a.f20463a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.A0 == 1) {
                    return this.f20462z0;
                }
                break;
            case 3:
            case 4:
                if (this.A0 == 0) {
                    return this.f20462z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
