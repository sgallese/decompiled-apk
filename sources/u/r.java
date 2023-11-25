package u;

import androidx.recyclerview.widget.RecyclerView;
import jd.a;
import kotlin.coroutines.Continuation;

/* compiled from: TapGestureDetector.kt */
/* loaded from: classes.dex */
final class r implements q, j2.e {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ j2.e f23966f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f23967m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f23968p;

    /* renamed from: q  reason: collision with root package name */
    private final jd.a f23969q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {357}, m = "reset")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23970f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f23971m;

        /* renamed from: q  reason: collision with root package name */
        int f23973q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23971m = obj;
            this.f23973q |= RecyclerView.UNDEFINED_DURATION;
            return r.this.g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {370}, m = "tryAwaitRelease")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23974f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f23975m;

        /* renamed from: q  reason: collision with root package name */
        int f23977q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23975m = obj;
            this.f23977q |= RecyclerView.UNDEFINED_DURATION;
            return r.this.P0(this);
        }
    }

    public r(j2.e eVar) {
        qc.q.i(eVar, "density");
        this.f23966f = eVar;
        this.f23969q = jd.c.a(false);
    }

    @Override // j2.e
    public long K(long j10) {
        return this.f23966f.K(j10);
    }

    @Override // j2.e
    public int K0(float f10) {
        return this.f23966f.K0(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // u.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P0(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof u.r.b
            if (r0 == 0) goto L13
            r0 = r6
            u.r$b r0 = (u.r.b) r0
            int r1 = r0.f23977q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23977q = r1
            goto L18
        L13:
            u.r$b r0 = new u.r$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23975m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23977q
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f23974f
            u.r r0 = (u.r) r0
            dc.n.b(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            dc.n.b(r6)
            boolean r6 = r5.f23967m
            if (r6 != 0) goto L55
            boolean r6 = r5.f23968p
            if (r6 != 0) goto L55
            jd.a r6 = r5.f23969q
            r0.f23974f = r5
            r0.f23977q = r4
            java.lang.Object r6 = jd.a.C0427a.a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            jd.a r6 = r0.f23969q
            jd.a.C0427a.c(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.f23967m
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.r.P0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // j2.e
    public long S0(long j10) {
        return this.f23966f.S0(j10);
    }

    @Override // j2.e
    public float T(long j10) {
        return this.f23966f.T(j10);
    }

    @Override // j2.e
    public float W0(long j10) {
        return this.f23966f.W0(j10);
    }

    @Override // j2.e
    public long c0(float f10) {
        return this.f23966f.c0(f10);
    }

    public final void d() {
        this.f23968p = true;
        a.C0427a.c(this.f23969q, null, 1, null);
    }

    public final void f() {
        this.f23967m = true;
        a.C0427a.c(this.f23969q, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation<? super dc.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u.r.a
            if (r0 == 0) goto L13
            r0 = r5
            u.r$a r0 = (u.r.a) r0
            int r1 = r0.f23973q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23973q = r1
            goto L18
        L13:
            u.r$a r0 = new u.r$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f23971m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23973q
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f23970f
            u.r r0 = (u.r) r0
            dc.n.b(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            jd.a r5 = r4.f23969q
            r0.f23970f = r4
            r0.f23973q = r3
            r2 = 0
            java.lang.Object r5 = jd.a.C0427a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.f23967m = r5
            r0.f23968p = r5
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.r.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // j2.e
    public float getDensity() {
        return this.f23966f.getDensity();
    }

    @Override // j2.e
    public float h0(int i10) {
        return this.f23966f.h0(i10);
    }

    @Override // j2.e
    public float j0(float f10) {
        return this.f23966f.j0(f10);
    }

    @Override // j2.e
    public float p0() {
        return this.f23966f.p0();
    }

    @Override // j2.e
    public float v0(float f10) {
        return this.f23966f.v0(f10);
    }
}
