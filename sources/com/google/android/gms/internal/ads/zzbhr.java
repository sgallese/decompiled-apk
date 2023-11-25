package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzbhr implements zzbir {
    public final /* synthetic */ zzddw zza;
    public final /* synthetic */ zzcob zzb;

    public /* synthetic */ zzbhr(zzddw zzddwVar, zzcob zzcobVar) {
        this.zza = zzddwVar;
        this.zzb = zzcobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        zzddw zzddwVar = this.zza;
        final zzcob zzcobVar = this.zzb;
        zzcfi zzcfiVar = (zzcfi) obj;
        zzbiq.zzc(map, zzddwVar);
        String str = (String) map.get("u");
        if (str == null) {
            zzcaa.zzj("URL missing from click GMSG.");
            return;
        }
        zzfxv zzu = zzfxv.zzu(zzbiq.zza(zzcfiVar, str));
        zzfxl zzfxlVar = new zzfxl() { // from class: com.google.android.gms.internal.ads.zzbht
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj2) {
                zzcob zzcobVar2 = zzcob.this;
                String str2 = (String) obj2;
                zzbir zzbirVar = zzbiq.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue() && zzcobVar2 != null) {
                    return zzcobVar2.zzc(str2, com.google.android.gms.ads.internal.client.zzay.zze());
                }
                return zzfye.zzh(str2);
            }
        };
        zzfyo zzfyoVar = zzcan.zza;
        zzfye.zzr(zzfye.zzn(zzu, zzfxlVar, zzfyoVar), new zzbif(zzcfiVar), zzfyoVar);
    }
}
