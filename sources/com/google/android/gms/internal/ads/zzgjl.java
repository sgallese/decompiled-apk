package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgjl implements zzgik {
    private final zzgir zza;

    public zzgjl(zzgir zzgirVar) throws GeneralSecurityException {
        if (zzgfj.zza(2)) {
            this.zza = zzgirVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
