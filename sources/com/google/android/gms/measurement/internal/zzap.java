package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public abstract class zzap {
    private static volatile Handler zza;
    private final zzgy zzb;
    private final Runnable zzc;
    private volatile long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(zzgy zzgyVar) {
        Preconditions.checkNotNull(zzgyVar);
        this.zzb = zzgyVar;
        this.zzc = new zzao(this, zzgyVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzap.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzaw().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j10) {
        zzb();
        if (j10 >= 0) {
            this.zzd = this.zzb.zzax().currentTimeMillis();
            if (!zzf().postDelayed(this.zzc, j10)) {
                this.zzb.zzaA().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public final boolean zze() {
        if (this.zzd != 0) {
            return true;
        }
        return false;
    }
}
