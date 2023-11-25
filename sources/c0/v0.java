package c0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: TextLayoutResultProxy.kt */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final v1.g0 f8599a;

    /* renamed from: b  reason: collision with root package name */
    private n1.s f8600b;

    /* renamed from: c  reason: collision with root package name */
    private n1.s f8601c;

    public v0(v1.g0 g0Var) {
        qc.q.i(g0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f8599a = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long a(long r6) {
        /*
            r5 = this;
            n1.s r0 = r5.f8600b
            if (r0 == 0) goto L1e
            boolean r1 = r0.r()
            if (r1 == 0) goto L16
            n1.s r1 = r5.f8601c
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            z0.h r2 = n1.r.a(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            z0.h$a r0 = z0.h.f26359e
            z0.h r2 = r0.a()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            z0.h$a r0 = z0.h.f26359e
            z0.h r2 = r0.a()
        L24:
            long r6 = c0.w0.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.v0.a(long):long");
    }

    public static /* synthetic */ int e(v0 v0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return v0Var.d(i10, z10);
    }

    public static /* synthetic */ int h(v0 v0Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return v0Var.g(j10, z10);
    }

    private final long k(long j10) {
        z0.f fVar;
        long j11;
        n1.s sVar = this.f8600b;
        if (sVar != null) {
            n1.s sVar2 = this.f8601c;
            if (sVar2 != null) {
                if (sVar.r() && sVar2.r()) {
                    j11 = sVar.O(sVar2, j10);
                } else {
                    j11 = j10;
                }
                fVar = z0.f.d(j11);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                return fVar.x();
            }
            return j10;
        }
        return j10;
    }

    public final n1.s b() {
        return this.f8601c;
    }

    public final n1.s c() {
        return this.f8600b;
    }

    public final int d(int i10, boolean z10) {
        return this.f8599a.n(i10, z10);
    }

    public final int f(float f10) {
        return this.f8599a.q(z0.f.p(k(a(z0.g.a(0.0f, f10)))));
    }

    public final int g(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f8599a.w(k(j10));
    }

    public final v1.g0 i() {
        return this.f8599a;
    }

    public final boolean j(long j10) {
        long k10 = k(a(j10));
        int q10 = this.f8599a.q(z0.f.p(k10));
        if (z0.f.o(k10) >= this.f8599a.r(q10) && z0.f.o(k10) <= this.f8599a.s(q10)) {
            return true;
        }
        return false;
    }

    public final void l(n1.s sVar) {
        this.f8601c = sVar;
    }

    public final void m(n1.s sVar) {
        this.f8600b = sVar;
    }
}
