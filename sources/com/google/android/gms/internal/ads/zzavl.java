package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavl extends zzavg {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzavg
    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i10 = 4;
        if (length == 1) {
            int zza = zzavk.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int zza2 = zzavk.zza(split[i11]);
                    int i12 = (zza2 >> 16) ^ ((char) zza2);
                    byte b10 = (byte) i12;
                    byte[] bArr3 = {b10, (byte) (i12 >> 8)};
                    int i13 = i11 + i11;
                    bArr[i13] = b10;
                    bArr[i13 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < split.length; i14++) {
                    int zza3 = zzavk.zza(split[i14]);
                    bArr[i14] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArr2);
            byte[] digest = this.zzb.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i10 = length2;
            }
            byte[] bArr4 = new byte[i10];
            System.arraycopy(digest, 0, bArr4, 0, i10);
            return bArr4;
        }
    }
}
