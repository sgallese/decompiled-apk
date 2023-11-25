package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzajq implements zzaam {
    private final zzfi zza;
    private final zzfb zzb = new zzfb();
    private final int zzc;

    public zzajq(int i10, zzfi zzfiVar, int i11) {
        this.zzc = i10;
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zza(zzabc zzabcVar, long j10) throws IOException {
        int zza;
        int zza2;
        long j11;
        long zzf = zzabcVar.zzf();
        int min = (int) Math.min(112800L, zzabcVar.zzd() - zzf);
        this.zzb.zzD(min);
        ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, min, false);
        zzfb zzfbVar = this.zzb;
        int zzd = zzfbVar.zzd();
        long j12 = -1;
        long j13 = -9223372036854775807L;
        long j14 = -1;
        while (zzfbVar.zza() >= 188 && (zza2 = (zza = zzakc.zza(zzfbVar.zzI(), zzfbVar.zzc(), zzd)) + 188) <= zzd) {
            long zzb = zzakc.zzb(zzfbVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 > j10) {
                    if (j13 == -9223372036854775807L) {
                        return zzaal.zzd(zzb2, zzf);
                    }
                    j11 = zzf + j14;
                } else if (100000 + zzb2 > j10) {
                    j11 = zzf + zza;
                } else {
                    j14 = zza;
                    j13 = zzb2;
                }
                return zzaal.zze(j11);
            }
            zzfbVar.zzG(zza2);
            j12 = zza2;
        }
        if (j13 != -9223372036854775807L) {
            return zzaal.zzf(j13, zzf + j12);
        }
        return zzaal.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzb() {
        zzfb zzfbVar = this.zzb;
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        zzfbVar.zzE(bArr, 0);
    }
}
