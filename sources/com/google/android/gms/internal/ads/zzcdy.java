package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcdy extends zzcdu {
    public zzcdy(zzccj zzccjVar) {
        super(zzccjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzt(String str) {
        String zze = zzbzt.zze(str);
        zzccj zzccjVar = (zzccj) this.zzc.get();
        if (zzccjVar != null && zze != null) {
            zzccjVar.zzt(zze, this);
        }
        zzcaa.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzf() {
    }
}
