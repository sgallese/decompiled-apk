package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzggm {
    private final zzgpo zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggm(zzgpo zzgpoVar, Class cls, zzggl zzgglVar) {
        this.zza = zzgpoVar;
        this.zzb = cls;
    }

    public static zzggm zzb(zzggk zzggkVar, zzgpo zzgpoVar, Class cls) {
        return new zzggj(zzgpoVar, cls, zzggkVar);
    }

    public abstract zzgah zza(zzghh zzghhVar) throws GeneralSecurityException;

    public final zzgpo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
