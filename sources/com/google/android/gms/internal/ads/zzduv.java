package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzduv extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzduy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduv(zzduy zzduyVar, String str) {
        this.zzb = zzduyVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzduy zzduyVar = this.zzb;
        zzl = zzduy.zzl(loadAdError);
        zzduyVar.zzm(zzl, this.zza);
    }
}
