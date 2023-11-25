package ec;

import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: classes4.dex */
public abstract class i0 implements Iterator<Long>, rc.a {
    public abstract long a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
