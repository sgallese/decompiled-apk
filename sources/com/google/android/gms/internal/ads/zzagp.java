package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzagp implements zzagm {
    private final zzfb zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzagp(zzagi zzagiVar) {
        zzfb zzfbVar = zzagiVar.zza;
        this.zza = zzfbVar;
        zzfbVar.zzG(12);
        this.zzc = zzfbVar.zzo() & 255;
        this.zzb = zzfbVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zzc() {
        int i10 = this.zzc;
        if (i10 == 8) {
            return this.zza.zzl();
        }
        if (i10 == 16) {
            return this.zza.zzp();
        }
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        if (i11 % 2 == 0) {
            int zzl = this.zza.zzl();
            this.zze = zzl;
            return (zzl & 240) >> 4;
        }
        return this.zze & 15;
    }
}
