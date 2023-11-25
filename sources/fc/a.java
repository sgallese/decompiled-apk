package fc;

import ec.h;
import java.util.Map;
import java.util.Map.Entry;
import qc.q;

/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends h<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return e((Map.Entry) obj);
    }

    public final boolean e(E e10) {
        q.i(e10, "element");
        return f(e10);
    }

    public abstract boolean f(Map.Entry<? extends K, ? extends V> entry);

    public abstract /* bridge */ boolean h(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return h((Map.Entry) obj);
    }
}
