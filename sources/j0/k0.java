package j0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
final class k0 implements Iterator<u0.b>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final k2 f18674f;

    /* renamed from: m  reason: collision with root package name */
    private final int f18675m;

    /* renamed from: p  reason: collision with root package name */
    private int f18676p;

    /* renamed from: q  reason: collision with root package name */
    private final int f18677q;

    public k0(k2 k2Var, int i10, int i11) {
        qc.q.i(k2Var, "table");
        this.f18674f = k2Var;
        this.f18675m = i11;
        this.f18676p = i10;
        this.f18677q = k2Var.o();
        if (!k2Var.p()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    private final void c() {
        if (this.f18674f.o() == this.f18677q) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public u0.b next() {
        int G;
        c();
        int i10 = this.f18676p;
        G = m2.G(this.f18674f.k(), i10);
        this.f18676p = G + i10;
        return new l2(this.f18674f, i10, this.f18677q);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f18676p < this.f18675m) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
