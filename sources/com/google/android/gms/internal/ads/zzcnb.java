package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcnb implements zzcms {
    private final zzedl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnb(zzedl zzedlVar) {
        this.zza = zzedlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjw)).booleanValue()) {
            return;
        }
        zzfye.zzf(zzfxv.zzu(this.zza.zza(true)), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcna
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                return zzfye.zzh(new androidx.privacysandbox.ads.adservices.topics.b(zzfud.zzl()));
            }
        }, zzcan.zza);
    }
}
