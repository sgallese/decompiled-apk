package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzauw implements Runnable {
    final /* synthetic */ zzaux zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauw(zzaux zzauxVar) {
        this.zza = zzauxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        boolean z11;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzaux zzauxVar = this.zza;
            z10 = zzauxVar.zzd;
            if (z10) {
                z11 = zzauxVar.zze;
                if (z11) {
                    zzauxVar.zzd = false;
                    zzcaa.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzauy) it.next()).zza(false);
                        } catch (Exception e10) {
                            zzcaa.zzh("", e10);
                        }
                    }
                }
            }
            zzcaa.zze("App is still foreground");
        }
    }
}
