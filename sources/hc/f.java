package hc;

import hc.d;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutineContext.kt */
        /* renamed from: hc.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0393a extends r implements p<f, b, f> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0393a f16600f = new C0393a();

            C0393a() {
                super(2);
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final f invoke(f fVar, b bVar) {
                hc.c cVar;
                q.i(fVar, "acc");
                q.i(bVar, "element");
                f minusKey = fVar.minusKey(bVar.getKey());
                g gVar = g.f16601f;
                if (minusKey != gVar) {
                    d.b bVar2 = d.f16598i;
                    d dVar = (d) minusKey.get(bVar2);
                    if (dVar == null) {
                        cVar = new hc.c(minusKey, bVar);
                    } else {
                        f minusKey2 = minusKey.minusKey(bVar2);
                        if (minusKey2 == gVar) {
                            return new hc.c(bVar, dVar);
                        }
                        cVar = new hc.c(new hc.c(minusKey2, bVar), dVar);
                    }
                    return cVar;
                }
                return bVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            q.i(fVar2, "context");
            if (fVar2 != g.f16601f) {
                return (f) fVar2.fold(fVar, C0393a.f16600f);
            }
            return fVar;
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public interface b extends f {

        /* compiled from: CoroutineContext.kt */
        /* loaded from: classes4.dex */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                q.i(pVar, "operation");
                return pVar.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                q.i(cVar, "key");
                if (q.d(bVar.getKey(), cVar)) {
                    q.g(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static f c(b bVar, c<?> cVar) {
                q.i(cVar, "key");
                if (q.d(bVar.getKey(), cVar)) {
                    return g.f16601f;
                }
                return bVar;
            }

            public static f d(b bVar, f fVar) {
                q.i(fVar, "context");
                return a.a(bVar, fVar);
            }
        }

        @Override // hc.f
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes4.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);

    f plus(f fVar);
}
