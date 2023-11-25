package dd;

import ad.x1;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13520f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h0 f13521m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g<T> f13522p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ w<T> f13523q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ T f13524r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Share.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: dd.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0312a extends kotlin.coroutines.jvm.internal.l implements pc.p<Integer, Continuation<? super Boolean>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f13525f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ int f13526m;

            C0312a(Continuation<? super C0312a> continuation) {
                super(2, continuation);
            }

            public final Object a(int i10, Continuation<? super Boolean> continuation) {
                return ((C0312a) create(Integer.valueOf(i10), continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                C0312a c0312a = new C0312a(continuation);
                c0312a.f13526m = ((Number) obj).intValue();
                return c0312a;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
                return a(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                ic.d.d();
                if (this.f13525f == 0) {
                    dc.n.b(obj);
                    if (this.f13526m > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Share.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<f0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f13527f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f13528m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ g<T> f13529p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ w<T> f13530q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ T f13531r;

            /* compiled from: Share.kt */
            /* renamed from: dd.t$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0313a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f13532a;

                static {
                    int[] iArr = new int[f0.values().length];
                    try {
                        iArr[f0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[f0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[f0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f13532a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(g<? extends T> gVar, w<T> wVar, T t10, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f13529p = gVar;
                this.f13530q = wVar;
                this.f13531r = t10;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0 f0Var, Continuation<? super dc.w> continuation) {
                return ((b) create(f0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f13529p, this.f13530q, this.f13531r, continuation);
                bVar.f13528m = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f13527f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    int i11 = C0313a.f13532a[((f0) this.f13528m).ordinal()];
                    if (i11 != 1) {
                        if (i11 == 3) {
                            T t10 = this.f13531r;
                            if (t10 == d0.f13307a) {
                                this.f13530q.c();
                            } else {
                                this.f13530q.e(t10);
                            }
                        }
                    } else {
                        g<T> gVar = this.f13529p;
                        b0 b0Var = this.f13530q;
                        this.f13527f = 1;
                        if (gVar.collect(b0Var, this) == d10) {
                            return d10;
                        }
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h0 h0Var, g<? extends T> gVar, w<T> wVar, T t10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f13521m = h0Var;
            this.f13522p = gVar;
            this.f13523q = wVar;
            this.f13524r = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f13521m, this.f13522p, this.f13523q, this.f13524r, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r7.f13520f
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                dc.n.b(r8)
                goto L5c
            L21:
                dc.n.b(r8)
                goto L8d
            L25:
                dc.n.b(r8)
                dd.h0 r8 = r7.f13521m
                dd.h0$a r1 = dd.h0.f13324a
                dd.h0 r6 = r1.c()
                if (r8 != r6) goto L3f
                dd.g<T> r8 = r7.f13522p
                dd.w<T> r1 = r7.f13523q
                r7.f13520f = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                dd.h0 r8 = r7.f13521m
                dd.h0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                dd.w<T> r8 = r7.f13523q
                dd.l0 r8 = r8.g()
                dd.t$a$a r1 = new dd.t$a$a
                r1.<init>(r5)
                r7.f13520f = r4
                java.lang.Object r8 = dd.i.w(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                dd.g<T> r8 = r7.f13522p
                dd.w<T> r1 = r7.f13523q
                r7.f13520f = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                dd.h0 r8 = r7.f13521m
                dd.w<T> r1 = r7.f13523q
                dd.l0 r1 = r1.g()
                dd.g r8 = r8.a(r1)
                dd.g r8 = dd.i.l(r8)
                dd.t$a$b r1 = new dd.t$a$b
                dd.g<T> r3 = r7.f13522p
                dd.w<T> r4 = r7.f13523q
                T r6 = r7.f13524r
                r1.<init>(r3, r4, r6, r5)
                r7.f13520f = r2
                java.lang.Object r8 = dd.i.g(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                dc.w r8 = dc.w.f13270a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> b0<T> a(w<T> wVar) {
        return new y(wVar, null);
    }

    public static final <T> l0<T> b(x<T> xVar) {
        return new z(xVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r3 == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> dd.g0<T> c(dd.g<? extends T> r7, int r8) {
        /*
            cd.d$a r0 = cd.d.f9003h
            int r0 = r0.a()
            int r0 = vc.j.d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof ed.d
            if (r1 == 0) goto L3d
            r1 = r7
            ed.d r1 = (ed.d) r1
            dd.g r2 = r1.k()
            if (r2 == 0) goto L3d
            dd.g0 r7 = new dd.g0
            int r3 = r1.f14214m
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L35
        L26:
            cd.a r4 = r1.f14215p
            cd.a r5 = cd.a.SUSPEND
            r6 = 0
            if (r4 != r5) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            cd.a r8 = r1.f14215p
            hc.f r1 = r1.f14213f
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            dd.g0 r8 = new dd.g0
            cd.a r1 = cd.a.SUSPEND
            hc.g r2 = hc.g.f16601f
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.t.c(dd.g, int):dd.g0");
    }

    private static final <T> x1 d(ad.k0 k0Var, hc.f fVar, g<? extends T> gVar, w<T> wVar, h0 h0Var, T t10) {
        ad.m0 m0Var;
        if (qc.q.d(h0Var, h0.f13324a.c())) {
            m0Var = ad.m0.DEFAULT;
        } else {
            m0Var = ad.m0.UNDISPATCHED;
        }
        return ad.g.c(k0Var, fVar, m0Var, new a(h0Var, gVar, wVar, t10, null));
    }

    public static final <T> b0<T> e(b0<? extends T> b0Var, pc.p<? super h<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        return new q0(b0Var, pVar);
    }

    public static final <T> b0<T> f(g<? extends T> gVar, ad.k0 k0Var, h0 h0Var, int i10) {
        g0 c10 = c(gVar, i10);
        w a10 = d0.a(i10, c10.f13321b, c10.f13322c);
        return new y(a10, d(k0Var, c10.f13323d, c10.f13320a, a10, h0Var, d0.f13307a));
    }

    public static final <T> l0<T> g(g<? extends T> gVar, ad.k0 k0Var, h0 h0Var, T t10) {
        g0 c10 = c(gVar, 1);
        x a10 = n0.a(t10);
        return new z(a10, d(k0Var, c10.f13323d, c10.f13320a, a10, h0Var, t10));
    }
}
