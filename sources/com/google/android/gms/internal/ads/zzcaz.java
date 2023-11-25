package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public class zzcaz {
    private final zzcas zza;
    private final AtomicInteger zzb;

    public zzcaz() {
        zzcas zzcasVar = new zzcas();
        this.zza = zzcasVar;
        this.zzb = new AtomicInteger(0);
        zzfye.zzr(zzcasVar, new zzcax(this), zzcan.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzi(zzcaw zzcawVar, zzcau zzcauVar) {
        zzfye.zzr(this.zza, new zzcay(this, zzcawVar, zzcauVar), zzcan.zzf);
    }
}
