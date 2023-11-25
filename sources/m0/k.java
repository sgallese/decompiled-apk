package m0;

import java.util.NoSuchElementException;
import qc.q;

/* compiled from: TrieIterator.kt */
/* loaded from: classes.dex */
public final class k<E> extends a<E> {

    /* renamed from: p  reason: collision with root package name */
    private int f19729p;

    /* renamed from: q  reason: collision with root package name */
    private Object[] f19730q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f19731r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        ?? r52;
        q.i(objArr, "root");
        this.f19729p = i12;
        Object[] objArr2 = new Object[i12];
        this.f19730q = objArr2;
        if (i10 == i11) {
            r52 = 1;
        } else {
            r52 = 0;
        }
        this.f19731r = r52;
        objArr2[0] = objArr;
        j(i10 - r52, 1);
    }

    private final E i() {
        int d10 = d() & 31;
        Object obj = this.f19730q[this.f19729p - 1];
        q.g(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[d10];
    }

    private final void j(int i10, int i11) {
        int i12 = (this.f19729p - i11) * 5;
        while (i11 < this.f19729p) {
            Object[] objArr = this.f19730q;
            Object[] objArr2 = objArr[i11 - 1];
            q.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = objArr2[l.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void k(int i10) {
        int i11 = 0;
        while (l.a(d(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            j(d(), ((this.f19729p - 1) - (i11 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void l(Object[] objArr, int i10, int i11, int i12) {
        q.i(objArr, "root");
        f(i10);
        h(i11);
        this.f19729p = i12;
        if (this.f19730q.length < i12) {
            this.f19730q = new Object[i12];
        }
        ?? r02 = 0;
        this.f19730q[0] = objArr;
        if (i10 == i11) {
            r02 = 1;
        }
        this.f19731r = r02;
        j(i10 - r02, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E i10 = i();
            f(d() + 1);
            if (d() == e()) {
                this.f19731r = true;
                return i10;
            }
            k(0);
            return i10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            f(d() - 1);
            if (this.f19731r) {
                this.f19731r = false;
                return i();
            }
            k(31);
            return i();
        }
        throw new NoSuchElementException();
    }
}
