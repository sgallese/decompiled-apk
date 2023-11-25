package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzexj implements zzelm {
    final /* synthetic */ zzexk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexj(zzexk zzexkVar) {
        this.zza = zzexkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzexc zzexcVar;
        zzexc zzexcVar2;
        zzdrh zzdrhVar;
        zzcpw zzcpwVar = (zzcpw) obj;
        synchronized (this.zza) {
            zzcpw zzcpwVar2 = this.zza.zza;
            if (zzcpwVar2 != null) {
                zzcpwVar2.zzb();
            }
            zzexk zzexkVar = this.zza;
            zzexkVar.zza = zzcpwVar;
            zzcpwVar.zzc(zzexkVar);
            zzexk zzexkVar2 = this.zza;
            zzexcVar = zzexkVar2.zzg;
            zzexcVar2 = zzexkVar2.zzg;
            zzdrhVar = zzexkVar2.zzi;
            zzexcVar.zzk(new zzcpx(zzcpwVar, zzexkVar2, zzexcVar2, zzdrhVar));
            zzcpwVar.zzj();
        }
    }
}
