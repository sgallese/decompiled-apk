package s4;

import a1.l0;
import a1.q1;
import ad.a1;
import ad.k0;
import ad.s2;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import b5.h;
import dc.n;
import dc.w;
import dd.n0;
import dd.x;
import f5.c;
import j0.d3;
import j0.f2;
import j0.j1;
import j0.y2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import pc.l;
import pc.p;
import qc.k;
import qc.q;
import qc.r;
import s4.c;

/* compiled from: AsyncImagePainter.kt */
/* loaded from: classes.dex */
public final class b extends d1.c implements f2 {
    public static final C0532b I = new C0532b(null);
    private static final l<c, c> J = a.f22978f;
    private l<? super c, ? extends c> A;
    private l<? super c, w> B;
    private n1.f C;
    private int D;
    private boolean E;
    private final j1 F;
    private final j1 G;
    private final j1 H;

    /* renamed from: t  reason: collision with root package name */
    private k0 f22971t;

    /* renamed from: u  reason: collision with root package name */
    private final x<z0.l> f22972u = n0.a(z0.l.c(z0.l.f26375b.b()));

    /* renamed from: v  reason: collision with root package name */
    private final j1 f22973v;

    /* renamed from: w  reason: collision with root package name */
    private final j1 f22974w;

    /* renamed from: x  reason: collision with root package name */
    private final j1 f22975x;

    /* renamed from: y  reason: collision with root package name */
    private c f22976y;

    /* renamed from: z  reason: collision with root package name */
    private d1.c f22977z;

    /* compiled from: AsyncImagePainter.kt */
    /* renamed from: s4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0532b {
        private C0532b() {
        }

        public /* synthetic */ C0532b(qc.h hVar) {
            this();
        }

