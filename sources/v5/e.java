package v5;

import java.util.LinkedHashMap;
import java.util.Map;
import qc.q;

/* compiled from: IdentityContainer.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f24603c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final Object f24604d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, e> f24605e = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final d f24606a;

    /* renamed from: b  reason: collision with root package name */
    private final g f24607b;

    /* compiled from: IdentityContainer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final e a(d dVar) {
            e eVar;
            q.i(dVar, "configuration");
            synchronized (e.f24604d) {
                Map map = e.f24605e;
                String d10 = dVar.d();
                Object obj = map.get(d10);
                if (obj == null) {
                    obj = new e(dVar, null);
                    map.put(d10, obj);
                }
                eVar = (e) obj;
            }
            return eVar;
        }
    }

    public /* synthetic */ e(d dVar, qc.h hVar) {
        this(dVar);
    }

    public final g c() {
        return this.f24607b;
    }

    private e(d dVar) {
        this.f24606a = dVar;
        this.f24607b = new h(dVar.c().a(dVar));
    }
}
