package ec;

import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes4.dex */
public abstract class h0 implements Iterator<Integer>, rc.a {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
