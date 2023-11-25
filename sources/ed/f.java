package ed;

import ad.f0;
import hc.d;
import kotlin.coroutines.Continuation;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public abstract class f<S, T> extends d<T> {

    /* renamed from: q  reason: collision with root package name */
    protected final dd.g<S> f14223q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14224f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f14225m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f<S, T> f14226p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<S, T> fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14226p = fVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
            return ((a) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f14226p, continuation);
            aVar.f14225m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f14224f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.h<? super T> hVar = (dd.h) this.f14225m;
                f<S, T> fVar = this.f14226p;
                this.f14224f = 1;
                if (fVar.r(hVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(dd.g<? extends S> gVar, hc.f fVar, int i10, cd.a aVar) {
        super(fVar, i10, aVar);
        this.f14223q = gVar;
    }

    static /* synthetic */ <S, T> Object o(f<S, T> fVar, dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object d11;
        Object d12;
        if (fVar.f14214m == -3) {
            hc.f context = continuation.getContext();
            hc.f e10 = f0.e(context, fVar.f14213f);
            if (qc.q.d(e10, context)) {
                Object r10 = fVar.r(hVar, continuation);
                d12 = ic.d.d();
                if (r10 == d12) {
                    return r10;
                }
                return dc.w.f13270a;
            }
            d.b bVar = hc.d.f16598i;
            if (qc.q.d(e10.get(bVar), context.get(bVar))) {
                Object q10 = fVar.q(hVar, e10, continuation);
                d11 = ic.d.d();
                if (q10 == d11) {
                    return q10;
                }
                return dc.w.f13270a;
            }
        }
        Object collect = super.collect(hVar, continuation);
        d10 = ic.d.d();
        if (collect == d10) {
            return collect;
        }
        return dc.w.f13270a;
    }

    static /* synthetic */ <S, T> Object p(f<S, T> fVar, cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object r10 = fVar.r(new v(pVar), continuation);
        d10 = ic.d.d();
        if (r10 == d10) {
            return r10;
        }
        return dc.w.f13270a;
    }

    private final Object q(dd.h<? super T> hVar, hc.f fVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object c10 = e.c(fVar, e.a(hVar, continuation.getContext()), null, new a(this, null), continuation, 4, null);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    @Override // ed.d, dd.g
    public Object collect(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
        return o(this, hVar, continuation);
    }

    @Override // ed.d
    protected Object i(cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
        return p(this, pVar, continuation);
    }

    protected abstract Object r(dd.h<? super T> hVar, Continuation<? super dc.w> continuation);

    @Override // ed.d
    public String toString() {
        return this.f14223q + " -> " + super.toString();
    }
}
