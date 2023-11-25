package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzesy implements zzesj {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzfyo zzc;
    private final ScheduledExecutorService zzd;
    private final zzedl zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesy(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, zzedl zzedlVar) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzfyoVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzedlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 56;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjw)).booleanValue() && this.zza.zzR()) {
            return zzfye.zzf(zzfye.zzn(zzfxv.zzu(zzfye.zzo(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjx)).intValue(), TimeUnit.MILLISECONDS, this.zzd)), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzesw
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    zzgvi zza2 = zzgvj.zza();
                    for (androidx.privacysandbox.ads.adservices.topics.c cVar : ((androidx.privacysandbox.ads.adservices.topics.b) obj).a()) {
                        zzgvg zza3 = zzgvh.zza();
                        zza3.zzc(cVar.c());
                        zza3.zza(cVar.a());
                        zza3.zzb(cVar.b());
                        zza2.zza((zzgvh) zza3.zzal());
                    }
                    return zzfye.zzh(new zzeta(Base64.encodeToString(((zzgvj) zza2.zzal()).zzax(), 1), 1, null));
                }
            }, this.zzc), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzesx
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    return zzesy.this.zzc((Throwable) obj);
                }
            }, this.zzc);
        }
        return zzfye.zzh(new zzeta("", -1, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(Throwable th) throws Exception {
        zzeta zzetaVar;
        zzbtf.zza(this.zzb).zzf(th, "TopicsSignal.fetchTopicsSignal");
        zzesz zzeszVar = null;
        String str = "";
        if (th instanceof SecurityException) {
            zzetaVar = new zzeta(str, 2, zzeszVar);
        } else if (th instanceof IllegalStateException) {
            zzetaVar = new zzeta(str, 3, zzeszVar);
        } else if (th instanceof IllegalArgumentException) {
            zzetaVar = new zzeta(str, 4, zzeszVar);
        } else if (th instanceof TimeoutException) {
            zzetaVar = new zzeta(str, 5, zzeszVar);
        } else {
            zzetaVar = new zzeta(str, 0, zzeszVar);
        }
        return zzfye.zzh(zzetaVar);
    }
}
