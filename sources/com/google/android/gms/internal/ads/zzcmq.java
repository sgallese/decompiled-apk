package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcmq {
    private final Map zza;
    private final Map zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmq(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfbr zzfbrVar) throws Exception {
        for (zzfbp zzfbpVar : zzfbrVar.zzb.zzc) {
            if (this.zza.containsKey(zzfbpVar.zza)) {
                ((zzcmt) this.zza.get(zzfbpVar.zza)).zza(zzfbpVar.zzb);
            } else if (this.zzb.containsKey(zzfbpVar.zza)) {
                zzcms zzcmsVar = (zzcms) this.zzb.get(zzfbpVar.zza);
                JSONObject jSONObject = zzfbpVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcmsVar.zza(hashMap);
            }
        }
    }
}
