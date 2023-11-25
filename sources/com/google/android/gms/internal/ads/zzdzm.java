package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdzm implements zzbnb {
    @Override // com.google.android.gms.internal.ads.zzbnb
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzdzn zzdznVar = (zzdzn) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziS)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdznVar.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzdznVar.zzd.zzd());
        }
        jSONObject2.put("base_url", zzdznVar.zzd.zzb());
        jSONObject2.put("signals", zzdznVar.zzc);
        jSONObject3.put("body", zzdznVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzdznVar.zzb.zzb));
        jSONObject3.put("response_code", zzdznVar.zzb.zza);
        jSONObject3.put("latency", zzdznVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzdznVar.zzd.zzg());
        return jSONObject;
    }
}
