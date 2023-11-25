package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzaiy {
    private final zzace zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzaiy(zzace zzaceVar) {
        this.zza = zzaceVar;
    }

    private final void zzf(int i10) {
        long j10 = this.zzl;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.zzm;
        long j11 = this.zzb - this.zzk;
        this.zza.zzs(j10, z10 ? 1 : 0, (int) j11, i10, null);
    }

    public final void zza(long j10) {
        this.zzb = j10;
        zzf(0);
        this.zzi = false;
    }

    public final void zzb(long j10, int i10, boolean z10) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (!this.zzh && !this.zzg) {
        } else {
            if (z10 && this.zzi) {
                zzf(i10 + ((int) (j10 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        boolean z10;
        if (this.zzf) {
            int i12 = this.zzd;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.zzg = z10;
                this.zzf = false;
                return;
            }
            this.zzd = i12 + (i11 - i10);
        }
    }

    public final void zzd() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zze(long j10, int i10, int i11, long j11, boolean z10) {
        boolean z11;
        boolean z12 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = j11;
        this.zzd = 0;
        this.zzb = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.zzi && !this.zzj) {
                if (z10) {
                    zzf(i10);
                }
                this.zzi = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        if (i11 >= 16 && i11 <= 21) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzc = z11;
        if (z11 || i11 <= 9) {
            z12 = true;
        }
        this.zzf = z12;
    }
}
