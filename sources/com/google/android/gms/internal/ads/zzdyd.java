package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdyd {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final zzdyv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyd(zzfyo zzfyoVar, zzfyo zzfyoVar2, zzdyv zzdyvVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfyoVar2;
        this.zzc = zzdyvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zza(zzbtr zzbtrVar) throws Exception {
        return this.zzc.zza(zzbtrVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzko)).longValue());
    }

    public final com.google.common.util.concurrent.a zzb(final zzbtr zzbtrVar) {
        com.google.common.util.concurrent.a zzf;
        String str = zzbtrVar.zzb;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzz(str)) {
            zzf = zzfye.zzg(new zzdxh(1, "Ads signal service force local"));
        } else {
            zzf = zzfye.zzf(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzdxz
                @Override // com.google.android.gms.internal.ads.zzfxk
                public final com.google.common.util.concurrent.a zza() {
                    return zzdyd.this.zza(zzbtrVar);
                }
            }, this.zza), ExecutionException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdya
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzfye.zzg(th);
                }
            }, this.zzb);
        }
        return zzfye.zzn(zzfye.zzf(zzfxv.zzu(zzf), zzdxh.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyb
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                zzdxh zzdxhVar = (zzdxh) obj;
                return zzfye.zzh(null);
            }
        }, this.zzb), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyc
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return zzfye.zzh(jSONObject);
                }
                try {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    jSONObject = new JSONObject(com.google.android.gms.ads.internal.util.zzs.zzK(new InputStreamReader(inputStream)));
                } catch (IOException | JSONException e10) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdsServiceSignalTask.startAdsServiceSignalTask");
                }
                return zzfye.zzh(jSONObject);
            }
        }, this.zzb);
    }
}
