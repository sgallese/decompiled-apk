package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzpu {
    private final zzdr[] zza;
    private final zzqm zzb;
    private final zzdu zzc;

    public zzpu(zzdr... zzdrVarArr) {
        zzqm zzqmVar = new zzqm();
        zzdu zzduVar = new zzdu();
        this.zza = r2;
        System.arraycopy(zzdrVarArr, 0, r2, 0, 0);
        this.zzb = zzqmVar;
        this.zzc = zzduVar;
        zzdr[] zzdrVarArr2 = {zzqmVar, zzduVar};
    }

    public final long zza(long j10) {
        return this.zzc.zzi(j10);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzch zzc(zzch zzchVar) {
        this.zzc.zzk(zzchVar.zzc);
        this.zzc.zzj(zzchVar.zzd);
        return zzchVar;
    }

    public final boolean zzd(boolean z10) {
        this.zzb.zzp(z10);
        return z10;
    }

    public final zzdr[] zze() {
        return this.zza;
    }
}
