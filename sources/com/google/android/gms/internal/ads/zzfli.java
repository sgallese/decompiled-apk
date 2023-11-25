package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfli extends zzfle {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfli(String str, boolean z10, boolean z11, zzflh zzflhVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfle) {
            zzfle zzfleVar = (zzfle) obj;
            if (this.zza.equals(zzfleVar.zzb()) && this.zzb == zzfleVar.zzd() && this.zzc == zzfleVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zza.hashCode() ^ 1000003;
        int i11 = 1237;
        if (true != this.zzb) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        if (true == this.zzc) {
            i11 = 1231;
        }
        return (((hashCode * 1000003) ^ i10) * 1000003) ^ i11;
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfle
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfle
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfle
    public final boolean zzd() {
        return this.zzb;
    }
}
