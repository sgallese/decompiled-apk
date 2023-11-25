package androidx.lifecycle;

import android.annotation.SuppressLint;
import kotlin.coroutines.Continuation;

/* compiled from: CoroutineLiveData.kt */
/* loaded from: classes.dex */
public final class c0<T> implements b0<T> {

    /* renamed from: a  reason: collision with root package name */
    private f<T> f4946a;

    /* renamed from: b  reason: collision with root package name */
    private final hc.f f4947b;

    /* compiled from: CoroutineLiveData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {99}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f4948f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c0<T> f4949m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ T f4950p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0<T> c0Var, T t10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4949m = c0Var;
            this.f4950p = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f4949m, this.f4950p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f4948f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                f<T> a10 = this.f4949m.a();
                this.f4948f = 1;
                if (a10.s(this) == d10) {
                    return d10;
                }
            }
            this.f4949m.a().p(this.f4950p);
            return dc.w.f13270a;
        }
    }

    public c0(f<T> fVar, hc.f fVar2) {
        qc.q.i(fVar, "target");
        qc.q.i(fVar2, "context");
        this.f4946a = fVar;
        this.f4947b = fVar2.plus(ad.a1.c().N0());
    }

    public final f<T> a() {
        return this.f4946a;
    }

    @Override // androidx.lifecycle.b0
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object g10 = ad.g.g(this.f4947b, new a(this, t10, null), continuation);
        d10 = ic.d.d();
        if (g10 == d10) {
            return g10;
        }
        return dc.w.f13270a;
    }
}
