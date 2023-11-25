package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzenn implements zzesj {
    final zzbzj zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfyo zzd;
    private final Context zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenn(Context context, zzbzj zzbzjVar, ScheduledExecutorService scheduledExecutorService, zzfyo zzfyoVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcC)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzjVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcy)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcD)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcz)).booleanValue()) {
                    return zzfye.zzm(zzfom.zza(this.zzb.getAppSetIdInfo()), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzenk
                        @Override // com.google.android.gms.internal.ads.zzfqw
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                            return new zzeno(appSetIdInfo2.getId(), appSetIdInfo2.getScope());
                        }
                    }, zzcan.zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcC)).booleanValue()) {
                    appSetIdInfo = zzfde.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzfye.zzh(new zzeno(null, -1));
                }
                com.google.common.util.concurrent.a zzn = zzfye.zzn(zzfom.zza(appSetIdInfo), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzenl
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final com.google.common.util.concurrent.a zza(Object obj) {
                        AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                        if (appSetIdInfo2 == null) {
                            return zzfye.zzh(new zzeno(null, -1));
                        }
                        return zzfye.zzh(new zzeno(appSetIdInfo2.getId(), appSetIdInfo2.getScope()));
                    }
                }, zzcan.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcA)).booleanValue()) {
                    zzn = zzfye.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcB)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfye.zze(zzn, Exception.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzenm
                    @Override // com.google.android.gms.internal.ads.zzfqw
                    public final Object apply(Object obj) {
                        zzenn.this.zza.zzu((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeno(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzfye.zzh(new zzeno(null, -1));
    }
}
