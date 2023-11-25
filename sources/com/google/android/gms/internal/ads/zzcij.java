package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcij implements zzdgl {
    private final zzciz zza;
    private zzeyz zzb;
    private zzeyc zzc;
    private zzdbv zzd;
    private zzcvs zze;
    private zzdgh zzf;
    private zzcpz zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcij(zzciz zzcizVar, zzcii zzciiVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final /* synthetic */ zzdgl zzc(zzcpz zzcpzVar) {
        this.zzg = zzcpzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final /* synthetic */ zzdgl zzd(zzdgh zzdghVar) {
        this.zzf = zzdghVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final /* synthetic */ zzdgl zze(zzdbv zzdbvVar) {
        this.zzd = zzdbvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final /* synthetic */ zzdgl zzf(zzcvs zzcvsVar) {
        this.zze = zzcvsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    /* renamed from: zzg  reason: merged with bridge method [inline-methods] */
    public final zzdgm zzh() {
        zzgzb.zzc(this.zzd, zzdbv.class);
        zzgzb.zzc(this.zze, zzcvs.class);
        zzgzb.zzc(this.zzf, zzdgh.class);
        zzgzb.zzc(this.zzg, zzcpz.class);
        return new zzcil(this.zza, this.zzg, this.zzf, new zzctn(), new zzfdf(), new zzcuy(), new zzdru(), this.zzd, this.zze, zzehl.zza(), null, this.zzb, this.zzc, null);
    }
}
