package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzajc implements zzaio {
    private final zzfb zza;
    private final zzabu zzb;
    private final String zzc;
    private zzace zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzajc() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zza(zzfb zzfbVar) {
        boolean z10;
        boolean z11;
        zzdy.zzb(this.zzd);
        while (zzfbVar.zza() > 0) {
            int i10 = this.zzf;
            if (i10 != 0) {
                if (i10 != 1) {
                    int min = Math.min(zzfbVar.zza(), this.zzk - this.zzg);
                    this.zzd.zzq(zzfbVar, min);
                    int i11 = this.zzg + min;
                    this.zzg = i11;
                    int i12 = this.zzk;
                    if (i11 >= i12) {
                        long j10 = this.zzl;
                        if (j10 != -9223372036854775807L) {
                            this.zzd.zzs(j10, 1, i12, 0, null);
                            this.zzl += this.zzj;
                        }
                        this.zzg = 0;
                        this.zzf = 0;
                    }
                } else {
                    int min2 = Math.min(zzfbVar.zza(), 4 - this.zzg);
                    zzfbVar.zzC(this.zza.zzI(), this.zzg, min2);
                    int i13 = this.zzg + min2;
                    this.zzg = i13;
                    if (i13 >= 4) {
                        this.zza.zzG(0);
                        if (!this.zzb.zza(this.zza.zzf())) {
                            this.zzg = 0;
                            this.zzf = 1;
                        } else {
                            this.zzk = this.zzb.zzc;
                            if (!this.zzh) {
                                this.zzj = (r0.zzg * 1000000) / r0.zzd;
                                zzak zzakVar = new zzak();
                                zzakVar.zzH(this.zze);
                                zzakVar.zzS(this.zzb.zzb);
                                zzakVar.zzL(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                                zzakVar.zzw(this.zzb.zze);
                                zzakVar.zzT(this.zzb.zzd);
                                zzakVar.zzK(this.zzc);
                                this.zzd.zzk(zzakVar.zzY());
                                this.zzh = true;
                            }
                            this.zza.zzG(0);
                            this.zzd.zzq(this.zza, 4);
                            this.zzf = 2;
                        }
                    }
                }
            } else {
                byte[] zzI = zzfbVar.zzI();
                int zzc = zzfbVar.zzc();
                int zzd = zzfbVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        byte b10 = zzI[zzc];
                        if ((b10 & 255) == 255) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (this.zzi && (b10 & 224) == 224) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.zzi = z10;
                        if (z11) {
                            zzfbVar.zzG(zzc + 1);
                            this.zzi = false;
                            this.zza.zzI()[1] = zzI[zzc];
                            this.zzg = 2;
                            this.zzf = 1;
                            break;
                        }
                        zzc++;
                    } else {
                        zzfbVar.zzG(zzd);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzb(zzabe zzabeVar, zzaka zzakaVar) {
        zzakaVar.zzc();
        this.zze = zzakaVar.zzb();
        this.zzd = zzabeVar.zzv(zzakaVar.zza(), 1);
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
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzajc(String str) {
        this.zzf = 0;
        zzfb zzfbVar = new zzfb(4);
        this.zza = zzfbVar;
        zzfbVar.zzI()[0] = -1;
        this.zzb = new zzabu();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final void zzc(boolean z10) {
    }
}
