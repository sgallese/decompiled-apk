package s4;

import a1.q1;
import android.os.SystemClock;
import j0.d3;
import j0.j1;
import n1.e1;
import z0.l;
import z0.m;

/* compiled from: CrossfadePainter.kt */
/* loaded from: classes.dex */
public final class f extends d1.c {
    private long A;
    private boolean B;
    private final j1 C;
    private final j1 D;

    /* renamed from: t  reason: collision with root package name */
    private d1.c f23018t;

    /* renamed from: u  reason: collision with root package name */
    private final d1.c f23019u;

    /* renamed from: v  reason: collision with root package name */
    private final n1.f f23020v;

    /* renamed from: w  reason: collision with root package name */
    private final int f23021w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f23022x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f23023y;

    /* renamed from: z  reason: collision with root package name */
    private final j1 f23024z;

    public f(d1.c cVar, d1.c cVar2, n1.f fVar, int i10, boolean z10, boolean z11) {
        j1 e10;
        j1 e11;
        j1 e12;
        this.f23018t = cVar;
        this.f23019u = cVar2;
        this.f23020v = fVar;
        this.f23021w = i10;
        this.f23022x = z10;
        this.f23023y = z11;
        e10 = d3.e(0, null, 2, null);
        this.f23024z = e10;
        this.A = -1L;
        e11 = d3.e(Float.valueOf(1.0f), null, 2, null);
        this.C = e11;
        e12 = d3.e(null, null, 2, null);
        this.D = e12;
    }

    private final long n(long j10, long j11) {
        boolean z10;
        l.a aVar = l.f26375b;
        boolean z11 = true;
        if (j10 == aVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !l.k(j10)) {
            if (j11 != aVar.a()) {
                z11 = false;
            }
            if (!z11 && !l.k(j11)) {
                return e1.b(j10, this.f23020v.a(j10, j11));
            }
        }
        return j11;
    }

    private final long o() {
        long b10;
        long b11;
        boolean z10;
        d1.c cVar = this.f23018t;
        if (cVar != null) {
            b10 = cVar.k();
        } else {
            b10 = l.f26375b.b();
        }
        d1.c cVar2 = this.f23019u;
        if (cVar2 != null) {
            b11 = cVar2.k();
        } else {
            b11 = l.f26375b.b();
        }
        l.a aVar = l.f26375b;
        boolean z11 = true;
        if (b10 != aVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (b11 == aVar.a()) {
            z11 = false;
        }
        if (z10 && z11) {
            return m.a(Math.max(l.i(b10), l.i(b11)), Math.max(l.g(b10), l.g(b11)));
        }
        if (this.f23023y) {
            if (z10) {
                return b10;
            }
            if (z11) {
                return b11;
            }
        }
        return aVar.a();
    }

    private final void p(c1.f fVar, d1.c cVar, float f10) {
        boolean z10;
        if (cVar != null && f10 > 0.0f) {
            long b10 = fVar.b();
            long n10 = n(cVar.k(), b10);
            if (b10 == l.f26375b.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !l.k(b10)) {
                float f11 = 2;
                float i10 = (l.i(b10) - l.i(n10)) / f11;
                float g10 = (l.g(b10) - l.g(n10)) / f11;
                fVar.y0().a().f(i10, g10, i10, g10);
                cVar.j(fVar, n10, f10, q());
                float f12 = -i10;
                float f13 = -g10;
                fVar.y0().a().f(f12, f13, f12, f13);
                return;
            }
            cVar.j(fVar, n10, f10, q());
        }
    }

    private final q1 q() {
        return (q1) this.D.getValue();
    }

    private final int r() {
        return ((Number) this.f23024z.getValue()).intValue();
    }

    private final float s() {
        return ((Number) this.C.getValue()).floatValue();
    }

    private final void t(q1 q1Var) {
        this.D.setValue(q1Var);
    }

    private final void u(int i10) {
        this.f23024z.setValue(Integer.valueOf(i10));
    }

    private final void v(float f10) {
        this.C.setValue(Float.valueOf(f10));
    }

    @Override // d1.c
    protected boolean a(float f10) {
        v(f10);
        return true;
    }

    @Override // d1.c
    protected boolean e(q1 q1Var) {
        t(q1Var);
        return true;
    }

    @Override // d1.c
    public long k() {
        return o();
    }

    @Override // d1.c
    protected void m(c1.f fVar) {
        float k10;
        float s10;
        boolean z10;
        if (this.B) {
            p(fVar, this.f23019u, s());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.A == -1) {
            this.A = uptimeMillis;
        }
        float f10 = ((float) (uptimeMillis - this.A)) / this.f23021w;
        k10 = vc.l.k(f10, 0.0f, 1.0f);
        float s11 = k10 * s();
        if (this.f23022x) {
            s10 = s() - s11;
        } else {
            s10 = s();
        }
        if (f10 >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B = z10;
        p(fVar, this.f23018t, s10);
        p(fVar, this.f23019u, s11);
        if (this.B) {
            this.f23018t = null;
        } else {
            u(r() + 1);
        }
    }
}
