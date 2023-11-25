package s;

/* compiled from: AnimationState.kt */
/* loaded from: classes.dex */
public final class m {
    public static final l<Float, n> a(float f10, float f11, long j10, long j11, boolean z10) {
        return new l<>(k1.f(qc.j.f21682a), Float.valueOf(f10), r.a(f11), j10, j11, z10);
    }

    public static /* synthetic */ l b(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        long j12;
        boolean z11;
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        long j13 = Long.MIN_VALUE;
        if ((i10 & 4) != 0) {
            j12 = Long.MIN_VALUE;
        } else {
            j12 = j10;
        }
        if ((i10 & 8) == 0) {
            j13 = j11;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        return a(f10, f11, j12, j13, z11);
    }

    public static final <T, V extends q> l<T, V> c(l<T, V> lVar, T t10, V v10, long j10, long j11, boolean z10) {
        qc.q.i(lVar, "<this>");
        return new l<>(lVar.j(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ l d(l lVar, Object obj, q qVar, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = lVar.getValue();
        }
        if ((i10 & 2) != 0) {
            qVar = r.b(lVar.m());
        }
        q qVar2 = qVar;
        if ((i10 & 4) != 0) {
            j10 = lVar.f();
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = lVar.e();
        }
        long j13 = j11;
        if ((i10 & 16) != 0) {
            z10 = lVar.r();
        }
        return c(lVar, obj, qVar2, j12, j13, z10);
    }

    public static final <T, V extends q> V e(i1<T, V> i1Var, T t10) {
        qc.q.i(i1Var, "<this>");
        return (V) r.d(i1Var.a().invoke(t10));
    }
}
