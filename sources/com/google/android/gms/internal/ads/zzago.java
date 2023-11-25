package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzago implements zzagm {
    private final int zza;
    private final int zzb;
    private final zzfb zzc;

    public zzago(zzagi zzagiVar, zzam zzamVar) {
        zzfb zzfbVar = zzagiVar.zza;
        this.zzc = zzfbVar;
        zzfbVar.zzG(12);
        int zzo = zzfbVar.zzo();
        if ("audio/raw".equals(zzamVar.zzm)) {
            int zzl = zzfk.zzl(zzamVar.zzB, zzamVar.zzz);
            if (zzo == 0 || zzo % zzl != 0) {
                zzes.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzl + ", stsz sample size: " + zzo);
                zzo = zzl;
            }
        }
        this.zza = zzo == 0 ? -1 : zzo;
        this.zzb = zzfbVar.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagm
    public final int zzc() {
        int i10 = this.zza;
        if (i10 == -1) {
            return this.zzc.zzo();
        }
        return i10;
    }
}
