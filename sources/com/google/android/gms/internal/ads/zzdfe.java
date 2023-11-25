package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdfe implements zzgyt {
    private final zzdet zza;
    private final zzgzg zzb;

    public zzdfe(zzdet zzdetVar, zzgzg zzgzgVar) {
        this.zza = zzdetVar;
        this.zzb = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzf = this.zza.zzf((zzcvf) this.zzb.zzb());
        zzgzb.zzb(zzf);
        return zzf;
    }
}
