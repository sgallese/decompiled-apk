package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcsr implements zzfya {
    final /* synthetic */ zzfya zza;
    final /* synthetic */ zzcss zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsr(zzcss zzcssVar, zzfya zzfyaVar) {
        this.zzb = zzcssVar;
        this.zza = zzfyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsp
            @Override // java.lang.Runnable
            public final void run() {
                zzcss.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsp
            @Override // java.lang.Runnable
            public final void run() {
                zzcss.this.zzd();
            }
        });
        this.zza.zzb((zzcse) obj);
    }
}
