package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzggg {
    private static final zzggg zza = new zzggg();
    private final AtomicReference zzb;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgha, com.google.android.gms.internal.ads.zzggw] */
    zzggg() {
        ?? r22 = 0;
        this.zzb = new AtomicReference(new zzghb(new zzggx(r22), r22));
    }

    public static zzggg zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzghb) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzfzp zzfzpVar, Class cls) throws GeneralSecurityException {
        return ((zzghb) this.zzb.get()).zzb(zzfzpVar, cls);
    }

    public final Object zzd(zzgao zzgaoVar, Class cls) throws GeneralSecurityException {
        return ((zzghb) this.zzb.get()).zzc(zzgaoVar, cls);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgha, com.google.android.gms.internal.ads.zzggw] */
    public final synchronized void zze(zzggu zzgguVar) throws GeneralSecurityException {
        ?? r22 = 0;
        zzggx zzggxVar = new zzggx((zzghb) this.zzb.get(), r22);
        zzggxVar.zza(zzgguVar);
        this.zzb.set(new zzghb(zzggxVar, r22));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgha, com.google.android.gms.internal.ads.zzggw] */
    public final synchronized void zzf(zzgap zzgapVar) throws GeneralSecurityException {
        ?? r22 = 0;
        zzggx zzggxVar = new zzggx((zzghb) this.zzb.get(), r22);
        zzggxVar.zzb(zzgapVar);
        this.zzb.set(new zzghb(zzggxVar, r22));
    }
}
