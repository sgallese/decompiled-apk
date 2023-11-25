package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdxe implements zzdxg {
    private final Map zza;
    private final zzfyo zzb;
    private final zzczb zzc;

    public zzdxe(Map map, zzfyo zzfyoVar, zzczb zzczbVar) {
        this.zza = map;
        this.zzb = zzfyoVar;
        this.zzc = zzczbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final com.google.common.util.concurrent.a zzb(final zzbun zzbunVar) {
        this.zzc.zzbr(zzbunVar);
        com.google.common.util.concurrent.a zzg = zzfye.zzg(new zzdve(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhR)).split(",")) {
            final zzgzg zzgzgVar = (zzgzg) this.zza.get(str.trim());
            if (zzgzgVar != null) {
                zzg = zzfye.zzf(zzg, zzdve.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxc
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final com.google.common.util.concurrent.a zza(Object obj) {
                        zzgzg zzgzgVar2 = zzgzg.this;
                        zzdve zzdveVar = (zzdve) obj;
                        return ((zzdxg) zzgzgVar2.zzb()).zzb(zzbunVar);
                    }
                }, this.zzb);
            }
        }
        zzfye.zzr(zzg, new zzdxd(this), zzcan.zzf);
        return zzg;
    }
}
