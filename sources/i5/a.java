package i5;

import ad.g;
import ad.i;
import ad.k0;
import ad.m0;
import ad.r0;
import dc.n;
import dc.w;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.h;
import qc.q;
import v5.k;

/* compiled from: Amplitude.kt */
/* loaded from: classes.dex */
public class a extends p5.a {

    /* renamed from: o  reason: collision with root package name */
    public static final C0398a f16964o = new C0398a(null);

    /* renamed from: m  reason: collision with root package name */
    private boolean f16965m;

    /* renamed from: n  reason: collision with root package name */
    private k5.c f16966n;

    /* compiled from: Amplitude.kt */
    /* renamed from: i5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0398a {
        private C0398a() {
        }

        public /* synthetic */ C0398a(h hVar) {
            this();
        }
    }

    /* compiled from: Amplitude.kt */
    @f(c = "com.amplitude.android.Amplitude$build$built$1", f = "Amplitude.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends l implements p<k0, Continuation<? super Boolean>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f16967f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ a f16969p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f16969p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f16969p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super Boolean> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f16967f == 0) {
                n.b(obj);
                a aVar = a.this;
                aVar.y(aVar.h().n().a(this.f16969p));
                File dir = ((i5.b) a.this.h()).r().getDir(q.q("amplitude-kotlin-", a.this.h().f()), 0);
                a aVar2 = a.this;
                aVar2.x(v5.e.f24603c.a(new v5.d(aVar2.h().f(), a.this.h().a(), null, new v5.b(), dir, ((i5.b) a.this.h()).g().a(this.f16969p), 4, null)));
                t5.a aVar3 = new t5.a(a.this.o());
                a.this.i().c().c(aVar3);
                if (a.this.i().c().b()) {
                    aVar3.c(a.this.i().c().d(), k.Initialized);
                }
                a.this.f16966n = new k5.c();
                a aVar4 = a.this;
                k5.c cVar = aVar4.f16966n;
                if (cVar == null) {
                    q.z("androidContextPlugin");
                    cVar = null;
                }
                aVar4.a(cVar);
                a.this.a(new s5.b());
                a.this.a(new k5.d());
                a.this.a(new k5.a());
                a.this.a(new k5.b());
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Amplitude.kt */
    @f(c = "com.amplitude.android.Amplitude$onExitForeground$1", f = "Amplitude.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f16970f;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f16970f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                r0<Boolean> u10 = a.this.u();
                this.f16970f = 1;
                if (u10.E(this) == d10) {
                    return d10;
                }
            }
            if (((i5.b) a.this.h()).t()) {
                a.this.e();
            }
            return w.f13270a;
        }
    }

    /* compiled from: Amplitude.kt */
    /* loaded from: classes.dex */
    public static final class d extends Thread {
        d() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ((i5.d) a.this.p()).z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i5.b bVar) {
        super(bVar);
        q.i(bVar, "configuration");
        ((i5.d) p()).w();
        M();
    }

    private final void M() {
        Runtime.getRuntime().addShutdownHook(new d());
    }

    @Override // p5.a
    /* renamed from: I  reason: merged with bridge method [inline-methods] */
    public i5.d d() {
        i5.d dVar = new i5.d();
        dVar.g(this);
        return dVar;
    }

    public final boolean J() {
        return this.f16965m;
    }

    public final void K(long j10) {
        this.f16965m = true;
        q5.a aVar = new q5.a();
        aVar.K0("session_start");
        aVar.z0(Long.valueOf(j10));
        aVar.y0(-1L);
        p().f(aVar);
    }

    public final void L() {
        this.f16965m = false;
        i.d(g(), f(), null, new c(null), 2, null);
    }

    @Override // p5.a
    public r0<Boolean> b() {
        r0<Boolean> a10 = g.a(g(), f(), m0.LAZY, new b(this, null));
        a(new s5.a());
        return a10;
    }
}
