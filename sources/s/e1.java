package s;

import j0.d3;
import j0.g2;
import j0.g3;
import j0.q2;
import j0.y2;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* compiled from: Transition.kt */
/* loaded from: classes.dex */
public final class e1<S> {

    /* renamed from: a  reason: collision with root package name */
    private final q0<S> f22642a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22643b;

    /* renamed from: c  reason: collision with root package name */
    private final j0.j1 f22644c;

    /* renamed from: d  reason: collision with root package name */
    private final j0.j1 f22645d;

    /* renamed from: e  reason: collision with root package name */
    private final j0.i1 f22646e;

    /* renamed from: f  reason: collision with root package name */
    private final j0.i1 f22647f;

    /* renamed from: g  reason: collision with root package name */
    private final j0.j1 f22648g;

    /* renamed from: h  reason: collision with root package name */
    private final t0.r<e1<S>.d<?, ?>> f22649h;

    /* renamed from: i  reason: collision with root package name */
    private final t0.r<e1<?>> f22650i;

    /* renamed from: j  reason: collision with root package name */
    private final j0.j1 f22651j;

    /* renamed from: k  reason: collision with root package name */
    private long f22652k;

    /* renamed from: l  reason: collision with root package name */
    private final g3 f22653l;

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public final class a<T, V extends q> {

        /* renamed from: a  reason: collision with root package name */
        private final i1<T, V> f22654a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22655b;

        /* renamed from: c  reason: collision with root package name */
        private final j0.j1 f22656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e1<S> f22657d;

        /* compiled from: Transition.kt */
        /* renamed from: s.e1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0522a<T, V extends q> implements g3<T> {

            /* renamed from: f  reason: collision with root package name */
            private final e1<S>.d<T, V> f22658f;

            /* renamed from: m  reason: collision with root package name */
            private pc.l<? super b<S>, ? extends e0<T>> f22659m;

            /* renamed from: p  reason: collision with root package name */
            private pc.l<? super S, ? extends T> f22660p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ e1<S>.a<T, V> f22661q;

            public C0522a(a aVar, e1<S>.d<T, V> dVar, pc.l<? super b<S>, ? extends e0<T>> lVar, pc.l<? super S, ? extends T> lVar2) {
                qc.q.i(dVar, "animation");
                qc.q.i(lVar, "transitionSpec");
                qc.q.i(lVar2, "targetValueByState");
                this.f22661q = aVar;
                this.f22658f = dVar;
                this.f22659m = lVar;
                this.f22660p = lVar2;
            }

            public final e1<S>.d<T, V> e() {
                return this.f22658f;
            }

            public final pc.l<S, T> f() {
                return (pc.l<? super S, ? extends T>) this.f22660p;
            }

            @Override // j0.g3
            public T getValue() {
                r(this.f22661q.f22657d.k());
                return this.f22658f.getValue();
            }

            public final pc.l<b<S>, e0<T>> j() {
                return (pc.l<? super b<S>, ? extends e0<T>>) this.f22659m;
            }

            public final void k(pc.l<? super S, ? extends T> lVar) {
                qc.q.i(lVar, "<set-?>");
                this.f22660p = lVar;
            }

            public final void m(pc.l<? super b<S>, ? extends e0<T>> lVar) {
                qc.q.i(lVar, "<set-?>");
                this.f22659m = lVar;
            }

            public final void r(b<S> bVar) {
                qc.q.i(bVar, "segment");
                T invoke = this.f22660p.invoke(bVar.c());
                if (this.f22661q.f22657d.q()) {
                    this.f22658f.F(this.f22660p.invoke(bVar.a()), invoke, this.f22659m.invoke(bVar));
                    return;
                }
                this.f22658f.G(invoke, this.f22659m.invoke(bVar));
            }
        }

        public a(e1 e1Var, i1<T, V> i1Var, String str) {
            j0.j1 e10;
            qc.q.i(i1Var, "typeConverter");
            qc.q.i(str, "label");
            this.f22657d = e1Var;
            this.f22654a = i1Var;
            this.f22655b = str;
            e10 = d3.e(null, null, 2, null);
            this.f22656c = e10;
        }

