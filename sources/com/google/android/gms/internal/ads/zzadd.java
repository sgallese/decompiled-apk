package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzadd implements zzabb {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzadc
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzadd(0)};
        }
    };
    private final byte[] zzb;
    private final zzfb zzc;
    private final zzabj zzd;
    private zzabe zze;
    private zzace zzf;
    private int zzg;
    private zzbz zzh;
    private zzabo zzi;
    private int zzj;
    private int zzk;
    private zzadb zzl;
    private int zzm;
    private long zzn;

    public zzadd() {
        this(0);
    }

    private final long zze(zzfb zzfbVar, boolean z10) {
        boolean z11;
        this.zzi.getClass();
        int zzc = zzfbVar.zzc();
        while (zzc <= zzfbVar.zzd() - 16) {
            zzfbVar.zzG(zzc);
            if (zzabk.zzc(zzfbVar, this.zzi, this.zzk, this.zzd)) {
                zzfbVar.zzG(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (z10) {
            while (zzc <= zzfbVar.zzd() - this.zzj) {
                zzfbVar.zzG(zzc);
                try {
                    z11 = zzabk.zzc(zzfbVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (zzfbVar.zzc() <= zzfbVar.zzd() && z11) {
                    zzfbVar.zzG(zzc);
                    return this.zzd.zza;
                }
                zzc++;
            }
            zzfbVar.zzG(zzfbVar.zzd());
            return -1L;
        }
        zzfbVar.zzG(zzc);
        return -1L;
    }

    private final void zzf() {
        long j10 = this.zzn * 1000000;
        zzabo zzaboVar = this.zzi;
        int i10 = zzfk.zza;
        this.zzf.zzs(j10 / zzaboVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        boolean zzn;
        zzaca zzabzVar;
        int i10 = this.zzg;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            this.zzf.getClass();
                            zzabo zzaboVar = this.zzi;
                            zzaboVar.getClass();
                            zzadb zzadbVar = this.zzl;
                            if (zzadbVar != null && zzadbVar.zze()) {
                                return zzadbVar.zza(zzabcVar, zzabxVar);
                            }
                            if (this.zzn == -1) {
                                this.zzn = zzabk.zzb(zzabcVar, zzaboVar);
                                return 0;
                            }
                            zzfb zzfbVar = this.zzc;
                            int zzd = zzfbVar.zzd();
                            if (zzd < 32768) {
                                int zza2 = zzabcVar.zza(zzfbVar.zzI(), zzd, 32768 - zzd);
                                if (zza2 != -1) {
                                    z10 = false;
                                }
                                if (!z10) {
                                    this.zzc.zzF(zzd + zza2);
                                } else if (this.zzc.zza() == 0) {
                                    zzf();
                                    return -1;
                                }
                            } else {
                                z10 = false;
                            }
                            zzfb zzfbVar2 = this.zzc;
                            int zzc = zzfbVar2.zzc();
                            int i11 = this.zzm;
                            int i12 = this.zzj;
                            if (i11 < i12) {
                                zzfbVar2.zzH(Math.min(i12 - i11, zzfbVar2.zza()));
                            }
                            long zze = zze(this.zzc, z10);
                            zzfb zzfbVar3 = this.zzc;
                            int zzc2 = zzfbVar3.zzc() - zzc;
                            zzfbVar3.zzG(zzc);
                            zzacc.zzb(this.zzf, this.zzc, zzc2);
                            this.zzm += zzc2;
                            if (zze != -1) {
                                zzf();
                                this.zzm = 0;
                                this.zzn = zze;
                            }
                            zzfb zzfbVar4 = this.zzc;
                            if (zzfbVar4.zza() >= 16) {
                                return 0;
                            }
                            int zza3 = zzfbVar4.zza();
                            System.arraycopy(zzfbVar4.zzI(), zzfbVar4.zzc(), zzfbVar4.zzI(), 0, zza3);
                            this.zzc.zzG(0);
                            this.zzc.zzF(zza3);
                            return 0;
                        }
                        zzabcVar.zzj();
                        zzfb zzfbVar5 = new zzfb(2);
                        ((zzaar) zzabcVar).zzm(zzfbVar5.zzI(), 0, 2, false);
                        int zzp = zzfbVar5.zzp();
                        if ((zzp >> 2) == 16382) {
                            zzabcVar.zzj();
                            this.zzk = zzp;
                            zzabe zzabeVar = this.zze;
                            int i13 = zzfk.zza;
                            long zzf = zzabcVar.zzf();
                            long zzd2 = zzabcVar.zzd();
                            zzabo zzaboVar2 = this.zzi;
                            zzaboVar2.getClass();
                            if (zzaboVar2.zzk != null) {
                                zzabzVar = new zzabm(zzaboVar2, zzf);
                            } else if (zzd2 != -1 && zzaboVar2.zzj > 0) {
                                zzadb zzadbVar2 = new zzadb(zzaboVar2, this.zzk, zzf, zzd2);
                                this.zzl = zzadbVar2;
                                zzabzVar = zzadbVar2.zzb();
                            } else {
                                zzabzVar = new zzabz(zzaboVar2.zza(), 0L);
                            }
                            zzabeVar.zzN(zzabzVar);
                            this.zzg = 5;
                            return 0;
                        }
                        zzabcVar.zzj();
                        throw zzcd.zza("First frame does not start with sync code.", null);
                    }
                    zzabo zzaboVar3 = this.zzi;
                    do {
                        zzabcVar.zzj();
                        zzfa zzfaVar = new zzfa(new byte[4], 4);
                        zzaar zzaarVar = (zzaar) zzabcVar;
                        zzaarVar.zzm(zzfaVar.zza, 0, 4, false);
                        zzn = zzfaVar.zzn();
                        int zzd3 = zzfaVar.zzd(7);
                        int zzd4 = zzfaVar.zzd(24) + 4;
                        if (zzd3 == 0) {
                            byte[] bArr = new byte[38];
                            zzaarVar.zzn(bArr, 0, 38, false);
                            zzaboVar3 = new zzabo(bArr, 4);
                        } else if (zzaboVar3 != null) {
                            if (zzd3 == 3) {
                                zzfb zzfbVar6 = new zzfb(zzd4);
                                zzaarVar.zzn(zzfbVar6.zzI(), 0, zzd4, false);
                                zzaboVar3 = zzaboVar3.zzf(zzabl.zzb(zzfbVar6));
                            } else if (zzd3 == 4) {
                                zzfb zzfbVar7 = new zzfb(zzd4);
                                zzaarVar.zzn(zzfbVar7.zzI(), 0, zzd4, false);
                                zzfbVar7.zzH(4);
                                zzaboVar3 = zzaboVar3.zzg(Arrays.asList(zzack.zzc(zzfbVar7, false, false).zzb));
                            } else if (zzd3 == 6) {
                                zzfb zzfbVar8 = new zzfb(zzd4);
                                zzaarVar.zzn(zzfbVar8.zzI(), 0, zzd4, false);
                                zzfbVar8.zzH(4);
                                zzaboVar3 = zzaboVar3.zze(zzfud.zzm(zzadx.zzb(zzfbVar8)));
                            } else {
                                zzaarVar.zzo(zzd4, false);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i14 = zzfk.zza;
                        this.zzi = zzaboVar3;
                    } while (!zzn);
                    zzaboVar3.getClass();
                    this.zzj = Math.max(zzaboVar3.zzc, 6);
                    this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
                    this.zzg = 4;
                    return 0;
                }
                zzfb zzfbVar9 = new zzfb(4);
                ((zzaar) zzabcVar).zzn(zzfbVar9.zzI(), 0, 4, false);
                if (zzfbVar9.zzt() == 1716281667) {
                    this.zzg = 3;
                    return 0;
                }
                throw zzcd.zza("Failed to read FLAC stream marker.", null);
            }
            ((zzaar) zzabcVar).zzm(this.zzb, 0, 42, false);
            zzabcVar.zzj();
            this.zzg = 2;
            return 0;
        }
        zzabcVar.zzj();
        long zze2 = zzabcVar.zze();
        zzbz zza4 = zzabl.zza(zzabcVar, true);
        ((zzaar) zzabcVar).zzo((int) (zzabcVar.zze() - zze2), false);
        this.zzh = zza4;
        this.zzg = 1;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zze = zzabeVar;
        this.zzf = zzabeVar.zzv(0, 1);
        zzabeVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.zzg = 0;
        } else {
            zzadb zzadbVar = this.zzl;
            if (zzadbVar != null) {
                zzadbVar.zzd(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.zzn = j12;
        this.zzm = 0;
        this.zzc.zzD(0);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        zzabl.zza(zzabcVar, false);
        zzfb zzfbVar = new zzfb(4);
        ((zzaar) zzabcVar).zzm(zzfbVar.zzI(), 0, 4, false);
        if (zzfbVar.zzt() != 1716281667) {
            return false;
        }
        return true;
    }

    public zzadd(int i10) {
        this.zzb = new byte[42];
        this.zzc = new zzfb(new byte[32768], 0);
        this.zzd = new zzabj();
        this.zzg = 0;
    }
}
