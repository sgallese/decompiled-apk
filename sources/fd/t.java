package fd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes4.dex */
public final class t<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15672e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15673f = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f15674g = AtomicLongFieldUpdater.newUpdater(t.class, "_state");

    /* renamed from: h  reason: collision with root package name */
    public static final g0 f15675h = new g0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    private final int f15676a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15677b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15678c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReferenceArray f15679d;

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a(long j10) {
            if ((j10 & 2305843009213693952L) != 0) {
                return 2;
            }
            return 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | (i10 << 0);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (i10 << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f15680a;

        public b(int i10) {
            this.f15680a = i10;
        }
    }

    public t(int i10, boolean z10) {
        boolean z11;
        this.f15676a = i10;
        this.f15677b = z10;
        int i11 = i10 - 1;
        this.f15678c = i11;
        this.f15679d = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((i10 & i11) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final t<E> b(long j10) {
        t<E> tVar = new t<>(this.f15676a * 2, this.f15677b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f15678c;
            if ((i10 & i12) != (i11 & i12)) {
                Object obj = this.f15679d.get(i12 & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                tVar.f15679d.set(tVar.f15678c & i10, obj);
                i10++;
            } else {
                f15674g.set(tVar, f15672e.d(j10, 1152921504606846976L));
                return tVar;
            }
        }
    }

    private final t<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15673f;
        while (true) {
            t<E> tVar = (t) atomicReferenceFieldUpdater.get(this);
            if (tVar != null) {
                return tVar;
            }
            androidx.concurrent.futures.b.a(f15673f, this, null, b(j10));
        }
    }

    private final t<E> e(int i10, E e10) {
        Object obj = this.f15679d.get(this.f15678c & i10);
        if ((obj instanceof b) && ((b) obj).f15680a == i10) {
            this.f15679d.set(i10 & this.f15678c, e10);
            return this;
        }
        return null;
    }

    private final long h() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15674g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final t<E> k(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15674g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) ((1073741823 & j10) >> 0);
            if ((1152921504606846976L & j10) != 0) {
                return i();
            }
        } while (!f15674g.compareAndSet(this, j10, f15672e.b(j10, i11)));
        this.f15679d.set(this.f15678c & i12, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = fd.t.f15674g
        L2:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L16
            fd.t$a r14 = fd.t.f15672e
            int r14 = r14.a(r3)
            return r14
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r2 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r1 = 30
            long r5 = r5 >> r1
            int r10 = (int) r5
            int r11 = r13.f15678c
            int r1 = r10 + 2
            r1 = r1 & r11
            r5 = r2 & r11
            r6 = 1
            if (r1 != r5) goto L32
            return r6
        L32:
            boolean r1 = r13.f15677b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r13.f15679d
            r12 = r10 & r11
            java.lang.Object r1 = r1.get(r12)
            if (r1 == 0) goto L51
            int r1 = r13.f15676a
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L50
            int r10 = r10 - r2
            r2 = r10 & r5
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L50:
            return r6
        L51:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = fd.t.f15674g
            fd.t$a r5 = fd.t.f15672e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f15679d
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = fd.t.f15674g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L83
            fd.t r0 = r0.i()
            fd.t r0 = r0.e(r10, r14)
            if (r0 != 0) goto L6c
        L83:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.t.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15674g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j10 = f15674g.get(this);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    public final boolean g() {
        long j10 = f15674g.get(this);
        if (((int) ((1073741823 & j10) >> 0)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
            return false;
        }
        return true;
    }

    public final t<E> i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f15674g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f15675h;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f15678c;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f15679d.get(i12 & i10);
            if (obj == null) {
                if (this.f15677b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i13 = (i10 + 1) & 1073741823;
                if (f15674g.compareAndSet(this, j10, f15672e.b(j10, i13))) {
                    this.f15679d.set(this.f15678c & i10, null);
                    return obj;
                } else if (this.f15677b) {
                    t<E> tVar = this;
                    do {
                        tVar = tVar.k(i10, i13);
                    } while (tVar != null);
                    return obj;
                }
            }
        }
    }
}
