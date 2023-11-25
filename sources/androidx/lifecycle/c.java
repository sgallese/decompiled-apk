package androidx.lifecycle;

import ad.x1;
import kotlin.coroutines.Continuation;

/* compiled from: CoroutineLiveData.kt */
/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f4934a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.p<b0<T>, Continuation<? super dc.w>, Object> f4935b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4936c;

    /* renamed from: d  reason: collision with root package name */
    private final ad.k0 f4937d;

    /* renamed from: e  reason: collision with root package name */
    private final pc.a<dc.w> f4938e;

    /* renamed from: f  reason: collision with root package name */
    private x1 f4939f;

    /* renamed from: g  reason: collision with root package name */
    private x1 f4940g;

    /* compiled from: CoroutineLiveData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f4941f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c<T> f4942m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4942m = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f4942m, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f4941f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                long j10 = ((c) this.f4942m).f4936c;
                this.f4941f = 1;
                if (ad.u0.a(j10, this) == d10) {
                    return d10;
                }
            }
            if (!((c) this.f4942m).f4934a.h()) {
                x1 x1Var = ((c) this.f4942m).f4939f;
                if (x1Var != null) {
                    x1.a.a(x1Var, null, 1, null);
                }
                ((c) this.f4942m).f4939f = null;
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: CoroutineLiveData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f4943f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f4944m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ c<T> f4945p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<T> cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4945p = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f4945p, continuation);
            bVar.f4944m = obj;
            return bVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f4943f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                c0 c0Var = new c0(((c) this.f4945p).f4934a, ((ad.k0) this.f4944m).getCoroutineContext());
                pc.p pVar = ((c) this.f4945p).f4935b;
                this.f4943f = 1;
                if (pVar.invoke(c0Var, this) == d10) {
                    return d10;
                }
            }
            ((c) this.f4945p).f4938e.invoke();
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(f<T> fVar, pc.p<? super b0<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, long j10, ad.k0 k0Var, pc.a<dc.w> aVar) {
        qc.q.i(fVar, "liveData");
        qc.q.i(pVar, "block");
        qc.q.i(k0Var, "scope");
        qc.q.i(aVar, "onDone");
        this.f4934a = fVar;
        this.f4935b = pVar;
        this.f4936c = j10;
        this.f4937d = k0Var;
        this.f4938e = aVar;
    }

    public final void g() {
        x1 d10;
        if (this.f4940g == null) {
            d10 = ad.i.d(this.f4937d, ad.a1.c().N0(), null, new a(this, null), 2, null);
            this.f4940g = d10;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }

    public final void h() {
        x1 d10;
        x1 x1Var = this.f4940g;
        if (x1Var != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        this.f4940g = null;
        if (this.f4939f == null) {
            d10 = ad.i.d(this.f4937d, null, null, new b(this, null), 3, null);
            this.f4939f = d10;
        }
    }
}
