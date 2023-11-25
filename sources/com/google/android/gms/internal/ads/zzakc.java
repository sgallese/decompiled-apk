package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzakc {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzfb zzfbVar, int i10, int i11) {
        zzfbVar.zzG(i10);
        if (zzfbVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int zzf = zzfbVar.zzf();
        if ((8388608 & zzf) != 0 || ((zzf >> 8) & 8191) != i11 || (zzf & 32) == 0 || zzfbVar.zzl() < 7 || zzfbVar.zza() < 7 || (zzfbVar.zzl() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzfbVar.zzC(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((bArr[4] & 255) >> 7);
    }
}
