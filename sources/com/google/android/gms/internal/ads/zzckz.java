package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzckz implements zzdnu {
    private final zzciz zza;
    private zzeyz zzb;
    private zzeyc zzc;
    private zzdbv zzd;
    private zzcvs zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckz(zzciz zzcizVar, zzcky zzckyVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final /* synthetic */ zzdnu zzc(zzdbv zzdbvVar) {
        this.zzd = zzdbvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnu
    public final /* synthetic */ zzdnu zzd(zzcvs zzcvsVar) {
        this.zze = zzcvsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    /* renamed from: zze  reason: merged with bridge method [inline-methods] */
    public final zzdnv zzh() {
        zzgzb.zzc(this.zzd, zzdbv.class);
        zzgzb.zzc(this.zze, zzcvs.class);
        return new zzclb(this.zza, new zzctn(), new zzfdf(), new zzcuy(), new zzdru(), this.zzd, this.zze, zzehl.zza(), null, this.zzb, this.zzc, null);
    }
}
