package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfwy extends zzfxa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwy(com.google.common.util.concurrent.a aVar, zzfxl zzfxlVar) {
        super(aVar, zzfxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzfxl zzfxlVar = (zzfxl) obj;
        com.google.common.util.concurrent.a zza = zzfxlVar.zza(obj2);
        zzfri.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfxlVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    final /* synthetic */ void zzf(Object obj) {
        zzs((com.google.common.util.concurrent.a) obj);
    }
}
