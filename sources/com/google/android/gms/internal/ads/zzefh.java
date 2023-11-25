package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzefh implements zzedn {
    private final zzcqz zza;
    private final zzeeo zzb;
    private final zzfyo zzc;
    private final zzcwk zzd;
    private final ScheduledExecutorService zze;

    public zzefh(zzcqz zzcqzVar, zzeeo zzeeoVar, zzcwk zzcwkVar, ScheduledExecutorService scheduledExecutorService, zzfyo zzfyoVar) {
        this.zza = zzcqzVar;
        this.zzb = zzeeoVar;
        this.zzd = zzcwkVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzfyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final com.google.common.util.concurrent.a zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzefe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzefh.this.zzc(zzfbrVar, zzfbeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        if (zzfbrVar.zza.zza.zza() != null && this.zzb.zzb(zzfbrVar, zzfbeVar)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcqc zzc(final zzfbr zzfbrVar, final zzfbe zzfbeVar) throws Exception {
        return this.zza.zzb(new zzcst(zzfbrVar, zzfbeVar, null), new zzcrm(zzfbrVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzeff
            @Override // java.lang.Runnable
            public final void run() {
                zzefh.this.zzf(zzfbrVar, zzfbeVar);
            }
        })).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfye.zzr(zzfye.zzo(this.zzb.zza(zzfbrVar, zzfbeVar), zzfbeVar.zzS, TimeUnit.SECONDS, this.zze), new zzefg(this), this.zzc);
    }
}
