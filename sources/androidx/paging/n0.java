package androidx.paging;

import ad.x1;
import androidx.lifecycle.LiveData;
import androidx.paging.n1;
import androidx.paging.q0;
import kotlin.coroutines.Continuation;

/* compiled from: LivePagedList.kt */
/* loaded from: classes.dex */
public final class n0<Key, Value> extends LiveData<n1<Value>> {

    /* renamed from: l  reason: collision with root package name */
    private final ad.k0 f5883l;

    /* renamed from: m  reason: collision with root package name */
    private final n1.d f5884m;

    /* renamed from: n  reason: collision with root package name */
    private final pc.a<u1<Key, Value>> f5885n;

    /* renamed from: o  reason: collision with root package name */
    private final ad.g0 f5886o;

    /* renamed from: p  reason: collision with root package name */
    private final ad.g0 f5887p;

    /* renamed from: q  reason: collision with root package name */
    private n1<Value> f5888q;

    /* renamed from: r  reason: collision with root package name */
    private ad.x1 f5889r;

    /* renamed from: s  reason: collision with root package name */
    private final pc.a<dc.w> f5890s;

    /* renamed from: t  reason: collision with root package name */
    private final Runnable f5891t;

    /* compiled from: LivePagedList.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f5892f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<Key, Value> n0Var) {
            super(0);
            this.f5892f = n0Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f5892f.D(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LivePagedList.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LivePagedList$invalidate$1", f = "LivePagedList.kt", l = {82, 90}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f5893f;

        /* renamed from: m  reason: collision with root package name */
        Object f5894m;

        /* renamed from: p  reason: collision with root package name */
        int f5895p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ n0<Key, Value> f5896q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LivePagedList.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LivePagedList$invalidate$1$1", f = "LivePagedList.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f5897f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ n0<Key, Value> f5898m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n0<Key, Value> n0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f5898m = n0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f5898m, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ic.d.d();
                if (this.f5897f == 0) {
                    dc.n.b(obj);
                    ((n0) this.f5898m).f5888q.N(t0.REFRESH, q0.b.f6000b);
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n0<Key, Value> n0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5896q = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f5896q, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.n0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(ad.k0 k0Var, Key key, n1.d dVar, n1.a<Value> aVar, pc.a<? extends u1<Key, Value>> aVar2, ad.g0 g0Var, ad.g0 g0Var2) {
        super(new d0(k0Var, g0Var, g0Var2, dVar, key));
        qc.q.i(k0Var, "coroutineScope");
        qc.q.i(dVar, "config");
        qc.q.i(aVar2, "pagingSourceFactory");
        qc.q.i(g0Var, "notifyDispatcher");
        qc.q.i(g0Var2, "fetchDispatcher");
        this.f5883l = k0Var;
        this.f5884m = dVar;
        this.f5885n = aVar2;
        this.f5886o = g0Var;
        this.f5887p = g0Var2;
        this.f5890s = new a(this);
        Runnable runnable = new Runnable() { // from class: androidx.paging.m0
            @Override // java.lang.Runnable
            public final void run() {
                n0.F(n0.this);
            }
        };
        this.f5891t = runnable;
        n1<Value> f10 = f();
        qc.q.f(f10);
        n1<Value> n1Var = f10;
        this.f5888q = n1Var;
        n1Var.O(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(boolean z10) {
        ad.x1 d10;
        ad.x1 x1Var = this.f5889r;
        if (x1Var != null && !z10) {
            return;
        }
        if (x1Var != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        d10 = ad.i.d(this.f5883l, this.f5887p, null, new b(this, null), 2, null);
        this.f5889r = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(n1<Value> n1Var, n1<Value> n1Var2) {
        n1Var.O(null);
        n1Var2.O(this.f5891t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(n0 n0Var) {
        qc.q.i(n0Var, "this$0");
        n0Var.D(true);
    }

    public static final /* synthetic */ n1.a r(n0 n0Var) {
        n0Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void l() {
        super.l();
        D(false);
    }
}
