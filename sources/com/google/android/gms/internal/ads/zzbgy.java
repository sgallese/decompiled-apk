package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbgy extends zzbfz {
    final /* synthetic */ zzbhb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbgy(zzbhb zzbhbVar, zzbgx zzbgxVar) {
        this.zza = zzbhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze(zzbfq zzbfqVar, String str) {
        zzbhb zzbhbVar = this.zza;
        if (zzbhb.zza(zzbhbVar) == null) {
            return;
        }
        zzbhb.zza(zzbhbVar).onCustomClick(zzbhb.zzc(zzbhbVar, zzbfqVar), str);
    }
}
