package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzabl {
    public static zzbz zza(zzabc zzabcVar, boolean z10) throws IOException {
        zzaep zzaepVar;
        if (z10) {
            zzaepVar = null;
        } else {
            zzaepVar = zzaer.zza;
        }
        zzbz zza = new zzabs().zza(zzabcVar, zzaepVar);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzabn zzb(zzfb zzfbVar) {
        zzfbVar.zzH(1);
        int zzn = zzfbVar.zzn();
        long zzc = zzfbVar.zzc();
        long j10 = zzn;
        int i10 = zzn / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long zzs = zzfbVar.zzs();
            if (zzs == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = zzs;
            jArr2[i11] = zzfbVar.zzs();
            zzfbVar.zzH(2);
            i11++;
        }
        zzfbVar.zzH((int) ((zzc + j10) - zzfbVar.zzc()));
        return new zzabn(jArr, jArr2);
    }
}
