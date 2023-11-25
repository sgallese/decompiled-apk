package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcbv implements Runnable {
    final /* synthetic */ zzcbx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbv(zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
