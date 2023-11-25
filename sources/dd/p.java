package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Emitters.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Emitters.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {216}, m = "invokeSafely$FlowKt__EmittersKt")
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13401f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f13402m;

        /* renamed from: p  reason: collision with root package name */
        int f13403p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13402m = obj;
            this.f13403p |= RecyclerView.UNDEFINED_DURATION;
            return p.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f13404f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.q f13405m;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13406f;

            /* renamed from: m  reason: collision with root package name */
            int f13407m;

            /* renamed from: q  reason: collision with root package name */
            Object f13409q;

            /* renamed from: r  reason: collision with root package name */
            Object f13410r;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13406f = obj;
                this.f13407m |= RecyclerView.UNDEFINED_DURATION;
                return b.this.collect(null, this);
            }
        }

        public b(g gVar, pc.q qVar) {
            this.f13404f = gVar;
            this.f13405m = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // dd.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(dd.h<? super T> r9, kotlin.coroutines.Continuation<? super dc.w> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof dd.p.b.a
                if (r0 == 0) goto L13
                r0 = r10
                dd.p$b$a r0 = (dd.p.b.a) r0
                int r1 = r0.f13407m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13407m = r1
                goto L18
            L13:
                dd.p$b$a r0 = new dd.p$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f13406f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13407m
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f13409q
                ed.s r9 = (ed.s) r9
                dc.n.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f13409q
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                dc.n.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f13410r
                dd.h r9 = (dd.h) r9
                java.lang.Object r2 = r0.f13409q
                dd.p$b r2 = (dd.p.b) r2
                dc.n.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                dc.n.b(r10)
                dd.g r10 = r8.f13404f     // Catch: java.lang.Throwable -> L96
                r0.f13409q = r8     // Catch: java.lang.Throwable -> L96
                r0.f13410r = r9     // Catch: java.lang.Throwable -> L96
                r0.f13407m = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                ed.s r10 = new ed.s
                hc.f r4 = r0.getContext()
                r10.<init>(r9, r4)
                pc.q r9 = r2.f13405m     // Catch: java.lang.Throwable -> L8e
                r0.f13409q = r10     // Catch: java.lang.Throwable -> L8e
                r0.f13410r = r6     // Catch: java.lang.Throwable -> L8e
                r0.f13407m = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                qc.o.c(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                qc.o.c(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                dc.w r9 = dc.w.f13270a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                dd.r0 r10 = new dd.r0
                r10.<init>(r9)
                pc.q r2 = r2.f13405m
                r0.f13409q = r9
                r0.f13410r = r6
                r0.f13407m = r4
                java.lang.Object r10 = dd.p.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.p.b.collect(dd.h, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class c<T> implements g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p f13411f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f13412m;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13413f;

            /* renamed from: m  reason: collision with root package name */
            int f13414m;

            /* renamed from: q  reason: collision with root package name */
            Object f13416q;

            /* renamed from: r  reason: collision with root package name */
            Object f13417r;

            /* renamed from: s  reason: collision with root package name */
            Object f13418s;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13413f = obj;
                this.f13414m |= RecyclerView.UNDEFINED_DURATION;
                return c.this.collect(null, this);
            }
        }

        public c(pc.p pVar, g gVar) {
            this.f13411f = pVar;
            this.f13412m = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        @Override // dd.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(dd.h<? super T> r7, kotlin.coroutines.Continuation<? super dc.w> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof dd.p.c.a
                if (r0 == 0) goto L13
                r0 = r8
                dd.p$c$a r0 = (dd.p.c.a) r0
                int r1 = r0.f13414m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13414m = r1
                goto L18
            L13:
                dd.p$c$a r0 = new dd.p$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f13413f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13414m
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                dc.n.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f13418s
                ed.s r7 = (ed.s) r7
                java.lang.Object r2 = r0.f13417r
                dd.h r2 = (dd.h) r2
                java.lang.Object r4 = r0.f13416q
                dd.p$c r4 = (dd.p.c) r4
                dc.n.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                dc.n.b(r8)
                ed.s r8 = new ed.s
                hc.f r2 = r0.getContext()
                r8.<init>(r7, r2)
                pc.p r2 = r6.f13411f     // Catch: java.lang.Throwable -> L86
                r0.f13416q = r6     // Catch: java.lang.Throwable -> L86
                r0.f13417r = r7     // Catch: java.lang.Throwable -> L86
                r0.f13418s = r8     // Catch: java.lang.Throwable -> L86
                r0.f13414m = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                qc.o.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                qc.o.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                dd.g r7 = r4.f13412m
                r8 = 0
                r0.f13416q = r8
                r0.f13417r = r8
                r0.f13418s = r8
                r0.f13414m = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                dc.w r7 = dc.w.f13270a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.p.c.collect(dd.h, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final void b(h<?> hVar) {
        if (!(hVar instanceof r0)) {
            return;
        }
        throw ((r0) hVar).f13482f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(dd.h<? super T> r4, pc.q<? super dd.h<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super dc.w>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            boolean r0 = r7 instanceof dd.p.a
            if (r0 == 0) goto L13
            r0 = r7
            dd.p$a r0 = (dd.p.a) r0
            int r1 = r0.f13403p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13403p = r1
            goto L18
        L13:
            dd.p$a r0 = new dd.p$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13402m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13403p
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f13401f
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            dc.n.b(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            dc.n.b(r7)
            r0.f13401f = r6     // Catch: java.lang.Throwable -> L47
            r0.f13403p = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            dc.w r4 = dc.w.f13270a
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            dc.a.a(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.p.c(dd.h, pc.q, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> g<T> d(g<? extends T> gVar, pc.q<? super h<? super T>, ? super Throwable, ? super Continuation<? super dc.w>, ? extends Object> qVar) {
        return new b(gVar, qVar);
    }

    public static final <T> g<T> e(g<? extends T> gVar, pc.p<? super h<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        return new c(pVar, gVar);
    }
}
