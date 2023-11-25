package androidx.lifecycle;

import ad.c2;
import androidx.lifecycle.p;
import kotlin.coroutines.Continuation;

/* compiled from: Lifecycle.kt */
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends q implements s {

    /* renamed from: f  reason: collision with root package name */
    private final p f4860f;

    /* renamed from: m  reason: collision with root package name */
    private final hc.f f4861m;

    /* compiled from: Lifecycle.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f4862f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f4863m;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f4863m = obj;
            return aVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f4862f == 0) {
                dc.n.b(obj);
                ad.k0 k0Var = (ad.k0) this.f4863m;
                if (LifecycleCoroutineScopeImpl.this.a().b().compareTo(p.b.INITIALIZED) < 0) {
                    c2.f(k0Var.getCoroutineContext(), null, 1, null);
                } else {
                    LifecycleCoroutineScopeImpl.this.a().a(LifecycleCoroutineScopeImpl.this);
                }
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(p pVar, hc.f fVar) {
        qc.q.i(pVar, "lifecycle");
        qc.q.i(fVar, "coroutineContext");
        this.f4860f = pVar;
        this.f4861m = fVar;
        if (a().b() == p.b.DESTROYED) {
            c2.f(getCoroutineContext(), null, 1, null);
        }
    }

    public p a() {
        return this.f4860f;
    }

    public final void b() {
        ad.i.d(this, ad.a1.c().N0(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        qc.q.i(vVar, "source");
        qc.q.i(aVar, "event");
        if (a().b().compareTo(p.b.DESTROYED) <= 0) {
            a().d(this);
            c2.f(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // ad.k0
    public hc.f getCoroutineContext() {
        return this.f4861m;
    }
}
