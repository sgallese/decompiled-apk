package h0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleContainer.android.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, l> f16398a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<l, a> f16399b = new LinkedHashMap();

    public final a a(l lVar) {
        qc.q.i(lVar, "rippleHostView");
        return this.f16399b.get(lVar);
    }

    public final l b(a aVar) {
        qc.q.i(aVar, "indicationInstance");
        return this.f16398a.get(aVar);
    }

    public final void c(a aVar) {
        qc.q.i(aVar, "indicationInstance");
        l lVar = this.f16398a.get(aVar);
        if (lVar != null) {
            this.f16399b.remove(lVar);
        }
        this.f16398a.remove(aVar);
    }

    public final void d(a aVar, l lVar) {
        qc.q.i(aVar, "indicationInstance");
        qc.q.i(lVar, "rippleHostView");
        this.f16398a.put(aVar, lVar);
        this.f16399b.put(lVar, aVar);
    }
}
