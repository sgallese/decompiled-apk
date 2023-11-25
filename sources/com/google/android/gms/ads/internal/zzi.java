package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzflc;
import com.google.android.gms.internal.ads.zzfme;
import com.google.android.gms.internal.ads.zzfmy;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzi implements Runnable, zzaqt {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzflc zzi;
    private Context zzj;
    private final Context zzk;
    private zzcag zzl;
    private final zzcag zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzi(Context context, zzcag zzcagVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzcagVar;
        this.zzm = zzcagVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbbr.zzcf)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzflc.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbbr.zzcb)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zzb(zzbbr.zzcg)).booleanValue();
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzce)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzdi)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzdb)).booleanValue()) {
            zzcan.zza.execute(this);
            return;
        }
        zzay.zzb();
        if (zzbzt.zzu()) {
            zzcan.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzaqt zzj() {
        if (zzi() == 2) {
            return (zzaqt) this.zze.get();
        }
        return (zzaqt) this.zzd.get();
    }

    private final void zzm() {
        zzaqt zzj = zzj();
        if (!this.zzc.isEmpty() && zzj != null) {
            for (Object[] objArr : this.zzc) {
                int length = objArr.length;
                if (length == 1) {
                    zzj.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzj.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzp(boolean z10) {
        this.zzd.set(zzaqw.zzu(this.zzl.zza, zzq(this.zzj), z10, this.zzo));
    }

    private static final Context zzq(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.google.android.gms.internal.ads.zzcag] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zzb(zzbbr.zzdi)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z10 = this.zzl.zzd;
            final boolean z11 = false;
            if (!((Boolean) zzba.zzc().zzb(zzbbr.zzaU)).booleanValue() && z10) {
                z11 = true;
            }
            if (zzi() == 1) {
                zzp(z11);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi.this.zzb(z11);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzaqq zza = zzaqq.zza(this.zzl.zza, zzq(this.zzj), z11, this.zzn);
                    this.zze.set(zza);
                    if (this.zzg && !zza.zzr()) {
                        this.zzo = 1;
                        zzp(z11);
                    }
                } catch (NullPointerException e10) {
                    this.zzo = 1;
                    zzp(z11);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e10);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzaqq.zza(this.zzm.zza, zzq(this.zzk), z10, this.zzn).zzp();
        } catch (NullPointerException e10) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e10);
        }
    }

    protected final boolean zzc() {
        Context context = this.zzj;
        zzflc zzflcVar = this.zzi;
        zzh zzhVar = new zzh(this);
        return new zzfmy(this.zzj, zzfme.zzb(context, zzflcVar), zzhVar, ((Boolean) zzba.zzc().zzb(zzbbr.zzcc)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e10) {
            zzcaa.zzk("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zzd()) {
            zzaqt zzj = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbbr.zzjG)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzG(view, 4, null);
            }
            if (zzj != null) {
                zzm();
                return zzj.zzf(zzq(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzg(Context context) {
        zzaqt zzj;
        if (zzd() && (zzj = zzj()) != null) {
            zzm();
            return zzj.zzg(zzq(context));
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzjF)).booleanValue()) {
            if (zzd()) {
                zzaqt zzj = zzj();
                if (((Boolean) zzba.zzc().zzb(zzbbr.zzjG)).booleanValue()) {
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzG(view, 2, null);
                }
                if (zzj != null) {
                    return zzj.zzh(context, view, activity);
                }
                return "";
            }
            return "";
        }
        zzaqt zzj2 = zzj();
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzjG)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzG(view, 2, null);
        }
        if (zzj2 != null) {
            return zzj2.zzh(context, view, activity);
        }
        return "";
    }

    protected final int zzi() {
        if (this.zzf && !this.zza) {
            return 1;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzk(MotionEvent motionEvent) {
        zzaqt zzj = zzj();
        if (zzj != null) {
            zzm();
            zzj.zzk(motionEvent);
            return;
        }
        this.zzc.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzl(int i10, int i11, int i12) {
        zzaqt zzj = zzj();
        if (zzj != null) {
            zzm();
            zzj.zzl(i10, i11, i12);
            return;
        }
        this.zzc.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaqt zzj;
        if (zzd() && (zzj = zzj()) != null) {
            zzj.zzn(stackTraceElementArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzo(View view) {
        zzaqt zzj = zzj();
        if (zzj != null) {
            zzj.zzo(view);
        }
    }
}
