package io.realm;

import java.util.Collection;

/* loaded from: classes4.dex */
public interface RealmCollection<E> extends Collection<E> {
    RealmQuery<E> B();

    boolean isLoaded();

    boolean isValid();
}
