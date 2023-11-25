package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgaz implements zzgap {
    private static final Logger zza = Logger.getLogger(zzgaz.class.getName());
    private static final zzgaz zzb = new zzgaz();

    zzgaz() {
    }

    public static void zze() throws GeneralSecurityException {
        zzgar.zzf(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Class zza() {
        return zzfzi.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Class zzb() {
        return zzfzi.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ Object zzc(zzgao zzgaoVar) throws GeneralSecurityException {
        return new zzgay(zzgaoVar, null);
    }
}
