package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzamc implements zzalo {
    private final Map zza = new HashMap();
    private final zzalb zzb;
    private final BlockingQueue zzc;
    private final zzalg zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamc(zzalb zzalbVar, BlockingQueue blockingQueue, zzalg zzalgVar) {
        this.zzd = zzalgVar;
        this.zzb = zzalbVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzalo
    public final synchronized void zza(zzalp zzalpVar) {
        String zzj = zzalpVar.zzj();
        List list = (List) this.zza.remove(zzj);
        if (list != null && !list.isEmpty()) {
            if (zzamb.zzb) {
                zzamb.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
            }
            zzalp zzalpVar2 = (zzalp) list.remove(0);
            this.zza.put(zzj, list);
            zzalpVar2.zzu(this);
            try {
                this.zzc.put(zzalpVar2);
            } catch (InterruptedException e10) {
                zzamb.zzb("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalo
    public final void zzb(zzalp zzalpVar, zzalv zzalvVar) {
        List list;
        zzaky zzakyVar = zzalvVar.zzb;
        if (zzakyVar != null && !zzakyVar.zza(System.currentTimeMillis())) {
            String zzj = zzalpVar.zzj();
            synchronized (this) {
                list = (List) this.zza.remove(zzj);
            }
            if (list != null) {
                if (zzamb.zzb) {
                    zzamb.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzd.zzb((zzalp) it.next(), zzalvVar, null);
                }
                return;
            }
            return;
        }
        zza(zzalpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzc(zzalp zzalpVar) {
        String zzj = zzalpVar.zzj();
        if (this.zza.containsKey(zzj)) {
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzalpVar.zzm("waiting-for-response");
            list.add(zzalpVar);
            this.zza.put(zzj, list);
            if (zzamb.zzb) {
                zzamb.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        }
        this.zza.put(zzj, null);
        zzalpVar.zzu(this);
        if (zzamb.zzb) {
            zzamb.zza("new request, sending to network %s", zzj);
        }
        return false;
    }
}
