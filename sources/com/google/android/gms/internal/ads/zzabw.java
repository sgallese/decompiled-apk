package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzabw {
    public static int zza(ByteBuffer byteBuffer) {
        int i10;
        byte b10 = 0;
        if ((byteBuffer.get(5) & 2) == 0) {
            i10 = 0;
        } else {
            byte b11 = byteBuffer.get(26);
            int i11 = 28;
            int i12 = 28;
            for (int i13 = 0; i13 < b11; i13++) {
                i12 += byteBuffer.get(i13 + 27);
            }
            byte b12 = byteBuffer.get(i12 + 26);
            for (int i14 = 0; i14 < b12; i14++) {
                i11 += byteBuffer.get(i12 + 27 + i14);
            }
            i10 = i12 + i11;
        }
        int i15 = byteBuffer.get(i10 + 26) + 27 + i10;
        byte b13 = byteBuffer.get(i15);
        if (byteBuffer.limit() - i15 > 1) {
            b10 = byteBuffer.get(i15 + 1);
        }
        return (int) ((zze(b13, b10) * 48000) / 1000000);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        byte b10 = 0;
        byte b11 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b10 = byteBuffer.get(1);
        }
        return (int) ((zze(b11, b10) * 48000) / 1000000);
    }

    public static long zzc(byte[] bArr) {
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return zze(b11, b10);
    }

    public static List zzd(byte[] bArr) {
        int i10 = bArr[11] & 255;
        int i11 = bArr[10] & 255;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzg(zzf((i10 << 8) | i11)));
        arrayList.add(zzg(zzf(3840L)));
        return arrayList;
    }

    private static long zze(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & 255;
        int i13 = i12 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i15 & 1);
        } else if (i15 == 3) {
            i11 = 60000;
        } else {
            i11 = 10000 << i15;
        }
        return i10 * i11;
    }

    private static long zzf(long j10) {
        return (j10 * 1000000000) / 48000;
    }

    private static byte[] zzg(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
