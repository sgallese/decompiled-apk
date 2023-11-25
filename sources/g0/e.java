package g0;

import ad.i;
import ad.k0;
import ad.x1;
import dc.n;
import dc.w;
import j0.d3;
import j0.e1;
import j0.g3;
import j0.j1;
import j0.q1;
import j0.y2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import qc.r;
import s.c1;
import t.d0;

/* compiled from: PullRefreshState.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: j  reason: collision with root package name */
    public static final int f15984j = 8;

    /* renamed from: a  reason: collision with root package name */
    private final k0 f15985a;

    /* renamed from: b  reason: collision with root package name */
    private final g3<pc.a<w>> f15986b;

    /* renamed from: c  reason: collision with root package name */
    private final g3 f15987c;

    /* renamed from: d  reason: collision with root package name */
    private final j1 f15988d;

    /* renamed from: e  reason: collision with root package name */
    private final e1 f15989e;

    /* renamed from: f  reason: collision with root package name */
    private final e1 f15990f;

    /* renamed from: g  reason: collision with root package name */
    private final e1 f15991g;

    /* renamed from: h  reason: collision with root package name */
    private final e1 f15992h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f15993i;

    /* compiled from: PullRefreshState.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<Float> {
        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(e.this.h() * 0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PullRefreshState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {186}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15995f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f15997p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PullRefreshState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {187}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements pc.l<Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f15998f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ e f15999m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ float f16000p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PullRefreshState.kt */
            /* renamed from: g0.e$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0378a extends r implements p<Float, Float, w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ e f16001f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0378a(e eVar) {
                    super(2);
                    this.f16001f = eVar;
                }

                public final void a(float f10, float f11) {
                    this.f16001f.w(f10);
                }

                @Override // pc.p
                public /* bridge */ /* synthetic */ w invoke(Float f10, Float f11) {
                    a(f10.floatValue(), f11.floatValue());
                    return w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, float f10, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f15999m = eVar;
                this.f16000p = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Continuation<?> continuation) {
                return new a(this.f15999m, this.f16000p, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f15998f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    float m10 = this.f15999m.m();
                    float f10 = this.f16000p;
                    C0378a c0378a = new C0378a(this.f15999m);
                    this.f15998f = 1;
                    if (c1.e(m10, f10, 0.0f, null, c0378a, this, 12, null) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }

            @Override // pc.l
            public final Object invoke(Continuation<? super w> continuation) {
                return ((a) create(continuation)).invokeSuspend(w.f13270a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f15997p = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f15997p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15995f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                d0 d0Var = e.this.f15993i;
                a aVar = new a(e.this, this.f15997p, null);
                this.f15995f = 1;
                if (d0.e(d0Var, null, aVar, this, 1, null) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(k0 k0Var, g3<? extends pc.a<w>> g3Var, float f10, float f11) {
        j1 e10;
        q.i(k0Var, "animationScope");
        q.i(g3Var, "onRefreshState");
        this.f15985a = k0Var;
        this.f15986b = g3Var;
        this.f15987c = y2.d(new a());
        e10 = d3.e(Boolean.FALSE, null, 2, null);
        this.f15988d = e10;
        this.f15989e = q1.a(0.0f);
        this.f15990f = q1.a(0.0f);
        this.f15991g = q1.a(f11);
        this.f15992h = q1.a(f10);
        this.f15993i = new d0();
    }

    private final x1 e(float f10) {
        x1 d10;
        d10 = i.d(this.f15985a, null, null, new b(f10, null), 3, null);
        return d10;
    }

    private final float f() {
        float k10;
        if (g() > l()) {
            k10 = vc.l.k(Math.abs(j()) - 1.0f, 0.0f, 2.0f);
            return l() + (l() * (k10 - (((float) Math.pow(k10, 2)) / 4)));
        }
        return g();
    }

    private final float g() {
        return ((Number) this.f15987c.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float h() {
        return this.f15990f.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float m() {
        return this.f15989e.b();
    }

    private final boolean n() {
        return ((Boolean) this.f15988d.getValue()).booleanValue();
    }

    private final float o() {
        return this.f15992h.b();
    }

    private final float p() {
        return this.f15991g.b();
    }

    private final void s(float f10) {
        this.f15990f.h(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(float f10) {
        this.f15989e.h(f10);
    }

    private final void x(boolean z10) {
        this.f15988d.setValue(Boolean.valueOf(z10));
    }

    private final void y(float f10) {
        this.f15992h.h(f10);
    }

    private final void z(float f10) {
        this.f15991g.h(f10);
    }

    public final float i() {
        return m();
    }

    public final float j() {
        return g() / l();
    }

    public final boolean k() {
        return n();
    }

    public final float l() {
        return p();
    }

    public final float q(float f10) {
        float c10;
        if (!n()) {
            c10 = vc.l.c(h() + f10, 0.0f);
            float h10 = c10 - h();
            s(c10);
            w(f());
            return h10;
        }
        return 0.0f;
    }

    public final float r(float f10) {
        boolean z10;
        if (k()) {
            return 0.0f;
        }
        if (g() > l()) {
            this.f15986b.getValue().invoke();
        }
        e(0.0f);
        if (h() == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || f10 < 0.0f) {
            f10 = 0.0f;
        }
        s(0.0f);
        return f10;
    }

    public final void t(boolean z10) {
        if (n() != z10) {
            x(z10);
            float f10 = 0.0f;
            s(0.0f);
            if (z10) {
                f10 = o();
            }
            e(f10);
        }
    }

    public final void u(float f10) {
        boolean z10;
        if (o() == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            y(f10);
            if (k()) {
                e(f10);
            }
        }
    }

    public final void v(float f10) {
        z(f10);
    }
}
