package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import dc.m;
import kotlin.coroutines.Continuation;

/* compiled from: SimpleChannelFlow.kt */
/* loaded from: classes.dex */
public final class h2<T> implements g2<T>, ad.k0, cd.s<T> {

    /* renamed from: f  reason: collision with root package name */
    private final cd.s<T> f5747f;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ ad.k0 f5748m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {100}, m = "awaitClose")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f5749f;

        /* renamed from: m  reason: collision with root package name */
        Object f5750m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f5751p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ h2<T> f5752q;

        /* renamed from: r  reason: collision with root package name */
        int f5753r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h2<T> h2Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f5752q = h2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5751p = obj;
            this.f5753r |= RecyclerView.UNDEFINED_DURATION;
            return this.f5752q.j(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleChannelFlow.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ad.m<dc.w> f5754f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ad.m<? super dc.w> mVar) {
            super(1);
            this.f5754f = mVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ad.m<dc.w> mVar = this.f5754f;
            m.a aVar = dc.m.f13253f;
            mVar.resumeWith(dc.m.a(dc.w.f13270a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h2(ad.k0 k0Var, cd.s<? super T> sVar) {
        qc.q.i(k0Var, "scope");
        qc.q.i(sVar, "channel");
        this.f5747f = sVar;
        this.f5748m = k0Var;
    }

    @Override // ad.k0
    public hc.f getCoroutineContext() {
        return this.f5748m.getCoroutineContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // androidx.paging.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(pc.a<dc.w> r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.h2.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.h2$a r0 = (androidx.paging.h2.a) r0
            int r1 = r0.f5753r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5753r = r1
            goto L18
        L13:
            androidx.paging.h2$a r0 = new androidx.paging.h2$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5751p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f5753r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f5750m
            ad.x1 r6 = (ad.x1) r6
            java.lang.Object r6 = r0.f5749f
            pc.a r6 = (pc.a) r6
            dc.n.b(r7)     // Catch: java.lang.Throwable -> L86
            goto L74
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            dc.n.b(r7)
            hc.f r7 = r5.getCoroutineContext()     // Catch: java.lang.Throwable -> L86
            ad.x1$b r2 = ad.x1.f574b     // Catch: java.lang.Throwable -> L86
            hc.f$b r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L86
            if (r7 == 0) goto L7a
            ad.x1 r7 = (ad.x1) r7     // Catch: java.lang.Throwable -> L86
            r0.f5749f = r6     // Catch: java.lang.Throwable -> L86
            r0.f5750m = r7     // Catch: java.lang.Throwable -> L86
            r0.f5753r = r3     // Catch: java.lang.Throwable -> L86
            ad.n r2 = new ad.n     // Catch: java.lang.Throwable -> L86
            kotlin.coroutines.Continuation r4 = ic.b.c(r0)     // Catch: java.lang.Throwable -> L86
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L86
            r2.A()     // Catch: java.lang.Throwable -> L86
            androidx.paging.h2$b r3 = new androidx.paging.h2$b     // Catch: java.lang.Throwable -> L86
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L86
            r7.s0(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r7 = r2.x()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = ic.b.d()     // Catch: java.lang.Throwable -> L86
            if (r7 != r2) goto L71
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L86
        L71:
            if (r7 != r1) goto L74
            return r1
        L74:
            r6.invoke()
            dc.w r6 = dc.w.f13270a
            return r6
        L7a:
            java.lang.String r7 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L86
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r7 = move-exception
            r6.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.h2.j(pc.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // cd.s
    public boolean l(Throwable th) {
        return this.f5747f.l(th);
    }

    @Override // cd.s
    public Object p(T t10) {
        return this.f5747f.p(t10);
    }

    @Override // cd.s
    public Object r(T t10, Continuation<? super dc.w> continuation) {
        return this.f5747f.r(t10, continuation);
    }
}
