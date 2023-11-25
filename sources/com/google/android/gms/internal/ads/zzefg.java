package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefg implements zzfya {
    final /* synthetic */ zzefh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefg(zzefh zzefhVar) {
        this.zza = zzefhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzcqz zzcqzVar;
        zzcwk zzcwkVar;
        zzcqzVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcqzVar.zzd().zza(th);
        zzcwkVar = this.zza.zzd;
        zzcwkVar.zzbF(zza);
        zzfcv.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcqc) obj).zzj();
    }
}
