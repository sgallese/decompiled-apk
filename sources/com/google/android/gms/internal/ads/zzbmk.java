package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmk implements zzcau {
    final /* synthetic */ zzbmt zza;
    final /* synthetic */ zzfhg zzb;
    final /* synthetic */ zzbmu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmk(zzbmu zzbmuVar, zzbmt zzbmtVar, zzfhg zzfhgVar) {
        this.zzc = zzbmuVar;
        this.zza = zzbmtVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
        Object obj;
        zzfhu zzfhuVar;
        zzfhu zzfhuVar2;
        obj = this.zzc.zza;
        synchronized (obj) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
                zzbmu zzbmuVar = this.zzc;
                zzfhuVar = zzbmuVar.zze;
                if (zzfhuVar != null) {
                    zzfhuVar2 = zzbmuVar.zze;
                    zzfhg zzfhgVar = this.zzb;
                    zzfhgVar.zzc("Failed loading new engine");
                    zzfhgVar.zzf(false);
                    zzfhuVar2.zzb(zzfhgVar.zzl());
                }
            }
        }
    }
}
