package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdwn {
    private final zzchd zza;
    private final Context zzb;
    private final zzcag zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfhr zzg;
    private final zzfcn zzh;
    private final zzdrc zzi;

    public zzdwn(zzchd zzchdVar, Context context, zzcag zzcagVar, zzfca zzfcaVar, Executor executor, String str, zzfhr zzfhrVar, zzdrc zzdrcVar) {
        this.zza = zzchdVar;
        this.zzb = context;
        this.zzc = zzcagVar;
        this.zzd = zzfcaVar;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfhrVar;
        this.zzh = zzchdVar.zzw();
        this.zzi = zzdrcVar;
    }

    private final com.google.common.util.concurrent.a zzc(final String str, final String str2) {
        zzfhg zza = zzfhf.zza(this.zzb, 11);
        zza.zzh();
        zzbni zza2 = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzz());
        zzbnc zzbncVar = zzbnf.zza;
        final zzbmy zza3 = zza2.zza("google.afma.response.normalize", zzbncVar, zzbncVar);
        com.google.common.util.concurrent.a zzn = zzfye.zzn(zzfye.zzn(zzfye.zzn(zzfye.zzh(""), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwk
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return zzfye.zzh(jSONObject);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
                }
            }
        }, this.zze), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzbmy.this.zzb((JSONObject) obj);
            }
        }, this.zze), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdwm
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdwn.this.zzb((JSONObject) obj);
            }
        }, this.zze);
        zzfhq.zza(zzn, this.zzg, zza);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            zzcaa.zzj("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.a zza() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdwn.zza():com.google.common.util.concurrent.a");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzb(JSONObject jSONObject) throws Exception {
        return zzfye.zzh(new zzfbr(new zzfbo(this.zzd), zzfbq.zza(new StringReader(jSONObject.toString()))));
    }
}
