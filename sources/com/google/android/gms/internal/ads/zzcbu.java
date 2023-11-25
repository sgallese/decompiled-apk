package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcbu implements Runnable {
    final /* synthetic */ zzcbx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbu(zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
