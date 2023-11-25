package j0;

/* compiled from: ActualJvm.jvm.kt */
/* loaded from: classes.dex */
public final class c {
    public static final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void b(l lVar, pc.p<? super l, ? super Integer, dc.w> pVar) {
        qc.q.i(lVar, "composer");
        qc.q.i(pVar, "composable");
        ((pc.p) qc.k0.e(pVar, 2)).invoke(lVar, 1);
    }

    public static final <T> T c(l lVar, pc.p<? super l, ? super Integer, ? extends T> pVar) {
        qc.q.i(lVar, "composer");
        qc.q.i(pVar, "composable");
        return (T) ((pc.p) qc.k0.e(pVar, 2)).invoke(lVar, 1);
    }
}
