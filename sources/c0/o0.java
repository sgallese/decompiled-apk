package c0;

import androidx.compose.ui.e;
import j0.d3;
import j0.g3;
import j0.j1;
import j0.l;
import j0.y2;
import kotlin.coroutines.Continuation;

/* compiled from: TextFieldPressGestureFilter.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* compiled from: TextFieldPressGestureFilter.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<z0.f, dc.w> f8506f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.m f8507m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldPressGestureFilter.kt */
        /* renamed from: c0.o0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0210a extends qc.r implements pc.l<j0.f0, j0.e0> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j1<v.p> f8508f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ v.m f8509m;

            /* compiled from: Effects.kt */
            /* renamed from: c0.o0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0211a implements j0.e0 {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j1 f8510a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ v.m f8511b;

                public C0211a(j1 j1Var, v.m mVar) {
                    this.f8510a = j1Var;
                    this.f8511b = mVar;
                }

                @Override // j0.e0
                public void dispose() {
                    v.p pVar = (v.p) this.f8510a.getValue();
                    if (pVar != null) {
                        v.o oVar = new v.o(pVar);
                        v.m mVar = this.f8511b;
                        if (mVar != null) {
                            mVar.a(oVar);
                        }
                        this.f8510a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0210a(j1<v.p> j1Var, v.m mVar) {
                super(1);
                this.f8508f = j1Var;
                this.f8509m = mVar;
            }

            @Override // pc.l
            public final j0.e0 invoke(j0.f0 f0Var) {
                qc.q.i(f0Var, "$this$DisposableEffect");
                return new C0211a(this.f8508f, this.f8509m);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldPressGestureFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {54}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k1.l0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f8512f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f8513m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ ad.k0 f8514p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ j1<v.p> f8515q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ v.m f8516r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ g3<pc.l<z0.f, dc.w>> f8517s;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TextFieldPressGestureFilter.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
            /* renamed from: c0.o0$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0212a extends kotlin.coroutines.jvm.internal.l implements pc.q<u.q, z0.f, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f8518f;

                /* renamed from: m  reason: collision with root package name */
                private /* synthetic */ Object f8519m;

                /* renamed from: p  reason: collision with root package name */
                /* synthetic */ long f8520p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ ad.k0 f8521q;

                /* renamed from: r  reason: collision with root package name */
                final /* synthetic */ j1<v.p> f8522r;

                /* renamed from: s  reason: collision with root package name */
                final /* synthetic */ v.m f8523s;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: TextFieldPressGestureFilter.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend")
                /* renamed from: c0.o0$a$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0213a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    Object f8524f;

                    /* renamed from: m  reason: collision with root package name */
                    int f8525m;

                    /* renamed from: p  reason: collision with root package name */
                    final /* synthetic */ j1<v.p> f8526p;

                    /* renamed from: q  reason: collision with root package name */
                    final /* synthetic */ long f8527q;

                    /* renamed from: r  reason: collision with root package name */
                    final /* synthetic */ v.m f8528r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0213a(j1<v.p> j1Var, long j10, v.m mVar, Continuation<? super C0213a> continuation) {
                        super(2, continuation);
                        this.f8526p = j1Var;
                        this.f8527q = j10;
                        this.f8528r = mVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new C0213a(this.f8526p, this.f8527q, this.f8528r, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((C0213a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = ic.b.d()
                            int r1 = r7.f8525m
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L27
                            if (r1 == r4) goto L1f
                            if (r1 != r3) goto L17
                            java.lang.Object r0 = r7.f8524f
                            v.p r0 = (v.p) r0
                            dc.n.b(r8)
                            goto L66
                        L17:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1f:
                            java.lang.Object r1 = r7.f8524f
                            j0.j1 r1 = (j0.j1) r1
                            dc.n.b(r8)
                            goto L4b
                        L27:
                            dc.n.b(r8)
                            j0.j1<v.p> r8 = r7.f8526p
                            java.lang.Object r8 = r8.getValue()
                            v.p r8 = (v.p) r8
                            if (r8 == 0) goto L4f
                            v.m r1 = r7.f8528r
                            j0.j1<v.p> r5 = r7.f8526p
                            v.o r6 = new v.o
                            r6.<init>(r8)
                            if (r1 == 0) goto L4c
                            r7.f8524f = r5
                            r7.f8525m = r4
                            java.lang.Object r8 = r1.c(r6, r7)
                            if (r8 != r0) goto L4a
                            return r0
                        L4a:
                            r1 = r5
                        L4b:
                            r5 = r1
                        L4c:
                            r5.setValue(r2)
                        L4f:
                            v.p r8 = new v.p
                            long r4 = r7.f8527q
                            r8.<init>(r4, r2)
                            v.m r1 = r7.f8528r
                            if (r1 == 0) goto L67
                            r7.f8524f = r8
                            r7.f8525m = r3
                            java.lang.Object r1 = r1.c(r8, r7)
                            if (r1 != r0) goto L65
                            return r0
                        L65:
                            r0 = r8
                        L66:
                            r8 = r0
                        L67:
                            j0.j1<v.p> r0 = r7.f8526p
                            r0.setValue(r8)
                            dc.w r8 = dc.w.f13270a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: c0.o0.a.b.C0212a.C0213a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: TextFieldPressGestureFilter.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
                /* renamed from: c0.o0$a$b$a$b  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0214b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    Object f8529f;

                    /* renamed from: m  reason: collision with root package name */
                    int f8530m;

                    /* renamed from: p  reason: collision with root package name */
                    final /* synthetic */ j1<v.p> f8531p;

                    /* renamed from: q  reason: collision with root package name */
                    final /* synthetic */ boolean f8532q;

                    /* renamed from: r  reason: collision with root package name */
                    final /* synthetic */ v.m f8533r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0214b(j1<v.p> j1Var, boolean z10, v.m mVar, Continuation<? super C0214b> continuation) {
                        super(2, continuation);
                        this.f8531p = j1Var;
                        this.f8532q = z10;
                        this.f8533r = mVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new C0214b(this.f8531p, this.f8532q, this.f8533r, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((C0214b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        j1<v.p> j1Var;
                        v.j oVar;
                        j1<v.p> j1Var2;
                        d10 = ic.d.d();
                        int i10 = this.f8530m;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                j1Var2 = (j1) this.f8529f;
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            v.p value = this.f8531p.getValue();
                            if (value != null) {
                                boolean z10 = this.f8532q;
                                v.m mVar = this.f8533r;
                                j1Var = this.f8531p;
                                if (z10) {
                                    oVar = new v.q(value);
                                } else {
                                    oVar = new v.o(value);
                                }
                                if (mVar != null) {
                                    this.f8529f = j1Var;
                                    this.f8530m = 1;
                                    if (mVar.c(oVar, this) == d10) {
                                        return d10;
                                    }
                                    j1Var2 = j1Var;
                                }
                                j1Var.setValue(null);
                            }
                            return dc.w.f13270a;
                        }
                        j1Var = j1Var2;
                        j1Var.setValue(null);
                        return dc.w.f13270a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0212a(ad.k0 k0Var, j1<v.p> j1Var, v.m mVar, Continuation<? super C0212a> continuation) {
                    super(3, continuation);
                    this.f8521q = k0Var;
                    this.f8522r = j1Var;
                    this.f8523s = mVar;
                }

                public final Object a(u.q qVar, long j10, Continuation<? super dc.w> continuation) {
                    C0212a c0212a = new C0212a(this.f8521q, this.f8522r, this.f8523s, continuation);
                    c0212a.f8519m = qVar;
                    c0212a.f8520p = j10;
                    return c0212a.invokeSuspend(dc.w.f13270a);
                }

                @Override // pc.q
                public /* bridge */ /* synthetic */ Object invoke(u.q qVar, z0.f fVar, Continuation<? super dc.w> continuation) {
                    return a(qVar, fVar.x(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f8518f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        u.q qVar = (u.q) this.f8519m;
                        ad.i.d(this.f8521q, null, null, new C0213a(this.f8522r, this.f8520p, this.f8523s, null), 3, null);
                        this.f8518f = 1;
                        obj = qVar.P0(this);
                        if (obj == d10) {
                            return d10;
                        }
                    }
                    ad.i.d(this.f8521q, null, null, new C0214b(this.f8522r, ((Boolean) obj).booleanValue(), this.f8523s, null), 3, null);
                    return dc.w.f13270a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TextFieldPressGestureFilter.kt */
            /* renamed from: c0.o0$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0215b extends qc.r implements pc.l<z0.f, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ g3<pc.l<z0.f, dc.w>> f8534f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0215b(g3<? extends pc.l<? super z0.f, dc.w>> g3Var) {
                    super(1);
                    this.f8534f = g3Var;
                }

                public final void a(long j10) {
                    this.f8534f.getValue().invoke(z0.f.d(j10));
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(z0.f fVar) {
                    a(fVar.x());
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(ad.k0 k0Var, j1<v.p> j1Var, v.m mVar, g3<? extends pc.l<? super z0.f, dc.w>> g3Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f8514p = k0Var;
                this.f8515q = j1Var;
                this.f8516r = mVar;
                this.f8517s = g3Var;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(k1.l0 l0Var, Continuation<? super dc.w> continuation) {
                return ((b) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f8514p, this.f8515q, this.f8516r, this.f8517s, continuation);
                bVar.f8513m = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f8512f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    k1.l0 l0Var = (k1.l0) this.f8513m;
                    C0212a c0212a = new C0212a(this.f8514p, this.f8515q, this.f8516r, null);
                    C0215b c0215b = new C0215b(this.f8517s);
                    this.f8512f = 1;
                    if (u.z.h(l0Var, c0212a, c0215b, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.l<? super z0.f, dc.w> lVar, v.m mVar) {
            super(3);
            this.f8506f = lVar;
            this.f8507m = mVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(-102778667);
            if (j0.n.K()) {
                j0.n.V(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:39)");
            }
            lVar.e(773894976);
            lVar.e(-492369756);
            Object f10 = lVar.f();
            l.a aVar = j0.l.f18688a;
            if (f10 == aVar.a()) {
                Object xVar = new j0.x(j0.h0.h(hc.g.f16601f, lVar));
                lVar.J(xVar);
                f10 = xVar;
            }
            lVar.N();
            ad.k0 a10 = ((j0.x) f10).a();
            lVar.N();
            lVar.e(-492369756);
            Object f11 = lVar.f();
            if (f11 == aVar.a()) {
                f11 = d3.e(null, null, 2, null);
                lVar.J(f11);
            }
            lVar.N();
            j1 j1Var = (j1) f11;
            g3 m10 = y2.m(this.f8506f, lVar, 0);
            v.m mVar = this.f8507m;
            lVar.e(511388516);
            boolean Q = lVar.Q(j1Var) | lVar.Q(mVar);
            Object f12 = lVar.f();
            if (Q || f12 == aVar.a()) {
                f12 = new C0210a(j1Var, mVar);
                lVar.J(f12);
            }
            lVar.N();
            j0.h0.b(mVar, (pc.l) f12, lVar, 0);
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            v.m mVar2 = this.f8507m;
            androidx.compose.ui.e c10 = k1.u0.c(aVar2, mVar2, new b(a10, j1Var, mVar2, m10, null));
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return c10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, v.m mVar, boolean z10, pc.l<? super z0.f, dc.w> lVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(lVar, "onTap");
        if (z10) {
            return androidx.compose.ui.c.b(eVar, null, new a(lVar, mVar), 1, null);
        }
        return eVar;
    }
}
