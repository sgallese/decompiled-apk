package ad;

import ad.x1;
import fd.r;
import hc.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public class e2 implements x1, u, m2 {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f479f = AtomicReferenceFieldUpdater.newUpdater(e2.class, Object.class, "_state");

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f480m = AtomicReferenceFieldUpdater.newUpdater(e2.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> extends n<T> {

        /* renamed from: v  reason: collision with root package name */
        private final e2 f481v;

        public a(Continuation<? super T> continuation, e2 e2Var) {
            super(continuation, 1);
            this.f481v = e2Var;
        }

        @Override // ad.n
        protected String H() {
            return "AwaitContinuation";
        }

        @Override // ad.n
        public Throwable u(x1 x1Var) {
            Throwable f10;
            Object h02 = this.f481v.h0();
            if ((h02 instanceof c) && (f10 = ((c) h02).f()) != null) {
                return f10;
            }
            if (h02 instanceof a0) {
                return ((a0) h02).f462a;
            }
            return x1Var.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes4.dex */
    public static final class b extends d2 {

        /* renamed from: r  reason: collision with root package name */
        private final e2 f482r;

        /* renamed from: s  reason: collision with root package name */
        private final c f483s;

        /* renamed from: t  reason: collision with root package name */
        private final t f484t;

        /* renamed from: u  reason: collision with root package name */
        private final Object f485u;

        public b(e2 e2Var, c cVar, t tVar, Object obj) {
            this.f482r = e2Var;
            this.f483s = cVar;
            this.f484t = tVar;
            this.f485u = obj;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            r(th);
            return dc.w.f13270a;
        }

        @Override // ad.c0
        public void r(Throwable th) {
            this.f482r.S(this.f483s, this.f484t, this.f485u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    /* loaded from: classes4.dex */
    public static final class c implements r1 {

        /* renamed from: m  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f486m = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: p  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f487p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: q  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f488q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: f  reason: collision with root package name */
        private final j2 f489f;

        public c(j2 j2Var, boolean z10, Throwable th) {
            this.f489f = j2Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return f488q.get(this);
        }

        private final void l(Object obj) {
            f488q.set(this, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th) {
            Throwable f10 = f();
            if (f10 == null) {
                m(th);
            } else if (th == f10) {
            } else {
                Object e10 = e();
                if (e10 == null) {
                    l(th);
                } else if (e10 instanceof Throwable) {
                    if (th == e10) {
                        return;
                    }
                    ArrayList<Throwable> d10 = d();
                    d10.add(e10);
                    d10.add(th);
                    l(d10);
                } else if (e10 instanceof ArrayList) {
                    ((ArrayList) e10).add(th);
                } else {
                    throw new IllegalStateException(("State is " + e10).toString());
                }
            }
        }

        @Override // ad.r1
        public boolean b() {
            if (f() == null) {
                return true;
            }
            return false;
        }

        @Override // ad.r1
        public j2 c() {
            return this.f489f;
        }

        public final Throwable f() {
            return (Throwable) f487p.get(this);
        }

        public final boolean g() {
            if (f() != null) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            if (f486m.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean i() {
            fd.g0 g0Var;
            Object e10 = e();
            g0Var = f2.f507e;
            if (e10 == g0Var) {
                return true;
            }
            return false;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            fd.g0 g0Var;
            Object e10 = e();
            if (e10 == null) {
                arrayList = d();
            } else if (e10 instanceof Throwable) {
                ArrayList<Throwable> d10 = d();
                d10.add(e10);
                arrayList = d10;
            } else if (e10 instanceof ArrayList) {
                arrayList = (ArrayList) e10;
            } else {
                throw new IllegalStateException(("State is " + e10).toString());
            }
            Throwable f10 = f();
            if (f10 != null) {
                arrayList.add(0, f10);
            }
            if (th != null && !qc.q.d(th, f10)) {
                arrayList.add(th);
            }
            g0Var = f2.f507e;
            l(g0Var);
            return arrayList;
        }

        public final void k(boolean z10) {
            f486m.set(this, z10 ? 1 : 0);
        }

        public final void m(Throwable th) {
            f487p.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + c() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes4.dex */
    public static final class d extends r.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e2 f490d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f491e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(fd.r rVar, e2 e2Var, Object obj) {
            super(rVar);
            this.f490d = e2Var;
            this.f491e = obj;
        }

        @Override // fd.b
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public Object d(fd.r rVar) {
            boolean z10;
            if (this.f490d.h0() == this.f491e) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            return fd.q.a();
        }
    }

    /* compiled from: JobSupport.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {956, 958}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.k implements pc.p<xc.i<? super x1>, Continuation<? super dc.w>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f492m;

        /* renamed from: p  reason: collision with root package name */
        Object f493p;

        /* renamed from: q  reason: collision with root package name */
        int f494q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f495r;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(xc.i<? super x1> iVar, Continuation<? super dc.w> continuation) {
            return ((e) create(iVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.f495r = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:27:0x0083). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:27:0x0083). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r7.f494q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.f493p
                fd.r r1 = (fd.r) r1
                java.lang.Object r3 = r7.f492m
                fd.p r3 = (fd.p) r3
                java.lang.Object r4 = r7.f495r
                xc.i r4 = (xc.i) r4
                dc.n.b(r8)
                r8 = r7
                goto L83
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                dc.n.b(r8)
                goto L88
            L2b:
                dc.n.b(r8)
                java.lang.Object r8 = r7.f495r
                xc.i r8 = (xc.i) r8
                ad.e2 r1 = ad.e2.this
                java.lang.Object r1 = r1.h0()
                boolean r4 = r1 instanceof ad.t
                if (r4 == 0) goto L49
                ad.t r1 = (ad.t) r1
                ad.u r1 = r1.f557r
                r7.f494q = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L88
                return r0
            L49:
                boolean r3 = r1 instanceof ad.r1
                if (r3 == 0) goto L88
                ad.r1 r1 = (ad.r1) r1
                ad.j2 r1 = r1.c()
                if (r1 == 0) goto L88
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                qc.q.g(r3, r4)
                fd.r r3 = (fd.r) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L65:
                boolean r5 = qc.q.d(r1, r3)
                if (r5 != 0) goto L88
                boolean r5 = r1 instanceof ad.t
                if (r5 == 0) goto L83
                r5 = r1
                ad.t r5 = (ad.t) r5
                ad.u r5 = r5.f557r
                r8.f495r = r4
                r8.f492m = r3
                r8.f493p = r1
                r8.f494q = r2
                java.lang.Object r5 = r4.a(r5, r8)
                if (r5 != r0) goto L83
                return r0
            L83:
                fd.r r1 = r1.k()
                goto L65
            L88:
                dc.w r8 = dc.w.f13270a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ad.e2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e2(boolean z10) {
        this._state = z10 ? f2.f509g : f2.f508f;
    }

    private final void A(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                dc.b.a(th, th2);
            }
        }
    }

    private final void A0(j2 j2Var, Throwable th) {
        C0(th);
        Object j10 = j2Var.j();
        qc.q.g(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (fd.r rVar = (fd.r) j10; !qc.q.d(rVar, j2Var); rVar = rVar.k()) {
            if (rVar instanceof y1) {
                d2 d2Var = (d2) rVar;
                try {
                    d2Var.r(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        dc.b.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + d2Var + " for " + this, th2);
                        dc.w wVar = dc.w.f13270a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            k0(completionHandlerException);
        }
        M(th);
    }

    private final void B0(j2 j2Var, Throwable th) {
        Object j10 = j2Var.j();
        qc.q.g(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (fd.r rVar = (fd.r) j10; !qc.q.d(rVar, j2Var); rVar = rVar.k()) {
            if (rVar instanceof d2) {
                d2 d2Var = (d2) rVar;
                try {
                    d2Var.r(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        dc.b.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + d2Var + " for " + this, th2);
                        dc.w wVar = dc.w.f13270a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            k0(completionHandlerException);
        }
    }

    private final Object F(Continuation<Object> continuation) {
        a aVar = new a(ic.b.c(continuation), this);
        aVar.A();
        p.a(aVar, s0(new n2(aVar)));
        Object x10 = aVar.x();
        if (x10 == ic.b.d()) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ad.q1] */
    private final void F0(f1 f1Var) {
        j2 j2Var = new j2();
        if (!f1Var.b()) {
            j2Var = new q1(j2Var);
        }
        androidx.concurrent.futures.b.a(f479f, this, f1Var, j2Var);
    }

    private final void G0(d2 d2Var) {
        d2Var.f(new j2());
        androidx.concurrent.futures.b.a(f479f, this, d2Var, d2Var.k());
    }

    private final int J0(Object obj) {
        f1 f1Var;
        if (obj instanceof f1) {
            if (((f1) obj).b()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f479f;
            f1Var = f2.f509g;
            if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, f1Var)) {
                return -1;
            }
            E0();
            return 1;
        } else if (!(obj instanceof q1)) {
            return 0;
        } else {
            if (!androidx.concurrent.futures.b.a(f479f, this, obj, ((q1) obj).c())) {
                return -1;
            }
            E0();
            return 1;
        }
    }

    private final Object K(Object obj) {
        fd.g0 g0Var;
        Object Q0;
        fd.g0 g0Var2;
        do {
            Object h02 = h0();
            if (!(h02 instanceof r1) || ((h02 instanceof c) && ((c) h02).h())) {
                g0Var = f2.f503a;
                return g0Var;
            }
            Q0 = Q0(h02, new a0(U(obj), false, 2, null));
            g0Var2 = f2.f505c;
        } while (Q0 == g0Var2);
        return Q0;
    }

    private final String K0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.g()) {
                return "Cancelling";
            }
            if (!cVar.h()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof r1) {
            if (((r1) obj).b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof a0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    private final boolean M(Throwable th) {
        if (n0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        s g02 = g0();
        if (g02 != null && g02 != k2.f533f) {
            if (g02.d(th) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static /* synthetic */ CancellationException M0(e2 e2Var, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return e2Var.L0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean O0(r1 r1Var, Object obj) {
        if (!androidx.concurrent.futures.b.a(f479f, this, r1Var, f2.g(obj))) {
            return false;
        }
        C0(null);
        D0(obj);
        P(r1Var, obj);
        return true;
    }

    private final void P(r1 r1Var, Object obj) {
        a0 a0Var;
        s g02 = g0();
        if (g02 != null) {
            g02.dispose();
            I0(k2.f533f);
        }
        Throwable th = null;
        if (obj instanceof a0) {
            a0Var = (a0) obj;
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            th = a0Var.f462a;
        }
        if (r1Var instanceof d2) {
            try {
                ((d2) r1Var).r(th);
                return;
            } catch (Throwable th2) {
                k0(new CompletionHandlerException("Exception in completion handler " + r1Var + " for " + this, th2));
                return;
            }
        }
        j2 c10 = r1Var.c();
        if (c10 != null) {
            B0(c10, th);
        }
    }

    private final boolean P0(r1 r1Var, Throwable th) {
        j2 e02 = e0(r1Var);
        if (e02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f479f, this, r1Var, new c(e02, false, th))) {
            return false;
        }
        A0(e02, th);
        return true;
    }

    private final Object Q0(Object obj, Object obj2) {
        fd.g0 g0Var;
        fd.g0 g0Var2;
        if (!(obj instanceof r1)) {
            g0Var2 = f2.f503a;
            return g0Var2;
        } else if (((obj instanceof f1) || (obj instanceof d2)) && !(obj instanceof t) && !(obj2 instanceof a0)) {
            if (!O0((r1) obj, obj2)) {
                g0Var = f2.f505c;
                return g0Var;
            }
            return obj2;
        } else {
            return R0((r1) obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object R0(r1 r1Var, Object obj) {
        c cVar;
        a0 a0Var;
        fd.g0 g0Var;
        fd.g0 g0Var2;
        fd.g0 g0Var3;
        j2 e02 = e0(r1Var);
        if (e02 == null) {
            g0Var3 = f2.f505c;
            return g0Var3;
        }
        ?? r22 = 0;
        if (r1Var instanceof c) {
            cVar = (c) r1Var;
        } else {
            cVar = null;
        }
        boolean z10 = false;
        if (cVar == null) {
            cVar = new c(e02, false, null);
        }
        qc.f0 f0Var = new qc.f0();
        synchronized (cVar) {
            if (cVar.h()) {
                g0Var2 = f2.f503a;
                return g0Var2;
            }
            cVar.k(true);
            if (cVar != r1Var && !androidx.concurrent.futures.b.a(f479f, this, r1Var, cVar)) {
                g0Var = f2.f505c;
                return g0Var;
            }
            boolean g10 = cVar.g();
            if (obj instanceof a0) {
                a0Var = (a0) obj;
            } else {
                a0Var = null;
            }
            if (a0Var != null) {
                cVar.a(a0Var.f462a);
            }
            Throwable f10 = cVar.f();
            if (!g10) {
                z10 = true;
            }
            if (Boolean.valueOf(z10).booleanValue()) {
                r22 = f10;
            }
            f0Var.f21676f = r22;
            dc.w wVar = dc.w.f13270a;
            if (r22 != 0) {
                A0(e02, r22);
            }
            t X = X(r1Var);
            if (X != null && S0(cVar, X, obj)) {
                return f2.f504b;
            }
            return W(cVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(c cVar, t tVar, Object obj) {
        t y02 = y0(tVar);
        if (y02 != null && S0(cVar, y02, obj)) {
            return;
        }
        C(W(cVar, obj));
    }

    private final boolean S0(c cVar, t tVar, Object obj) {
        while (x1.a.d(tVar.f557r, false, false, new b(this, cVar, tVar, obj), 1, null) == k2.f533f) {
            tVar = y0(tVar);
            if (tVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable U(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof Throwable;
        }
        if (z10) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(N(), null, this);
            }
            return th;
        }
        qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((m2) obj).l0();
    }

    private final Object W(c cVar, Object obj) {
        a0 a0Var;
        Throwable th;
        boolean g10;
        Throwable b02;
        qc.h hVar = null;
        if (obj instanceof a0) {
            a0Var = (a0) obj;
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            th = a0Var.f462a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            g10 = cVar.g();
            List<Throwable> j10 = cVar.j(th);
            b02 = b0(cVar, j10);
            if (b02 != null) {
                A(b02, j10);
            }
        }
        boolean z10 = false;
        if (b02 != null && b02 != th) {
            obj = new a0(b02, z10, 2, hVar);
        }
        if (b02 != null) {
            if (M(b02) || j0(b02)) {
                z10 = true;
            }
            if (z10) {
                qc.q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((a0) obj).b();
            }
        }
        if (!g10) {
            C0(b02);
        }
        D0(obj);
        androidx.concurrent.futures.b.a(f479f, this, cVar, f2.g(obj));
        P(cVar, obj);
        return obj;
    }

    private final t X(r1 r1Var) {
        t tVar;
        if (r1Var instanceof t) {
            tVar = (t) r1Var;
        } else {
            tVar = null;
        }
        if (tVar == null) {
            j2 c10 = r1Var.c();
            if (c10 == null) {
                return null;
            }
            return y0(c10);
        }
        return tVar;
    }

    private final Throwable a0(Object obj) {
        a0 a0Var;
        if (obj instanceof a0) {
            a0Var = (a0) obj;
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            return null;
        }
        return a0Var.f462a;
    }

    private final Throwable b0(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!cVar.g()) {
                return null;
            }
            return new JobCancellationException(N(), null, this);
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if ((!(((Throwable) obj) instanceof CancellationException)) != false) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final j2 e0(r1 r1Var) {
        j2 c10 = r1Var.c();
        if (c10 == null) {
            if (r1Var instanceof f1) {
                return new j2();
            }
            if (r1Var instanceof d2) {
                G0((d2) r1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + r1Var).toString());
        }
        return c10;
    }

    private final boolean o0() {
        Object h02;
        do {
            h02 = h0();
            if (!(h02 instanceof r1)) {
                return false;
            }
        } while (J0(h02) < 0);
        return true;
    }

    private final Object p0(Continuation<? super dc.w> continuation) {
        n nVar = new n(ic.b.c(continuation), 1);
        nVar.A();
        p.a(nVar, s0(new o2(nVar)));
        Object x10 = nVar.x();
        if (x10 == ic.b.d()) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        if (x10 == ic.b.d()) {
            return x10;
        }
        return dc.w.f13270a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qc.h] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [ad.e2] */
    private final Object r0(Object obj) {
        fd.g0 g0Var;
        fd.g0 g0Var2;
        fd.g0 g0Var3;
        fd.g0 g0Var4;
        fd.g0 g0Var5;
        fd.g0 g0Var6;
        ?? r02 = 0;
        Throwable th = null;
        while (true) {
            Object h02 = h0();
            if (h02 instanceof c) {
                synchronized (h02) {
                    if (((c) h02).i()) {
                        g0Var2 = f2.f506d;
                        return g0Var2;
                    }
                    boolean g10 = ((c) h02).g();
                    if (obj != null || !g10) {
                        if (th == null) {
                            th = U(obj);
                        }
                        ((c) h02).a(th);
                    }
                    Throwable f10 = ((c) h02).f();
                    if ((!g10) != false) {
                        r02 = f10;
                    }
                    if (r02 != 0) {
                        A0(((c) h02).c(), r02);
                    }
                    g0Var = f2.f503a;
                    return g0Var;
                }
            } else if (!(h02 instanceof r1)) {
                g0Var3 = f2.f506d;
                return g0Var3;
            } else {
                if (th == null) {
                    th = U(obj);
                }
                r1 r1Var = (r1) h02;
                if (r1Var.b()) {
                    if (P0(r1Var, th)) {
                        g0Var4 = f2.f503a;
                        return g0Var4;
                    }
                } else {
                    Object Q0 = Q0(h02, new a0(th, false, 2, r02));
                    g0Var5 = f2.f503a;
                    if (Q0 != g0Var5) {
                        g0Var6 = f2.f505c;
                        if (Q0 != g0Var6) {
                            return Q0;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + h02).toString());
                    }
                }
            }
        }
    }

    private final d2 v0(pc.l<? super Throwable, dc.w> lVar, boolean z10) {
        d2 d2Var = null;
        if (z10) {
            if (lVar instanceof y1) {
                d2Var = (y1) lVar;
            }
            if (d2Var == null) {
                d2Var = new v1(lVar);
            }
        } else {
            if (lVar instanceof d2) {
                d2Var = (d2) lVar;
            }
            if (d2Var == null) {
                d2Var = new w1(lVar);
            }
        }
        d2Var.t(this);
        return d2Var;
    }

    private final boolean y(Object obj, j2 j2Var, d2 d2Var) {
        int q10;
        d dVar = new d(d2Var, this, obj);
        do {
            q10 = j2Var.l().q(d2Var, j2Var, dVar);
            if (q10 == 1) {
                return true;
            }
        } while (q10 != 2);
        return false;
    }

    private final t y0(fd.r rVar) {
        while (rVar.m()) {
            rVar = rVar.l();
        }
        while (true) {
            rVar = rVar.k();
            if (!rVar.m()) {
                if (rVar instanceof t) {
                    return (t) rVar;
                }
                if (rVar instanceof j2) {
                    return null;
                }
            }
        }
    }

    @Override // ad.x1
    public final CancellationException B() {
        Object h02 = h0();
        if (h02 instanceof c) {
            Throwable f10 = ((c) h02).f();
            if (f10 != null) {
                CancellationException L0 = L0(f10, o0.a(this) + " is cancelling");
                if (L0 != null) {
                    return L0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(h02 instanceof r1)) {
            if (h02 instanceof a0) {
                return M0(this, ((a0) h02).f462a, null, 1, null);
            }
            return new JobCancellationException(o0.a(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object D(Continuation<Object> continuation) {
        Object h02;
        do {
            h02 = h0();
            if (!(h02 instanceof r1)) {
                if (!(h02 instanceof a0)) {
                    return f2.h(h02);
                }
                throw ((a0) h02).f462a;
            }
        } while (J0(h02) < 0);
        return F(continuation);
    }

    public final boolean G(Throwable th) {
        return H(th);
    }

    public final boolean H(Object obj) {
        Object obj2;
        fd.g0 g0Var;
        fd.g0 g0Var2;
        fd.g0 g0Var3;
        obj2 = f2.f503a;
        if (!d0() || (obj2 = K(obj)) != f2.f504b) {
            g0Var = f2.f503a;
            if (obj2 == g0Var) {
                obj2 = r0(obj);
            }
            g0Var2 = f2.f503a;
            if (obj2 != g0Var2 && obj2 != f2.f504b) {
                g0Var3 = f2.f506d;
                if (obj2 == g0Var3) {
                    return false;
                }
                C(obj2);
                return true;
            }
            return true;
        }
        return true;
    }

    public final void H0(d2 d2Var) {
        Object h02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f1 f1Var;
        do {
            h02 = h0();
            if (h02 instanceof d2) {
                if (h02 != d2Var) {
                    return;
                }
                atomicReferenceFieldUpdater = f479f;
                f1Var = f2.f509g;
            } else if ((h02 instanceof r1) && ((r1) h02).c() != null) {
                d2Var.n();
                return;
            } else {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, h02, f1Var));
    }

    public final void I0(s sVar) {
        f480m.set(this, sVar);
    }

    public void J(Throwable th) {
        H(th);
    }

    @Override // ad.x1
    public final s L(u uVar) {
        c1 d10 = x1.a.d(this, true, false, new t(uVar), 2, null);
        qc.q.g(d10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (s) d10;
    }

    protected final CancellationException L0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = N();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String N() {
        return "Job was cancelled";
    }

    public final String N0() {
        return w0() + '{' + K0(h0()) + '}';
    }

    public boolean O(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (H(th) && c0()) {
            return true;
        }
        return false;
    }

    @Override // ad.x1
    public final c1 Q(boolean z10, boolean z11, pc.l<? super Throwable, dc.w> lVar) {
        a0 a0Var;
        d2 v02 = v0(lVar, z10);
        while (true) {
            Object h02 = h0();
            if (h02 instanceof f1) {
                f1 f1Var = (f1) h02;
                if (f1Var.b()) {
                    if (androidx.concurrent.futures.b.a(f479f, this, h02, v02)) {
                        return v02;
                    }
                } else {
                    F0(f1Var);
                }
            } else {
                Throwable th = null;
                if (h02 instanceof r1) {
                    j2 c10 = ((r1) h02).c();
                    if (c10 == null) {
                        qc.q.g(h02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        G0((d2) h02);
                    } else {
                        c1 c1Var = k2.f533f;
                        if (z10 && (h02 instanceof c)) {
                            synchronized (h02) {
                                th = ((c) h02).f();
                                if (th == null || ((lVar instanceof t) && !((c) h02).h())) {
                                    if (y(h02, c10, v02)) {
                                        if (th == null) {
                                            return v02;
                                        }
                                        c1Var = v02;
                                    }
                                }
                                dc.w wVar = dc.w.f13270a;
                            }
                        }
                        if (th != null) {
                            if (z11) {
                                lVar.invoke(th);
                            }
                            return c1Var;
                        } else if (y(h02, c10, v02)) {
                            return v02;
                        }
                    }
                } else {
                    if (z11) {
                        if (h02 instanceof a0) {
                            a0Var = (a0) h02;
                        } else {
                            a0Var = null;
                        }
                        if (a0Var != null) {
                            th = a0Var.f462a;
                        }
                        lVar.invoke(th);
                    }
                    return k2.f533f;
                }
            }
        }
    }

    public final Object Z() {
        Object h02 = h0();
        if ((!(h02 instanceof r1)) != false) {
            if (!(h02 instanceof a0)) {
                return f2.h(h02);
            }
            throw ((a0) h02).f462a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // ad.x1
    public boolean b() {
        Object h02 = h0();
        if ((h02 instanceof r1) && ((r1) h02).b()) {
            return true;
        }
        return false;
    }

    @Override // ad.x1
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(N(), null, this);
        }
        J(cancellationException);
    }

    public boolean c0() {
        return true;
    }

    public boolean d0() {
        return false;
    }

    @Override // hc.f
    public <R> R fold(R r10, pc.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) x1.a.b(this, r10, pVar);
    }

    public final s g0() {
        return (s) f480m.get(this);
    }

    @Override // hc.f.b, hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        return (E) x1.a.c(this, cVar);
    }

    @Override // hc.f.b
    public final f.c<?> getKey() {
        return x1.f574b;
    }

    @Override // ad.x1
    public x1 getParent() {
        s g02 = g0();
        if (g02 != null) {
            return g02.getParent();
        }
        return null;
    }

    public final Object h0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f479f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof fd.z)) {
                return obj;
            }
            ((fd.z) obj).a(this);
        }
    }

    @Override // ad.x1
    public final boolean isCancelled() {
        Object h02 = h0();
        if (!(h02 instanceof a0) && (!(h02 instanceof c) || !((c) h02).g())) {
            return false;
        }
        return true;
    }

    protected boolean j0(Throwable th) {
        return false;
    }

    @Override // ad.m2
    public CancellationException l0() {
        Throwable th;
        Object h02 = h0();
        CancellationException cancellationException = null;
        if (h02 instanceof c) {
            th = ((c) h02).f();
        } else if (h02 instanceof a0) {
            th = ((a0) h02).f462a;
        } else if (!(h02 instanceof r1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + h02).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + K0(h02), th, this);
        }
        return cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m0(x1 x1Var) {
        if (x1Var == null) {
            I0(k2.f533f);
            return;
        }
        x1Var.start();
        s L = x1Var.L(this);
        I0(L);
        if (x0()) {
            L.dispose();
            I0(k2.f533f);
        }
    }

    @Override // hc.f
    public hc.f minusKey(f.c<?> cVar) {
        return x1.a.e(this, cVar);
    }

    protected boolean n0() {
        return false;
    }

    @Override // hc.f
    public hc.f plus(hc.f fVar) {
        return x1.a.f(this, fVar);
    }

    @Override // ad.u
    public final void q(m2 m2Var) {
        H(m2Var);
    }

    @Override // ad.x1
    public final c1 s0(pc.l<? super Throwable, dc.w> lVar) {
        return Q(false, true, lVar);
    }

    @Override // ad.x1
    public final boolean start() {
        int J0;
        do {
            J0 = J0(h0());
            if (J0 == 0) {
                return false;
            }
        } while (J0 != 1);
        return true;
    }

    public final boolean t0(Object obj) {
        Object Q0;
        fd.g0 g0Var;
        fd.g0 g0Var2;
        do {
            Q0 = Q0(h0(), obj);
            g0Var = f2.f503a;
            if (Q0 == g0Var) {
                return false;
            }
            if (Q0 != f2.f504b) {
                g0Var2 = f2.f505c;
            } else {
                return true;
            }
        } while (Q0 == g0Var2);
        C(Q0);
        return true;
    }

    public String toString() {
        return N0() + '@' + o0.b(this);
    }

    public final Object u0(Object obj) {
        Object Q0;
        fd.g0 g0Var;
        fd.g0 g0Var2;
        do {
            Q0 = Q0(h0(), obj);
            g0Var = f2.f503a;
            if (Q0 != g0Var) {
                g0Var2 = f2.f505c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, a0(obj));
            }
        } while (Q0 == g0Var2);
        return Q0;
    }

    public String w0() {
        return o0.a(this);
    }

    @Override // ad.x1
    public final xc.g<x1> x() {
        return xc.j.b(new e(null));
    }

    @Override // ad.x1
    public final boolean x0() {
        return !(h0() instanceof r1);
    }

    @Override // ad.x1
    public final Object z(Continuation<? super dc.w> continuation) {
        if (!o0()) {
            a2.k(continuation.getContext());
            return dc.w.f13270a;
        }
        Object p02 = p0(continuation);
        if (p02 == ic.b.d()) {
            return p02;
        }
        return dc.w.f13270a;
    }

    protected void E0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C(Object obj) {
    }

    protected void C0(Throwable th) {
    }

    protected void D0(Object obj) {
    }

    public void k0(Throwable th) {
        throw th;
    }
}
