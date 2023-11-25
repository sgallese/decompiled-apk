package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgcx extends zzgaw {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgcv zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgcx(int i10, int i11, int i12, zzgcv zzgcvVar, zzgcw zzgcwVar) {
        this.zza = i10;
        this.zzd = zzgcvVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgcx)) {
            return false;
        }
        zzgcx zzgcxVar = (zzgcx) obj;
        if (zzgcxVar.zza != this.zza || zzgcxVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgcx.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgcv zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        if (this.zzd != zzgcv.zzc) {
            return true;
        }
        return false;
    }
}
