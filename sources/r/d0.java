package r;

import j0.d3;
import j0.j1;
import kotlin.coroutines.Continuation;
import n1.y0;
import s.k1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimationModifier.kt */
/* loaded from: classes.dex */
public final class d0 extends a0 {

    /* renamed from: c  reason: collision with root package name */
    private final s.j<j2.p> f21858c;

    /* renamed from: d  reason: collision with root package name */
    private final ad.k0 f21859d;

    /* renamed from: e  reason: collision with root package name */
    private pc.p<? super j2.p, ? super j2.p, dc.w> f21860e;

    /* renamed from: f  reason: collision with root package name */
    private final j1 f21861f;

    /* compiled from: AnimationModifier.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final s.a<j2.p, s.o> f21862a;

        /* renamed from: b  reason: collision with root package name */
        private long f21863b;

        public /* synthetic */ a(s.a aVar, long j10, qc.h hVar) {
            this(aVar, j10);
        }

        public final s.a<j2.p, s.o> a() {
            return this.f21862a;
        }

        public final long b() {
            return this.f21863b;
        }

        public final void c(long j10) {
            this.f21863b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (qc.q.d(this.f21862a, aVar.f21862a) && j2.p.e(this.f21863b, aVar.f21863b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f21862a.hashCode() * 31) + j2.p.h(this.f21863b);
        }

        public String toString() {
            return "AnimData(anim=" + this.f21862a + ", startSize=" + ((Object) j2.p.i(this.f21863b)) + ')';
        }

        private a(s.a<j2.p, s.o> aVar, long j10) {
            qc.q.i(aVar, "anim");
            this.f21862a = aVar;
            this.f21863b = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = {124}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f21864f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f21865m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f21866p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ d0 f21867q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, long j10, d0 d0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21865m = aVar;
            this.f21866p = j10;
            this.f21867q = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f21865m, this.f21866p, this.f21867q, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            pc.p<j2.p, j2.p, dc.w> x10;
            d10 = ic.d.d();
            int i10 = this.f21864f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                s.a<j2.p, s.o> a10 = this.f21865m.a();
                j2.p b10 = j2.p.b(this.f21866p);
                s.j<j2.p> v10 = this.f21867q.v();
                this.f21864f = 1;
                obj = s.a.f(a10, b10, v10, null, null, this, 12, null);
                if (obj == d10) {
                    return d10;
                }
            }
            s.h hVar = (s.h) obj;
            if (hVar.a() == s.f.Finished && (x10 = this.f21867q.x()) != null) {
                x10.invoke(j2.p.b(this.f21865m.b()), hVar.b().getValue());
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: AnimationModifier.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f21868f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0 y0Var) {
            super(1);
            this.f21868f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            y0.a.r(aVar, this.f21868f, 0, 0, 0.0f, 4, null);
        }
    }

    public d0(s.j<j2.p> jVar, ad.k0 k0Var) {
        j1 e10;
        qc.q.i(jVar, "animSpec");
        qc.q.i(k0Var, "scope");
        this.f21858c = jVar;
        this.f21859d = k0Var;
        e10 = d3.e(null, null, 2, null);
        this.f21861f = e10;
    }

    public final void A(pc.p<? super j2.p, ? super j2.p, dc.w> pVar) {
        this.f21860e = pVar;
    }

    @Override // n1.z
    public n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        long e10 = e(j2.q.a(w10.A0(), w10.l0()));
        return n1.k0.b(l0Var, j2.p.g(e10), j2.p.f(e10), null, new c(w10), 4, null);
    }

    public final long e(long j10) {
        a m10 = m();
        if (m10 != null) {
            if (!j2.p.e(j10, m10.a().l().j())) {
                m10.c(m10.a().n().j());
                ad.i.d(this.f21859d, null, null, new b(m10, j10, this, null), 3, null);
            }
        } else {
            m10 = new a(new s.a(j2.p.b(j10), k1.e(j2.p.f19001b), j2.p.b(j2.q.a(1, 1)), null, 8, null), j10, null);
        }
        z(m10);
        return m10.a().n().j();
    }

    public final a m() {
        return (a) this.f21861f.getValue();
    }

    public final s.j<j2.p> v() {
        return this.f21858c;
    }

    public final pc.p<j2.p, j2.p, dc.w> x() {
        return this.f21860e;
    }

    public final void z(a aVar) {
        this.f21861f.setValue(aVar);
    }
}
