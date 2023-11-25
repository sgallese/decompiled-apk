package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzzv {
    private final Handler zza;
    private final zzzw zzb;

    public zzzv(Handler handler, zzzw zzzwVar) {
        this.zza = zzzwVar == null ? null : handler;
        this.zzb = zzzwVar;
    }

    public final void zza(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzr
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzg(str, j10, j11);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzid zzidVar) {
        zzidVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzq
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzi(zzidVar);
                }
            });
        }
    }

    public final void zzd(final int i10, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzl
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzj(i10, j10);
                }
            });
        }
    }

    public final void zze(final zzid zzidVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzp
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzk(zzidVar);
                }
            });
        }
    }

    public final void zzf(final zzam zzamVar, final zzie zzieVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzs
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzl(zzamVar, zzieVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j10, long j11) {
        zzzw zzzwVar = this.zzb;
        int i10 = zzfk.zza;
        zzzwVar.zzo(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        zzzw zzzwVar = this.zzb;
        int i10 = zzfk.zza;
        zzzwVar.zzp(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzid zzidVar) {
        zzidVar.zza();
        zzzw zzzwVar = this.zzb;
        int i10 = zzfk.zza;
        zzzwVar.zzq(zzidVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i10, long j10) {
        zzzw zzzwVar = this.zzb;
        int i11 = zzfk.zza;
        zzzwVar.zzk(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzid zzidVar) {
        zzzw zzzwVar = this.zzb;
        int i10 = zzfk.zza;
        zzzwVar.zzr(zzidVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzam zzamVar, zzie zzieVar) {
        int i10 = zzfk.zza;
        this.zzb.zzt(zzamVar, zzieVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j10) {
        zzzw zzzwVar = this.zzb;
        int i10 = zzfk.zza;
        zzzwVar.zzl(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j10, int i10) {
        zzzw zzzwVar = this.zzb;
        int i11 = zzfk.zza;
        zzzwVar.zzs(j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        zzzw zzzwVar = this.zzb;
        int i10 = zzfk.zza;
        zzzwVar.zzn(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzdn zzdnVar) {
        zzzw zzzwVar = this.zzb;
        int i10 = zzfk.zza;
        zzzwVar.zzu(zzdnVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzm
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j10, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzo
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzn(j10, i10);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzn
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdn zzdnVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
                @Override // java.lang.Runnable
                public final void run() {
                    zzzv.this.zzp(zzdnVar);
                }
            });
        }
    }
}
