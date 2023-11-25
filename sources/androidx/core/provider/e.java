package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.i;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f3966a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3967b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3968c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f3969d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3970e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f3971f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f3966a = (String) i.g(str);
        this.f3967b = (String) i.g(str2);
        this.f3968c = (String) i.g(str3);
        this.f3969d = (List) i.g(list);
        this.f3971f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f3969d;
    }

    public int c() {
        return this.f3970e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f3971f;
    }

    public String e() {
        return this.f3966a;
    }

    public String f() {
        return this.f3967b;
    }

    public String g() {
        return this.f3968c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f3966a + ", mProviderPackage: " + this.f3967b + ", mQuery: " + this.f3968c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f3969d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f3969d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f3970e);
        return sb2.toString();
    }
}
