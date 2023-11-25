package androidx.paging;

import kotlin.coroutines.Continuation;

/* compiled from: SuspendingPagingSourceFactory.kt */
/* loaded from: classes.dex */
public final class k2<Key, Value> implements pc.a<u1<Key, Value>> {

    /* renamed from: f  reason: collision with root package name */
    private final ad.g0 f5836f;

    /* renamed from: m  reason: collision with root package name */
    private final pc.a<u1<Key, Value>> f5837m;

    /* compiled from: SuspendingPagingSourceFactory.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super u1<Key, Value>>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5838f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k2<Key, Value> f5839m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k2<Key, Value> k2Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5839m = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f5839m, continuation);
        }

        public final Object invoke(ad.k0 k0Var, Continuation<? super u1<Key, Value>> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f5838f == 0) {
                dc.n.b(obj);
                return ((k2) this.f5839m).f5837m.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(ad.k0 k0Var, Object obj) {
            return invoke(k0Var, (Continuation) ((Continuation) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k2(ad.g0 g0Var, pc.a<? extends u1<Key, Value>> aVar) {
        qc.q.i(g0Var, "dispatcher");
        qc.q.i(aVar, "delegate");
        this.f5836f = g0Var;
        this.f5837m = aVar;
    }

    public final Object b(Continuation<? super u1<Key, Value>> continuation) {
        return ad.g.g(this.f5836f, new a(this, null), continuation);
    }

    @Override // pc.a
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public u1<Key, Value> invoke() {
        return this.f5837m.invoke();
    }
}
