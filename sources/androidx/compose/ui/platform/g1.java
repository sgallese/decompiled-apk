package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* compiled from: GlobalSnapshotManager.android.kt */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final g1 f2674a = new g1();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f2675b = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlobalSnapshotManager.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f2676f;

        /* renamed from: m  reason: collision with root package name */
        Object f2677m;

        /* renamed from: p  reason: collision with root package name */
        int f2678p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ cd.d<dc.w> f2679q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(cd.d<dc.w> dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2679q = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f2679q, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:16:0x0041, B:18:0x0049), top: B:29:0x0041 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003b -> B:29:0x0041). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r6.f2678p
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.f2677m
                cd.f r1 = (cd.f) r1
                java.lang.Object r3 = r6.f2676f
                cd.r r3 = (cd.r) r3
                dc.n.b(r7)     // Catch: java.lang.Throwable -> L63
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r6
                goto L41
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                dc.n.b(r7)
                cd.d<dc.w> r3 = r6.f2679q
                cd.f r7 = r3.iterator()     // Catch: java.lang.Throwable -> L63
                r1 = r7
                r7 = r6
            L2e:
                r7.f2676f = r3     // Catch: java.lang.Throwable -> L63
                r7.f2677m = r1     // Catch: java.lang.Throwable -> L63
                r7.f2678p = r2     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r1.a(r7)     // Catch: java.lang.Throwable -> L63
                if (r4 != r0) goto L3b
                return r0
            L3b:
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L41:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L60
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L60
                if (r7 == 0) goto L59
                java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L60
                dc.w r7 = (dc.w) r7     // Catch: java.lang.Throwable -> L60
                t0.g$a r7 = t0.g.f23297e     // Catch: java.lang.Throwable -> L60
                r7.g()     // Catch: java.lang.Throwable -> L60
                r7 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L2e
            L59:
                r7 = 0
                cd.k.a(r4, r7)
                dc.w r7 = dc.w.f13270a
                return r7
            L60:
                r7 = move-exception
                r3 = r4
                goto L64
            L63:
                r7 = move-exception
            L64:
                throw r7     // Catch: java.lang.Throwable -> L65
            L65:
                r0 = move-exception
                cd.k.a(r3, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.g1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GlobalSnapshotManager.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<Object, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ cd.d<dc.w> f2680f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cd.d<dc.w> dVar) {
            super(1);
            this.f2680f = dVar;
        }

        public final void a(Object obj) {
            qc.q.i(obj, "it");
            this.f2680f.p(dc.w.f13270a);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    private g1() {
    }

    public final void a() {
        if (f2675b.compareAndSet(false, true)) {
            cd.d b10 = cd.g.b(-1, null, null, 6, null);
            ad.i.d(ad.l0.a(m0.f2750y.b()), null, null, new a(b10, null), 3, null);
            t0.g.f23297e.f(new b(b10));
        }
    }
}
