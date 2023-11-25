package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdrk implements zzfgf {
    private final zzdrc zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdrk(zzdrc zzdrcVar, Set set, Clock clock) {
        zzffy zzffyVar;
        this.zzb = zzdrcVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdrj zzdrjVar = (zzdrj) it.next();
            Map map = this.zzd;
            zzffyVar = zzdrjVar.zzc;
            map.put(zzffyVar, zzdrjVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzffy zzffyVar, boolean z10) {
        zzffy zzffyVar2;
        String str;
        String str2;
        zzffyVar2 = ((zzdrj) this.zzd.get(zzffyVar)).zzb;
        if (this.zza.containsKey(zzffyVar2)) {
            if (true != z10) {
                str = "f.";
            } else {
                str = "s.";
            }
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffyVar2)).longValue();
            Map zza = this.zzb.zza();
            str2 = ((zzdrj) this.zzd.get(zzffyVar)).zza;
            zza.put("label.".concat(str2), str.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffyVar, String str, Throwable th) {
        if (this.zza.containsKey(zzffyVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffyVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzffyVar)) {
            zze(zzffyVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffyVar, String str) {
        this.zza.put(zzffyVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        if (this.zza.containsKey(zzffyVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffyVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzffyVar)) {
            zze(zzffyVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str) {
    }
}
