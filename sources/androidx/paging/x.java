package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: FlowExt.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f6145a = new Object();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f6146f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f6147m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ dd.g<T> f6148p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.q<T, T, Continuation<? super T>, Object> f6149q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FlowExt.kt */
        /* renamed from: androidx.paging.x$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0146a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ qc.f0<Object> f6150f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.q<T, T, Continuation<? super T>, Object> f6151m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ dd.h<T> f6152p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FlowExt.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", l = {74, 77}, m = "emit")
            /* renamed from: androidx.paging.x$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0147a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                Object f6153f;

                /* renamed from: m  reason: collision with root package name */
                Object f6154m;

                /* renamed from: p  reason: collision with root package name */
                /* synthetic */ Object f6155p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ C0146a<T> f6156q;

                /* renamed from: r  reason: collision with root package name */
                int f6157r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0147a(C0146a<? super T> c0146a, Continuation<? super C0147a> continuation) {
                    super(continuation);
                    this.f6156q = c0146a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f6155p = obj;
                    this.f6157r |= RecyclerView.UNDEFINED_DURATION;
                    return this.f6156q.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0146a(qc.f0<Object> f0Var, pc.q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar, dd.h<? super T> hVar) {
                this.f6150f = f0Var;
                this.f6151m = qVar;
                this.f6152p = hVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[RETURN] */
            /* JADX WARN: Type inference failed for: r9v7 */
            @Override // dd.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.x.a.C0146a.C0147a
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.paging.x$a$a$a r0 = (androidx.paging.x.a.C0146a.C0147a) r0
                    int r1 = r0.f6157r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f6157r = r1
                    goto L18
                L13:
                    androidx.paging.x$a$a$a r0 = new androidx.paging.x$a$a$a
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f6155p
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f6157r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    dc.n.b(r9)
                    goto L7f
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f6154m
                    qc.f0 r8 = (qc.f0) r8
                    java.lang.Object r2 = r0.f6153f
                    androidx.paging.x$a$a r2 = (androidx.paging.x.a.C0146a) r2
                    dc.n.b(r9)
                    goto L66
                L40:
                    dc.n.b(r9)
                    qc.f0<java.lang.Object> r9 = r7.f6150f
                    T r2 = r9.f21676f
                    java.lang.Object r5 = androidx.paging.x.a()
                    if (r2 != r5) goto L4f
                    r2 = r7
                    goto L69
                L4f:
                    pc.q<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r2 = r7.f6151m
                    qc.f0<java.lang.Object> r5 = r7.f6150f
                    T r5 = r5.f21676f
                    r0.f6153f = r7
                    r0.f6154m = r9
                    r0.f6157r = r4
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    if (r8 != r1) goto L62
                    return r1
                L62:
                    r2 = r7
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L66:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L69:
                    r9.f21676f = r8
                    dd.h<T> r8 = r2.f6152p
                    qc.f0<java.lang.Object> r9 = r2.f6150f
                    T r9 = r9.f21676f
                    r2 = 0
                    r0.f6153f = r2
                    r0.f6154m = r2
                    r0.f6157r = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L7f
                    return r1
                L7f:
                    dc.w r8 = dc.w.f13270a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.x.a.C0146a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(dd.g<? extends T> gVar, pc.q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6148p = gVar;
            this.f6149q = qVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
            return ((a) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f6148p, this.f6149q, continuation);
            aVar.f6147m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f6146f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.h hVar = (dd.h) this.f6147m;
                qc.f0 f0Var = new qc.f0();
                f0Var.f21676f = (T) x.f6145a;
                dd.g<T> gVar = this.f6148p;
                C0146a c0146a = new C0146a(f0Var, this.f6149q, hVar);
                this.f6146f = 1;
                if (gVar.collect(c0146a, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {55, 56}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b<R> extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super R>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f6158f;

        /* renamed from: m  reason: collision with root package name */
        int f6159m;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f6160p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ R f6161q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ dd.g<T> f6162r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.q<R, T, Continuation<? super R>, Object> f6163s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FlowExt.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ qc.f0<R> f6164f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.q<R, T, Continuation<? super R>, Object> f6165m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ dd.h<R> f6166p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FlowExt.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", l = {57, 58}, m = "emit")
            /* renamed from: androidx.paging.x$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0148a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                Object f6167f;

                /* renamed from: m  reason: collision with root package name */
                Object f6168m;

                /* renamed from: p  reason: collision with root package name */
                /* synthetic */ Object f6169p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ a<T> f6170q;

                /* renamed from: r  reason: collision with root package name */
                int f6171r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0148a(a<? super T> aVar, Continuation<? super C0148a> continuation) {
                    super(continuation);
                    this.f6170q = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f6169p = obj;
                    this.f6171r |= RecyclerView.UNDEFINED_DURATION;
                    return this.f6170q.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(qc.f0<R> f0Var, pc.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, dd.h<? super R> hVar) {
                this.f6164f = f0Var;
                this.f6165m = qVar;
                this.f6166p = hVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
            @Override // dd.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.x.b.a.C0148a
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.paging.x$b$a$a r0 = (androidx.paging.x.b.a.C0148a) r0
                    int r1 = r0.f6171r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f6171r = r1
                    goto L18
                L13:
                    androidx.paging.x$b$a$a r0 = new androidx.paging.x$b$a$a
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f6169p
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f6171r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    dc.n.b(r9)
                    goto L70
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f6168m
                    qc.f0 r8 = (qc.f0) r8
                    java.lang.Object r2 = r0.f6167f
                    androidx.paging.x$b$a r2 = (androidx.paging.x.b.a) r2
                    dc.n.b(r9)
                    goto L5a
                L40:
                    dc.n.b(r9)
                    qc.f0<R> r9 = r7.f6164f
                    pc.q<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r7.f6165m
                    T r5 = r9.f21676f
                    r0.f6167f = r7
                    r0.f6168m = r9
                    r0.f6171r = r4
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    if (r8 != r1) goto L56
                    return r1
                L56:
                    r2 = r7
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L5a:
                    r8.f21676f = r9
                    dd.h<R> r8 = r2.f6166p
                    qc.f0<R> r9 = r2.f6164f
                    T r9 = r9.f21676f
                    r2 = 0
                    r0.f6167f = r2
                    r0.f6168m = r2
                    r0.f6171r = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L70
                    return r1
                L70:
                    dc.w r8 = dc.w.f13270a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.x.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(R r10, dd.g<? extends T> gVar, pc.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f6161q = r10;
            this.f6162r = gVar;
            this.f6163s = qVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super R> hVar, Continuation<? super dc.w> continuation) {
            return ((b) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f6161q, this.f6162r, this.f6163s, continuation);
            bVar.f6160p = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [R, T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            qc.f0 f0Var;
            dd.h hVar;
            d10 = ic.d.d();
            int i10 = this.f6159m;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        dc.n.b(obj);
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f0Var = (qc.f0) this.f6158f;
                hVar = (dd.h) this.f6160p;
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                dd.h hVar2 = (dd.h) this.f6160p;
                f0Var = new qc.f0();
                R r10 = this.f6161q;
                f0Var.f21676f = r10;
                this.f6160p = hVar2;
                this.f6158f = f0Var;
                this.f6159m = 1;
                if (hVar2.emit(r10, this) == d10) {
                    return d10;
                }
                hVar = hVar2;
            }
            dd.g<T> gVar = this.f6162r;
            a aVar = new a(f0Var, this.f6163s, hVar);
            this.f6160p = null;
            this.f6158f = null;
            this.f6159m = 2;
            if (gVar.collect(aVar, this) == d10) {
                return d10;
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {89}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c<R> extends kotlin.coroutines.jvm.internal.l implements pc.p<g2<R>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f6172f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f6173m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ dd.g<T> f6174p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.q<dd.h<? super R>, T, Continuation<? super dc.w>, Object> f6175q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<T, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f6176f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f6177m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ pc.q<dd.h<? super R>, T, Continuation<? super dc.w>, Object> f6178p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ h<R> f6179q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pc.q<? super dd.h<? super R>, ? super T, ? super Continuation<? super dc.w>, ? extends Object> qVar, h<R> hVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f6178p = qVar;
                this.f6179q = hVar;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, Continuation<? super dc.w> continuation) {
                return ((a) create(t10, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f6178p, this.f6179q, continuation);
                aVar.f6177m = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f6176f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    Object obj2 = this.f6177m;
                    pc.q<dd.h<? super R>, T, Continuation<? super dc.w>, Object> qVar = this.f6178p;
                    h<R> hVar = this.f6179q;
                    this.f6176f = 1;
                    if (qVar.invoke(hVar, obj2, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(dd.g<? extends T> gVar, pc.q<? super dd.h<? super R>, ? super T, ? super Continuation<? super dc.w>, ? extends Object> qVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f6174p = gVar;
            this.f6175q = qVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(g2<R> g2Var, Continuation<? super dc.w> continuation) {
            return ((c) create(g2Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f6174p, this.f6175q, continuation);
            cVar.f6173m = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f6172f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                g2 g2Var = (g2) this.f6173m;
                dd.g<T> gVar = this.f6174p;
                a aVar = new a(this.f6175q, new h(g2Var), null);
                this.f6172f = 1;
                if (dd.i.g(gVar, aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public static final <T> dd.g<T> b(dd.g<? extends T> gVar, pc.q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(qVar, "operation");
        return dd.i.z(new a(gVar, qVar, null));
    }

    public static final <T, R> dd.g<R> c(dd.g<? extends T> gVar, R r10, pc.q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(qVar, "operation");
        return dd.i.z(new b(r10, gVar, qVar, null));
    }

    public static final <T, R> dd.g<R> d(dd.g<? extends T> gVar, pc.q<? super dd.h<? super R>, ? super T, ? super Continuation<? super dc.w>, ? extends Object> qVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(qVar, "transform");
        return f2.a(new c(gVar, qVar, null));
    }
}
