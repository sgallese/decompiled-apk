package j0;

import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProduceState.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class a3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProduceState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f18528f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f18529m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<t1<T>, Continuation<? super dc.w>, Object> f18530p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ j1<T> f18531q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.p<? super t1<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, j1<T> j1Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f18530p = pVar;
            this.f18531q = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f18530p, this.f18531q, continuation);
            aVar.f18529m = obj;
            return aVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f18528f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                ad.k0 k0Var = (ad.k0) this.f18529m;
                pc.p<t1<T>, Continuation<? super dc.w>, Object> pVar = this.f18530p;
                u1 u1Var = new u1(this.f18531q, k0Var.getCoroutineContext());
                this.f18528f = 1;
                if (pVar.invoke(u1Var, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public static final <T> g3<T> a(T t10, Object obj, Object obj2, pc.p<? super t1<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, l lVar, int i10) {
        qc.q.i(pVar, "producer");
        lVar.e(-1703169085);
        if (n.K()) {
            n.V(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:141)");
        }
        lVar.e(-492369756);
        Object f10 = lVar.f();
        if (f10 == l.f18688a.a()) {
            f10 = d3.e(t10, null, 2, null);
            lVar.J(f10);
        }
        lVar.N();
        j1 j1Var = (j1) f10;
        h0.c(obj, obj2, new a(pVar, j1Var, null), lVar, 584);
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return j1Var;
    }
}
