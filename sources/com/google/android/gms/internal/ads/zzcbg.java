package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcbg implements Runnable {
    final /* synthetic */ zzcbn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbg(zzcbn zzcbnVar) {
        this.zza = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        zzcbo zzcboVar2;
        zzcbn zzcbnVar = this.zza;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            zzcboVar2 = zzcbnVar.zzq;
            zzcboVar2.zza();
        }
    }
}
