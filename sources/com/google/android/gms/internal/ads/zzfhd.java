package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfhd implements zzddf, zzcwy, zzddj {
    private final zzfhr zza;
    private final zzfhg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhd(Context context, zzfhr zzfhrVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfhf.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddj
    public final void zzb() {
        if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
            zzfhr zzfhrVar = this.zza;
            zzfhg zzfhgVar = this.zzb;
            zzfhgVar.zzf(true);
            zzfhrVar.zza(zzfhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzl() {
        if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
            this.zzb.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
            zzfhr zzfhrVar = this.zza;
            zzfhg zzfhgVar = this.zzb;
            zzfhgVar.zzc(zzeVar.zza().toString());
            zzfhgVar.zzf(false);
            zzfhrVar.zza(zzfhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddj
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzk() {
    }
}
