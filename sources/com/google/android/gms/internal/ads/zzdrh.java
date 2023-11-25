package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzdrh {
    private final zzdrm zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdrh(zzdrm zzdrmVar, Executor executor) {
        this.zza = zzdrmVar;
        this.zzc = zzdrmVar.zza();
        this.zzb = executor;
    }

    public final zzdrg zza() {
        zzdrg zzdrgVar = new zzdrg(this);
        zzdrg.zza(zzdrgVar);
        return zzdrgVar;
    }

    public final void zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkt)).booleanValue()) {
            return;
        }
        zzdrg zza = zza();
        zza.zzb("action", "pecr");
        zza.zzg();
    }
}
