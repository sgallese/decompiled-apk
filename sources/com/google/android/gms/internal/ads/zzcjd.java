package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcjd implements zzcpp {
    private final zzciz zza;
    private zzeyz zzb;
    private zzeyc zzc;
    private zzdbv zzd;
    private zzcvs zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjd(zzciz zzcizVar, zzcjc zzcjcVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* synthetic */ zzcpp zzc(zzdbv zzdbvVar) {
        this.zzd = zzdbvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* synthetic */ zzcpp zzd(zzcvs zzcvsVar) {
        this.zze = zzcvsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    /* renamed from: zze  reason: merged with bridge method [inline-methods] */
    public final zzcpq zzh() {
        zzgzb.zzc(this.zzd, zzdbv.class);
        zzgzb.zzc(this.zze, zzcvs.class);
        return new zzcjf(this.zza, new zzctn(), new zzfdf(), new zzcuy(), new zzdru(), this.zzd, this.zze, zzehl.zza(), null, this.zzb, this.zzc, null);
    }
}
