package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzebc implements zzcxw, zzcwl {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzebm zzd;

    public zzebc(zzebm zzebmVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzebmVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z10) {
        int i10;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && !this.zzc.zzQ()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgc)).intValue();
            }
            if (i10 >= intValue) {
                return;
            }
            this.zzd.zzd(z10);
            synchronized (obj) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzb(true);
    }
}
