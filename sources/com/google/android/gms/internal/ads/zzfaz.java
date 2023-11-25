package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfaz implements zzelm {
    final /* synthetic */ zzfbb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfaz(zzfbb zzfbbVar) {
        this.zza = zzfbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdnq zzdnqVar;
        zzfbs zzfbsVar;
        synchronized (this.zza) {
            this.zza.zzd = (zzdnq) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdm)).booleanValue()) {
                zzfbt zzd = ((zzdnq) obj).zzd();
                zzfbsVar = this.zza.zzc;
                zzd.zza = zzfbsVar;
            }
            zzdnqVar = this.zza.zzd;
            zzdnqVar.zzj();
        }
    }
}
