package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgbm extends zzgaw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgbk zze;
    private final zzgbj zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgbm(int i10, int i11, int i12, int i13, zzgbk zzgbkVar, zzgbj zzgbjVar, zzgbl zzgblVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzgbkVar;
        this.zzf = zzgbjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgbm)) {
            return false;
        }
        zzgbm zzgbmVar = (zzgbm) obj;
        if (zzgbmVar.zza != this.zza || zzgbmVar.zzb != this.zzb || zzgbmVar.zzc != this.zzc || zzgbmVar.zzd != this.zzd || zzgbmVar.zze != this.zze || zzgbmVar.zzf != this.zzf) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgbm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.zze) + ", hashType: " + String.valueOf(this.zzf) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final zzgbj zze() {
        return this.zzf;
    }

    public final zzgbk zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        if (this.zze != zzgbk.zzc) {
            return true;
        }
        return false;
    }
}
