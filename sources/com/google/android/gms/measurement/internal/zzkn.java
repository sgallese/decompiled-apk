package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzkn extends zzf {
    protected final zzkm zza;
    protected final zzkl zzb;
    protected final zzkj zzc;
    private Handler zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkn(zzgd zzgdVar) {
        super(zzgdVar);
        this.zza = new zzkm(this);
        this.zzb = new zzkl(this);
        this.zzc = new zzkj(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzj(zzkn zzknVar, long j10) {
        zzknVar.zzg();
        zzknVar.zzm();
        zzknVar.zzt.zzaA().zzj().zzb("Activity paused, time", Long.valueOf(j10));
        zzknVar.zzc.zza(j10);
        if (zzknVar.zzt.zzf().zzu()) {
            zzknVar.zzb.zzb(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzl(zzkn zzknVar, long j10) {
        zzknVar.zzg();
        zzknVar.zzm();
        zzknVar.zzt.zzaA().zzj().zzb("Activity resumed, time", Long.valueOf(j10));
        if (zzknVar.zzt.zzf().zzu() || zzknVar.zzt.zzm().zzm.zzb()) {
            zzknVar.zzb.zzc(j10);
        }
        zzknVar.zzc.zzb();
        zzkm zzkmVar = zzknVar.zza;
        zzkmVar.zza.zzg();
        if (!zzkmVar.zza.zzt.zzJ()) {
            return;
        }
        zzkmVar.zzb(zzkmVar.zza.zzt.zzax().currentTimeMillis(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }
}
