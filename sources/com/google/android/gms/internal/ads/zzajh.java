package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzajh implements zzaam {
    private final zzfi zza;
    private final zzfb zzb = new zzfb();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzajh(zzfi zzfiVar, zzajg zzajgVar) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zza(zzabc zzabcVar, long j10) throws IOException {
        int zzh;
        long j11;
        long zzf = zzabcVar.zzf();
        int min = (int) Math.min(20000L, zzabcVar.zzd() - zzf);
        this.zzb.zzD(min);
        ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, min, false);
        zzfb zzfbVar = this.zzb;
        int i10 = -1;
        long j12 = -9223372036854775807L;
        int i11 = -1;
        while (zzfbVar.zza() >= 4) {
            if (zzaji.zzh(zzfbVar.zzI(), zzfbVar.zzc()) != 442) {
                zzfbVar.zzH(1);
            } else {
                zzfbVar.zzH(4);
                long zzc = zzajj.zzc(zzfbVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j10) {
                        if (j12 == -9223372036854775807L) {
                            return zzaal.zzd(zzb, zzf);
                        }
                        j11 = i11;
                    } else if (100000 + zzb > j10) {
                        j11 = zzfbVar.zzc();
                    } else {
                        i11 = zzfbVar.zzc();
                        j12 = zzb;
                    }
                    return zzaal.zze(zzf + j11);
                }
                int zzd = zzfbVar.zzd();
                if (zzfbVar.zza() < 10) {
                    zzfbVar.zzG(zzd);
                } else {
                    zzfbVar.zzH(9);
                    int zzl = zzfbVar.zzl() & 7;
                    if (zzfbVar.zza() < zzl) {
                        zzfbVar.zzG(zzd);
                    } else {
                        zzfbVar.zzH(zzl);
                        if (zzfbVar.zza() < 4) {
                            zzfbVar.zzG(zzd);
                        } else {
                            if (zzaji.zzh(zzfbVar.zzI(), zzfbVar.zzc()) == 443) {
                                zzfbVar.zzH(4);
                                int zzp = zzfbVar.zzp();
                                if (zzfbVar.zza() < zzp) {
                                    zzfbVar.zzG(zzd);
                                } else {
                                    zzfbVar.zzH(zzp);
                                }
                            }
                            while (true) {
                                if (zzfbVar.zza() < 4 || (zzh = zzaji.zzh(zzfbVar.zzI(), zzfbVar.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzfbVar.zzH(4);
                                if (zzfbVar.zza() < 2) {
                                    zzfbVar.zzG(zzd);
                                    break;
                                }
                                zzfbVar.zzG(Math.min(zzfbVar.zzd(), zzfbVar.zzc() + zzfbVar.zzp()));
                            }
                        }
                    }
                }
                i10 = zzfbVar.zzc();
            }
        }
        if (j12 != -9223372036854775807L) {
            return zzaal.zzf(j12, zzf + i10);
        }
        return zzaal.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzb() {
        zzfb zzfbVar = this.zzb;
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        zzfbVar.zzE(bArr, 0);
    }
}
