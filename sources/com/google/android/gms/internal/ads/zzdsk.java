package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdsk {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdsk(String str, zzdsj zzdsjVar) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ String zza(zzdsk zzdskVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjl);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdskVar.zza);
            jSONObject.put("eventCategory", zzdskVar.zzb);
            jSONObject.putOpt("event", zzdskVar.zzc);
            jSONObject.putOpt("errorCode", zzdskVar.zzd);
            jSONObject.putOpt("rewardType", zzdskVar.zze);
            jSONObject.putOpt("rewardAmount", zzdskVar.zzf);
        } catch (JSONException unused) {
            zzcaa.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
