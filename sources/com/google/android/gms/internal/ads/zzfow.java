package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfow extends zzfpo {
    private final int zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfow(int i10, String str, zzfov zzfovVar) {
        this.zza = i10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfpo) {
            zzfpo zzfpoVar = (zzfpo) obj;
            if (this.zza == zzfpoVar.zza() && ((str = this.zzb) != null ? str.equals(zzfpoVar.zzb()) : zzfpoVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.zza ^ 1000003;
        String str = this.zzb;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (i10 * 1000003) ^ hashCode;
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfpo
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfpo
    public final String zzb() {
        return this.zzb;
    }
}
