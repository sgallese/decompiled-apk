package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcss {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final com.google.common.util.concurrent.a zzc;
    private volatile boolean zzd = true;

    public zzcss(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.a aVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(final zzcss zzcssVar, List list, final zzfya zzfyaVar) {
        if (list != null && !list.isEmpty()) {
            com.google.common.util.concurrent.a zzh = zzfye.zzh(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.google.common.util.concurrent.a aVar = (com.google.common.util.concurrent.a) it.next();
                zzh = zzfye.zzn(zzfye.zzf(zzh, Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcsn
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final com.google.common.util.concurrent.a zza(Object obj) {
                        zzfya.this.zza((Throwable) obj);
                        return zzfye.zzh(null);
                    }
                }, zzcssVar.zza), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzcso
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final com.google.common.util.concurrent.a zza(Object obj) {
                        return zzcss.this.zza(zzfyaVar, aVar, (zzcse) obj);
                    }
                }, zzcssVar.zza);
            }
            zzfye.zzr(zzh, new zzcsr(zzcssVar, zzfyaVar), zzcssVar.zza);
            return;
        }
        zzcssVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsm
            @Override // java.lang.Runnable
            public final void run() {
                zzfya.this.zza(new zzdve(3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zza(zzfya zzfyaVar, com.google.common.util.concurrent.a aVar, zzcse zzcseVar) throws Exception {
        if (zzcseVar != null) {
            zzfyaVar.zzb(zzcseVar);
        }
        return zzfye.zzo(aVar, ((Long) zzbdw.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfya zzfyaVar) {
        zzfye.zzr(this.zzc, new zzcsq(this, zzfyaVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
