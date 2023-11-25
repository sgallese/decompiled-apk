package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfg implements zzej {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfg(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzff zzffVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzffVar);
            }
        }
    }

    private static zzff zzm() {
        zzff zzffVar;
        List list = zza;
        synchronized (list) {
            if (list.isEmpty()) {
                zzffVar = new zzff(null);
            } else {
                zzffVar = (zzff) list.remove(list.size() - 1);
            }
        }
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final zzei zzb(int i10) {
        zzff zzm = zzm();
        zzm.zzb(this.zzb.obtainMessage(i10), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final zzei zzc(int i10, Object obj) {
        zzff zzm = zzm();
        zzm.zzb(this.zzb.obtainMessage(i10, obj), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final zzei zzd(int i10, int i11, int i12) {
        zzff zzm = zzm();
        zzm.zzb(this.zzb.obtainMessage(1, i11, i12), this);
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final void zze(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final void zzf(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final boolean zzg(int i10) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final boolean zzi(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final boolean zzj(int i10, long j10) {
        return this.zzb.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzej
    public final boolean zzk(zzei zzeiVar) {
        return ((zzff) zzeiVar).zzc(this.zzb);
    }
}
