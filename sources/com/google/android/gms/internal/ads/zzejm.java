package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzejm implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzdeq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejm(zzejn zzejnVar, zzdeq zzdeqVar) {
        this.zza = zzdeqVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }
}
