package j0;

import hc.f;
import j0.y0;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActualAndroid.android.kt */
/* loaded from: classes.dex */
public final class h2 implements y0 {

    /* renamed from: f  reason: collision with root package name */
    public static final h2 f18648f = new h2();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ActualAndroid.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<R> extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super R>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f18649f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<Long, R> f18650m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.l<? super Long, ? extends R> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f18650m = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f18650m, continuation);
        }

        public final Object invoke(ad.k0 k0Var, Continuation<? super R> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f18649f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                this.f18649f = 1;
                if (ad.u0.a(16L, this) == d10) {
                    return d10;
                }
            }
            return this.f18650m.invoke(kotlin.coroutines.jvm.internal.b.e(System.nanoTime()));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(ad.k0 k0Var, Object obj) {
            return invoke(k0Var, (Continuation) ((Continuation) obj));
        }
    }

    private h2() {
    }

    @Override // j0.y0
    public <R> Object R(pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        return ad.g.g(ad.a1.c(), new a(lVar, null), continuation);
    }

    @Override // hc.f
    public <R> R fold(R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) y0.a.a(this, r10, pVar);
    }

    @Override // hc.f.b, hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) y0.a.b(this, cVar);
    }

    @Override // hc.f.b
    public /* synthetic */ f.c getKey() {
        return x0.a(this);
    }

    @Override // hc.f
    public hc.f minusKey(f.c<?> cVar) {
        return y0.a.c(this, cVar);
    }

    @Override // hc.f
    public hc.f plus(hc.f fVar) {
        return y0.a.d(this, fVar);
    }
}
