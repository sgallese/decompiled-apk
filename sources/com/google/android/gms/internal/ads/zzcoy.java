package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcoy implements zzauf, zzcxd, com.google.android.gms.ads.internal.overlay.zzo, zzcxc {
    private final zzcot zza;
    private final zzcou zzb;
    private final zzbnu zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcox zzh = new zzcox();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcoy(zzbnr zzbnrVar, zzcou zzcouVar, Executor executor, zzcot zzcotVar, Clock clock) {
        this.zza = zzcotVar;
        zzbnc zzbncVar = zzbnf.zza;
        this.zzd = zzbnrVar.zza("google.afma.activeView.handleUpdate", zzbncVar, zzbncVar);
        this.zzb = zzcouVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcfi) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbL() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final synchronized void zzbn(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbo() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final synchronized void zzbp(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final synchronized void zzbq(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final synchronized void zzbt(zzaue zzaueVar) {
        zzcox zzcoxVar = this.zzh;
        zzcoxVar.zza = zzaueVar.zzj;
        zzcoxVar.zzf = zzaueVar;
        zzg();
    }

    public final synchronized void zzg() {
        if (this.zzj.get() != null) {
            if (!this.zzi && this.zzg.get()) {
                try {
                    this.zzh.zzd = this.zzf.elapsedRealtime();
                    final JSONObject zzb = this.zzb.zzb(this.zzh);
                    for (final zzcfi zzcfiVar : this.zzc) {
                        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcow
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfi.this.zzl("AFMA_updateActiveView", zzb);
                            }
                        });
                    }
                    zzcaq.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
                    return;
                } catch (Exception e10) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e10);
                    return;
                }
            }
            return;
        }
        zzj();
    }

    public final synchronized void zzh(zzcfi zzcfiVar) {
        this.zzc.add(zzcfiVar);
        this.zza.zzd(zzcfiVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzq() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i10) {
    }
}
