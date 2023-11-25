package ed;

import ad.k0;
import kotlin.coroutines.Continuation;

/* compiled from: FlowCoroutine.kt */
/* loaded from: classes4.dex */
public final class m {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a<R> implements dd.g<R> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.q f14272f;

        public a(pc.q qVar) {
            this.f14272f = qVar;
        }

        @Override // dd.g
        public Object collect(dd.h<? super R> hVar, Continuation<? super dc.w> continuation) {
            Object d10;
            Object a10 = m.a(new b(this.f14272f, hVar, null), continuation);
            d10 = ic.d.d();
            if (a10 == d10) {
                return a10;
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: FlowCoroutine.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14273f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f14274m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.q<k0, dd.h<? super R>, Continuation<? super dc.w>, Object> f14275p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ dd.h<R> f14276q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.q<? super k0, ? super dd.h<? super R>, ? super Continuation<? super dc.w>, ? extends Object> qVar, dd.h<? super R> hVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f14275p = qVar;
            this.f14276q = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f14275p, this.f14276q, continuation);
            bVar.f14274m = obj;
            return bVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f14273f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f14274m;
                pc.q<k0, dd.h<? super R>, Continuation<? super dc.w>, Object> qVar = this.f14275p;
                Object obj2 = this.f14276q;
                this.f14273f = 1;
                if (qVar.invoke(k0Var, obj2, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public static final <R> Object a(pc.p<? super k0, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        Object d10;
        l lVar = new l(continuation.getContext(), continuation);
        Object c10 = gd.b.c(lVar, lVar, pVar);
        d10 = ic.d.d();
        if (c10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return c10;
    }

    public static final <R> dd.g<R> b(pc.q<? super k0, ? super dd.h<? super R>, ? super Continuation<? super dc.w>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
