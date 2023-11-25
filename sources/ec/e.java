package ec;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: AbstractMutableCollection.kt */
/* loaded from: classes4.dex */
public abstract class e<E> extends AbstractCollection<E> implements Collection<E>, rc.b {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
