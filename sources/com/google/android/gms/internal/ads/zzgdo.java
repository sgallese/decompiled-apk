package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgdo extends zzgaw {
    private final int zza;
    private final zzgdm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgdo(int i10, zzgdm zzgdmVar, zzgdn zzgdnVar) {
        this.zza = i10;
        this.zzb = zzgdmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgdo)) {
            return false;
        }
        zzgdo zzgdoVar = (zzgdo) obj;
        if (zzgdoVar.zza != this.zza || zzgdoVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgdo.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzgdm zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        if (this.zzb != zzgdm.zzc) {
            return true;
        }
        return false;
    }
}
