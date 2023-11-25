package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzctv implements zzcxw, com.google.android.gms.ads.internal.client.zza, zzczd, zzcxc, zzcwi, zzdbp {
    private final Clock zza;
    private final zzbzc zzb;

    public zzctv(Clock clock, zzbzc zzbzcVar) {
        this.zza = clock;
        this.zzb = zzbzcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbrVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzi(zzaxz zzaxzVar) {
        this.zzb.zzi();
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzm(zzaxz zzaxzVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzj(zzaxz zzaxzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzl(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbp
    public final void zzn(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvdVar, String str, String str2) {
    }
}
