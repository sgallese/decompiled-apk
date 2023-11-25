package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzox {
    private final Handler zza;
    private final zzoy zzb;

    public zzox(Handler handler, zzoy zzoyVar) {
        this.zza = zzoyVar == null ? null : handler;
        this.zzb = zzoyVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzon
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzot
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzos
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzj(str, j10, j11);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzou
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzid zzidVar) {
        zzidVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzl(zzidVar);
                }
            });
        }
    }

    public final void zzf(final zzid zzidVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzm(zzidVar);
                }
            });
        }
    }

    public final void zzg(final zzam zzamVar, final zzie zzieVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzov
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzn(zzamVar, zzieVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Exception exc) {
        zzoy zzoyVar = this.zzb;
        int i10 = zzfk.zza;
        zzoyVar.zzb(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Exception exc) {
        zzoy zzoyVar = this.zzb;
        int i10 = zzfk.zza;
        zzoyVar.zzi(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(String str, long j10, long j11) {
        zzoy zzoyVar = this.zzb;
        int i10 = zzfk.zza;
        zzoyVar.zzc(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(String str) {
        zzoy zzoyVar = this.zzb;
        int i10 = zzfk.zza;
        zzoyVar.zzd(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzid zzidVar) {
        zzidVar.zza();
        zzoy zzoyVar = this.zzb;
        int i10 = zzfk.zza;
        zzoyVar.zze(zzidVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzid zzidVar) {
        zzoy zzoyVar = this.zzb;
        int i10 = zzfk.zza;
        zzoyVar.zzf(zzidVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzam zzamVar, zzie zzieVar) {
        int i10 = zzfk.zza;
        this.zzb.zzg(zzamVar, zzieVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(long j10) {
        zzoy zzoyVar = this.zzb;
        int i10 = zzfk.zza;
        zzoyVar.zzh(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z10) {
        zzoy zzoyVar = this.zzb;
        int i10 = zzfk.zza;
        zzoyVar.zzm(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i10, long j10, long j11) {
        zzoy zzoyVar = this.zzb;
        int i11 = zzfk.zza;
        zzoyVar.zzj(i10, j10, j11);
    }

    public final void zzr(final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzo(j10);
                }
            });
        }
    }

    public final void zzs(final boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzp(z10);
                }
            });
        }
    }

    public final void zzt(final int i10, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzow
                @Override // java.lang.Runnable
                public final void run() {
                    zzox.this.zzq(i10, j10, j11);
                }
            });
        }
    }
}
