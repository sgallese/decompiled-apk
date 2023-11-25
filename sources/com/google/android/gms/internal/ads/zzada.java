package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzada implements zzaam {
    private final zzabo zza;
    private final int zzb;
    private final zzabj zzc = new zzabj();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzada(zzabo zzaboVar, int i10, zzacz zzaczVar) {
        this.zza = zzaboVar;
        this.zzb = i10;
    }

    private final long zzc(zzabc zzabcVar) throws IOException {
        while (zzabcVar.zze() < zzabcVar.zzd() - 6) {
            zzabo zzaboVar = this.zza;
            int i10 = this.zzb;
            zzabj zzabjVar = this.zzc;
            long zze = zzabcVar.zze();
            byte[] bArr = new byte[2];
            zzaar zzaarVar = (zzaar) zzabcVar;
            zzaarVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                zzabcVar.zzj();
                zzaarVar.zzl((int) (zze - zzabcVar.zzf()), false);
            } else {
                zzfb zzfbVar = new zzfb(16);
                System.arraycopy(bArr, 0, zzfbVar.zzI(), 0, 2);
                zzfbVar.zzF(zzabf.zza(zzabcVar, zzfbVar.zzI(), 2, 14));
                zzabcVar.zzj();
                zzaarVar.zzl((int) (zze - zzabcVar.zzf()), false);
                if (zzabk.zzc(zzfbVar, zzaboVar, i10, zzabjVar)) {
                    break;
                }
            }
            zzaarVar.zzl(1, false);
        }
        if (zzabcVar.zze() >= zzabcVar.zzd() - 6) {
            ((zzaar) zzabcVar).zzl((int) (zzabcVar.zzd() - zzabcVar.zze()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zza(zzabc zzabcVar, long j10) throws IOException {
        long zzf = zzabcVar.zzf();
        long zzc = zzc(zzabcVar);
        long zze = zzabcVar.zze();
        ((zzaar) zzabcVar).zzl(Math.max(6, this.zza.zzc), false);
        long zzc2 = zzc(zzabcVar);
        long zze2 = zzabcVar.zze();
        if (zzc <= j10 && zzc2 > j10) {
            return zzaal.zze(zze);
        }
        if (zzc2 <= j10) {
            return zzaal.zzf(zzc2, zze2);
        }
        return zzaal.zzd(zzc, zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final /* synthetic */ void zzb() {
    }
}
