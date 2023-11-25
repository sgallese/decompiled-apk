package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcon implements zzcwi, zzcxw, zzcxc, com.google.android.gms.ads.internal.client.zza, zzcwy {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfbr zze;
    private final zzfbe zzf;
    private final zzfig zzg;
    private final zzfck zzh;
    private final zzaqx zzi;
    private final zzbct zzj;
    private final zzfhr zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzcvk zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbcv zzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcon(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfbr zzfbrVar, zzfbe zzfbeVar, zzfig zzfigVar, zzfck zzfckVar, View view, zzcfi zzcfiVar, zzaqx zzaqxVar, zzbct zzbctVar, zzbcv zzbcvVar, zzfhr zzfhrVar, zzcvk zzcvkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfbrVar;
        this.zzf = zzfbeVar;
        this.zzg = zzfigVar;
        this.zzh = zzfckVar;
        this.zzi = zzaqxVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcfiVar);
        this.zzj = zzbctVar;
        this.zzq = zzbcvVar;
        this.zzk = zzfhrVar;
        this.zzn = zzcvkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs() {
        String str;
        int i10;
        List list;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzks)).booleanValue() && ((list = this.zzf.zzd) == null || list.isEmpty())) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdl)).booleanValue()) {
            str = this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbdj.zzh.zze()).booleanValue()) {
            zzfck zzfckVar = this.zzh;
            zzfig zzfigVar = this.zzg;
            zzfbr zzfbrVar = this.zze;
            zzfbe zzfbeVar = this.zzf;
            zzfckVar.zza(zzfigVar.zzd(zzfbrVar, zzfbeVar, false, str, null, zzfbeVar.zzd));
            return;
        }
        if (((Boolean) zzbdj.zzg.zze()).booleanValue() && ((i10 = this.zzf.zzb) == 1 || i10 == 2 || i10 == 5)) {
            zzcfi zzcfiVar = (zzcfi) this.zzm.get();
        }
        zzfye.zzr((zzfxv) zzfye.zzo(zzfxv.zzu(zzfye.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaT)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcom(this, str), this.zzb);
    }

    private final void zzt(final int i10, final int i11) {
        View view;
        if (i10 > 0 && ((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcog
                @Override // java.lang.Runnable
                public final void run() {
                    zzcon.this.zzo(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        } else {
            zzs();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzao)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbdj.zzd.zze()).booleanValue()) {
            zzfye.zzr(zzfye.zze(zzfxv.zzu(this.zzj.zza()), Throwable.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzcoh
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, zzcan.zzf), new zzcol(this), this.zzb);
            return;
        }
        zzfck zzfckVar = this.zzh;
        zzfig zzfigVar = this.zzg;
        zzfbr zzfbrVar = this.zze;
        zzfbe zzfbeVar = this.zzf;
        List zzc = zzfigVar.zzc(zzfbrVar, zzfbeVar, zzfbeVar.zzc);
        int i10 = 1;
        if (true == com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza)) {
            i10 = 2;
        }
        zzfckVar.zzc(zzc, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvdVar, String str, String str2) {
        zzfck zzfckVar = this.zzh;
        zzfig zzfigVar = this.zzg;
        zzfbe zzfbeVar = this.zzf;
        zzfckVar.zza(zzfigVar.zze(zzfbeVar, zzfbeVar.zzi, zzbvdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        zzfck zzfckVar = this.zzh;
        zzfig zzfigVar = this.zzg;
        zzfbr zzfbrVar = this.zze;
        zzfbe zzfbeVar = this.zzf;
        zzfckVar.zza(zzfigVar.zzc(zzfbrVar, zzfbeVar, zzfbeVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        zzfck zzfckVar = this.zzh;
        zzfig zzfigVar = this.zzg;
        zzfbr zzfbrVar = this.zze;
        zzfbe zzfbeVar = this.zzf;
        zzfckVar.zza(zzfigVar.zzc(zzfbrVar, zzfbeVar, zzfbeVar.zzh));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcok
            @Override // java.lang.Runnable
            public final void run() {
                zzcon.this.zzs();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(int i10, int i11) {
        zzt(i10 - 1, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(final int i10, final int i11) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoi
            @Override // java.lang.Runnable
            public final void run() {
                zzcon.this.zzn(i10, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbs)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfig.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (!this.zzp.compareAndSet(false, true)) {
            return;
        }
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdu)).intValue();
        if (intValue > 0) {
            zzt(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdv)).intValue());
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdt)).booleanValue()) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoj
                @Override // java.lang.Runnable
                public final void run() {
                    zzcon.this.zzm();
                }
            });
        } else {
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zzr() {
        zzcvk zzcvkVar;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfck zzfckVar = this.zzh;
            zzfig zzfigVar = this.zzg;
            zzfbr zzfbrVar = this.zze;
            zzfbe zzfbeVar = this.zzf;
            zzfckVar.zza(zzfigVar.zzc(zzfbrVar, zzfbeVar, zzfbeVar.zzn));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdq)).booleanValue() && (zzcvkVar = this.zzn) != null) {
                this.zzh.zza(this.zzg.zzc(this.zzn.zzc(), this.zzn.zzb(), zzfig.zzg(zzcvkVar.zzb().zzn, zzcvkVar.zza().zzf())));
            }
            zzfck zzfckVar2 = this.zzh;
            zzfig zzfigVar2 = this.zzg;
            zzfbr zzfbrVar2 = this.zze;
            zzfbe zzfbeVar2 = this.zzf;
            zzfckVar2.zza(zzfigVar2.zzc(zzfbrVar2, zzfbeVar2, zzfbeVar2.zzg));
        }
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
    }
}
