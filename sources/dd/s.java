package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements dd.h<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.f0 f13483f;

        public a(qc.f0 f0Var) {
            this.f13483f = f0Var;
        }

        @Override // dd.h
        public Object emit(T t10, Continuation<? super dc.w> continuation) {
            this.f13483f.f21676f = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements dd.h<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p f13484f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.f0 f13485m;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            Object f13486f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f13487m;

            /* renamed from: p  reason: collision with root package name */
            int f13488p;

            /* renamed from: r  reason: collision with root package name */
            Object f13490r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13487m = obj;
                this.f13488p |= RecyclerView.UNDEFINED_DURATION;
                return b.this.emit(null, this);
            }
        }

        public b(pc.p pVar, qc.f0 f0Var) {
            this.f13484f = pVar;
            this.f13485m = f0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // dd.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof dd.s.b.a
                if (r0 == 0) goto L13
                r0 = r6
                dd.s$b$a r0 = (dd.s.b.a) r0
                int r1 = r0.f13488p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13488p = r1
                goto L18
            L13:
                dd.s$b$a r0 = new dd.s$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f13487m
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13488p
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f13490r
                java.lang.Object r0 = r0.f13486f
                dd.s$b r0 = (dd.s.b) r0
                dc.n.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                dc.n.b(r6)
                pc.p r6 = r4.f13484f
                r0.f13486f = r4
                r0.f13490r = r5
                r0.f13488p = r3
                r2 = 6
                qc.o.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                qc.o.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                qc.f0 r6 = r0.f13485m
                r6.f21676f = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                dc.w r5 = dc.w.f13270a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.s.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* loaded from: classes4.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13491f;

        /* renamed from: m  reason: collision with root package name */
        Object f13492m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13493p;

        /* renamed from: q  reason: collision with root package name */
        int f13494q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13493p = obj;
            this.f13494q |= RecyclerView.UNDEFINED_DURATION;
            return dd.i.v(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* loaded from: classes4.dex */
    public static final class d<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13495f;

        /* renamed from: m  reason: collision with root package name */
        Object f13496m;

        /* renamed from: p  reason: collision with root package name */
        Object f13497p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f13498q;

        /* renamed from: r  reason: collision with root package name */
        int f13499r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13498q = obj;
            this.f13499r |= RecyclerView.UNDEFINED_DURATION;
            return dd.i.w(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    /* loaded from: classes4.dex */
    public static final class e<T> implements dd.h<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.f0 f13500f;

        public e(qc.f0 f0Var) {
            this.f13500f = f0Var;
        }

        @Override // dd.h
        public Object emit(T t10, Continuation<? super dc.w> continuation) {
            this.f13500f.f21676f = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    /* loaded from: classes4.dex */
    public static final class f<T> implements dd.h<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p f13501f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.f0 f13502m;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            Object f13503f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f13504m;

            /* renamed from: p  reason: collision with root package name */
            int f13505p;

            /* renamed from: r  reason: collision with root package name */
            Object f13507r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13504m = obj;
                this.f13505p |= RecyclerView.UNDEFINED_DURATION;
                return f.this.emit(null, this);
            }
        }

        public f(pc.p pVar, qc.f0 f0Var) {
            this.f13501f = pVar;
            this.f13502m = f0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // dd.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof dd.s.f.a
                if (r0 == 0) goto L13
                r0 = r6
                dd.s$f$a r0 = (dd.s.f.a) r0
                int r1 = r0.f13505p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13505p = r1
                goto L18
            L13:
                dd.s$f$a r0 = new dd.s$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f13504m
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13505p
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f13507r
                java.lang.Object r0 = r0.f13503f
                dd.s$f r0 = (dd.s.f) r0
                dc.n.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                dc.n.b(r6)
                pc.p r6 = r4.f13501f
                r0.f13503f = r4
                r0.f13507r = r5
                r0.f13505p = r3
                r2 = 6
                qc.o.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                qc.o.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                qc.f0 r6 = r0.f13502m
                r6.f21676f = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                dc.w r5 = dc.w.f13270a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.s.f.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "firstOrNull")
    /* loaded from: classes4.dex */
    public static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13508f;

        /* renamed from: m  reason: collision with root package name */
        Object f13509m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13510p;

        /* renamed from: q  reason: collision with root package name */
        int f13511q;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13510p = obj;
            this.f13511q |= RecyclerView.UNDEFINED_DURATION;
            return dd.i.x(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "firstOrNull")
    /* loaded from: classes4.dex */
    public static final class h<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13512f;

        /* renamed from: m  reason: collision with root package name */
        Object f13513m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13514p;

        /* renamed from: q  reason: collision with root package name */
        int f13515q;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13514p = obj;
            this.f13515q |= RecyclerView.UNDEFINED_DURATION;
            return dd.i.y(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {167}, m = "lastOrNull")
    /* loaded from: classes4.dex */
    public static final class i<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13516f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f13517m;

        /* renamed from: p  reason: collision with root package name */
        int f13518p;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13517m = obj;
            this.f13518p |= RecyclerView.UNDEFINED_DURATION;
            return dd.i.D(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    /* loaded from: classes4.dex */
    public static final class j<T> implements dd.h {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.f0<T> f13519f;

        j(qc.f0<T> f0Var) {
            this.f13519f = f0Var;
        }

        @Override // dd.h
        public final Object emit(T t10, Continuation<? super dc.w> continuation) {
            this.f13519f.f21676f = t10;
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(dd.g<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof dd.s.c
            if (r0 == 0) goto L13
            r0 = r5
            dd.s$c r0 = (dd.s.c) r0
            int r1 = r0.f13494q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13494q = r1
            goto L18
        L13:
            dd.s$c r0 = new dd.s$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13493p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13494q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f13492m
            dd.s$a r4 = (dd.s.a) r4
            java.lang.Object r0 = r0.f13491f
            qc.f0 r0 = (qc.f0) r0
            dc.n.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            dc.n.b(r5)
            qc.f0 r5 = new qc.f0
            r5.<init>()
            fd.g0 r2 = ed.r.f14280a
            r5.f21676f = r2
            dd.s$a r2 = new dd.s$a
            r2.<init>(r5)
            r0.f13491f = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f13492m = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f13494q = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            ed.n.a(r5, r4)
        L62:
            T r4 = r0.f21676f
            fd.g0 r5 = ed.r.f14280a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.s.a(dd.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(dd.g<? extends T> r4, pc.p<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof dd.s.d
            if (r0 == 0) goto L13
            r0 = r6
            dd.s$d r0 = (dd.s.d) r0
            int r1 = r0.f13499r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13499r = r1
            goto L18
        L13:
            dd.s$d r0 = new dd.s$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13498q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13499r
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f13497p
            dd.s$b r4 = (dd.s.b) r4
            java.lang.Object r5 = r0.f13496m
            qc.f0 r5 = (qc.f0) r5
            java.lang.Object r0 = r0.f13495f
            pc.p r0 = (pc.p) r0
            dc.n.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            dc.n.b(r6)
            qc.f0 r6 = new qc.f0
            r6.<init>()
            fd.g0 r2 = ed.r.f14280a
            r6.f21676f = r2
            dd.s$b r2 = new dd.s$b
            r2.<init>(r5, r6)
            r0.f13495f = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f13496m = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f13497p = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f13499r = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            ed.n.a(r6, r4)
        L6a:
            T r4 = r5.f21676f
            fd.g0 r5 = ed.r.f14280a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.s.b(dd.g, pc.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(dd.g<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof dd.s.g
            if (r0 == 0) goto L13
            r0 = r5
            dd.s$g r0 = (dd.s.g) r0
            int r1 = r0.f13511q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13511q = r1
            goto L18
        L13:
            dd.s$g r0 = new dd.s$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13510p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13511q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f13509m
            dd.s$e r4 = (dd.s.e) r4
            java.lang.Object r0 = r0.f13508f
            qc.f0 r0 = (qc.f0) r0
            dc.n.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            dc.n.b(r5)
            qc.f0 r5 = new qc.f0
            r5.<init>()
            dd.s$e r2 = new dd.s$e
            r2.<init>(r5)
            r0.f13508f = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f13509m = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f13511q = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            ed.n.a(r5, r4)
        L5e:
            T r4 = r0.f21676f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.s.c(dd.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(dd.g<? extends T> r4, pc.p<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof dd.s.h
            if (r0 == 0) goto L13
            r0 = r6
            dd.s$h r0 = (dd.s.h) r0
            int r1 = r0.f13515q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13515q = r1
            goto L18
        L13:
            dd.s$h r0 = new dd.s$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13514p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13515q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f13513m
            dd.s$f r4 = (dd.s.f) r4
            java.lang.Object r5 = r0.f13512f
            qc.f0 r5 = (qc.f0) r5
            dc.n.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            dc.n.b(r6)
            qc.f0 r6 = new qc.f0
            r6.<init>()
            dd.s$f r2 = new dd.s$f
            r2.<init>(r5, r6)
            r0.f13512f = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f13513m = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f13515q = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            ed.n.a(r6, r4)
        L5e:
            T r4 = r5.f21676f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.s.d(dd.g, pc.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(dd.g<? extends T> r4, kotlin.coroutines.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof dd.s.i
            if (r0 == 0) goto L13
            r0 = r5
            dd.s$i r0 = (dd.s.i) r0
            int r1 = r0.f13518p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13518p = r1
            goto L18
        L13:
            dd.s$i r0 = new dd.s$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13517m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13518p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f13516f
            qc.f0 r4 = (qc.f0) r4
            dc.n.b(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            dc.n.b(r5)
            qc.f0 r5 = new qc.f0
            r5.<init>()
            dd.s$j r2 = new dd.s$j
            r2.<init>(r5)
            r0.f13516f = r5
            r0.f13518p = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            T r4 = r4.f21676f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.s.e(dd.g, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
