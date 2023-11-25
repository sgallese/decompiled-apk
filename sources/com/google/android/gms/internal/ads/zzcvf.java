package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcvf implements zzcwi, zzddf, zzdba, zzcwy, zzauf {
    private final zzcxa zza;
    private final zzfbe zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private ScheduledFuture zzf;
    private final String zzh;
    private final zzfyw zze = zzfyw.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvf(zzcxa zzcxaVar, zzfbe zzfbeVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.zza = zzcxaVar;
        this.zzb = zzfbeVar;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zzh = str;
    }

    private final boolean zzm() {
        if (this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaueVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzki)).booleanValue() && zzm() && zzaueVar.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zzf != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        zzfbe zzfbeVar = this.zzb;
        if (zzfbeVar.zzf == 3) {
            return;
        }
        int i10 = zzfbeVar.zzZ;
        if (i10 != 0 && i10 != 1) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzki)).booleanValue() && zzm()) {
            return;
        }
        this.zza.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        synchronized (this) {
            if (this.zze.isDone()) {
                return;
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final synchronized void zzj() {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzc(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzk() {
        if (this.zzb.zzf == 3) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbt)).booleanValue()) {
            zzfbe zzfbeVar = this.zzb;
            if (zzfbeVar.zzZ == 2) {
                if (zzfbeVar.zzr == 0) {
                    this.zza.zza();
                    return;
                }
                zzfye.zzr(this.zze, new zzcve(this), this.zzd);
                this.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcvf.this.zzh();
                    }
                }, this.zzb.zzr, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwy
    public final synchronized void zzp(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zze.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzf;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.zze.zzd(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzddf
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvdVar, String str, String str2) {
    }
}
