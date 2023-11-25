package cb;

import java.util.HashMap;
import java.util.Map;

/* compiled from: RenderPropsImpl.java */
/* loaded from: classes4.dex */
class s implements r {

    /* renamed from: a  reason: collision with root package name */
    private final Map<o, Object> f8943a = new HashMap(3);

    @Override // cb.r
    public <T> T a(o<T> oVar, T t10) {
        T t11 = (T) this.f8943a.get(oVar);
        if (t11 != null) {
            return t11;
        }
        return t10;
    }

    @Override // cb.r
    public <T> void b(o<T> oVar, T t10) {
        if (t10 == null) {
            this.f8943a.remove(oVar);
        } else {
            this.f8943a.put(oVar, t10);
        }
    }

    @Override // cb.r
    public <T> T c(o<T> oVar) {
        return (T) this.f8943a.get(oVar);
    }
}
