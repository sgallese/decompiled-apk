package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzajf implements zzakb {
    private final zzaio zza;
    private final zzfa zzb = new zzfa(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfi zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzajf(zzaio zzaioVar) {
        this.zza = zzaioVar;
    }

    private final void zzd(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zze(zzfb zzfbVar, byte[] bArr, int i10) {
        int min = Math.min(zzfbVar.zza(), i10 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfbVar.zzH(min);
        } else {
            zzfbVar.zzC(bArr, this.zzd, min);
        }
        int i11 = this.zzd + min;
        this.zzd = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zza(zzfb zzfbVar, int i10) throws zzcd {
        int i11;
        long j10;
        int i12;
        int i13;
        int i14;
        boolean z10;
        zzdy.zzb(this.zze);
        int i15 = -1;
        int i16 = 2;
        ?? r62 = 0;
        int i17 = 1;
        if ((i10 & 1) != 0) {
            int i18 = this.zzc;
            if (i18 != 0 && i18 != 1) {
                if (i18 != 2) {
                    int i19 = this.zzj;
                    if (i19 != -1) {
                        zzes.zzf("PesReader", "Unexpected start indicator: expected " + i19 + " more bytes");
                    }
                    if (zzfbVar.zzd() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.zza.zzc(z10);
                } else {
                    zzes.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i20 = i10;
        while (zzfbVar.zza() > 0) {
            int i21 = this.zzc;
            if (i21 != 0) {
                if (i21 != i17) {
                    if (i21 != i16) {
                        int zza = zzfbVar.zza();
                        int i22 = this.zzj;
                        if (i22 == i15) {
                            i14 = 0;
                        } else {
                            i14 = zza - i22;
                        }
                        if (i14 > 0) {
                            zza -= i14;
                            zzfbVar.zzF(zzfbVar.zzc() + zza);
                        }
                        this.zza.zza(zzfbVar);
                        int i23 = this.zzj;
                        if (i23 != i15) {
                            int i24 = i23 - zza;
                            this.zzj = i24;
                            if (i24 == 0) {
                                this.zza.zzc(r62);
                                zzd(i17);
                            }
                        }
                    } else {
                        if (zze(zzfbVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfbVar, null, this.zzi)) {
                            this.zzb.zzj(r62);
                            if (this.zzf) {
                                this.zzb.zzl(4);
                                long zzd = this.zzb.zzd(3);
                                this.zzb.zzl(i17);
                                int zzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzl(i17);
                                long zzd3 = this.zzb.zzd(15);
                                this.zzb.zzl(i17);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzl(4);
                                    this.zzb.zzl(i17);
                                    int zzd4 = this.zzb.zzd(15) << 15;
                                    this.zzb.zzl(i17);
                                    long zzd5 = this.zzb.zzd(15);
                                    this.zzb.zzl(i17);
                                    i13 = zzd2;
                                    this.zze.zzb((this.zzb.zzd(3) << 30) | zzd4 | zzd5);
                                    this.zzh = true;
                                } else {
                                    i13 = zzd2;
                                }
                                j10 = this.zze.zzb((zzd << 30) | i13 | zzd3);
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (true != this.zzk) {
                                i12 = 0;
                            } else {
                                i12 = 4;
                            }
                            i20 |= i12;
                            this.zza.zzd(j10, i20);
                            zzd(3);
                            i15 = -1;
                        }
                    }
                } else if (zze(zzfbVar, this.zzb.zza, 9)) {
                    this.zzb.zzj(0);
                    int zzd6 = this.zzb.zzd(24);
                    if (zzd6 != 1) {
                        zzes.zzf("PesReader", "Unexpected start code prefix: " + zzd6);
                        i15 = -1;
                        this.zzj = -1;
                        i11 = 0;
                    } else {
                        this.zzb.zzl(8);
                        int zzd7 = this.zzb.zzd(16);
                        this.zzb.zzl(5);
                        this.zzk = this.zzb.zzn();
                        this.zzb.zzl(2);
                        this.zzf = this.zzb.zzn();
                        this.zzg = this.zzb.zzn();
                        this.zzb.zzl(6);
                        int zzd8 = this.zzb.zzd(8);
                        this.zzi = zzd8;
                        if (zzd7 == 0) {
                            this.zzj = -1;
                        } else {
                            int i25 = (zzd7 - 3) - zzd8;
                            this.zzj = i25;
                            if (i25 < 0) {
                                zzes.zzf("PesReader", "Found negative packet payload size: " + i25);
                                i15 = -1;
                                this.zzj = -1;
                                i11 = 2;
                            }
                        }
                        i15 = -1;
                        i11 = 2;
                    }
                    zzd(i11);
                } else {
                    i15 = -1;
                }
            } else {
                zzfbVar.zzH(zzfbVar.zza());
            }
            i16 = 2;
            r62 = 0;
            i17 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzb(zzfi zzfiVar, zzabe zzabeVar, zzaka zzakaVar) {
        this.zze = zzfiVar;
        this.zza.zzb(zzabeVar, zzakaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
