package cd;

import fd.d0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes4.dex */
public final class j<E> extends d0<j<E>> {

    /* renamed from: r  reason: collision with root package name */
    private final b<E> f9011r;

    /* renamed from: s  reason: collision with root package name */
    private final AtomicReferenceArray f9012s;

    public j(long j10, j<E> jVar, b<E> bVar, int i10) {
        super(j10, jVar, i10);
        this.f9011r = bVar;
        this.f9012s = new AtomicReferenceArray(c.f8984b * 2);
    }

    private final void z(int i10, Object obj) {
        this.f9012s.lazySet(i10 * 2, obj);
    }

    public final void A(int i10, Object obj) {
        this.f9012s.set((i10 * 2) + 1, obj);
    }

    public final void B(int i10, E e10) {
        z(i10, e10);
    }

    @Override // fd.d0
    public int n() {
        return c.f8984b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = u().f8960m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        fd.y.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // fd.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r4, java.lang.Throwable r5, hc.f r6) {
        /*
            r3 = this;
            int r5 = cd.c.f8984b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof ad.b3
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof cd.t
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            fd.g0 r2 = cd.c.j()
            if (r1 == r2) goto L63
            fd.g0 r2 = cd.c.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            fd.g0 r2 = cd.c.p()
            if (r1 == r2) goto Le
            fd.g0 r2 = cd.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            fd.g0 r4 = cd.c.f()
            if (r1 == r4) goto L62
            fd.g0 r4 = cd.c.f8986d
            if (r1 != r4) goto L40
            goto L62
        L40:
            fd.g0 r4 = cd.c.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            cd.b r4 = r3.u()
            pc.l<E, dc.w> r4 = r4.f8960m
            if (r4 == 0) goto L73
            fd.y.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            fd.g0 r2 = cd.c.j()
            goto L7f
        L7b:
            fd.g0 r2 = cd.c.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            cd.b r4 = r3.u()
            pc.l<E, dc.w> r4 = r4.f8960m
            if (r4 == 0) goto L9a
            fd.y.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.j.o(int, java.lang.Throwable, hc.f):void");
    }

    public final boolean r(int i10, Object obj, Object obj2) {
        return i.a(this.f9012s, (i10 * 2) + 1, obj, obj2);
    }

    public final void s(int i10) {
        z(i10, null);
    }

    public final Object t(int i10, Object obj) {
        return this.f9012s.getAndSet((i10 * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f9011r;
        qc.q.f(bVar);
        return bVar;
    }

    public final E v(int i10) {
        return (E) this.f9012s.get(i10 * 2);
    }

    public final Object w(int i10) {
        return this.f9012s.get((i10 * 2) + 1);
    }

    public final void x(int i10, boolean z10) {
        if (z10) {
            u().T0((this.f15625p * c.f8984b) + i10);
        }
        p();
    }

    public final E y(int i10) {
        E v10 = v(i10);
        s(i10);
        return v10;
    }
}
