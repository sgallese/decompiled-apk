package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdfz implements zzcxw, com.google.android.gms.ads.internal.overlay.zzo, zzcxc {
    zzfip zza;
    private final Context zzb;
    private final zzcfi zzc;
    private final zzfbe zzd;
    private final zzcag zze;
    private final zzaxo zzf;

    public zzdfz(Context context, zzcfi zzcfiVar, zzfbe zzfbeVar, zzcag zzcagVar, zzaxo zzaxoVar) {
        this.zzb = context;
        this.zzc = zzcfiVar;
        this.zzd = zzfbeVar;
        this.zze = zzcagVar;
        this.zzf = zzaxoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        if (this.zza != null && this.zzc != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeW)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new androidx.collection.a());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (this.zza != null && this.zzc != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeW)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new androidx.collection.a());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzedi zzediVar;
        zzedi zzediVar2;
        zzedh zzedhVar;
        zzaxo zzaxoVar = this.zzf;
        if ((zzaxoVar == zzaxo.REWARD_BASED_VIDEO_AD || zzaxoVar == zzaxo.INTERSTITIAL || zzaxoVar == zzaxo.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzA().zzj(this.zzb)) {
            zzcag zzcagVar = this.zze;
            String str = zzcagVar.zzb + "." + zzcagVar.zzc;
            String zza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzedhVar = zzedh.VIDEO;
                zzediVar2 = zzedi.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzZ == 2) {
                    zzediVar = zzedi.UNSPECIFIED;
                } else {
                    zzediVar = zzedi.BEGIN_TO_RENDER;
                }
                zzediVar2 = zzediVar;
                zzedhVar = zzedh.HTML_DISPLAY;
            }
            zzfip zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzc.zzG(), "", "javascript", zza, zzediVar2, zzedhVar, this.zzd.zzam);
            this.zza = zza2;
            if (zza2 != null) {
                com.google.android.gms.ads.internal.zzt.zzA().zzh(this.zza, (View) this.zzc);
                this.zzc.zzap(this.zza);
                com.google.android.gms.ads.internal.zzt.zzA().zzi(this.zza);
                this.zzc.zzd("onSdkLoaded", new androidx.collection.a());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }
}
