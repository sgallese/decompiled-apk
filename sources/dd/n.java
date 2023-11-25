package dd;

import ad.u0;
import androidx.recyclerview.widget.RecyclerView;
import cd.h;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Delay.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> extends qc.r implements pc.l<T, Long> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f13371f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10) {
            super(1);
            this.f13371f = j10;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Long invoke(T t10) {
            return Long.valueOf(this.f13371f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Delay.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {221, 416}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.l implements pc.q<ad.k0, h<? super T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f13372f;

        /* renamed from: m  reason: collision with root package name */
        Object f13373m;

        /* renamed from: p  reason: collision with root package name */
        int f13374p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f13375q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f13376r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.l<T, Long> f13377s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ g<T> f13378t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {232}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.l<Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f13379f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ h<T> f13380m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ qc.f0<Object> f13381p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(h<? super T> hVar, qc.f0<Object> f0Var, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f13380m = hVar;
                this.f13381p = f0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Continuation<?> continuation) {
                return new a(this.f13380m, this.f13381p, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f13379f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    h<T> hVar = this.f13380m;
                    fd.g0 g0Var = ed.r.f14280a;
                    T t10 = this.f13381p.f21676f;
                    if (t10 == g0Var) {
                        t10 = null;
                    }
                    this.f13379f = 1;
                    if (hVar.emit(t10, this) == d10) {
                        return d10;
                    }
                }
                this.f13381p.f21676f = null;
                return dc.w.f13270a;
            }

            @Override // pc.l
            public final Object invoke(Continuation<? super dc.w> continuation) {
                return ((a) create(continuation)).invokeSuspend(dc.w.f13270a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {242}, m = "invokeSuspend")
        /* renamed from: dd.n$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0310b extends kotlin.coroutines.jvm.internal.l implements pc.p<cd.h<? extends Object>, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            Object f13382f;

            /* renamed from: m  reason: collision with root package name */
            int f13383m;

            /* renamed from: p  reason: collision with root package name */
            /* synthetic */ Object f13384p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ qc.f0<Object> f13385q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ h<T> f13386r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0310b(qc.f0<Object> f0Var, h<? super T> hVar, Continuation<? super C0310b> continuation) {
                super(2, continuation);
                this.f13385q = f0Var;
                this.f13386r = hVar;
            }

            public final Object a(Object obj, Continuation<? super dc.w> continuation) {
                return ((C0310b) create(cd.h.b(obj), continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                C0310b c0310b = new C0310b(this.f13385q, this.f13386r, continuation);
                c0310b.f13384p = obj;
                return c0310b;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Object invoke(cd.h<? extends Object> hVar, Continuation<? super dc.w> continuation) {
                return a(hVar.k(), continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                qc.f0<Object> f0Var;
                qc.f0<Object> f0Var2;
                d10 = ic.d.d();
                int i10 = this.f13383m;
                if (i10 != 0) {
                    if (i10 == 1) {
                        f0Var2 = (qc.f0) this.f13382f;
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    T t10 = (T) ((cd.h) this.f13384p).k();
                    f0Var = this.f13385q;
                    boolean z10 = t10 instanceof h.c;
                    if (!z10) {
                        f0Var.f21676f = t10;
                    }
                    h<T> hVar = this.f13386r;
                    if (z10) {
                        Throwable e10 = cd.h.e(t10);
                        if (e10 == null) {
                            Object obj2 = f0Var.f21676f;
                            if (obj2 != null) {
                                if (obj2 == ed.r.f14280a) {
                                    obj2 = null;
                                }
                                this.f13384p = t10;
                                this.f13382f = f0Var;
                                this.f13383m = 1;
                                if (hVar.emit(obj2, this) == d10) {
                                    return d10;
                                }
                                f0Var2 = f0Var;
                            }
                            f0Var.f21676f = (T) ed.r.f14282c;
                        } else {
                            throw e10;
                        }
                    }
                    return dc.w.f13270a;
                }
                f0Var = f0Var2;
                f0Var.f21676f = (T) ed.r.f14282c;
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Delay.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {210}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<cd.p<? super Object>, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f13387f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f13388m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ g<T> f13389p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Delay.kt */
            /* loaded from: classes4.dex */
            public static final class a<T> implements h {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ cd.p<Object> f13390f;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Delay.kt */
                @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {210}, m = "emit")
                /* renamed from: dd.n$b$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0311a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: f  reason: collision with root package name */
                    /* synthetic */ Object f13391f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ a<T> f13392m;

                    /* renamed from: p  reason: collision with root package name */
                    int f13393p;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C0311a(a<? super T> aVar, Continuation<? super C0311a> continuation) {
                        super(continuation);
                        this.f13392m = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f13391f = obj;
                        this.f13393p |= RecyclerView.UNDEFINED_DURATION;
                        return this.f13392m.emit(null, this);
                    }
                }

                a(cd.p<Object> pVar) {
                    this.f13390f = pVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // dd.h
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof dd.n.b.c.a.C0311a
                        if (r0 == 0) goto L13
                        r0 = r6
                        dd.n$b$c$a$a r0 = (dd.n.b.c.a.C0311a) r0
                        int r1 = r0.f13393p
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f13393p = r1
                        goto L18
                    L13:
                        dd.n$b$c$a$a r0 = new dd.n$b$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f13391f
                        java.lang.Object r1 = ic.b.d()
                        int r2 = r0.f13393p
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        dc.n.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        dc.n.b(r6)
                        cd.p<java.lang.Object> r6 = r4.f13390f
                        if (r5 != 0) goto L3a
                        fd.g0 r5 = ed.r.f14280a
                    L3a:
                        r0.f13393p = r3
                        java.lang.Object r5 = r6.r(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        dc.w r5 = dc.w.f13270a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: dd.n.b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(g<? extends T> gVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f13389p = gVar;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(cd.p<Object> pVar, Continuation<? super dc.w> continuation) {
                return ((c) create(pVar, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f13389p, continuation);
                cVar.f13388m = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f13387f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    cd.p pVar = (cd.p) this.f13388m;
                    g<T> gVar = this.f13389p;
                    a aVar = new a(pVar);
                    this.f13387f = 1;
                    if (gVar.collect(aVar, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.l<? super T, Long> lVar, g<? extends T> gVar, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f13377s = lVar;
            this.f13378t = gVar;
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(ad.k0 k0Var, h<? super T> hVar, Continuation<? super dc.w> continuation) {
            b bVar = new b(this.f13377s, this.f13378t, continuation);
            bVar.f13375q = k0Var;
            bVar.f13376r = hVar;
            return bVar.invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fa -> B:11:0x006b). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> a(g<? extends T> gVar, long j10) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j10 == 0) {
                return gVar;
            }
            return c(gVar, new a(j10));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static final <T> g<T> b(g<? extends T> gVar, long j10) {
        return i.j(gVar, u0.d(j10));
    }

    private static final <T> g<T> c(g<? extends T> gVar, pc.l<? super T, Long> lVar) {
        return ed.m.b(new b(lVar, gVar, null));
    }
}
