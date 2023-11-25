package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzakh implements zzakg {
    private final zzabe zza;
    private final zzace zzb;
    private final zzakj zzc;
    private final zzam zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzakh(zzabe zzabeVar, zzace zzaceVar, zzakj zzakjVar, String str, int i10) throws zzcd {
        this.zza = zzabeVar;
        this.zzb = zzaceVar;
        this.zzc = zzakjVar;
        int i11 = zzakjVar.zzb * zzakjVar.zze;
        int i12 = zzakjVar.zzd;
        int i13 = i11 / 8;
        if (i12 == i13) {
            int i14 = zzakjVar.zzc * i13;
            int i15 = i14 * 8;
            int max = Math.max(i13, i14 / 10);
            this.zze = max;
            zzak zzakVar = new zzak();
            zzakVar.zzS(str);
            zzakVar.zzv(i15);
            zzakVar.zzO(i15);
            zzakVar.zzL(max);
            zzakVar.zzw(zzakjVar.zzb);
            zzakVar.zzT(zzakjVar.zzc);
            zzakVar.zzN(i10);
            this.zzd = zzakVar.zzY();
            return;
        }
        throw zzcd.zza("Expected block size: " + i13 + "; got: " + i12, null);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zza(int i10, long j10) {
        this.zza.zzN(new zzakm(this.zzc, 1, i10, j10));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final void zzb(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final boolean zzc(zzabc zzabcVar, long j10) throws IOException {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.zzg) < (i11 = this.zze)) {
            int zza = zzacc.zza(this.zzb, zzabcVar, (int) Math.min(i11 - i10, j11), true);
            if (zza == -1) {
                j11 = 0;
            } else {
                this.zzg += zza;
                j11 -= zza;
            }
        }
        int i12 = this.zzc.zzd;
        int i13 = this.zzg / i12;
        if (i13 > 0) {
            long zzq = this.zzf + zzfk.zzq(this.zzh, 1000000L, r1.zzc);
            int i14 = i13 * i12;
            int i15 = this.zzg - i14;
            this.zzb.zzs(zzq, 1, i14, i15, null);
            this.zzh += i13;
            this.zzg = i15;
        }
        if (j11 <= 0) {
            return true;
        }
        return false;
    }
}
