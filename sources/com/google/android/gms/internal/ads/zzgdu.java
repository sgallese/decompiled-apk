package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgdu extends zzgav {
    private final zzgdz zza;
    private final zzgpp zzb;
    private final zzgpo zzc;
    private final Integer zzd;

    private zzgdu(zzgdz zzgdzVar, zzgpp zzgppVar, zzgpo zzgpoVar, Integer num) {
        this.zza = zzgdzVar;
        this.zzb = zzgppVar;
        this.zzc = zzgpoVar;
        this.zzd = num;
    }

    public static zzgdu zza(zzgdy zzgdyVar, zzgpp zzgppVar, Integer num) throws GeneralSecurityException {
        zzgpo zzb;
        zzgdy zzgdyVar2 = zzgdy.zzc;
        if (zzgdyVar != zzgdyVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgdyVar.toString() + " the value of idRequirement must be non-null");
        } else if (zzgdyVar == zzgdyVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzgppVar.zza() == 32) {
                zzgdz zzb2 = zzgdz.zzb(zzgdyVar);
                if (zzb2.zza() == zzgdyVar2) {
                    zzb = zzgpo.zzb(new byte[0]);
                } else if (zzb2.zza() == zzgdy.zzb) {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                } else if (zzb2.zza() == zzgdy.zza) {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
                }
                return new zzgdu(zzb2, zzgppVar, zzb, num);
            }
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgppVar.zza());
        }
    }
}