        public final l<c, c> a() {
            return b.J;
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* compiled from: AsyncImagePainter.kt */
        /* loaded from: classes.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f22979a = new a();

            private a() {
                super(null);
            }

            @Override // s4.b.c
            public d1.c a() {
                return null;
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        /* renamed from: s4.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0533b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final d1.c f22980a;

            /* renamed from: b  reason: collision with root package name */
            private final b5.e f22981b;

            public C0533b(d1.c cVar, b5.e eVar) {
                super(null);
                this.f22980a = cVar;
                this.f22981b = eVar;
            }

            @Override // s4.b.c
            public d1.c a() {
                return this.f22980a;
            }

            public final b5.e b() {
                return this.f22981b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0533b)) {
                    return false;
                }
                C0533b c0533b = (C0533b) obj;
                if (q.d(this.f22980a, c0533b.f22980a) && q.d(this.f22981b, c0533b.f22981b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                d1.c cVar = this.f22980a;
                if (cVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = cVar.hashCode();
                }
                return (hashCode * 31) + this.f22981b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f22980a + ", result=" + this.f22981b + ')';
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        /* renamed from: s4.b$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0534c extends c {

            /* renamed from: a  reason: collision with root package name */
            private final d1.c f22982a;

            public C0534c(d1.c cVar) {
                super(null);
                this.f22982a = cVar;
            }

            @Override // s4.b.c
            public d1.c a() {
                return this.f22982a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0534c) && q.d(this.f22982a, ((C0534c) obj).f22982a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                d1.c cVar = this.f22982a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f22982a + ')';
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        /* loaded from: classes.dex */
        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            private final d1.c f22983a;

            /* renamed from: b  reason: collision with root package name */
            private final b5.q f22984b;

            public d(d1.c cVar, b5.q qVar) {
                super(null);
                this.f22983a = cVar;
                this.f22984b = qVar;
            }

            @Override // s4.b.c
            public d1.c a() {
                return this.f22983a;
            }

            public final b5.q b() {
                return this.f22984b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (q.d(this.f22983a, dVar.f22983a) && q.d(this.f22984b, dVar.f22984b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f22983a.hashCode() * 31) + this.f22984b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f22983a + ", result=" + this.f22984b + ')';
            }
        }

        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }

        public abstract d1.c a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImagePainter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {243}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f22985f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncImagePainter.kt */
        /* loaded from: classes.dex */
        public static final class a extends r implements pc.a<b5.h> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f22987f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(0);
                this.f22987f = bVar;
            }

            @Override // pc.a
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final b5.h invoke() {
                return this.f22987f.y();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncImagePainter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {242}, m = "invokeSuspend")
        /* renamed from: s4.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0535b extends kotlin.coroutines.jvm.internal.l implements p<b5.h, Continuation<? super c>, Object> {

            /* renamed from: f  reason: collision with root package name */
            Object f22988f;

            /* renamed from: m  reason: collision with root package name */
            int f22989m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ b f22990p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0535b(b bVar, Continuation<? super C0535b> continuation) {
                super(2, continuation);
                this.f22990p = bVar;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(b5.h hVar, Continuation<? super c> continuation) {
                return ((C0535b) create(hVar, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C0535b(this.f22990p, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                b bVar;
                d10 = ic.d.d();
                int i10 = this.f22989m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        bVar = (b) this.f22988f;
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    b bVar2 = this.f22990p;
                    q4.g w10 = bVar2.w();
                    b bVar3 = this.f22990p;
                    b5.h P = bVar3.P(bVar3.y());
                    this.f22988f = bVar2;
                    this.f22989m = 1;
                    Object a10 = w10.a(P, this);
                    if (a10 == d10) {
                        return d10;
                    }
                    bVar = bVar2;
                    obj = a10;
                }
                return bVar.O((b5.i) obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AsyncImagePainter.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class c implements dd.h, k {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f22991f;

            c(b bVar) {
                this.f22991f = bVar;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(c cVar, Continuation<? super w> continuation) {
                Object d10;
                Object h10 = d.h(this.f22991f, cVar, continuation);
                d10 = ic.d.d();
                if (h10 == d10) {
                    return h10;
                }
                return w.f13270a;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof dd.h) || !(obj instanceof k)) {
                    return false;
                }
                return q.d(getFunctionDelegate(), ((k) obj).getFunctionDelegate());
            }

            @Override // qc.k
            public final dc.c<?> getFunctionDelegate() {
                return new qc.a(2, this.f22991f, b.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object h(b bVar, c cVar, Continuation continuation) {
            bVar.Q(cVar);
            return w.f13270a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f22985f;
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                dd.g F = dd.i.F(y2.n(new a(b.this)), new C0535b(b.this, null));
                c cVar = new c(b.this);
                this.f22985f = 1;
                if (F.collect(cVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImagePainter.kt */
    /* loaded from: classes.dex */
    public static final class f implements c5.j {

        /* compiled from: SafeCollector.common.kt */
        /* loaded from: classes.dex */
        public static final class a implements dd.g<c5.i> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ dd.g f22994f;

            /* compiled from: Emitters.kt */
            /* renamed from: s4.b$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0536a<T> implements dd.h {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ dd.h f22995f;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {225}, m = "emit")
                /* renamed from: s4.b$f$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0537a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: f  reason: collision with root package name */
                    /* synthetic */ Object f22996f;

                    /* renamed from: m  reason: collision with root package name */
                    int f22997m;

                    public C0537a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f22996f = obj;
                        this.f22997m |= RecyclerView.UNDEFINED_DURATION;
                        return C0536a.this.emit(null, this);
                    }
                }

                public C0536a(dd.h hVar) {
                    this.f22995f = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof s4.b.f.a.C0536a.C0537a
                        if (r0 == 0) goto L13
                        r0 = r8
                        s4.b$f$a$a$a r0 = (s4.b.f.a.C0536a.C0537a) r0
                        int r1 = r0.f22997m
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f22997m = r1
                        goto L18
                    L13:
                        s4.b$f$a$a$a r0 = new s4.b$f$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f22996f
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.f22997m
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r8)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        dc.n.b(r8)
                        dd.h r8 = r6.f22995f
                        z0.l r7 = (z0.l) r7
                        long r4 = r7.m()
                        c5.i r7 = s4.c.b(r4)
                        if (r7 == 0) goto L4b
                        r0.f22997m = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        dc.w r7 = dc.w.f13270a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: s4.b.f.a.C0536a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(dd.g gVar) {
                this.f22994f = gVar;
            }

            @Override // dd.g
            public Object collect(dd.h<? super c5.i> hVar, Continuation continuation) {
                Object d10;
                Object collect = this.f22994f.collect(new C0536a(hVar), continuation);
                d10 = ic.d.d();
                if (collect == d10) {
                    return collect;
                }
                return w.f13270a;
            }
        }

        f() {
        }

        @Override // c5.j
        public final Object m(Continuation<? super c5.i> continuation) {
            return dd.i.v(new a(b.this.f22972u), continuation);
        }
    }

    public b(b5.h hVar, q4.g gVar) {
        j1 e10;
        j1 e11;
        j1 e12;
        j1 e13;
        j1 e14;
        j1 e15;
        e10 = d3.e(null, null, 2, null);
        this.f22973v = e10;
        e11 = d3.e(Float.valueOf(1.0f), null, 2, null);
        this.f22974w = e11;
        e12 = d3.e(null, null, 2, null);
        this.f22975x = e12;
        c.a aVar = c.a.f22979a;
        this.f22976y = aVar;
        this.A = J;
        this.C = n1.f.f19964a.a();
        this.D = c1.f.f8679g.b();
        e13 = d3.e(aVar, null, 2, null);
        this.F = e13;
        e14 = d3.e(hVar, null, 2, null);
        this.G = e14;
        e15 = d3.e(gVar, null, 2, null);
        this.H = e15;
    }

    private final void A(float f10) {
        this.f22974w.setValue(Float.valueOf(f10));
    }

    private final void B(q1 q1Var) {
        this.f22975x.setValue(q1Var);
    }

    private final void G(d1.c cVar) {
        this.f22973v.setValue(cVar);
    }

    private final void J(c cVar) {
        this.F.setValue(cVar);
    }

    private final void L(d1.c cVar) {
        this.f22977z = cVar;
        G(cVar);
    }

    private final void M(c cVar) {
        this.f22976y = cVar;
        J(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d1.c N(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return d1.b.b(l0.c(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.D, 6, null);
        }
        return new c6.b(drawable.mutate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c O(b5.i iVar) {
        d1.c cVar;
        if (iVar instanceof b5.q) {
            b5.q qVar = (b5.q) iVar;
            return new c.d(N(qVar.a()), qVar);
        } else if (iVar instanceof b5.e) {
            Drawable a10 = iVar.a();
            if (a10 != null) {
                cVar = N(a10);
            } else {
                cVar = null;
            }
            return new c.C0533b(cVar, (b5.e) iVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b5.h P(b5.h hVar) {
        h.a n10 = b5.h.R(hVar, null, 1, null).n(new e());
        if (hVar.q().m() == null) {
            n10.l(new f());
        }
        if (hVar.q().l() == null) {
            n10.k(j.f(this.C));
        }
        if (hVar.q().k() != c5.e.EXACT) {
            n10.e(c5.e.INEXACT);
        }
        return n10.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(c cVar) {
        f2 f2Var;
        c cVar2 = this.f22976y;
        c invoke = this.A.invoke(cVar);
        M(invoke);
        d1.c z10 = z(cVar2, invoke);
        if (z10 == null) {
            z10 = invoke.a();
        }
        L(z10);
        if (this.f22971t != null && cVar2.a() != invoke.a()) {
            d1.c a10 = cVar2.a();
            f2 f2Var2 = null;
            if (a10 instanceof f2) {
                f2Var = (f2) a10;
            } else {
                f2Var = null;
            }
            if (f2Var != null) {
                f2Var.c();
            }
            d1.c a11 = invoke.a();
            if (a11 instanceof f2) {
                f2Var2 = (f2) a11;
            }
            if (f2Var2 != null) {
                f2Var2.d();
            }
        }
        l<? super c, w> lVar = this.B;
        if (lVar != null) {
            lVar.invoke(invoke);
        }
    }

    private final void t() {
        k0 k0Var = this.f22971t;
        if (k0Var != null) {
            ad.l0.d(k0Var, null, 1, null);
        }
        this.f22971t = null;
    }

    private final float u() {
        return ((Number) this.f22974w.getValue()).floatValue();
    }

    private final q1 v() {
        return (q1) this.f22975x.getValue();
    }

    private final d1.c x() {
        return (d1.c) this.f22973v.getValue();
    }

    private final s4.f z(c cVar, c cVar2) {
        b5.i b10;
        c.a aVar;
        d1.c cVar3;
        boolean z10;
        if (cVar2 instanceof c.d) {
            b10 = ((c.d) cVar2).b();
        } else {
            if (cVar2 instanceof c.C0533b) {
                b10 = ((c.C0533b) cVar2).b();
            }
            return null;
        }
        c.a P = b10.b().P();
        aVar = s4.c.f22999a;
        f5.c a10 = P.a(aVar, b10);
        if (a10 instanceof f5.a) {
            d1.c a11 = cVar.a();
            if (cVar instanceof c.C0534c) {
                cVar3 = a11;
            } else {
                cVar3 = null;
            }
            d1.c a12 = cVar2.a();
            n1.f fVar = this.C;
            f5.a aVar2 = (f5.a) a10;
            int b11 = aVar2.b();
            if ((b10 instanceof b5.q) && ((b5.q) b10).d()) {
                z10 = false;
            } else {
                z10 = true;
            }
            return new s4.f(cVar3, a12, fVar, b11, z10, aVar2.c());
        }
        return null;
    }

    public final void C(n1.f fVar) {
        this.C = fVar;
    }

    public final void D(int i10) {
        this.D = i10;
    }

    public final void E(q4.g gVar) {
        this.H.setValue(gVar);
    }

    public final void F(l<? super c, w> lVar) {
        this.B = lVar;
    }

    public final void H(boolean z10) {
        this.E = z10;
    }

    public final void I(b5.h hVar) {
        this.G.setValue(hVar);
    }

    public final void K(l<? super c, ? extends c> lVar) {
        this.A = lVar;
    }

    @Override // d1.c
    protected boolean a(float f10) {
        A(f10);
        return true;
    }

    @Override // j0.f2
    public void b() {
        f2 f2Var;
        t();
        d1.c cVar = this.f22977z;
        if (cVar instanceof f2) {
            f2Var = (f2) cVar;
        } else {
            f2Var = null;
        }
        if (f2Var != null) {
            f2Var.b();
        }
    }

    @Override // j0.f2
    public void c() {
        f2 f2Var;
        t();
        d1.c cVar = this.f22977z;
        if (cVar instanceof f2) {
            f2Var = (f2) cVar;
        } else {
            f2Var = null;
        }
        if (f2Var != null) {
            f2Var.c();
        }
    }

    @Override // j0.f2
    public void d() {
        f2 f2Var;
        if (this.f22971t != null) {
            return;
        }
        d1.c cVar = null;
        k0 a10 = ad.l0.a(s2.b(null, 1, null).plus(a1.c().N0()));
        this.f22971t = a10;
        d1.c cVar2 = this.f22977z;
        if (cVar2 instanceof f2) {
            f2Var = (f2) cVar2;
        } else {
            f2Var = null;
        }
        if (f2Var != null) {
            f2Var.d();
        }
        if (!this.E) {
            ad.i.d(a10, null, null, new d(null), 3, null);
            return;
        }
        Drawable F = b5.h.R(y(), null, 1, null).d(w().b()).b().F();
        if (F != null) {
            cVar = N(F);
        }
        Q(new c.C0534c(cVar));
    }

    @Override // d1.c
    protected boolean e(q1 q1Var) {
        B(q1Var);
        return true;
    }

    @Override // d1.c
    public long k() {
        d1.c x10 = x();
        if (x10 != null) {
            return x10.k();
        }
        return z0.l.f26375b.a();
    }

    @Override // d1.c
    protected void m(c1.f fVar) {
        this.f22972u.setValue(z0.l.c(fVar.b()));
        d1.c x10 = x();
        if (x10 != null) {
            x10.j(fVar, fVar.b(), u(), v());
        }
    }

    public final q4.g w() {
        return (q4.g) this.H.getValue();
    }

    public final b5.h y() {
        return (b5.h) this.G.getValue();
    }

    /* compiled from: AsyncImagePainter.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements l<c, c> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f22978f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final c invoke(c cVar) {
            return cVar;
        }
    }

    /* compiled from: ImageRequest.kt */
    /* loaded from: classes.dex */
    public static final class e implements d5.b {
        public e() {
        }

        @Override // d5.b
        public void onStart(Drawable drawable) {
            d1.c cVar;
            b bVar = b.this;
            if (drawable != null) {
                cVar = b.this.N(drawable);
            } else {
                cVar = null;
            }
            bVar.Q(new c.C0534c(cVar));
        }

        @Override // d5.b
        public void onError(Drawable drawable) {
        }

        @Override // d5.b
        public void onSuccess(Drawable drawable) {
        }
    }
}
