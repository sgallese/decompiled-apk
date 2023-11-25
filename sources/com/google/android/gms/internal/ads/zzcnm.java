package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcnm implements zzcmt {
    private final zzbxh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnm(zzbxh zzbxhVar) {
        this.zza = zzbxhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzbxh] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzcmt
    public final void zza(JSONObject jSONObject) {
        ?? r42;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            r42 = -1;
        } else {
            r42 = jSONObject.optBoolean("npa");
        }
        this.zza.zzb(r42, optLong);
    }
}
