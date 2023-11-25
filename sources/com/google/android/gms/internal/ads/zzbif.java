package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbif implements zzfya {
    final /* synthetic */ zzcfi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbif(zzcfi zzcfiVar) {
        this.zza = zzcfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        new com.google.android.gms.ads.internal.util.zzby(this.zza.getContext(), this.zza.zzn().zza, (String) obj).zzb();
    }
}
