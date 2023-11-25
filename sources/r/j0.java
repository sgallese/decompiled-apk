package r;

/* compiled from: SplineBasedFloatDecayAnimationSpec.kt */
/* loaded from: classes.dex */
public final class j0 implements s.h0 {

    /* renamed from: a  reason: collision with root package name */
    private final y f21955a;

    public j0(j2.e eVar) {
        qc.q.i(eVar, "density");
        this.f21955a = new y(k0.a(), eVar);
    }

    private final float f(float f10) {
        return this.f21955a.b(f10) * Math.signum(f10);
    }

    @Override // s.h0
    public float a() {
        return 0.0f;
    }

    @Override // s.h0
    public float b(long j10, float f10, float f11) {
        return this.f21955a.d(f11).b(j10 / 1000000);
    }

    @Override // s.h0
    public long c(float f10, float f11) {
        return this.f21955a.c(f11) * 1000000;
    }

    @Override // s.h0
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // s.h0
    public float e(long j10, float f10, float f11) {
        return f10 + this.f21955a.d(f11).a(j10 / 1000000);
    }
}
