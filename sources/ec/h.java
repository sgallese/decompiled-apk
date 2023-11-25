package ec;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: AbstractMutableSet.kt */
/* loaded from: classes4.dex */
public abstract class h<E> extends AbstractSet<E> implements Set<E>, rc.f {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
