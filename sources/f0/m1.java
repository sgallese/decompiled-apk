package f0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g3;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: SnackbarHost.kt */
/* loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.q<pc.p<? super j0.l, ? super Integer, ? extends dc.w>, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j1 f14869f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j1 f14870m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ List<j1> f14871p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ j0<j1> f14872q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnackbarHost.kt */
        /* renamed from: f0.m1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0352a extends qc.r implements pc.l<t1.x, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j1 f14873f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SnackbarHost.kt */
            /* renamed from: f0.m1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0353a extends qc.r implements pc.a<Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ j1 f14874f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0353a(j1 j1Var) {
                    super(0);
                    this.f14874f = j1Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // pc.a
                public final Boolean invoke() {
                    this.f14874f.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0352a(j1 j1Var) {
                super(1);
                this.f14873f = j1Var;
            }

            public final void a(t1.x xVar) {
                qc.q.i(xVar, "$this$semantics");
                t1.v.O(xVar, t1.g.f23416b.b());
                t1.v.i(xVar, null, new C0353a(this.f14873f), 1, null);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
                a(xVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnackbarHost.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ j1 f14875f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j0<j1> f14876m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SnackbarHost.kt */
            /* renamed from: f0.m1$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0354a extends qc.r implements pc.l<i0<j1>, Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ j1 f14877f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0354a(j1 j1Var) {
                    super(1);
                    this.f14877f = j1Var;
                }

                @Override // pc.l
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(i0<j1> i0Var) {
                    qc.q.i(i0Var, "it");
                    return Boolean.valueOf(qc.q.d(i0Var.c(), this.f14877f));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j1 j1Var, j0<j1> j0Var) {
                super(0);
                this.f14875f = j1Var;
                this.f14876m = j0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (qc.q.d(this.f14875f, this.f14876m.a())) {
                    return;
                }
                ec.y.C(this.f14876m.b(), new C0354a(this.f14875f));
                j0.x1 c10 = this.f14876m.c();
                if (c10 != null) {
                    c10.invalidate();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j1 j1Var, j1 j1Var2, List<j1> list, j0<j1> j0Var) {
            super(3);
            this.f14869f = j1Var;
            this.f14870m = j1Var2;
            this.f14871p = list;
            this.f14872q = j0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r38, j0.l r39, int r40) {
            /*
                Method dump skipped, instructions count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f0.m1.a.a(pc.p, j0.l, int):void");
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(pc.p<? super j0.l, ? super Integer, ? extends dc.w> pVar, j0.l lVar, Integer num) {
            a(pVar, lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.q<j1, j0.l, Integer, dc.w> f14878f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j1 f14879m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f14880p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.q<? super j1, ? super j0.l, ? super Integer, dc.w> qVar, j1 j1Var, int i10) {
            super(2);
            this.f14878f = qVar;
            this.f14879m = j1Var;
            this.f14880p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(2041982076, i10, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:319)");
            }
            pc.q<j1, j0.l, Integer, dc.w> qVar = this.f14878f;
            j1 j1Var = this.f14879m;
            qc.q.f(j1Var);
            qVar.invoke(j1Var, lVar, Integer.valueOf((this.f14880p >> 3) & 112));
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j1 f14881f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14882m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.q<j1, j0.l, Integer, dc.w> f14883p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f14884q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14885r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(j1 j1Var, androidx.compose.ui.e eVar, pc.q<? super j1, ? super j0.l, ? super Integer, dc.w> qVar, int i10, int i11) {
            super(2);
            this.f14881f = j1Var;
            this.f14882m = eVar;
            this.f14883p = qVar;
            this.f14884q = i10;
            this.f14885r = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            m1.a(this.f14881f, this.f14882m, this.f14883p, lVar, j0.z1.a(this.f14884q | 1), this.f14885r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {164}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14886f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j1 f14887m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.i f14888p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j1 j1Var, androidx.compose.ui.platform.i iVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f14887m = j1Var;
            this.f14888p = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new d(this.f14887m, this.f14888p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            boolean z10;
            d10 = ic.d.d();
            int i10 = this.f14886f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                j1 j1Var = this.f14887m;
                if (j1Var != null) {
                    l1 duration = j1Var.getDuration();
                    if (this.f14887m.c() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long h10 = m1.h(duration, z10, this.f14888p);
                    this.f14886f = 1;
                    if (ad.u0.a(h10, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
            this.f14887m.dismiss();
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n1 f14889f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14890m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.q<j1, j0.l, Integer, dc.w> f14891p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f14892q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f14893r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(n1 n1Var, androidx.compose.ui.e eVar, pc.q<? super j1, ? super j0.l, ? super Integer, dc.w> qVar, int i10, int i11) {
            super(2);
            this.f14889f = n1Var;
            this.f14890m = eVar;
            this.f14891p = qVar;
            this.f14892q = i10;
            this.f14893r = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            m1.b(this.f14889f, this.f14890m, this.f14891p, lVar, j0.z1.a(this.f14892q | 1), this.f14893r);
        }
    }

    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14894a;

        static {
            int[] iArr = new int[l1.values().length];
            try {
                iArr[l1.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l1.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l1.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14894a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f14895f = new g();

        g() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", l = {350}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14896f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s.a<Float, s.n> f14897m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f14898p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ s.j<Float> f14899q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f14900r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(s.a<Float, s.n> aVar, boolean z10, s.j<Float> jVar, pc.a<dc.w> aVar2, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f14897m = aVar;
            this.f14898p = z10;
            this.f14899q = jVar;
            this.f14900r = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new h(this.f14897m, this.f14898p, this.f14899q, this.f14900r, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((h) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            float f10;
            d10 = ic.d.d();
            int i10 = this.f14896f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                s.a<Float, s.n> aVar = this.f14897m;
                if (this.f14898p) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Float c10 = kotlin.coroutines.jvm.internal.b.c(f10);
                s.j<Float> jVar = this.f14899q;
                this.f14896f = 1;
                if (s.a.f(aVar, c10, jVar, null, null, this, 12, null) == d10) {
                    return d10;
                }
            }
            this.f14900r.invoke();
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {363}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14901f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s.a<Float, s.n> f14902m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f14903p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ s.j<Float> f14904q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(s.a<Float, s.n> aVar, boolean z10, s.j<Float> jVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f14902m = aVar;
            this.f14903p = z10;
            this.f14904q = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new i(this.f14902m, this.f14903p, this.f14904q, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((i) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            float f10;
            d10 = ic.d.d();
            int i10 = this.f14901f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                s.a<Float, s.n> aVar = this.f14902m;
                if (this.f14903p) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                Float c10 = kotlin.coroutines.jvm.internal.b.c(f10);
                s.j<Float> jVar = this.f14904q;
                this.f14901f = 1;
                if (s.a.f(aVar, c10, jVar, null, null, this, 12, null) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3 A[LOOP:2: B:75:0x01e1->B:76:0x01e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(f0.j1 r17, androidx.compose.ui.e r18, pc.q<? super f0.j1, ? super j0.l, ? super java.lang.Integer, dc.w> r19, j0.l r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.m1.a(f0.j1, androidx.compose.ui.e, pc.q, j0.l, int, int):void");
    }

    public static final void b(n1 n1Var, androidx.compose.ui.e eVar, pc.q<? super j1, ? super j0.l, ? super Integer, dc.w> qVar, j0.l lVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        qc.q.i(n1Var, "hostState");
        j0.l q10 = lVar.q(431012348);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (q10.Q(n1Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (q10.Q(eVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (q10.l(qVar)) {
                i15 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && q10.t()) {
            q10.z();
        } else {
            if (i16 != 0) {
                eVar = androidx.compose.ui.e.f2335a;
            }
            if (i17 != 0) {
                qVar = m.f14830a.a();
            }
            if (j0.n.K()) {
                j0.n.V(431012348, i12, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)");
            }
            j1 a10 = n1Var.a();
            j0.h0.d(a10, new d(a10, (androidx.compose.ui.platform.i) q10.C(androidx.compose.ui.platform.z0.c()), null), q10, 64);
            a(n1Var.a(), eVar, qVar, q10, (i12 & 112) | (i12 & 896), 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        pc.q<? super j1, ? super j0.l, ? super Integer, dc.w> qVar2 = qVar;
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new e(n1Var, eVar2, qVar2, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3<Float> f(s.j<Float> jVar, boolean z10, pc.a<dc.w> aVar, j0.l lVar, int i10, int i11) {
        float f10;
        lVar.e(1016418159);
        if ((i11 & 4) != 0) {
            aVar = g.f14895f;
        }
        pc.a<dc.w> aVar2 = aVar;
        if (j0.n.K()) {
            j0.n.V(1016418159, i10, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        lVar.e(-492369756);
        Object f11 = lVar.f();
        if (f11 == j0.l.f18688a.a()) {
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            f11 = s.b.b(f10, 0.0f, 2, null);
            lVar.J(f11);
        }
        lVar.N();
        s.a aVar3 = (s.a) f11;
        j0.h0.d(Boolean.valueOf(z10), new h(aVar3, z10, jVar, aVar2, null), lVar, ((i10 >> 3) & 14) | 64);
        g3<Float> g10 = aVar3.g();
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3<Float> g(s.j<Float> jVar, boolean z10, j0.l lVar, int i10) {
        float f10;
        lVar.e(2003504988);
        if (j0.n.K()) {
            j0.n.V(2003504988, i10, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        lVar.e(-492369756);
        Object f11 = lVar.f();
        if (f11 == j0.l.f18688a.a()) {
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            f11 = s.b.b(f10, 0.0f, 2, null);
            lVar.J(f11);
        }
        lVar.N();
        s.a aVar = (s.a) f11;
        j0.h0.d(Boolean.valueOf(z10), new i(aVar, z10, jVar, null), lVar, ((i10 >> 3) & 14) | 64);
        g3<Float> g10 = aVar.g();
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return g10;
    }

    public static final long h(l1 l1Var, boolean z10, androidx.compose.ui.platform.i iVar) {
        long j10;
        qc.q.i(l1Var, "<this>");
        int i10 = f.f14894a[l1Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    j10 = 4000;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j10 = 10000;
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        long j11 = j10;
        if (iVar == null) {
            return j11;
        }
        return iVar.a(j11, true, true, z10);
    }
}
