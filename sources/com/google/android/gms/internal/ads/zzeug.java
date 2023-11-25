package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeug implements zzesi {
    final String zza;
    final int zzb;

    public zzeug(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            try {
                JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii");
                zzf.put("pvid", this.zza);
                zzf.put("pvid_s", this.zzb);
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e10);
            }
        }
    }
}
