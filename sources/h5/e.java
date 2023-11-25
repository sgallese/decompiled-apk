package h5;

import ec.n0;
import java.util.Map;
import qc.h;
import qc.q;

/* compiled from: IdentityStore.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f16475a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16476b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f16477c;

    public e() {
        this(null, null, null, 7, null);
    }

    public final String a() {
        return this.f16476b;
    }

    public final String b() {
        return this.f16475a;
    }

    public final Map<String, Object> c() {
        return this.f16477c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (q.d(this.f16475a, eVar.f16475a) && q.d(this.f16476b, eVar.f16476b) && q.d(this.f16477c, eVar.f16477c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f16475a;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.f16476b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((i11 + i10) * 31) + this.f16477c.hashCode();
    }

    public String toString() {
        return "Identity(userId=" + ((Object) this.f16475a) + ", deviceId=" + ((Object) this.f16476b) + ", userProperties=" + this.f16477c + ')';
    }

    public e(String str, String str2, Map<String, ? extends Object> map) {
        q.i(map, "userProperties");
        this.f16475a = str;
        this.f16476b = str2;
        this.f16477c = map;
    }

    public /* synthetic */ e(String str, String str2, Map map, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? n0.h() : map);
    }
}
