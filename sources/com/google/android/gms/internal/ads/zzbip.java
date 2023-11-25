package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbip implements zzbir {
    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        if (map.keySet().contains("start")) {
            zzcfiVar.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzcfiVar.zzas(false);
        }
    }
}
