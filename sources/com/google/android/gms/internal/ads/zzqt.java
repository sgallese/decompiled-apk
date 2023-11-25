package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzqt {
    public final int zza;
    public final zzts zzb;
    private final CopyOnWriteArrayList zzc;

    private zzqt(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzts zztsVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztsVar;
    }

    public final zzqt zza(int i10, zzts zztsVar) {
        return new zzqt(this.zzc, 0, zztsVar);
    }

    public final void zzb(Handler handler, zzqu zzquVar) {
        this.zzc.add(new zzqs(handler, zzquVar));
    }

    public final void zzc(zzqu zzquVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzqs zzqsVar = (zzqs) it.next();
            if (zzqsVar.zzb == zzquVar) {
                this.zzc.remove(zzqsVar);
            }
        }
    }

    public zzqt() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