        public final g3<T> a(pc.l<? super b<S>, ? extends e0<T>> lVar, pc.l<? super S, ? extends T> lVar2) {
            qc.q.i(lVar, "transitionSpec");
            qc.q.i(lVar2, "targetValueByState");
            e1<S>.C0522a<T, V>.a<T, V> b10 = b();
            if (b10 == null) {
                e1<S> e1Var = this.f22657d;
                b10 = new C0522a<>(this, new d(e1Var, lVar2.invoke((S) e1Var.g()), m.e(this.f22654a, lVar2.invoke((S) this.f22657d.g())), this.f22654a, this.f22655b), lVar, lVar2);
                e1<S> e1Var2 = this.f22657d;
                c(b10);
                e1Var2.d(b10.e());
            }
            e1<S> e1Var3 = this.f22657d;
            b10.k(lVar2);
            b10.m(lVar);
            b10.r(e1Var3.k());
            return b10;
        }

        public final e1<S>.C0522a<T, V>.a<T, V> b() {
            return (C0522a) this.f22656c.getValue();
        }

        public final void c(e1<S>.C0522a<T, V>.a<T, V> c0522a) {
            this.f22656c.setValue(c0522a);
        }

        public final void d() {
            e1<S>.C0522a<T, V>.a<T, V> b10 = b();
            if (b10 != null) {
                e1<S> e1Var = this.f22657d;
                b10.e().F(b10.f().invoke(e1Var.k().a()), b10.f().invoke(e1Var.k().c()), b10.j().invoke(e1Var.k()));
            }
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public interface b<S> {
        S a();

        boolean b(S s10, S s11);

        S c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class c<S> implements b<S> {

        /* renamed from: a  reason: collision with root package name */
        private final S f22662a;

        /* renamed from: b  reason: collision with root package name */
        private final S f22663b;

        public c(S s10, S s11) {
            this.f22662a = s10;
            this.f22663b = s11;
        }

        @Override // s.e1.b
        public S a() {
            return this.f22662a;
        }

        @Override // s.e1.b
        public /* synthetic */ boolean b(Object obj, Object obj2) {
            return f1.a(this, obj, obj2);
        }

        @Override // s.e1.b
        public S c() {
            return this.f22663b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (qc.q.d(a(), bVar.a()) && qc.q.d(c(), bVar.c())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10;
            S a10 = a();
            int i11 = 0;
            if (a10 != null) {
                i10 = a10.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = i10 * 31;
            S c10 = c();
            if (c10 != null) {
                i11 = c10.hashCode();
            }
            return i12 + i11;
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public final class d<T, V extends q> implements g3<T> {

        /* renamed from: f  reason: collision with root package name */
        private final i1<T, V> f22664f;

        /* renamed from: m  reason: collision with root package name */
        private final String f22665m;

        /* renamed from: p  reason: collision with root package name */
        private final j0.j1 f22666p;

        /* renamed from: q  reason: collision with root package name */
        private final j0.j1 f22667q;

        /* renamed from: r  reason: collision with root package name */
        private final j0.j1 f22668r;

        /* renamed from: s  reason: collision with root package name */
        private final j0.j1 f22669s;

        /* renamed from: t  reason: collision with root package name */
        private final j0.i1 f22670t;

        /* renamed from: u  reason: collision with root package name */
        private final j0.j1 f22671u;

        /* renamed from: v  reason: collision with root package name */
        private final j0.j1 f22672v;

        /* renamed from: w  reason: collision with root package name */
        private V f22673w;

        /* renamed from: x  reason: collision with root package name */
        private final e0<T> f22674x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ e1<S> f22675y;

        public d(e1 e1Var, T t10, V v10, i1<T, V> i1Var, String str) {
            j0.j1 e10;
            j0.j1 e11;
            j0.j1 e12;
            j0.j1 e13;
            j0.j1 e14;
            j0.j1 e15;
            T t11;
            qc.q.i(v10, "initialVelocityVector");
            qc.q.i(i1Var, "typeConverter");
            qc.q.i(str, "label");
            this.f22675y = e1Var;
            this.f22664f = i1Var;
            this.f22665m = str;
            e10 = d3.e(t10, null, 2, null);
            this.f22666p = e10;
            e11 = d3.e(k.g(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.f22667q = e11;
            e12 = d3.e(new d1(f(), i1Var, t10, r(), v10), null, 2, null);
            this.f22668r = e12;
            e13 = d3.e(Boolean.TRUE, null, 2, null);
            this.f22669s = e13;
            this.f22670t = q2.a(0L);
            e14 = d3.e(Boolean.FALSE, null, 2, null);
            this.f22671u = e14;
            e15 = d3.e(t10, null, 2, null);
            this.f22672v = e15;
            this.f22673w = v10;
            Float f10 = z1.h().get(i1Var);
            if (f10 != null) {
                float floatValue = f10.floatValue();
                V invoke = i1Var.a().invoke(t10);
                int b10 = invoke.b();
                for (int i10 = 0; i10 < b10; i10++) {
                    invoke.e(i10, floatValue);
                }
                t11 = this.f22664f.b().invoke(invoke);
            } else {
                t11 = null;
            }
            this.f22674x = k.g(0.0f, 0.0f, t11, 3, null);
        }

        private final void A(long j10) {
            this.f22670t.l(j10);
        }

        private final void B(T t10) {
            this.f22666p.setValue(t10);
        }

        private final void D(T t10, boolean z10) {
            e0<T> f10;
            if (z10) {
                if (f() instanceof z0) {
                    f10 = f();
                } else {
                    f10 = this.f22674x;
                }
            } else {
                f10 = f();
            }
            w(new d1<>(f10, this.f22664f, t10, r(), this.f22673w));
            this.f22675y.r();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void E(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.D(obj, z10);
        }

        private final boolean k() {
            return ((Boolean) this.f22671u.getValue()).booleanValue();
        }

        private final long m() {
            return this.f22670t.a();
        }

        private final T r() {
            return this.f22666p.getValue();
        }

        private final void w(d1<T, V> d1Var) {
            this.f22668r.setValue(d1Var);
        }

        private final void x(e0<T> e0Var) {
            this.f22667q.setValue(e0Var);
        }

        private final void z(boolean z10) {
            this.f22671u.setValue(Boolean.valueOf(z10));
        }

        public void C(T t10) {
            this.f22672v.setValue(t10);
        }

        public final void F(T t10, T t11, e0<T> e0Var) {
            qc.q.i(e0Var, "animationSpec");
            B(t11);
            x(e0Var);
            if (qc.q.d(e().h(), t10) && qc.q.d(e().g(), t11)) {
                return;
            }
            E(this, t10, false, 2, null);
        }

        public final void G(T t10, e0<T> e0Var) {
            qc.q.i(e0Var, "animationSpec");
            if (!qc.q.d(r(), t10) || k()) {
                B(t10);
                x(e0Var);
                E(this, null, !s(), 1, null);
                y(false);
                A(this.f22675y.j());
                z(false);
            }
        }

        public final d1<T, V> e() {
            return (d1) this.f22668r.getValue();
        }

        public final e0<T> f() {
            return (e0) this.f22667q.getValue();
        }

        @Override // j0.g3
        public T getValue() {
            return this.f22672v.getValue();
        }

        public final long j() {
            return e().b();
        }

        public final boolean s() {
            return ((Boolean) this.f22669s.getValue()).booleanValue();
        }

        public final void t(long j10, float f10) {
            long b10;
            if (f10 > 0.0f) {
                float m10 = ((float) (j10 - m())) / f10;
                if ((!Float.isNaN(m10)) != false) {
                    b10 = m10;
                } else {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f10 + ",playTimeNanos: " + j10 + ", offsetTimeNanos: " + m()).toString());
                }
            } else {
                b10 = e().b();
            }
            C(e().f(b10));
            this.f22673w = e().d(b10);
            if (e().e(b10)) {
                y(true);
                A(0L);
            }
        }

        public final void u() {
            z(true);
        }

        public final void v(long j10) {
            C(e().f(j10));
            this.f22673w = e().d(j10);
        }

        public final void y(boolean z10) {
            this.f22669s.setValue(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {435}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f22676f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f22677m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ e1<S> f22678p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Transition.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<Long, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e1<S> f22679f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ float f22680m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e1<S> e1Var, float f10) {
                super(1);
                this.f22679f = e1Var;
                this.f22680m = f10;
            }

            public final void a(long j10) {
                if (!this.f22679f.q()) {
                    this.f22679f.s(j10 / 1, this.f22680m);
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(Long l10) {
                a(l10.longValue());
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e1<S> e1Var, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f22678p = e1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f22678p, continuation);
            eVar.f22677m = obj;
            return eVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            ad.k0 k0Var;
            a aVar;
            d10 = ic.d.d();
            int i10 = this.f22676f;
            if (i10 != 0) {
                if (i10 == 1) {
                    k0Var = (ad.k0) this.f22677m;
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0Var = (ad.k0) this.f22677m;
            }
            do {
                aVar = new a(this.f22678p, c1.l(k0Var.getCoroutineContext()));
                this.f22677m = k0Var;
                this.f22676f = 1;
            } while (j0.z0.b(aVar, this) != d10);
            return d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<S> f22681f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ S f22682m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f22683p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(e1<S> e1Var, S s10, int i10) {
            super(2);
            this.f22681f = e1Var;
            this.f22682m = s10;
            this.f22683p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            this.f22681f.f(this.f22682m, lVar, j0.z1.a(this.f22683p | 1));
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.a<Long> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<S> f22684f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(e1<S> e1Var) {
            super(0);
            this.f22684f = e1Var;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            Iterator<T> it = ((e1) this.f22684f).f22649h.iterator();
            long j10 = 0;
            while (it.hasNext()) {
                j10 = Math.max(j10, ((d) it.next()).j());
            }
            Iterator<T> it2 = ((e1) this.f22684f).f22650i.iterator();
            while (it2.hasNext()) {
                j10 = Math.max(j10, ((e1) it2.next()).n());
            }
            return Long.valueOf(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e1<S> f22685f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ S f22686m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f22687p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e1<S> e1Var, S s10, int i10) {
            super(2);
            this.f22685f = e1Var;
            this.f22686m = s10;
            this.f22687p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            this.f22685f.G(this.f22686m, lVar, j0.z1.a(this.f22687p | 1));
        }
    }

    public e1(q0<S> q0Var, String str) {
        j0.j1 e10;
        j0.j1 e11;
        j0.j1 e12;
        j0.j1 e13;
        qc.q.i(q0Var, "transitionState");
        this.f22642a = q0Var;
        this.f22643b = str;
        e10 = d3.e(g(), null, 2, null);
        this.f22644c = e10;
        e11 = d3.e(new c(g(), g()), null, 2, null);
        this.f22645d = e11;
        this.f22646e = q2.a(0L);
        this.f22647f = q2.a(Long.MIN_VALUE);
        e12 = d3.e(Boolean.TRUE, null, 2, null);
        this.f22648g = e12;
        this.f22649h = y2.e();
        this.f22650i = y2.e();
        e13 = d3.e(Boolean.FALSE, null, 2, null);
        this.f22651j = e13;
        this.f22653l = y2.d(new g(this));
    }

    private final void C(b<S> bVar) {
        this.f22645d.setValue(bVar);
    }

    private final void D(long j10) {
        this.f22647f.l(j10);
    }

    private final long l() {
        return this.f22647f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        F(true);
        if (q()) {
            long j10 = 0;
            for (e1<S>.d<?, ?> dVar : this.f22649h) {
                j10 = Math.max(j10, dVar.j());
                dVar.v(this.f22652k);
            }
            F(false);
        }
    }

    public final void A(long j10) {
        this.f22646e.l(j10);
    }

    public final void B(boolean z10) {
        this.f22651j.setValue(Boolean.valueOf(z10));
    }

    public final void E(S s10) {
        this.f22644c.setValue(s10);
    }

    public final void F(boolean z10) {
        this.f22648g.setValue(Boolean.valueOf(z10));
    }

    public final void G(S s10, j0.l lVar, int i10) {
        int i11;
        int i12;
        int i13;
        j0.l q10 = lVar.q(-583974681);
        if ((i10 & 14) == 0) {
            if (q10.Q(s10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.Q(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-583974681, i10, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:400)");
            }
            if (!q() && !qc.q.d(m(), s10)) {
                C(new c(m(), s10));
                z(m());
                E(s10);
                if (!p()) {
                    F(true);
                }
                Iterator<e1<S>.d<?, ?>> it = this.f22649h.iterator();
                while (it.hasNext()) {
                    it.next().u();
                }
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new h(this, s10, i10));
        }
    }

    public final boolean d(e1<S>.d<?, ?> dVar) {
        qc.q.i(dVar, "animation");
        return this.f22649h.add(dVar);
    }

    public final boolean e(e1<?> e1Var) {
        qc.q.i(e1Var, "transition");
        return this.f22650i.add(e1Var);
    }

    public final void f(S s10, j0.l lVar, int i10) {
        int i11;
        int i12;
        int i13;
        j0.l q10 = lVar.q(-1493585151);
        if ((i10 & 14) == 0) {
            if (q10.Q(s10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.Q(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:425)");
            }
            if (!q()) {
                G(s10, q10, (i11 & 14) | (i11 & 112));
                if (!qc.q.d(s10, g()) || p() || o()) {
                    int i14 = (i11 >> 3) & 14;
                    q10.e(1157296644);
                    boolean Q = q10.Q(this);
                    Object f10 = q10.f();
                    if (Q || f10 == j0.l.f18688a.a()) {
                        f10 = new e(this, null);
                        q10.J(f10);
                    }
                    q10.N();
                    j0.h0.d(this, (pc.p) f10, q10, i14 | 64);
                }
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new f(this, s10, i10));
        }
    }

    public final S g() {
        return this.f22642a.a();
    }

    public final String h() {
        return this.f22643b;
    }

    public final long i() {
        return this.f22652k;
    }

    public final long j() {
        return this.f22646e.a();
    }

    public final b<S> k() {
        return (b) this.f22645d.getValue();
    }

    public final S m() {
        return (S) this.f22644c.getValue();
    }

    public final long n() {
        return ((Number) this.f22653l.getValue()).longValue();
    }

    public final boolean o() {
        return ((Boolean) this.f22648g.getValue()).booleanValue();
    }

    public final boolean p() {
        if (l() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        return ((Boolean) this.f22651j.getValue()).booleanValue();
    }

    public final void s(long j10, float f10) {
        if (l() == Long.MIN_VALUE) {
            u(j10);
        }
        F(false);
        A(j10 - l());
        boolean z10 = true;
        for (e1<S>.d<?, ?> dVar : this.f22649h) {
            if (!dVar.s()) {
                dVar.t(j(), f10);
            }
            if (!dVar.s()) {
                z10 = false;
            }
        }
        for (e1<?> e1Var : this.f22650i) {
            if (!qc.q.d(e1Var.m(), e1Var.g())) {
                e1Var.s(j(), f10);
            }
            if (!qc.q.d(e1Var.m(), e1Var.g())) {
                z10 = false;
            }
        }
        if (z10) {
            t();
        }
    }

    public final void t() {
        D(Long.MIN_VALUE);
        z(m());
        A(0L);
        this.f22642a.c(false);
    }

    public final void u(long j10) {
        D(j10);
        this.f22642a.c(true);
    }

    public final void v(e1<S>.a<?, ?> aVar) {
        e1<S>.d<?, ?> e10;
        qc.q.i(aVar, "deferredAnimation");
        e1<S>.C0522a<?, V>.a<?, ?> b10 = aVar.b();
        if (b10 != null && (e10 = b10.e()) != null) {
            w(e10);
        }
    }

    public final void w(e1<S>.d<?, ?> dVar) {
        qc.q.i(dVar, "animation");
        this.f22649h.remove(dVar);
    }

    public final boolean x(e1<?> e1Var) {
        qc.q.i(e1Var, "transition");
        return this.f22650i.remove(e1Var);
    }

    public final void y(S s10, S s11, long j10) {
        D(Long.MIN_VALUE);
        this.f22642a.c(false);
        if (!q() || !qc.q.d(g(), s10) || !qc.q.d(m(), s11)) {
            z(s10);
            E(s11);
            B(true);
            C(new c(s10, s11));
        }
        for (e1<?> e1Var : this.f22650i) {
            qc.q.g(e1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (e1Var.q()) {
                e1Var.y(e1Var.g(), e1Var.m(), j10);
            }
        }
        Iterator<e1<S>.d<?, ?>> it = this.f22649h.iterator();
        while (it.hasNext()) {
            it.next().v(j10);
        }
        this.f22652k = j10;
    }

    public final void z(S s10) {
        this.f22642a.b(s10);
    }

    public e1(S s10, String str) {
        this(new q0(s10), str);
    }
}
