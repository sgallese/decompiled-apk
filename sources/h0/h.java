package h0;

/* compiled from: RippleAnimation.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final float f16392a = j2.h.j(10);

    public static final float a(j2.e eVar, boolean z10, long j10) {
        qc.q.i(eVar, "$this$getRippleEndRadius");
        float m10 = z0.f.m(z0.g.a(z0.l.i(j10), z0.l.g(j10))) / 2.0f;
        if (z10) {
            return m10 + eVar.v0(f16392a);
        }
        return m10;
    }

    public static final float b(long j10) {
        return Math.max(z0.l.i(j10), z0.l.g(j10)) * 0.3f;
    }
}
