package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzajo implements zzakb {
    private final zzajn zza;
    private final zzfb zzb = new zzfb(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzajo(zzajn zzajnVar) {
        this.zza = zzajnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zza(zzfb zzfbVar, int i10) {
        int i11;
        boolean z10;
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = zzfbVar.zzc() + zzfbVar.zzl();
        } else {
            i11 = -1;
        }
        if (this.zzf) {
            if (i12 == 0) {
                return;
            }
            this.zzf = false;
            zzfbVar.zzG(i11);
            this.zzd = 0;
        }
        while (zzfbVar.zza() > 0) {
            int i13 = this.zzd;
            if (i13 < 3) {
                if (i13 == 0) {
                    int zzl = zzfbVar.zzl();
                    zzfbVar.zzG(zzfbVar.zzc() - 1);
                    if (zzl == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzfbVar.zza(), 3 - this.zzd);
                zzfbVar.zzC(this.zzb.zzI(), this.zzd, min);
                int i14 = this.zzd + min;
                this.zzd = i14;
                if (i14 == 3) {
                    this.zzb.zzG(0);
                    this.zzb.zzF(3);
                    this.zzb.zzH(1);
                    int zzl2 = this.zzb.zzl();
                    int zzl3 = this.zzb.zzl();
                    if ((zzl2 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.zze = z10;
                    this.zzc = (((zzl2 & 15) << 8) | zzl3) + 3;
                    int zzb = this.zzb.zzb();
                    int i15 = this.zzc;
                    if (zzb < i15) {
                        int zzb2 = this.zzb.zzb();
                        this.zzb.zzA(Math.min(4098, Math.max(i15, zzb2 + zzb2)));
                    }
                }
            } else {
                int min2 = Math.min(zzfbVar.zza(), this.zzc - i13);
                zzfbVar.zzC(this.zzb.zzI(), this.zzd, min2);
                int i16 = this.zzd + min2;
                this.zzd = i16;
                int i17 = this.zzc;
                if (i16 != i17) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzfk.zzd(this.zzb.zzI(), 0, i17, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzF(this.zzc - 4);
                    } else {
                        this.zzb.zzF(i17);
                    }
                    this.zzb.zzG(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzb(zzfi zzfiVar, zzabe zzabeVar, zzaka zzakaVar) {
        this.zza.zzb(zzfiVar, zzabeVar, zzakaVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzc() {
        this.zzf = true;
    }
}
