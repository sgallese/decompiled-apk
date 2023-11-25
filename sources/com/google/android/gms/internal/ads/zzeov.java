package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeov implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzeov(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfui zzm;
        zzeol zza = zzeon.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdQ)).booleanValue()) {
            zzm = zzfui.zzn(new zzeqr(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdR)).intValue(), scheduledExecutorService));
        } else {
            zzm = zzfui.zzm();
        }
        zzgzb.zzb(zzm);
        return zzm;
    }
}
