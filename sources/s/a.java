package s;

import j0.d3;
import j0.g3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import s.q;

/* compiled from: Animatable.kt */
/* loaded from: classes.dex */
public final class a<T, V extends q> {

    /* renamed from: a */
    private final i1<T, V> f22551a;

    /* renamed from: b */
    private final T f22552b;

    /* renamed from: c */
    private final String f22553c;

    /* renamed from: d */
    private final l<T, V> f22554d;

    /* renamed from: e */
    private final j0.j1 f22555e;

    /* renamed from: f */
    private final j0.j1 f22556f;

    /* renamed from: g */
    private final u0 f22557g;

    /* renamed from: h */
    private final z0<T> f22558h;

    /* renamed from: i */
    private final V f22559i;

    /* renamed from: j */
    private final V f22560j;

    /* renamed from: k */
    private V f22561k;

    /* renamed from: l */
    private V f22562l;

    /* compiled from: Animatable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
    /* renamed from: s.a$a */
    /* loaded from: classes.dex */
    public static final class C0520a extends kotlin.coroutines.jvm.internal.l implements pc.l<Continuation<? super h<T, V>>, Object> {

        /* renamed from: f */
        Object f22563f;

        /* renamed from: m */
        Object f22564m;

        /* renamed from: p */
        int f22565p;

        /* renamed from: q */
        final /* synthetic */ a<T, V> f22566q;

        /* renamed from: r */
        final /* synthetic */ T f22567r;

        /* renamed from: s */
        final /* synthetic */ e<T, V> f22568s;

        /* renamed from: t */
        final /* synthetic */ long f22569t;

        /* renamed from: u */
        final /* synthetic */ pc.l<a<T, V>, dc.w> f22570u;

        /* compiled from: Animatable.kt */
        /* renamed from: s.a$a$a */
        /* loaded from: classes.dex */
        public static final class C0521a extends qc.r implements pc.l<i<T, V>, dc.w> {

            /* renamed from: f */
            final /* synthetic */ a<T, V> f22571f;

            /* renamed from: m */
            final /* synthetic */ l<T, V> f22572m;

            /* renamed from: p */
            final /* synthetic */ pc.l<a<T, V>, dc.w> f22573p;

