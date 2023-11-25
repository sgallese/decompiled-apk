package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* loaded from: classes3.dex */
final class j extends b0.e.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f22401a;

    @Override // r8.b0.e.a.b
    public String a() {
        return this.f22401a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.a.b) {
            return this.f22401a.equals(((b0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f22401a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f22401a + "}";
    }
}
