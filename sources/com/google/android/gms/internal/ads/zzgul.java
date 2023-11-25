package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgul {
    private static final zzgul zza = new zzgul(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgul(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzgul zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgul zze(zzgul zzgulVar, zzgul zzgulVar2) {
        int i10 = zzgulVar.zzb + zzgulVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgulVar.zzc, i10);
        System.arraycopy(zzgulVar2.zzc, 0, copyOf, zzgulVar.zzb, zzgulVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgulVar.zzd, i10);
        System.arraycopy(zzgulVar2.zzd, 0, copyOf2, zzgulVar.zzb, zzgulVar2.zzb);
        return new zzgul(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgul zzf() {
        return new zzgul(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgul)) {
            return false;
        }
        zzgul zzgulVar = (zzgul) obj;
        int i10 = this.zzb;
        if (i10 == zzgulVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgulVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgulVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 * 31) + i13;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + i12;
    }

    public final int zza() {
        int zzB;
        int zzA;
        int i10;
        int i11 = this.zze;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.zzb; i13++) {
                int i14 = this.zzc[i13];
                int i15 = i14 >>> 3;
                int i16 = i14 & 7;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 != 3) {
                                if (i16 == 5) {
                                    ((Integer) this.zzd[i13]).intValue();
                                    i10 = zzgqx.zzA(i15 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzgsc.zza());
                                }
                            } else {
                                int i17 = i15 << 3;
                                int i18 = zzgqx.zzf;
                                zzB = ((zzgul) this.zzd[i13]).zza();
                                int zzA2 = zzgqx.zzA(i17);
                                zzA = zzA2 + zzA2;
                            }
                        } else {
                            zzgqi zzgqiVar = (zzgqi) this.zzd[i13];
                            int i19 = zzgqx.zzf;
                            int zzd = zzgqiVar.zzd();
                            i10 = zzgqx.zzA(i15 << 3) + zzgqx.zzA(zzd) + zzd;
                        }
                    } else {
                        ((Long) this.zzd[i13]).longValue();
                        i10 = zzgqx.zzA(i15 << 3) + 8;
                    }
                    i12 += i10;
                } else {
                    int i20 = i15 << 3;
                    zzB = zzgqx.zzB(((Long) this.zzd[i13]).longValue());
                    zzA = zzgqx.zzA(i20);
                }
                i10 = zzA + zzB;
                i12 += i10;
            }
            this.zze = i12;
            return i12;
        }
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzb; i12++) {
                int i13 = this.zzc[i12] >>> 3;
                zzgqi zzgqiVar = (zzgqi) this.zzd[i12];
                int i14 = zzgqx.zzf;
                int zzd = zzgqiVar.zzd();
                int zzA = zzgqx.zzA(zzd) + zzd;
                int zzA2 = zzgqx.zzA(16);
                int zzA3 = zzgqx.zzA(i13);
                int zzA4 = zzgqx.zzA(8);
                i11 += zzA4 + zzA4 + zzA2 + zzA3 + zzgqx.zzA(24) + zzA;
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgul zzd(zzgul zzgulVar) {
        if (zzgulVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzgulVar.zzb;
        zzl(i10);
        System.arraycopy(zzgulVar.zzc, 0, this.zzc, this.zzb, zzgulVar.zzb);
        System.arraycopy(zzgulVar.zzd, 0, this.zzd, this.zzb, zzgulVar.zzb);
        this.zzb = i10;
        return this;
    }

    final void zzg() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzgtc.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i10, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zzk(zzgqy zzgqyVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    zzgqyVar.zzk(i13, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzgsc.zza());
                                }
                            } else {
                                zzgqyVar.zzE(i13);
                                ((zzgul) obj).zzk(zzgqyVar);
                                zzgqyVar.zzh(i13);
                            }
                        } else {
                            zzgqyVar.zzd(i13, (zzgqi) obj);
                        }
                    } else {
                        zzgqyVar.zzm(i13, ((Long) obj).longValue());
                    }
                } else {
                    zzgqyVar.zzt(i13, ((Long) obj).longValue());
                }
            }
        }
    }

    private zzgul() {
        this(0, new int[8], new Object[8], true);
    }
}
