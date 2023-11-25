package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzabo {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzabn zzk;
    private final zzbz zzl;

    private zzabo(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, zzabn zzabnVar, zzbz zzbzVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = zzi(i14);
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = zzh(i16);
        this.zzj = j10;
        this.zzk = zzabnVar;
        this.zzl = zzbzVar;
    }

    private static int zzh(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        if (i10 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j10 = this.zzj;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.zze;
    }

    public final long zzb(long j10) {
        return Math.max(0L, Math.min((j10 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzam zzc(byte[] bArr, zzbz zzbzVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.zzd;
        if (i10 <= 0) {
            i10 = -1;
        }
        zzbz zzd = zzd(zzbzVar);
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/flac");
        zzakVar.zzL(i10);
        zzakVar.zzw(this.zzg);
        zzakVar.zzT(this.zze);
        zzakVar.zzI(Collections.singletonList(bArr));
        zzakVar.zzM(zzd);
        return zzakVar.zzY();
    }

    public final zzbz zzd(zzbz zzbzVar) {
        zzbz zzbzVar2 = this.zzl;
        if (zzbzVar2 == null) {
            return zzbzVar;
        }
        return zzbzVar2.zzd(zzbzVar);
    }

    public final zzabo zze(List list) {
        return new zzabo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbz(list)));
    }

    public final zzabo zzf(zzabn zzabnVar) {
        return new zzabo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzabnVar, this.zzl);
    }

    public final zzabo zzg(List list) {
        return new zzabo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzack.zzb(list)));
    }

    public zzabo(byte[] bArr, int i10) {
        zzfa zzfaVar = new zzfa(bArr, bArr.length);
        zzfaVar.zzj(i10 * 8);
        this.zza = zzfaVar.zzd(16);
        this.zzb = zzfaVar.zzd(16);
        this.zzc = zzfaVar.zzd(24);
        this.zzd = zzfaVar.zzd(24);
        int zzd = zzfaVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzfaVar.zzd(3) + 1;
        int zzd2 = zzfaVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        int zzd3 = zzfaVar.zzd(4);
        int zzd4 = zzfaVar.zzd(32);
        int i11 = zzfk.zza;
        this.zzj = ((zzd3 & 4294967295L) << 32) | (zzd4 & 4294967295L);
        this.zzk = null;
        this.zzl = null;
    }
}
