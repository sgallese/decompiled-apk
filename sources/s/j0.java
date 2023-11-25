package s;

/* compiled from: FloatAnimationSpec.kt */
/* loaded from: classes.dex */
public final class j0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f22720a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22721b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f22722c;

    public j0(int i10, int i11, c0 c0Var) {
        qc.q.i(c0Var, "easing");
        this.f22720a = i10;
        this.f22721b = i11;
        this.f22722c = c0Var;
    }

    private final long f(long j10) {
        long n10;
        n10 = vc.l.n(j10 - this.f22721b, 0L, this.f22720a);
        return n10;
    }

    @Override // s.j
    public /* bridge */ /* synthetic */ m1 a(i1 i1Var) {
        m1 a10;
        a10 = a(i1Var);
        return a10;
    }

    @Override // s.g0
    public float b(long j10, float f10, float f11, float f12) {
        long f13 = f(j10 / 1000000);
        if (f13 < 0) {
            return 0.0f;
        }
        if (f13 == 0) {
            return f12;
        }
        return (e(f13 * 1000000, f10, f11, f12) - e((f13 - 1) * 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // s.g0
    public long c(float f10, float f11, float f12) {
        return (this.f22721b + this.f22720a) * 1000000;
    }

    @Override // s.g0
    public /* synthetic */ float d(float f10, float f11, float f12) {
        return f0.a(this, f10, f11, f12);
    }

    @Override // s.g0
    public float e(long j10, float f10, float f11, float f12) {
        float f13;
        float k10;
        long f14 = f(j10 / 1000000);
        int i10 = this.f22720a;
        if (i10 == 0) {
            f13 = 1.0f;
        } else {
            f13 = ((float) f14) / i10;
        }
        c0 c0Var = this.f22722c;
        k10 = vc.l.k(f13, 0.0f, 1.0f);
        return k1.k(f10, f11, c0Var.a(k10));
    }

    @Override // s.g0, s.j
    public /* synthetic */ t1 a(i1 i1Var) {
        return f0.c(this, i1Var);
    }
}
