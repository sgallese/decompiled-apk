package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzaia extends zzahy {
    private zzahz zza;
    private int zzb;
    private boolean zzc;
    private zzacj zzd;
    private zzach zze;

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfbVar) {
        int i10;
        int i11 = 0;
        if ((zzfbVar.zzI()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzfbVar.zzI()[0];
        zzahz zzahzVar = this.zza;
        zzdy.zzb(zzahzVar);
        if (!zzahzVar.zzd[(b10 >> 1) & (255 >>> (8 - zzahzVar.zze))].zza) {
            i10 = zzahzVar.zza.zze;
        } else {
            i10 = zzahzVar.zza.zzf;
        }
        if (this.zzc) {
            i11 = (this.zzb + i10) / 4;
        }
        if (zzfbVar.zzb() < zzfbVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd() + 4);
            zzfbVar.zzE(copyOf, copyOf.length);
        } else {
            zzfbVar.zzF(zzfbVar.zzd() + 4);
        }
        long j10 = i11;
        byte[] zzI = zzfbVar.zzI();
        zzI[zzfbVar.zzd() - 4] = (byte) (j10 & 255);
        zzI[zzfbVar.zzd() - 3] = (byte) ((j10 >>> 8) & 255);
        zzI[zzfbVar.zzd() - 2] = (byte) ((j10 >>> 16) & 255);
        zzI[zzfbVar.zzd() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    protected final boolean zzc(zzfb zzfbVar, long j10, zzahv zzahvVar) throws IOException {
        zzahz zzahzVar;
        int i10;
        int i11;
        int i12;
        int i13;
        zzacj zzacjVar;
        long j11;
        if (this.zza != null) {
            zzahvVar.zza.getClass();
            return false;
        }
        zzacj zzacjVar2 = this.zzd;
        int i14 = 4;
        if (zzacjVar2 == null) {
            zzack.zzd(1, zzfbVar, false);
            int zzi = zzfbVar.zzi();
            int zzl = zzfbVar.zzl();
            int zzi2 = zzfbVar.zzi();
            int zzh = zzfbVar.zzh();
            int i15 = zzh <= 0 ? -1 : zzh;
            int zzh2 = zzfbVar.zzh();
            int i16 = zzh2 <= 0 ? -1 : zzh2;
            int zzh3 = zzfbVar.zzh();
            int i17 = zzh3 <= 0 ? -1 : zzh3;
            int zzl2 = zzfbVar.zzl();
            this.zzd = new zzacj(zzi, zzl, zzi2, i15, i16, i17, (int) Math.pow(2.0d, zzl2 & 15), (int) Math.pow(2.0d, (zzl2 & 240) >> 4), 1 == (zzfbVar.zzl() & 1), Arrays.copyOf(zzfbVar.zzI(), zzfbVar.zzd()));
        } else {
            zzach zzachVar = this.zze;
            if (zzachVar == null) {
                this.zze = zzack.zzc(zzfbVar, true, true);
            } else {
                byte[] bArr = new byte[zzfbVar.zzd()];
                System.arraycopy(zzfbVar.zzI(), 0, bArr, 0, zzfbVar.zzd());
                int i18 = zzacjVar2.zza;
                int i19 = 5;
                zzack.zzd(5, zzfbVar, false);
                int zzl3 = zzfbVar.zzl() + 1;
                zzacg zzacgVar = new zzacg(zzfbVar.zzI());
                zzacgVar.zzc(zzfbVar.zzc() * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 < zzl3) {
                        if (zzacgVar.zzb(24) == 5653314) {
                            int zzb = zzacgVar.zzb(16);
                            int zzb2 = zzacgVar.zzb(24);
                            if (!zzacgVar.zzd()) {
                                boolean zzd = zzacgVar.zzd();
                                for (int i23 = 0; i23 < zzb2; i23++) {
                                    if (zzd) {
                                        if (zzacgVar.zzd()) {
                                            zzacgVar.zzc(5);
                                        }
                                    } else {
                                        zzacgVar.zzc(5);
                                    }
                                }
                            } else {
                                zzacgVar.zzc(5);
                                for (int i24 = 0; i24 < zzb2; i24 += zzacgVar.zzb(zzack.zza(zzb2 - i24))) {
                                }
                            }
                            int zzb3 = zzacgVar.zzb(i14);
                            if (zzb3 > 2) {
                                throw zzcd.zza("lookup type greater than 2 not decodable: " + zzb3, null);
                            }
                            if (zzb3 == 1) {
                                i21 = zzb3;
                            } else if (zzb3 != 2) {
                                zzacjVar = zzacjVar2;
                                i20++;
                                zzacjVar2 = zzacjVar;
                                i14 = 4;
                            }
                            zzacgVar.zzc(32);
                            zzacgVar.zzc(32);
                            int zzb4 = zzacgVar.zzb(i14) + 1;
                            zzacgVar.zzc(1);
                            if (i21 != 1) {
                                zzacjVar = zzacjVar2;
                                j11 = zzb2 * zzb;
                            } else if (zzb != 0) {
                                zzacjVar = zzacjVar2;
                                j11 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                            } else {
                                zzacjVar = zzacjVar2;
                                j11 = 0;
                            }
                            zzacgVar.zzc((int) (j11 * zzb4));
                            i20++;
                            zzacjVar2 = zzacjVar;
                            i14 = 4;
                        } else {
                            throw zzcd.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzacgVar.zza(), null);
                        }
                    } else {
                        zzacj zzacjVar3 = zzacjVar2;
                        int i25 = 6;
                        int zzb5 = zzacgVar.zzb(6) + 1;
                        for (int i26 = 0; i26 < zzb5; i26++) {
                            if (zzacgVar.zzb(16) != 0) {
                                throw zzcd.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i27 = 1;
                        int zzb6 = zzacgVar.zzb(6) + 1;
                        int i28 = 0;
                        while (true) {
                            int i29 = 3;
                            if (i28 < zzb6) {
                                int zzb7 = zzacgVar.zzb(i22);
                                if (zzb7 == 0) {
                                    i12 = zzb6;
                                    int i30 = 8;
                                    zzacgVar.zzc(8);
                                    zzacgVar.zzc(16);
                                    zzacgVar.zzc(16);
                                    zzacgVar.zzc(6);
                                    zzacgVar.zzc(8);
                                    int zzb8 = zzacgVar.zzb(4) + 1;
                                    int i31 = 0;
                                    while (i31 < zzb8) {
                                        zzacgVar.zzc(i30);
                                        i31++;
                                        i30 = 8;
                                    }
                                } else if (zzb7 != i27) {
                                    throw zzcd.zza("floor type greater than 1 not decodable: " + zzb7, null);
                                } else {
                                    int zzb9 = zzacgVar.zzb(i19);
                                    int[] iArr = new int[zzb9];
                                    int i32 = -1;
                                    for (int i33 = 0; i33 < zzb9; i33++) {
                                        int zzb10 = zzacgVar.zzb(4);
                                        iArr[i33] = zzb10;
                                        if (zzb10 > i32) {
                                            i32 = zzb10;
                                        }
                                    }
                                    int i34 = i32 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = zzacgVar.zzb(i29) + 1;
                                        int zzb11 = zzacgVar.zzb(i21);
                                        if (zzb11 > 0) {
                                            i13 = 8;
                                            zzacgVar.zzc(8);
                                        } else {
                                            i13 = 8;
                                        }
                                        int i36 = zzb6;
                                        int i37 = 0;
                                        for (int i38 = 1; i37 < (i38 << zzb11); i38 = 1) {
                                            zzacgVar.zzc(i13);
                                            i37++;
                                            i13 = 8;
                                        }
                                        i35++;
                                        zzb6 = i36;
                                        i21 = 2;
                                        i29 = 3;
                                    }
                                    i12 = zzb6;
                                    zzacgVar.zzc(2);
                                    int zzb12 = zzacgVar.zzb(4);
                                    int i39 = 0;
                                    int i40 = 0;
                                    for (int i41 = 0; i41 < zzb9; i41++) {
                                        i39 += iArr2[iArr[i41]];
                                        while (i40 < i39) {
                                            zzacgVar.zzc(zzb12);
                                            i40++;
                                        }
                                    }
                                }
                                i28++;
                                zzb6 = i12;
                                i25 = 6;
                                i22 = 16;
                                i21 = 2;
                                i27 = 1;
                                i19 = 5;
                            } else {
                                int i42 = 1;
                                int zzb13 = zzacgVar.zzb(i25) + 1;
                                int i43 = 0;
                                while (i43 < zzb13) {
                                    if (zzacgVar.zzb(16) <= 2) {
                                        zzacgVar.zzc(24);
                                        zzacgVar.zzc(24);
                                        zzacgVar.zzc(24);
                                        int zzb14 = zzacgVar.zzb(i25) + i42;
                                        int i44 = 8;
                                        zzacgVar.zzc(8);
                                        int[] iArr3 = new int[zzb14];
                                        for (int i45 = 0; i45 < zzb14; i45++) {
                                            iArr3[i45] = ((zzacgVar.zzd() ? zzacgVar.zzb(5) : 0) * 8) + zzacgVar.zzb(3);
                                        }
                                        int i46 = 0;
                                        while (i46 < zzb14) {
                                            int i47 = 0;
                                            while (i47 < i44) {
                                                if ((iArr3[i46] & (1 << i47)) != 0) {
                                                    zzacgVar.zzc(i44);
                                                }
                                                i47++;
                                                i44 = 8;
                                            }
                                            i46++;
                                            i44 = 8;
                                        }
                                        i43++;
                                        i25 = 6;
                                        i42 = 1;
                                    } else {
                                        throw zzcd.zza("residueType greater than 2 is not decodable", null);
                                    }
                                }
                                int zzb15 = zzacgVar.zzb(i25) + 1;
                                for (int i48 = 0; i48 < zzb15; i48++) {
                                    int zzb16 = zzacgVar.zzb(16);
                                    if (zzb16 != 0) {
                                        zzes.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb16);
                                    } else {
                                        if (zzacgVar.zzd()) {
                                            i10 = 1;
                                            i11 = zzacgVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            i11 = 1;
                                        }
                                        if (zzacgVar.zzd()) {
                                            int zzb17 = zzacgVar.zzb(8) + i10;
                                            for (int i49 = 0; i49 < zzb17; i49++) {
                                                int i50 = i18 - 1;
                                                zzacgVar.zzc(zzack.zza(i50));
                                                zzacgVar.zzc(zzack.zza(i50));
                                            }
                                        }
                                        if (zzacgVar.zzb(2) != 0) {
                                            throw zzcd.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i11 > 1) {
                                            for (int i51 = 0; i51 < i18; i51++) {
                                                zzacgVar.zzc(4);
                                            }
                                        }
                                        for (int i52 = 0; i52 < i11; i52++) {
                                            zzacgVar.zzc(8);
                                            zzacgVar.zzc(8);
                                            zzacgVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb18 = zzacgVar.zzb(6) + 1;
                                zzaci[] zzaciVarArr = new zzaci[zzb18];
                                for (int i53 = 0; i53 < zzb18; i53++) {
                                    zzaciVarArr[i53] = new zzaci(zzacgVar.zzd(), zzacgVar.zzb(16), zzacgVar.zzb(16), zzacgVar.zzb(8));
                                }
                                if (zzacgVar.zzd()) {
                                    zzahzVar = new zzahz(zzacjVar3, zzachVar, bArr, zzaciVarArr, zzack.zza(zzb18 - 1));
                                } else {
                                    throw zzcd.zza("framing bit after modes not set as expected", null);
                                }
                            }
                        }
                    }
                }
            }
        }
        zzahzVar = null;
        this.zza = zzahzVar;
        if (zzahzVar == null) {
            return true;
        }
        zzacj zzacjVar4 = zzahzVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzacjVar4.zzg);
        arrayList.add(zzahzVar.zzc);
        zzbz zzb19 = zzack.zzb(zzfud.zzk(zzahzVar.zzb.zzb));
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/vorbis");
        zzakVar.zzv(zzacjVar4.zzd);
        zzakVar.zzO(zzacjVar4.zzc);
        zzakVar.zzw(zzacjVar4.zza);
        zzakVar.zzT(zzacjVar4.zzb);
        zzakVar.zzI(arrayList);
        zzakVar.zzM(zzb19);
        zzahvVar.zza = zzakVar.zzY();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzahy
    public final void zzi(long j10) {
        boolean z10;
        super.zzi(j10);
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzc = z10;
        zzacj zzacjVar = this.zzd;
        if (zzacjVar != null) {
            i10 = zzacjVar.zze;
        }
        this.zzb = i10;
    }
}
