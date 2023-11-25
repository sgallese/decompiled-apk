package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzele implements zzelm {
    final /* synthetic */ zzelf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzele(zzelf zzelfVar) {
        this.zza = zzelfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdep zzdepVar;
        zzdep zzdepVar2 = (zzdep) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdepVar2;
            zzdepVar = this.zza.zzj;
            zzdepVar.zzj();
        }
    }
}
