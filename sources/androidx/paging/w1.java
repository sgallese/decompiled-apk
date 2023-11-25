package androidx.paging;

import androidx.paging.u1;
import java.util.List;

/* compiled from: PagingState.kt */
/* loaded from: classes.dex */
public final class w1<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final List<u1.b.C0145b<Key, Value>> f6141a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f6142b;

    /* renamed from: c  reason: collision with root package name */
    private final r1 f6143c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6144d;

    public w1(List<u1.b.C0145b<Key, Value>> list, Integer num, r1 r1Var, int i10) {
        qc.q.i(list, "pages");
        qc.q.i(r1Var, "config");
        this.f6141a = list;
        this.f6142b = num;
        this.f6143c = r1Var;
        this.f6144d = i10;
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x0041 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Value b(int r7) {
        /*
            r6 = this;
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r0 = r6.f6141a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
        L13:
            r0 = 1
            goto L30
        L15:
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L13
            java.lang.Object r1 = r0.next()
            androidx.paging.u1$b$b r1 = (androidx.paging.u1.b.C0145b) r1
            java.util.List r1 = r1.e()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L19
            r0 = 0
        L30:
            if (r0 == 0) goto L34
            r7 = 0
            return r7
        L34:
            int r0 = a(r6)
            int r7 = r7 - r0
        L39:
            java.util.List r0 = r6.e()
            int r0 = ec.r.k(r0)
            if (r2 >= r0) goto L6d
            java.util.List r0 = r6.e()
            java.lang.Object r0 = r0.get(r2)
            androidx.paging.u1$b$b r0 = (androidx.paging.u1.b.C0145b) r0
            java.util.List r0 = r0.e()
            int r0 = ec.r.k(r0)
            if (r7 <= r0) goto L6d
            java.util.List r0 = r6.e()
            java.lang.Object r0 = r0.get(r2)
            androidx.paging.u1$b$b r0 = (androidx.paging.u1.b.C0145b) r0
            java.util.List r0 = r0.e()
            int r0 = r0.size()
            int r7 = r7 - r0
            int r2 = r2 + 1
            goto L39
        L6d:
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r0 = r6.f6141a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf8
            java.lang.Object r1 = r0.next()
            androidx.paging.u1$b$b r1 = (androidx.paging.u1.b.C0145b) r1
            java.util.List r4 = r1.e()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L75
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r0 = r6.f6141a
            int r4 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r4)
        L98:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto Lf0
            java.lang.Object r4 = r0.previous()
            androidx.paging.u1$b$b r4 = (androidx.paging.u1.b.C0145b) r4
            java.util.List r5 = r4.e()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            if (r5 == 0) goto L98
            if (r7 >= 0) goto Lbc
            java.util.List r7 = r1.e()
            java.lang.Object r7 = ec.r.a0(r7)
            goto Lef
        Lbc:
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r0 = r6.f6141a
            int r0 = ec.r.k(r0)
            if (r2 != r0) goto Ldf
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r0 = r6.f6141a
            java.lang.Object r0 = ec.r.m0(r0)
            androidx.paging.u1$b$b r0 = (androidx.paging.u1.b.C0145b) r0
            java.util.List r0 = r0.e()
            int r0 = ec.r.k(r0)
            if (r7 <= r0) goto Ldf
            java.util.List r7 = r4.e()
            java.lang.Object r7 = ec.r.m0(r7)
            goto Lef
        Ldf:
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r0 = r6.f6141a
            java.lang.Object r0 = r0.get(r2)
            androidx.paging.u1$b$b r0 = (androidx.paging.u1.b.C0145b) r0
            java.util.List r0 = r0.e()
            java.lang.Object r7 = r0.get(r7)
        Lef:
            return r7
        Lf0:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "List contains no element matching the predicate."
            r7.<init>(r0)
            throw r7
        Lf8:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.w1.b(int):java.lang.Object");
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x0040 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.paging.u1.b.C0145b<Key, Value> c(int r5) {
        /*
            r4 = this;
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r0 = r4.f6141a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            goto L2f
        L14:
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            androidx.paging.u1$b$b r1 = (androidx.paging.u1.b.C0145b) r1
            java.util.List r1 = r1.e()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L18
            r3 = 0
        L2f:
            if (r3 == 0) goto L33
            r5 = 0
            return r5
        L33:
            int r0 = a(r4)
            int r5 = r5 - r0
        L38:
            java.util.List r0 = r4.e()
            int r0 = ec.r.k(r0)
            if (r2 >= r0) goto L6c
            java.util.List r0 = r4.e()
            java.lang.Object r0 = r0.get(r2)
            androidx.paging.u1$b$b r0 = (androidx.paging.u1.b.C0145b) r0
            java.util.List r0 = r0.e()
            int r0 = ec.r.k(r0)
            if (r5 <= r0) goto L6c
            java.util.List r0 = r4.e()
            java.lang.Object r0 = r0.get(r2)
            androidx.paging.u1$b$b r0 = (androidx.paging.u1.b.C0145b) r0
            java.util.List r0 = r0.e()
            int r0 = r0.size()
            int r5 = r5 - r0
            int r2 = r2 + 1
            goto L38
        L6c:
            if (r5 >= 0) goto L77
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r5 = r4.f6141a
            java.lang.Object r5 = ec.r.a0(r5)
            androidx.paging.u1$b$b r5 = (androidx.paging.u1.b.C0145b) r5
            goto L7f
        L77:
            java.util.List<androidx.paging.u1$b$b<Key, Value>> r5 = r4.f6141a
            java.lang.Object r5 = r5.get(r2)
            androidx.paging.u1$b$b r5 = (androidx.paging.u1.b.C0145b) r5
        L7f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.w1.c(int):androidx.paging.u1$b$b");
    }

    public final Integer d() {
        return this.f6142b;
    }

    public final List<u1.b.C0145b<Key, Value>> e() {
        return this.f6141a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            if (qc.q.d(this.f6141a, w1Var.f6141a) && qc.q.d(this.f6142b, w1Var.f6142b) && qc.q.d(this.f6143c, w1Var.f6143c) && this.f6144d == w1Var.f6144d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f6141a.hashCode();
        Integer num = this.f6142b;
        if (num != null) {
            i10 = num.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10 + this.f6143c.hashCode() + this.f6144d;
    }

    public String toString() {
        return "PagingState(pages=" + this.f6141a + ", anchorPosition=" + this.f6142b + ", config=" + this.f6143c + ", leadingPlaceholderCount=" + this.f6144d + ')';
    }
}
