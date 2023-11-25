package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaah implements zzaca {
    private final zzaak zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaah(zzaak zzaakVar, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = zzaakVar;
        this.zzb = j10;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
        this.zzf = j15;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzb;
    }

    public final long zzf(long j10) {
        return this.zza.zza(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        zzacb zzacbVar = new zzacb(j10, zzaaj.zzf(this.zza.zza(j10), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
