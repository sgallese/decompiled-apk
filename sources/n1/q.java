package n1;

import java.util.Map;

/* compiled from: Layout.kt */
/* loaded from: classes.dex */
public final class q implements l0, n {

    /* renamed from: f  reason: collision with root package name */
    private final j2.r f20028f;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ n f20029m;

    public q(n nVar, j2.r rVar) {
        qc.q.i(nVar, "intrinsicMeasureScope");
        qc.q.i(rVar, "layoutDirection");
        this.f20028f = rVar;
        this.f20029m = nVar;
    }

    @Override // j2.e
    public long K(long j10) {
        return this.f20029m.K(j10);
    }

    @Override // j2.e
    public int K0(float f10) {
        return this.f20029m.K0(f10);
    }

    @Override // j2.e
    public long S0(long j10) {
        return this.f20029m.S0(j10);
    }

    @Override // j2.e
    public float T(long j10) {
        return this.f20029m.T(j10);
    }

    @Override // j2.e
    public float W0(long j10) {
        return this.f20029m.W0(j10);
    }

    @Override // j2.e
    public long c0(float f10) {
        return this.f20029m.c0(f10);
    }

    @Override // n1.l0
    public /* synthetic */ j0 e0(int i10, int i11, Map map, pc.l lVar) {
        return k0.a(this, i10, i11, map, lVar);
    }

    @Override // j2.e
    public float getDensity() {
        return this.f20029m.getDensity();
    }

    @Override // n1.n
    public j2.r getLayoutDirection() {
        return this.f20028f;
    }

    @Override // j2.e
    public float h0(int i10) {
        return this.f20029m.h0(i10);
    }

    @Override // j2.e
    public float j0(float f10) {
        return this.f20029m.j0(f10);
    }

    @Override // j2.e
    public float p0() {
        return this.f20029m.p0();
    }

    @Override // j2.e
    public float v0(float f10) {
        return this.f20029m.v0(f10);
    }
}
