package g6;

/* compiled from: Encoding.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f16226a;

    private b(String str) {
        if (str != null) {
            this.f16226a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f16226a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f16226a.equals(((b) obj).f16226a);
    }

    public int hashCode() {
        return this.f16226a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f16226a + "\"}";
    }
}
