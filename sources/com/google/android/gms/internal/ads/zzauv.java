package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzauv {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzauu zza(boolean z10) {
        int i10;
        synchronized (this.zzb) {
            zzauu zzauuVar = null;
            if (this.zzc.isEmpty()) {
                zzcaa.zze("Queue empty");
                return null;
            }
            int i11 = 0;
            if (this.zzc.size() >= 2) {
                int i12 = RecyclerView.UNDEFINED_DURATION;
                int i13 = 0;
                for (zzauu zzauuVar2 : this.zzc) {
                    int zzb = zzauuVar2.zzb();
                    if (zzb > i12) {
                        i11 = i13;
                    }
                    if (zzb > i12) {
                        i10 = zzb;
                    } else {
                        i10 = i12;
                    }
                    if (zzb > i12) {
                        zzauuVar = zzauuVar2;
                    }
                    i13++;
                    i12 = i10;
                }
                this.zzc.remove(i11);
                return zzauuVar;
            }
            zzauu zzauuVar3 = (zzauu) this.zzc.get(0);
            if (z10) {
                this.zzc.remove(0);
            } else {
                zzauuVar3.zzi();
            }
            return zzauuVar3;
        }
    }

    public final void zzb(zzauu zzauuVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                zzcaa.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i10 = this.zza;
            this.zza = i10 + 1;
            zzauuVar.zzj(i10);
            zzauuVar.zzn();
            this.zzc.add(zzauuVar);
        }
    }

    public final boolean zzc(zzauu zzauuVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzauu zzauuVar2 = (zzauu) it.next();
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                    if (!zzauuVar.equals(zzauuVar2) && zzauuVar2.zzd().equals(zzauuVar.zzd())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO() && !zzauuVar.equals(zzauuVar2) && zzauuVar2.zzf().equals(zzauuVar.zzf())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzauu zzauuVar) {
        synchronized (this.zzb) {
            if (this.zzc.contains(zzauuVar)) {
                return true;
            }
            return false;
        }
    }
}
