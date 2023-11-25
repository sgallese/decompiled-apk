package cb;

import cb.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MarkwonSpansFactoryImpl.java */
/* loaded from: classes4.dex */
class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends td.s>, t> f8926a;

    /* compiled from: MarkwonSpansFactoryImpl.java */
    /* loaded from: classes4.dex */
    static class a implements j.a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<? extends td.s>, t> f8927a = new HashMap(3);

        @Override // cb.j.a
        public <N extends td.s> j.a a(Class<N> cls, t tVar) {
            if (tVar == null) {
                this.f8927a.remove(cls);
            } else {
                this.f8927a.put(cls, tVar);
            }
            return this;
        }

        @Override // cb.j.a
        public j build() {
            return new k(Collections.unmodifiableMap(this.f8927a));
        }
    }

    k(Map<Class<? extends td.s>, t> map) {
        this.f8926a = map;
    }

    @Override // cb.j
    public <N extends td.s> t a(Class<N> cls) {
        return this.f8926a.get(cls);
    }
}
