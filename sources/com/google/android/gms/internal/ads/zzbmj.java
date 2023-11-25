package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmj implements zzcaw {
    final /* synthetic */ zzbmt zza;
    final /* synthetic */ zzfhg zzb;
    final /* synthetic */ zzbmu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmj(zzbmu zzbmuVar, zzbmt zzbmtVar, zzfhg zzfhgVar) {
        this.zzc = zzbmuVar;
        this.zza = zzbmtVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbmt zzbmtVar;
        zzfhu zzfhuVar;
        zzfhu zzfhuVar2;
        zzbmt zzbmtVar2;
        zzbmt zzbmtVar3;
        zzblp zzblpVar = (zzblp) obj;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            this.zzc.zzi = 0;
            zzbmu zzbmuVar = this.zzc;
            zzbmtVar = zzbmuVar.zzh;
            if (zzbmtVar != null) {
                zzbmt zzbmtVar4 = this.zza;
                zzbmtVar2 = zzbmuVar.zzh;
                if (zzbmtVar4 != zzbmtVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbmtVar3 = this.zzc.zzh;
                    zzbmtVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
                zzbmu zzbmuVar2 = this.zzc;
                zzfhuVar = zzbmuVar2.zze;
                if (zzfhuVar != null) {
                    zzfhuVar2 = zzbmuVar2.zze;
                    zzfhg zzfhgVar = this.zzb;
                    zzfhgVar.zzf(true);
                    zzfhuVar2.zzb(zzfhgVar.zzl());
                }
            }
        }
    }
}
