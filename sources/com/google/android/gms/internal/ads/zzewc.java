package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzewc implements zzesi {
    private final Map zza;

    public zzewc(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzesi
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(this.zza));
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
