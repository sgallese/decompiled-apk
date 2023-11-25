package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfzb extends zzfyn {
    final /* synthetic */ zzfzd zza;
    private final zzfxk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzb(zzfzd zzfzdVar, zzfxk zzfxkVar) {
        this.zza = zzfzdVar;
        this.zzb = zzfxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        com.google.common.util.concurrent.a zza = this.zzb.zza();
        zzfri.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((com.google.common.util.concurrent.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final boolean zzg() {
        return this.zza.isDone();
    }
}
