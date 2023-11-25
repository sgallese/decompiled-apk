package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbhx implements zzbir {
    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcfi zzcfiVar = (zzcfi) obj;
        zzbej zzK = zzcfiVar.zzK();
        if (zzK != null && (zzb = zzK.zzb()) != null) {
            zzcfiVar.zze("nativeClickMetaReady", zzb);
        } else {
            zzcfiVar.zze("nativeClickMetaReady", new JSONObject());
        }
    }
}
