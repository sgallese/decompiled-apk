package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzgc implements Runnable {
    final /* synthetic */ zzhg zza;
    final /* synthetic */ zzgd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgc(zzgd zzgdVar, zzhg zzhgVar) {
        this.zzb = zzgdVar;
        this.zza = zzhgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgd.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
