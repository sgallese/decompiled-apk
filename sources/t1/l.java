package t1;

import androidx.compose.ui.platform.p1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes.dex */
public final class l implements x, Iterable<Map.Entry<? extends w<?>, ? extends Object>>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final Map<w<?>, Object> f23460f = new LinkedHashMap();

    /* renamed from: m  reason: collision with root package name */
    private boolean f23461m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f23462p;

    @Override // t1.x
    public <T> void a(w<T> wVar, T t10) {
        qc.q.i(wVar, "key");
        if ((t10 instanceof a) && f(wVar)) {
            Object obj = this.f23460f.get(wVar);
            qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) obj;
            Map<w<?>, Object> map = this.f23460f;
            a aVar2 = (a) t10;
            String b10 = aVar2.b();
            if (b10 == null) {
                b10 = aVar.b();
            }
            dc.c a10 = aVar2.a();
            if (a10 == null) {
                a10 = aVar.a();
            }
            map.put(wVar, new a(b10, a10));
            return;
        }
        this.f23460f.put(wVar, t10);
    }

    public final void e(l lVar) {
        qc.q.i(lVar, "peer");
        if (lVar.f23461m) {
            this.f23461m = true;
        }
        if (lVar.f23462p) {
            this.f23462p = true;
        }
        for (Map.Entry<w<?>, Object> entry : lVar.f23460f.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.f23460f.containsKey(key)) {
                this.f23460f.put(key, value);
            } else if (value instanceof a) {
                Object obj = this.f23460f.get(key);
                qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map<w<?>, Object> map = this.f23460f;
                String b10 = aVar.b();
                if (b10 == null) {
                    b10 = ((a) value).b();
                }
                dc.c a10 = aVar.a();
                if (a10 == null) {
                    a10 = ((a) value).a();
                }
                map.put(key, new a(b10, a10));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (qc.q.d(this.f23460f, lVar.f23460f) && this.f23461m == lVar.f23461m && this.f23462p == lVar.f23462p) {
            return true;
        }
        return false;
    }

    public final <T> boolean f(w<T> wVar) {
        qc.q.i(wVar, "key");
        return this.f23460f.containsKey(wVar);
    }

    public final l h() {
        l lVar = new l();
        lVar.f23461m = this.f23461m;
        lVar.f23462p = this.f23462p;
        lVar.f23460f.putAll(this.f23460f);
        return lVar;
    }

    public int hashCode() {
        return (((this.f23460f.hashCode() * 31) + t.k.a(this.f23461m)) * 31) + t.k.a(this.f23462p);
    }

    public final <T> T i(w<T> wVar) {
        qc.q.i(wVar, "key");
        T t10 = (T) this.f23460f.get(wVar);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends w<?>, ? extends Object>> iterator() {
        return this.f23460f.entrySet().iterator();
    }

    public final <T> T j(w<T> wVar, pc.a<? extends T> aVar) {
        qc.q.i(wVar, "key");
        qc.q.i(aVar, "defaultValue");
        T t10 = (T) this.f23460f.get(wVar);
        if (t10 == null) {
            return aVar.invoke();
        }
        return t10;
    }

    public final <T> T k(w<T> wVar, pc.a<? extends T> aVar) {
        qc.q.i(wVar, "key");
        qc.q.i(aVar, "defaultValue");
        T t10 = (T) this.f23460f.get(wVar);
        if (t10 == null) {
            return aVar.invoke();
        }
        return t10;
    }

    public final boolean l() {
        return this.f23462p;
    }

    public final boolean m() {
        return this.f23461m;
    }

    public final void n(l lVar) {
        qc.q.i(lVar, "child");
        for (Map.Entry<w<?>, Object> entry : lVar.f23460f.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f23460f.get(key);
            qc.q.g(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object b10 = key.b(obj, value);
            if (b10 != null) {
                this.f23460f.put(key, b10);
            }
        }
    }

    public final void o(boolean z10) {
        this.f23462p = z10;
    }

    public final void p(boolean z10) {
        this.f23461m = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f23461m) {
            sb2.append("");
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f23462p) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<w<?>, Object> entry : this.f23460f.entrySet()) {
            w<?> key = entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(key.a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return p1.a(this, null) + "{ " + ((Object) sb2) + " }";
    }
}
