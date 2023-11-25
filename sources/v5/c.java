package v5;

import qc.q;

/* compiled from: IdentityManager.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f24595a;

    /* renamed from: b  reason: collision with root package name */
    private final String f24596b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [qc.h, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c() {
        /*
            r2 = this;
            r0 = 0
            r1 = 3
            r2.<init>(r0, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.c.<init>():void");
    }

    public final String a() {
        return this.f24596b;
    }

    public final String b() {
        return this.f24595a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (q.d(this.f24595a, cVar.f24595a) && q.d(this.f24596b, cVar.f24596b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f24595a;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.f24596b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "Identity(userId=" + ((Object) this.f24595a) + ", deviceId=" + ((Object) this.f24596b) + ')';
    }

    public c(String str, String str2) {
        this.f24595a = str;
        this.f24596b = str2;
    }

    public /* synthetic */ c(String str, String str2, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
