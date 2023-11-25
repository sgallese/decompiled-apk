package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgie extends zzgjf {
    private final int zza;
    private final int zzb;
    private final zzgic zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgie(int i10, int i11, zzgic zzgicVar, zzgid zzgidVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgicVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgie)) {
            return false;
        }
        zzgie zzgieVar = (zzgie) obj;
        if (zzgieVar.zza != this.zza || zzgieVar.zzc() != zzc() || zzgieVar.zzc != this.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgie.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.zzc) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzgic zzgicVar = this.zzc;
        if (zzgicVar == zzgic.zzd) {
            return this.zzb;
        }
        if (zzgicVar == zzgic.zza || zzgicVar == zzgic.zzb || zzgicVar == zzgic.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgic zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        if (this.zzc != zzgic.zzd) {
            return true;
        }
        return false;
    }
}
