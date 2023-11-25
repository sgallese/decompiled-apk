package k1;

import ad.x1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.g4;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import p1.n1;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public final class w0 extends e.c implements v0, l0, j2.e {
    private pc.p<? super l0, ? super Continuation<? super dc.w>, ? extends Object> A;
    private x1 B;
    private r C;
    private final k0.f<a<?>> D;
    private final k0.f<a<?>> E;
    private r F;
    private long G;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SuspendingPointerInputFilter.kt */
    /* loaded from: classes.dex */
    public final class a<R> implements e, j2.e, Continuation<R> {

        /* renamed from: f  reason: collision with root package name */
        private final Continuation<R> f19253f;

        /* renamed from: m  reason: collision with root package name */
        private final /* synthetic */ w0 f19254m;

        /* renamed from: p  reason: collision with root package name */
        private ad.m<? super r> f19255p;

        /* renamed from: q  reason: collision with root package name */
        private t f19256q;

        /* renamed from: r  reason: collision with root package name */
        private final hc.f f19257r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ w0 f19258s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {728}, m = "withTimeout")
        /* renamed from: k1.w0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0432a<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            Object f19259f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f19260m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ a<R> f19261p;

            /* renamed from: q  reason: collision with root package name */
            int f19262q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0432a(a<R> aVar, Continuation<? super C0432a> continuation) {
                super(continuation);
                this.f19261p = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f19260m = obj;
                this.f19262q |= RecyclerView.UNDEFINED_DURATION;
                return this.f19261p.W(0L, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {720, 721}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f19263f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ long f19264m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ a<R> f19265p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10, a<R> aVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f19264m = j10;
                this.f19265p = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new b(this.f19264m, this.f19265p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = ic.b.d()
                    int r1 = r8.f19263f
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    dc.n.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    dc.n.b(r9)
                    goto L2f
                L20:
                    dc.n.b(r9)
                    long r6 = r8.f19264m
                    long r6 = r6 - r2
                    r8.f19263f = r5
                    java.lang.Object r9 = ad.u0.a(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.f19263f = r4
                    java.lang.Object r9 = ad.u0.a(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    k1.w0$a<R> r9 = r8.f19265p
                    ad.m r9 = k1.w0.a.g(r9)
                    if (r9 == 0) goto L54
                    dc.m$a r0 = dc.m.f13253f
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f19264m
                    r0.<init>(r1)
                    java.lang.Object r0 = dc.n.a(r0)
                    java.lang.Object r0 = dc.m.a(r0)
                    r9.resumeWith(r0)
                L54:
                    dc.w r9 = dc.w.f13270a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: k1.w0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendingPointerInputFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {699}, m = "withTimeoutOrNull")
        /* loaded from: classes.dex */
        public static final class c<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f19266f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ a<R> f19267m;

            /* renamed from: p  reason: collision with root package name */
            int f19268p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, Continuation<? super c> continuation) {
                super(continuation);
                this.f19267m = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f19266f = obj;
                this.f19268p |= RecyclerView.UNDEFINED_DURATION;
                return this.f19267m.N(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(w0 w0Var, Continuation<? super R> continuation) {
            qc.q.i(continuation, "completion");
            this.f19258s = w0Var;
            this.f19253f = continuation;
            this.f19254m = w0Var;
            this.f19256q = t.Main;
            this.f19257r = hc.g.f16601f;
        }

        @Override // k1.e
        public long B0() {
            return this.f19258s.B0();
        }

        @Override // k1.e
        public r E() {
            return this.f19258s.C;
        }

        @Override // j2.e
        public long K(long j10) {
            return this.f19254m.K(j10);
        }

        @Override // j2.e
        public int K0(float f10) {
            return this.f19254m.K0(f10);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        @Override // k1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object N(long r5, pc.p<? super k1.e, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof k1.w0.a.c
                if (r0 == 0) goto L13
                r0 = r8
                k1.w0$a$c r0 = (k1.w0.a.c) r0
                int r1 = r0.f19268p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19268p = r1
                goto L18
            L13:
                k1.w0$a$c r0 = new k1.w0$a$c
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f19266f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f19268p
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                dc.n.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                dc.n.b(r8)
                r0.f19268p = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.W(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.w0.a.N(long, pc.p, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // j2.e
        public long S0(long j10) {
            return this.f19254m.S0(j10);
        }

        @Override // j2.e
        public float T(long j10) {
            return this.f19254m.T(j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [ad.x1] */
        /* JADX WARN: Type inference failed for: r11v3, types: [ad.x1] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // k1.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object W(long r11, pc.p<? super k1.e, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r13, kotlin.coroutines.Continuation<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof k1.w0.a.C0432a
                if (r0 == 0) goto L13
                r0 = r14
                k1.w0$a$a r0 = (k1.w0.a.C0432a) r0
                int r1 = r0.f19262q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19262q = r1
                goto L18
            L13:
                k1.w0$a$a r0 = new k1.w0$a$a
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.f19260m
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f19262q
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.f19259f
                ad.x1 r11 = (ad.x1) r11
                dc.n.b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                dc.n.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                ad.m<? super k1.r> r14 = r10.f19255p
                if (r14 == 0) goto L56
                dc.m$a r2 = dc.m.f13253f
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = dc.n.a(r2)
                java.lang.Object r2 = dc.m.a(r2)
                r14.resumeWith(r2)
            L56:
                k1.w0 r14 = r10.f19258s
                ad.k0 r4 = r14.i1()
                r5 = 0
                r6 = 0
                k1.w0$a$b r7 = new k1.w0$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                ad.x1 r11 = ad.g.d(r4, r5, r6, r7, r8, r9)
                r0.f19259f = r11     // Catch: java.lang.Throwable -> L2d
                r0.f19262q = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                k1.f r12 = k1.f.f19172f
                r11.c(r12)
                return r14
            L7b:
                k1.f r13 = k1.f.f19172f
                r11.c(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.w0.a.W(long, pc.p, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // j2.e
        public float W0(long j10) {
            return this.f19254m.W0(j10);
        }

        @Override // k1.e
        public Object X(t tVar, Continuation<? super r> continuation) {
            Continuation c10;
            Object d10;
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            this.f19256q = tVar;
            this.f19255p = nVar;
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return x10;
        }

        @Override // k1.e
        public long a() {
            return this.f19258s.G;
        }

        @Override // j2.e
        public long c0(float f10) {
            return this.f19254m.c0(f10);
        }

        @Override // kotlin.coroutines.Continuation
        public hc.f getContext() {
            return this.f19257r;
        }

        @Override // j2.e
        public float getDensity() {
            return this.f19254m.getDensity();
        }

        @Override // k1.e
        public g4 getViewConfiguration() {
            return this.f19258s.getViewConfiguration();
        }

        @Override // j2.e
        public float h0(int i10) {
            return this.f19254m.h0(i10);
        }

        @Override // j2.e
        public float j0(float f10) {
            return this.f19254m.j0(f10);
        }

        @Override // j2.e
        public float p0() {
            return this.f19254m.p0();
        }

        public final void r(Throwable th) {
            ad.m<? super r> mVar = this.f19255p;
            if (mVar != null) {
                mVar.o(th);
            }
            this.f19255p = null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            k0.f fVar = this.f19258s.D;
            w0 w0Var = this.f19258s;
            synchronized (fVar) {
                w0Var.D.v(this);
                dc.w wVar = dc.w.f13270a;
            }
            this.f19253f.resumeWith(obj);
        }

        public final void s(r rVar, t tVar) {
            ad.m<? super r> mVar;
            qc.q.i(rVar, "event");
            qc.q.i(tVar, "pass");
            if (tVar == this.f19256q && (mVar = this.f19255p) != null) {
                this.f19255p = null;
                mVar.resumeWith(dc.m.a(rVar));
            }
        }

        @Override // j2.e
        public float v0(float f10) {
            return this.f19254m.v0(f10);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19269a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19269a = iArr;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a<R> f19270f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f19270f = aVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f19270f.r(th);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {562}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f19271f;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f19271f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                pc.p<l0, Continuation<? super dc.w>, Object> M1 = w0.this.M1();
                w0 w0Var = w0.this;
                this.f19271f = 1;
                if (M1.invoke(w0Var, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public w0(pc.p<? super l0, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        qc.q.i(pVar, "pointerInputHandler");
        this.A = pVar;
        this.C = u0.b();
        this.D = new k0.f<>(new a[16], 0);
        this.E = new k0.f<>(new a[16], 0);
        this.G = j2.p.f19001b.a();
    }

    private final void L1(r rVar, t tVar) {
        k0.f<a<?>> fVar;
        int o10;
        synchronized (this.D) {
            k0.f<a<?>> fVar2 = this.E;
            fVar2.f(fVar2.o(), this.D);
        }
        try {
            int i10 = b.f19269a[tVar.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3 && (o10 = (fVar = this.E).o()) > 0) {
                    int i11 = o10 - 1;
                    a<?>[] n10 = fVar.n();
                    do {
                        n10[i11].s(rVar, tVar);
                        i11--;
                    } while (i11 >= 0);
                }
            } else {
                k0.f<a<?>> fVar3 = this.E;
                int o11 = fVar3.o();
                if (o11 > 0) {
                    a<?>[] n11 = fVar3.n();
                    int i12 = 0;
                    do {
                        n11[i12].s(rVar, tVar);
                        i12++;
                    } while (i12 < o11);
                }
            }
        } finally {
            this.E.i();
        }
    }

    public long B0() {
        long S0 = S0(getViewConfiguration().d());
        long a10 = a();
        return z0.m.a(Math.max(0.0f, z0.l.i(S0) - j2.p.g(a10)) / 2.0f, Math.max(0.0f, z0.l.g(S0) - j2.p.f(a10)) / 2.0f);
    }

    @Override // j2.e
    public /* synthetic */ long K(long j10) {
        return j2.d.e(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ int K0(float f10) {
        return j2.d.a(this, f10);
    }

    public pc.p<l0, Continuation<? super dc.w>, Object> M1() {
        return this.A;
    }

    public void N1(pc.p<? super l0, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        qc.q.i(pVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        e1();
        this.A = pVar;
    }

    @Override // p1.o1
    public void O(r rVar, t tVar, long j10) {
        x1 d10;
        qc.q.i(rVar, "pointerEvent");
        qc.q.i(tVar, "pass");
        this.G = j10;
        if (tVar == t.Initial) {
            this.C = rVar;
        }
        if (this.B == null) {
            d10 = ad.i.d(i1(), null, ad.m0.UNDISPATCHED, new d(null), 1, null);
            this.B = d10;
        }
        L1(rVar, tVar);
        List<c0> c10 = rVar.c();
        int size = c10.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (!s.d(c10.get(i10))) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if ((!z10) == false) {
            rVar = null;
        }
        this.F = rVar;
    }

    @Override // p1.o1
    public /* synthetic */ boolean Q0() {
        return n1.d(this);
    }

    @Override // j2.e
    public /* synthetic */ long S0(long j10) {
        return j2.d.h(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float T(long j10) {
        return j2.d.b(this, j10);
    }

    @Override // p1.o1
    public void U0() {
        e1();
    }

    @Override // k1.l0
    public <R> Object V0(pc.p<? super e, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super R> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        a aVar = new a(this, nVar);
        synchronized (this.D) {
            this.D.d(aVar);
            Continuation<dc.w> a10 = hc.e.a(pVar, aVar, aVar);
            m.a aVar2 = dc.m.f13253f;
            a10.resumeWith(dc.m.a(dc.w.f13270a));
        }
        nVar.n(new c(aVar));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    @Override // j2.e
    public /* synthetic */ float W0(long j10) {
        return j2.d.f(this, j10);
    }

    @Override // k1.l0
    public long a() {
        return this.G;
    }

    @Override // p1.o1
    public void a0() {
        boolean z10;
        r rVar = this.F;
        if (rVar == null) {
            return;
        }
        List<c0> c10 = rVar.c();
        int size = c10.size();
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= size) {
                break;
            } else if (!(true ^ c10.get(i10).h())) {
                z10 = false;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            return;
        }
        List<c0> c11 = rVar.c();
        ArrayList arrayList = new ArrayList(c11.size());
        int size2 = c11.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c0 c0Var = c11.get(i11);
            long f10 = c0Var.f();
            long g10 = c0Var.g();
            boolean z11 = false;
            arrayList.add(new c0(f10, c0Var.n(), g10, z11, c0Var.i(), c0Var.n(), c0Var.g(), c0Var.h(), c0Var.h(), 0, 0L, 1536, (qc.h) null));
        }
        r rVar2 = new r(arrayList);
        this.C = rVar2;
        L1(rVar2, t.Initial);
        L1(rVar2, t.Main);
        L1(rVar2, t.Final);
        this.F = null;
    }

    @Override // j2.e
    public /* synthetic */ long c0(float f10) {
        return j2.d.i(this, f10);
    }

    @Override // k1.v0
    public void e1() {
        x1 x1Var = this.B;
        if (x1Var != null) {
            x1Var.c(new k0());
            this.B = null;
        }
    }

    @Override // p1.o1
    public /* synthetic */ boolean g0() {
        return n1.a(this);
    }

    @Override // j2.e
    public float getDensity() {
        return p1.k.k(this).I().getDensity();
    }

    public g4 getViewConfiguration() {
        return p1.k.k(this).p0();
    }

    @Override // j2.e
    public /* synthetic */ float h0(int i10) {
        return j2.d.d(this, i10);
    }

    @Override // j2.e
    public /* synthetic */ float j0(float f10) {
        return j2.d.c(this, f10);
    }

    @Override // p1.o1
    public void m0() {
        e1();
    }

    @Override // j2.e
    public float p0() {
        return p1.k.k(this).I().p0();
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        e1();
        super.t1();
    }

    @Override // j2.e
    public /* synthetic */ float v0(float f10) {
        return j2.d.g(this, f10);
    }
}
