package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzelt implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzdgm zzd;
    final /* synthetic */ zzelu zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelt(zzelu zzeluVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzdgm zzdgmVar) {
        this.zze = zzeluVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzchd zzchdVar;
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzbF(zza);
        zzchdVar = this.zze.zzb;
        zzchdVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // java.lang.Runnable
            public final void run() {
                zzelk zzelkVar;
                zzelt zzeltVar = zzelt.this;
                com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                zzelkVar = zzeltVar.zze.zzd;
                zzelkVar.zza().zzbF(zzeVar);
            }
        });
        zzfcv.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
            zzfhuVar = this.zze.zze;
            zzfhg zzfhgVar = this.zzc;
            zzfhgVar.zza(zza);
            zzfhgVar.zzg(th);
            zzfhgVar.zzf(false);
            zzfhuVar.zzb(zzfhgVar.zzl());
            return;
        }
        zzfhrVar.zzc(zza);
        zzfhg zzfhgVar2 = this.zzc;
        zzfhgVar2.zzg(th);
        zzfhgVar2.zzf(false);
        zzfhrVar.zza(zzfhgVar2);
        zzfhrVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzelk zzelkVar;
        zzchd zzchdVar;
        zzfhu zzfhuVar;
        zzfhr zzfhrVar;
        zzcse zzcseVar = (zzcse) obj;
        synchronized (this.zze) {
            zzdan zzn = zzcseVar.zzn();
            zzelkVar = this.zze.zzd;
            zzn.zza(zzelkVar.zzd());
            this.zza.zzb(zzcseVar);
            zzchdVar = this.zze.zzb;
            zzchdVar.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelr
                @Override // java.lang.Runnable
                public final void run() {
                    zzelk zzelkVar2;
                    zzelkVar2 = zzelt.this.zze.zzd;
                    zzelkVar2.zzb().zzr();
                }
            });
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhuVar = this.zze.zze;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzcseVar.zzp().zzb);
                zzfhgVar.zzd(zzcseVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzcseVar.zzp().zzb);
                zzfhrVar.zze(zzcseVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
