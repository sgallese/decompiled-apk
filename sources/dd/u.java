package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transform.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class u {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f13533f;

        /* compiled from: Emitters.kt */
        /* renamed from: dd.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0314a<T> implements h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h f13534f;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
            /* renamed from: dd.u$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0315a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f13535f;

                /* renamed from: m  reason: collision with root package name */
                int f13536m;

                public C0315a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f13535f = obj;
                    this.f13536m |= RecyclerView.UNDEFINED_DURATION;
                    return C0314a.this.emit(null, this);
                }
            }

            public C0314a(h hVar) {
                this.f13534f = hVar;
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
                    boolean r0 = r6 instanceof dd.u.a.C0314a.C0315a
                    if (r0 == 0) goto L13
                    r0 = r6
                    dd.u$a$a$a r0 = (dd.u.a.C0314a.C0315a) r0
                    int r1 = r0.f13536m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13536m = r1
                    goto L18
                L13:
                    dd.u$a$a$a r0 = new dd.u$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f13535f
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f13536m
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    dc.n.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    dc.n.b(r6)
                    dd.h r6 = r4.f13534f
                    if (r5 == 0) goto L41
                    r0.f13536m = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    dc.w r5 = dc.w.f13270a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: dd.u.a.C0314a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(g gVar) {
            this.f13533f = gVar;
        }

        @Override // dd.g
        public Object collect(h hVar, Continuation continuation) {
            Object d10;
            Object collect = this.f13533f.collect(new C0314a(hVar), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f13538f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p f13539m;

        /* compiled from: Emitters.kt */
        /* loaded from: classes4.dex */
        public static final class a<T> implements h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ h f13540f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ pc.p f13541m;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
            /* renamed from: dd.u$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0316a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f13542f;

                /* renamed from: m  reason: collision with root package name */
                int f13543m;

                /* renamed from: q  reason: collision with root package name */
                Object f13545q;

                /* renamed from: r  reason: collision with root package name */
                Object f13546r;

                public C0316a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f13542f = obj;
                    this.f13543m |= RecyclerView.UNDEFINED_DURATION;
                    return a.this.emit(null, this);
                }
            }

            public a(h hVar, pc.p pVar) {
                this.f13540f = hVar;
                this.f13541m = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // dd.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof dd.u.b.a.C0316a
                    if (r0 == 0) goto L13
                    r0 = r7
                    dd.u$b$a$a r0 = (dd.u.b.a.C0316a) r0
                    int r1 = r0.f13543m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13543m = r1
                    goto L18
                L13:
                    dd.u$b$a$a r0 = new dd.u$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f13542f
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f13543m
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    dc.n.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f13546r
                    dd.h r6 = (dd.h) r6
                    java.lang.Object r2 = r0.f13545q
                    dc.n.b(r7)
                    goto L5c
                L3e:
                    dc.n.b(r7)
                    dd.h r7 = r5.f13540f
                    pc.p r2 = r5.f13541m
                    r0.f13545q = r6
                    r0.f13546r = r7
                    r0.f13543m = r4
                    r4 = 6
                    qc.o.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    qc.o.c(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f13545q = r7
                    r0.f13546r = r7
                    r0.f13543m = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    dc.w r6 = dc.w.f13270a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: dd.u.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(g gVar, pc.p pVar) {
            this.f13538f = gVar;
            this.f13539m = pVar;
        }

        @Override // dd.g
        public Object collect(h hVar, Continuation continuation) {
            Object d10;
            Object collect = this.f13538f.collect(new a(hVar, this.f13539m), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class c<T> implements g<ec.g0<? extends T>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f13547f;

        public c(g gVar) {
            this.f13547f = gVar;
        }

        @Override // dd.g
        public Object collect(h<? super ec.g0<? extends T>> hVar, Continuation<? super dc.w> continuation) {
            Object d10;
            Object collect = this.f13547f.collect(new d(hVar, new qc.d0()), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: Transform.kt */
    /* loaded from: classes4.dex */
    static final class d<T> implements h {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h<ec.g0<? extends T>> f13548f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.d0 f13549m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Transform.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {71}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13550f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ d<T> f13551m;

            /* renamed from: p  reason: collision with root package name */
            int f13552p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f13551m = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13550f = obj;
                this.f13552p |= RecyclerView.UNDEFINED_DURATION;
                return this.f13551m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(h<? super ec.g0<? extends T>> hVar, qc.d0 d0Var) {
            this.f13548f = hVar;
            this.f13549m = d0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // dd.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof dd.u.d.a
                if (r0 == 0) goto L13
                r0 = r9
                dd.u$d$a r0 = (dd.u.d.a) r0
                int r1 = r0.f13552p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13552p = r1
                goto L18
            L13:
                dd.u$d$a r0 = new dd.u$d$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f13550f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13552p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                dc.n.b(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                dc.n.b(r9)
                dd.h<ec.g0<? extends T>> r9 = r7.f13548f
                ec.g0 r2 = new ec.g0
                qc.d0 r4 = r7.f13549m
                int r5 = r4.f21667f
                int r6 = r5 + 1
                r4.f21667f = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.f13552p = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                dc.w r8 = dc.w.f13270a
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.u.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final <T> g<T> a(g<? extends T> gVar) {
        return new a(gVar);
    }

    public static final <T> g<T> b(g<? extends T> gVar, pc.p<? super T, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        return new b(gVar, pVar);
    }

    public static final <T> g<ec.g0<T>> c(g<? extends T> gVar) {
        return new c(gVar);
    }
}
