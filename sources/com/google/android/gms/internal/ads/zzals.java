package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzals {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzakz zze;
    private final zzali zzf;
    private final zzalj[] zzg;
    private zzalb zzh;
    private final List zzi;
    private final List zzj;
    private final zzalg zzk;

    public zzals(zzakz zzakzVar, zzali zzaliVar, int i10) {
        zzalg zzalgVar = new zzalg(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzakzVar;
        this.zzf = zzaliVar;
        this.zzg = new zzalj[4];
        this.zzk = zzalgVar;
    }

    public final zzalp zza(zzalp zzalpVar) {
        zzalpVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzalpVar);
        }
        zzalpVar.zzg(this.zza.incrementAndGet());
        zzalpVar.zzm("add-to-queue");
        zzc(zzalpVar, 0);
        this.zzc.add(zzalpVar);
        return zzalpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzalp zzalpVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzalpVar);
        }
        synchronized (this.zzi) {
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((zzalr) it.next()).zza();
            }
        }
        zzc(zzalpVar, 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzalp zzalpVar, int i10) {
        synchronized (this.zzj) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzalq) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        zzalb zzalbVar = this.zzh;
        if (zzalbVar != null) {
            zzalbVar.zzb();
        }
        zzalj[] zzaljVarArr = this.zzg;
        for (int i10 = 0; i10 < 4; i10++) {
            zzalj zzaljVar = zzaljVarArr[i10];
            if (zzaljVar != null) {
                zzaljVar.zza();
            }
        }
        zzalb zzalbVar2 = new zzalb(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzalbVar2;
        zzalbVar2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            zzalj zzaljVar2 = new zzalj(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i11] = zzaljVar2;
            zzaljVar2.start();
        }
    }
}
