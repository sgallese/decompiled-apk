package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzlg {
    private static final zzts zzt = new zzts(new Object());
    public final zzcw zza;
    public final zzts zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzil zzf;
    public final boolean zzg;
    public final zzvs zzh;
    public final zzxm zzi;
    public final List zzj;
    public final zzts zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzch zzn;
    public final boolean zzo;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzlg(zzcw zzcwVar, zzts zztsVar, long j10, long j11, int i10, zzil zzilVar, boolean z10, zzvs zzvsVar, zzxm zzxmVar, List list, zzts zztsVar2, boolean z11, int i11, zzch zzchVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzcwVar;
        this.zzb = zztsVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzilVar;
        this.zzg = z10;
        this.zzh = zzvsVar;
        this.zzi = zzxmVar;
        this.zzj = list;
        this.zzk = zztsVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = zzchVar;
        this.zzp = j12;
        this.zzq = j13;
        this.zzr = j14;
        this.zzs = j15;
        this.zzo = z12;
    }

    public static zzlg zzi(zzxm zzxmVar) {
        zzcw zzcwVar = zzcw.zza;
        zzts zztsVar = zzt;
        return new zzlg(zzcwVar, zztsVar, -9223372036854775807L, 0L, 1, null, false, zzvs.zza, zzxmVar, zzfud.zzl(), zztsVar, false, 0, zzch.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzts zzj() {
        return zzt;
    }

    public final long zza() {
        long j10;
        long j11;
        if (!zzk()) {
            return this.zzr;
        }
        do {
            j10 = this.zzs;
            j11 = this.zzr;
        } while (j10 != this.zzs);
        return zzfk.zzp(zzfk.zzr(j11) + (((float) (SystemClock.elapsedRealtime() - j10)) * this.zzn.zzc));
    }

    public final zzlg zzb() {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, zza(), SystemClock.elapsedRealtime(), this.zzo);
    }

    public final zzlg zzc(zzts zztsVar) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zztsVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzd(zzts zztsVar, long j10, long j11, long j12, long j13, zzvs zzvsVar, zzxm zzxmVar, List list) {
        return new zzlg(this.zza, zztsVar, j11, j12, this.zze, this.zzf, this.zzg, zzvsVar, zzxmVar, list, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, j13, j10, SystemClock.elapsedRealtime(), this.zzo);
    }

    public final zzlg zze(boolean z10, int i10) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzf(zzil zzilVar) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzilVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzg(int i10) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final zzlg zzh(zzcw zzcwVar) {
        return new zzlg(zzcwVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, this.zzo);
    }

    public final boolean zzk() {
        if (this.zze == 3 && this.zzl && this.zzm == 0) {
            return true;
        }
        return false;
    }
}
