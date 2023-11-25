package u;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import k1.c0;
import k1.l0;
import k1.u0;
import k1.v0;
import kotlin.coroutines.Continuation;
import okhttp3.internal.http.StatusLine;
import p1.n1;
import p1.o1;
import qc.f0;

/* compiled from: Draggable.kt */
/* loaded from: classes.dex */
public final class k extends p1.l implements o1 {
    private l C;
    private pc.l<? super c0, Boolean> D;
    private o E;
    private boolean F;
    private v.m G;
    private pc.a<Boolean> H;
    private pc.q<? super k0, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> I;
    private pc.q<? super k0, ? super j2.v, ? super Continuation<? super dc.w>, ? extends Object> J;
    private boolean K;
    private final pc.l<c0, Boolean> L;
    private final pc.a<Boolean> M;
    private final l1.c N;
    private final v0 O;
    private final cd.d<g> P;
    private v.b Q;

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<c0, Boolean> {
        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(c0 c0Var) {
            qc.q.i(c0Var, "it");
            return (Boolean) k.this.D.invoke(c0Var);
        }
    }

    /* compiled from: Draggable.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<Boolean> {
        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return (Boolean) k.this.H.invoke();
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1", f = "Draggable.kt", l = {302}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<l0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23917f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f23918m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Draggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1", f = "Draggable.kt", l = {326}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f23920f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f23921m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ l0 f23922p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ k f23923q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Draggable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", l = {305, StatusLine.HTTP_TEMP_REDIRECT, 309, 316, 318, 321}, m = "invokeSuspend")
            /* renamed from: u.k$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0558a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                Object f23924f;

                /* renamed from: m  reason: collision with root package name */
                Object f23925m;

                /* renamed from: p  reason: collision with root package name */
                int f23926p;

                /* renamed from: q  reason: collision with root package name */
                private /* synthetic */ Object f23927q;

                /* renamed from: r  reason: collision with root package name */
                final /* synthetic */ k f23928r;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Draggable.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1", f = "Draggable.kt", l = {312}, m = "invokeSuspend")
                /* renamed from: u.k$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0559a extends kotlin.coroutines.jvm.internal.l implements pc.p<i, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    Object f23929f;

                    /* renamed from: m  reason: collision with root package name */
                    int f23930m;

                    /* renamed from: p  reason: collision with root package name */
                    private /* synthetic */ Object f23931p;

                    /* renamed from: q  reason: collision with root package name */
                    final /* synthetic */ f0<g> f23932q;

                    /* renamed from: r  reason: collision with root package name */
                    final /* synthetic */ k f23933r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0559a(f0<g> f0Var, k kVar, Continuation<? super C0559a> continuation) {
                        super(2, continuation);
                        this.f23932q = f0Var;
                        this.f23933r = kVar;
                    }

