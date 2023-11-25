package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzaco implements zzaca {
    final /* synthetic */ zzacr zza;
    private final long zzb;

    public zzaco(zzacr zzacrVar, long j10) {
        this.zza = zzacrVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j10) {
        zzacu[] zzacuVarArr;
        zzacu[] zzacuVarArr2;
        zzacu[] zzacuVarArr3;
        zzacuVarArr = this.zza.zzg;
        zzaby zza = zzacuVarArr[0].zza(j10);
        int i10 = 1;
        while (true) {
            zzacr zzacrVar = this.zza;
            zzacuVarArr2 = zzacrVar.zzg;
            if (i10 < zzacuVarArr2.length) {
                zzacuVarArr3 = zzacrVar.zzg;
                zzaby zza2 = zzacuVarArr3[i10].zza(j10);
                if (zza2.zza.zzc < zza.zza.zzc) {
                    zza = zza2;
                }
                i10++;
            } else {
                return zza;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
