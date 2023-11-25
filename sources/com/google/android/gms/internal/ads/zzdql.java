package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdql implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzdql(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzchj) this.zzb).zza();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        Map zzb = ((zzgyx) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeL)).booleanValue()) {
            zzaxe zzaxeVar = new zzaxe(new zzaxk(zza));
            zzaxeVar.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzdqm
                @Override // com.google.android.gms.internal.ads.zzaxd
                public final void zza(zzayt zzaytVar) {
                    zzaytVar.zzh(str);
                }
            });
            emptySet = Collections.singleton(new zzddo(new zzdqo(zzaxeVar, zzb), zzfyoVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgzb.zzb(emptySet);
        return emptySet;
    }
}
