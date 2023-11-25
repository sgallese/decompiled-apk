package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class i0 extends AssetPackState {

    /* renamed from: a  reason: collision with root package name */
    private final String f10839a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10840b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10841c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10842d;

    /* renamed from: e  reason: collision with root package name */
    private final long f10843e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10844f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10845g;

    /* renamed from: h  reason: collision with root package name */
    private final String f10846h;

    /* renamed from: i  reason: collision with root package name */
    private final String f10847i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(String str, int i10, int i11, long j10, long j11, int i12, int i13, String str2, String str3) {
        if (str != null) {
            this.f10839a = str;
            this.f10840b = i10;
            this.f10841c = i11;
            this.f10842d = j10;
            this.f10843e = j11;
            this.f10844f = i12;
            this.f10845g = i13;
            if (str2 != null) {
                this.f10846h = str2;
                if (str3 != null) {
                    this.f10847i = str3;
                    return;
                }
                throw new NullPointerException("Null installedVersionTag");
            }
            throw new NullPointerException("Null availableVersionTag");
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long a() {
        return this.f10842d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int b() {
        return this.f10841c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String c() {
        return this.f10839a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int d() {
        return this.f10840b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long e() {
        return this.f10843e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f10839a.equals(assetPackState.c()) && this.f10840b == assetPackState.d() && this.f10841c == assetPackState.b() && this.f10842d == assetPackState.a() && this.f10843e == assetPackState.e() && this.f10844f == assetPackState.f() && this.f10845g == assetPackState.g() && this.f10846h.equals(assetPackState.j()) && this.f10847i.equals(assetPackState.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.f10844f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int g() {
        return this.f10845g;
    }

    public final int hashCode() {
        int hashCode = this.f10839a.hashCode();
        int i10 = this.f10840b;
        int i11 = this.f10841c;
        long j10 = this.f10842d;
        long j11 = this.f10843e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f10844f) * 1000003) ^ this.f10845g) * 1000003) ^ this.f10846h.hashCode()) * 1000003) ^ this.f10847i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String j() {
        return this.f10846h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String k() {
        return this.f10847i;
    }

    public final String toString() {
        String str = this.f10839a;
        int i10 = this.f10840b;
        int i11 = this.f10841c;
        long j10 = this.f10842d;
        long j11 = this.f10843e;
        int i12 = this.f10844f;
        int i13 = this.f10845g;
        String str2 = this.f10846h;
        String str3 = this.f10847i;
        StringBuilder sb2 = new StringBuilder(str.length() + 261 + str2.length() + str3.length());
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i10);
        sb2.append(", errorCode=");
        sb2.append(i11);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j11);
        sb2.append(", transferProgressPercentage=");
        sb2.append(i12);
        sb2.append(", updateAvailability=");
        sb2.append(i13);
        sb2.append(", availableVersionTag=");
        sb2.append(str2);
        sb2.append(", installedVersionTag=");
        sb2.append(str3);
        sb2.append("}");
        return sb2.toString();
    }
}
