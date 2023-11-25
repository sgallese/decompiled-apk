package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzeq {
    private static final zzeq zza = new zzeq(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzeq(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzeq zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeq zze(zzeq zzeqVar, zzeq zzeqVar2) {
        int i10 = zzeqVar.zzb + zzeqVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzeqVar.zzc, i10);
        System.arraycopy(zzeqVar2.zzc, 0, copyOf, zzeqVar.zzb, zzeqVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzeqVar.zzd, i10);
        System.arraycopy(zzeqVar2.zzd, 0, copyOf2, zzeqVar.zzb, zzeqVar2.zzb);
        return new zzeq(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeq zzf() {
        return new zzeq(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzeq)) {
            return false;
        }
        zzeq zzeqVar = (zzeq) obj;
        int i10 = this.zzb;
        if (i10 == zzeqVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzeqVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzeqVar.zzd;
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
        int zzy;
        int zzx;
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
                                    i10 = zzbp.zzx(i15 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzcq.zza());
                                }
                            } else {
                                int i17 = i15 << 3;
                                int i18 = zzbp.zzb;
                                zzy = ((zzeq) this.zzd[i13]).zza();
                                int zzx2 = zzbp.zzx(i17);
                                zzx = zzx2 + zzx2;
                            }
                        } else {
                            zzbh zzbhVar = (zzbh) this.zzd[i13];
                            int i19 = zzbp.zzb;
                            int zzd = zzbhVar.zzd();
                            i10 = zzbp.zzx(i15 << 3) + zzbp.zzx(zzd) + zzd;
                        }
                    } else {
                        ((Long) this.zzd[i13]).longValue();
                        i10 = zzbp.zzx(i15 << 3) + 8;
                    }
                    i12 += i10;
                } else {
                    int i20 = i15 << 3;
                    zzy = zzbp.zzy(((Long) this.zzd[i13]).longValue());
                    zzx = zzbp.zzx(i20);
                }
                i10 = zzx + zzy;
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
                zzbh zzbhVar = (zzbh) this.zzd[i12];
                int i14 = zzbp.zzb;
                int zzd = zzbhVar.zzd();
                int zzx = zzbp.zzx(zzd) + zzd;
                int zzx2 = zzbp.zzx(16);
                int zzx3 = zzbp.zzx(i13);
                int zzx4 = zzbp.zzx(8);
                i11 += zzx4 + zzx4 + zzx2 + zzx3 + zzbp.zzx(24) + zzx;
            }
            this.zze = i11;
            return i11;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzeq zzd(zzeq zzeqVar) {
        if (zzeqVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzeqVar.zzb;
        zzl(i10);
        System.arraycopy(zzeqVar.zzc, 0, this.zzc, this.zzb, zzeqVar.zzb);
        System.arraycopy(zzeqVar.zzd, 0, this.zzd, this.zzb, zzeqVar.zzb);
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
            zzdp.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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

    public final void zzk(zzfh zzfhVar) throws IOException {
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
                                    zzfhVar.zzk(i13, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzcq.zza());
                                }
                            } else {
                                zzfhVar.zzE(i13);
                                ((zzeq) obj).zzk(zzfhVar);
                                zzfhVar.zzh(i13);
                            }
                        } else {
                            zzfhVar.zzd(i13, (zzbh) obj);
                        }
                    } else {
                        zzfhVar.zzm(i13, ((Long) obj).longValue());
                    }
                } else {
                    zzfhVar.zzt(i13, ((Long) obj).longValue());
                }
            }
        }
    }

    private zzeq() {
        this(0, new int[8], new Object[8], true);
    }
}
