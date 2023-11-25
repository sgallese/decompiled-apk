package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzkq {
    public final zztq zza;
    public final Object zzb;
    public final zzvj[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkr zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlp[] zzi;
    private final zzxl zzj;
    private final zzlf zzk;
    private zzkq zzl;
    private zzvs zzm;
    private zzxm zzn;
    private long zzo;

    public zzkq(zzlp[] zzlpVarArr, long j10, zzxl zzxlVar, zzxu zzxuVar, zzlf zzlfVar, zzkr zzkrVar, zzxm zzxmVar) {
        this.zzi = zzlpVarArr;
        this.zzo = j10;
        this.zzj = zzxlVar;
        this.zzk = zzlfVar;
        zzts zztsVar = zzkrVar.zza;
        this.zzb = zztsVar.zza;
        this.zzf = zzkrVar;
        this.zzm = zzvs.zza;
        this.zzn = zzxmVar;
        this.zzc = new zzvj[2];
        this.zzh = new boolean[2];
        long j11 = zzkrVar.zzb;
        long j12 = zzkrVar.zzd;
        zztq zzp = zzlfVar.zzp(zztsVar, zzxuVar, j11);
        this.zza = j12 != -9223372036854775807L ? new zzsx(zzp, true, 0L, j12) : zzp;
    }

    private final void zzs() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzxm zzxmVar = this.zzn;
                if (i10 < zzxmVar.zza) {
                    zzxmVar.zzb(i10);
                    zzxf zzxfVar = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzxm zzxmVar = this.zzn;
                if (i10 < zzxmVar.zza) {
                    zzxmVar.zzb(i10);
                    zzxf zzxfVar = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        if (this.zzl == null) {
            return true;
        }
        return false;
    }

    public final long zza(zzxm zzxmVar, long j10, boolean z10) {
        return zzb(zzxmVar, j10, false, new boolean[2]);
    }

    public final long zzb(zzxm zzxmVar, long j10, boolean z10, boolean[] zArr) {
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= zzxmVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z10 || !zzxmVar.zza(this.zzn, i10)) {
                z12 = false;
            }
            zArr2[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzlp[] zzlpVarArr = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzlpVarArr[i11].zzb();
            i11++;
        }
        zzs();
        this.zzn = zzxmVar;
        zzt();
        long zzf = this.zza.zzf(zzxmVar.zzc, this.zzh, this.zzc, zArr, j10);
        int i12 = 0;
        while (true) {
            zzlp[] zzlpVarArr2 = this.zzi;
            if (i12 >= 2) {
                break;
            }
            zzlpVarArr2[i12].zzb();
            i12++;
        }
        this.zze = false;
        int i13 = 0;
        while (true) {
            zzvj[] zzvjVarArr = this.zzc;
            if (i13 < 2) {
                if (zzvjVarArr[i13] != null) {
                    zzdy.zzf(zzxmVar.zzb(i13));
                    this.zzi[i13].zzb();
                    this.zze = true;
                } else {
                    if (zzxmVar.zzc[i13] == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zzdy.zzf(z11);
                }
                i13++;
            } else {
                return zzf;
            }
        }
    }

    public final long zzc() {
        long j10;
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        if (this.zze) {
            j10 = this.zza.zzb();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.zzf.zze;
        }
        return j10;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0L;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzkq zzg() {
        return this.zzl;
    }

    public final zzvs zzh() {
        return this.zzm;
    }

    public final zzxm zzi() {
        return this.zzn;
    }

    public final zzxm zzj(float f10, zzcw zzcwVar) throws zzil {
        zzxm zzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzcwVar);
        for (zzxf zzxfVar : zzo.zzc) {
        }
        return zzo;
    }

    public final void zzk(long j10) {
        zzdy.zzf(zzu());
        this.zza.zzo(j10 - this.zzo);
    }

    public final void zzl(float f10, zzcw zzcwVar) throws zzil {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzxm zzj = zzj(f10, zzcwVar);
        zzkr zzkrVar = this.zzf;
        long j10 = zzkrVar.zzb;
        long j11 = zzkrVar.zze;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long zza = zza(zzj, j10, false);
        long j12 = this.zzo;
        zzkr zzkrVar2 = this.zzf;
        this.zzo = j12 + (zzkrVar2.zzb - zza);
        this.zzf = zzkrVar2.zzb(zza);
    }

    public final void zzm(long j10) {
        zzdy.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j10 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzlf zzlfVar = this.zzk;
        zztq zztqVar = this.zza;
        try {
            if (zztqVar instanceof zzsx) {
                zzlfVar.zzi(((zzsx) zztqVar).zza);
            } else {
                zzlfVar.zzi(zztqVar);
            }
        } catch (RuntimeException e10) {
            zzes.zzd("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(zzkq zzkqVar) {
        if (zzkqVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkqVar;
        zzt();
    }

    public final void zzp(long j10) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zztq zztqVar = this.zza;
        if (zztqVar instanceof zzsx) {
            long j10 = this.zzf.zzd;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zzsx) zztqVar).zzn(0L, j10);
        }
    }

    public final boolean zzr() {
        if (!this.zzd) {
            return false;
        }
        if (this.zze && this.zza.zzb() != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }
}
