package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class h0 extends a {

    /* renamed from: b  reason: collision with root package name */
    private final int f10830b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10831c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10832d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(int i10, String str, String str2) {
        this.f10830b = i10;
        this.f10831c = str;
        this.f10832d = str2;
    }

    @Override // com.google.android.play.core.assetpacks.a
    public final String a() {
        return this.f10832d;
    }

    @Override // com.google.android.play.core.assetpacks.a
    public final int b() {
        return this.f10830b;
    }

    @Override // com.google.android.play.core.assetpacks.a
    public final String c() {
        return this.f10831c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f10830b == aVar.b() && ((str = this.f10831c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((str2 = this.f10832d) != null ? str2.equals(aVar.a()) : aVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = (this.f10830b ^ 1000003) * 1000003;
        String str = this.f10831c;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        String str2 = this.f10832d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        int i10 = this.f10830b;
        String str = this.f10831c;
        String str2 = this.f10832d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(i10);
        sb2.append(", path=");
        sb2.append(str);
        sb2.append(", assetsPath=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
