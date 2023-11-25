package h5;

import java.util.Map;
import qc.q;

/* compiled from: EventBridge.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f16469a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f16470b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Map<String, Object>> f16471c;

    public final String a() {
        return this.f16469a;
    }

    public final Map<String, Object> b() {
        return this.f16470b;
    }

    public final Map<String, Map<String, Object>> c() {
        return this.f16471c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (q.d(this.f16469a, bVar.f16469a) && q.d(this.f16470b, bVar.f16470b) && q.d(this.f16471c, bVar.f16471c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f16469a.hashCode() * 31;
        Map<String, Object> map = this.f16470b;
        int i10 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        Map<String, Map<String, Object>> map2 = this.f16471c;
        if (map2 != null) {
            i10 = map2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "AnalyticsEvent(eventType=" + this.f16469a + ", eventProperties=" + this.f16470b + ", userProperties=" + this.f16471c + ')';
    }
}
