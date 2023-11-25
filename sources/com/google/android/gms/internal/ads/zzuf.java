package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzuf implements zzxf {
    private final zzxf zza;
    private final zzcy zzb;

    public zzuf(zzxf zzxfVar, zzcy zzcyVar) {
        this.zza = zzxfVar;
        this.zzb = zzcyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuf)) {
            return false;
        }
        zzuf zzufVar = (zzuf) obj;
        if (this.zza.equals(zzufVar.zza) && this.zzb.equals(zzufVar.zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final int zza(int i10) {
        return this.zza.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final int zzb(int i10) {
        return this.zza.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzam zzd(int i10) {
        return this.zza.zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzcy zze() {
        return this.zzb;
    }
}
