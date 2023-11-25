package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzps {
    private boolean zzb;
    private zzpu zzd;
    private zzpm zze;
    private zzoj zza = zzoj.zza;
    private final zzpr zzc = zzpr.zza;

    @Deprecated
    public zzps() {
    }

    @Deprecated
    public final zzps zzc(zzoj zzojVar) {
        this.zza = zzojVar;
        return this;
    }

    public final zzps zzd(zzdr[] zzdrVarArr) {
        this.zzd = new zzpu(zzdrVarArr);
        return this;
    }

    public final zzqe zze() {
        zzdy.zzf(!this.zzb);
        this.zzb = true;
        if (this.zzd == null) {
            this.zzd = new zzpu(new zzdr[0]);
        }
        zzqd zzqdVar = null;
        if (this.zze == null) {
            this.zze = new zzpm(null);
        }
        return new zzqe(this, zzqdVar);
    }
}
