package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgei implements zzfzi {
    private static final byte[] zza = new byte[0];
    private static final Set zzb;
    private final zzgmv zzc;
    private final zzfzi zzd;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = Collections.unmodifiableSet(hashSet);
    }

    public zzgei(zzgmv zzgmvVar, zzfzi zzfziVar) {
        if (zzb(zzgmvVar.zzh())) {
            this.zzc = zzgmvVar;
            this.zzd = zzfziVar;
            return;
        }
        throw new IllegalArgumentException("Unsupported DEK key type: " + zzgmvVar.zzh() + ". Only Tink AEAD key types are supported.");
    }

    public static boolean zzb(String str) {
        return zzb.contains(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 > 0 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                wrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] zza2 = this.zzd.zza(bArr3, zza);
                String zzh = this.zzc.zzh();
                int i11 = zzgar.zza;
                zzgqi zzgqiVar = zzgqi.zzb;
                return ((zzfzi) zzgar.zzc(zzh, zzgqi.zzv(zza2, 0, zza2.length), zzfzi.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }
}
