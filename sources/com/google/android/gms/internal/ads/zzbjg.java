package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbjg implements zzbir {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        String concat;
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            zzbjf zzbjfVar = (zzbjf) this.zzb.remove(str);
            if (zzbjfVar == null) {
                zzcaa.zzj("Received result for unexpected method invocation: " + str);
            } else if (!TextUtils.isEmpty(str2)) {
                zzbjfVar.zza(str3 + concat);
            } else if (str5 == null) {
                zzbjfVar.zzb(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbjfVar.zzb(jSONObject);
                } catch (JSONException e10) {
                    zzbjfVar.zza(e10.getMessage());
                }
            }
        }
    }

    public final com.google.common.util.concurrent.a zzb(zzbly zzblyVar, String str, JSONObject jSONObject) {
        zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbje(this, zzcasVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzblyVar.zzl(str, jSONObject2);
        } catch (Exception e10) {
            zzcasVar.zzd(e10);
        }
        return zzcasVar;
    }

    public final void zzc(String str, zzbjf zzbjfVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbjfVar);
        }
    }
}
