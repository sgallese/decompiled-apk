package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcnd implements zzcmt {
    private final zzdue zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnd(zzdue zzdueVar) {
        this.zza = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmt
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziP)).booleanValue()) {
                this.zza.zzm(jSONObject);
            }
        }
    }
}
