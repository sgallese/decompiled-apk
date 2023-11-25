package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModelStore.kt */
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, v0> f4933a = new LinkedHashMap();

    public final void a() {
        Iterator<v0> it = this.f4933a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f4933a.clear();
    }

    public final v0 b(String str) {
        qc.q.i(str, "key");
        return this.f4933a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.f4933a.keySet());
    }

    public final void d(String str, v0 v0Var) {
        qc.q.i(str, "key");
        qc.q.i(v0Var, "viewModel");
        v0 put = this.f4933a.put(str, v0Var);
        if (put != null) {
            put.onCleared();
        }
    }
}
