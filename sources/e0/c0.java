package e0;

import androidx.recyclerview.widget.RecyclerView;
import k1.l0;
import kotlin.coroutines.Continuation;

/* compiled from: TextSelectionMouseDetector.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextSelectionMouseDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", l = {125}, m = "awaitMouseEventDown")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13619f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f13620m;

        /* renamed from: p  reason: collision with root package name */
        int f13621p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13620m = obj;
            this.f13621p |= RecyclerView.UNDEFINED_DURATION;
            return c0.b(null, this);
        }
    }

    /* compiled from: TextSelectionMouseDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", l = {89, 96, 111}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f13622m;

        /* renamed from: p  reason: collision with root package name */
        int f13623p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f13624q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ g f13625r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextSelectionMouseDetector.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<k1.c0, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g f13626f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.f13626f = gVar;
            }

            public final void a(k1.c0 c0Var) {
                qc.q.i(c0Var, "it");
                if (this.f13626f.b(c0Var.g())) {
                    c0Var.a();
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(k1.c0 c0Var) {
                a(c0Var);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextSelectionMouseDetector.kt */
        /* renamed from: e0.c0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0321b extends qc.r implements pc.l<k1.c0, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g f13627f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ k f13628m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0321b(g gVar, k kVar) {
                super(1);
                this.f13627f = gVar;
                this.f13628m = kVar;
            }

            public final void a(k1.c0 c0Var) {
                qc.q.i(c0Var, "it");
                if (this.f13627f.a(c0Var.g(), this.f13628m)) {
                    c0Var.a();
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(k1.c0 c0Var) {
                a(c0Var);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f13625r = gVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
            return ((b) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f13625r, continuation);
            bVar.f13624q = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:14:0x0045). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r12.f13623p
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                java.lang.Object r1 = r12.f13622m
                e0.c r1 = (e0.c) r1
                java.lang.Object r5 = r12.f13624q
                k1.e r5 = (k1.e) r5
                dc.n.b(r13)
                r13 = r5
                goto L44
            L27:
                java.lang.Object r1 = r12.f13622m
                e0.c r1 = (e0.c) r1
                java.lang.Object r5 = r12.f13624q
                k1.e r5 = (k1.e) r5
                dc.n.b(r13)
                r6 = r12
                goto L56
            L34:
                dc.n.b(r13)
                java.lang.Object r13 = r12.f13624q
                k1.e r13 = (k1.e) r13
                e0.c r1 = new e0.c
                androidx.compose.ui.platform.g4 r5 = r13.getViewConfiguration()
                r1.<init>(r5)
            L44:
                r5 = r12
            L45:
                r5.f13624q = r13
                r5.f13622m = r1
                r5.f13623p = r4
                java.lang.Object r6 = e0.c0.a(r13, r5)
                if (r6 != r0) goto L52
                return r0
            L52:
                r11 = r5
                r5 = r13
                r13 = r6
                r6 = r11
            L56:
                k1.r r13 = (k1.r) r13
                r1.d(r13)
                java.util.List r7 = r13.c()
                r8 = 0
                java.lang.Object r7 = r7.get(r8)
                k1.c0 r7 = (k1.c0) r7
                boolean r13 = e0.x.a(r13)
                if (r13 == 0) goto L93
                e0.g r13 = r6.f13625r
                long r8 = r7.g()
                boolean r13 = r13.d(r8)
                if (r13 == 0) goto Ld6
                r7.a()
                long r7 = r7.f()
                e0.c0$b$a r13 = new e0.c0$b$a
                e0.g r9 = r6.f13625r
                r13.<init>(r9)
                r6.f13624q = r5
                r6.f13622m = r1
                r6.f13623p = r3
                java.lang.Object r13 = u.h.f(r5, r7, r13, r6)
                if (r13 != r0) goto Ld6
                return r0
            L93:
                int r13 = r1.a()
                if (r13 == r4) goto La9
                if (r13 == r3) goto La2
                e0.k$a r13 = e0.k.f13641a
                e0.k r13 = r13.f()
                goto Laf
            La2:
                e0.k$a r13 = e0.k.f13641a
                e0.k r13 = r13.g()
                goto Laf
            La9:
                e0.k$a r13 = e0.k.f13641a
                e0.k r13 = r13.e()
            Laf:
                e0.g r8 = r6.f13625r
                long r9 = r7.g()
                boolean r8 = r8.c(r9, r13)
                if (r8 == 0) goto Ld6
                r7.a()
                long r7 = r7.f()
                e0.c0$b$b r9 = new e0.c0$b$b
                e0.g r10 = r6.f13625r
                r9.<init>(r10, r13)
                r6.f13624q = r5
                r6.f13622m = r1
                r6.f13623p = r2
                java.lang.Object r13 = u.h.f(r5, r7, r9, r6)
                if (r13 != r0) goto Ld6
                return r0
            Ld6:
                r13 = r5
                r5 = r6
                goto L45
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.c0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k1.e r10, kotlin.coroutines.Continuation<? super k1.r> r11) {
        /*
            boolean r0 = r11 instanceof e0.c0.a
            if (r0 == 0) goto L13
            r0 = r11
            e0.c0$a r0 = (e0.c0.a) r0
            int r1 = r0.f13621p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13621p = r1
            goto L18
        L13:
            e0.c0$a r0 = new e0.c0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f13620m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f13621p
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f13619f
            k1.e r10 = (k1.e) r10
            dc.n.b(r11)
            goto L45
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            dc.n.b(r11)
        L38:
            k1.t r11 = k1.t.Main
            r0.f13619f = r10
            r0.f13621p = r3
            java.lang.Object r11 = r10.X(r11, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            k1.r r11 = (k1.r) r11
            int r2 = r11.b()
            boolean r2 = k1.v.b(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r11.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L5b:
            if (r6 >= r4) goto L82
            java.lang.Object r7 = r2.get(r6)
            k1.c0 r7 = (k1.c0) r7
            int r8 = r7.m()
            k1.q0$a r9 = k1.q0.f19226a
            int r9 = r9.b()
            boolean r8 = k1.q0.g(r8, r9)
            if (r8 == 0) goto L7b
            boolean r7 = k1.s.a(r7)
            if (r7 == 0) goto L7b
            r7 = 1
            goto L7c
        L7b:
            r7 = 0
        L7c:
            if (r7 != 0) goto L7f
            goto L83
        L7f:
            int r6 = r6 + 1
            goto L5b
        L82:
            r5 = 1
        L83:
            if (r5 == 0) goto L38
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.c0.b(k1.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object c(l0 l0Var, g gVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object c10 = u.n.c(l0Var, new b(gVar, null), continuation);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }
}
