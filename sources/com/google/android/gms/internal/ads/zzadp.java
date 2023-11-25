package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzadp implements zzaca {
    final /* synthetic */ zzaca zza;
    final /* synthetic */ zzadq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadp(zzadq zzadqVar, zzaca zzacaVar) {
        this.zzb = zzadqVar;
        this.zza = zzacaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        long j11;
        long j12;
        zzaby zzg = this.zza.zzg(j10);
        zzacb zzacbVar = zzg.zza;
        long j13 = zzacbVar.zzb;
        long j14 = zzacbVar.zzc;
        j11 = this.zzb.zzb;
        zzacb zzacbVar2 = new zzacb(j13, j14 + j11);
        zzacb zzacbVar3 = zzg.zzb;
        long j15 = zzacbVar3.zzb;
        long j16 = zzacbVar3.zzc;
        j12 = this.zzb.zzb;
        return new zzaby(zzacbVar2, new zzacb(j15, j16 + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
