package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdqo implements zzfgf {
    private final Map zza;
    private final zzaxe zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqo(zzaxe zzaxeVar, Map map) {
        this.zza = map;
        this.zzb = zzaxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffyVar, String str, Throwable th) {
        if (this.zza.containsKey(zzffyVar)) {
            this.zzb.zzc(((zzdqn) this.zza.get(zzffyVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffyVar, String str) {
        if (this.zza.containsKey(zzffyVar)) {
            this.zzb.zzc(((zzdqn) this.zza.get(zzffyVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        if (this.zza.containsKey(zzffyVar)) {
            this.zzb.zzc(((zzdqn) this.zza.get(zzffyVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str) {
    }
}
