package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzxr {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzxs zzxsVar) {
        zzc(zzxsVar);
        this.zza.add(new zzxq(handler, zzxsVar));
    }

    public final void zzb(final int i10, final long j10, final long j11) {
        boolean z10;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzxq zzxqVar = (zzxq) it.next();
            z10 = zzxqVar.zzc;
            if (!z10) {
                handler = zzxqVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzxs zzxsVar;
                        zzxq zzxqVar2 = zzxq.this;
                        int i11 = i10;
                        long j12 = j10;
                        long j13 = j11;
                        zzxsVar = zzxqVar2.zzb;
                        zzxsVar.zzV(i11, j12, j13);
                    }
                });
            }
        }
    }

    public final void zzc(zzxs zzxsVar) {
        zzxs zzxsVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzxq zzxqVar = (zzxq) it.next();
            zzxsVar2 = zzxqVar.zzb;
            if (zzxsVar2 == zzxsVar) {
                zzxqVar.zzc();
                this.zza.remove(zzxqVar);
            }
        }
    }
}
