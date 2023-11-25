package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgfp {
    private final zzgpo zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgfp(zzgpo zzgpoVar, Class cls, zzgfo zzgfoVar) {
        this.zza = zzgpoVar;
        this.zzb = cls;
    }

    public static zzgfp zzb(zzgfn zzgfnVar, zzgpo zzgpoVar, Class cls) {
        return new zzgfm(zzgpoVar, cls, zzgfnVar);
    }

    public abstract zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) throws GeneralSecurityException;

    public final zzgpo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
