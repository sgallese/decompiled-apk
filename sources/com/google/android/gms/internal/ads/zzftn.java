package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzftn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10) {
        int i11;
        if (i10 < 32) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        return i11 * (i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int zzb = zzftv.zzb(obj);
        int i13 = zzb & i10;
        int zzc = zzc(obj3, i13);
        if (zzc != 0) {
            int i14 = ~i10;
            int i15 = zzb & i14;
            int i16 = -1;
            while (true) {
                i11 = zzc - 1;
                i12 = iArr[i11];
                if ((i12 & i14) != i15 || !zzfrd.zza(obj, objArr[i11]) || (objArr2 != null && !zzfrd.zza(obj2, objArr2[i11]))) {
                    int i17 = i12 & i10;
                    if (i17 == 0) {
                        break;
                    }
                    i16 = i11;
                    zzc = i17;
                }
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                zze(obj3, i13, i18);
            } else {
                iArr[i16] = (i18 & i10) | (iArr[i16] & i14);
            }
            return i11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(Object obj, int i10) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i10];
        }
        return ((int[]) obj)[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzd(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zze(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}