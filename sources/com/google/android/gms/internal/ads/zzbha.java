package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbha extends zzbgc {
    final /* synthetic */ zzbhb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbha(zzbhb zzbhbVar, zzbgz zzbgzVar) {
        this.zza = zzbhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zze(zzbfq zzbfqVar) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd zzf;
        zzbhb zzbhbVar = this.zza;
        onCustomTemplateAdLoadedListener = zzbhbVar.zza;
        zzf = zzbhbVar.zzf(zzbfqVar);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzf);
    }
}
