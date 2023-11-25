package g9;

import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes3.dex */
final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f16244a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f16245b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List<String> list) {
        if (str != null) {
            this.f16244a = str;
            if (list != null) {
                this.f16245b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // g9.l
    public List<String> b() {
        return this.f16245b;
    }

    @Override // g9.l
    public String c() {
        return this.f16244a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f16244a.equals(lVar.c()) && this.f16245b.equals(lVar.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16244a.hashCode() ^ 1000003) * 1000003) ^ this.f16245b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f16244a + ", usedDates=" + this.f16245b + "}";
    }
}
