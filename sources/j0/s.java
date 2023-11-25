package j0;

/* compiled from: Composition.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    private static final Object f18889a = new Object();

    public static final o a(f<?> fVar, p pVar) {
        qc.q.i(fVar, "applier");
        qc.q.i(pVar, "parent");
        return new r(pVar, fVar, null, 4, null);
    }

    public static final /* synthetic */ void b(k0.b bVar, Object obj, Object obj2) {
        d(bVar, obj, obj2);
    }

    public static final /* synthetic */ Object c() {
        return f18889a;
    }

    public static final <K, V> void d(k0.b<K, k0.c<V>> bVar, K k10, V v10) {
        if (bVar.c(k10)) {
            k0.c<V> f10 = bVar.f(k10);
            if (f10 != null) {
                f10.add(v10);
                return;
            }
            return;
        }
        k0.c<V> cVar = new k0.c<>();
        cVar.add(v10);
        dc.w wVar = dc.w.f13270a;
        bVar.l(k10, cVar);
    }
}
