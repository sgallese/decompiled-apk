package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzblm {
    public static void zza(zzbln zzblnVar, String str, Map map) {
        try {
            zzblnVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcaa.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbln zzblnVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        zzcaa.zze("Dispatching AFMA event: ".concat(sb2.toString()));
        zzblnVar.zza(sb2.toString());
    }

    public static void zzc(zzbln zzblnVar, String str, String str2) {
        zzblnVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbln zzblnVar, String str, JSONObject jSONObject) {
        zzblnVar.zzb(str, jSONObject.toString());
    }
}
