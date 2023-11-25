package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzevq implements zzesj {
    public static final /* synthetic */ zzevq zza = new zzevq();

    private /* synthetic */ zzevq() {
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return zzfye.zzh(new zzesi() { // from class: com.google.android.gms.internal.ads.zzevr
            @Override // com.google.android.gms.internal.ads.zzesi
            public final void zzj(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
