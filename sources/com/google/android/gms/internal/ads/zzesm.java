package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzesm {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhr zzd;
    private final zzdrh zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzesm(Context context, Executor executor, Set set, zzfhr zzfhrVar, zzdrh zzdrhVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhrVar;
        this.zze = zzdrhVar;
    }

    public final com.google.common.util.concurrent.a zza(final Object obj) {
        zzfhg zza = zzfhf.zza(this.zza, 8);
        zza.zzh();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        zzbbj zzbbjVar = zzbbr.zzkz;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        for (final zzesj zzesjVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzesjVar.zza()))) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                com.google.common.util.concurrent.a zzb = zzesjVar.zzb();
                zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzesm.this.zzb(elapsedRealtime, zzesjVar);
                    }
                }, zzcan.zzf);
                arrayList.add(zzb);
            }
        }
        com.google.common.util.concurrent.a zza2 = zzfye.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzesl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                Object obj2 = obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzesi zzesiVar = (zzesi) ((com.google.common.util.concurrent.a) it.next()).get();
                    if (zzesiVar != null) {
                        zzesiVar.zzj(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfhu.zza()) {
            zzfhq.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    public final void zzb(long j10, zzesj zzesjVar) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j10;
        if (((Boolean) zzbdn.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfrx.zzc(zzesjVar.getClass().getCanonicalName()) + " = " + elapsedRealtime);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbX)).booleanValue()) {
            return;
        }
        zzdrg zza = this.zze.zza();
        zza.zzb("action", "lat_ms");
        zza.zzb("lat_grp", "sig_lat_grp");
        zza.zzb("lat_id", String.valueOf(zzesjVar.zza()));
        zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbY)).booleanValue()) {
            synchronized (this) {
                this.zzg++;
            }
            zza.zzb("seq_num", com.google.android.gms.ads.internal.zzt.zzo().zzg().zzd());
            synchronized (this) {
                if (this.zzg == this.zzb.size() && this.zzf != 0) {
                    this.zzg = 0;
                    String valueOf = String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzf);
                    if (zzesjVar.zza() > 39 && zzesjVar.zza() < 52) {
                        zza.zzb("lat_gmssg", valueOf);
                    } else {
                        zza.zzb("lat_clsg", valueOf);
                    }
                }
            }
        }
        zza.zzh();
    }
}
