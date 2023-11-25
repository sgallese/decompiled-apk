package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgcg extends zzgaw {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgce zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgcg(int i10, int i11, int i12, zzgce zzgceVar, zzgcf zzgcfVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzgceVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgcg)) {
            return false;
        }
        zzgcg zzgcgVar = (zzgcg) obj;
        if (zzgcgVar.zza != this.zza || zzgcgVar.zzb != this.zzb || zzgcgVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgcg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgce zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        if (this.zzd != zzgce.zzc) {
            return true;
        }
        return false;
    }
}
