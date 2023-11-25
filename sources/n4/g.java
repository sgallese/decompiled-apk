package n4;

/* compiled from: SystemIdInfo.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f20169a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20170b;

    public g(String str, int i10) {
        this.f20169a = str;
        this.f20170b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f20170b != gVar.f20170b) {
            return false;
        }
        return this.f20169a.equals(gVar.f20169a);
    }

    public int hashCode() {
        return (this.f20169a.hashCode() * 31) + this.f20170b;
    }
}
