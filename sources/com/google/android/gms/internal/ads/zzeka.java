package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeka extends com.google.android.gms.ads.internal.client.zzbp {
    final zzfby zza;
    final zzdil zzb;
    private final Context zzc;
    private final zzchd zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzeka(zzchd zzchdVar, Context context, String str) {
        zzfby zzfbyVar = new zzfby();
        this.zza = zzfbyVar;
        this.zzb = new zzdil();
        this.zzd = zzchdVar;
        zzfbyVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdin zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfby zzfbyVar = this.zza;
        if (zzfbyVar.zzg() == null) {
            zzfbyVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzekb(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbfu zzbfuVar) {
        this.zzb.zza(zzbfuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbfx zzbfxVar) {
        this.zzb.zzb(zzbfxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbgd zzbgdVar, zzbga zzbgaVar) {
        this.zzb.zzc(str, zzbgdVar, zzbgaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzblj zzbljVar) {
        this.zzb.zzd(zzbljVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbgh zzbghVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbghVar);
        this.zza.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbgk zzbgkVar) {
        this.zzb.zzf(zzbgkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbla zzblaVar) {
        this.zza.zzv(zzblaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbek zzbekVar) {
        this.zza.zzA(zzbekVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzQ(zzcfVar);
    }
}
