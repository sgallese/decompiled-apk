package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // androidx.work.j
    public e b(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().h());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
