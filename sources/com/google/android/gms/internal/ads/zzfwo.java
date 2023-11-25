package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfwo extends zzfwq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwo(com.google.common.util.concurrent.a aVar, Class cls, zzfxl zzfxlVar) {
        super(aVar, cls, zzfxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzfxl zzfxlVar = (zzfxl) obj;
        com.google.common.util.concurrent.a zza = zzfxlVar.zza(th);
        zzfri.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfxlVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    final /* synthetic */ void zzf(Object obj) {
        zzs((com.google.common.util.concurrent.a) obj);
    }
}
