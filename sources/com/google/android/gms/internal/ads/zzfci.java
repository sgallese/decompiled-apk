package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfci implements zzfya {
    final /* synthetic */ zzcfi zza;
    final /* synthetic */ zzcob zzb;
    final /* synthetic */ zzfik zzc;
    final /* synthetic */ zzech zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfci(zzcfi zzcfiVar, zzcob zzcobVar, zzfik zzfikVar, zzech zzechVar) {
        this.zza = zzcfiVar;
        this.zzb = zzcobVar;
        this.zzc = zzfikVar;
        this.zzd = zzechVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzaj) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue()) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zze());
                return;
            } else {
                this.zzc.zzc(str, null);
                return;
            }
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        String str2 = this.zza.zzP().zzb;
        int i10 = 2;
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza.getContext())) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgg)).booleanValue() || !this.zza.zzD().zzT) {
                i10 = 1;
            }
        }
        this.zzd.zzd(new zzecj(currentTimeMillis, str2, str, i10));
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
    }
}
