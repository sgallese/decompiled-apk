package ad;

import hc.d;
import hc.f;
import kotlin.coroutines.Continuation;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes4.dex */
public abstract class g0 extends hc.a implements hc.d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f510f = new a(null);

    /* compiled from: CoroutineDispatcher.kt */
    /* loaded from: classes4.dex */
    public static final class a extends hc.b<hc.d, g0> {

        /* compiled from: CoroutineDispatcher.kt */
        /* renamed from: ad.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0007a extends qc.r implements pc.l<f.b, g0> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0007a f511f = new C0007a();

            C0007a() {
                super(1);
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final g0 invoke(f.b bVar) {
                if (bVar instanceof g0) {
                    return (g0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        private a() {
            super(hc.d.f16598i, C0007a.f511f);
        }
    }

    public g0() {
        super(hc.d.f16598i);
    }

    public abstract void A0(hc.f fVar, Runnable runnable);

    public void C0(hc.f fVar, Runnable runnable) {
        A0(fVar, runnable);
    }

    public boolean D0(hc.f fVar) {
        return true;
    }

    public g0 F0(int i10) {
        fd.o.a(i10);
        return new fd.n(this, i10);
    }

    @Override // hc.d
    public final void e(Continuation<?> continuation) {
        qc.q.g(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((fd.i) continuation).r();
    }

    @Override // hc.a, hc.f.b, hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) d.a.a(this, cVar);
    }

    @Override // hc.d
    public final <T> Continuation<T> m(Continuation<? super T> continuation) {
        return new fd.i(this, continuation);
    }

    @Override // hc.a, hc.f
    public hc.f minusKey(f.c<?> cVar) {
        return d.a.b(this, cVar);
    }

    public String toString() {
        return o0.a(this) + '@' + o0.b(this);
    }
}
