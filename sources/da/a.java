package da;

import java.util.Set;

/* compiled from: AutoValue_ConfigUpdate.java */
/* loaded from: classes3.dex */
final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f13148a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Set<String> set) {
        if (set != null) {
            this.f13148a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    @Override // da.b
    public Set<String> b() {
        return this.f13148a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f13148a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f13148a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f13148a + "}";
    }
}
