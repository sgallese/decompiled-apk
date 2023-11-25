package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfoo extends zzfpa {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final zzfpa zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final zzfpa zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final zzfpb zzc() {
        return new zzfoq(this.zza, this.zzb, null);
    }
}
