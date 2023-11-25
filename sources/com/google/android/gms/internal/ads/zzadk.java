package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzadk extends zzadj {
    private final zzfb zzb;
    private final zzfb zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzadk(zzace zzaceVar) {
        super(zzaceVar);
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zza(zzfb zzfbVar) throws zzadi {
        int zzl = zzfbVar.zzl();
        int i10 = zzl >> 4;
        int i11 = zzl & 15;
        if (i11 == 7) {
            this.zzg = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new zzadi("Video format not supported: " + i11);
    }

    @Override // com.google.android.gms.internal.ads.zzadj
    protected final boolean zzb(zzfb zzfbVar, long j10) throws zzcd {
        int i10;
        int zzl = zzfbVar.zzl();
        long zzg = zzfbVar.zzg();
        if (zzl == 0) {
            if (!this.zze) {
                zzfb zzfbVar2 = new zzfb(new byte[zzfbVar.zza()]);
                zzfbVar.zzC(zzfbVar2.zzI(), 0, zzfbVar.zza());
                zzaag zza = zzaag.zza(zzfbVar2);
                this.zzd = zza.zzb;
                zzak zzakVar = new zzak();
                zzakVar.zzS("video/avc");
                zzakVar.zzx(zza.zzi);
                zzakVar.zzX(zza.zzc);
                zzakVar.zzF(zza.zzd);
                zzakVar.zzP(zza.zzh);
                zzakVar.zzI(zza.zza);
                this.zza.zzk(zzakVar.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzl == 1 && this.zze) {
            if (this.zzg == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.zzf && i10 == 0) {
                return false;
            }
            byte[] zzI = this.zzc.zzI();
            zzI[0] = 0;
            zzI[1] = 0;
            zzI[2] = 0;
            int i11 = 4 - this.zzd;
            int i12 = 0;
            while (zzfbVar.zza() > 0) {
                zzfbVar.zzC(this.zzc.zzI(), i11, this.zzd);
                this.zzc.zzG(0);
                int zzo = this.zzc.zzo();
                this.zzb.zzG(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzfbVar, zzo);
                i12 = i12 + 4 + zzo;
            }
            this.zza.zzs(j10 + (zzg * 1000), i10, i12, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
