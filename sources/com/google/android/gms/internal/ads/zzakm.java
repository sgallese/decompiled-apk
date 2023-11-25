package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzakm implements zzaca {
    private final zzakj zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzakm(zzakj zzakjVar, int i10, long j10, long j11) {
        this.zza = zzakjVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / zzakjVar.zzd;
        this.zzd = j12;
        this.zze = zza(j12);
    }

    private final long zza(long j10) {
        return zzfk.zzq(j10 * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j10) / (this.zzb * 1000000), this.zzd - 1));
        long j11 = this.zzc + (this.zza.zzd * max);
        long zza = zza(max);
        zzacb zzacbVar = new zzacb(zza, j11);
        if (zza < j10 && max != this.zzd - 1) {
            long j12 = max + 1;
            return new zzaby(zzacbVar, new zzacb(zza(j12), this.zzc + (this.zza.zzd * j12)));
        }
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
