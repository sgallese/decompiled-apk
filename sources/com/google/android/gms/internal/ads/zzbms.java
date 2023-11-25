package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbms implements zzcaw {
    final /* synthetic */ zzbmt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbms(zzbmt zzbmtVar) {
        this.zza = zzbmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzblp zzblpVar = (zzblp) obj;
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmr
            @Override // java.lang.Runnable
            public final void run() {
                zzblp zzblpVar2 = zzblpVar;
                zzblpVar2.zzr("/result", zzbiq.zzo);
                zzblpVar2.zzc();
            }
        });
    }
}
