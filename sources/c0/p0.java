package c0;

import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import j0.g3;
import j0.y2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class p0 {

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8537a;

        static {
            int[] iArr = new int[u.o.values().length];
            try {
                iArr[u.o.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.o.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8537a = iArr;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<m1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q0 f8538f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.m f8539m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f8540p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, v.m mVar, boolean z10) {
            super(1);
            this.f8538f = q0Var;
            this.f8539m = mVar;
            this.f8540p = z10;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("textFieldScrollable");
            m1Var.a().c("scrollerPosition", this.f8538f);
            m1Var.a().c("interactionSource", this.f8539m);
            m1Var.a().c("enabled", Boolean.valueOf(this.f8540p));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q0 f8541f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f8542m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v.m f8543p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldScroll.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<Float, Float> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ q0 f8544f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q0 q0Var) {
                super(1);
                this.f8544f = q0Var;
            }

            public final Float a(float f10) {
                float d10 = this.f8544f.d() + f10;
                if (d10 > this.f8544f.c()) {
                    f10 = this.f8544f.c() - this.f8544f.d();
                } else if (d10 < 0.0f) {
                    f10 = -this.f8544f.d();
                }
                q0 q0Var = this.f8544f;
                q0Var.h(q0Var.d() + f10);
                return Float.valueOf(f10);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        }

        /* compiled from: TextFieldScroll.kt */
        /* loaded from: classes.dex */
        public static final class b implements u.x {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ u.x f8545a;

            /* renamed from: b  reason: collision with root package name */
            private final g3 f8546b;

            /* renamed from: c  reason: collision with root package name */
            private final g3 f8547c;

            /* compiled from: TextFieldScroll.kt */
            /* loaded from: classes.dex */
            static final class a extends qc.r implements pc.a<Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ q0 f8548f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(q0 q0Var) {
                    super(0);
                    this.f8548f = q0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // pc.a
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f8548f.d() > 0.0f);
                }
            }

            /* compiled from: TextFieldScroll.kt */
            /* renamed from: c0.p0$c$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            static final class C0216b extends qc.r implements pc.a<Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ q0 f8549f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0216b(q0 q0Var) {
                    super(0);
                    this.f8549f = q0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // pc.a
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f8549f.d() < this.f8549f.c());
                }
            }

            b(u.x xVar, q0 q0Var) {
                this.f8545a = xVar;
                this.f8546b = y2.d(new C0216b(q0Var));
                this.f8547c = y2.d(new a(q0Var));
            }

            @Override // u.x
            public boolean a() {
                return ((Boolean) this.f8546b.getValue()).booleanValue();
            }

            @Override // u.x
            public boolean b() {
                return this.f8545a.b();
            }

            @Override // u.x
            public Object c(t.b0 b0Var, pc.p<? super u.u, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super dc.w> continuation) {
                return this.f8545a.c(b0Var, pVar, continuation);
            }

            @Override // u.x
            public boolean d() {
                return ((Boolean) this.f8547c.getValue()).booleanValue();
            }

            @Override // u.x
            public float e(float f10) {
                return this.f8545a.e(f10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q0 q0Var, boolean z10, v.m mVar) {
            super(3);
            this.f8541f = q0Var;
            this.f8542m = z10;
            this.f8543p = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Type inference failed for: r14v0, types: [j0.l] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.e a(androidx.compose.ui.e r13, j0.l r14, int r15) {
            /*
                r12 = this;
                java.lang.String r0 = "$this$composed"
                qc.q.i(r13, r0)
                r13 = 805428266(0x3001dc2a, float:4.72428E-10)
                r14.e(r13)
                boolean r0 = j0.n.K()
                if (r0 == 0) goto L17
                r0 = -1
                java.lang.String r1 = "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:66)"
                j0.n.V(r13, r15, r0, r1)
            L17:
                j0.v1 r13 = androidx.compose.ui.platform.z0.j()
                java.lang.Object r13 = r14.C(r13)
                j2.r r15 = j2.r.Rtl
                r0 = 1
                r1 = 0
                if (r13 != r15) goto L27
                r13 = 1
                goto L28
            L27:
                r13 = 0
            L28:
                c0.q0 r15 = r12.f8541f
                u.o r15 = r15.f()
                u.o r2 = u.o.Vertical
                if (r15 == r2) goto L37
                if (r13 != 0) goto L35
                goto L37
            L35:
                r7 = 0
                goto L38
            L37:
                r7 = 1
            L38:
                c0.q0 r13 = r12.f8541f
                r15 = 1157296644(0x44faf204, float:2007.563)
                r14.e(r15)
                boolean r15 = r14.Q(r13)
                java.lang.Object r2 = r14.f()
                if (r15 != 0) goto L52
                j0.l$a r15 = j0.l.f18688a
                java.lang.Object r15 = r15.a()
                if (r2 != r15) goto L5a
            L52:
                c0.p0$c$a r2 = new c0.p0$c$a
                r2.<init>(r13)
                r14.J(r2)
            L5a:
                r14.N()
                pc.l r2 = (pc.l) r2
                u.x r13 = u.y.b(r2, r14, r1)
                c0.q0 r15 = r12.f8541f
                r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                r14.e(r2)
                boolean r2 = r14.Q(r13)
                boolean r3 = r14.Q(r15)
                r2 = r2 | r3
                java.lang.Object r3 = r14.f()
                if (r2 != 0) goto L82
                j0.l$a r2 = j0.l.f18688a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L8a
            L82:
                c0.p0$c$b r3 = new c0.p0$c$b
                r3.<init>(r13, r15)
                r14.J(r3)
            L8a:
                r14.N()
                r4 = r3
                c0.p0$c$b r4 = (c0.p0.c.b) r4
                androidx.compose.ui.e$a r3 = androidx.compose.ui.e.f2335a
                c0.q0 r13 = r12.f8541f
                u.o r5 = r13.f()
                boolean r13 = r12.f8542m
                if (r13 == 0) goto Lae
                c0.q0 r13 = r12.f8541f
                float r13 = r13.c()
                r15 = 0
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 != 0) goto La9
                r13 = 1
                goto Laa
            La9:
                r13 = 0
            Laa:
                if (r13 != 0) goto Lae
                r6 = 1
                goto Laf
            Lae:
                r6 = 0
            Laf:
                r8 = 0
                v.m r9 = r12.f8543p
                r10 = 16
                r11 = 0
                androidx.compose.ui.e r13 = androidx.compose.foundation.gestures.d.k(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r15 = j0.n.K()
                if (r15 == 0) goto Lc2
                j0.n.U()
            Lc2:
                r14.N()
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.p0.c.a(androidx.compose.ui.e, j0.l, int):androidx.compose.ui.e");
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0.h b(j2.e eVar, int i10, b2.s0 s0Var, v1.g0 g0Var, boolean z10, int i11) {
        z0.h a10;
        float i12;
        float i13;
        if (g0Var == null || (a10 = g0Var.d(s0Var.a().b(i10))) == null) {
            a10 = z0.h.f26359e.a();
        }
        z0.h hVar = a10;
        int K0 = eVar.K0(g0.c());
        if (z10) {
            i12 = (i11 - hVar.i()) - K0;
        } else {
            i12 = hVar.i();
        }
        float f10 = i12;
        if (z10) {
            i13 = i11 - hVar.i();
        } else {
            i13 = hVar.i() + K0;
        }
        return z0.h.d(hVar, f10, 0.0f, i13, 0.0f, 10, null);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, q0 q0Var, b2.j0 j0Var, b2.t0 t0Var, pc.a<v0> aVar) {
        androidx.compose.ui.e f1Var;
        qc.q.i(eVar, "<this>");
        qc.q.i(q0Var, "scrollerPosition");
        qc.q.i(j0Var, "textFieldValue");
        qc.q.i(t0Var, "visualTransformation");
        qc.q.i(aVar, "textLayoutResultProvider");
        u.o f10 = q0Var.f();
        int e10 = q0Var.e(j0Var.g());
        q0Var.i(j0Var.g());
        b2.s0 a10 = e1.a(t0Var, j0Var.e());
        int i10 = a.f8537a[f10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f1Var = new o(q0Var, e10, a10, aVar);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f1Var = new f1(q0Var, e10, a10, aVar);
        }
        return x0.e.b(eVar).a(f1Var);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, q0 q0Var, v.m mVar, boolean z10) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(q0Var, "scrollerPosition");
        if (k1.c()) {
            a10 = new b(q0Var, mVar, z10);
        } else {
            a10 = k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, new c(q0Var, z10, mVar));
    }
}
