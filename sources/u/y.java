package u;

import j0.g3;
import j0.y2;

/* compiled from: ScrollableState.kt */
/* loaded from: classes.dex */
public final class y {

    /* compiled from: ScrollableState.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<Float, Float> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g3<pc.l<Float, Float>> f23989f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g3<? extends pc.l<? super Float, Float>> g3Var) {
            super(1);
            this.f23989f = g3Var;
        }

        public final Float a(float f10) {
            return this.f23989f.getValue().invoke(Float.valueOf(f10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    public static final x a(pc.l<? super Float, Float> lVar) {
        qc.q.i(lVar, "consumeScrollDelta");
        return new f(lVar);
    }

    public static final x b(pc.l<? super Float, Float> lVar, j0.l lVar2, int i10) {
        qc.q.i(lVar, "consumeScrollDelta");
        lVar2.e(-180460798);
        if (j0.n.K()) {
            j0.n.V(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        g3 m10 = y2.m(lVar, lVar2, i10 & 14);
        lVar2.e(-492369756);
        Object f10 = lVar2.f();
        if (f10 == j0.l.f18688a.a()) {
            f10 = a(new a(m10));
            lVar2.J(f10);
        }
        lVar2.N();
        x xVar = (x) f10;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return xVar;
    }
}
