package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzki implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzki(zzkj zzkjVar, long j10, long j11) {
        this.zzc = zzkjVar;
        this.zza = j10;
        this.zzb = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkh
            @Override // java.lang.Runnable
            public final void run() {
                zzki zzkiVar = zzki.this;
                zzkj zzkjVar = zzkiVar.zzc;
                long j10 = zzkiVar.zza;
                long j11 = zzkiVar.zzb;
                zzkjVar.zza.zzg();
                zzkjVar.zza.zzt.zzaA().zzc().zza("Application going to the background");
                zzkjVar.zza.zzt.zzm().zzm.zza(true);
                Bundle bundle = new Bundle();
                if (!zzkjVar.zza.zzt.zzf().zzu()) {
                    zzkjVar.zza.zzb.zzb(j11);
                    zzkjVar.zza.zzb.zzd(false, false, j11);
                }
                zzkjVar.zza.zzt.zzq().zzH("auto", "_ab", j10, bundle);
            }
        });
    }
}
