package j0;

/* compiled from: OpaqueKey.kt */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f18803a;

    public m1(String str) {
        qc.q.i(str, "key");
        this.f18803a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m1) && qc.q.d(this.f18803a, ((m1) obj).f18803a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f18803a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f18803a + ')';
    }
}
