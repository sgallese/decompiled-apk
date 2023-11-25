package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfhp implements zzfya {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfhg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhp(zzfhr zzfhrVar, zzfhg zzfhgVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhr zzfhrVar = this.zza;
        zzfhg zzfhgVar = this.zzb;
        zzfhgVar.zzg(th);
        zzfhgVar.zzf(false);
        zzfhrVar.zza(zzfhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
    }
}
