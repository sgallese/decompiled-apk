package com.google.android.gms.internal.ads;

import android.app.Activity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzebx extends zzect {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzl zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzect
    public final zzect zza(Activity activity) {
        if (activity != null) {
            this.zza = activity;
            return this;
        }
        throw new NullPointerException("Null activity");
    }

    @Override // com.google.android.gms.internal.ads.zzect
    public final zzect zzb(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzb = zzlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzect
    public final zzect zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzect
    public final zzect zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzect
    public final zzecu zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzebz(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
