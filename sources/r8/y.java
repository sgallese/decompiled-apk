package r8;

import r8.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes3.dex */
public final class y extends d0.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f22517a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22518b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22519c;

    /* renamed from: d  reason: collision with root package name */
    private final String f22520d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22521e;

    /* renamed from: f  reason: collision with root package name */
    private final n8.e f22522f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, String str2, String str3, String str4, int i10, n8.e eVar) {
        if (str != null) {
            this.f22517a = str;
            if (str2 != null) {
                this.f22518b = str2;
                if (str3 != null) {
                    this.f22519c = str3;
                    if (str4 != null) {
                        this.f22520d = str4;
                        this.f22521e = i10;
                        if (eVar != null) {
                            this.f22522f = eVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // r8.d0.a
    public String a() {
        return this.f22517a;
    }

    @Override // r8.d0.a
    public int c() {
        return this.f22521e;
    }

    @Override // r8.d0.a
    public n8.e d() {
        return this.f22522f;
    }

    @Override // r8.d0.a
    public String e() {
        return this.f22520d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.a)) {
            return false;
        }
        d0.a aVar = (d0.a) obj;
        if (this.f22517a.equals(aVar.a()) && this.f22518b.equals(aVar.f()) && this.f22519c.equals(aVar.g()) && this.f22520d.equals(aVar.e()) && this.f22521e == aVar.c() && this.f22522f.equals(aVar.d())) {
            return true;
        }
        return false;
    }

    @Override // r8.d0.a
    public String f() {
        return this.f22518b;
    }

    @Override // r8.d0.a
    public String g() {
        return this.f22519c;
    }

    public int hashCode() {
        return ((((((((((this.f22517a.hashCode() ^ 1000003) * 1000003) ^ this.f22518b.hashCode()) * 1000003) ^ this.f22519c.hashCode()) * 1000003) ^ this.f22520d.hashCode()) * 1000003) ^ this.f22521e) * 1000003) ^ this.f22522f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f22517a + ", versionCode=" + this.f22518b + ", versionName=" + this.f22519c + ", installUuid=" + this.f22520d + ", deliveryMechanism=" + this.f22521e + ", developmentPlatformProvider=" + this.f22522f + "}";
    }
}
