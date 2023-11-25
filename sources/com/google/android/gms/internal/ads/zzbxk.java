package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbxk {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbyf zzd;

    private zzbxk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbxk(zzbxj zzbxjVar) {
    }

    public final zzbxk zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbxk zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbxk zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbxk zzd(zzbyf zzbyfVar) {
        this.zzd = zzbyfVar;
        return this;
    }

    public final zzbyg zze() {
        zzgzb.zzc(this.zza, Context.class);
        zzgzb.zzc(this.zzb, Clock.class);
        zzgzb.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzgzb.zzc(this.zzd, zzbyf.class);
        return new zzbxm(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
