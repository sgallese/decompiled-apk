package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbin implements zzbir {
    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcfiVar.zzbj();
        } else if ("resume".equals(str)) {
            zzcfiVar.zzbk();
        }
    }
}
