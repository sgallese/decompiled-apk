package dd;

import ad.x1;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collect.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Collect.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13359f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g<T> f13360m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g<? extends T> gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f13360m = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f13360m, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f13359f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                g<T> gVar = this.f13360m;
                this.f13359f = 1;
                if (i.f(gVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public static final Object a(g<?> gVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object collect = gVar.collect(ed.q.f14279f, continuation);
        d10 = ic.d.d();
        if (collect == d10) {
            return collect;
        }
        return dc.w.f13270a;
    }

    public static final <T> Object b(g<? extends T> gVar, pc.p<? super T, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super dc.w> continuation) {
        g b10;
        Object d10;
        b10 = m.b(i.F(gVar, pVar), 0, null, 2, null);
        Object f10 = i.f(b10, continuation);
        d10 = ic.d.d();
        if (f10 == d10) {
            return f10;
        }
        return dc.w.f13270a;
    }

    public static final <T> Object c(h<? super T> hVar, g<? extends T> gVar, Continuation<? super dc.w> continuation) {
        Object d10;
        i.t(hVar);
        Object collect = gVar.collect(hVar, continuation);
        d10 = ic.d.d();
        if (collect == d10) {
            return collect;
        }
        return dc.w.f13270a;
    }

    public static final <T> x1 d(g<? extends T> gVar, ad.k0 k0Var) {
        x1 d10;
        d10 = ad.i.d(k0Var, null, null, new a(gVar, null), 3, null);
        return d10;
    }
}
