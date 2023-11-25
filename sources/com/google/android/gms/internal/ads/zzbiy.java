package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbiy implements zzfya {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbjc zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiy(zzbjc zzbjcVar, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str) {
        this.zzd = zzbjcVar;
        this.zza = zzaVar;
        this.zzb = map;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzh((String) obj, this.zza, this.zzb, this.zzc);
    }
}
