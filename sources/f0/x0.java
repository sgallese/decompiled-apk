package f0;

import a1.q4;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f0.e;
import j0.g3;
import j0.i2;
import j0.l3;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import p1.g;
import v0.b;

/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f15195a = j2.h.j(56);

    /* renamed from: b  reason: collision with root package name */
    private static final float f15196b = j2.h.j(125);

    /* renamed from: c  reason: collision with root package name */
    private static final float f15197c = j2.h.j(640);

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class a implements j1.b {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0.e<?> f15198f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ u.o f15199m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {784}, m = "onPostFling-RZ2iAVY")
        /* renamed from: f0.x0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0361a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            long f15200f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f15201m;

            /* renamed from: q  reason: collision with root package name */
            int f15203q;

            C0361a(Continuation<? super C0361a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f15201m = obj;
                this.f15203q |= RecyclerView.UNDEFINED_DURATION;
                return a.this.H(0L, 0L, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {775}, m = "onPreFling-QWom1Mo")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            long f15204f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f15205m;

            /* renamed from: q  reason: collision with root package name */
            int f15207q;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f15205m = obj;
                this.f15207q |= RecyclerView.UNDEFINED_DURATION;
                return a.this.A0(0L, this);
            }
        }

        a(f0.e<?> eVar, u.o oVar) {
            this.f15198f = eVar;
            this.f15199m = oVar;
        }

        private final float a(long j10) {
            if (this.f15199m == u.o.Horizontal) {
                return z0.f.o(j10);
            }
            return z0.f.p(j10);
        }

        private final long b(float f10) {
            float f11;
            u.o oVar = this.f15199m;
            if (oVar == u.o.Horizontal) {
                f11 = f10;
            } else {
                f11 = 0.0f;
            }
            if (oVar != u.o.Vertical) {
                f10 = 0.0f;
            }
            return z0.g.a(f11, f10);
        }

        private final float c(long j10) {
            if (this.f15199m == u.o.Horizontal) {
                return j2.v.h(j10);
            }
            return j2.v.i(j10);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // j1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object A0(long r6, kotlin.coroutines.Continuation<? super j2.v> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof f0.x0.a.b
                if (r0 == 0) goto L13
                r0 = r8
                f0.x0$a$b r0 = (f0.x0.a.b) r0
                int r1 = r0.f15207q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f15207q = r1
                goto L18
            L13:
                f0.x0$a$b r0 = new f0.x0$a$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f15205m
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f15207q
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                long r6 = r0.f15204f
                dc.n.b(r8)
                goto L62
            L2b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L33:
                dc.n.b(r8)
                float r8 = r5.c(r6)
                f0.e<?> r2 = r5.f15198f
                float r2 = r2.F()
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 >= 0) goto L5c
                f0.e<?> r4 = r5.f15198f
                float r4 = r4.z()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L5c
                f0.e<?> r2 = r5.f15198f
                r0.f15204f = r6
                r0.f15207q = r3
                java.lang.Object r8 = r2.L(r8, r0)
                if (r8 != r1) goto L62
                return r1
            L5c:
                j2.v$a r6 = j2.v.f19013b
                long r6 = r6.a()
            L62:
                j2.v r6 = j2.v.b(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f0.x0.a.A0(long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // j1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object H(long r3, long r5, kotlin.coroutines.Continuation<? super j2.v> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof f0.x0.a.C0361a
                if (r3 == 0) goto L13
                r3 = r7
                f0.x0$a$a r3 = (f0.x0.a.C0361a) r3
                int r4 = r3.f15203q
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.f15203q = r4
                goto L18
            L13:
                f0.x0$a$a r3 = new f0.x0$a$a
                r3.<init>(r7)
            L18:
                java.lang.Object r4 = r3.f15201m
                java.lang.Object r7 = ic.b.d()
                int r0 = r3.f15203q
                r1 = 1
                if (r0 == 0) goto L33
                if (r0 != r1) goto L2b
                long r5 = r3.f15200f
                dc.n.b(r4)
                goto L47
            L2b:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                throw r3
            L33:
                dc.n.b(r4)
                f0.e<?> r4 = r2.f15198f
                float r0 = r2.c(r5)
                r3.f15200f = r5
                r3.f15203q = r1
                java.lang.Object r3 = r4.L(r0, r3)
                if (r3 != r7) goto L47
                return r7
            L47:
                j2.v r3 = j2.v.b(r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: f0.x0.a.H(long, long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // j1.b
        public long T0(long j10, long j11, int i10) {
            if (j1.f.d(i10, j1.f.f18968a.a())) {
                return b(this.f15198f.o(a(j11)));
            }
            return z0.f.f26354b.c();
        }

        @Override // j1.b
        public long o0(long j10, int i10) {
            float a10 = a(j10);
            if (a10 < 0.0f && j1.f.d(i10, j1.f.f18968a.a())) {
                return b(this.f15198f.o(a10));
            }
            return z0.f.f26354b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class b implements e.b<z0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y0 f15208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ad.k0 f15209b;

        /* compiled from: ModalBottomSheet.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f15210a;

            static {
                int[] iArr = new int[z0.values().length];
                try {
                    iArr[z0.Hidden.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[z0.HalfExpanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[z0.Expanded.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f15210a = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1", f = "ModalBottomSheet.kt", l = {819}, m = "invokeSuspend")
        /* renamed from: f0.x0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0362b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f15211f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ y0 f15212m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ z0 f15213p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0362b(y0 y0Var, z0 z0Var, Continuation<? super C0362b> continuation) {
                super(2, continuation);
                this.f15212m = y0Var;
                this.f15213p = z0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C0362b(this.f15212m, this.f15213p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C0362b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f15211f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    y0 y0Var = this.f15212m;
                    z0 z0Var = this.f15213p;
                    float i11 = y0Var.i();
                    this.f15211f = 1;
                    if (y0Var.b(z0Var, i11, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$2", f = "ModalBottomSheet.kt", l = {823}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f15214f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ y0 f15215m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ z0 f15216p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(y0 y0Var, z0 z0Var, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f15215m = y0Var;
                this.f15216p = z0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new c(this.f15215m, this.f15216p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f15214f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    y0 y0Var = this.f15215m;
                    z0 z0Var = this.f15216p;
                    this.f15214f = 1;
                    if (y0Var.r(z0Var, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        b(y0 y0Var, ad.k0 k0Var) {
            this.f15208a = y0Var;
            this.f15209b = k0Var;
        }

        @Override // f0.e.b
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final void a(z0 z0Var, Map<z0, Float> map, Map<z0, Float> map2) {
            z0 z0Var2;
            Object i10;
            qc.q.i(z0Var, "prevTarget");
            qc.q.i(map, "prevAnchors");
            qc.q.i(map2, "newAnchors");
            Float f10 = map.get(z0Var);
            int i11 = a.f15210a[z0Var.ordinal()];
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z0Var2 = z0.HalfExpanded;
                if (!map2.containsKey(z0Var2)) {
                    z0Var2 = z0.Expanded;
                    if (!map2.containsKey(z0Var2)) {
                        z0Var2 = z0.Hidden;
                    }
                }
            } else {
                z0Var2 = z0.Hidden;
            }
            i10 = ec.n0.i(map2, z0Var2);
            if (!qc.q.a(((Number) i10).floatValue(), f10)) {
                if (this.f15208a.l()) {
                    ad.i.d(this.f15209b, null, null, new C0362b(this.f15208a, z0Var2, null), 3, null);
                } else if (!this.f15208a.s(z0Var2)) {
                    ad.i.d(this.f15209b, null, null, new c(this.f15208a, z0Var2, null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f15217f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j2.e f15218m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0 y0Var, j2.e eVar) {
            super(0);
            this.f15217f = y0Var;
            this.f15218m = eVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f15217f.p(this.f15218m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.q<w.f, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f15219f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ y0 f15220m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ u.o f15221p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q4 f15222q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f15223r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f15224s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ float f15225t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f15226u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15227v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ long f15228w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ ad.k0 f15229x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ e.b<z0> f15230y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ pc.q<w.j, j0.l, Integer, dc.w> f15231z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0 f15232f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ ad.k0 f15233m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ModalBottomSheet.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$1$1$1", f = "ModalBottomSheet.kt", l = {595}, m = "invokeSuspend")
            /* renamed from: f0.x0$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0363a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f15234f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ y0 f15235m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0363a(y0 y0Var, Continuation<? super C0363a> continuation) {
                    super(2, continuation);
                    this.f15235m = y0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0363a(this.f15235m, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0363a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f15234f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        y0 y0Var = this.f15235m;
                        this.f15234f = 1;
                        if (y0Var.k(this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, ad.k0 k0Var) {
                super(0);
                this.f15232f = y0Var;
                this.f15233m = k0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f15232f.e().u().invoke(z0.Hidden).booleanValue()) {
                    ad.i.d(this.f15233m, null, null, new C0363a(this.f15232f, null), 3, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.l<j2.e, j2.l> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0 f15236f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y0 y0Var) {
                super(1);
                this.f15236f = y0Var;
            }

            public final long a(j2.e eVar) {
                int d10;
                qc.q.i(eVar, "$this$offset");
                d10 = sc.c.d(this.f15236f.e().F());
                return j2.m.a(0, d10);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ j2.l invoke(j2.e eVar) {
                return j2.l.b(a(eVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* loaded from: classes.dex */
        public static final class c extends qc.r implements pc.l<j2.p, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0 f15237f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ e.b<z0> f15238m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ float f15239p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(y0 y0Var, e.b<z0> bVar, float f10) {
                super(1);
                this.f15237f = y0Var;
                this.f15238m = bVar;
                this.f15239p = f10;
            }

            public final void a(long j10) {
                Map c10;
                Map<z0, Float> b10;
                float f10 = this.f15239p;
                y0 y0Var = this.f15237f;
                c10 = ec.m0.c();
                c10.put(z0.Hidden, Float.valueOf(f10));
                float f11 = f10 / 2.0f;
                if (!y0Var.m() && j2.p.f(j10) > f11) {
                    c10.put(z0.HalfExpanded, Float.valueOf(f11));
                }
                if (j2.p.f(j10) != 0) {
                    c10.put(z0.Expanded, Float.valueOf(Math.max(0.0f, f10 - j2.p.f(j10))));
                }
                b10 = ec.m0.b(c10);
                this.f15237f.e().N(b10, this.f15238m);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(j2.p pVar) {
                a(pVar.j());
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* renamed from: f0.x0$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0364d extends qc.r implements pc.l<t1.x, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0 f15240f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ ad.k0 f15241m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ModalBottomSheet.kt */
            /* renamed from: f0.x0$d$d$a */
            /* loaded from: classes.dex */
            public static final class a extends qc.r implements pc.a<Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ y0 f15242f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ ad.k0 f15243m;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: ModalBottomSheet.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$1$1", f = "ModalBottomSheet.kt", l = {653}, m = "invokeSuspend")
                /* renamed from: f0.x0$d$d$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0365a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    int f15244f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ y0 f15245m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0365a(y0 y0Var, Continuation<? super C0365a> continuation) {
                        super(2, continuation);
                        this.f15245m = y0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new C0365a(this.f15245m, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((C0365a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        d10 = ic.d.d();
                        int i10 = this.f15244f;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            y0 y0Var = this.f15245m;
                            this.f15244f = 1;
                            if (y0Var.k(this) == d10) {
                                return d10;
                            }
                        }
                        return dc.w.f13270a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(y0 y0Var, ad.k0 k0Var) {
                    super(0);
                    this.f15242f = y0Var;
                    this.f15243m = k0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // pc.a
                public final Boolean invoke() {
                    if (this.f15242f.e().u().invoke(z0.Hidden).booleanValue()) {
                        ad.i.d(this.f15243m, null, null, new C0365a(this.f15242f, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ModalBottomSheet.kt */
            /* renamed from: f0.x0$d$d$b */
            /* loaded from: classes.dex */
            public static final class b extends qc.r implements pc.a<Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ y0 f15246f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ ad.k0 f15247m;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: ModalBottomSheet.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", l = {665}, m = "invokeSuspend")
                /* renamed from: f0.x0$d$d$b$a */
                /* loaded from: classes.dex */
                public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    int f15248f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ y0 f15249m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(y0 y0Var, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f15249m = y0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new a(this.f15249m, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        d10 = ic.d.d();
                        int i10 = this.f15248f;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            y0 y0Var = this.f15249m;
                            this.f15248f = 1;
                            if (y0Var.d(this) == d10) {
                                return d10;
                            }
                        }
                        return dc.w.f13270a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(y0 y0Var, ad.k0 k0Var) {
                    super(0);
                    this.f15246f = y0Var;
                    this.f15247m = k0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // pc.a
                public final Boolean invoke() {
                    if (this.f15246f.e().u().invoke(z0.Expanded).booleanValue()) {
                        ad.i.d(this.f15247m, null, null, new a(this.f15246f, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ModalBottomSheet.kt */
            /* renamed from: f0.x0$d$d$c */
            /* loaded from: classes.dex */
            public static final class c extends qc.r implements pc.a<Boolean> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ y0 f15250f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ ad.k0 f15251m;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: ModalBottomSheet.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$3$1", f = "ModalBottomSheet.kt", l = {675}, m = "invokeSuspend")
                /* renamed from: f0.x0$d$d$c$a */
                /* loaded from: classes.dex */
                public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    int f15252f;

                    /* renamed from: m  reason: collision with root package name */
                    final /* synthetic */ y0 f15253m;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(y0 y0Var, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f15253m = y0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        return new a(this.f15253m, continuation);
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object d10;
                        d10 = ic.d.d();
                        int i10 = this.f15252f;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                dc.n.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            dc.n.b(obj);
                            y0 y0Var = this.f15253m;
                            this.f15252f = 1;
                            if (y0Var.j(this) == d10) {
                                return d10;
                            }
                        }
                        return dc.w.f13270a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(y0 y0Var, ad.k0 k0Var) {
                    super(0);
                    this.f15250f = y0Var;
                    this.f15251m = k0Var;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // pc.a
                public final Boolean invoke() {
                    if (this.f15250f.e().u().invoke(z0.HalfExpanded).booleanValue()) {
                        ad.i.d(this.f15251m, null, null, new a(this.f15250f, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0364d(y0 y0Var, ad.k0 k0Var) {
                super(1);
                this.f15240f = y0Var;
                this.f15241m = k0Var;
            }

            public final void a(t1.x xVar) {
                qc.q.i(xVar, "$this$semantics");
                if (this.f15240f.n()) {
                    t1.v.i(xVar, null, new a(this.f15240f, this.f15241m), 1, null);
                    if (this.f15240f.e().v() == z0.HalfExpanded) {
                        t1.v.l(xVar, null, new b(this.f15240f, this.f15241m), 1, null);
                    } else if (this.f15240f.h()) {
                        t1.v.b(xVar, null, new c(this.f15240f, this.f15241m), 1, null);
                    }
                }
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
                a(xVar);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* loaded from: classes.dex */
        public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.q<w.j, j0.l, Integer, dc.w> f15254f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f15255m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(pc.q<? super w.j, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
                super(2);
                this.f15254f = qVar;
                this.f15255m = i10;
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
                    j0.n.V(1552994302, i10, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:687)");
                }
                pc.q<w.j, j0.l, Integer, dc.w> qVar = this.f15254f;
                int i11 = (this.f15255m << 9) & 7168;
                lVar.e(-483455358);
                e.a aVar = androidx.compose.ui.e.f2335a;
                int i12 = i11 >> 3;
                n1.i0 a10 = w.h.a(w.a.f25135a.f(), v0.b.f24258a.j(), lVar, (i12 & 112) | (i12 & 14));
                lVar.e(-1323940314);
                int a11 = j0.j.a(lVar, 0);
                j0.v F = lVar.F();
                g.a aVar2 = p1.g.f20790l;
                pc.a<p1.g> a12 = aVar2.a();
                pc.q<i2<p1.g>, j0.l, Integer, dc.w> a13 = n1.x.a(aVar);
                int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
                if (!(lVar.u() instanceof j0.f)) {
                    j0.j.c();
                }
                lVar.s();
                if (lVar.n()) {
                    lVar.B(a12);
                } else {
                    lVar.H();
                }
                j0.l a14 = l3.a(lVar);
                l3.b(a14, a10, aVar2.e());
                l3.b(a14, F, aVar2.g());
                pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
                if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
                    a14.J(Integer.valueOf(a11));
                    a14.I(Integer.valueOf(a11), b10);
                }
                a13.invoke(i2.a(i2.b(lVar)), lVar, Integer.valueOf((i13 >> 3) & 112));
                lVar.e(2058660585);
                qVar.invoke(w.k.f25176a, lVar, Integer.valueOf(((i11 >> 6) & 112) | 6));
                lVar.N();
                lVar.O();
                lVar.N();
                lVar.N();
                if (j0.n.K()) {
                    j0.n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, y0 y0Var, u.o oVar, q4 q4Var, long j10, long j11, float f10, int i10, pc.p<? super j0.l, ? super Integer, dc.w> pVar, long j12, ad.k0 k0Var, e.b<z0> bVar, pc.q<? super w.j, ? super j0.l, ? super Integer, dc.w> qVar) {
            super(3);
            this.f15219f = z10;
            this.f15220m = y0Var;
            this.f15221p = oVar;
            this.f15222q = q4Var;
            this.f15223r = j10;
            this.f15224s = j11;
            this.f15225t = f10;
            this.f15226u = i10;
            this.f15227v = pVar;
            this.f15228w = j12;
            this.f15229x = k0Var;
            this.f15230y = bVar;
            this.f15231z = qVar;
        }

        public final void a(w.f fVar, j0.l lVar, int i10) {
            int i11;
            boolean z10;
            androidx.compose.ui.e eVar;
            boolean z11;
            int i12;
            qc.q.i(fVar, "$this$BoxWithConstraints");
            if ((i10 & 14) == 0) {
                if (lVar.Q(fVar)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i12 | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-1731958854, i10, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous> (ModalBottomSheet.kt:586)");
            }
            float m10 = j2.b.m(fVar.c());
            androidx.compose.ui.e eVar2 = androidx.compose.ui.e.f2335a;
            androidx.compose.ui.e f10 = androidx.compose.foundation.layout.m.f(eVar2, 0.0f, 1, null);
            pc.p<j0.l, Integer, dc.w> pVar = this.f15227v;
            int i13 = this.f15226u;
            long j10 = this.f15228w;
            y0 y0Var = this.f15220m;
            ad.k0 k0Var = this.f15229x;
            lVar.e(733328855);
            b.a aVar = v0.b.f24258a;
            n1.i0 h10 = androidx.compose.foundation.layout.d.h(aVar.n(), false, lVar, 0);
            lVar.e(-1323940314);
            int a10 = j0.j.a(lVar, 0);
            j0.v F = lVar.F();
            g.a aVar2 = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar2.a();
            pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(f10);
            if (!(lVar.u() instanceof j0.f)) {
                j0.j.c();
            }
            lVar.s();
            if (lVar.n()) {
                lVar.B(a11);
            } else {
                lVar.H();
            }
            j0.l a13 = l3.a(lVar);
            l3.b(a13, h10, aVar2.e());
            l3.b(a13, F, aVar2.g());
            pc.p<p1.g, Integer, dc.w> b10 = aVar2.b();
            if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            androidx.compose.foundation.layout.e eVar3 = androidx.compose.foundation.layout.e.f2083a;
            pVar.invoke(lVar, Integer.valueOf((i13 >> 27) & 14));
            a aVar3 = new a(y0Var, k0Var);
            z0 B = y0Var.e().B();
            z0 z0Var = z0.Hidden;
            if (B != z0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            x0.e(j10, aVar3, z10, lVar, (i13 >> 24) & 14);
            lVar.N();
            lVar.O();
            lVar.N();
            lVar.N();
            androidx.compose.ui.e h11 = androidx.compose.foundation.layout.m.h(androidx.compose.foundation.layout.m.u(fVar.b(eVar2, aVar.l()), 0.0f, x0.f15197c, 1, null), 0.0f, 1, null);
            lVar.e(1241536180);
            if (this.f15219f) {
                Object e10 = this.f15220m.e();
                u.o oVar = this.f15221p;
                y0 y0Var2 = this.f15220m;
                lVar.e(511388516);
                boolean Q = lVar.Q(e10) | lVar.Q(oVar);
                Object f11 = lVar.f();
                if (Q || f11 == j0.l.f18688a.a()) {
                    f11 = x0.a(y0Var2.e(), oVar);
                    lVar.J(f11);
                }
                lVar.N();
                eVar = androidx.compose.ui.input.nestedscroll.a.b(eVar2, (j1.b) f11, null, 2, null);
            } else {
                eVar = eVar2;
            }
            lVar.N();
            androidx.compose.ui.e a14 = androidx.compose.foundation.layout.g.a(h11.a(eVar), new b(this.f15220m));
            f0.e<z0> e11 = this.f15220m.e();
            u.o oVar2 = this.f15221p;
            if (this.f15219f && this.f15220m.e().v() != z0Var) {
                z11 = true;
            } else {
                z11 = false;
            }
            androidx.compose.ui.e a15 = n1.t0.a(f0.d.e(a14, e11, oVar2, z11, false, null, 24, null), new c(this.f15220m, this.f15230y, m10));
            if (this.f15219f) {
                eVar2 = t1.o.c(eVar2, false, new C0364d(this.f15220m, this.f15229x), 1, null);
            }
            androidx.compose.ui.e a16 = a15.a(eVar2);
            q4 q4Var = this.f15222q;
            long j11 = this.f15223r;
            long j12 = this.f15224s;
            float f12 = this.f15225t;
            q0.a b11 = q0.c.b(lVar, 1552994302, true, new e(this.f15231z, this.f15226u));
            int i14 = this.f15226u;
            r1.a(a16, q4Var, j11, j12, null, f12, b11, lVar, ((i14 >> 9) & 112) | 1572864 | ((i14 >> 12) & 896) | ((i14 >> 12) & 7168) | (i14 & 458752), 16);
            if (j0.n.K()) {
                j0.n.U();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(w.f fVar, j0.l lVar, Integer num) {
            a(fVar, lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.q<w.j, j0.l, Integer, dc.w> f15256f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15257m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ y0 f15258p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f15259q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ q4 f15260r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ float f15261s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f15262t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ long f15263u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ long f15264v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15265w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f15266x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f15267y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(pc.q<? super w.j, ? super j0.l, ? super Integer, dc.w> qVar, androidx.compose.ui.e eVar, y0 y0Var, boolean z10, q4 q4Var, float f10, long j10, long j11, long j12, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10, int i11) {
            super(2);
            this.f15256f = qVar;
            this.f15257m = eVar;
            this.f15258p = y0Var;
            this.f15259q = z10;
            this.f15260r = q4Var;
            this.f15261s = f10;
            this.f15262t = j10;
            this.f15263u = j11;
            this.f15264v = j12;
            this.f15265w = pVar;
            this.f15266x = i10;
            this.f15267y = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            x0.c(this.f15256f, this.f15257m, this.f15258p, this.f15259q, this.f15260r, this.f15261s, this.f15262t, this.f15263u, this.f15264v, this.f15265w, lVar, j0.z1.a(this.f15266x | 1), this.f15267y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<c1.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f15268f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g3<Float> f15269m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10, g3<Float> g3Var) {
            super(1);
            this.f15268f = j10;
            this.f15269m = g3Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.f fVar) {
            invoke2(fVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c1.f fVar) {
            qc.q.i(fVar, "$this$Canvas");
            c1.e.m(fVar, this.f15268f, 0L, 0L, x0.f(this.f15269m), null, null, 0, 118, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f15270f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f15271m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f15272p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f15273q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, pc.a<dc.w> aVar, boolean z10, int i10) {
            super(2);
            this.f15270f = j10;
            this.f15271m = aVar;
            this.f15272p = z10;
            this.f15273q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            x0.e(this.f15270f, this.f15271m, this.f15272p, lVar, j0.z1.a(this.f15273q | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {708}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements pc.p<k1.l0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15274f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f15275m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f15276p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<z0.f, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.a<dc.w> f15277f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(pc.a<dc.w> aVar) {
                super(1);
                this.f15277f = aVar;
            }

            public final void a(long j10) {
                this.f15277f.invoke();
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(z0.f fVar) {
                a(fVar.x());
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(pc.a<dc.w> aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f15276p = aVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k1.l0 l0Var, Continuation<? super dc.w> continuation) {
            return ((h) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f15276p, continuation);
            hVar.f15275m = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15274f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k1.l0 l0Var = (k1.l0) this.f15275m;
                a aVar = new a(this.f15276p);
                this.f15274f = 1;
                if (u.z.j(l0Var, null, null, null, aVar, this, 7, null) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f15278f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f15279m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ModalBottomSheet.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.a<dc.w> f15280f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(pc.a<dc.w> aVar) {
                super(0);
                this.f15280f = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                this.f15280f.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, pc.a<dc.w> aVar) {
            super(1);
            this.f15278f = str;
            this.f15279m = aVar;
        }

        public final void a(t1.x xVar) {
            qc.q.i(xVar, "$this$semantics");
            t1.v.J(xVar, this.f15278f);
            t1.v.s(xVar, null, new a(this.f15279m), 1, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.l<z0, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final j f15281f = new j();

        j() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z0 z0Var) {
            qc.q.i(z0Var, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.a<y0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z0 f15282f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j2.e f15283m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ s.j<Float> f15284p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.l<z0, Boolean> f15285q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f15286r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(z0 z0Var, j2.e eVar, s.j<Float> jVar, pc.l<? super z0, Boolean> lVar, boolean z10) {
            super(0);
            this.f15282f = z0Var;
            this.f15283m = eVar;
            this.f15284p = jVar;
            this.f15285q = lVar;
            this.f15286r = z10;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final y0 invoke() {
            return x0.d(this.f15282f, this.f15283m, this.f15284p, this.f15285q, this.f15286r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1.b a(f0.e<?> eVar, u.o oVar) {
        return new a(eVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.b<z0> b(y0 y0Var, ad.k0 k0Var) {
        return new b(y0Var, k0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(pc.q<? super w.j, ? super j0.l, ? super java.lang.Integer, dc.w> r35, androidx.compose.ui.e r36, f0.y0 r37, boolean r38, a1.q4 r39, float r40, long r41, long r43, long r45, pc.p<? super j0.l, ? super java.lang.Integer, dc.w> r47, j0.l r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.x0.c(pc.q, androidx.compose.ui.e, f0.y0, boolean, a1.q4, float, long, long, long, pc.p, j0.l, int, int):void");
    }

    public static final y0 d(z0 z0Var, j2.e eVar, s.j<Float> jVar, pc.l<? super z0, Boolean> lVar, boolean z10) {
        qc.q.i(z0Var, "initialValue");
        qc.q.i(eVar, "density");
        qc.q.i(jVar, "animationSpec");
        qc.q.i(lVar, "confirmValueChange");
        y0 y0Var = new y0(z0Var, jVar, z10, lVar);
        y0Var.p(eVar);
        return y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(long j10, pc.a<dc.w> aVar, boolean z10, j0.l lVar, int i10) {
        int i11;
        boolean z11;
        float f10;
        androidx.compose.ui.e eVar;
        int i12;
        int i13;
        int i14;
        j0.l q10 = lVar.q(-526532668);
        if ((i10 & 14) == 0) {
            if (q10.j(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.l(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (q10.c(z10)) {
                i12 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-526532668, i11, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:694)");
            }
            if (j10 != a1.p1.f146b.e()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                g3<Float> d10 = s.c.d(f10, new s.h1(0, 0, null, 7, null), 0.0f, null, null, q10, 48, 28);
                String a10 = q1.a(p1.f14995a.b(), q10, 6);
                q10.e(1010559499);
                if (z10) {
                    e.a aVar2 = androidx.compose.ui.e.f2335a;
                    q10.e(1157296644);
                    boolean Q = q10.Q(aVar);
                    Object f11 = q10.f();
                    if (Q || f11 == j0.l.f18688a.a()) {
                        f11 = new h(aVar, null);
                        q10.J(f11);
                    }
                    q10.N();
                    androidx.compose.ui.e c10 = k1.u0.c(aVar2, aVar, (pc.p) f11);
                    q10.e(511388516);
                    boolean Q2 = q10.Q(a10) | q10.Q(aVar);
                    Object f12 = q10.f();
                    if (Q2 || f12 == j0.l.f18688a.a()) {
                        f12 = new i(a10, aVar);
                        q10.J(f12);
                    }
                    q10.N();
                    eVar = t1.o.b(c10, true, (pc.l) f12);
                } else {
                    eVar = androidx.compose.ui.e.f2335a;
                }
                q10.N();
                androidx.compose.ui.e a11 = androidx.compose.foundation.layout.m.f(androidx.compose.ui.e.f2335a, 0.0f, 1, null).a(eVar);
                a1.p1 g10 = a1.p1.g(j10);
                q10.e(511388516);
                boolean Q3 = q10.Q(g10) | q10.Q(d10);
                Object f13 = q10.f();
                if (Q3 || f13 == j0.l.f18688a.a()) {
                    f13 = new f(j10, d10);
                    q10.J(f13);
                }
                q10.N();
                t.i.a(a11, (pc.l) f13, q10, 0);
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new g(j10, aVar, z10, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(g3<Float> g3Var) {
        return g3Var.getValue().floatValue();
    }

    public static final y0 n(z0 z0Var, s.j<Float> jVar, pc.l<? super z0, Boolean> lVar, boolean z10, j0.l lVar2, int i10, int i11) {
        s.z0<Float> z0Var2;
        j jVar2;
        boolean z11;
        qc.q.i(z0Var, "initialValue");
        lVar2.e(-126412120);
        if ((i11 & 2) != 0) {
            z0Var2 = s1.f15070a.a();
        } else {
            z0Var2 = jVar;
        }
        if ((i11 & 4) != 0) {
            jVar2 = j.f15281f;
        } else {
            jVar2 = lVar;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if (j0.n.K()) {
            j0.n.V(-126412120, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:436)");
        }
        j2.e eVar = (j2.e) lVar2.C(androidx.compose.ui.platform.z0.e());
        lVar2.r(170051607, z0Var);
        y0 y0Var = (y0) s0.b.b(new Object[]{z0Var, z0Var2, Boolean.valueOf(z11), jVar2, eVar}, y0.f15289e.a(z0Var2, jVar2, z11, eVar), null, new k(z0Var, eVar, z0Var2, jVar2, z11), lVar2, 72, 4);
        lVar2.M();
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return y0Var;
    }
}
