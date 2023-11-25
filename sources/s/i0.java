package s;

/* compiled from: FloatAnimationSpec.kt */
/* loaded from: classes.dex */
public final class i0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f22716a;

    /* renamed from: b  reason: collision with root package name */
    private final float f22717b;

    /* renamed from: c  reason: collision with root package name */
    private final float f22718c;

    /* renamed from: d  reason: collision with root package name */
    private final x0 f22719d;

    public i0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // s.j
    public /* bridge */ /* synthetic */ m1 a(i1 i1Var) {
        m1 a10;
        a10 = a(i1Var);
        return a10;
    }

    @Override // s.g0
    public float b(long j10, float f10, float f11, float f12) {
        this.f22719d.e(f11);
        return p0.c(this.f22719d.g(f10, f12, j10 / 1000000));
    }

    @Override // s.g0
    public long c(float f10, float f11, float f12) {
        float b10 = this.f22719d.b();
        float a10 = this.f22719d.a();
        float f13 = f10 - f11;
        float f14 = this.f22718c;
        return w0.b(b10, a10, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    @Override // s.g0
    public float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // s.g0
    public float e(long j10, float f10, float f11, float f12) {
        this.f22719d.e(f11);
        return p0.b(this.f22719d.g(f10, f12, j10 / 1000000));
    }

    public i0(float f10, float f11, float f12) {
        this.f22716a = f10;
        this.f22717b = f11;
        this.f22718c = f12;
        x0 x0Var = new x0(1.0f);
        x0Var.d(f10);
        x0Var.f(f11);
        this.f22719d = x0Var;
    }

    @Override // s.g0, s.j
    public /* synthetic */ t1 a(i1 i1Var) {
        return f0.c(this, i1Var);
    }

    public /* synthetic */ i0(float f10, float f11, float f12, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
