package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zztc implements zzvl {
    protected final zzvl[] zza;

    public zztc(zzvl[] zzvlVarArr) {
        this.zza = zzvlVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        long j10 = Long.MAX_VALUE;
        for (zzvl zzvlVar : this.zza) {
            long zzb = zzvlVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        long j10 = Long.MAX_VALUE;
        for (zzvl zzvlVar : this.zza) {
            long zzc = zzvlVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzc);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzm(long j10) {
        for (zzvl zzvlVar : this.zza) {
            zzvlVar.zzm(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (zzvl zzvlVar : this.zza) {
                long zzc2 = zzvlVar.zzc();
                if (zzc2 != Long.MIN_VALUE && zzc2 <= j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (zzc2 == zzc || z11) {
                    z10 |= zzvlVar.zzo(j10);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        for (zzvl zzvlVar : this.zza) {
            if (zzvlVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
