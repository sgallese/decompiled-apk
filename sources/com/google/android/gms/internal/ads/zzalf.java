package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzalf implements Runnable {
    private final zzalp zza;
    private final zzalv zzb;
    private final Runnable zzc;

    public zzalf(zzalp zzalpVar, zzalv zzalvVar, Runnable runnable) {
        this.zza = zzalpVar;
        this.zzb = zzalvVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzalv zzalvVar = this.zzb;
        if (zzalvVar.zzc()) {
            this.zza.zzo(zzalvVar.zza);
        } else {
            this.zza.zzn(zzalvVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
