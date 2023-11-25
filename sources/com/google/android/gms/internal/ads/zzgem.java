package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgem extends zzgav {
    private final zzger zza;
    private final zzgpp zzb;
    private final zzgpo zzc;
    private final Integer zzd;

    private zzgem(zzger zzgerVar, zzgpp zzgppVar, zzgpo zzgpoVar, Integer num) {
        this.zza = zzgerVar;
        this.zzb = zzgppVar;
        this.zzc = zzgpoVar;
        this.zzd = num;
    }

    public static zzgem zza(zzgeq zzgeqVar, zzgpp zzgppVar, Integer num) throws GeneralSecurityException {
        zzgpo zzb;
        zzgeq zzgeqVar2 = zzgeq.zzc;
        if (zzgeqVar != zzgeqVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgeqVar.toString() + " the value of idRequirement must be non-null");
        } else if (zzgeqVar == zzgeqVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzgppVar.zza() == 32) {
                zzger zzb2 = zzger.zzb(zzgeqVar);
                if (zzb2.zza() == zzgeqVar2) {
                    zzb = zzgpo.zzb(new byte[0]);
                } else if (zzb2.zza() == zzgeq.zzb) {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                } else if (zzb2.zza() == zzgeq.zza) {
                    zzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
                }
                return new zzgem(zzb2, zzgppVar, zzb, num);
            }
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgppVar.zza());
        }
    }
}
