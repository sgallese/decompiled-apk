package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzlu implements zzkp {
    private final zzdz zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzch zze = zzch.zza;

    public zzlu(zzdz zzdzVar) {
        this.zza = zzdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final long zza() {
        long zza;
        long j10 = this.zzc;
        if (this.zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
            zzch zzchVar = this.zze;
            if (zzchVar.zzc == 1.0f) {
                zza = zzfk.zzp(elapsedRealtime);
            } else {
                zza = zzchVar.zza(elapsedRealtime);
            }
            return j10 + zza;
        }
        return j10;
    }

    public final void zzb(long j10) {
        this.zzc = j10;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final zzch zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (!this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
            this.zzb = true;
        }
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final void zzg(zzch zzchVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzchVar;
    }
}
