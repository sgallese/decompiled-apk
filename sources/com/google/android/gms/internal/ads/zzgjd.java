package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgjd {
    @Deprecated
    static final zzgnz zza;
    @Deprecated
    static final zzgnz zzb;
    @Deprecated
    static final zzgnz zzc;

    static {
        new zzgiw();
        zzgnz zzc2 = zzgnz.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgji.zze();
        zzgin.zzd();
        zzgiw.zzh(true);
        if (zzgfk.zzb()) {
            return;
        }
        zzghz.zzm(true);
    }
}
