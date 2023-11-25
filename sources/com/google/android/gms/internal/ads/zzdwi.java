package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdwi implements zzdxg {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdvi zzb;
    private final zzfyo zzc;
    private final zzfca zzd;
    private final ScheduledExecutorService zze;
    private final zzebe zzf;
    private final zzfhr zzg;
    private final Context zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwi(Context context, zzfca zzfcaVar, zzdvi zzdviVar, zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, zzebe zzebeVar, zzfhr zzfhrVar) {
        this.zzh = context;
        this.zzd = zzfcaVar;
        this.zzb = zzdviVar;
        this.zzc = zzfyoVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzebeVar;
        this.zzg = zzfhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final com.google.common.util.concurrent.a zzb(zzbun zzbunVar) {
        com.google.common.util.concurrent.a zzb = this.zzb.zzb(zzbunVar);
        zzfhg zza2 = zzfhf.zza(this.zzh, 11);
        zzfhq.zzd(zzb, zza2);
        com.google.common.util.concurrent.a zzn = zzfye.zzn(zzb, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwf
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdwi.this.zzc((InputStream) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfq)).booleanValue()) {
            zzn = zzfye.zzf(zzfye.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfr)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwg
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return zzfye.zzg(new zzdve(5));
                }
            }, zzcan.zzf);
        }
        zzfhq.zza(zzn, this.zzg, zza2);
        zzfye.zzr(zzn, new zzdwh(this), zzcan.zzf);
        return zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(InputStream inputStream) throws Exception {
        return zzfye.zzh(new zzfbr(new zzfbo(this.zzd), zzfbq.zza(new InputStreamReader(inputStream))));
    }
}