            /* renamed from: q */
            final /* synthetic */ qc.b0 f22574q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0521a(a<T, V> aVar, l<T, V> lVar, pc.l<? super a<T, V>, dc.w> lVar2, qc.b0 b0Var) {
                super(1);
                this.f22571f = aVar;
                this.f22572m = lVar;
                this.f22573p = lVar2;
                this.f22574q = b0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(i<T, V> iVar) {
                qc.q.i(iVar, "$this$animate");
                c1.m(iVar, this.f22571f.k());
                Object h10 = this.f22571f.h(iVar.e());
                if (!qc.q.d(h10, iVar.e())) {
                    this.f22571f.k().v(h10);
                    this.f22572m.v(h10);
                    pc.l<a<T, V>, dc.w> lVar = this.f22573p;
                    if (lVar != null) {
                        lVar.invoke(this.f22571f);
                    }
                    iVar.a();
                    this.f22574q.f21657f = true;
                    return;
                }
                pc.l<a<T, V>, dc.w> lVar2 = this.f22573p;
                if (lVar2 != null) {
                    lVar2.invoke(this.f22571f);
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
                a((i) obj);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0520a(a<T, V> aVar, T t10, e<T, V> eVar, long j10, pc.l<? super a<T, V>, dc.w> lVar, Continuation<? super C0520a> continuation) {
            super(1, continuation);
            this.f22566q = aVar;
            this.f22567r = t10;
            this.f22568s = eVar;
            this.f22569t = j10;
            this.f22570u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Continuation<?> continuation) {
            return new C0520a(this.f22566q, this.f22567r, this.f22568s, this.f22569t, this.f22570u, continuation);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((Continuation) ((Continuation) obj));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            l lVar;
            qc.b0 b0Var;
            f fVar;
            d10 = ic.d.d();
            int i10 = this.f22565p;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        b0Var = (qc.b0) this.f22564m;
                        lVar = (l) this.f22563f;
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    this.f22566q.k().w(this.f22566q.m().a().invoke(this.f22567r));
                    this.f22566q.t(this.f22568s.g());
                    this.f22566q.s(true);
                    l d11 = m.d(this.f22566q.k(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    qc.b0 b0Var2 = new qc.b0();
                    e<T, V> eVar = this.f22568s;
                    long j10 = this.f22569t;
                    C0521a c0521a = new C0521a(this.f22566q, d11, this.f22570u, b0Var2);
                    this.f22563f = d11;
                    this.f22564m = b0Var2;
                    this.f22565p = 1;
                    if (c1.c(d11, eVar, j10, c0521a, this) == d10) {
                        return d10;
                    }
                    lVar = d11;
                    b0Var = b0Var2;
                }
                if (b0Var.f21657f) {
                    fVar = f.BoundReached;
                } else {
                    fVar = f.Finished;
                }
                this.f22566q.j();
                return new h(lVar, fVar);
            } catch (CancellationException e10) {
                this.f22566q.j();
                throw e10;
            }
        }

        public final Object invoke(Continuation<? super h<T, V>> continuation) {
            return ((C0520a) create(continuation)).invokeSuspend(dc.w.f13270a);
        }
    }

    /* compiled from: Animatable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.l<Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f22575f;

        /* renamed from: m */
        final /* synthetic */ a<T, V> f22576m;

        /* renamed from: p */
        final /* synthetic */ T f22577p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T, V> aVar, T t10, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f22576m = aVar;
            this.f22577p = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Continuation<?> continuation) {
            return new b(this.f22576m, this.f22577p, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.f22575f == 0) {
                dc.n.b(obj);
                this.f22576m.j();
                Object h10 = this.f22576m.h(this.f22577p);
                this.f22576m.k().v(h10);
                this.f22576m.t(h10);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // pc.l
        public final Object invoke(Continuation<? super dc.w> continuation) {
            return ((b) create(continuation)).invokeSuspend(dc.w.f13270a);
        }
    }

    public a(T t10, i1<T, V> i1Var, T t11, String str) {
        j0.j1 e10;
        j0.j1 e11;
        qc.q.i(i1Var, "typeConverter");
        qc.q.i(str, "label");
        this.f22551a = i1Var;
        this.f22552b = t11;
        this.f22553c = str;
        this.f22554d = new l<>(i1Var, t10, null, 0L, 0L, false, 60, null);
        e10 = d3.e(Boolean.FALSE, null, 2, null);
        this.f22555e = e10;
        e11 = d3.e(t10, null, 2, null);
        this.f22556f = e11;
        this.f22557g = new u0();
        this.f22558h = new z0<>(0.0f, 0.0f, t11, 3, null);
        V i10 = i(t10, Float.NEGATIVE_INFINITY);
        this.f22559i = i10;
        V i11 = i(t10, Float.POSITIVE_INFINITY);
        this.f22560j = i11;
        this.f22561k = i10;
        this.f22562l = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(a aVar, Object obj, j jVar, Object obj2, pc.l lVar, Continuation continuation, int i10, Object obj3) {
        z0<T> z0Var = jVar;
        if ((i10 & 2) != 0) {
            z0Var = aVar.f22558h;
        }
        j jVar2 = z0Var;
        T t10 = obj2;
        if ((i10 & 4) != 0) {
            t10 = aVar.o();
        }
        T t11 = t10;
        pc.l<? super a<T, V>, dc.w> lVar2 = lVar;
        if ((i10 & 8) != 0) {
            lVar2 = null;
        }
        return aVar.e(obj, jVar2, t11, lVar2, continuation);
    }

    public final T h(T t10) {
        float k10;
        if (qc.q.d(this.f22561k, this.f22559i) && qc.q.d(this.f22562l, this.f22560j)) {
            return t10;
        }
        V invoke = this.f22551a.a().invoke(t10);
        int b10 = invoke.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < b10; i10++) {
            if (invoke.a(i10) < this.f22561k.a(i10) || invoke.a(i10) > this.f22562l.a(i10)) {
                k10 = vc.l.k(invoke.a(i10), this.f22561k.a(i10), this.f22562l.a(i10));
                invoke.e(i10, k10);
                z10 = true;
            }
        }
        if (z10) {
            return this.f22551a.b().invoke(invoke);
        }
        return t10;
    }

    private final V i(T t10, float f10) {
        V invoke = this.f22551a.a().invoke(t10);
        int b10 = invoke.b();
        for (int i10 = 0; i10 < b10; i10++) {
            invoke.e(i10, f10);
        }
        return invoke;
    }

    public final void j() {
        l<T, V> lVar = this.f22554d;
        lVar.m().d();
        lVar.t(Long.MIN_VALUE);
        s(false);
    }

    private final Object r(e<T, V> eVar, T t10, pc.l<? super a<T, V>, dc.w> lVar, Continuation<? super h<T, V>> continuation) {
        return u0.e(this.f22557g, null, new C0520a(this, t10, eVar, this.f22554d.f(), lVar, null), continuation, 1, null);
    }

    public final void s(boolean z10) {
        this.f22555e.setValue(Boolean.valueOf(z10));
    }

    public final void t(T t10) {
        this.f22556f.setValue(t10);
    }

    public final Object e(T t10, j<T> jVar, T t11, pc.l<? super a<T, V>, dc.w> lVar, Continuation<? super h<T, V>> continuation) {
        return r(g.a(jVar, this.f22551a, n(), t10, t11), t11, lVar, continuation);
    }

    public final g3<T> g() {
        return this.f22554d;
    }

    public final l<T, V> k() {
        return this.f22554d;
    }

    public final T l() {
        return this.f22556f.getValue();
    }

    public final i1<T, V> m() {
        return this.f22551a;
    }

    public final T n() {
        return this.f22554d.getValue();
    }

    public final T o() {
        return this.f22551a.b().invoke(p());
    }

    public final V p() {
        return this.f22554d.m();
    }

    public final boolean q() {
        return ((Boolean) this.f22555e.getValue()).booleanValue();
    }

    public final Object u(T t10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = u0.e(this.f22557g, null, new b(this, t10, null), continuation, 1, null);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    public /* synthetic */ a(Object obj, i1 i1Var, Object obj2, String str, int i10, qc.h hVar) {
        this(obj, i1Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }
}
