package u5;

import java.util.LinkedHashMap;
import java.util.Map;
import qc.q;

/* compiled from: EventBridge.kt */
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Object f24165a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<f, c> f24166b = new LinkedHashMap();

    @Override // u5.b
    public void a(f fVar, a aVar) {
        c cVar;
        q.i(fVar, "channel");
        q.i(aVar, "event");
        synchronized (this.f24165a) {
            Map<f, c> map = this.f24166b;
            c cVar2 = map.get(fVar);
            if (cVar2 == null) {
                cVar2 = new c(fVar);
                map.put(fVar, cVar2);
            }
            cVar = cVar2;
        }
        cVar.a(aVar);
    }
}