                    @Override // pc.p
                    /* renamed from: a  reason: merged with bridge method [inline-methods] */
                    public final Object invoke(i iVar, Continuation<? super dc.w> continuation) {
                        return ((C0559a) create(iVar, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        C0559a c0559a = new C0559a(this.f23932q, this.f23933r, continuation);
                        c0559a.f23931p = obj;
                        return c0559a;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0068 -> B:23:0x006e). Please submit an issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = ic.b.d()
                            int r1 = r8.f23930m
                            r2 = 1
                            if (r1 == 0) goto L23
                            if (r1 != r2) goto L1b
                            java.lang.Object r1 = r8.f23929f
                            qc.f0 r1 = (qc.f0) r1
                            java.lang.Object r3 = r8.f23931p
                            u.i r3 = (u.i) r3
                            dc.n.b(r9)
                            r4 = r3
                            r3 = r1
                            r1 = r0
                            r0 = r8
                            goto L6e
                        L1b:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L23:
                            dc.n.b(r9)
                            java.lang.Object r9 = r8.f23931p
                            u.i r9 = (u.i) r9
                            r3 = r9
                            r9 = r8
                        L2c:
                            qc.f0<u.g> r1 = r9.f23932q
                            T r1 = r1.f21676f
                            boolean r4 = r1 instanceof u.g.d
                            if (r4 != 0) goto L74
                            boolean r4 = r1 instanceof u.g.a
                            if (r4 != 0) goto L74
                            boolean r4 = r1 instanceof u.g.b
                            if (r4 == 0) goto L3f
                            u.g$b r1 = (u.g.b) r1
                            goto L40
                        L3f:
                            r1 = 0
                        L40:
                            if (r1 == 0) goto L53
                            u.k r4 = r9.f23933r
                            long r5 = r1.a()
                            u.o r1 = u.k.Q1(r4)
                            float r1 = u.j.d(r5, r1)
                            r3.b(r1)
                        L53:
                            qc.f0<u.g> r1 = r9.f23932q
                            u.k r4 = r9.f23933r
                            cd.d r4 = u.k.O1(r4)
                            r9.f23931p = r3
                            r9.f23929f = r1
                            r9.f23930m = r2
                            java.lang.Object r4 = r4.k(r9)
                            if (r4 != r0) goto L68
                            return r0
                        L68:
                            r7 = r0
                            r0 = r9
                            r9 = r4
                            r4 = r3
                            r3 = r1
                            r1 = r7
                        L6e:
                            r3.f21676f = r9
                            r9 = r0
                            r0 = r1
                            r3 = r4
                            goto L2c
                        L74:
                            dc.w r9 = dc.w.f13270a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: u.k.c.a.C0558a.C0559a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0558a(k kVar, Continuation<? super C0558a> continuation) {
                    super(2, continuation);
                    this.f23928r = kVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    C0558a c0558a = new C0558a(this.f23928r, continuation);
                    c0558a.f23927q = obj;
                    return c0558a;
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0558a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: CancellationException -> 0x00fd, TryCatch #1 {CancellationException -> 0x00fd, blocks: (B:38:0x00c9, B:40:0x00cf, B:43:0x00e6, B:45:0x00ea), top: B:60:0x00c9 }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00e6 A[Catch: CancellationException -> 0x00fd, TryCatch #1 {CancellationException -> 0x00fd, blocks: (B:38:0x00c9, B:40:0x00cf, B:43:0x00e6, B:45:0x00ea), top: B:60:0x00c9 }] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0111 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00fa -> B:22:0x0067). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0114 -> B:22:0x0067). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        Method dump skipped, instructions count: 302
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: u.k.c.a.C0558a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Draggable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2", f = "Draggable.kt", l = {328, 336}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.k implements pc.p<k1.e, Continuation<? super dc.w>, Object> {

                /* renamed from: m  reason: collision with root package name */
                Object f23934m;

                /* renamed from: p  reason: collision with root package name */
                Object f23935p;

                /* renamed from: q  reason: collision with root package name */
                int f23936q;

                /* renamed from: r  reason: collision with root package name */
                int f23937r;

                /* renamed from: s  reason: collision with root package name */
                private /* synthetic */ Object f23938s;

                /* renamed from: t  reason: collision with root package name */
                final /* synthetic */ k0 f23939t;

                /* renamed from: u  reason: collision with root package name */
                final /* synthetic */ k f23940u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(k0 k0Var, k kVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f23939t = k0Var;
                    this.f23940u = kVar;
                }

                @Override // pc.p
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public final Object invoke(k1.e eVar, Continuation<? super dc.w> continuation) {
                    return ((b) create(eVar, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    b bVar = new b(this.f23939t, this.f23940u, continuation);
                    bVar.f23938s = obj;
                    return bVar;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(7:27|28|29|30|31|32|(1:34)(4:35|9|10|(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
                
                    r0 = th;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
                
                    r12 = r2;
                    r2 = r15;
                    r11 = r20;
                    r10 = r13;
                    r14 = r22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
                
                    r11 = r20;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x013b A[Catch: all -> 0x013c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x013c, blocks: (B:51:0x0128, B:55:0x013b), top: B:70:0x0128 }] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d1 -> B:73:0x00da). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x012e -> B:54:0x0130). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x016a -> B:18:0x0052). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                    /*
                        Method dump skipped, instructions count: 374
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: u.k.c.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var, k kVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f23922p = l0Var;
                this.f23923q = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f23922p, this.f23923q, continuation);
                aVar.f23921m = obj;
                return aVar;
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = ic.b.d()
                    int r1 = r11.f23920f
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r11.f23921m
                    ad.k0 r0 = (ad.k0) r0
                    dc.n.b(r12)     // Catch: java.util.concurrent.CancellationException -> L13
                    goto L53
                L13:
                    r12 = move-exception
                    goto L4d
                L15:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1d:
                    dc.n.b(r12)
                    java.lang.Object r12 = r11.f23921m
                    ad.k0 r12 = (ad.k0) r12
                    r4 = 0
                    ad.m0 r5 = ad.m0.UNDISPATCHED
                    u.k$c$a$a r6 = new u.k$c$a$a
                    u.k r1 = r11.f23923q
                    r9 = 0
                    r6.<init>(r1, r9)
                    r7 = 1
                    r8 = 0
                    r3 = r12
                    ad.g.d(r3, r4, r5, r6, r7, r8)
                    k1.l0 r1 = r11.f23922p     // Catch: java.util.concurrent.CancellationException -> L49
                    u.k$c$a$b r3 = new u.k$c$a$b     // Catch: java.util.concurrent.CancellationException -> L49
                    u.k r4 = r11.f23923q     // Catch: java.util.concurrent.CancellationException -> L49
                    r3.<init>(r12, r4, r9)     // Catch: java.util.concurrent.CancellationException -> L49
                    r11.f23921m = r12     // Catch: java.util.concurrent.CancellationException -> L49
                    r11.f23920f = r2     // Catch: java.util.concurrent.CancellationException -> L49
                    java.lang.Object r12 = r1.V0(r3, r11)     // Catch: java.util.concurrent.CancellationException -> L49
                    if (r12 != r0) goto L53
                    return r0
                L49:
                    r0 = move-exception
                    r10 = r0
                    r0 = r12
                    r12 = r10
                L4d:
                    boolean r0 = ad.l0.g(r0)
                    if (r0 == 0) goto L56
                L53:
                    dc.w r12 = dc.w.f13270a
                    return r12
                L56:
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: u.k.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, Continuation<? super dc.w> continuation) {
            return ((c) create(l0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.f23918m = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f23917f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                l0 l0Var = (l0) this.f23918m;
                if (!k.this.F) {
                    return dc.w.f13270a;
                }
                a aVar = new a(l0Var, k.this, null);
                this.f23917f = 1;
                if (ad.l0.e(aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", l = {451, 454}, m = "processDragCancel")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23941f;

        /* renamed from: m  reason: collision with root package name */
        Object f23942m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f23943p;

        /* renamed from: r  reason: collision with root package name */
        int f23945r;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23943p = obj;
            this.f23945r |= RecyclerView.UNDEFINED_DURATION;
            return k.this.b2(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", l = {433, 436, 438}, m = "processDragStart")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23946f;

        /* renamed from: m  reason: collision with root package name */
        Object f23947m;

        /* renamed from: p  reason: collision with root package name */
        Object f23948p;

        /* renamed from: q  reason: collision with root package name */
        Object f23949q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f23950r;

        /* renamed from: t  reason: collision with root package name */
        int f23952t;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23950r = obj;
            this.f23952t |= RecyclerView.UNDEFINED_DURATION;
            return k.this.c2(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", l = {443, 446}, m = "processDragStop")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23953f;

        /* renamed from: m  reason: collision with root package name */
        Object f23954m;

        /* renamed from: p  reason: collision with root package name */
        Object f23955p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f23956q;

        /* renamed from: s  reason: collision with root package name */
        int f23958s;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23956q = obj;
            this.f23958s |= RecyclerView.UNDEFINED_DURATION;
            return k.this.d2(null, null, this);
        }
    }

    public k(l lVar, pc.l<? super c0, Boolean> lVar2, o oVar, boolean z10, v.m mVar, pc.a<Boolean> aVar, pc.q<? super k0, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.q<? super k0, ? super j2.v, ? super Continuation<? super dc.w>, ? extends Object> qVar2, boolean z11) {
        qc.q.i(lVar, "state");
        qc.q.i(lVar2, "canDrag");
        qc.q.i(oVar, "orientation");
        qc.q.i(aVar, "startDragImmediately");
        qc.q.i(qVar, "onDragStarted");
        qc.q.i(qVar2, "onDragStopped");
        this.C = lVar;
        this.D = lVar2;
        this.E = oVar;
        this.F = z10;
        this.G = mVar;
        this.H = aVar;
        this.I = qVar;
        this.J = qVar2;
        this.K = z11;
        this.L = new a();
        this.M = new b();
        this.N = new l1.c();
        this.O = (v0) I1(u0.a(new c(null)));
        this.P = cd.g.b(Integer.MAX_VALUE, null, null, 6, null);
    }

    private final void a2() {
        v.b bVar = this.Q;
        if (bVar != null) {
            v.m mVar = this.G;
            if (mVar != null) {
                mVar.a(new v.a(bVar));
            }
            this.Q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b2(ad.k0 r9, kotlin.coroutines.Continuation<? super dc.w> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof u.k.d
            if (r0 == 0) goto L13
            r0 = r10
            u.k$d r0 = (u.k.d) r0
            int r1 = r0.f23945r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23945r = r1
            goto L18
        L13:
            u.k$d r0 = new u.k$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f23943p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23945r
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            dc.n.b(r10)
            goto L7c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.f23942m
            ad.k0 r9 = (ad.k0) r9
            java.lang.Object r2 = r0.f23941f
            u.k r2 = (u.k) r2
            dc.n.b(r10)
            goto L5f
        L41:
            dc.n.b(r10)
            v.b r10 = r8.Q
            if (r10 == 0) goto L62
            v.m r2 = r8.G
            if (r2 == 0) goto L5e
            v.a r6 = new v.a
            r6.<init>(r10)
            r0.f23941f = r8
            r0.f23942m = r9
            r0.f23945r = r4
            java.lang.Object r10 = r2.c(r6, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r2 = r8
        L5f:
            r2.Q = r5
            goto L63
        L62:
            r2 = r8
        L63:
            pc.q<? super ad.k0, ? super j2.v, ? super kotlin.coroutines.Continuation<? super dc.w>, ? extends java.lang.Object> r10 = r2.J
            j2.v$a r2 = j2.v.f19013b
            long r6 = r2.a()
            j2.v r2 = j2.v.b(r6)
            r0.f23941f = r5
            r0.f23942m = r5
            r0.f23945r = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            dc.w r9 = dc.w.f13270a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u.k.b2(ad.k0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c2(ad.k0 r9, u.g.c r10, kotlin.coroutines.Continuation<? super dc.w> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof u.k.e
            if (r0 == 0) goto L13
            r0 = r11
            u.k$e r0 = (u.k.e) r0
            int r1 = r0.f23952t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23952t = r1
            goto L18
        L13:
            u.k$e r0 = new u.k$e
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f23950r
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23952t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            dc.n.b(r11)
            goto Lbd
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f23949q
            v.b r9 = (v.b) r9
            java.lang.Object r10 = r0.f23948p
            u.g$c r10 = (u.g.c) r10
            java.lang.Object r2 = r0.f23947m
            ad.k0 r2 = (ad.k0) r2
            java.lang.Object r4 = r0.f23946f
            u.k r4 = (u.k) r4
            dc.n.b(r11)
            goto L9c
        L4c:
            java.lang.Object r9 = r0.f23948p
            u.g$c r9 = (u.g.c) r9
            java.lang.Object r10 = r0.f23947m
            ad.k0 r10 = (ad.k0) r10
            java.lang.Object r2 = r0.f23946f
            u.k r2 = (u.k) r2
            dc.n.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L5f:
            dc.n.b(r11)
            v.b r11 = r8.Q
            if (r11 == 0) goto L7e
            v.m r2 = r8.G
            if (r2 == 0) goto L7e
            v.a r6 = new v.a
            r6.<init>(r11)
            r0.f23946f = r8
            r0.f23947m = r9
            r0.f23948p = r10
            r0.f23952t = r5
            java.lang.Object r11 = r2.c(r6, r0)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            r2 = r8
        L7f:
            v.b r11 = new v.b
            r11.<init>()
            v.m r5 = r2.G
            if (r5 == 0) goto L9f
            r0.f23946f = r2
            r0.f23947m = r9
            r0.f23948p = r10
            r0.f23949q = r11
            r0.f23952t = r4
            java.lang.Object r4 = r5.c(r11, r0)
            if (r4 != r1) goto L99
            return r1
        L99:
            r4 = r2
            r2 = r9
            r9 = r11
        L9c:
            r11 = r9
            r9 = r2
            r2 = r4
        L9f:
            r2.Q = r11
            pc.q<? super ad.k0, ? super z0.f, ? super kotlin.coroutines.Continuation<? super dc.w>, ? extends java.lang.Object> r11 = r2.I
            long r4 = r10.a()
            z0.f r10 = z0.f.d(r4)
            r2 = 0
            r0.f23946f = r2
            r0.f23947m = r2
            r0.f23948p = r2
            r0.f23949q = r2
            r0.f23952t = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto Lbd
            return r1
        Lbd:
            dc.w r9 = dc.w.f13270a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u.k.c2(ad.k0, u.g$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d2(ad.k0 r10, u.g.d r11, kotlin.coroutines.Continuation<? super dc.w> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof u.k.f
            if (r0 == 0) goto L13
            r0 = r12
            u.k$f r0 = (u.k.f) r0
            int r1 = r0.f23958s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23958s = r1
            goto L18
        L13:
            u.k$f r0 = new u.k$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f23956q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23958s
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            dc.n.b(r12)
            goto L85
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            java.lang.Object r10 = r0.f23955p
            u.g$d r10 = (u.g.d) r10
            java.lang.Object r11 = r0.f23954m
            ad.k0 r11 = (ad.k0) r11
            java.lang.Object r2 = r0.f23953f
            u.k r2 = (u.k) r2
            dc.n.b(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L68
        L48:
            dc.n.b(r12)
            v.b r12 = r9.Q
            if (r12 == 0) goto L6b
            v.m r2 = r9.G
            if (r2 == 0) goto L67
            v.c r6 = new v.c
            r6.<init>(r12)
            r0.f23953f = r9
            r0.f23954m = r10
            r0.f23955p = r11
            r0.f23958s = r4
            java.lang.Object r12 = r2.c(r6, r0)
            if (r12 != r1) goto L67
            return r1
        L67:
            r2 = r9
        L68:
            r2.Q = r5
            goto L6c
        L6b:
            r2 = r9
        L6c:
            pc.q<? super ad.k0, ? super j2.v, ? super kotlin.coroutines.Continuation<? super dc.w>, ? extends java.lang.Object> r12 = r2.J
            long r6 = r11.a()
            j2.v r11 = j2.v.b(r6)
            r0.f23953f = r5
            r0.f23954m = r5
            r0.f23955p = r5
            r0.f23958s = r3
            java.lang.Object r10 = r12.invoke(r10, r11, r0)
            if (r10 != r1) goto L85
            return r1
        L85:
            dc.w r10 = dc.w.f13270a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u.k.d2(ad.k0, u.g$d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p1.o1
    public void O(k1.r rVar, k1.t tVar, long j10) {
        qc.q.i(rVar, "pointerEvent");
        qc.q.i(tVar, "pass");
        this.O.O(rVar, tVar, j10);
    }

    @Override // p1.o1
    public /* synthetic */ boolean Q0() {
        return n1.d(this);
    }

    @Override // p1.o1
    public /* synthetic */ void U0() {
        n1.c(this);
    }

    @Override // p1.o1
    public void a0() {
        this.O.a0();
    }

    public final void e2(l lVar, pc.l<? super c0, Boolean> lVar2, o oVar, boolean z10, v.m mVar, pc.a<Boolean> aVar, pc.q<? super k0, ? super z0.f, ? super Continuation<? super dc.w>, ? extends Object> qVar, pc.q<? super k0, ? super j2.v, ? super Continuation<? super dc.w>, ? extends Object> qVar2, boolean z11) {
        boolean z12;
        qc.q.i(lVar, "state");
        qc.q.i(lVar2, "canDrag");
        qc.q.i(oVar, "orientation");
        qc.q.i(aVar, "startDragImmediately");
        qc.q.i(qVar, "onDragStarted");
        qc.q.i(qVar2, "onDragStopped");
        boolean z13 = true;
        if (!qc.q.d(this.C, lVar)) {
            this.C = lVar;
            z12 = true;
        } else {
            z12 = false;
        }
        this.D = lVar2;
        if (this.E != oVar) {
            this.E = oVar;
            z12 = true;
        }
        if (this.F != z10) {
            this.F = z10;
            if (!z10) {
                a2();
            }
            z12 = true;
        }
        if (!qc.q.d(this.G, mVar)) {
            a2();
            this.G = mVar;
        }
        this.H = aVar;
        this.I = qVar;
        this.J = qVar2;
        if (this.K != z11) {
            this.K = z11;
        } else {
            z13 = z12;
        }
        if (z13) {
            this.O.e1();
        }
    }

    @Override // p1.o1
    public /* synthetic */ boolean g0() {
        return n1.a(this);
    }

    @Override // p1.o1
    public /* synthetic */ void m0() {
        n1.b(this);
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        a2();
    }
}
