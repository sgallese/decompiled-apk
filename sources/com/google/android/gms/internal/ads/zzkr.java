package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzkr {
    public final zzts zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkr(zzts zztsVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15 = true;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        zzdy.zzd(z14);
        if (z12 && !z11) {
            z15 = false;
        }
        zzdy.zzd(z15);
        this.zza = zztsVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkr.class == obj.getClass()) {
            zzkr zzkrVar = (zzkr) obj;
            if (this.zzb == zzkrVar.zzb && this.zzc == zzkrVar.zzc && this.zzd == zzkrVar.zzd && this.zze == zzkrVar.zze && this.zzg == zzkrVar.zzg && this.zzh == zzkrVar.zzh && this.zzi == zzkrVar.zzi && zzfk.zzD(this.zza, zzkrVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        int i10 = (int) this.zzb;
        int i11 = (int) this.zzc;
        return (((((((((((((hashCode * 31) + i10) * 31) + i11) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkr zza(long j10) {
        if (j10 == this.zzc) {
            return this;
        }
        return new zzkr(this.zza, this.zzb, j10, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkr zzb(long j10) {
        if (j10 == this.zzb) {
            return this;
        }
        return new zzkr(this.zza, j10, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
