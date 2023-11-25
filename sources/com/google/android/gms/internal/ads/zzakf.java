package com.google.android.gms.internal.ads;

import okhttp3.internal.http.StatusLine;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzakf implements zzakg {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzabe zzc;
    private final zzace zzd;
    private final zzakj zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfb zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzakf(zzabe zzabeVar, zzace zzaceVar, zzakj zzakjVar) throws zzcd {
        this.zzc = zzabeVar;
        this.zzd = zzaceVar;
        this.zze = zzakjVar;
        int max = Math.max(1, zzakjVar.zzc / 10);
        this.zzi = max;
        zzfb zzfbVar = new zzfb(zzakjVar.zzf);
        zzfbVar.zzj();
        int zzj = zzfbVar.zzj();
        this.zzf = zzj;
        int i10 = zzakjVar.zzb;
        int i11 = zzakjVar.zzd;
        int i12 = (((i11 - (i10 * 4)) * 8) / (zzakjVar.zze * i10)) + 1;
        if (zzj == i12) {
            int i13 = zzfk.zza;
            int i14 = ((max + zzj) - 1) / zzj;
            this.zzg = new byte[i11 * i14];
            this.zzh = new zzfb(i14 * (zzj + zzj) * i10);
            int i15 = ((zzakjVar.zzc * zzakjVar.zzd) * 8) / zzj;
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/raw");
            zzakVar.zzv(i15);
            zzakVar.zzO(i15);
            zzakVar.zzL((max + max) * i10);
            zzakVar.zzw(zzakjVar.zzb);
            zzakVar.zzT(zzakjVar.zzc);
            zzakVar.zzN(2);
            this.zzj = zzakVar.zzY();
            return;
        }
        throw zzcd.zza("Expected frames per block: " + i12 + "; got: " + zzj, null);
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long zzq = this.zzl + zzfk.zzq(this.zzn, 1000000L, this.zze.zzc);
        int zze = zze(i10);
        this.zzd.zzs(zzq, 1, zze, this.zzm - zze, null);
        this.zzn += i10;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zza(int i10, long j10) {
        this.zzc.zzN(new zzakm(this.zze, this.zzf, i10, j10));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzb(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzakg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzabc r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakf.zzc(com.google.android.gms.internal.ads.zzabc, long):boolean");
    }
}
