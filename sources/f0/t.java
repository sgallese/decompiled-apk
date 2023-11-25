package f0;

import j0.g3;
import j0.l;
import j0.y2;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButton.kt */
/* loaded from: classes.dex */
public final class t implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f15073a;

    /* renamed from: b  reason: collision with root package name */
    private final float f15074b;

    /* renamed from: c  reason: collision with root package name */
    private final float f15075c;

    /* renamed from: d  reason: collision with root package name */
    private final float f15076d;

    /* compiled from: FloatingActionButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", l = {276}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15077f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.k f15078m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ t0.r<v.j> f15079p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FloatingActionButton.kt */
        /* renamed from: f0.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0358a implements dd.h<v.j> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t0.r<v.j> f15080f;

            C0358a(t0.r<v.j> rVar) {
                this.f15080f = rVar;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(v.j jVar, Continuation<? super dc.w> continuation) {
                if (jVar instanceof v.g) {
                    this.f15080f.add(jVar);
                } else if (jVar instanceof v.h) {
                    this.f15080f.remove(((v.h) jVar).a());
                } else if (jVar instanceof v.d) {
                    this.f15080f.add(jVar);
                } else if (jVar instanceof v.e) {
                    this.f15080f.remove(((v.e) jVar).a());
                } else if (jVar instanceof v.p) {
                    this.f15080f.add(jVar);
                } else if (jVar instanceof v.q) {
                    this.f15080f.remove(((v.q) jVar).a());
                } else if (jVar instanceof v.o) {
                    this.f15080f.remove(((v.o) jVar).a());
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v.k kVar, t0.r<v.j> rVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f15078m = kVar;
            this.f15079p = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f15078m, this.f15079p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15077f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g<v.j> b10 = this.f15078m.b();
                C0358a c0358a = new C0358a(this.f15079p);
                this.f15077f = 1;
                if (b10.collect(c0358a, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: FloatingActionButton.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", f = "FloatingActionButton.kt", l = {321}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15081f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s.a<j2.h, s.n> f15082m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ t f15083p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f15084q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v.j f15085r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s.a<j2.h, s.n> aVar, t tVar, float f10, v.j jVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f15082m = aVar;
            this.f15083p = tVar;
            this.f15084q = f10;
            this.f15085r = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f15082m, this.f15083p, this.f15084q, this.f15085r, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            int i10 = this.f15081f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                float o10 = this.f15082m.l().o();
                ?? r32 = 0;
                if (j2.h.l(o10, this.f15083p.f15074b)) {
                    r32 = new v.p(z0.f.f26354b.c(), r32);
                } else if (j2.h.l(o10, this.f15083p.f15075c)) {
                    r32 = new v.g();
                } else if (j2.h.l(o10, this.f15083p.f15076d)) {
                    r32 = new v.d();
                }
                s.a<j2.h, s.n> aVar = this.f15082m;
                float f10 = this.f15084q;
                v.j jVar = this.f15085r;
                this.f15081f = 1;
                if (d0.d(aVar, f10, r32, jVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public /* synthetic */ t(float f10, float f11, float f12, float f13, qc.h hVar) {
        this(f10, f11, f12, f13);
    }

    @Override // f0.l0
    public g3<j2.h> a(v.k kVar, j0.l lVar, int i10) {
        Object n02;
        float f10;
        qc.q.i(kVar, "interactionSource");
        lVar.e(-478475335);
        if (j0.n.K()) {
            j0.n.V(-478475335, i10, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:272)");
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
        int i11 = i10 & 14;
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
        if (jVar instanceof v.p) {
            f10 = this.f15074b;
        } else if (jVar instanceof v.g) {
            f10 = this.f15075c;
        } else if (jVar instanceof v.d) {
            f10 = this.f15076d;
        } else {
            f10 = this.f15073a;
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
        j0.h0.d(j2.h.f(f13), new b(aVar2, this, f13, jVar, null), lVar, 64);
        g3<j2.h> g10 = aVar2.g();
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return g10;
    }

    private t(float f10, float f11, float f12, float f13) {
        this.f15073a = f10;
        this.f15074b = f11;
        this.f15075c = f12;
        this.f15076d = f13;
    }
}
