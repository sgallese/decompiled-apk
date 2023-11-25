package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzckd implements zzdsi {
    private final Long zza;
    private final String zzb;
    private final zzciz zzc;
    private final zzckh zzd;
    private final zzckd zze = this;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzckd(zzciz zzcizVar, zzckh zzckhVar, Long l10, String str, zzckc zzckcVar) {
        this.zzc = zzcizVar;
        this.zzd = zzckhVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final zzdss zza() {
        Context context;
        zzdsl zzc;
        long longValue = this.zza.longValue();
        zzckh zzckhVar = this.zzd;
        context = zzckhVar.zza;
        zzc = zzdsm.zzc(zzckhVar.zzb);
        return zzdst.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final zzdsw zzb() {
        Context context;
        zzdsl zzc;
        long longValue = this.zza.longValue();
        zzckh zzckhVar = this.zzd;
        context = zzckhVar.zza;
        zzc = zzdsm.zzc(zzckhVar.zzb);
        return zzdsx.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
