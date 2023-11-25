package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcrt implements zzcxw, zzauf {
    private final zzfbe zza;
    private final zzcxa zzb;
    private final zzcyf zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcrt(zzfbe zzfbeVar, zzcxa zzcxaVar, zzcyf zzcyfVar) {
        this.zza = zzfbeVar;
        this.zzb = zzcxaVar;
        this.zzc = zzcyfVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaueVar) {
        if (this.zza.zzf == 1 && zzaueVar.zzj) {
            zza();
        }
        if (zzaueVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zzr() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
