package ca;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f8894a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8895b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        if (str != null) {
            this.f8894a = str;
            if (str2 != null) {
                this.f8895b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // ca.f
    public String b() {
        return this.f8894a;
    }

    @Override // ca.f
    public String c() {
        return this.f8895b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f8894a.equals(fVar.b()) && this.f8895b.equals(fVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8894a.hashCode() ^ 1000003) * 1000003) ^ this.f8895b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f8894a + ", version=" + this.f8895b + "}";
    }
}
