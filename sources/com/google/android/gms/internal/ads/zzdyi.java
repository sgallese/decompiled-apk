package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdyi {
    private final zzfyo zza;
    private final zzdyd zzb;
    private final zzfge zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyi(zzfyo zzfyoVar, zzdyd zzdydVar, zzfge zzfgeVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdydVar;
        this.zzc = zzfgeVar;
    }

    public final com.google.common.util.concurrent.a zza(final zzbun zzbunVar) {
        zzffv zzb = this.zzc.zzb(zzffy.GMS_SIGNALS, zzfye.zzm(zzfye.zzh(null), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzbun zzbunVar2 = zzbun.this;
                return new zzbtr(zzbunVar2.zzc, zzbunVar2.zzd, zzbunVar2.zzf, zzfrx.zzc(zzbunVar2.zza.getString("ms")), -1, zzbunVar2.zzh, zzbunVar2.zze, zzbunVar2.zzk, zzbunVar2.zzl);
            }
        }, this.zza));
        final zzdyd zzdydVar = this.zzb;
        return zzfye.zzm(zzb.zzf(new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdyg
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdyd.this.zzb((zzbtr) obj);
            }
        }).zza(), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdyh
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbunVar.zza;
                if (bundle != null) {
                    try {
                        JSONObject zzh = com.google.android.gms.ads.internal.client.zzay.zzb().zzh(bundle);
                        try {
                            com.google.android.gms.ads.internal.client.zzay.zzb().zzk(jSONObject, zzh);
                            return jSONObject;
                        } catch (JSONException unused) {
                            return zzh;
                        }
                    } catch (JSONException unused2) {
                        return jSONObject;
                    }
                }
                return jSONObject;
            }
        }, this.zza);
    }
}
