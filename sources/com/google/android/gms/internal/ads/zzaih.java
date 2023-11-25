package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaih implements zzaio {
    private final zzfa zza;
    private final zzfb zzb;
    private final String zzc;
    private String zzd;
    private zzace zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzaih() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        boolean z10;
        boolean z11;
        zzdy.zzb(this.zze);
        while (zzfbVar.zza() > 0) {
            int i10 = this.zzf;
            if (i10 != 0) {
                if (i10 != 1) {
                    int min = Math.min(zzfbVar.zza(), this.zzk - this.zzg);
                    this.zze.zzq(zzfbVar, min);
                    int i11 = this.zzg + min;
                    this.zzg = i11;
                    int i12 = this.zzk;
                    if (i11 == i12) {
                        long j10 = this.zzl;
                        if (j10 != -9223372036854775807L) {
                            this.zze.zzs(j10, 1, i12, 0, null);
                            this.zzl += this.zzi;
                        }
                        this.zzf = 0;
                    }
                } else {
                    byte[] zzI = this.zzb.zzI();
                    int min2 = Math.min(zzfbVar.zza(), 16 - this.zzg);
                    zzfbVar.zzC(zzI, this.zzg, min2);
                    int i13 = this.zzg + min2;
                    this.zzg = i13;
                    if (i13 == 16) {
                        this.zza.zzj(0);
                        zzaae zza = zzaaf.zza(this.zza);
                        zzam zzamVar = this.zzj;
                        if (zzamVar == null || zzamVar.zzz != 2 || zza.zza != zzamVar.zzA || !"audio/ac4".equals(zzamVar.zzm)) {
                            zzak zzakVar = new zzak();
                            zzakVar.zzH(this.zzd);
                            zzakVar.zzS("audio/ac4");
                            zzakVar.zzw(2);
                            zzakVar.zzT(zza.zza);
                            zzakVar.zzK(this.zzc);
                            zzam zzY = zzakVar.zzY();
                            this.zzj = zzY;
                            this.zze.zzk(zzY);
                        }
                        this.zzk = zza.zzb;
                        this.zzi = (zza.zzc * 1000000) / this.zzj.zzA;
                        this.zzb.zzG(0);
                        this.zze.zzq(this.zzb, 16);
                        this.zzf = 2;
                    }
                }
            } else {
                while (zzfbVar.zza() > 0) {
                    if (!this.zzh) {
                        if (zzfbVar.zzl() == 172) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.zzh = z10;
                    } else {
                        int zzl = zzfbVar.zzl();
                        if (zzl == 172) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.zzh = z11;
                        byte b10 = 64;
                        if (zzl != 64) {
                            if (zzl == 65) {
                                zzl = 65;
                            }
                        }
                        this.zzf = 1;
                        zzfb zzfbVar2 = this.zzb;
                        zzfbVar2.zzI()[0] = -84;
                        byte[] zzI2 = zzfbVar2.zzI();
                        if (zzl == 65) {
                            b10 = 65;
                        }
                        zzI2[1] = b10;
                        this.zzg = 2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zzd = zzakaVar.zzb();
        this.zze = zzabeVar.zzv(zzakaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzaih(String str) {
        zzfa zzfaVar = new zzfa(new byte[16], 16);
        this.zza = zzfaVar;
        this.zzb = new zzfb(zzfaVar.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
    }
}
