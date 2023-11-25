package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfox extends zzfpq {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfpq
    public final zzfpq zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpq
    public final zzfpq zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpq
    public final zzfpr zzc() {
        return new zzfoz(this.zza, this.zzb, null);
    }
}
