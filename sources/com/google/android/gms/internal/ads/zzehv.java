package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehv implements zzedp {
    private final Map zza = new HashMap();
    private final zzdpc zzb;

    public zzehv(zzdpc zzdpcVar) {
        this.zzb = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final zzedq zza(String str, JSONObject jSONObject) throws zzfcf {
        zzedq zzedqVar;
        synchronized (this) {
            zzedqVar = (zzedq) this.zza.get(str);
            if (zzedqVar == null) {
                zzedqVar = new zzedq(this.zzb.zzc(str, jSONObject), new zzefk(), str);
                this.zza.put(str, zzedqVar);
            }
        }
        return zzedqVar;
    }
}
