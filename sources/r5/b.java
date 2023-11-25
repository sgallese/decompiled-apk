package r5;

import ad.k0;
import ad.x1;
import cd.r;
import dc.n;
import dc.w;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;
import t5.j;

/* compiled from: EventPipeline.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final a f22149i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final p5.a f22150a;

    /* renamed from: b  reason: collision with root package name */
    private final cd.d<h> f22151b;

    /* renamed from: c  reason: collision with root package name */
    private final cd.d<String> f22152c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f22153d;

    /* renamed from: e  reason: collision with root package name */
    private final j f22154e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22155f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22156g;

    /* renamed from: h  reason: collision with root package name */
    private AtomicInteger f22157h;

    /* compiled from: EventPipeline.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: EventPipeline.kt */
    /* renamed from: r5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0499b extends Thread {
        C0499b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventPipeline.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.platform.EventPipeline$schedule$1", f = "EventPipeline.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f22159f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f22160m;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.f22160m = obj;
            return cVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:18:0x0051). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r5.f22159f
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r5.f22160m
                ad.k0 r1 = (ad.k0) r1
                dc.n.b(r6)
                r6 = r5
                goto L51
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                dc.n.b(r6)
                java.lang.Object r6 = r5.f22160m
                ad.k0 r6 = (ad.k0) r6
                r1 = r6
                r6 = r5
            L25:
                boolean r3 = ad.l0.g(r1)
                if (r3 == 0) goto L5d
                r5.b r3 = r5.b.this
                boolean r3 = r3.o()
                if (r3 == 0) goto L5d
                r5.b r3 = r5.b.this
                boolean r3 = r3.p()
                if (r3 != 0) goto L5d
                r5.b r3 = r5.b.this
                r5.b.k(r3, r2)
                r5.b r3 = r5.b.this
                long r3 = r5.b.d(r3)
                r6.f22160m = r1
                r6.f22159f = r2
                java.lang.Object r3 = ad.u0.a(r3, r6)
                if (r3 != r0) goto L51
                return r0
            L51:
                r5.b r3 = r5.b.this
                r3.l()
                r5.b r3 = r5.b.this
                r4 = 0
                r5.b.k(r3, r4)
                goto L25
            L5d:
                dc.w r6 = dc.w.f13270a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventPipeline.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.platform.EventPipeline$upload$1", f = "EventPipeline.kt", l = {187, 100, 113}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f22162f;

        /* renamed from: m  reason: collision with root package name */
        Object f22163m;

        /* renamed from: p  reason: collision with root package name */
        Object f22164p;

        /* renamed from: q  reason: collision with root package name */
        Object f22165q;

        /* renamed from: r  reason: collision with root package name */
        Object f22166r;

        /* renamed from: s  reason: collision with root package name */
        int f22167s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EventPipeline.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.platform.EventPipeline$upload$1$1$1", f = "EventPipeline.kt", l = {102}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f22169f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b f22170m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f22170m = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f22170m, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f22169f;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        n.b(obj);
                        p5.f r10 = this.f22170m.r();
                        this.f22169f = 1;
                        if (r10.g(this) == d10) {
                            return d10;
                        }
                    }
                    return w.f13270a;
                } catch (FileNotFoundException e10) {
                    String message = e10.getMessage();
                    if (message == null) {
                        return null;
                    }
                    this.f22170m.f22150a.j().d(q.q("Event storage file not found: ", message));
                    return w.f13270a;
                }
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((d) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[Catch: all -> 0x0192, TryCatch #2 {all -> 0x0192, blocks: (B:8:0x0026, B:24:0x0088, B:28:0x00a0, B:30:0x00a8, B:33:0x00ca, B:70:0x018a, B:17:0x005f, B:20:0x0071, B:23:0x0083), top: B:79:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00df A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:42:0x00fc, B:35:0x00d9, B:37:0x00df, B:38:0x00e3, B:58:0x014b, B:61:0x0152, B:62:0x0165, B:65:0x016d, B:48:0x010b, B:52:0x0120, B:51:0x011a), top: B:79:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x010b A[Catch: Exception -> 0x0147, FileNotFoundException -> 0x0149, all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:42:0x00fc, B:35:0x00d9, B:37:0x00df, B:38:0x00e3, B:58:0x014b, B:61:0x0152, B:62:0x0165, B:65:0x016d, B:48:0x010b, B:52:0x0120, B:51:0x011a), top: B:79:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0152 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:42:0x00fc, B:35:0x00d9, B:37:0x00df, B:38:0x00e3, B:58:0x014b, B:61:0x0152, B:62:0x0165, B:65:0x016d, B:48:0x010b, B:52:0x0120, B:51:0x011a), top: B:79:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x016d A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:42:0x00fc, B:35:0x00d9, B:37:0x00df, B:38:0x00e3, B:58:0x014b, B:61:0x0152, B:62:0x0165, B:65:0x016d, B:48:0x010b, B:52:0x0120, B:51:0x011a), top: B:79:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x018a A[Catch: all -> 0x0192, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0192, blocks: (B:8:0x0026, B:24:0x0088, B:28:0x00a0, B:30:0x00a8, B:33:0x00ca, B:70:0x018a, B:17:0x005f, B:20:0x0071, B:23:0x0083), top: B:79:0x000c }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d6 -> B:35:0x00d9). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fa -> B:86:0x00fc). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 411
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventPipeline.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.platform.EventPipeline$write$1", f = "EventPipeline.kt", l = {76, 80}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f22171f;

        /* renamed from: m  reason: collision with root package name */
        int f22172m;

        /* renamed from: p  reason: collision with root package name */
        int f22173p;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0068 -> B:31:0x0087). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006e -> B:31:0x0087). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0084 -> B:31:0x0087). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008e -> B:31:0x0087). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0091 -> B:31:0x0087). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r10.f22173p
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L33
                if (r1 == r4) goto L29
                if (r1 != r3) goto L21
                int r1 = r10.f22172m
                java.lang.Object r5 = r10.f22171f
                cd.f r5 = (cd.f) r5
                dc.n.b(r11)     // Catch: java.lang.Exception -> L1c
                r6 = r1
                r1 = r10
                goto L87
            L1c:
                r11 = move-exception
                r6 = r1
                r1 = r10
                goto L8a
            L21:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L29:
                java.lang.Object r1 = r10.f22171f
                cd.f r1 = (cd.f) r1
                dc.n.b(r11)
                r5 = r1
                r1 = r10
                goto L4f
            L33:
                dc.n.b(r11)
                r5.b r11 = r5.b.this
                cd.d r11 = r5.b.i(r11)
                cd.f r11 = r11.iterator()
                r1 = r10
            L41:
                r1.f22171f = r11
                r1.f22173p = r4
                java.lang.Object r5 = r11.a(r1)
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r5
                r5 = r11
                r11 = r9
            L4f:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Ld6
                java.lang.Object r11 = r5.next()
                r5.h r11 = (r5.h) r11
                r5.i r6 = r11.b()
                r5.i r7 = r5.i.FLUSH
                if (r6 != r7) goto L67
                r6 = 1
                goto L68
            L67:
                r6 = 0
            L68:
                if (r6 != 0) goto L87
                q5.a r7 = r11.a()
                if (r7 == 0) goto L87
                r5.b r7 = r5.b.this     // Catch: java.lang.Exception -> L89
                p5.f r7 = r5.b.g(r7)     // Catch: java.lang.Exception -> L89
                q5.a r11 = r11.a()     // Catch: java.lang.Exception -> L89
                r1.f22171f = r5     // Catch: java.lang.Exception -> L89
                r1.f22172m = r6     // Catch: java.lang.Exception -> L89
                r1.f22173p = r3     // Catch: java.lang.Exception -> L89
                java.lang.Object r11 = r7.j(r11, r1)     // Catch: java.lang.Exception -> L89
                if (r11 != r0) goto L87
                return r0
            L87:
                r11 = r5
                goto La5
            L89:
                r11 = move-exception
            L8a:
                java.lang.String r11 = r11.getMessage()
                if (r11 != 0) goto L91
                goto L87
            L91:
                r5.b r7 = r5.b.this
                p5.a r7 = r5.b.a(r7)
                m5.a r7 = r7.j()
                java.lang.String r8 = "Error when write event: "
                java.lang.String r11 = qc.q.q(r8, r11)
                r7.a(r11)
                goto L87
            La5:
                r5.b r5 = r5.b.this
                java.util.concurrent.atomic.AtomicInteger r5 = r5.b.b(r5)
                int r5 = r5.incrementAndGet()
                r5.b r7 = r5.b.this
                int r7 = r5.b.c(r7)
                if (r5 >= r7) goto Lc0
                if (r6 == 0) goto Lba
                goto Lc0
            Lba:
                r5.b r5 = r5.b.this
                r5.b.j(r5)
                goto L41
            Lc0:
                r5.b r5 = r5.b.this
                java.util.concurrent.atomic.AtomicInteger r5 = r5.b.b(r5)
                r5.set(r2)
                r5.b r5 = r5.b.this
                cd.d r5 = r5.b.h(r5)
                java.lang.String r6 = "#!upload"
                r5.p(r6)
                goto L41
            Ld6:
                dc.w r11 = dc.w.f13270a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(p5.a aVar) {
        q.i(aVar, "amplitude");
        this.f22150a = aVar;
        this.f22153d = new AtomicInteger(0);
        this.f22154e = new j(aVar.h());
        this.f22157h = new AtomicInteger(1);
        this.f22155f = false;
        this.f22156g = false;
        this.f22151b = cd.g.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f22152c = cd.g.b(Integer.MAX_VALUE, null, null, 6, null);
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m() {
        boolean z10;
        Integer valueOf = Integer.valueOf(this.f22150a.h().d() / this.f22157h.get());
        if (valueOf.intValue() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 1;
        }
        return valueOf.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long n() {
        return this.f22150a.h().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 q() {
        return this.f22150a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p5.f r() {
        return this.f22150a.m();
    }

    private final void t() {
        Runtime.getRuntime().addShutdownHook(new C0499b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x1 u() {
        x1 d10;
        d10 = ad.i.d(q(), this.f22150a.n(), null, new c(null), 2, null);
        return d10;
    }

    private final x1 x() {
        x1 d10;
        d10 = ad.i.d(q(), this.f22150a.k(), null, new d(null), 2, null);
        return d10;
    }

    private final x1 y() {
        x1 d10;
        d10 = ad.i.d(q(), this.f22150a.n(), null, new e(null), 2, null);
        return d10;
    }

    public final void l() {
        this.f22151b.p(new h(i.FLUSH, null));
    }

    public final boolean o() {
        return this.f22155f;
    }

    public final boolean p() {
        return this.f22156g;
    }

    public final void s(q5.a aVar) {
        q.i(aVar, "event");
        aVar.S(aVar.e() + 1);
        this.f22151b.p(new h(i.EVENT, aVar));
    }

    public final void v() {
        this.f22155f = true;
        y();
        x();
    }

    public final void w() {
        r.a.a(this.f22152c, null, 1, null);
        r.a.a(this.f22151b, null, 1, null);
        this.f22155f = false;
    }
}
