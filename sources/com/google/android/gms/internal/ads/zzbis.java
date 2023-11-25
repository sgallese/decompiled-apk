package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbis implements zzbir {
    private final zzbit zza;

    public zzbis(zzbit zzbitVar) {
        this.zza = zzbitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e10) {
            zzcaa.zzh("Fail to parse float", e10);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f10);
        zzcfiVar.zzat(equals);
    }
}
