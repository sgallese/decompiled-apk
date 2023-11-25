package u;

import androidx.compose.ui.platform.g4;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k1.b0;
import k1.c0;
import k1.l0;
import k1.q0;
import kotlin.coroutines.Continuation;
import qc.f0;

/* compiled from: DragGestureDetector.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    private static final p f23837a = new a();

    /* renamed from: b */
    private static final p f23838b = new b();

    /* renamed from: c */
    private static final float f23839c;

    /* renamed from: d */
    private static final float f23840d;

    /* renamed from: e */
    private static final float f23841e;

    /* compiled from: DragGestureDetector.kt */
    /* loaded from: classes.dex */
    public static final class a implements p {
        a() {
        }

        @Override // u.p
        public float a(long j10) {
            return z0.f.p(j10);
        }

        @Override // u.p
        public float b(long j10) {
            return z0.f.o(j10);
        }

        @Override // u.p
        public long c(float f10, float f11) {
            return z0.g.a(f10, f11);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    /* loaded from: classes.dex */
    public static final class b implements p {
        b() {
        }

        @Override // u.p
        public float a(long j10) {
            return z0.f.o(j10);
        }

        @Override // u.p
        public float b(long j10) {
            return z0.f.p(j10);
        }

        @Override // u.p
        public long c(float f10, float f11) {
            return z0.g.a(f11, f10);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {876}, m = "awaitDragOrCancellation-rnUCldI")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f23842f;

        /* renamed from: m */
        Object f23843m;

        /* renamed from: p */
        /* synthetic */ Object f23844p;

        /* renamed from: q */
        int f23845q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23844p = obj;
            this.f23845q |= RecyclerView.UNDEFINED_DURATION;
            return h.b(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {808}, m = "awaitLongPressOrCancellation-rnUCldI")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f23846f;

        /* renamed from: m */
        Object f23847m;

        /* renamed from: p */
        /* synthetic */ Object f23848p;

        /* renamed from: q */
        int f23849q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23848p = obj;
            this.f23849q |= RecyclerView.UNDEFINED_DURATION;
            return h.c(null, 0L, this);
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {811, 828}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

        /* renamed from: m */
        Object f23850m;

        /* renamed from: p */
        int f23851p;

        /* renamed from: q */
        int f23852q;

        /* renamed from: r */
        private /* synthetic */ Object f23853r;

        /* renamed from: s */
        final /* synthetic */ f0<c0> f23854s;

        /* renamed from: t */
        final /* synthetic */ f0<c0> f23855t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f0<c0> f0Var, f0<c0> f0Var2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f23854s = f0Var;
            this.f23855t = f0Var2;
        }

        @Override // pc.p
        /* renamed from: a */
        public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
            return ((e) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f23854s, this.f23855t, continuation);
            eVar.f23853r = obj;
            return eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x00e3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:172:0x00ae A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v10, types: [T, k1.c0] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x00c3 -> B:132:0x00c5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u.h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {176, 890, 940, 193}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {
        final /* synthetic */ pc.l<z0.f, dc.w> A;
        final /* synthetic */ pc.p<c0, z0.f, dc.w> B;
        final /* synthetic */ pc.a<dc.w> C;
        final /* synthetic */ pc.a<dc.w> D;

        /* renamed from: m */
        Object f23856m;

        /* renamed from: p */
        Object f23857p;

        /* renamed from: q */
        Object f23858q;

        /* renamed from: r */
        Object f23859r;

        /* renamed from: s */
        Object f23860s;

        /* renamed from: t */
        Object f23861t;

        /* renamed from: u */
        int f23862u;

        /* renamed from: v */
        float f23863v;

        /* renamed from: w */
        float f23864w;

        /* renamed from: x */
        float f23865x;

        /* renamed from: y */
        int f23866y;

        /* renamed from: z */
        private /* synthetic */ Object f23867z;

        /* compiled from: DragGestureDetector.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<c0, dc.w> {

            /* renamed from: f */
            final /* synthetic */ pc.p<c0, z0.f, dc.w> f23868f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pc.p<? super c0, ? super z0.f, dc.w> pVar) {
                super(1);
                this.f23868f = pVar;
            }

            public final void a(c0 c0Var) {
                qc.q.i(c0Var, "it");
                this.f23868f.invoke(c0Var, z0.f.d(k1.s.g(c0Var)));
                c0Var.a();
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(c0 c0Var) {
                a(c0Var);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(pc.l<? super z0.f, dc.w> lVar, pc.p<? super c0, ? super z0.f, dc.w> pVar, pc.a<dc.w> aVar, pc.a<dc.w> aVar2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.A = lVar;
            this.B = pVar;
            this.C = aVar;
            this.D = aVar2;
        }

        @Override // pc.p
        /* renamed from: a */
        public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
            return ((f) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.A, this.B, this.C, this.D, continuation);
            fVar.f23867z = obj;
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:114:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0114 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x0257  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x02a1  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x014a A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x00dc -> B:168:0x0245). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0156 -> B:159:0x0202). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x0198 -> B:116:0x00f6). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x01f3 -> B:156:0x01f9). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0240 -> B:168:0x0245). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 690
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: u.h.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {235, 236, 241}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

        /* renamed from: m */
        int f23869m;

        /* renamed from: p */
        private /* synthetic */ Object f23870p;

        /* renamed from: q */
        final /* synthetic */ pc.l<z0.f, dc.w> f23871q;

        /* renamed from: r */
        final /* synthetic */ pc.a<dc.w> f23872r;

        /* renamed from: s */
        final /* synthetic */ pc.a<dc.w> f23873s;

        /* renamed from: t */
        final /* synthetic */ pc.p<c0, z0.f, dc.w> f23874t;

        /* compiled from: DragGestureDetector.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<c0, dc.w> {

            /* renamed from: f */
            final /* synthetic */ pc.p<c0, z0.f, dc.w> f23875f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pc.p<? super c0, ? super z0.f, dc.w> pVar) {
                super(1);
                this.f23875f = pVar;
            }

            public final void a(c0 c0Var) {
                qc.q.i(c0Var, "it");
                this.f23875f.invoke(c0Var, z0.f.d(k1.s.g(c0Var)));
                c0Var.a();
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(c0 c0Var) {
                a(c0Var);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(pc.l<? super z0.f, dc.w> lVar, pc.a<dc.w> aVar, pc.a<dc.w> aVar2, pc.p<? super c0, ? super z0.f, dc.w> pVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f23871q = lVar;
            this.f23872r = aVar;
            this.f23873s = aVar2;
            this.f23874t = pVar;
        }

        @Override // pc.p
        /* renamed from: a */
        public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
            return ((g) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f23871q, this.f23872r, this.f23873s, this.f23874t, continuation);
            gVar.f23870p = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x0062 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:59:0x0015, B:84:0x0086, B:86:0x008e, B:88:0x009d, B:90:0x00a9, B:91:0x00ac, B:92:0x00af, B:93:0x00b5, B:64:0x0025, B:78:0x005e, B:80:0x0062, B:67:0x002d, B:75:0x004d, B:72:0x0040), top: B:98:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x008e A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:59:0x0015, B:84:0x0086, B:86:0x008e, B:88:0x009d, B:90:0x00a9, B:91:0x00ac, B:92:0x00af, B:93:0x00b5, B:64:0x0025, B:78:0x005e, B:80:0x0062, B:67:0x002d, B:75:0x004d, B:72:0x0040), top: B:98:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x00b5 A[Catch: CancellationException -> 0x0031, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:59:0x0015, B:84:0x0086, B:86:0x008e, B:88:0x009d, B:90:0x00a9, B:91:0x00ac, B:92:0x00af, B:93:0x00b5, B:64:0x0025, B:78:0x005e, B:80:0x0062, B:67:0x002d, B:75:0x004d, B:72:0x0040), top: B:98:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r11.f23869m
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r11.f23870p
                k1.e r0 = (k1.e) r0
                dc.n.b(r12)     // Catch: java.util.concurrent.CancellationException -> L31
                goto L86
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                java.lang.Object r1 = r11.f23870p
                k1.e r1 = (k1.e) r1
                dc.n.b(r12)     // Catch: java.util.concurrent.CancellationException -> L31
                goto L5e
            L29:
                java.lang.Object r1 = r11.f23870p
                k1.e r1 = (k1.e) r1
                dc.n.b(r12)     // Catch: java.util.concurrent.CancellationException -> L31
                goto L4d
            L31:
                r12 = move-exception
                goto Lbd
            L34:
                dc.n.b(r12)
                java.lang.Object r12 = r11.f23870p
                r1 = r12
                k1.e r1 = (k1.e) r1
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r11.f23870p = r1     // Catch: java.util.concurrent.CancellationException -> L31
                r11.f23869m = r4     // Catch: java.util.concurrent.CancellationException -> L31
                r5 = r1
                r8 = r11
                java.lang.Object r12 = u.z.e(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L31
                if (r12 != r0) goto L4d
                return r0
            L4d:
                k1.c0 r12 = (k1.c0) r12     // Catch: java.util.concurrent.CancellationException -> L31
                long r4 = r12.f()     // Catch: java.util.concurrent.CancellationException -> L31
                r11.f23870p = r1     // Catch: java.util.concurrent.CancellationException -> L31
                r11.f23869m = r3     // Catch: java.util.concurrent.CancellationException -> L31
                java.lang.Object r12 = u.h.c(r1, r4, r11)     // Catch: java.util.concurrent.CancellationException -> L31
                if (r12 != r0) goto L5e
                return r0
            L5e:
                k1.c0 r12 = (k1.c0) r12     // Catch: java.util.concurrent.CancellationException -> L31
                if (r12 == 0) goto Lba
                pc.l<z0.f, dc.w> r3 = r11.f23871q     // Catch: java.util.concurrent.CancellationException -> L31
                long r4 = r12.g()     // Catch: java.util.concurrent.CancellationException -> L31
                z0.f r4 = z0.f.d(r4)     // Catch: java.util.concurrent.CancellationException -> L31
                r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L31
                long r3 = r12.f()     // Catch: java.util.concurrent.CancellationException -> L31
                u.h$g$a r12 = new u.h$g$a     // Catch: java.util.concurrent.CancellationException -> L31
                pc.p<k1.c0, z0.f, dc.w> r5 = r11.f23874t     // Catch: java.util.concurrent.CancellationException -> L31
                r12.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L31
                r11.f23870p = r1     // Catch: java.util.concurrent.CancellationException -> L31
                r11.f23869m = r2     // Catch: java.util.concurrent.CancellationException -> L31
                java.lang.Object r12 = u.h.f(r1, r3, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L31
                if (r12 != r0) goto L85
                return r0
            L85:
                r0 = r1
            L86:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L31
                boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L31
                if (r12 == 0) goto Lb5
                k1.r r12 = r0.E()     // Catch: java.util.concurrent.CancellationException -> L31
                java.util.List r12 = r12.c()     // Catch: java.util.concurrent.CancellationException -> L31
                int r0 = r12.size()     // Catch: java.util.concurrent.CancellationException -> L31
                r1 = 0
            L9b:
                if (r1 >= r0) goto Laf
                java.lang.Object r2 = r12.get(r1)     // Catch: java.util.concurrent.CancellationException -> L31
                k1.c0 r2 = (k1.c0) r2     // Catch: java.util.concurrent.CancellationException -> L31
                boolean r3 = k1.s.c(r2)     // Catch: java.util.concurrent.CancellationException -> L31
                if (r3 == 0) goto Lac
                r2.a()     // Catch: java.util.concurrent.CancellationException -> L31
            Lac:
                int r1 = r1 + 1
                goto L9b
            Laf:
                pc.a<dc.w> r12 = r11.f23872r     // Catch: java.util.concurrent.CancellationException -> L31
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L31
                goto Lba
            Lb5:
                pc.a<dc.w> r12 = r11.f23873s     // Catch: java.util.concurrent.CancellationException -> L31
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L31
            Lba:
                dc.w r12 = dc.w.f13270a
                return r12
            Lbd:
                pc.a<dc.w> r0 = r11.f23873s
                r0.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: u.h.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: DragGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {109}, m = "drag-jO51t88")
    /* renamed from: u.h$h */
    /* loaded from: classes.dex */
    public static final class C0556h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f23876f;

        /* renamed from: m */
        Object f23877m;

        /* renamed from: p */
        /* synthetic */ Object f23878p;

        /* renamed from: q */
        int f23879q;

        C0556h(Continuation<? super C0556h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23878p = obj;
            this.f23879q |= RecyclerView.UNDEFINED_DURATION;
            return h.f(null, 0L, null, this);
        }
    }

    static {
        float j10 = j2.h.j((float) 0.125d);
        f23839c = j10;
        float j11 = j2.h.j(18);
        f23840d = j11;
        f23841e = j10 / j11;
    }

    public static final /* synthetic */ boolean a(k1.r rVar, long j10) {
        return h(rVar, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00cb, code lost:
    
        if (k1.s.j(r11) != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0067 -> B:83:0x006c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k1.e r17, long r18, kotlin.coroutines.Continuation<? super k1.c0> r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.b(k1.e, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Object, k1.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(k1.e r9, long r10, kotlin.coroutines.Continuation<? super k1.c0> r12) {
        /*
            boolean r0 = r12 instanceof u.h.d
            if (r0 == 0) goto L13
            r0 = r12
            u.h$d r0 = (u.h.d) r0
            int r1 = r0.f23849q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23849q = r1
            goto L18
        L13:
            u.h$d r0 = new u.h$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f23848p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23849q
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f23847m
            qc.f0 r9 = (qc.f0) r9
            java.lang.Object r10 = r0.f23846f
            k1.c0 r10 = (k1.c0) r10
            dc.n.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L33
            goto La7
        L33:
            goto L9e
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            dc.n.b(r12)
            k1.r r12 = r9.E()
            boolean r12 = h(r12, r10)
            if (r12 == 0) goto L4b
            return r4
        L4b:
            k1.r r12 = r9.E()
            java.util.List r12 = r12.c()
            int r2 = r12.size()
            r5 = 0
        L58:
            if (r5 >= r2) goto L6f
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            k1.c0 r7 = (k1.c0) r7
            long r7 = r7.f()
            boolean r7 = k1.b0.d(r7, r10)
            if (r7 == 0) goto L6c
            goto L70
        L6c:
            int r5 = r5 + 1
            goto L58
        L6f:
            r6 = r4
        L70:
            r10 = r6
            k1.c0 r10 = (k1.c0) r10
            if (r10 != 0) goto L76
            return r4
        L76:
            qc.f0 r11 = new qc.f0
            r11.<init>()
            qc.f0 r12 = new qc.f0
            r12.<init>()
            r12.f21676f = r10
            androidx.compose.ui.platform.g4 r2 = r9.getViewConfiguration()
            long r5 = r2.c()
            u.h$e r2 = new u.h$e     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.f23846f = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.f23847m = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.f23849q = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            java.lang.Object r9 = r9.W(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            if (r9 != r1) goto La7
            return r1
        L9c:
            r9 = r11
        L9e:
            T r9 = r9.f21676f
            k1.c0 r9 = (k1.c0) r9
            if (r9 != 0) goto La6
            r4 = r10
            goto La7
        La6:
            r4 = r9
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.c(k1.e, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object d(l0 l0Var, pc.l<? super z0.f, dc.w> lVar, pc.a<dc.w> aVar, pc.a<dc.w> aVar2, pc.p<? super c0, ? super z0.f, dc.w> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object c10 = n.c(l0Var, new f(lVar, pVar, aVar2, aVar, null), continuation);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    public static final Object e(l0 l0Var, pc.l<? super z0.f, dc.w> lVar, pc.a<dc.w> aVar, pc.a<dc.w> aVar2, pc.p<? super c0, ? super z0.f, dc.w> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object c10 = n.c(l0Var, new g(lVar, aVar, aVar2, pVar, null), continuation);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0048 -> B:45:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(k1.e r4, long r5, pc.l<? super k1.c0, dc.w> r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof u.h.C0556h
            if (r0 == 0) goto L13
            r0 = r8
            u.h$h r0 = (u.h.C0556h) r0
            int r1 = r0.f23879q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23879q = r1
            goto L18
        L13:
            u.h$h r0 = new u.h$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23878p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23879q
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f23877m
            pc.l r4 = (pc.l) r4
            java.lang.Object r5 = r0.f23876f
            k1.e r5 = (k1.e) r5
            dc.n.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            dc.n.b(r8)
        L3e:
            r0.f23876f = r4
            r0.f23877m = r7
            r0.f23879q = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            k1.c0 r8 = (k1.c0) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L55:
            boolean r5 = k1.s.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.f()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.f(k1.e, long, pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final p g() {
        return f23837a;
    }

    public static final boolean h(k1.r rVar, long j10) {
        c0 c0Var;
        List<c0> c10 = rVar.c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                c0Var = c10.get(i10);
                if (b0.d(c0Var.f(), j10)) {
                    break;
                }
                i10++;
            } else {
                c0Var = null;
                break;
            }
        }
        c0 c0Var2 = c0Var;
        if (c0Var2 != null && c0Var2.h()) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float i(g4 g4Var, int i10) {
        qc.q.i(g4Var, "$this$pointerSlop");
        if (q0.g(i10, q0.f19226a.b())) {
            return g4Var.e() * f23841e;
        }
        return g4Var.e();
    }

    public static final p j(o oVar) {
        qc.q.i(oVar, "<this>");
        if (oVar == o.Vertical) {
            return f23838b;
        }
        return f23837a;
    }
}
