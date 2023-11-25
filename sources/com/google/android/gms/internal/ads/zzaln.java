package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaln implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzalp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaln(zzalp zzalpVar, String str, long j10) {
        this.zzc = zzalpVar;
        this.zza = str;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzama zzamaVar;
        zzama zzamaVar2;
        zzamaVar = this.zzc.zza;
        zzamaVar.zza(this.zza, this.zzb);
        zzalp zzalpVar = this.zzc;
        zzamaVar2 = zzalpVar.zza;
        zzamaVar2.zzb(zzalpVar.toString());
    }
}
