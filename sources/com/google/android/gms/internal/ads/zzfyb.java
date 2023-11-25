package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfyb implements Runnable {
    final Future zza;
    final zzfya zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyb(Future future, zzfya zzfyaVar) {
        this.zza = future;
        this.zzb = zzfyaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzfzg) && (zza = zzfzh.zza((zzfzg) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzfye.zzp(this.zza));
        } catch (Error e10) {
            e = e10;
            this.zzb.zza(e);
        } catch (RuntimeException e11) {
            e = e11;
            this.zzb.zza(e);
        } catch (ExecutionException e12) {
            this.zzb.zza(e12.getCause());
        }
    }

    public final String toString() {
        zzfrb zza = zzfrc.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
