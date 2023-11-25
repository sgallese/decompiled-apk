package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzvc {
    private final zzfb zza = new zzfb(32);
    private zzvb zzb;
    private zzvb zzc;
    private zzvb zzd;
    private long zze;
    private final zzxu zzf;

    public zzvc(zzxu zzxuVar) {
        this.zzf = zzxuVar;
        zzvb zzvbVar = new zzvb(0L, 65536);
        this.zzb = zzvbVar;
        this.zzc = zzvbVar;
        this.zzd = zzvbVar;
    }

    private final int zzi(int i10) {
        zzvb zzvbVar = this.zzd;
        if (zzvbVar.zzc == null) {
            zzxn zzb = this.zzf.zzb();
            zzvb zzvbVar2 = new zzvb(this.zzd.zzb, 65536);
            zzvbVar.zzc = zzb;
            zzvbVar.zzd = zzvbVar2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvb zzj(zzvb zzvbVar, long j10) {
        while (j10 >= zzvbVar.zzb) {
            zzvbVar = zzvbVar.zzd;
        }
        return zzvbVar;
    }

    private static zzvb zzk(zzvb zzvbVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzvb zzj = zzj(zzvbVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j10));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvb zzl(zzvb zzvbVar, long j10, byte[] bArr, int i10) {
        zzvb zzj = zzj(zzvbVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (zzj.zzb - j10));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvb zzm(zzvb zzvbVar, zzht zzhtVar, zzve zzveVar, zzfb zzfbVar) {
        zzvb zzvbVar2;
        boolean z10;
        int i10;
        if (zzhtVar.zzl()) {
            long j10 = zzveVar.zzb;
            zzfbVar.zzD(1);
            zzvb zzl = zzl(zzvbVar, j10, zzfbVar.zzI(), 1);
            long j11 = j10 + 1;
            byte b10 = zzfbVar.zzI()[0];
            int i11 = b10 & 128;
            int i12 = b10 & Byte.MAX_VALUE;
            zzhq zzhqVar = zzhtVar.zza;
            byte[] bArr = zzhqVar.zza;
            if (bArr == null) {
                zzhqVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzvbVar2 = zzl(zzl, j11, zzhqVar.zza, i12);
            long j12 = j11 + i12;
            if (z10) {
                zzfbVar.zzD(2);
                zzvbVar2 = zzl(zzvbVar2, j12, zzfbVar.zzI(), 2);
                j12 += 2;
                i10 = zzfbVar.zzp();
            } else {
                i10 = 1;
            }
            int[] iArr = zzhqVar.zzd;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhqVar.zze;
            if (iArr3 == null || iArr3.length < i10) {
                iArr3 = new int[i10];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i13 = i10 * 6;
                zzfbVar.zzD(i13);
                zzvbVar2 = zzl(zzvbVar2, j12, zzfbVar.zzI(), i13);
                j12 += i13;
                zzfbVar.zzG(0);
                for (int i14 = 0; i14 < i10; i14++) {
                    iArr2[i14] = zzfbVar.zzp();
                    iArr4[i14] = zzfbVar.zzo();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzveVar.zza - ((int) (j12 - zzveVar.zzb));
            }
            zzacd zzacdVar = zzveVar.zzc;
            int i15 = zzfk.zza;
            zzhqVar.zzc(i10, iArr2, iArr4, zzacdVar.zzb, zzhqVar.zza, zzacdVar.zza, zzacdVar.zzc, zzacdVar.zzd);
            long j13 = zzveVar.zzb;
            int i16 = (int) (j12 - j13);
            zzveVar.zzb = j13 + i16;
            zzveVar.zza -= i16;
        } else {
            zzvbVar2 = zzvbVar;
        }
        if (zzhtVar.zze()) {
            zzfbVar.zzD(4);
            zzvb zzl2 = zzl(zzvbVar2, zzveVar.zzb, zzfbVar.zzI(), 4);
            int zzo = zzfbVar.zzo();
            zzveVar.zzb += 4;
            zzveVar.zza -= 4;
            zzhtVar.zzj(zzo);
            zzvb zzk = zzk(zzl2, zzveVar.zzb, zzhtVar.zzb, zzo);
            zzveVar.zzb += zzo;
            int i17 = zzveVar.zza - zzo;
            zzveVar.zza = i17;
            ByteBuffer byteBuffer = zzhtVar.zze;
            if (byteBuffer != null && byteBuffer.capacity() >= i17) {
                zzhtVar.zze.clear();
            } else {
                zzhtVar.zze = ByteBuffer.allocate(i17);
            }
            return zzk(zzk, zzveVar.zzb, zzhtVar.zze, zzveVar.zza);
        }
        zzhtVar.zzj(zzveVar.zza);
        return zzk(zzvbVar2, zzveVar.zzb, zzhtVar.zzb, zzveVar.zza);
    }

    private final void zzn(int i10) {
        long j10 = this.zze + i10;
        this.zze = j10;
        zzvb zzvbVar = this.zzd;
        if (j10 == zzvbVar.zzb) {
            this.zzd = zzvbVar.zzd;
        }
    }

    public final int zza(zzt zztVar, int i10, boolean z10) throws IOException {
        int zzi = zzi(i10);
        zzvb zzvbVar = this.zzd;
        int zza = zztVar.zza(zzvbVar.zzc.zza, zzvbVar.zza(this.zze), zzi);
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        zzn(zza);
        return zza;
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j10) {
        zzvb zzvbVar;
        if (j10 != -1) {
            while (true) {
                zzvbVar = this.zzb;
                if (j10 < zzvbVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvbVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvbVar.zza) {
                this.zzc = zzvbVar;
            }
        }
    }

    public final void zzd(zzht zzhtVar, zzve zzveVar) {
        zzm(this.zzc, zzhtVar, zzveVar, this.zza);
    }

    public final void zze(zzht zzhtVar, zzve zzveVar) {
        this.zzc = zzm(this.zzc, zzhtVar, zzveVar, this.zza);
    }

    public final void zzf() {
        zzvb zzvbVar = this.zzb;
        if (zzvbVar.zzc != null) {
            this.zzf.zzd(zzvbVar);
            zzvbVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvb zzvbVar2 = this.zzb;
        this.zzc = zzvbVar2;
        this.zzd = zzvbVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzfb zzfbVar, int i10) {
        while (i10 > 0) {
            int zzi = zzi(i10);
            zzvb zzvbVar = this.zzd;
            zzfbVar.zzC(zzvbVar.zzc.zza, zzvbVar.zza(this.zze), zzi);
            i10 -= zzi;
            zzn(zzi);
        }
    }
}
