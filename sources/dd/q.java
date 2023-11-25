package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements dd.g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dd.g f13426f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f13427m;

        public a(dd.g gVar, int i10) {
            this.f13426f = gVar;
            this.f13427m = i10;
        }

        @Override // dd.g
        public Object collect(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
            Object d10;
            Object collect = this.f13426f.collect(new b(new qc.d0(), this.f13427m, hVar), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: Limit.kt */
    /* loaded from: classes4.dex */
    static final class b<T> implements dd.h {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.d0 f13428f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f13429m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ dd.h<T> f13430p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {25}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13431f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b<T> f13432m;

            /* renamed from: p  reason: collision with root package name */
            int f13433p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f13432m = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13431f = obj;
                this.f13433p |= RecyclerView.UNDEFINED_DURATION;
                return this.f13432m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(qc.d0 d0Var, int i10, dd.h<? super T> hVar) {
            this.f13428f = d0Var;
            this.f13429m = i10;
            this.f13430p = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // dd.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof dd.q.b.a
                if (r0 == 0) goto L13
                r0 = r7
                dd.q$b$a r0 = (dd.q.b.a) r0
                int r1 = r0.f13433p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13433p = r1
                goto L18
            L13:
                dd.q$b$a r0 = new dd.q$b$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f13431f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13433p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                dc.n.b(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                dc.n.b(r7)
                qc.d0 r7 = r5.f13428f
                int r2 = r7.f21667f
                int r4 = r5.f13429m
                if (r2 < r4) goto L4a
                dd.h<T> r7 = r5.f13430p
                r0.f13433p = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                dc.w r6 = dc.w.f13270a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f21667f = r2
                dc.w r6 = dc.w.f13270a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.q.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class c<T> implements dd.g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dd.g f13434f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p f13435m;

        public c(dd.g gVar, pc.p pVar) {
            this.f13434f = gVar;
            this.f13435m = pVar;
        }

        @Override // dd.g
        public Object collect(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
            Object d10;
            Object collect = this.f13434f.collect(new d(new qc.b0(), hVar, this.f13435m), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: Limit.kt */
    /* loaded from: classes4.dex */
    static final class d<T> implements dd.h {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.b0 f13436f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ dd.h<T> f13437m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<T, Continuation<? super Boolean>, Object> f13438p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            Object f13439f;

            /* renamed from: m  reason: collision with root package name */
            Object f13440m;

            /* renamed from: p  reason: collision with root package name */
            /* synthetic */ Object f13441p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ d<T> f13442q;

            /* renamed from: r  reason: collision with root package name */
            int f13443r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f13442q = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13441p = obj;
                this.f13443r |= RecyclerView.UNDEFINED_DURATION;
                return this.f13442q.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(qc.b0 b0Var, dd.h<? super T> hVar, pc.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
            this.f13436f = b0Var;
            this.f13437m = hVar;
            this.f13438p = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // dd.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super dc.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof dd.q.d.a
                if (r0 == 0) goto L13
                r0 = r8
                dd.q$d$a r0 = (dd.q.d.a) r0
                int r1 = r0.f13443r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13443r = r1
                goto L18
            L13:
                dd.q$d$a r0 = new dd.q$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f13441p
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13443r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                dc.n.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f13440m
                java.lang.Object r2 = r0.f13439f
                dd.q$d r2 = (dd.q.d) r2
                dc.n.b(r8)
                goto L6c
            L41:
                dc.n.b(r8)
                goto L59
            L45:
                dc.n.b(r8)
                qc.b0 r8 = r6.f13436f
                boolean r8 = r8.f21657f
                if (r8 == 0) goto L5c
                dd.h<T> r8 = r6.f13437m
                r0.f13443r = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                dc.w r7 = dc.w.f13270a
                return r7
            L5c:
                pc.p<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f13438p
                r0.f13439f = r6
                r0.f13440m = r7
                r0.f13443r = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                qc.b0 r8 = r2.f13436f
                r8.f21657f = r5
                dd.h<T> r8 = r2.f13437m
                r2 = 0
                r0.f13439f = r2
                r0.f13440m = r2
                r0.f13443r = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                dc.w r7 = dc.w.f13270a
                return r7
            L8b:
                dc.w r7 = dc.w.f13270a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.q.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Limit.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
    /* loaded from: classes4.dex */
    public static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13444f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f13445m;

        /* renamed from: p  reason: collision with root package name */
        int f13446p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13445m = obj;
            this.f13446p |= RecyclerView.UNDEFINED_DURATION;
            return q.d(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class f<T> implements dd.g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dd.g f13447f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f13448m;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {115}, m = "collect")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13449f;

            /* renamed from: m  reason: collision with root package name */
            int f13450m;

            /* renamed from: q  reason: collision with root package name */
            Object f13452q;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13449f = obj;
                this.f13450m |= RecyclerView.UNDEFINED_DURATION;
                return f.this.collect(null, this);
            }
        }

        public f(dd.g gVar, int i10) {
            this.f13447f = gVar;
            this.f13448m = i10;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        
            ed.n.a(r8, r7);
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        @Override // dd.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(dd.h<? super T> r7, kotlin.coroutines.Continuation<? super dc.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof dd.q.f.a
                if (r0 == 0) goto L13
                r0 = r8
                dd.q$f$a r0 = (dd.q.f.a) r0
                int r1 = r0.f13450m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13450m = r1
                goto L18
            L13:
                dd.q$f$a r0 = new dd.q$f$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f13449f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13450m
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f13452q
                dd.h r7 = (dd.h) r7
                dc.n.b(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                dc.n.b(r8)
                qc.d0 r8 = new qc.d0
                r8.<init>()
                dd.g r2 = r6.f13447f     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                dd.q$g r4 = new dd.q$g     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                int r5 = r6.f13448m     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r0.f13452q = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                r0.f13450m = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                ed.n.a(r8, r7)
            L55:
                dc.w r7 = dc.w.f13270a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.q.f.collect(dd.h, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Limit.kt */
    /* loaded from: classes4.dex */
    public static final class g<T> implements dd.h {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.d0 f13453f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f13454m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ dd.h<T> f13455p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {61, 63}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13456f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g<T> f13457m;

            /* renamed from: p  reason: collision with root package name */
            int f13458p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(g<? super T> gVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f13457m = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13456f = obj;
                this.f13458p |= RecyclerView.UNDEFINED_DURATION;
                return this.f13457m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(qc.d0 d0Var, int i10, dd.h<? super T> hVar) {
            this.f13453f = d0Var;
            this.f13454m = i10;
            this.f13455p = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // dd.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof dd.q.g.a
                if (r0 == 0) goto L13
                r0 = r7
                dd.q$g$a r0 = (dd.q.g.a) r0
                int r1 = r0.f13458p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13458p = r1
                goto L18
            L13:
                dd.q$g$a r0 = new dd.q$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f13456f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13458p
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                dc.n.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                dc.n.b(r7)
                goto L51
            L38:
                dc.n.b(r7)
                qc.d0 r7 = r5.f13453f
                int r2 = r7.f21667f
                int r2 = r2 + r4
                r7.f21667f = r2
                int r7 = r5.f13454m
                if (r2 >= r7) goto L54
                dd.h<T> r7 = r5.f13455p
                r0.f13458p = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                dc.w r6 = dc.w.f13270a
                return r6
            L54:
                dd.h<T> r7 = r5.f13455p
                r0.f13458p = r3
                java.lang.Object r6 = dd.q.a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                dc.w r6 = dc.w.f13270a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.q.g.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class h<T> implements dd.g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dd.g f13459f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p f13460m;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {124}, m = "collect")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13461f;

            /* renamed from: m  reason: collision with root package name */
            int f13462m;

            /* renamed from: q  reason: collision with root package name */
            Object f13464q;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13461f = obj;
                this.f13462m |= RecyclerView.UNDEFINED_DURATION;
                return h.this.collect(null, this);
            }
        }

        public h(dd.g gVar, pc.p pVar) {
            this.f13459f = gVar;
            this.f13460m = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // dd.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(dd.h<? super T> r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof dd.q.h.a
                if (r0 == 0) goto L13
                r0 = r7
                dd.q$h$a r0 = (dd.q.h.a) r0
                int r1 = r0.f13462m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13462m = r1
                goto L18
            L13:
                dd.q$h$a r0 = new dd.q$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f13461f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13462m
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f13464q
                dd.q$i r6 = (dd.q.i) r6
                dc.n.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                dc.n.b(r7)
                dd.g r7 = r5.f13459f
                dd.q$i r2 = new dd.q$i
                pc.p r4 = r5.f13460m
                r2.<init>(r4, r6)
                r0.f13464q = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                r0.f13462m = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                ed.n.a(r7, r6)
            L53:
                dc.w r6 = dc.w.f13270a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.q.h.collect(dd.h, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    /* loaded from: classes4.dex */
    public static final class i<T> implements dd.h<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p f13465f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ dd.h f13466m;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {142, 143}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            Object f13467f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f13468m;

            /* renamed from: p  reason: collision with root package name */
            int f13469p;

            /* renamed from: r  reason: collision with root package name */
            Object f13471r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13468m = obj;
                this.f13469p |= RecyclerView.UNDEFINED_DURATION;
                return i.this.emit(null, this);
            }
        }

        public i(pc.p pVar, dd.h hVar) {
            this.f13465f = pVar;
            this.f13466m = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // dd.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof dd.q.i.a
                if (r0 == 0) goto L13
                r0 = r9
                dd.q$i$a r0 = (dd.q.i.a) r0
                int r1 = r0.f13469p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13469p = r1
                goto L18
            L13:
                dd.q$i$a r0 = new dd.q$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f13468m
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13469p
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f13467f
                dd.q$i r8 = (dd.q.i) r8
                dc.n.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f13471r
                java.lang.Object r2 = r0.f13467f
                dd.q$i r2 = (dd.q.i) r2
                dc.n.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                dc.n.b(r9)
                pc.p r9 = r7.f13465f
                r0.f13467f = r7
                r0.f13471r = r8
                r0.f13469p = r4
                r2 = 6
                qc.o.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                qc.o.c(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                dd.h r2 = r8.f13466m
                r0.f13467f = r8
                r5 = 0
                r0.f13471r = r5
                r0.f13469p = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                dc.w r8 = dc.w.f13270a
                return r8
            L81:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.q.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final <T> dd.g<T> b(dd.g<? extends T> gVar, int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a(gVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final <T> dd.g<T> c(dd.g<? extends T> gVar, pc.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new c(gVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(dd.h<? super T> r4, T r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
        /*
            boolean r0 = r6 instanceof dd.q.e
            if (r0 == 0) goto L13
            r0 = r6
            dd.q$e r0 = (dd.q.e) r0
            int r1 = r0.f13446p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13446p = r1
            goto L18
        L13:
            dd.q$e r0 = new dd.q$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13445m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13446p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f13444f
            dd.h r4 = (dd.h) r4
            dc.n.b(r6)
            goto L43
        L35:
            dc.n.b(r6)
            r0.f13444f = r4
            r0.f13446p = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.q.d(dd.h, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> dd.g<T> e(dd.g<? extends T> gVar, int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new f(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final <T> dd.g<T> f(dd.g<? extends T> gVar, pc.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new h(gVar, pVar);
    }
}
