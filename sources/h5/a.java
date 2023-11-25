package h5;

import java.util.LinkedHashMap;
import java.util.Map;
import qc.h;
import qc.q;

/* compiled from: AnalyticsConnector.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0389a f16464c = new C0389a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final Object f16465d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, a> f16466e = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final f f16467a;

    /* renamed from: b  reason: collision with root package name */
    private final c f16468b;

    /* compiled from: AnalyticsConnector.kt */
    /* renamed from: h5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0389a {
        private C0389a() {
        }

        public /* synthetic */ C0389a(h hVar) {
            this();
        }

        public final a a(String str) {
            a aVar;
            q.i(str, "instanceName");
            synchronized (a.f16465d) {
                Map map = a.f16466e;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new a(null);
                    map.put(str, obj);
                }
                aVar = (a) obj;
            }
            return aVar;
        }
    }

    public /* synthetic */ a(h hVar) {
        this();
    }

    public final c c() {
        return this.f16468b;
    }

    public final f d() {
        return this.f16467a;
    }

    private a() {
        this.f16467a = new g();
        this.f16468b = new d();
    }
}
