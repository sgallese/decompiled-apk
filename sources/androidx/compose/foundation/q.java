package androidx.compose.foundation;

import ad.k0;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import dc.w;
import k1.u;
import kotlin.coroutines.Continuation;
import p1.n1;
import p1.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hoverable.kt */
/* loaded from: classes.dex */
public final class q extends e.c implements o1 {
    private v.m A;
    private v.g B;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {108}, m = "emitEnter")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f2155f;

        /* renamed from: m  reason: collision with root package name */
        Object f2156m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f2157p;

        /* renamed from: r  reason: collision with root package name */
        int f2159r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2157p = obj;
            this.f2159r |= RecyclerView.UNDEFINED_DURATION;
            return q.this.I1(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {116}, m = "emitExit")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f2160f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f2161m;

        /* renamed from: q  reason: collision with root package name */
        int f2163q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2161m = obj;
            this.f2163q |= RecyclerView.UNDEFINED_DURATION;
            return q.this.J1(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f2164f;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f2164f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                q qVar = q.this;
                this.f2164f = 1;
                if (qVar.I1(this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f2166f;

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

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f2166f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                q qVar = q.this;
                this.f2166f = 1;
                if (qVar.J1(this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public q(v.m mVar) {
        qc.q.i(mVar, "interactionSource");
        this.A = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I1(kotlin.coroutines.Continuation<? super dc.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.q.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.q$a r0 = (androidx.compose.foundation.q.a) r0
            int r1 = r0.f2159r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2159r = r1
            goto L18
        L13:
            androidx.compose.foundation.q$a r0 = new androidx.compose.foundation.q$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2157p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f2159r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f2156m
            v.g r1 = (v.g) r1
            java.lang.Object r0 = r0.f2155f
            androidx.compose.foundation.q r0 = (androidx.compose.foundation.q) r0
            dc.n.b(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            dc.n.b(r5)
            v.g r5 = r4.B
            if (r5 != 0) goto L58
            v.g r5 = new v.g
            r5.<init>()
            v.m r2 = r4.A
            r0.f2155f = r4
            r0.f2156m = r5
            r0.f2159r = r3
            java.lang.Object r0 = r2.c(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.B = r1
        L58:
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.q.I1(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J1(kotlin.coroutines.Continuation<? super dc.w> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.q.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.q$b r0 = (androidx.compose.foundation.q.b) r0
            int r1 = r0.f2163q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2163q = r1
            goto L18
        L13:
            androidx.compose.foundation.q$b r0 = new androidx.compose.foundation.q$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2161m
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f2163q
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f2160f
            androidx.compose.foundation.q r0 = (androidx.compose.foundation.q) r0
            dc.n.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            dc.n.b(r5)
            v.g r5 = r4.B
            if (r5 == 0) goto L52
            v.h r2 = new v.h
            r2.<init>(r5)
            v.m r5 = r4.A
            r0.f2160f = r4
            r0.f2163q = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.B = r5
        L52:
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.q.J1(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void K1() {
        v.g gVar = this.B;
        if (gVar != null) {
            this.A.a(new v.h(gVar));
            this.B = null;
        }
    }

    public final void L1(v.m mVar) {
        qc.q.i(mVar, "interactionSource");
        if (!qc.q.d(this.A, mVar)) {
            K1();
            this.A = mVar;
        }
    }

    @Override // p1.o1
    public void O(k1.r rVar, k1.t tVar, long j10) {
        qc.q.i(rVar, "pointerEvent");
        qc.q.i(tVar, "pass");
        if (tVar == k1.t.Main) {
            int f10 = rVar.f();
            u.a aVar = u.f19238a;
            if (u.i(f10, aVar.a())) {
                ad.i.d(i1(), null, null, new c(null), 3, null);
            } else if (u.i(f10, aVar.b())) {
                ad.i.d(i1(), null, null, new d(null), 3, null);
            }
        }
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
        K1();
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
        K1();
    }
}
