package l0;

import java.util.Collection;
import java.util.List;
import pc.l;

/* compiled from: ImmutableList.kt */
/* loaded from: classes.dex */
public interface f<E> extends d<E>, b {

    /* compiled from: ImmutableList.kt */
    /* loaded from: classes.dex */
    public interface a<E> extends List<E>, Collection, rc.b, rc.d {
        f<E> build();
    }

    f<E> L(int i10);

    @Override // java.util.List
    f<E> add(int i10, E e10);

    @Override // java.util.List, java.util.Collection
    f<E> add(E e10);

    @Override // java.util.List, java.util.Collection
    f<E> addAll(Collection<? extends E> collection);

    a<E> builder();

    @Override // java.util.List, java.util.Collection
    f<E> remove(E e10);

    @Override // java.util.List, java.util.Collection
    f<E> removeAll(Collection<? extends E> collection);

    @Override // java.util.List
    f<E> set(int i10, E e10);

    f<E> z(l<? super E, Boolean> lVar);
}
