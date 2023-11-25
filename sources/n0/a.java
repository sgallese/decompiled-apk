package n0;

import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends ec.h<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return e((Map.Entry) obj);
    }

    public final boolean e(E e10) {
        E e11;
        qc.q.i(e10, "element");
        if (e10 instanceof Object) {
            e11 = e10;
        } else {
            e11 = null;
        }
        if (!(e11 instanceof Map.Entry)) {
            return false;
        }
        return f(e10);
    }

    public abstract boolean f(Map.Entry<? extends K, ? extends V> entry);

    public final boolean h(E e10) {
        E e11;
        qc.q.i(e10, "element");
        if (e10 instanceof Object) {
            e11 = e10;
        } else {
            e11 = null;
        }
        if (!(e11 instanceof Map.Entry)) {
            return false;
        }
        return i(e10);
    }

    public abstract boolean i(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return h((Map.Entry) obj);
    }
}
