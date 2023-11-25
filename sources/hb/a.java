package hb;

/* compiled from: DataUri.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f16588a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16589b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16590c;

    public a(String str, boolean z10, String str2) {
        this.f16588a = str;
        this.f16589b = z10;
        this.f16590c = str2;
    }

    public boolean a() {
        return this.f16589b;
    }

    public String b() {
        return this.f16588a;
    }

    public String c() {
        return this.f16590c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16589b != aVar.f16589b) {
            return false;
        }
        String str = this.f16588a;
        if (str == null ? aVar.f16588a != null : !str.equals(aVar.f16588a)) {
            return false;
        }
        String str2 = this.f16590c;
        String str3 = aVar.f16590c;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f16588a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = ((i10 * 31) + (this.f16589b ? 1 : 0)) * 31;
        String str2 = this.f16590c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "DataUri{contentType='" + this.f16588a + "', base64=" + this.f16589b + ", data='" + this.f16590c + "'}";
    }
}
