package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfqc extends zzfpy {
    final /* synthetic */ zzfqi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqc(zzfqi zzfqiVar) {
        this.zza = zzfqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzfpx zzfpxVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzfpx zzfpxVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            atomicInteger = this.zza.zzl;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.zza.zzl;
                if (atomicInteger2.decrementAndGet() > 0) {
                    zzfpxVar2 = this.zza.zzc;
                    zzfpxVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            zzfqi zzfqiVar = this.zza;
            iInterface = zzfqiVar.zzn;
            if (iInterface != null) {
                zzfpxVar = zzfqiVar.zzc;
                zzfpxVar.zzc("Unbind from service.", new Object[0]);
                zzfqi zzfqiVar2 = this.zza;
                context = zzfqiVar2.zzb;
                serviceConnection = zzfqiVar2.zzm;
                context.unbindService(serviceConnection);
                this.zza.zzh = false;
                this.zza.zzn = null;
                this.zza.zzm = null;
            }
            this.zza.zzw();
        }
    }
}
