package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaqq implements zzaqt {
    private static zzaqq zzb;
    private final Context zzc;
    private final zzfmr zzd;
    private final zzfmy zze;
    private final zzfna zzf;
    private final zzars zzg;
    private final zzflc zzh;
    private final Executor zzi;
    private final zzfmx zzj;
    private final zzash zzl;
    private final zzarz zzm;
    private final zzarq zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    zzaqq(Context context, zzflc zzflcVar, zzfmr zzfmrVar, zzfmy zzfmyVar, zzfna zzfnaVar, zzars zzarsVar, Executor executor, zzfkx zzfkxVar, int i10, zzash zzashVar, zzarz zzarzVar, zzarq zzarqVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzflcVar;
        this.zzd = zzfmrVar;
        this.zze = zzfmyVar;
        this.zzf = zzfnaVar;
        this.zzg = zzarsVar;
        this.zzi = executor;
        this.zzr = i10;
        this.zzl = zzashVar;
        this.zzm = zzarzVar;
        this.zzn = zzarqVar;
        this.zzq = false;
        this.zzj = new zzaqo(this, zzfkxVar);
    }

    public static synchronized zzaqq zza(String str, Context context, boolean z10, boolean z11) {
        zzaqq zzb2;
        synchronized (zzaqq.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z10, z11);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzaqq zzb(String str, Context context, Executor executor, boolean z10, boolean z11) {
        zzaqq zzaqqVar;
        zzarb zzarbVar;
        zzash zzashVar;
        zzarz zzarzVar;
        zzarq zzarqVar;
        synchronized (zzaqq.class) {
            if (zzb == null) {
                zzfld zza = zzfle.zza();
                zza.zza(str);
                zza.zzc(z10);
                zzfle zzd = zza.zzd();
                zzflc zza2 = zzflc.zza(context, executor, z11);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzde)).booleanValue()) {
                    zzarbVar = zzarb.zzc(context);
                } else {
                    zzarbVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdf)).booleanValue()) {
                    zzashVar = zzash.zzd(context, executor);
                } else {
                    zzashVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
                    zzarzVar = new zzarz();
                } else {
                    zzarzVar = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
                    zzarqVar = new zzarq();
                } else {
                    zzarqVar = null;
                }
                zzflv zze = zzflv.zze(context, executor, zza2, zzd);
                zzarr zzarrVar = new zzarr(context);
                zzars zzarsVar = new zzars(zzd, zze, new zzasf(context, zzarrVar), zzarrVar, zzarbVar, zzashVar, zzarzVar, zzarqVar);
                int zzb2 = zzfme.zzb(context, zza2);
                zzfkx zzfkxVar = new zzfkx();
                zzaqq zzaqqVar2 = new zzaqq(context, zza2, new zzfmr(context, zzb2), new zzfmy(context, zzb2, new zzaqn(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcc)).booleanValue()), new zzfna(context, zzarsVar, zza2, zzfkxVar), zzarsVar, executor, zzfkxVar, zzb2, zzashVar, zzarzVar, zzarqVar);
                zzb = zzaqqVar2;
                zzaqqVar2.zzm();
                zzb.zzp();
            }
            zzaqqVar = zzb;
        }
        return zzaqqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzaqq r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqq.zzj(com.google.android.gms.internal.ads.zzaqq):void");
    }

    private final void zzs() {
        zzash zzashVar = this.zzl;
        if (zzashVar != null) {
            zzashVar.zzh();
        }
    }

    private final zzfmq zzt(int i10) {
        if (!zzfme.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzca)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzflf zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzflf zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzflf zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzk(MotionEvent motionEvent) {
        zzflf zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfmz e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfmq zzt = zzt(1);
        if (zzt != null) {
            if (this.zzf.zzc(zzt)) {
                this.zzq = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(WearableStatusCodes.NO_MIGRATION_FOUND_TO_CANCEL, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzarq zzarqVar = this.zzn;
        if (zzarqVar != null) {
            zzarqVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (!this.zzp) {
            synchronized (this.zzo) {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfmq zzb2 = this.zzf.zzb();
                    if ((zzb2 == null || zzb2.zzd(3600L)) && zzfme.zza(this.zzr)) {
                        this.zzi.execute(new zzaqp(this));
                    }
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzl(int i10, int i11, int i12) {
    }
}
