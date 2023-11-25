package s;

import j0.d3;
import j0.g3;
import j0.l;
import j0.y2;
import kotlin.coroutines.Continuation;

/* compiled from: AnimateAsState.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final z0<Float> f22581a = k.g(0.0f, 0.0f, null, 7, null);

    /* renamed from: b  reason: collision with root package name */
    private static final z0<j2.h> f22582b = k.g(0.0f, 0.0f, j2.h.f(z1.a(j2.h.f18979m)), 3, null);

    /* renamed from: c  reason: collision with root package name */
    private static final z0<z0.l> f22583c = k.g(0.0f, 0.0f, z0.l.c(z1.f(z0.l.f26375b)), 3, null);

    /* renamed from: d  reason: collision with root package name */
    private static final z0<z0.f> f22584d = k.g(0.0f, 0.0f, z0.f.d(z1.e(z0.f.f26354b)), 3, null);

    /* renamed from: e  reason: collision with root package name */
    private static final z0<z0.h> f22585e = k.g(0.0f, 0.0f, z1.g(z0.h.f26359e), 3, null);

    /* renamed from: f  reason: collision with root package name */
    private static final z0<Integer> f22586f = k.g(0.0f, 0.0f, Integer.valueOf(z1.b(qc.p.f21686a)), 3, null);

    /* renamed from: g  reason: collision with root package name */
    private static final z0<j2.l> f22587g = k.g(0.0f, 0.0f, j2.l.b(z1.c(j2.l.f18992b)), 3, null);

    /* renamed from: h  reason: collision with root package name */
    private static final z0<j2.p> f22588h = k.g(0.0f, 0.0f, j2.p.b(z1.d(j2.p.f19001b)), 3, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimateAsState.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ cd.d<T> f22589f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ T f22590m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(cd.d<T> dVar, T t10) {
            super(0);
            this.f22589f = dVar;
            this.f22590m = t10;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f22589f.p(this.f22590m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimateAsState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f22591f;

        /* renamed from: m  reason: collision with root package name */
        int f22592m;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f22593p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ cd.d<T> f22594q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ s.a<T, V> f22595r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ g3<j<T>> f22596s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ g3<pc.l<T, dc.w>> f22597t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnimateAsState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f22598f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ T f22599m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ s.a<T, V> f22600p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ g3<j<T>> f22601q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ g3<pc.l<T, dc.w>> f22602r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(T t10, s.a<T, V> aVar, g3<? extends j<T>> g3Var, g3<? extends pc.l<? super T, dc.w>> g3Var2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f22599m = t10;
                this.f22600p = aVar;
                this.f22601q = g3Var;
                this.f22602r = g3Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f22599m, this.f22600p, this.f22601q, this.f22602r, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f22598f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    if (!qc.q.d(this.f22599m, this.f22600p.l())) {
                        s.a<T, V> aVar = this.f22600p;
                        T t10 = this.f22599m;
                        j g10 = c.g(this.f22601q);
                        this.f22598f = 1;
                        if (s.a.f(aVar, t10, g10, null, null, this, 12, null) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
                pc.l f10 = c.f(this.f22602r);
                if (f10 != null) {
                    f10.invoke(this.f22600p.n());
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(cd.d<T> dVar, s.a<T, V> aVar, g3<? extends j<T>> g3Var, g3<? extends pc.l<? super T, dc.w>> g3Var2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f22594q = dVar;
            this.f22595r = aVar;
            this.f22596s = g3Var;
            this.f22597t = g3Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f22594q, this.f22595r, this.f22596s, this.f22597t, continuation);
            bVar.f22593p = obj;
            return bVar;
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:12:0x0044). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f22592m
                r3 = 1
                if (r2 == 0) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r2 = r0.f22591f
                cd.f r2 = (cd.f) r2
                java.lang.Object r4 = r0.f22593p
                ad.k0 r4 = (ad.k0) r4
                dc.n.b(r18)
                r6 = r18
                r5 = r0
                goto L44
            L1c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L24:
                dc.n.b(r18)
                java.lang.Object r2 = r0.f22593p
                ad.k0 r2 = (ad.k0) r2
                cd.d<T> r4 = r0.f22594q
                cd.f r4 = r4.iterator()
                r5 = r0
                r16 = r4
                r4 = r2
                r2 = r16
            L37:
                r5.f22593p = r4
                r5.f22591f = r2
                r5.f22592m = r3
                java.lang.Object r6 = r2.a(r5)
                if (r6 != r1) goto L44
                return r1
            L44:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L78
                java.lang.Object r6 = r2.next()
                cd.d<T> r7 = r5.f22594q
                java.lang.Object r7 = r7.g()
                java.lang.Object r7 = cd.h.f(r7)
                if (r7 != 0) goto L5e
                r9 = r6
                goto L5f
            L5e:
                r9 = r7
            L5f:
                r6 = 0
                r14 = 0
                s.c$b$a r15 = new s.c$b$a
                s.a<T, V> r10 = r5.f22595r
                j0.g3<s.j<T>> r11 = r5.f22596s
                j0.g3<pc.l<T, dc.w>> r12 = r5.f22597t
                r13 = 0
                r8 = r15
                r8.<init>(r9, r10, r11, r12, r13)
                r11 = 3
                r12 = 0
                r7 = r4
                r8 = r6
                r9 = r14
                r10 = r15
                ad.g.d(r7, r8, r9, r10, r11, r12)
                goto L37
            L78:
                dc.w r1 = dc.w.f13270a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: s.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final g3<j2.h> c(float f10, j<j2.h> jVar, String str, pc.l<? super j2.h, dc.w> lVar, j0.l lVar2, int i10, int i11) {
        z0<j2.h> z0Var;
        String str2;
        pc.l<? super j2.h, dc.w> lVar3;
        lVar2.e(-1407150062);
        if ((i11 & 2) != 0) {
            z0Var = f22582b;
        } else {
            z0Var = jVar;
        }
        if ((i11 & 4) != 0) {
            str2 = "DpAnimation";
        } else {
            str2 = str;
        }
        if ((i11 & 8) != 0) {
            lVar3 = null;
        } else {
            lVar3 = lVar;
        }
        if (j0.n.K()) {
            j0.n.V(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:108)");
        }
        int i12 = i10 << 6;
        g3<j2.h> e10 = e(j2.h.f(f10), k1.b(j2.h.f18979m), z0Var, null, str2, lVar3, lVar2, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return e10;
    }

    public static final g3<Float> d(float f10, j<Float> jVar, float f11, String str, pc.l<? super Float, dc.w> lVar, j0.l lVar2, int i10, int i11) {
        j<Float> jVar2;
        float f12;
        String str2;
        pc.l<? super Float, dc.w> lVar3;
        lVar2.e(668842840);
        if ((i11 & 2) != 0) {
            jVar2 = f22581a;
        } else {
            jVar2 = jVar;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.01f;
        } else {
            f12 = f11;
        }
        if ((i11 & 8) != 0) {
            str2 = "FloatAnimation";
        } else {
            str2 = str;
        }
        if ((i11 & 16) != 0) {
            lVar3 = null;
        } else {
            lVar3 = lVar;
        }
        if (j0.n.K()) {
            j0.n.V(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:62)");
        }
        lVar2.e(841393662);
        if (jVar2 == f22581a) {
            Float valueOf = Float.valueOf(f12);
            lVar2.e(1157296644);
            boolean Q = lVar2.Q(valueOf);
            Object f13 = lVar2.f();
            if (Q || f13 == j0.l.f18688a.a()) {
                f13 = k.g(0.0f, 0.0f, Float.valueOf(f12), 3, null);
                lVar2.J(f13);
            }
            lVar2.N();
            jVar2 = (j) f13;
        }
        lVar2.N();
        int i12 = i10 << 3;
        g3<Float> e10 = e(Float.valueOf(f10), k1.f(qc.j.f21682a), jVar2, Float.valueOf(f12), str2, lVar3, lVar2, (i12 & 7168) | (i10 & 14) | (57344 & i12) | (i12 & 458752), 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return e10;
    }

    public static final <T, V extends q> g3<T> e(T t10, i1<T, V> i1Var, j<T> jVar, T t11, String str, pc.l<? super T, dc.w> lVar, j0.l lVar2, int i10, int i11) {
        j<T> jVar2;
        T t12;
        String str2;
        pc.l<? super T, dc.w> lVar3;
        qc.q.i(i1Var, "typeConverter");
        lVar2.e(-1994373980);
        if ((i11 & 4) != 0) {
            lVar2.e(-492369756);
            Object f10 = lVar2.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = k.g(0.0f, 0.0f, null, 7, null);
                lVar2.J(f10);
            }
            lVar2.N();
            jVar2 = (j) f10;
        } else {
            jVar2 = jVar;
        }
        if ((i11 & 8) != 0) {
            t12 = null;
        } else {
            t12 = t11;
        }
        if ((i11 & 16) != 0) {
            str2 = "ValueAnimation";
        } else {
            str2 = str;
        }
        if ((i11 & 32) != 0) {
            lVar3 = null;
        } else {
            lVar3 = lVar;
        }
        if (j0.n.K()) {
            j0.n.V(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:390)");
        }
        lVar2.e(-492369756);
        Object f11 = lVar2.f();
        l.a aVar = j0.l.f18688a;
        if (f11 == aVar.a()) {
            f11 = d3.e(null, null, 2, null);
            lVar2.J(f11);
        }
        lVar2.N();
        j0.j1 j1Var = (j0.j1) f11;
        lVar2.e(-492369756);
        Object f12 = lVar2.f();
        if (f12 == aVar.a()) {
            f12 = new s.a(t10, i1Var, t12, str2);
            lVar2.J(f12);
        }
        lVar2.N();
        s.a aVar2 = (s.a) f12;
        g3 m10 = y2.m(lVar3, lVar2, (i10 >> 15) & 14);
        if (t12 != null && (jVar2 instanceof z0)) {
            z0 z0Var = (z0) jVar2;
            if (!qc.q.d(z0Var.h(), t12)) {
                jVar2 = k.f(z0Var.f(), z0Var.g(), t12);
            }
        }
        g3 m11 = y2.m(jVar2, lVar2, 0);
        lVar2.e(-492369756);
        Object f13 = lVar2.f();
        if (f13 == aVar.a()) {
            f13 = cd.g.b(-1, null, null, 6, null);
            lVar2.J(f13);
        }
        lVar2.N();
        cd.d dVar = (cd.d) f13;
        j0.h0.f(new a(dVar, t10), lVar2, 0);
        j0.h0.d(dVar, new b(dVar, aVar2, m11, m10, null), lVar2, 72);
        g3<T> g3Var = (g3) j1Var.getValue();
        if (g3Var == null) {
            g3Var = aVar2.g();
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return g3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> pc.l<T, dc.w> f(g3<? extends pc.l<? super T, dc.w>> g3Var) {
        return (pc.l) ((pc.l<? super T, dc.w>) g3Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> j<T> g(g3<? extends j<T>> g3Var) {
        return g3Var.getValue();
    }
}
