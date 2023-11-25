package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
abstract class zzguw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String zzd(ByteBuffer byteBuffer, int i10, int i11) throws zzgsc {
        if ((((byteBuffer.limit() - i10) - i11) | i10 | i11) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (!zzguv.zzd(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (zzguv.zzd(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 < i12) {
                            byte b12 = byteBuffer.get(i10);
                            if (zzguv.zzd(b12)) {
                                i10++;
                                i16 = i14 + 1;
                                cArr[i14] = (char) b12;
                            }
                        }
                    }
                } else if (zzguv.zzf(b11)) {
                    if (i15 < i12) {
                        zzguv.zzc(b11, byteBuffer.get(i15), cArr, i14);
                        i10 = i15 + 1;
                        i14++;
                    } else {
                        throw zzgsc.zzd();
                    }
                } else if (zzguv.zze(b11)) {
                    if (i15 < i12 - 1) {
                        int i17 = i15 + 1;
                        zzguv.zzb(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                        i10 = i17 + 1;
                        i14++;
                    } else {
                        throw zzgsc.zzd();
                    }
                } else if (i15 < i12 - 2) {
                    int i18 = i15 + 1;
                    byte b13 = byteBuffer.get(i15);
                    int i19 = i18 + 1;
                    zzguv.zza(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                    i14 += 2;
                    i10 = i19 + 1;
                } else {
                    throw zzgsc.zzd();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String zzb(byte[] bArr, int i10, int i11) throws zzgsc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(byte[] bArr, int i10, int i11) {
        if (zza(0, bArr, i10, i11) != 0) {
            return false;
        }
        return true;
    }
}
