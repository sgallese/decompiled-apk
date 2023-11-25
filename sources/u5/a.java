package u5;

import java.util.Map;
import qc.q;

/* compiled from: EventBridge.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f24151a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f24152b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f24153c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f24154d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, ? extends Object> f24155e;

    public a(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        q.i(str, "eventType");
        this.f24151a = str;
        this.f24152b = map;
        this.f24153c = map2;
        this.f24154d = map3;
        this.f24155e = map4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (q.d(this.f24151a, aVar.f24151a) && q.d(this.f24152b, aVar.f24152b) && q.d(this.f24153c, aVar.f24153c) && q.d(this.f24154d, aVar.f24154d) && q.d(this.f24155e, aVar.f24155e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f24151a.hashCode() * 31;
        Map<String, Object> map = this.f24152b;
        int i10 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        Map<String, Object> map2 = this.f24153c;
        if (map2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Map<String, Object> map3 = this.f24154d;
        if (map3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Map<String, ? extends Object> map4 = this.f24155e;
        if (map4 != null) {
            i10 = map4.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        return "Event(eventType=" + this.f24151a + ", eventProperties=" + this.f24152b + ", userProperties=" + this.f24153c + ", groups=" + this.f24154d + ", groupProperties=" + this.f24155e + ')';
    }
}
