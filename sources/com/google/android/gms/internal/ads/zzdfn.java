package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdfn implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcyo zza;
    private final zzddm zzb;

    public zzdfn(zzcyo zzcyoVar, zzddm zzddmVar) {
        this.zza = zzcyoVar;
        this.zzb = zzddmVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        this.zza.zzbL();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        this.zza.zzbo();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        this.zza.zzbu();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        this.zza.zzbv();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        this.zza.zzbx();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i10) {
        this.zza.zzby(i10);
        this.zzb.zza();
    }
}
