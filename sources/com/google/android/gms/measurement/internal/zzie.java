package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzqr;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzie implements Runnable {
    final /* synthetic */ zzai zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzai zze;
    final /* synthetic */ zzii zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzie(zzii zziiVar, zzai zzaiVar, int i10, long j10, boolean z10, zzai zzaiVar2) {
        this.zzf = zziiVar;
        this.zza = zzaiVar;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = z10;
        this.zze = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzV(this.zza);
        zzii.zzw(this.zzf, this.zza, this.zzb, this.zzc, false, this.zzd);
        zzqr.zzc();
        if (this.zzf.zzt.zzf().zzs(null, zzeg.zzan)) {
            zzii.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
