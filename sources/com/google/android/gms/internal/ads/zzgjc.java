package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgjc extends zzgjf {
    private final int zza;
    private final int zzb;
    private final zzgja zzc;
    private final zzgiz zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjc(int i10, int i11, zzgja zzgjaVar, zzgiz zzgizVar, zzgjb zzgjbVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgjaVar;
        this.zzd = zzgizVar;
    }

    public static zzgiy zzd() {
        return new zzgiy(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjc)) {
            return false;
        }
        zzgjc zzgjcVar = (zzgjc) obj;
        if (zzgjcVar.zza != this.zza || zzgjcVar.zzc() != zzc() || zzgjcVar.zzc != this.zzc || zzgjcVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgjc.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        zzgja zzgjaVar = this.zzc;
        if (zzgjaVar == zzgja.zzd) {
            return this.zzb;
        }
        if (zzgjaVar == zzgja.zza || zzgjaVar == zzgja.zzb || zzgjaVar == zzgja.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgiz zze() {
        return this.zzd;
    }

    public final zzgja zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        if (this.zzc != zzgja.zzd) {
            return true;
        }
        return false;
    }
}
