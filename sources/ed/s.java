package ed;

import ad.a2;
import hc.f;
import kotlin.coroutines.Continuation;

/* compiled from: SafeCollector.kt */
/* loaded from: classes4.dex */
public final class s<T> extends kotlin.coroutines.jvm.internal.d implements dd.h<T> {

    /* renamed from: f  reason: collision with root package name */
    public final dd.h<T> f14283f;

    /* renamed from: m  reason: collision with root package name */
    public final hc.f f14284m;

    /* renamed from: p  reason: collision with root package name */
    public final int f14285p;

    /* renamed from: q  reason: collision with root package name */
    private hc.f f14286q;

    /* renamed from: r  reason: collision with root package name */
    private Continuation<? super dc.w> f14287r;

    /* compiled from: SafeCollector.kt */
    /* loaded from: classes4.dex */
    static final class a extends qc.r implements pc.p<Integer, f.b, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14288f = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, f.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, f.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(dd.h<? super T> hVar, hc.f fVar) {
        super(p.f14277f, hc.g.f16601f);
        this.f14283f = hVar;
        this.f14284m = fVar;
        this.f14285p = ((Number) fVar.fold(0, a.f14288f)).intValue();
    }

    private final void a(hc.f fVar, hc.f fVar2, T t10) {
        if (fVar2 instanceof k) {
            i((k) fVar2, t10);
        }
        u.a(this, fVar);
    }

    private final Object h(Continuation<? super dc.w> continuation, T t10) {
        Object d10;
        hc.f context = continuation.getContext();
        a2.k(context);
        hc.f fVar = this.f14286q;
        if (fVar != context) {
            a(context, fVar, t10);
            this.f14286q = context;
        }
        this.f14287r = continuation;
        pc.q a10 = t.a();
        dd.h<T> hVar = this.f14283f;
        qc.q.g(hVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        qc.q.g(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a10.invoke(hVar, t10, this);
        d10 = ic.d.d();
        if (!qc.q.d(invoke, d10)) {
            this.f14287r = null;
        }
        return invoke;
    }

    private final void i(k kVar, Object obj) {
        String f10;
        f10 = yc.o.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + kVar.f14270f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(f10.toString());
    }

    @Override // dd.h
    public Object emit(T t10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object d11;
        try {
            Object h10 = h(continuation, t10);
            d10 = ic.d.d();
            if (h10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (h10 == d11) {
                return h10;
            }
            return dc.w.f13270a;
        } catch (Throwable th) {
            this.f14286q = new k(th, continuation.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        Continuation<? super dc.w> continuation = this.f14287r;
        if (continuation instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.Continuation
    public hc.f getContext() {
        hc.f fVar = this.f14286q;
        if (fVar == null) {
            return hc.g.f16601f;
        }
        return fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Object d10;
        Throwable b10 = dc.m.b(obj);
        if (b10 != null) {
            this.f14286q = new k(b10, getContext());
        }
        Continuation<? super dc.w> continuation = this.f14287r;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        d10 = ic.d.d();
        return d10;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
