package y;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n1.k1;

/* compiled from: LazyLayout.kt */
/* loaded from: classes.dex */
final class q implements k1 {

    /* renamed from: a  reason: collision with root package name */
    private final m f26123a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Object, Integer> f26124b;

    public q(m mVar) {
        qc.q.i(mVar, "factory");
        this.f26123a = mVar;
        this.f26124b = new LinkedHashMap();
    }

    @Override // n1.k1
    public boolean a(Object obj, Object obj2) {
        return qc.q.d(this.f26123a.c(obj), this.f26123a.c(obj2));
    }

    @Override // n1.k1
    public void b(k1.a aVar) {
        int i10;
        qc.q.i(aVar, "slotIds");
        this.f26124b.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object c10 = this.f26123a.c(it.next());
            Integer num = this.f26124b.get(c10);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            if (i10 == 7) {
                it.remove();
            } else {
                this.f26124b.put(c10, Integer.valueOf(i10 + 1));
            }
        }
    }
}
