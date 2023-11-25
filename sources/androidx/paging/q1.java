package androidx.paging;

import kotlin.coroutines.Continuation;

/* compiled from: Pager.kt */
/* loaded from: classes.dex */
public final class q1<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final dd.g<s1<Value>> f6004a;

    /* compiled from: Pager.kt */
    /* loaded from: classes.dex */
    /* synthetic */ class a extends qc.n implements pc.l<Continuation<? super u1<Key, Value>>, Object> {
        a(Object obj) {
            super(1, obj, k2.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // pc.l
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super u1<Key, Value>> continuation) {
            return ((k2) this.f21661m).b(continuation);
        }
    }

    /* compiled from: Pager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.l<Continuation<? super u1<Key, Value>>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f6005f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.a<u1<Key, Value>> f6006m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.a<? extends u1<Key, Value>> aVar, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f6006m = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Continuation<?> continuation) {
            return new b(this.f6006m, continuation);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Continuation) ((Continuation) obj));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f6005f == 0) {
                dc.n.b(obj);
                return this.f6006m.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(Continuation<? super u1<Key, Value>> continuation) {
            return ((b) create(continuation)).invokeSuspend(dc.w.f13270a);
        }
    }

    public q1(r1 r1Var, Key key, c2<Key, Value> c2Var, pc.a<? extends u1<Key, Value>> aVar) {
        pc.l bVar;
        qc.q.i(r1Var, "config");
        qc.q.i(aVar, "pagingSourceFactory");
        if (aVar instanceof k2) {
            bVar = new a(aVar);
        } else {
            bVar = new b(aVar, null);
        }
        this.f6004a = new e1(bVar, key, r1Var, c2Var).i();
    }

    public final dd.g<s1<Value>> a() {
        return this.f6004a;
    }

    public /* synthetic */ q1(r1 r1Var, Object obj, pc.a aVar, int i10, qc.h hVar) {
        this(r1Var, (i10 & 2) != 0 ? null : obj, aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, Key key, pc.a<? extends u1<Key, Value>> aVar) {
        this(r1Var, key, null, aVar);
        qc.q.i(r1Var, "config");
        qc.q.i(aVar, "pagingSourceFactory");
    }
}
