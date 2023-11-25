package androidx.paging;

import cd.s;
import kotlin.coroutines.Continuation;

/* compiled from: CancelableChannelFlow.kt */
/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CancelableChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {33}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<g2<T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5719f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f5720m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ ad.x1 f5721p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<g2<T>, Continuation<? super dc.w>, Object> f5722q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CancelableChannelFlow.kt */
        /* renamed from: androidx.paging.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0137a extends qc.r implements pc.l<Throwable, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g2<T> f5723f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0137a(g2<T> g2Var) {
                super(1);
                this.f5723f = g2Var;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
                invoke2(th);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                s.a.a(this.f5723f, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ad.x1 x1Var, pc.p<? super g2<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5721p = x1Var;
            this.f5722q = pVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(g2<T> g2Var, Continuation<? super dc.w> continuation) {
            return ((a) create(g2Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f5721p, this.f5722q, continuation);
            aVar.f5720m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5719f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                g2<T> g2Var = (g2) this.f5720m;
                this.f5721p.s0(new C0137a(g2Var));
                pc.p<g2<T>, Continuation<? super dc.w>, Object> pVar = this.f5722q;
                this.f5719f = 1;
                if (pVar.invoke(g2Var, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public static final <T> dd.g<T> a(ad.x1 x1Var, pc.p<? super g2<T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        qc.q.i(x1Var, "controller");
        qc.q.i(pVar, "block");
        return f2.a(new a(x1Var, pVar, null));
    }
}
