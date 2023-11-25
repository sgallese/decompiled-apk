package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcwv extends zzdbs implements zzcwm {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcwv(zzcwu zzcwuVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzcwuVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcwo
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzcwm) obj).zza(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcwq
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzcwm) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc(final zzdfx zzdfxVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzt(new zzdbr() { // from class: com.google.android.gms.internal.ads.zzcwn
            @Override // com.google.android.gms.internal.ads.zzdbr
            public final void zza(Object obj) {
                ((zzcwm) obj).zzc(zzdfx.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzcaa.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdfx("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwp
            @Override // java.lang.Runnable
            public final void run() {
                zzcwv.this.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjI)).intValue(), TimeUnit.MILLISECONDS);
    }
}
