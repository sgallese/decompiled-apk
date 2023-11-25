package f0;

import j0.g3;
import j0.l;
import j0.y2;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a  reason: collision with root package name */
    private final float f15008a;

    /* renamed from: b  reason: collision with root package name */
    private final float f15009b;

    /* renamed from: c  reason: collision with root package name */
    private final float f15010c;

    /* renamed from: d  reason: collision with root package name */
    private final float f15011d;

    /* renamed from: e  reason: collision with root package name */
    private final float f15012e;

    /* compiled from: Button.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", l = {509}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15013f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.k f15014m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ t0.r<v.j> f15015p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Button.kt */
        /* renamed from: f0.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0356a implements dd.h<v.j> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t0.r<v.j> f15016f;

            C0356a(t0.r<v.j> rVar) {
                this.f15016f = rVar;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(v.j jVar, Continuation<? super dc.w> continuation) {
                if (jVar instanceof v.g) {
                    this.f15016f.add(jVar);
                } else if (jVar instanceof v.h) {
                    this.f15016f.remove(((v.h) jVar).a());
                } else if (jVar instanceof v.d) {
                    this.f15016f.add(jVar);
                } else if (jVar instanceof v.e) {
                    this.f15016f.remove(((v.e) jVar).a());
                } else if (jVar instanceof v.p) {
                    this.f15016f.add(jVar);
                } else if (jVar instanceof v.q) {
                    this.f15016f.remove(((v.q) jVar).a());
                } else if (jVar instanceof v.o) {
                    this.f15016f.remove(((v.o) jVar).a());
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v.k kVar, t0.r<v.j> rVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f15014m = kVar;
            this.f15015p = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f15014m, this.f15015p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15013f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g<v.j> b10 = this.f15014m.b();
                C0356a c0356a = new C0356a(this.f15015p);
                this.f15013f = 1;
                if (b10.collect(c0356a, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: Button.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", l = {554}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15017f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s.a<j2.h, s.n> f15018m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f15019p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s.a<j2.h, s.n> aVar, float f10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f15018m = aVar;
            this.f15019p = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f15018m, this.f15019p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15017f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                s.a<j2.h, s.n> aVar = this.f15018m;
                j2.h f10 = j2.h.f(this.f15019p);
                this.f15017f = 1;
                if (aVar.u(f10, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: Button.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", l = {564}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15020f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s.a<j2.h, s.n> f15021m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ r f15022p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f15023q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v.j f15024r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s.a<j2.h, s.n> aVar, r rVar, float f10, v.j jVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f15021m = aVar;
            this.f15022p = rVar;
            this.f15023q = f10;
            this.f15024r = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new c(this.f15021m, this.f15022p, this.f15023q, this.f15024r, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [qc.h] */
        /* JADX WARN: Type inference failed for: r3v3, types: [v.j] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15020f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                float o10 = this.f15021m.l().o();
                ?? r32 = 0;
                if (j2.h.l(o10, this.f15022p.f15009b)) {
                    r32 = new v.p(z0.f.f26354b.c(), r32);
                } else if (j2.h.l(o10, this.f15022p.f15011d)) {
                    r32 = new v.g();
                } else if (j2.h.l(o10, this.f15022p.f15012e)) {
                    r32 = new v.d();
                }
                s.a<j2.h, s.n> aVar = this.f15021m;
                float f10 = this.f15023q;
                v.j jVar = this.f15024r;
                this.f15020f = 1;
                if (d0.d(aVar, f10, r32, jVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public /* synthetic */ r(float f10, float f11, float f12, float f13, float f14, qc.h hVar) {
        this(f10, f11, f12, f13, f14);
    }

    @Override // f0.h
    public g3<j2.h> a(boolean z10, v.k kVar, j0.l lVar, int i10) {
        Object n02;
        float f10;
        qc.q.i(kVar, "interactionSource");
        lVar.e(-1588756907);
        if (j0.n.K()) {
            j0.n.V(-1588756907, i10, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:505)");
        }
        lVar.e(-492369756);
        Object f11 = lVar.f();
        l.a aVar = j0.l.f18688a;
        if (f11 == aVar.a()) {
            f11 = y2.e();
            lVar.J(f11);
        }
        lVar.N();
        t0.r rVar = (t0.r) f11;
        int i11 = (i10 >> 3) & 14;
        lVar.e(511388516);
        boolean Q = lVar.Q(kVar) | lVar.Q(rVar);
        Object f12 = lVar.f();
        if (Q || f12 == aVar.a()) {
            f12 = new a(kVar, rVar, null);
            lVar.J(f12);
        }
        lVar.N();
        j0.h0.d(kVar, (pc.p) f12, lVar, i11 | 64);
        n02 = ec.b0.n0(rVar);
        v.j jVar = (v.j) n02;
        if (!z10) {
            f10 = this.f15010c;
        } else if (jVar instanceof v.p) {
            f10 = this.f15009b;
        } else if (jVar instanceof v.g) {
            f10 = this.f15011d;
        } else if (jVar instanceof v.d) {
            f10 = this.f15012e;
        } else {
            f10 = this.f15008a;
        }
        float f13 = f10;
        lVar.e(-492369756);
        Object f14 = lVar.f();
        if (f14 == aVar.a()) {
            f14 = new s.a(j2.h.f(f13), s.k1.b(j2.h.f18979m), null, null, 12, null);
            lVar.J(f14);
        }
        lVar.N();
        s.a aVar2 = (s.a) f14;
        if (!z10) {
            lVar.e(-1598807317);
            j0.h0.d(j2.h.f(f13), new b(aVar2, f13, null), lVar, 64);
            lVar.N();
        } else {
            lVar.e(-1598807146);
            j0.h0.d(j2.h.f(f13), new c(aVar2, this, f13, jVar, null), lVar, 64);
            lVar.N();
        }
        g3<j2.h> g10 = aVar2.g();
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return g10;
    }

    private r(float f10, float f11, float f12, float f13, float f14) {
        this.f15008a = f10;
        this.f15009b = f11;
        this.f15010c = f12;
        this.f15011d = f13;
        this.f15012e = f14;
    }
}
