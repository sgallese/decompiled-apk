package v5;

import java.io.File;
import qc.q;

/* compiled from: IdentityConfiguration.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f24597a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24598b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24599c;

    /* renamed from: d  reason: collision with root package name */
    private final j f24600d;

    /* renamed from: e  reason: collision with root package name */
    private final File f24601e;

    /* renamed from: f  reason: collision with root package name */
    private final m5.a f24602f;

    public d(String str, String str2, String str3, j jVar, File file, m5.a aVar) {
        q.i(str, "instanceName");
        q.i(jVar, "identityStorageProvider");
        this.f24597a = str;
        this.f24598b = str2;
        this.f24599c = str3;
        this.f24600d = jVar;
        this.f24601e = file;
        this.f24602f = aVar;
    }

    public final String a() {
        return this.f24598b;
    }

    public final String b() {
        return this.f24599c;
    }

    public final j c() {
        return this.f24600d;
    }

    public final String d() {
        return this.f24597a;
    }

    public final m5.a e() {
        return this.f24602f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (q.d(this.f24597a, dVar.f24597a) && q.d(this.f24598b, dVar.f24598b) && q.d(this.f24599c, dVar.f24599c) && q.d(this.f24600d, dVar.f24600d) && q.d(this.f24601e, dVar.f24601e) && q.d(this.f24602f, dVar.f24602f)) {
            return true;
        }
        return false;
    }

    public final File f() {
        return this.f24601e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f24597a.hashCode() * 31;
        String str = this.f24598b;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f24599c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode5 = (((i11 + hashCode2) * 31) + this.f24600d.hashCode()) * 31;
        File file = this.f24601e;
        if (file == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = file.hashCode();
        }
        int i12 = (hashCode5 + hashCode3) * 31;
        m5.a aVar = this.f24602f;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        return "IdentityConfiguration(instanceName=" + this.f24597a + ", apiKey=" + ((Object) this.f24598b) + ", experimentApiKey=" + ((Object) this.f24599c) + ", identityStorageProvider=" + this.f24600d + ", storageDirectory=" + this.f24601e + ", logger=" + this.f24602f + ')';
    }

    public /* synthetic */ d(String str, String str2, String str3, j jVar, File file, m5.a aVar, int i10, qc.h hVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, jVar, (i10 & 16) != 0 ? null : file, (i10 & 32) != 0 ? null : aVar);
    }
}
