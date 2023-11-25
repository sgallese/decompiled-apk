package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzelh implements zzelm {
    final /* synthetic */ zzeli zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelh(zzeli zzeliVar) {
        this.zza = zzeliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcse) obj).zzl();
            ((zzcse) obj).zzj();
        }
    }
}
