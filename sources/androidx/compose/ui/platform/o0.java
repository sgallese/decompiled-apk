package androidx.compose.ui.platform;

import android.view.Choreographer;
import dc.m;
import hc.f;
import j0.y0;
import kotlin.coroutines.Continuation;

/* compiled from: AndroidUiFrameClock.android.kt */
/* loaded from: classes.dex */
public final class o0 implements j0.y0 {

    /* renamed from: f  reason: collision with root package name */
    private final Choreographer f2773f;

    /* renamed from: m  reason: collision with root package name */
    private final m0 f2774m;

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m0 f2775f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f2776m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f2775f = m0Var;
            this.f2776m = frameCallback;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f2775f.f1(this.f2776m);
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f2778m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f2778m = frameCallback;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            o0.this.a().removeFrameCallback(this.f2778m);
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    /* loaded from: classes.dex */
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ad.m<R> f2779f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ o0 f2780m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.l<Long, R> f2781p;

        /* JADX WARN: Multi-variable type inference failed */
        c(ad.m<? super R> mVar, o0 o0Var, pc.l<? super Long, ? extends R> lVar) {
            this.f2779f = mVar;
            this.f2780m = o0Var;
            this.f2781p = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object a10;
            Continuation continuation = this.f2779f;
            pc.l<Long, R> lVar = this.f2781p;
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

    public o0(Choreographer choreographer, m0 m0Var) {
        qc.q.i(choreographer, "choreographer");
        this.f2773f = choreographer;
        this.f2774m = m0Var;
    }

    @Override // j0.y0
    public <R> Object R(pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        Continuation c10;
        Object d10;
        m0 m0Var = this.f2774m;
        if (m0Var == null) {
            f.b bVar = continuation.getContext().get(hc.d.f16598i);
            if (bVar instanceof m0) {
                m0Var = (m0) bVar;
            } else {
                m0Var = null;
            }
        }
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        c cVar = new c(nVar, this, lVar);
        if (m0Var != null && qc.q.d(m0Var.Z0(), a())) {
            m0Var.e1(cVar);
            nVar.n(new a(m0Var, cVar));
        } else {
            a().postFrameCallback(cVar);
            nVar.n(new b(cVar));
        }
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    public final Choreographer a() {
        return this.f2773f;
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
        return j0.x0.a(this);
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
