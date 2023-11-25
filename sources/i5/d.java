package i5;

import ad.i;
import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import cd.r;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import p5.f;
import pc.p;
import qc.q;
import r5.g;

/* compiled from: Timeline.kt */
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: e  reason: collision with root package name */
    private long f16986e;

    /* renamed from: c  reason: collision with root package name */
    private final cd.d<i5.c> f16984c = cd.g.b(Integer.MAX_VALUE, null, null, 6, null);

    /* renamed from: d  reason: collision with root package name */
    private long f16985d = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f16987f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Timeline.kt */
    @f(c = "com.amplitude.android.Timeline", f = "Timeline.kt", l = {51, 53, 54, 60, 62, 91}, m = "processEventMessage")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f16988f;

        /* renamed from: m  reason: collision with root package name */
        Object f16989m;

        /* renamed from: p  reason: collision with root package name */
        Object f16990p;

        /* renamed from: q  reason: collision with root package name */
        int f16991q;

        /* renamed from: r  reason: collision with root package name */
        long f16992r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f16993s;

        /* renamed from: u  reason: collision with root package name */
        int f16995u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16993s = obj;
            this.f16995u |= RecyclerView.UNDEFINED_DURATION;
            return d.this.r(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Timeline.kt */
    @f(c = "com.amplitude.android.Timeline$start$1", f = "Timeline.kt", l = {18, 24, 25}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f16996f;

        /* renamed from: m  reason: collision with root package name */
        int f16997m;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cf -> B:29:0x00a5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r9.f16997m
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L31
                if (r1 == r4) goto L2d
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.f16996f
                cd.f r1 = (cd.f) r1
                dc.n.b(r10)
                r10 = r1
                goto La4
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f16996f
                cd.f r1 = (cd.f) r1
                dc.n.b(r10)
                r4 = r9
                goto Lb4
            L2d:
                dc.n.b(r10)
                goto L47
            L31:
                dc.n.b(r10)
                i5.d r10 = i5.d.this
                p5.a r10 = r10.e()
                ad.r0 r10 = r10.u()
                r9.f16997m = r4
                java.lang.Object r10 = r10.E(r9)
                if (r10 != r0) goto L47
                return r0
            L47:
                i5.d r10 = i5.d.this
                p5.a r1 = r10.e()
                p5.f r1 = r1.m()
                p5.f$a r4 = p5.f.a.PREVIOUS_SESSION_ID
                java.lang.String r1 = r1.f(r4)
                r4 = -1
                if (r1 != 0) goto L5d
                r6 = r4
                goto L61
            L5d:
                long r6 = java.lang.Long.parseLong(r1)
            L61:
                i5.d.j(r10, r6)
                i5.d r10 = i5.d.this
                p5.a r1 = r10.e()
                p5.f r1 = r1.m()
                p5.f$a r6 = p5.f.a.LAST_EVENT_ID
                java.lang.String r1 = r1.f(r6)
                if (r1 != 0) goto L79
                r6 = 0
                goto L7d
            L79:
                long r6 = java.lang.Long.parseLong(r1)
            L7d:
                r10.t(r6)
                i5.d r10 = i5.d.this
                p5.a r1 = r10.e()
                p5.f r1 = r1.m()
                p5.f$a r6 = p5.f.a.LAST_EVENT_TIME
                java.lang.String r1 = r1.f(r6)
                if (r1 != 0) goto L93
                goto L97
            L93:
                long r4 = java.lang.Long.parseLong(r1)
            L97:
                r10.u(r4)
                i5.d r10 = i5.d.this
                cd.d r10 = i5.d.h(r10)
                cd.f r10 = r10.iterator()
            La4:
                r1 = r9
            La5:
                r1.f16996f = r10
                r1.f16997m = r3
                java.lang.Object r4 = r10.a(r1)
                if (r4 != r0) goto Lb0
                return r0
            Lb0:
                r8 = r1
                r1 = r10
                r10 = r4
                r4 = r8
            Lb4:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Ld2
                java.lang.Object r10 = r1.next()
                i5.c r10 = (i5.c) r10
                i5.d r5 = i5.d.this
                r4.f16996f = r1
                r4.f16997m = r2
                java.lang.Object r10 = i5.d.i(r5, r10, r4)
                if (r10 != r0) goto Lcf
                return r0
            Lcf:
                r10 = r1
                r1 = r4
                goto La5
            Ld2:
                dc.w r10 = dc.w.f13270a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Timeline.kt */
    @f(c = "com.amplitude.android.Timeline", f = "Timeline.kt", l = {132, 133}, m = "startNewSession")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f16999f;

        /* renamed from: m  reason: collision with root package name */
        Object f17000m;

        /* renamed from: p  reason: collision with root package name */
        long f17001p;

        /* renamed from: q  reason: collision with root package name */
        boolean f17002q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f17003r;

        /* renamed from: t  reason: collision with root package name */
        int f17005t;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17003r = obj;
            this.f17005t |= RecyclerView.UNDEFINED_DURATION;
            return d.this.x(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Timeline.kt */
    @f(c = "com.amplitude.android.Timeline", f = "Timeline.kt", l = {107, 110}, m = "startNewSessionIfNeeded")
    /* renamed from: i5.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0399d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f17006f;

        /* renamed from: p  reason: collision with root package name */
        int f17008p;

        C0399d(Continuation<? super C0399d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17006f = obj;
            this.f17008p |= RecyclerView.UNDEFINED_DURATION;
            return d.this.y(0L, this);
        }
    }

    private final boolean p() {
        if (this.f16985d >= 0) {
            return true;
        }
        return false;
    }

    private final boolean q(long j10) {
        if (j10 - this.f16987f < ((i5.b) e().h()).v()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(i5.c r19, kotlin.coroutines.Continuation<? super dc.w> r20) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.d.r(i5.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object s(long j10, Continuation<? super w> continuation) {
        Object d10;
        if (!p()) {
            return w.f13270a;
        }
        u(j10);
        Object k10 = e().m().k(f.a.LAST_EVENT_TIME, String.valueOf(n()), continuation);
        d10 = ic.d.d();
        if (k10 == d10) {
            return k10;
        }
        return w.f13270a;
    }

    private final Object v(long j10, Continuation<? super w> continuation) {
        Object d10;
        this.f16985d = j10;
        Object k10 = e().m().k(f.a.PREVIOUS_SESSION_ID, String.valueOf(o()), continuation);
        d10 = ic.d.d();
        if (k10 == d10) {
            return k10;
        }
        return w.f13270a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(long r18, kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends q5.a>> r20) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.d.x(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(long r6, kotlin.coroutines.Continuation<? super java.lang.Iterable<? extends q5.a>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof i5.d.C0399d
            if (r0 == 0) goto L13
            r0 = r8
            i5.d$d r0 = (i5.d.C0399d) r0
            int r1 = r0.f17008p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17008p = r1
            goto L18
        L13:
            i5.d$d r0 = new i5.d$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17006f
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f17008p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dc.n.b(r8)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            dc.n.b(r8)
            goto L50
        L38:
            dc.n.b(r8)
            boolean r8 = r5.p()
            if (r8 == 0) goto L52
            boolean r8 = r5.q(r6)
            if (r8 == 0) goto L52
            r0.f17008p = r4
            java.lang.Object r6 = r5.s(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r6 = 0
            return r6
        L52:
            r0.f17008p = r3
            java.lang.Object r8 = r5.x(r6, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.d.y(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // r5.g
    public void f(q5.a aVar) {
        q.i(aVar, "incomingEvent");
        if (aVar.L() == null) {
            aVar.z0(Long.valueOf(System.currentTimeMillis()));
        }
        this.f16984c.p(new i5.c(aVar, ((i5.a) e()).J()));
    }

    public final long m() {
        return this.f16986e;
    }

    public final long n() {
        return this.f16987f;
    }

    public final long o() {
        return this.f16985d;
    }

    public final void t(long j10) {
        this.f16986e = j10;
    }

    public final void u(long j10) {
        this.f16987f = j10;
    }

    public final void w() {
        i.d(e().g(), e().n(), null, new b(null), 2, null);
    }

    public final void z() {
        r.a.a(this.f16984c, null, 1, null);
    }
}
