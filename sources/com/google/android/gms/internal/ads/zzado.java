package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzado extends zzabp {
    private final long zza;

    public zzado(zzabc zzabcVar, long j10) {
        super(zzabcVar);
        boolean z10;
        if (zzabcVar.zzf() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzd(z10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzabp, com.google.android.gms.internal.ads.zzabc
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabp, com.google.android.gms.internal.ads.zzabc
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabp, com.google.android.gms.internal.ads.zzabc
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
