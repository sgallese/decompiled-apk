package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgph implements zzgkb {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgph(byte[] bArr) throws GeneralSecurityException {
        zzgpm.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza = zzgjj.zza(zzb.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = zzgjj.zza(zza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgfj.zza(1)) {
            return (Cipher) zzgow.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzgkb
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] zzc;
        if (i10 <= 16) {
            Cipher zzb = zzb();
            zzb.init(1, this.zza);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if (max * 16 == length) {
                zzc = zzgom.zzd(bArr, (max - 1) * 16, this.zzb, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    zzc = zzgom.zzc(copyOf, this.zzc);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = zzb.doFinal(zzgom.zzd(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(zzb.doFinal(zzgom.zzc(zzc, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
