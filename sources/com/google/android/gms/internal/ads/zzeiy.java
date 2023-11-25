package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeiy implements com.google.android.gms.ads.internal.zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcwg zzb;
    private final zzcxa zzc;
    private final zzddy zzd;
    private final zzddq zze;
    private final zzcoy zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeiy(zzcwg zzcwgVar, zzcxa zzcxaVar, zzddy zzddyVar, zzddq zzddqVar, zzcoy zzcoyVar) {
        this.zzb = zzcwgVar;
        this.zzc = zzcxaVar;
        this.zzd = zzddyVar;
        this.zze = zzddqVar;
        this.zzf = zzcoyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (!this.zza.compareAndSet(false, true)) {
            return;
        }
        this.zzf.zzq();
        this.zze.zza(view);
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
