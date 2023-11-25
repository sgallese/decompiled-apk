package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzccl implements Runnable {
    private final zzcbx zza;
    private boolean zzb = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccl(zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    private final void zzc() {
        zzfoe zzfoeVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfoeVar.removeCallbacks(this);
        zzfoeVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zzb) {
            this.zza.zzt();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
