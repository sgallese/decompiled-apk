package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcbl implements Runnable {
    final /* synthetic */ zzcbn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbl(zzcbn zzcbnVar) {
        this.zza = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        boolean z10;
        zzcbo zzcboVar2;
        zzcbo zzcboVar3;
        zzcbn zzcbnVar = this.zza;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            z10 = zzcbnVar.zzr;
            if (!z10) {
                zzcboVar3 = zzcbnVar.zzq;
                zzcboVar3.zzg();
                this.zza.zzr = true;
            }
            zzcboVar2 = this.zza.zzq;
            zzcboVar2.zze();
        }
    }
}
