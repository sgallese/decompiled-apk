package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzcld implements com.google.android.gms.ads.nonagon.signalgeneration.zzg {
    private final zzciz zza;
    private zzcvs zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzae zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcld(zzciz zzcizVar, zzclc zzclcVar) {
        this.zza = zzcizVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zza(zzcvs zzcvsVar) {
        this.zzb = zzcvsVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzae zzaeVar) {
        this.zzc = zzaeVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzc() {
        zzgzb.zzc(this.zzb, zzcvs.class);
        zzgzb.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzae.class);
        return new zzclf(this.zza, this.zzc, new zzctn(), new zzdru(), this.zzb, null, null, null);
    }
}
