package t0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import rc.e;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
final class y<K, V> extends z<K, V> implements Iterator<Map.Entry<K, V>>, rc.a {

    /* compiled from: SnapshotStateMap.kt */
    /* loaded from: classes.dex */
    public static final class a implements Map.Entry<K, V>, e.a {

        /* renamed from: f  reason: collision with root package name */
        private final K f23398f;

        /* renamed from: m  reason: collision with root package name */
        private V f23399m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ y<K, V> f23400p;

        a(y<K, V> yVar) {
            this.f23400p = yVar;
            Map.Entry<K, V> e10 = yVar.e();
            qc.q.f(e10);
            this.f23398f = e10.getKey();
            Map.Entry<K, V> e11 = yVar.e();
            qc.q.f(e11);
            this.f23399m = e11.getValue();
        }

        public void a(V v10) {
            this.f23399m = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f23398f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f23399m;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            y<K, V> yVar = this.f23400p;
            if (yVar.f().c() == ((z) yVar).f23403p) {
                V v11 = (V) getValue();
                yVar.f().put((K) getKey(), v10);
                a(v10);
                return v11;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t<K, V> tVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(tVar, it);
        qc.q.i(tVar, "map");
        qc.q.i(it, "iterator");
    }

    @Override // java.util.Iterator
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        d();
        if (e() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
