package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcbw implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbw(zzcbx zzcbxVar, boolean z10) {
        this.zzb = zzcbxVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
