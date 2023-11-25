package j0;

import java.util.Collection;
import java.util.List;

/* compiled from: SnapshotState.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 {
    public static final <T> t0.r<T> a() {
        return new t0.r<>();
    }

    public static final <T> t0.r<T> b(T... tArr) {
        List b02;
        qc.q.i(tArr, "elements");
        t0.r<T> rVar = new t0.r<>();
        b02 = ec.p.b0(tArr);
        rVar.addAll(b02);
        return rVar;
    }

    public static final <K, V> t0.t<K, V> c() {
        return new t0.t<>();
    }

    public static final <T> j1<T> d(T t10, x2<T> x2Var) {
        qc.q.i(x2Var, "policy");
        return b.d(t10, x2Var);
    }

    public static /* synthetic */ j1 e(Object obj, x2 x2Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            x2Var = y2.o();
        }
        return y2.h(obj, x2Var);
    }

    public static final <T> g3<T> f(T t10, l lVar, int i10) {
        lVar.e(-1058319986);
        if (n.K()) {
            n.V(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        lVar.e(-492369756);
        Object f10 = lVar.f();
        if (f10 == l.f18688a.a()) {
            f10 = e(t10, null, 2, null);
            lVar.J(f10);
        }
        lVar.N();
        j1 j1Var = (j1) f10;
        j1Var.setValue(t10);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return j1Var;
    }

    public static final <T> t0.r<T> g(Collection<? extends T> collection) {
        qc.q.i(collection, "<this>");
        t0.r<T> rVar = new t0.r<>();
        rVar.addAll(collection);
        return rVar;
    }
}
