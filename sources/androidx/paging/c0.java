package androidx.paging;

import androidx.paging.l1;
import java.util.List;

/* compiled from: InitialDataSource.kt */
/* loaded from: classes.dex */
public final class c0<K, V> extends l1<K, V> {
    @Override // androidx.paging.l1
    public void i(l1.d<K> dVar, l1.a<K, V> aVar) {
        List<? extends V> i10;
        qc.q.i(dVar, "params");
        qc.q.i(aVar, "callback");
        i10 = ec.t.i();
        aVar.a(i10, null);
    }

    @Override // androidx.paging.l1
    public void k(l1.d<K> dVar, l1.a<K, V> aVar) {
        List<? extends V> i10;
        qc.q.i(dVar, "params");
        qc.q.i(aVar, "callback");
        i10 = ec.t.i();
        aVar.a(i10, null);
    }

    @Override // androidx.paging.l1
    public void m(l1.c<K> cVar, l1.b<K, V> bVar) {
        List<? extends V> i10;
        qc.q.i(cVar, "params");
        qc.q.i(bVar, "callback");
        i10 = ec.t.i();
        bVar.a(i10, 0, 0, null, null);
    }
}
