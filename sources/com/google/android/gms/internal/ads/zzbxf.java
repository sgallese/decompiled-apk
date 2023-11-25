package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbxf {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzbyf zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxf(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbyf zzbyfVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzbyfVar;
    }

    public final void zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzar)).booleanValue()) {
            return;
        }
        this.zzc.zzt();
    }

    public final void zzb(int i10, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaq)).booleanValue()) {
            return;
        }
        if (j10 - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzar)).booleanValue()) {
            this.zzb.zzL(-1);
            this.zzb.zzM(j10);
        } else {
            this.zzb.zzL(i10);
            this.zzb.zzM(j10);
        }
        zza();
    }
}
