package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzahc implements zzabb, zzaca {
    public static final zzabi zza = new zzabi() { // from class: com.google.android.gms.internal.ads.zzagz
        @Override // com.google.android.gms.internal.ads.zzabi
        public final /* synthetic */ zzabb[] zza(Uri uri, Map map) {
            int i10 = zzabh.zza;
            return new zzabb[]{new zzahc(0)};
        }
    };
    private final zzfb zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfb zze;
    private final ArrayDeque zzf;
    private final zzahe zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzfb zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzabe zzr;
    private zzahb[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzaff zzx;

    public zzahc() {
        this(0);
    }

    private static int zzf(int i10) {
        if (i10 != 1751476579) {
            if (i10 != 1903435808) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private static int zzi(zzahj zzahjVar, long j10) {
        int zza2 = zzahjVar.zza(j10);
        if (zza2 == -1) {
            return zzahjVar.zzb(j10);
        }
        return zza2;
    }

    private static long zzj(zzahj zzahjVar, long j10, long j11) {
        int zzi = zzi(zzahjVar, j10);
        if (zzi == -1) {
            return j11;
        }
        return Math.min(zzahjVar.zzc[zzi], j11);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j10) throws zzcd {
        zzbz zzbzVar;
        zzbz zzbzVar2;
        boolean z10;
        long j11;
        List list;
        int i10;
        int i11;
        int i12;
        zzbz zzbzVar3;
        int i13;
        while (!this.zzf.isEmpty() && ((zzagh) this.zzf.peek()).zza == j10) {
            zzagh zzaghVar = (zzagh) this.zzf.pop();
            if (zzaghVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i14 = this.zzw;
                zzabq zzabqVar = new zzabq();
                zzagi zzb = zzaghVar.zzb(1969517665);
                if (zzb != null) {
                    zzbz zzb2 = zzagr.zzb(zzb);
                    zzabqVar.zzb(zzb2);
                    zzbzVar = zzb2;
                } else {
                    zzbzVar = null;
                }
                zzagh zza2 = zzaghVar.zza(1835365473);
                if (zza2 != null) {
                    zzbzVar2 = zzagr.zza(zza2);
                } else {
                    zzbzVar2 = null;
                }
                zzby[] zzbyVarArr = new zzby[1];
                zzagi zzb3 = zzaghVar.zzb(1836476516);
                zzb3.getClass();
                if (i14 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzbyVarArr[0] = zzagr.zzc(zzb3.zza);
                zzbz zzbzVar4 = new zzbz(-9223372036854775807L, zzbyVarArr);
                zzbz zzbzVar5 = zzbzVar;
                long j12 = -9223372036854775807L;
                List zzd = zzagr.zzd(zzaghVar, zzabqVar, -9223372036854775807L, null, false, z10, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzaha
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        zzahg zzahgVar = (zzahg) obj;
                        zzabi zzabiVar = zzahc.zza;
                        return zzahgVar;
                    }
                });
                int size = zzd.size();
                long j13 = -9223372036854775807L;
                int i15 = -1;
                int i16 = 0;
                while (true) {
                    j11 = 0;
                    if (i16 >= size) {
                        break;
                    }
                    zzahj zzahjVar = (zzahj) zzd.get(i16);
                    if (zzahjVar.zzb == 0) {
                        list = zzd;
                        i10 = size;
                        i13 = i16;
                    } else {
                        zzahg zzahgVar = zzahjVar.zza;
                        list = zzd;
                        long j14 = zzahgVar.zze;
                        if (j14 == j12) {
                            j14 = zzahjVar.zzh;
                        }
                        long max = Math.max(j13, j14);
                        i10 = size;
                        zzahb zzahbVar = new zzahb(zzahgVar, zzahjVar, this.zzr.zzv(i16, zzahgVar.zzb));
                        if ("audio/true-hd".equals(zzahgVar.zzf.zzm)) {
                            i11 = zzahjVar.zze * 16;
                        } else {
                            i11 = zzahjVar.zze + 30;
                        }
                        zzak zzb4 = zzahgVar.zzf.zzb();
                        zzb4.zzL(i11);
                        if (zzahgVar.zzb == 2 && j14 > 0) {
                            int i17 = zzahjVar.zzb;
                            i12 = 1;
                            if (i17 > 1) {
                                zzb4.zzE(i17 / (((float) j14) / 1000000.0f));
                            }
                        } else {
                            i12 = 1;
                        }
                        int i18 = zzahgVar.zzb;
                        int i19 = zzagy.zzb;
                        if (i18 == i12 && zzabqVar.zza()) {
                            zzb4.zzC(zzabqVar.zza);
                            zzb4.zzD(zzabqVar.zzb);
                        }
                        int i20 = zzahgVar.zzb;
                        zzbz[] zzbzVarArr = new zzbz[3];
                        if (this.zzh.isEmpty()) {
                            zzbzVar3 = null;
                        } else {
                            zzbzVar3 = new zzbz(this.zzh);
                        }
                        zzbzVarArr[0] = zzbzVar3;
                        zzbzVarArr[i12] = zzbzVar5;
                        zzbzVarArr[2] = zzbzVar4;
                        i13 = i16;
                        zzbz zzbzVar6 = new zzbz(-9223372036854775807L, new zzby[0]);
                        if (zzbzVar2 != null) {
                            for (int i21 = 0; i21 < zzbzVar2.zza(); i21++) {
                                zzby zzb5 = zzbzVar2.zzb(i21);
                                if (zzb5 instanceof zzfo) {
                                    zzfo zzfoVar = (zzfo) zzb5;
                                    if (zzfoVar.zza.equals("com.android.capture.fps")) {
                                        if (i20 == 2) {
                                            zzbzVar6 = zzbzVar6.zzc(zzfoVar);
                                        }
                                    } else {
                                        zzbzVar6 = zzbzVar6.zzc(zzfoVar);
                                    }
                                }
                            }
                        }
                        for (int i22 = 0; i22 < 3; i22++) {
                            zzbzVar6 = zzbzVar6.zzd(zzbzVarArr[i22]);
                        }
                        if (zzbzVar6.zza() > 0) {
                            zzb4.zzM(zzbzVar6);
                        }
                        zzahbVar.zzc.zzk(zzb4.zzY());
                        if (zzahgVar.zzb == 2 && i15 == -1) {
                            i15 = arrayList.size();
                        }
                        arrayList.add(zzahbVar);
                        j13 = max;
                    }
                    i16 = i13 + 1;
                    zzd = list;
                    size = i10;
                    j12 = -9223372036854775807L;
                }
                this.zzu = i15;
                this.zzv = j13;
                zzahb[] zzahbVarArr = (zzahb[]) arrayList.toArray(new zzahb[0]);
                this.zzs = zzahbVarArr;
                int length = zzahbVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i23 = 0; i23 < zzahbVarArr.length; i23++) {
                    jArr[i23] = new long[zzahbVarArr[i23].zzb.zzb];
                    jArr2[i23] = zzahbVarArr[i23].zzb.zzf[0];
                }
                int i24 = 0;
                while (i24 < zzahbVarArr.length) {
                    long j15 = Long.MAX_VALUE;
                    int i25 = -1;
                    for (int i26 = 0; i26 < zzahbVarArr.length; i26++) {
                        if (!zArr[i26]) {
                            long j16 = jArr2[i26];
                            if (j16 <= j15) {
                                i25 = i26;
                                j15 = j16;
                            }
                        }
                    }
                    int i27 = iArr[i25];
                    long[] jArr3 = jArr[i25];
                    jArr3[i27] = j11;
                    zzahj zzahjVar2 = zzahbVarArr[i25].zzb;
                    j11 += zzahjVar2.zzd[i27];
                    int i28 = i27 + 1;
                    iArr[i25] = i28;
                    if (i28 < jArr3.length) {
                        jArr2[i25] = zzahjVar2.zzf[i28];
                    } else {
                        zArr[i25] = true;
                        i24++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzC();
                this.zzr.zzN(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzagh) this.zzf.peek()).zzc(zzaghVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0379, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    @Override // com.google.android.gms.internal.ads.zzabb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzabc r33, com.google.android.gms.internal.ads.zzabx r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zza(com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzabx):int");
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabeVar) {
        this.zzr = zzabeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long j10, long j11) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j10 == 0) {
            zzk();
            return;
        }
        for (zzahb zzahbVar : this.zzs) {
            zzahj zzahjVar = zzahbVar.zzb;
            int zza2 = zzahjVar.zza(j11);
            if (zza2 == -1) {
                zza2 = zzahjVar.zzb(j11);
            }
            zzahbVar.zze = zza2;
            zzacf zzacfVar = zzahbVar.zzd;
            if (zzacfVar != null) {
                zzacfVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabcVar) throws IOException {
        return zzahf.zzb(zzabcVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        long j11;
        long j12;
        int zzb;
        zzahb[] zzahbVarArr = this.zzs;
        if (zzahbVarArr.length == 0) {
            zzacb zzacbVar = zzacb.zza;
            return new zzaby(zzacbVar, zzacbVar);
        }
        int i10 = this.zzu;
        long j13 = -1;
        if (i10 != -1) {
            zzahj zzahjVar = zzahbVarArr[i10].zzb;
            int zzi = zzi(zzahjVar, j10);
            if (zzi == -1) {
                zzacb zzacbVar2 = zzacb.zza;
                return new zzaby(zzacbVar2, zzacbVar2);
            }
            long j14 = zzahjVar.zzf[zzi];
            j11 = zzahjVar.zzc[zzi];
            if (j14 < j10 && zzi < zzahjVar.zzb - 1 && (zzb = zzahjVar.zzb(j10)) != -1 && zzb != zzi) {
                j12 = zzahjVar.zzf[zzb];
                j13 = zzahjVar.zzc[zzb];
            } else {
                j12 = -9223372036854775807L;
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzahb[] zzahbVarArr2 = this.zzs;
            if (i11 >= zzahbVarArr2.length) {
                break;
            }
            if (i11 != this.zzu) {
                zzahj zzahjVar2 = zzahbVarArr2[i11].zzb;
                long zzj = zzj(zzahjVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    j13 = zzj(zzahjVar2, j12, j13);
                }
                j11 = zzj;
            }
            i11++;
        }
        zzacb zzacbVar3 = new zzacb(j10, j11);
        if (j12 == -9223372036854775807L) {
            return new zzaby(zzacbVar3, zzacbVar3);
        }
        return new zzaby(zzacbVar3, new zzacb(j12, j13));
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }

    public zzahc(int i10) {
        this.zzi = 0;
        this.zzg = new zzahe();
        this.zzh = new ArrayList();
        this.zze = new zzfb(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzfb(zzfy.zza);
        this.zzc = new zzfb(4);
        this.zzd = new zzfb();
        this.zzn = -1;
        this.zzr = zzabe.zza;
        this.zzs = new zzahb[0];
    }
}
