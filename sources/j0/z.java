package j0;

import android.view.Choreographer;
import dc.m;
import hc.f;
import j0.y0;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActualAndroid.android.kt */
/* loaded from: classes.dex */
public final class z implements y0 {

    /* renamed from: f  reason: collision with root package name */
    public static final z f18936f = new z();

    /* renamed from: m  reason: collision with root package name */
    private static final Choreographer f18937m = (Choreographer) ad.g.e(ad.a1.c().N0(), new a(null));

    /* compiled from: ActualAndroid.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super Choreographer>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f18938f;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super Choreographer> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f18938f == 0) {
                dc.n.b(obj);
                return Choreographer.getInstance();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f18939f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f18939f = frameCallback;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            z.f18937m.removeFrameCallback(this.f18939f);
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    /* loaded from: classes.dex */
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ad.m<R> f18940f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<Long, R> f18941m;

        /* JADX WARN: Multi-variable type inference failed */
        c(ad.m<? super R> mVar, pc.l<? super Long, ? extends R> lVar) {
            this.f18940f = mVar;
            this.f18941m = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object a10;
            Continuation continuation = this.f18940f;
            z zVar = z.f18936f;
            pc.l<Long, R> lVar = this.f18941m;
            try {
                m.a aVar = dc.m.f13253f;
                a10 = dc.m.a(lVar.invoke(Long.valueOf(j10)));
            } catch (Throwable th) {
                m.a aVar2 = dc.m.f13253f;
                a10 = dc.m.a(dc.n.a(th));
            }
            continuation.resumeWith(a10);
        }
    }

    private z() {
    }

    @Override // j0.y0
    public <R> Object R(pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        c cVar = new c(nVar, lVar);
        f18937m.postFrameCallback(cVar);
        nVar.n(new b(cVar));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
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
