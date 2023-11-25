package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfho implements zzfya {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfhg zzb;
    final /* synthetic */ boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfho(zzfhr zzfhrVar, zzfhg zzfhgVar, boolean z10) {
        this.zza = zzfhrVar;
        this.zzb = zzfhgVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhg zzfhgVar = this.zzb;
        if (zzfhgVar.zzj()) {
            zzfhr zzfhrVar = this.zza;
            zzfhgVar.zzg(th);
            zzfhgVar.zzf(false);
            zzfhrVar.zza(zzfhgVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
        zzfhr zzfhrVar = this.zza;
        zzfhg zzfhgVar = this.zzb;
        zzfhgVar.zzf(true);
        zzfhrVar.zza(zzfhgVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
