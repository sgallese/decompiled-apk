package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzkj {
    final /* synthetic */ zzkn zza;
    private zzki zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkj(zzkn zzknVar) {
        this.zza = zzknVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j10) {
        Handler handler;
        this.zzb = new zzki(this, this.zza.zzt.zzax().currentTimeMillis(), j10);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzki zzkiVar = this.zzb;
        if (zzkiVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzkiVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
