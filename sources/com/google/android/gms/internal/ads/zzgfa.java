package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgfa extends zzgfb {
    public zzgfa(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public final int[] zzb(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzgex.zzb(iArr2, this.zza);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
