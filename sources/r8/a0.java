package r8;

import r8.d0;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes3.dex */
final class a0 extends d0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f22306a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22307b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f22308c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(String str, String str2, boolean z10) {
        if (str != null) {
            this.f22306a = str;
            if (str2 != null) {
                this.f22307b = str2;
                this.f22308c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // r8.d0.c
    public boolean b() {
        return this.f22308c;
    }

    @Override // r8.d0.c
    public String c() {
        return this.f22307b;
    }

    @Override // r8.d0.c
    public String d() {
        return this.f22306a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.c)) {
            return false;
        }
        d0.c cVar = (d0.c) obj;
        if (this.f22306a.equals(cVar.d()) && this.f22307b.equals(cVar.c()) && this.f22308c == cVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((this.f22306a.hashCode() ^ 1000003) * 1000003) ^ this.f22307b.hashCode()) * 1000003;
        if (this.f22308c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f22306a + ", osCodeName=" + this.f22307b + ", isRooted=" + this.f22308c + "}";
    }
}
