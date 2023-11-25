package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzduw implements zzfya {
    final /* synthetic */ String zza;
    final /* synthetic */ zzduy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduw(zzduy zzduyVar, String str) {
        this.zzb = zzduyVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdum zzdumVar;
        ((zzdts) obj).zze();
        zzdumVar = this.zzb.zzd;
        zzdumVar.zzk(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
    }
}
