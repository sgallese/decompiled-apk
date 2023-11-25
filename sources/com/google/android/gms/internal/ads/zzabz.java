package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzabz implements zzaca {
    private final long zza;
    private final zzaby zzb;

    public zzabz(long j10, long j11) {
        zzacb zzacbVar;
        this.zza = j10;
        if (j11 == 0) {
            zzacbVar = zzacb.zza;
        } else {
            zzacbVar = new zzacb(0L, j11);
        }
        this.zzb = new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return false;
    }
}
