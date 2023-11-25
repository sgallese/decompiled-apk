package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdmt implements zzfya {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbir zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmt(zzdnb zzdnbVar, String str, zzbir zzbirVar) {
        this.zza = str;
        this.zzb = zzbirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcfi) obj).zzau(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
    }
}
