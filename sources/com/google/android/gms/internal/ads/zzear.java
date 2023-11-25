package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzear implements zzfgf {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfgn zzc;

    public zzear(Set set, zzfgn zzfgnVar) {
        zzffy zzffyVar;
        String str;
        zzffy zzffyVar2;
        String str2;
        this.zzc = zzfgnVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzeaq zzeaqVar = (zzeaq) it.next();
            Map map = this.zza;
            zzffyVar = zzeaqVar.zzb;
            str = zzeaqVar.zza;
            map.put(zzffyVar, str);
            Map map2 = this.zzb;
            zzffyVar2 = zzeaqVar.zzc;
            str2 = zzeaqVar.zza;
            map2.put(zzffyVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffyVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzffyVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffyVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffyVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzffyVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzffyVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzffyVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffyVar))), "s.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str) {
    }
}
