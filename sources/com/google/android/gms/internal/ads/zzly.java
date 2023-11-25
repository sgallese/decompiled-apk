package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzly {
    public final long zza;
    public final zzcw zzb;
    public final int zzc;
    public final zzts zzd;
    public final long zze;
    public final zzcw zzf;
    public final int zzg;
    public final zzts zzh;
    public final long zzi;
    public final long zzj;

    public zzly(long j10, zzcw zzcwVar, int i10, zzts zztsVar, long j11, zzcw zzcwVar2, int i11, zzts zztsVar2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzcwVar;
        this.zzc = i10;
        this.zzd = zztsVar;
        this.zze = j11;
        this.zzf = zzcwVar2;
        this.zzg = i11;
        this.zzh = zztsVar2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzly.class == obj.getClass()) {
            zzly zzlyVar = (zzly) obj;
            if (this.zza == zzlyVar.zza && this.zzc == zzlyVar.zzc && this.zze == zzlyVar.zze && this.zzg == zzlyVar.zzg && this.zzi == zzlyVar.zzi && this.zzj == zzlyVar.zzj && zzfrd.zza(this.zzb, zzlyVar.zzb) && zzfrd.zza(this.zzd, zzlyVar.zzd) && zzfrd.zza(this.zzf, zzlyVar.zzf) && zzfrd.zza(this.zzh, zzlyVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
