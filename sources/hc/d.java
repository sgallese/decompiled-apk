package hc;

import hc.f;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: ContinuationInterceptor.kt */
/* loaded from: classes4.dex */
public interface d extends f.b {

    /* renamed from: i  reason: collision with root package name */
    public static final b f16598i = b.f16599f;

    /* compiled from: ContinuationInterceptor.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static <E extends f.b> E a(d dVar, f.c<E> cVar) {
            q.i(cVar, "key");
            if (cVar instanceof hc.b) {
                hc.b bVar = (hc.b) cVar;
                if (!bVar.a(dVar.getKey())) {
                    return null;
                }
                E e10 = (E) bVar.b(dVar);
                if (!(e10 instanceof f.b)) {
                    return null;
                }
                return e10;
            } else if (d.f16598i != cVar) {
                return null;
            } else {
                q.g(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
        }

        public static f b(d dVar, f.c<?> cVar) {
            q.i(cVar, "key");
            if (cVar instanceof hc.b) {
                hc.b bVar = (hc.b) cVar;
                if (bVar.a(dVar.getKey()) && bVar.b(dVar) != null) {
                    return g.f16601f;
                }
                return dVar;
            } else if (d.f16598i == cVar) {
                return g.f16601f;
            } else {
                return dVar;
            }
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    /* loaded from: classes4.dex */
    public static final class b implements f.c<d> {

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ b f16599f = new b();

        private b() {
        }
    }

    void e(Continuation<?> continuation);

    <T> Continuation<T> m(Continuation<? super T> continuation);
}
