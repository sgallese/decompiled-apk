package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcbj implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcbn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbj(zzcbn zzcbnVar, int i10, int i11) {
        this.zzc = zzcbnVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        zzcbo zzcboVar2;
        zzcbn zzcbnVar = this.zzc;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            zzcboVar2 = zzcbnVar.zzq;
            zzcboVar2.zzj(this.zza, this.zzb);
        }
    }
}
