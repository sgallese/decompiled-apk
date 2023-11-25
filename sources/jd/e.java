package jd;

import ad.b3;
import ad.m;
import dc.w;
import id.j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.h;
import pc.l;
import pc.p;
import qc.n;
import qc.q;
import qc.r;

/* compiled from: Semaphore.kt */
/* loaded from: classes4.dex */
public class e implements d {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19102c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "head");

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f19103d = AtomicLongFieldUpdater.newUpdater(e.class, "deqIdx");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19104e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "tail");

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f19105f = AtomicLongFieldUpdater.newUpdater(e.class, "enqIdx");

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f19106g = AtomicIntegerFieldUpdater.newUpdater(e.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    private final int f19107a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Throwable, w> f19108b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Semaphore.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends n implements p<Long, g, g> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f19109w = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final g h(long j10, g gVar) {
            g j11;
            j11 = f.j(j10, gVar);
            return j11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ g invoke(Long l10, g gVar) {
            return h(l10.longValue(), gVar);
        }
    }

    /* compiled from: Semaphore.kt */
    /* loaded from: classes4.dex */
    static final class b extends r implements l<Throwable, w> {
        b() {
            super(1);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(Throwable th) {
            invoke2(th);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            e.this.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Semaphore.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c extends n implements p<Long, g, g> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f19111w = new c();

        c() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final g h(long j10, g gVar) {
            g j11;
            j11 = f.j(j10, gVar);
            return j11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ g invoke(Long l10, g gVar) {
            return h(l10.longValue(), gVar);
        }
    }

    public e(int i10, int i11) {
        boolean z10;
        this.f19107a = i10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0 && i11 <= i10) {
                g gVar = new g(0L, null, 2);
                this.head = gVar;
                this.tail = gVar;
                this._availablePermits = i10 - i11;
                this.f19108b = new b();
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
    }

    static /* synthetic */ Object g(e eVar, Continuation<? super w> continuation) {
        Object d10;
        if (eVar.k() > 0) {
            return w.f13270a;
        }
        Object h10 = eVar.h(continuation);
        d10 = ic.d.d();
        if (h10 == d10) {
            return h10;
        }
        return w.f13270a;
    }

    private final Object h(Continuation<? super w> continuation) {
        Continuation c10;
        Object d10;
        Object d11;
        c10 = ic.c.c(continuation);
        ad.n b10 = ad.p.b(c10);
        try {
            if (!i(b10)) {
                f(b10);
            }
            Object x10 = b10.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return w.f13270a;
        } catch (Throwable th) {
            b10.J();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        r10 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(ad.b3 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = jd.e.f19104e
            java.lang.Object r3 = r2.get(r0)
            jd.g r3 = (jd.g) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = jd.e.f19105f
            long r4 = r4.getAndIncrement(r0)
            jd.e$a r6 = jd.e.a.f19109w
            int r7 = jd.f.h()
            long r7 = (long) r7
            long r7 = r4 / r7
        L1b:
            java.lang.Object r9 = fd.d.c(r3, r7, r6)
            boolean r10 = fd.e0.c(r9)
            if (r10 != 0) goto L5e
            fd.d0 r10 = fd.e0.b(r9)
        L29:
            java.lang.Object r13 = r2.get(r0)
            fd.d0 r13 = (fd.d0) r13
            long r14 = r13.f15625p
            long r11 = r10.f15625p
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L39
        L37:
            r10 = 1
            goto L51
        L39:
            boolean r11 = r10.q()
            if (r11 != 0) goto L41
            r10 = 0
            goto L51
        L41:
            boolean r11 = androidx.concurrent.futures.b.a(r2, r0, r13, r10)
            if (r11 == 0) goto L54
            boolean r10 = r13.m()
            if (r10 == 0) goto L37
            r13.k()
            goto L37
        L51:
            if (r10 == 0) goto L1b
            goto L5e
        L54:
            boolean r11 = r10.m()
            if (r11 == 0) goto L29
            r10.k()
            goto L29
        L5e:
            fd.d0 r2 = fd.e0.b(r9)
            jd.g r2 = (jd.g) r2
            int r3 = jd.f.h()
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r2.r()
            r5 = 0
            boolean r4 = cd.i.a(r4, r3, r5, r1)
            if (r4 == 0) goto L7b
            r1.b(r2, r3)
            r1 = 1
            return r1
        L7b:
            fd.g0 r4 = jd.f.g()
            fd.g0 r5 = jd.f.i()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.r()
            boolean r2 = cd.i.a(r2, r3, r4, r5)
            if (r2 == 0) goto Lc9
            boolean r2 = r1 instanceof ad.m
            if (r2 == 0) goto La1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            qc.q.g(r1, r2)
            ad.m r1 = (ad.m) r1
            dc.w r2 = dc.w.f13270a
            pc.l<java.lang.Throwable, dc.w> r3 = r0.f19108b
            r1.d(r2, r3)
        L9f:
            r1 = 1
            goto Lad
        La1:
            boolean r2 = r1 instanceof id.j
            if (r2 == 0) goto Lae
            id.j r1 = (id.j) r1
            dc.w r2 = dc.w.f13270a
            r1.f(r2)
            goto L9f
        Lad:
            return r1
        Lae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lc9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.e.i(ad.b3):boolean");
    }

    private final void j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        do {
            atomicIntegerFieldUpdater = f19106g;
            i10 = atomicIntegerFieldUpdater.get(this);
            i11 = this.f19107a;
            if (i10 <= i11) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
    }

    private final int k() {
        int andDecrement;
        do {
            andDecrement = f19106g.getAndDecrement(this);
        } while (andDecrement > this.f19107a);
        return andDecrement;
    }

    private final boolean n(Object obj) {
        if (obj instanceof m) {
            q.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            m mVar = (m) obj;
            Object t10 = mVar.t(w.f13270a, null, this.f19108b);
            if (t10 != null) {
                mVar.w(t10);
                return true;
            }
            return false;
        } else if (obj instanceof j) {
            return ((j) obj).c(this, w.f13270a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean o() {
        /*
            r16 = this;
            r0 = r16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = jd.e.f19102c
            java.lang.Object r2 = r1.get(r0)
            jd.g r2 = (jd.g) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = jd.e.f19103d
            long r3 = r3.getAndIncrement(r0)
            int r5 = jd.f.h()
            long r5 = (long) r5
            long r5 = r3 / r5
            jd.e$c r7 = jd.e.c.f19111w
        L19:
            java.lang.Object r8 = fd.d.c(r2, r5, r7)
            boolean r9 = fd.e0.c(r8)
            if (r9 != 0) goto L5c
            fd.d0 r9 = fd.e0.b(r8)
        L27:
            java.lang.Object r12 = r1.get(r0)
            fd.d0 r12 = (fd.d0) r12
            long r13 = r12.f15625p
            long r10 = r9.f15625p
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 < 0) goto L37
        L35:
            r9 = 1
            goto L4f
        L37:
            boolean r10 = r9.q()
            if (r10 != 0) goto L3f
            r9 = 0
            goto L4f
        L3f:
            boolean r10 = androidx.concurrent.futures.b.a(r1, r0, r12, r9)
            if (r10 == 0) goto L52
            boolean r9 = r12.m()
            if (r9 == 0) goto L35
            r12.k()
            goto L35
        L4f:
            if (r9 == 0) goto L19
            goto L5c
        L52:
            boolean r10 = r9.m()
            if (r10 == 0) goto L27
            r9.k()
            goto L27
        L5c:
            fd.d0 r1 = fd.e0.b(r8)
            jd.g r1 = (jd.g) r1
            r1.b()
            long r7 = r1.f15625p
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6d
            r2 = 0
            return r2
        L6d:
            int r2 = jd.f.h()
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            fd.g0 r3 = jd.f.g()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto Lb0
            int r3 = jd.f.f()
            r10 = 0
        L87:
            if (r10 >= r3) goto L9d
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r4 = r4.get(r2)
            fd.g0 r5 = jd.f.i()
            if (r4 != r5) goto L99
            r4 = 1
            return r4
        L99:
            r4 = 1
            int r10 = r10 + 1
            goto L87
        L9d:
            r4 = 1
            fd.g0 r3 = jd.f.g()
            fd.g0 r5 = jd.f.d()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.r()
            boolean r1 = cd.i.a(r1, r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        Lb0:
            fd.g0 r1 = jd.f.e()
            if (r3 != r1) goto Lb8
            r1 = 0
            return r1
        Lb8:
            boolean r1 = r0.n(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.e.o():boolean");
    }

    @Override // jd.d
    public Object b(Continuation<? super w> continuation) {
        return g(this, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(m<? super w> mVar) {
        while (k() <= 0) {
            q.g(mVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (i((b3) mVar)) {
                return;
            }
        }
        mVar.d(w.f13270a, this.f19108b);
    }

    public int l() {
        return Math.max(f19106g.get(this), 0);
    }

    public boolean m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19106g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f19107a) {
                j();
            } else if (i10 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    @Override // jd.d
    public void release() {
        do {
            int andIncrement = f19106g.getAndIncrement(this);
            if (andIncrement < this.f19107a) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                j();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f19107a).toString());
            }
        } while (!o());
    }
}
