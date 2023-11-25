package fd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes4.dex */
public class r {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15666f = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next");

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15667m = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_prev");

    /* renamed from: p  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15668p = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes4.dex */
    public static abstract class a extends fd.b<r> {

        /* renamed from: b  reason: collision with root package name */
        public final r f15669b;

        /* renamed from: c  reason: collision with root package name */
        public r f15670c;

        public a(r rVar) {
            this.f15669b = rVar;
        }

        @Override // fd.b
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public void b(r rVar, Object obj) {
            boolean z10;
            r rVar2;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                rVar2 = this.f15669b;
            } else {
                rVar2 = this.f15670c;
            }
            if (rVar2 != null && androidx.concurrent.futures.b.a(r.f15666f, rVar, this, rVar2) && z10) {
                r rVar3 = this.f15669b;
                r rVar4 = this.f15670c;
                qc.q.f(rVar4);
                rVar3.i(rVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((fd.a0) r5).f15619a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final fd.r g(fd.z r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = fd.r.f15667m
            java.lang.Object r0 = r0.get(r8)
            fd.r r0 = (fd.r) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = fd.r.f15666f
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = fd.r.f15667m
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.m()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof fd.z
            if (r6 == 0) goto L34
            fd.z r5 = (fd.z) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof fd.a0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            fd.a0 r5 = (fd.a0) r5
            fd.r r5 = r5.f15619a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = fd.r.f15667m
            java.lang.Object r2 = r4.get(r2)
            fd.r r2 = (fd.r) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            qc.q.g(r5, r3)
            r3 = r5
            fd.r r3 = (fd.r) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.r.g(fd.z):fd.r");
    }

    private final r h(r rVar) {
        while (rVar.m()) {
            rVar = (r) f15667m.get(rVar);
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(r rVar) {
        r rVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15667m;
        do {
            rVar2 = (r) atomicReferenceFieldUpdater.get(rVar);
            if (j() != rVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f15667m, rVar, rVar2, this));
        if (m()) {
            rVar.g(null);
        }
    }

    private final a0 p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15668p;
        a0 a0Var = (a0) atomicReferenceFieldUpdater.get(this);
        if (a0Var == null) {
            a0 a0Var2 = new a0(this);
            atomicReferenceFieldUpdater.lazySet(this, a0Var2);
            return a0Var2;
        }
        return a0Var;
    }

    public final boolean f(r rVar) {
        f15667m.lazySet(rVar, this);
        f15666f.lazySet(rVar, this);
        while (j() == this) {
            if (androidx.concurrent.futures.b.a(f15666f, this, this, rVar)) {
                rVar.i(this);
                return true;
            }
        }
        return false;
    }

    public final Object j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15666f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z)) {
                return obj;
            }
            ((z) obj).a(this);
        }
    }

    public final r k() {
        return q.b(j());
    }

    public final r l() {
        r g10 = g(null);
        if (g10 == null) {
            return h((r) f15667m.get(this));
        }
        return g10;
    }

    public boolean m() {
        return j() instanceof a0;
    }

    public boolean n() {
        if (o() == null) {
            return true;
        }
        return false;
    }

    public final r o() {
        Object j10;
        r rVar;
        do {
            j10 = j();
            if (j10 instanceof a0) {
                return ((a0) j10).f15619a;
            }
            if (j10 == this) {
                return (r) j10;
            }
            qc.q.g(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            rVar = (r) j10;
        } while (!androidx.concurrent.futures.b.a(f15666f, this, j10, rVar.p()));
        rVar.g(null);
        return null;
    }

    public final int q(r rVar, r rVar2, a aVar) {
        f15667m.lazySet(rVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15666f;
        atomicReferenceFieldUpdater.lazySet(rVar, rVar2);
        aVar.f15670c = rVar2;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, rVar2, aVar)) {
            return 0;
        }
        if (aVar.a(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new qc.x(this) { // from class: fd.r.b
            @Override // wc.f
            public Object get() {
                return ad.o0.a(this.f21661m);
            }
        } + '@' + ad.o0.b(this);
    }
}
