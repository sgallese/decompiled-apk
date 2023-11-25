package j1;

import ad.k0;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import o1.g;
import o1.h;
import o1.i;
import o1.j;
import qc.q;
import qc.r;

/* compiled from: NestedScrollNode.kt */
/* loaded from: classes.dex */
public final class d extends e.c implements i, j1.b {
    private j1.b A;
    private j1.c B;
    private final g C;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollNode.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {105, 106}, m = "onPostFling-RZ2iAVY")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f18954f;

        /* renamed from: m  reason: collision with root package name */
        long f18955m;

        /* renamed from: p  reason: collision with root package name */
        long f18956p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f18957q;

        /* renamed from: s  reason: collision with root package name */
        int f18959s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18957q = obj;
            this.f18959s |= RecyclerView.UNDEFINED_DURATION;
            return d.this.H(0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollNode.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {98, 99}, m = "onPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f18960f;

        /* renamed from: m  reason: collision with root package name */
        long f18961m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f18962p;

        /* renamed from: r  reason: collision with root package name */
        int f18964r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18962p = obj;
            this.f18964r |= RecyclerView.UNDEFINED_DURATION;
            return d.this.A0(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.a<k0> {
        c() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return d.this.J1();
        }
    }

    public d(j1.b bVar, j1.c cVar) {
        q.i(bVar, "connection");
        this.A = bVar;
        this.B = cVar == null ? new j1.c() : cVar;
        this.C = j.b(dc.r.a(e.a(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 J1() {
        k0 h10;
        d L1 = L1();
        if ((L1 != null && (h10 = L1.J1()) != null) || (h10 = this.B.h()) != null) {
            return h10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final j1.b K1() {
        if (p1()) {
            return (j1.b) o(e.a());
        }
        return null;
    }

    private final d L1() {
        if (p1()) {
            return (d) o(e.a());
        }
        return null;
    }

    private final void M1() {
        if (this.B.f() == this) {
            this.B.j(null);
        }
    }

    private final void N1(j1.c cVar) {
        M1();
        if (cVar == null) {
            this.B = new j1.c();
        } else if (!q.d(cVar, this.B)) {
            this.B = cVar;
        }
        if (p1()) {
            O1();
        }
    }

    private final void O1() {
        this.B.j(this);
        this.B.i(new c());
        this.B.k(i1());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    @Override // j1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A0(long r9, kotlin.coroutines.Continuation<? super j2.v> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j1.d.b
            if (r0 == 0) goto L13
            r0 = r11
            j1.d$b r0 = (j1.d.b) r0
            int r1 = r0.f18964r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18964r = r1
            goto L18
        L13:
            j1.d$b r0 = new j1.d$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f18962p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f18964r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f18961m
            dc.n.b(r11)
            goto L7c
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f18961m
            java.lang.Object r2 = r0.f18960f
            j1.d r2 = (j1.d) r2
            dc.n.b(r11)
            goto L57
        L40:
            dc.n.b(r11)
            j1.b r11 = r8.K1()
            if (r11 == 0) goto L5e
            r0.f18960f = r8
            r0.f18961m = r9
            r0.f18964r = r4
            java.lang.Object r11 = r11.A0(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            j2.v r11 = (j2.v) r11
            long r4 = r11.o()
            goto L65
        L5e:
            j2.v$a r11 = j2.v.f19013b
            long r4 = r11.a()
            r2 = r8
        L65:
            r6 = r9
            r9 = r4
            r4 = r6
            j1.b r11 = r2.A
            long r4 = j2.v.k(r4, r9)
            r2 = 0
            r0.f18960f = r2
            r0.f18961m = r9
            r0.f18964r = r3
            java.lang.Object r11 = r11.A0(r4, r0)
            if (r11 != r1) goto L7c
            return r1
        L7c:
            j2.v r11 = (j2.v) r11
            long r0 = r11.o()
            long r9 = j2.v.l(r9, r0)
            j2.v r9 = j2.v.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.A0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // j1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(long r16, long r18, kotlin.coroutines.Continuation<? super j2.v> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof j1.d.a
            if (r2 == 0) goto L16
            r2 = r1
            j1.d$a r2 = (j1.d.a) r2
            int r3 = r2.f18959s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f18959s = r3
            goto L1b
        L16:
            j1.d$a r2 = new j1.d$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f18957q
            java.lang.Object r9 = ic.b.d()
            int r3 = r2.f18959s
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.f18955m
            dc.n.b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.f18956p
            long r5 = r2.f18955m
            java.lang.Object r7 = r2.f18954f
            j1.d r7 = (j1.d) r7
            dc.n.b(r1)
            r13 = r3
            r11 = r5
            goto L65
        L47:
            dc.n.b(r1)
            j1.b r3 = r0.A
            r2.f18954f = r0
            r11 = r16
            r2.f18955m = r11
            r13 = r18
            r2.f18956p = r13
            r2.f18959s = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.H(r4, r6, r8)
            if (r1 != r9) goto L64
            return r9
        L64:
            r7 = r0
        L65:
            j2.v r1 = (j2.v) r1
            long r4 = r1.o()
            j1.b r3 = r7.K1()
            if (r3 == 0) goto L94
            long r6 = j2.v.l(r11, r4)
            long r11 = j2.v.k(r13, r4)
            r1 = 0
            r2.f18954f = r1
            r2.f18955m = r4
            r2.f18959s = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.H(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            j2.v r1 = (j2.v) r1
            long r4 = r1.o()
            r13 = r2
            goto L9b
        L94:
            r13 = r4
            j2.v$a r1 = j2.v.f19013b
            long r4 = r1.a()
        L9b:
            long r1 = j2.v.l(r13, r4)
            j2.v r1 = j2.v.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.H(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void P1(j1.b bVar, j1.c cVar) {
        q.i(bVar, "connection");
        this.A = bVar;
        N1(cVar);
    }

    @Override // j1.b
    public long T0(long j10, long j11, int i10) {
        long c10;
        long T0 = this.A.T0(j10, j11, i10);
        j1.b K1 = K1();
        if (K1 != null) {
            c10 = K1.T0(z0.f.t(j10, T0), z0.f.s(j11, T0), i10);
        } else {
            c10 = z0.f.f26354b.c();
        }
        return z0.f.t(T0, c10);
    }

    @Override // o1.i
    public g l0() {
        return this.C;
    }

    @Override // o1.i, o1.l
    public /* synthetic */ Object o(o1.c cVar) {
        return h.a(this, cVar);
    }

    @Override // j1.b
    public long o0(long j10, int i10) {
        long c10;
        j1.b K1 = K1();
        if (K1 != null) {
            c10 = K1.o0(j10, i10);
        } else {
            c10 = z0.f.f26354b.c();
        }
        return z0.f.t(c10, this.A.o0(z0.f.s(j10, c10), i10));
    }

    @Override // androidx.compose.ui.e.c
    public void s1() {
        O1();
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        M1();
    }
}
