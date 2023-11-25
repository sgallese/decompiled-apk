package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdgs implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;

    public zzdgs(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
        this.zzf = zzgzgVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchd zzchdVar = (zzchd) this.zza.zzb();
        zzcvq zza = ((zzcwa) this.zzb).zza();
        zzdbv zza2 = ((zzdco) this.zzc).zza();
        zzdgh zza3 = ((zzdgj) this.zzd).zza();
        zzcyx zzb = ((zzcqb) this.zze).zzb();
        zzehc zzehcVar = (zzehc) this.zzf.zzb();
        zzcqy zze = zzchdVar.zze();
        zze.zzi(zza.zzj());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzejg(null));
        zze.zzg(new zzcrw(zzb, null));
        zze.zzc(new zzcpz(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdr)).booleanValue()) {
            zze.zzj(zzehj.zzb(zzehcVar));
        }
        zzcsh zzc = zze.zzh().zzc();
        zzgzb.zzb(zzc);
        return zzc;
    }
}
