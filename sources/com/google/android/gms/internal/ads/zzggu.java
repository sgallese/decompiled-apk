package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzggu {
    private final Class zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggu(Class cls, Class cls2, zzggt zzggtVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzggu zzb(zzggs zzggsVar, Class cls, Class cls2) {
        return new zzggr(cls, cls2, zzggsVar);
    }

    public abstract Object zza(zzfzp zzfzpVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
