package j1;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import o1.i;
import qc.q;
import qc.r;

/* compiled from: NestedScrollModifier.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private i f18944a;

    /* renamed from: b  reason: collision with root package name */
    private pc.a<? extends k0> f18945b = new a();

    /* renamed from: c  reason: collision with root package name */
    private k0 f18946c;

    /* compiled from: NestedScrollModifier.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<k0> {
        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return c.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {221}, m = "dispatchPostFling-RZ2iAVY")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f18948f;

        /* renamed from: p  reason: collision with root package name */
        int f18950p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18948f = obj;
            this.f18950p |= RecyclerView.UNDEFINED_DURATION;
            return c.this.a(0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {206}, m = "dispatchPreFling-QWom1Mo")
    /* renamed from: j1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0423c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f18951f;

        /* renamed from: p  reason: collision with root package name */
        int f18953p;

        C0423c(Continuation<? super C0423c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18951f = obj;
            this.f18953p |= RecyclerView.UNDEFINED_DURATION;
            return c.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, kotlin.coroutines.Continuation<? super j2.v> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof j1.c.b
            if (r0 == 0) goto L13
            r0 = r12
            j1.c$b r0 = (j1.c.b) r0
            int r1 = r0.f18950p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18950p = r1
            goto L18
        L13:
            j1.c$b r0 = new j1.c$b
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f18948f
            java.lang.Object r0 = ic.b.d()
            int r1 = r6.f18950p
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            dc.n.b(r12)
            goto L46
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            dc.n.b(r12)
            j1.b r1 = r7.g()
            if (r1 == 0) goto L4d
            r6.f18950p = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.H(r2, r4, r6)
            if (r12 != r0) goto L46
            return r0
        L46:
            j2.v r12 = (j2.v) r12
            long r8 = r12.o()
            goto L53
        L4d:
            j2.v$a r8 = j2.v.f19013b
            long r8 = r8.a()
        L53:
            j2.v r8 = j2.v.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.c.a(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        j1.b g10 = g();
        if (g10 != null) {
            return g10.T0(j10, j11, i10);
        }
        return z0.f.f26354b.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, kotlin.coroutines.Continuation<? super j2.v> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof j1.c.C0423c
            if (r0 == 0) goto L13
            r0 = r7
            j1.c$c r0 = (j1.c.C0423c) r0
            int r1 = r0.f18953p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18953p = r1
            goto L18
        L13:
            j1.c$c r0 = new j1.c$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18951f
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f18953p
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dc.n.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            dc.n.b(r7)
            j1.b r7 = r4.g()
            if (r7 == 0) goto L4a
            r0.f18953p = r3
            java.lang.Object r7 = r7.A0(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            j2.v r7 = (j2.v) r7
            long r5 = r7.o()
            goto L50
        L4a:
            j2.v$a r5 = j2.v.f19013b
            long r5 = r5.a()
        L50:
            j2.v r5 = j2.v.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.c.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long d(long j10, int i10) {
        j1.b g10 = g();
        if (g10 != null) {
            return g10.o0(j10, i10);
        }
        return z0.f.f26354b.c();
    }

    public final k0 e() {
        k0 invoke = this.f18945b.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final i f() {
        return this.f18944a;
    }

    public final j1.b g() {
        i iVar = this.f18944a;
        if (iVar != null) {
            return (d) iVar.o(e.a());
        }
        return null;
    }

    public final k0 h() {
        return this.f18946c;
    }

    public final void i(pc.a<? extends k0> aVar) {
        q.i(aVar, "<set-?>");
        this.f18945b = aVar;
    }

    public final void j(i iVar) {
        this.f18944a = iVar;
    }

    public final void k(k0 k0Var) {
        this.f18946c = k0Var;
    }
}
