package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgjk implements zzgik {
    private final zzghu zza;

    public zzgjk(zzghu zzghuVar) throws GeneralSecurityException {
        if (zzgfj.zza(1)) {
            this.zza = zzghuVar;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
