package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmm implements zzcaw {
    final /* synthetic */ zzbmo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmm(zzbmo zzbmoVar) {
        this.zza = zzbmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbmt zzbmtVar;
        zzbmv zzbmvVar = (zzbmv) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbmtVar = this.zza.zzb;
        zzbmtVar.zzd();
    }
}
