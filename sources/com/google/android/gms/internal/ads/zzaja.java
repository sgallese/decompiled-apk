package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaja implements zzaio {
    private zzace zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzfb zza = new zzfb(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        zzdy.zzb(this.zzb);
        if (!this.zzc) {
            return;
        }
        int zza = zzfbVar.zza();
        int i10 = this.zzf;
        if (i10 < 10) {
            int min = Math.min(zza, 10 - i10);
            System.arraycopy(zzfbVar.zzI(), zzfbVar.zzc(), this.zza.zzI(), this.zzf, min);
            if (this.zzf + min == 10) {
                this.zza.zzG(0);
                if (this.zza.zzl() == 73 && this.zza.zzl() == 68 && this.zza.zzl() == 51) {
                    this.zza.zzH(3);
                    this.zze = this.zza.zzk() + 10;
                } else {
                    zzes.zzf("Id3Reader", "Discarding invalid ID3 tag");
                    this.zzc = false;
                    return;
                }
            }
        }
        int min2 = Math.min(zza, this.zze - this.zzf);
        this.zzb.zzq(zzfbVar, min2);
        this.zzf += min2;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        zzace zzv = zzabeVar.zzv(zzakaVar.zza(), 5);
        this.zzb = zzv;
        zzak zzakVar = new zzak();
        zzakVar.zzH(zzakaVar.zzb());
        zzakVar.zzS("application/id3");
        zzv.zzk(zzakVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
        int i10;
        zzdy.zzb(this.zzb);
        if (this.zzc && (i10 = this.zze) != 0 && this.zzf == i10) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                this.zzb.zzs(j10, 1, i10, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j10 != -9223372036854775807L) {
            this.zzd = j10;
        }
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
