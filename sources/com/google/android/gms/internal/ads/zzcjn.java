package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcjn implements zzcqy {
    private final zzciz zza;
    private zzeyz zzb;
    private zzeyc zzc;
    private zzdbv zzd;
    private zzcvs zze;
    private zzejg zzf;
    private zzcrw zzg;
    private zzehj zzh;
    private zzcpz zzi;
    private zzdgh zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjn(zzciz zzcizVar, zzcjm zzcjmVar) {
        this.zza = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    public final /* synthetic */ zzcvo zza(zzeyc zzeycVar) {
        this.zzc = zzeycVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    public final /* synthetic */ zzcvo zzb(zzeyz zzeyzVar) {
        this.zzb = zzeyzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcqy zzc(zzcpz zzcpzVar) {
        this.zzi = zzcpzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcqy zzd(zzdgh zzdghVar) {
        this.zzj = zzdghVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcqy zze(zzejg zzejgVar) {
        this.zzf = zzejgVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcqy zzf(zzdbv zzdbvVar) {
        this.zzd = zzdbvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcqy zzg(zzcrw zzcrwVar) {
        this.zzg = zzcrwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcqy zzi(zzcvs zzcvsVar) {
        this.zze = zzcvsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcqy
    public final /* synthetic */ zzcqy zzj(zzehj zzehjVar) {
        this.zzh = zzehjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    /* renamed from: zzk  reason: merged with bridge method [inline-methods] */
    public final zzcqz zzh() {
        zzgzb.zzc(this.zzd, zzdbv.class);
        zzgzb.zzc(this.zze, zzcvs.class);
        zzgzb.zzc(this.zzf, zzejg.class);
        zzgzb.zzc(this.zzg, zzcrw.class);
        if (this.zzh == null) {
            this.zzh = zzehl.zza();
        }
        zzgzb.zzc(this.zzi, zzcpz.class);
        zzgzb.zzc(this.zzj, zzdgh.class);
        return new zzcjp(this.zza, this.zzi, this.zzj, new zzctn(), new zzfdf(), new zzcuy(), new zzdru(), this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc, null);
    }
}
