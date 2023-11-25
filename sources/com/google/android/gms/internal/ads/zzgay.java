package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgay implements zzfzi {
    private final zzgao zza;
    private final zzgju zzb;
    private final zzgju zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgay(zzgao zzgaoVar, zzgax zzgaxVar) {
        zzgju zzgjuVar;
        this.zza = zzgaoVar;
        if (zzgaoVar.zzf()) {
            zzgjv zzb = zzggf.zza().zzb();
            zzgka zza = zzggc.zza(zzgaoVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzgjuVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzgjuVar = zzggc.zza;
            this.zzb = zzgjuVar;
        }
        this.zzc = zzgjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgak zzgakVar : this.zza.zze(copyOf)) {
                try {
                    byte[] zza = ((zzfzi) zzgakVar.zze()).zza(copyOfRange, bArr2);
                    zzgakVar.zza();
                    int length2 = copyOfRange.length;
                    return zza;
                } catch (GeneralSecurityException e10) {
                    logger = zzgaz.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (zzgak zzgakVar2 : this.zza.zze(zzfzn.zza)) {
            try {
                byte[] zza2 = ((zzfzi) zzgakVar2.zze()).zza(bArr, bArr2);
                zzgakVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
