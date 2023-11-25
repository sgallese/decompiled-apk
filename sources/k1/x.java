package k1;

import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import androidx.compose.ui.platform.z0;
import kotlin.coroutines.Continuation;

/* compiled from: PointerIcon.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final o1.m<y> f19273a = o1.e.a(a.f19274f);

    /* compiled from: PointerIcon.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<y> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f19274f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final y invoke() {
            return null;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<m1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w f19275f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f19276m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar, boolean z10) {
            super(1);
            this.f19275f = wVar;
            this.f19276m = z10;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("pointerHoverIcon");
            m1Var.a().c("icon", this.f19275f);
            m1Var.a().c("overrideDescendants", Boolean.valueOf(this.f19276m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PointerIcon.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w f19277f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f19278m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerIcon.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y f19279f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ w f19280m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ boolean f19281p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ pc.l<w, dc.w> f19282q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(y yVar, w wVar, boolean z10, pc.l<? super w, dc.w> lVar) {
                super(0);
                this.f19279f = yVar;
                this.f19280m = wVar;
                this.f19281p = z10;
                this.f19282q = lVar;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f19279f.F(this.f19280m, this.f19281p, this.f19282q);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerIcon.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.l<w, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ z f19283f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z zVar) {
                super(1);
                this.f19283f = zVar;
            }

            public final void a(w wVar) {
                this.f19283f.a(wVar);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(w wVar) {
                a(wVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PointerIcon.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1", f = "PointerIcon.kt", l = {110}, m = "invokeSuspend")
        /* renamed from: k1.x$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0433c extends kotlin.coroutines.jvm.internal.l implements pc.p<l0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f19284f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f19285m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ y f19286p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PointerIcon.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1$1", f = "PointerIcon.kt", l = {112}, m = "invokeSuspend")
            /* renamed from: k1.x$c$c$a */
            /* loaded from: classes.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.k implements pc.p<e, Continuation<? super dc.w>, Object> {

                /* renamed from: m  reason: collision with root package name */
                int f19287m;

                /* renamed from: p  reason: collision with root package name */
                private /* synthetic */ Object f19288p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ y f19289q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(y yVar, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f19289q = yVar;
                }

                @Override // pc.p
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final Object invoke(e eVar, Continuation<? super dc.w> continuation) {
                    return ((a) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f19289q, continuation);
                    aVar.f19288p = obj;
                    return aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:13:0x0039). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = ic.b.d()
                        int r1 = r8.f19287m
                        r2 = 1
                        if (r1 == 0) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r1 = r8.f19288p
                        k1.e r1 = (k1.e) r1
                        dc.n.b(r9)
                        r3 = r1
                        r1 = r0
                        r0 = r8
                        goto L39
                    L16:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1e:
                        dc.n.b(r9)
                        java.lang.Object r9 = r8.f19288p
                        k1.e r9 = (k1.e) r9
                        r1 = r9
                        r9 = r8
                    L27:
                        k1.t r3 = k1.t.Main
                        r9.f19288p = r1
                        r9.f19287m = r2
                        java.lang.Object r3 = r1.X(r3, r9)
                        if (r3 != r0) goto L34
                        return r0
                    L34:
                        r7 = r0
                        r0 = r9
                        r9 = r3
                        r3 = r1
                        r1 = r7
                    L39:
                        k1.r r9 = (k1.r) r9
                        int r4 = r9.f()
                        k1.u$a r5 = k1.u.f19238a
                        int r6 = r5.a()
                        boolean r4 = k1.u.i(r4, r6)
                        if (r4 == 0) goto L51
                        k1.y r9 = r0.f19289q
                        r9.e()
                        goto L64
                    L51:
                        int r9 = r9.f()
                        int r4 = r5.b()
                        boolean r9 = k1.u.i(r9, r4)
                        if (r9 == 0) goto L64
                        k1.y r9 = r0.f19289q
                        r9.m()
                    L64:
                        r9 = r0
                        r0 = r1
                        r1 = r3
                        goto L27
                    */
                    throw new UnsupportedOperationException("Method not decompiled: k1.x.c.C0433c.a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0433c(y yVar, Continuation<? super C0433c> continuation) {
                super(2, continuation);
                this.f19286p = yVar;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(l0 l0Var, Continuation<? super dc.w> continuation) {
                return ((C0433c) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                C0433c c0433c = new C0433c(this.f19286p, continuation);
                c0433c.f19285m = obj;
                return c0433c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f19284f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    l0 l0Var = (l0) this.f19285m;
                    a aVar = new a(this.f19286p, null);
                    this.f19284f = 1;
                    if (l0Var.V0(aVar, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w wVar, boolean z10) {
            super(3);
            this.f19277f = wVar;
            this.f19278m = z10;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            androidx.compose.ui.e eVar2;
            androidx.compose.ui.e a10;
            qc.q.i(eVar, "$this$composed");
            lVar.e(811087536);
            if (j0.n.K()) {
                j0.n.V(811087536, i10, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:89)");
            }
            z zVar = (z) lVar.C(z0.k());
            if (zVar == null) {
                a10 = androidx.compose.ui.e.f2335a;
            } else {
                b bVar = new b(zVar);
                w wVar = this.f19277f;
                boolean z10 = this.f19278m;
                lVar.e(-492369756);
                Object f10 = lVar.f();
                if (f10 == j0.l.f18688a.a()) {
                    f10 = new y(wVar, z10, bVar);
                    lVar.J(f10);
                }
                lVar.N();
                y yVar = (y) f10;
                Object[] objArr = {yVar, this.f19277f, Boolean.valueOf(this.f19278m), bVar};
                w wVar2 = this.f19277f;
                boolean z11 = this.f19278m;
                lVar.e(-568225417);
                boolean z12 = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    z12 |= lVar.Q(objArr[i11]);
                }
                Object f11 = lVar.f();
                if (z12 || f11 == j0.l.f18688a.a()) {
                    f11 = new a(yVar, wVar2, z11, bVar);
                    lVar.J(f11);
                }
                lVar.N();
                j0.h0.f((pc.a) f11, lVar, 0);
                if (yVar.E()) {
                    lVar.e(1157296644);
                    boolean Q = lVar.Q(yVar);
                    Object f12 = lVar.f();
                    if (Q || f12 == j0.l.f18688a.a()) {
                        f12 = new C0433c(yVar, null);
                        lVar.J(f12);
                    }
                    lVar.N();
                    eVar2 = u0.c(eVar, yVar, (pc.p) f12);
                } else {
                    eVar2 = androidx.compose.ui.e.f2335a;
                }
                a10 = yVar.a(eVar2);
            }
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return a10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, w wVar, boolean z10) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(wVar, "icon");
        if (k1.c()) {
            a10 = new b(wVar, z10);
        } else {
            a10 = k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new c(wVar, z10));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b(eVar, wVar, z10);
    }
}
