package u5;

import java.util.LinkedHashMap;
import java.util.Map;
import qc.h;
import qc.q;

/* compiled from: EventBridgeContainer.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24161b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f24162c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, d> f24163d = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final b f24164a = new e();

    /* compiled from: EventBridgeContainer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final d a(String str) {
            d dVar;
            q.i(str, "instanceName");
            synchronized (d.f24162c) {
                Map map = d.f24163d;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new d();
                    map.put(str, obj);
                }
                dVar = (d) obj;
            }
            return dVar;
        }
    }

    public final b c() {
        return this.f24164a;
    }
}
