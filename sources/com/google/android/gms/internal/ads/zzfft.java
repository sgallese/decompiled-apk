package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfft implements zzfya {
    final /* synthetic */ zzffj zza;
    final /* synthetic */ zzffv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfft(zzffv zzffvVar, zzffj zzffjVar) {
        this.zzb = zzffvVar;
        this.zza = zzffjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzffx zzffxVar;
        zzffxVar = this.zzb.zza.zzd;
        zzffxVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
        zzffx zzffxVar;
        zzffxVar = this.zzb.zza.zzd;
        zzffxVar.zzd(this.zza);
    }
}
