package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzakl {
    public static Pair zza(zzabc zzabcVar) throws IOException {
        zzabcVar.zzj();
        zzakk zzd = zzd(1684108385, zzabcVar, new zzfb(8));
        ((zzaar) zzabcVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzabcVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzakj zzb(zzabc zzabcVar) throws IOException {
        boolean z10;
        byte[] bArr;
        zzfb zzfbVar = new zzfb(16);
        zzakk zzd = zzd(1718449184, zzabcVar, zzfbVar);
        if (zzd.zzb >= 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzf(z10);
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzm(zzfbVar.zzI(), 0, 16, false);
        zzfbVar.zzG(0);
        int zzj = zzfbVar.zzj();
        int zzj2 = zzfbVar.zzj();
        int zzi = zzfbVar.zzi();
        int zzi2 = zzfbVar.zzi();
        int zzj3 = zzfbVar.zzj();
        int zzj4 = zzfbVar.zzj();
        int i10 = ((int) zzd.zzb) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            zzaarVar.zzm(bArr, 0, i10, false);
        } else {
            bArr = zzfk.zzf;
        }
        byte[] bArr2 = bArr;
        ((zzaar) zzabcVar).zzo((int) (zzabcVar.zze() - zzabcVar.zzf()), false);
        return new zzakj(zzj, zzj2, zzi, zzi2, zzj3, zzj4, bArr2);
    }

    public static boolean zzc(zzabc zzabcVar) throws IOException {
        zzfb zzfbVar = new zzfb(8);
        int i10 = zzakk.zza(zzabcVar, zzfbVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ((zzaar) zzabcVar).zzm(zzfbVar.zzI(), 0, 4, false);
        zzfbVar.zzG(0);
        int zzf = zzfbVar.zzf();
        if (zzf != 1463899717) {
            zzes.zzc("WavHeaderReader", "Unsupported form type: " + zzf);
            return false;
        }
        return true;
    }

    private static zzakk zzd(int i10, zzabc zzabcVar, zzfb zzfbVar) throws IOException {
        zzakk zza = zzakk.zza(zzabcVar, zzfbVar);
        while (true) {
            int i11 = zza.zza;
            if (i11 != i10) {
                zzes.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i11);
                long j10 = zza.zzb + 8;
                if (j10 <= 2147483647L) {
                    ((zzaar) zzabcVar).zzo((int) j10, false);
                    zza = zzakk.zza(zzabcVar, zzfbVar);
                } else {
                    throw zzcd.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
                }
            } else {
                return zza;
            }
        }
    }
}
