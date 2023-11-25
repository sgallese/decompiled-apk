package s;

import s.o0;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends q> V b(i1<T, V> i1Var, T t10) {
        if (t10 == null) {
            return null;
        }
        return i1Var.a().invoke(t10);
    }

    public static final <T> l0<T> c(b0<T> b0Var, v0 v0Var, long j10) {
        qc.q.i(b0Var, "animation");
        qc.q.i(v0Var, "repeatMode");
        return new l0<>(b0Var, v0Var, j10, null);
    }

    public static /* synthetic */ l0 d(b0 b0Var, v0 v0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = v0.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = a1.c(0, 0, 2, null);
        }
        return c(b0Var, v0Var, j10);
    }

    public static final <T> o0<T> e(pc.l<? super o0.b<T>, dc.w> lVar) {
        qc.q.i(lVar, "init");
        o0.b bVar = new o0.b();
        lVar.invoke(bVar);
        return new o0<>(bVar);
    }

    public static final <T> z0<T> f(float f10, float f11, T t10) {
        return new z0<>(f10, f11, t10);
    }

    public static /* synthetic */ z0 g(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return f(f10, f11, obj);
    }

    public static final <T> h1<T> h(int i10, int i11, c0 c0Var) {
        qc.q.i(c0Var, "easing");
        return new h1<>(i10, i11, c0Var);
    }

    public static /* synthetic */ h1 i(int i10, int i11, c0 c0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            c0Var = d0.b();
        }
        return h(i10, i11, c0Var);
    }
}
