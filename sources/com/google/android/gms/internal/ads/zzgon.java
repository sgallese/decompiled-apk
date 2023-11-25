package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgon implements zzfzi {
    private final zzgfc zza;

    public zzgon(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzgfc(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
