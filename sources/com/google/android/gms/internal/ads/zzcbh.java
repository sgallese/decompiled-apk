package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcbh implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcbn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbh(zzcbn zzcbnVar, String str, String str2) {
        this.zzc = zzcbnVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        zzcbo zzcboVar2;
        zzcbn zzcbnVar = this.zzc;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            zzcboVar2 = zzcbnVar.zzq;
            zzcboVar2.zzb(this.zza, this.zzb);
        }
    }
}
