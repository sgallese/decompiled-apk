package n4;

/* compiled from: Preference.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f20164a;

    /* renamed from: b  reason: collision with root package name */
    public Long f20165b;

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f20164a.equals(dVar.f20164a)) {
            return false;
        }
        Long l10 = this.f20165b;
        Long l11 = dVar.f20165b;
        if (l10 != null) {
            return l10.equals(l11);
        }
        if (l11 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f20164a.hashCode() * 31;
        Long l10 = this.f20165b;
        if (l10 != null) {
            i10 = l10.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public d(String str, long j10) {
        this.f20164a = str;
        this.f20165b = Long.valueOf(j10);
    }
}
