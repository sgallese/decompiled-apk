package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzahy {
    private zzace zzb;
    private zzabe zzc;
    private zzaht zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzahr zza = new zzahr();
    private zzahv zzj = new zzahv();

    protected abstract long zza(zzfb zzfbVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(boolean z10) {
        int i10;
        if (z10) {
            this.zzj = new zzahv();
            this.zzf = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.zzh = i10;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract boolean zzc(zzfb zzfbVar, long j10, zzahv zzahvVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        boolean z10;
        zzdy.zzb(this.zzb);
        int i10 = zzfk.zza;
        int i11 = this.zzh;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return -1;
                }
                long zzd = this.zzd.zzd(zzabcVar);
                if (zzd >= 0) {
                    zzabxVar.zza = zzd;
                    return 1;
                }
                if (zzd < -1) {
                    zzi(-(zzd + 2));
                }
                if (!this.zzl) {
                    zzaca zze = this.zzd.zze();
                    zzdy.zzb(zze);
                    this.zzc.zzN(zze);
                    this.zzl = true;
                }
                if (this.zzk <= 0 && !this.zza.zze(zzabcVar)) {
                    this.zzh = 3;
                    return -1;
                }
                this.zzk = 0L;
                zzfb zza = this.zza.zza();
                long zza2 = zza(zza);
                if (zza2 >= 0) {
                    long j10 = this.zzg;
                    if (j10 + zza2 >= this.zze) {
                        long zzf = zzf(j10);
                        zzacc.zzb(this.zzb, zza, zza.zzd());
                        this.zzb.zzs(zzf, 1, zza.zzd(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zza2;
                return 0;
            }
            ((zzaar) zzabcVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        while (this.zza.zze(zzabcVar)) {
            long zzf2 = zzabcVar.zzf();
            long j11 = this.zzf;
            this.zzk = zzf2 - j11;
            if (zzc(this.zza.zza(), j11, this.zzj)) {
                this.zzf = zzabcVar.zzf();
            } else {
                zzam zzamVar = this.zzj.zza;
                this.zzi = zzamVar.zzA;
                if (!this.zzm) {
                    this.zzb.zzk(zzamVar);
                    this.zzm = true;
                }
                zzaht zzahtVar = this.zzj.zzb;
                if (zzahtVar != null) {
                    this.zzd = zzahtVar;
                } else if (zzabcVar.zzd() == -1) {
                    this.zzd = new zzahx(null);
                } else {
                    zzahs zzb = this.zza.zzb();
                    if ((zzb.zza & 4) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.zzd = new zzahm(this, this.zzf, zzabcVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, z10);
                }
                this.zzh = 2;
                this.zza.zzd();
                return 0;
            }
        }
        this.zzh = 3;
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzf(long j10) {
        return (j10 * 1000000) / this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzg(long j10) {
        return (this.zzi * j10) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(zzabe zzabeVar, zzace zzaceVar) {
        this.zzc = zzabeVar;
        this.zzb = zzaceVar;
        zzb(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzi(long j10) {
        this.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(long j10, long j11) {
        this.zza.zzc();
        if (j10 == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            long zzg = zzg(j11);
            this.zze = zzg;
            zzaht zzahtVar = this.zzd;
            int i10 = zzfk.zza;
            zzahtVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
