package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfau implements zzelm {
    final /* synthetic */ zzfav zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfau(zzfav zzfavVar) {
        this.zza = zzfavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdnq zzdnqVar;
        zzfbs zzfbsVar;
        synchronized (this.zza) {
            this.zza.zzi = (zzdnq) obj;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdm)).booleanValue()) {
                zzfbt zzd = ((zzdnq) obj).zzd();
                zzfbsVar = this.zza.zzd;
                zzd.zza = zzfbsVar;
            }
            zzdnqVar = this.zza.zzi;
            zzdnqVar.zzj();
        }
    }
}
