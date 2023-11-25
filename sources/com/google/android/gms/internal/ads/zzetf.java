package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzetf implements zzesi {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfof zzc;

    public zzetf(AdvertisingIdClient.Info info, String str, zzfof zzfofVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                zzf.put("rdid", this.zza.getId());
                zzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                zzf.put("idtype", "adid");
                zzfof zzfofVar = this.zzc;
                if (zzfofVar.zzc()) {
                    zzf.put("paidv1_id_android_3p", zzfofVar.zzb());
                    zzf.put("paidv1_creation_time_android_3p", this.zzc.zza());
                    return;
                }
                return;
            }
            String str = this.zzb;
            if (str != null) {
                zzf.put("pdid", str);
                zzf.put("pdidtype", "ssaid");
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e10);
        }
    }
}
