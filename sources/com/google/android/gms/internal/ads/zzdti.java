package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdti extends zzbkr {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhg zzd;
    final /* synthetic */ zzcas zze;
    final /* synthetic */ zzdtj zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdti(zzdtj zzdtjVar, Object obj, String str, long j10, zzfhg zzfhgVar, zzcas zzcasVar) {
        this.zzf = zzdtjVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = zzfhgVar;
        this.zze = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zze(String str) {
        zzdrq zzdrqVar;
        zzdcz zzdczVar;
        zzfhu zzfhuVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdrqVar = this.zzf.zzl;
            zzdrqVar.zzb(this.zzb, "error");
            zzdczVar = this.zzf.zzo;
            zzdczVar.zzb(this.zzb, "error");
            zzfhuVar = this.zzf.zzp;
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zzc(str);
            zzfhgVar.zzf(false);
            zzfhuVar.zzb(zzfhgVar.zzl());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final void zzf() {
        zzdrq zzdrqVar;
        zzdcz zzdczVar;
        zzfhu zzfhuVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdrqVar = this.zzf.zzl;
            zzdrqVar.zzd(this.zzb);
            zzdczVar = this.zzf.zzo;
            zzdczVar.zzd(this.zzb);
            zzfhuVar = this.zzf.zzp;
            zzfhg zzfhgVar = this.zzd;
            zzfhgVar.zzf(true);
            zzfhuVar.zzb(zzfhgVar.zzl());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
