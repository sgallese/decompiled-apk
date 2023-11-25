package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzie {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzie(String str, zzam zzamVar, zzam zzamVar2, int i10, int i11) {
        boolean z10 = true;
        if (i10 != 0) {
            if (i11 == 0) {
                i11 = 0;
            } else {
                z10 = false;
            }
        }
        zzdy.zzd(z10);
        zzdy.zzc(str);
        this.zza = str;
        zzamVar.getClass();
        this.zzb = zzamVar;
        zzamVar2.getClass();
        this.zzc = zzamVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzie.class == obj.getClass()) {
            zzie zzieVar = (zzie) obj;
            if (this.zzd == zzieVar.zzd && this.zze == zzieVar.zze && this.zza.equals(zzieVar.zza) && this.zzb.equals(zzieVar.zzb) && this.zzc.equals(zzieVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
